package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.LayoutHelper;
/* loaded from: classes3.dex */
public class HintDialogCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private int backgroundColorKey;
    CheckBox2 checkBox;
    CounterView counterView;
    private int currentAccount;
    private TLRPC$User currentUser;
    private long dialogId;
    private final boolean drawCheckbox;
    private BackupImageView imageView;
    private int lastUnreadCount;
    private TextView nameTextView;
    float showOnlineProgress;
    boolean wasDraw;

    public HintDialogCell(Context context, boolean z) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        new RectF();
        this.currentAccount = UserConfig.selectedAccount;
        this.backgroundColorKey = Theme.key_windowBackgroundWhite;
        this.drawCheckbox = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(this.imageView, LayoutHelper.createFrame(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(this, context) { // from class: org.telegram.ui.Cells.HintDialogCell.1
            @Override // android.widget.TextView
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(10.0f), false), bufferType);
            }
        };
        this.nameTextView = textView;
        NotificationCenter.listenEmojiLoading(textView);
        this.nameTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(1);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        CounterView counterView = new CounterView(context, null);
        this.counterView = counterView;
        addView(counterView, LayoutHelper.createFrame(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        this.counterView.setColors(Theme.key_chats_unreadCounterText, Theme.key_chats_unreadCounter);
        this.counterView.setGravity(5);
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(4);
            this.checkBox.setProgressDelegate(new CheckBoxBase.ProgressDelegate() { // from class: org.telegram.ui.Cells.HintDialogCell$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.CheckBoxBase.ProgressDelegate
                public final void setProgress(float f) {
                    HintDialogCell.this.lambda$new$0(f);
                }
            });
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            this.checkBox.setChecked(false, false);
            setWillNotDraw(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.counterView.counterDrawable.horizontalPadding = AndroidUtilities.dp(13.0f);
    }

    public void update(int i) {
        int i2;
        if ((MessagesController.UPDATE_MASK_STATUS & i) != 0 && this.currentUser != null) {
            this.currentUser = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentUser.id));
            this.imageView.invalidate();
            invalidate();
        }
        if (i != 0 && (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i) == 0 && (i & MessagesController.UPDATE_MASK_NEW_MESSAGE) == 0) {
            return;
        }
        TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialogId);
        if (tLRPC$Dialog != null && (i2 = tLRPC$Dialog.unread_count) != 0) {
            if (this.lastUnreadCount != i2) {
                this.lastUnreadCount = i2;
                this.counterView.setCount(i2, this.wasDraw);
                return;
            }
            return;
        }
        this.lastUnreadCount = 0;
        this.counterView.setCount(0, this.wasDraw);
    }

    public void update() {
        if (DialogObject.isUserDialog(this.dialogId)) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            this.currentUser = user;
            this.avatarDrawable.setInfo(user);
            return;
        }
        this.avatarDrawable.setInfo(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
        this.currentUser = null;
    }

    public void setColors(int i, int i2) {
        this.nameTextView.setTextColor(Theme.getColor(i));
        this.backgroundColorKey = i2;
        this.checkBox.setColor(Theme.key_dialogRoundCheckBox, i2, Theme.key_dialogRoundCheckBoxCheck);
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        if (this.dialogId != j) {
            this.wasDraw = false;
            invalidate();
        }
        this.dialogId = j;
        if (DialogObject.isUserDialog(j)) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            this.currentUser = user;
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (user != null) {
                this.nameTextView.setText(UserObject.getFirstName(user));
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(this.currentUser);
            this.imageView.setForUserOrChat(this.currentUser, this.avatarDrawable);
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat != null) {
                this.nameTextView.setText(chat.title);
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(chat);
            this.currentUser = null;
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
        }
        if (z) {
            update(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC$UserStatus tLRPC$UserStatus;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView) {
            TLRPC$User tLRPC$User = this.currentUser;
            boolean z = (tLRPC$User == null || tLRPC$User.bot || (((tLRPC$UserStatus = tLRPC$User.status) == null || tLRPC$UserStatus.expires <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) && !MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.currentUser.id)))) ? false : true;
            if (!this.wasDraw) {
                this.showOnlineProgress = z ? 1.0f : 0.0f;
            }
            if (z) {
                float f = this.showOnlineProgress;
                if (f != 1.0f) {
                    float f2 = f + 0.10666667f;
                    this.showOnlineProgress = f2;
                    if (f2 > 1.0f) {
                        this.showOnlineProgress = 1.0f;
                    }
                    invalidate();
                    if (this.showOnlineProgress != 0.0f) {
                        int dp = AndroidUtilities.dp(53.0f);
                        int dp2 = AndroidUtilities.dp(59.0f);
                        canvas.save();
                        float f3 = this.showOnlineProgress;
                        float f4 = dp2;
                        float f5 = dp;
                        canvas.scale(f3, f3, f4, f5);
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(this.backgroundColorKey));
                        canvas.drawCircle(f4, f5, AndroidUtilities.dp(7.0f), Theme.dialogs_onlineCirclePaint);
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle));
                        canvas.drawCircle(f4, f5, AndroidUtilities.dp(5.0f), Theme.dialogs_onlineCirclePaint);
                        canvas.restore();
                    }
                    this.wasDraw = true;
                }
            }
            if (!z) {
                float f6 = this.showOnlineProgress;
                if (f6 != 0.0f) {
                    float f7 = f6 - 0.10666667f;
                    this.showOnlineProgress = f7;
                    if (f7 < 0.0f) {
                        this.showOnlineProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            if (this.showOnlineProgress != 0.0f) {
            }
            this.wasDraw = true;
        }
        return drawChild;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.drawCheckbox) {
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox));
            Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
            canvas.drawCircle(left, top, AndroidUtilities.dp(28.0f), Theme.checkboxSquare_checkPaint);
        }
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.drawCheckbox) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public long getDialogId() {
        return this.dialogId;
    }
}
