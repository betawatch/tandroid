package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.StoriesUtilities;

/* loaded from: classes4.dex */
public class ManageChatUserCell extends FrameLayout {
    private final AvatarDrawable avatarDrawable;
    private final BackupImageView avatarImageView;
    private final int currentAccount;
    private CharSequence currentName;
    private Object currentObject;
    private CharSequence currentStatus;
    private ImageView customImageView;
    private ManageChatUserCellDelegate delegate;
    private int dividerColor;
    private boolean isAdmin;
    private TLRPC.FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private final int namePadding;
    private final SimpleTextView nameTextView;
    private boolean needDivider;
    private ImageView optionsButton;
    private final Theme.ResourcesProvider resourcesProvider;
    private int statusColor;
    private int statusOnlineColor;
    private final SimpleTextView statusTextView;
    private final StoriesUtilities.AvatarStoryParams storyAvatarParams;
    private TL_stories.StoryItem storyItem;
    private boolean subtitleUsername;

    public interface ManageChatUserCellDelegate {
        boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public ManageChatUserCell(Context context, int i, int i2, boolean z) {
        this(context, i, i2, z, null);
    }

    public ManageChatUserCell(Context context, int i, int i2, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerColor = -1;
        this.currentAccount = UserConfig.selectedAccount;
        this.storyAvatarParams = new StoriesUtilities.AvatarStoryParams(false);
        this.resourcesProvider = resourcesProvider;
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        this.namePadding = i2;
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context) { // from class: org.telegram.ui.Cells.ManageChatUserCell.1
            @Override // org.telegram.ui.Components.BackupImageView, android.view.View
            protected void onDraw(Canvas canvas) {
                if (ManageChatUserCell.this.storyItem != null) {
                    float dp = AndroidUtilities.dp(1.0f);
                    ManageChatUserCell.this.storyAvatarParams.originalAvatarRect.set(dp, dp, getMeasuredWidth() - r0, getMeasuredHeight() - r0);
                    ManageChatUserCell.this.storyAvatarParams.drawSegments = false;
                    ManageChatUserCell.this.storyAvatarParams.animate = false;
                    ManageChatUserCell.this.storyAvatarParams.drawInside = true;
                    ManageChatUserCell.this.storyAvatarParams.isArchive = false;
                    ManageChatUserCell.this.storyAvatarParams.resourcesProvider = resourcesProvider;
                    ManageChatUserCell.this.storyAvatarParams.storyItem = ManageChatUserCell.this.storyItem;
                    StoriesUtilities.drawAvatarWithStory(ManageChatUserCell.this.storyItem.dialogId, canvas, this.imageReceiver, ManageChatUserCell.this.storyAvatarParams);
                    return;
                }
                super.onDraw(canvas);
            }
        };
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z2 = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 7, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTextSize(17);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 46.0f : i2 + 68, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(simpleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(14);
        simpleTextView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z4 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 28.0f : i2 + 68, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setFocusable(false);
            this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider)));
            this.optionsButton.setImageResource(R.drawable.ic_ab_other);
            this.optionsButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_stickers_menu, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.optionsButton.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.optionsButton, LayoutHelper.createFrame(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            this.optionsButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Cells.ManageChatUserCell$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r0.delegate.onOptionsButtonCheck(ManageChatUserCell.this, true);
                }
            });
            this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem, View.OnClickListener onClickListener) {
        this.storyItem = storyItem;
        this.avatarImageView.setOnClickListener(onClickListener);
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.storyItem;
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public StoriesUtilities.AvatarStoryParams getStoryAvatarParams() {
        return this.storyAvatarParams;
    }

    public void setCustomRightImage(int i) {
        ImageView imageView = new ImageView(getContext());
        this.customImageView = imageView;
        imageView.setImageResource(i);
        this.customImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.customImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_voipgroup_mutedIconUnscrolled, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        addView(this.customImageView, LayoutHelper.createFrame(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public void setCustomImageVisible(boolean z) {
        ImageView imageView = this.customImageView;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public void setData(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        float f;
        float f2;
        if (obj == null) {
            this.currentStatus = null;
            this.currentName = null;
            this.currentObject = null;
            this.nameTextView.setText("");
            this.statusTextView.setText("");
            this.avatarImageView.setImageDrawable(null);
            return;
        }
        this.currentStatus = charSequence2;
        this.currentName = charSequence;
        this.currentObject = obj;
        if (this.optionsButton != null) {
            boolean onOptionsButtonCheck = this.delegate.onOptionsButtonCheck(this, false);
            this.optionsButton.setVisibility(onOptionsButtonCheck ? 0 : 4);
            SimpleTextView simpleTextView = this.nameTextView;
            boolean z2 = LocaleController.isRTL;
            simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? onOptionsButtonCheck ? 46 : 28 : this.namePadding + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? this.namePadding + 68 : onOptionsButtonCheck ? 46 : 28, 0.0f));
            SimpleTextView simpleTextView2 = this.statusTextView;
            boolean z3 = LocaleController.isRTL;
            int i = (z3 ? 5 : 3) | 48;
            float f3 = z3 ? onOptionsButtonCheck ? 46 : 28 : this.namePadding + 68;
            if (z3) {
                f2 = this.namePadding + 68;
            } else {
                f2 = onOptionsButtonCheck ? 46 : 28;
            }
            simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i, f3, 34.5f, f2, 0.0f));
        } else {
            ImageView imageView = this.customImageView;
            if (imageView != null) {
                boolean z4 = imageView.getVisibility() == 0;
                SimpleTextView simpleTextView3 = this.nameTextView;
                boolean z5 = LocaleController.isRTL;
                simpleTextView3.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? z4 ? 54 : 28 : this.namePadding + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? this.namePadding + 68 : z4 ? 54 : 28, 0.0f));
                SimpleTextView simpleTextView4 = this.statusTextView;
                boolean z6 = LocaleController.isRTL;
                int i2 = (z6 ? 5 : 3) | 48;
                float f4 = z6 ? z4 ? 54 : 28 : this.namePadding + 68;
                if (z6) {
                    f = this.namePadding + 68;
                } else {
                    f = z4 ? 54 : 28;
                }
                simpleTextView4.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i2, f4, 34.5f, f, 0.0f));
            }
        }
        this.needDivider = z;
        setWillNotDraw(!z);
        update(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), TLObject.FLAG_30));
    }

    public long getUserId() {
        Object obj = this.currentObject;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).id;
        }
        return 0L;
    }

    public void setStatusColors(int i, int i2) {
        this.statusColor = i;
        this.statusOnlineColor = i2;
    }

    public void setIsAdmin(boolean z) {
        this.isAdmin = z;
    }

    public void setUsernameSubtitle() {
        this.subtitleUsername = true;
    }

    public void setNameColor(int i) {
        this.nameTextView.setTextColor(i);
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c6, code lost:
    
        if (r12.equals(r6) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r12.equals(r11.lastName) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(int i) {
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        Object obj = this.currentObject;
        if (obj == null) {
            return;
        }
        boolean z = true;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                boolean z2 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation2 = this.lastAvatar) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
                if (!z2 && (MessagesController.UPDATE_MASK_STATUS & i) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.lastStatus) {
                        z2 = true;
                    }
                }
                if (z2 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str2 = null;
                } else {
                    str2 = UserObject.getUserName(user);
                }
                z = z2;
                if (!z) {
                    return;
                }
            } else {
                str2 = null;
            }
            this.avatarDrawable.setInfo(this.currentAccount, user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.lastStatus = userStatus3.expires;
            } else {
                this.lastStatus = 0;
            }
            CharSequence charSequence = this.currentName;
            if (charSequence != null) {
                this.lastName = null;
                this.nameTextView.setText(charSequence);
            } else {
                if (str2 == null) {
                    str2 = UserObject.getUserName(user);
                }
                this.lastName = str2;
                SimpleTextView simpleTextView = this.nameTextView;
                simpleTextView.setText(Emoji.replaceEmoji(str2, simpleTextView.getPaint().getFontMetricsInt(), false));
            }
            if (this.currentStatus != null) {
                this.statusTextView.setTextColor(this.statusColor);
                this.statusTextView.setText(this.currentStatus);
            } else {
                String publicUsername = DialogObject.getPublicUsername(user);
                if (user.bot) {
                    this.statusTextView.setTextColor(this.statusColor);
                    if (this.subtitleUsername && !TextUtils.isEmpty(publicUsername)) {
                        this.statusTextView.setText(publicUsername);
                    } else if (user.bot_chat_history || this.isAdmin) {
                        this.statusTextView.setText(LocaleController.getString(R.string.BotStatusRead));
                    } else {
                        this.statusTextView.setText(LocaleController.getString(R.string.BotStatusCantRead));
                    }
                } else if (this.subtitleUsername && !TextUtils.isEmpty(publicUsername)) {
                    this.statusTextView.setText(publicUsername);
                    this.statusTextView.setTextColor(this.statusColor);
                } else if (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                    this.statusTextView.setTextColor(this.statusOnlineColor);
                    this.statusTextView.setText(LocaleController.getString(R.string.Online));
                } else {
                    this.statusTextView.setTextColor(this.statusColor);
                    this.statusTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
                }
            }
            this.lastAvatar = fileLocation3;
            this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
            return;
        }
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i != 0) {
                boolean z3 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation = this.lastAvatar) != null && fileLocation4 == null) || ((fileLocation == null && fileLocation4 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation4.volume_id && fileLocation.local_id == fileLocation4.local_id))));
                if (z3 || this.currentName != null || (r6 = this.lastName) == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str = null;
                } else {
                    str = chat.title;
                }
                z = z3;
                if (!z) {
                    return;
                }
            } else {
                str = null;
            }
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            CharSequence charSequence2 = this.currentName;
            if (charSequence2 != null) {
                this.lastName = null;
                this.nameTextView.setText(charSequence2);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.lastName = str;
                this.nameTextView.setText(str);
            }
            if (this.currentStatus != null) {
                this.statusTextView.setTextColor(this.statusColor);
                this.statusTextView.setText(this.currentStatus);
            } else {
                this.statusTextView.setTextColor(this.statusColor);
                if (chat.participants_count != 0) {
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        this.statusTextView.setText(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]));
                    } else {
                        this.statusTextView.setText(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                    }
                } else if (chat.has_geo) {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaLocation));
                } else if (!ChatObject.isPublic(chat)) {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaPrivate));
                } else {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaPublic));
                }
            }
            this.lastAvatar = fileLocation4;
            this.avatarImageView.setForUserOrChat(chat, this.avatarDrawable);
            return;
        }
        if (obj instanceof Integer) {
            this.nameTextView.setText(this.currentName);
            this.statusTextView.setTextColor(this.statusColor);
            this.statusTextView.setText(this.currentStatus);
            this.avatarDrawable.setAvatarType(3);
            this.avatarImageView.setImage(null, "50_50", this.avatarDrawable);
        }
    }

    public void recycle() {
        this.avatarImageView.getImageReceiver().cancelLoadImage();
    }

    public void setDelegate(ManageChatUserCellDelegate manageChatUserCellDelegate) {
        this.delegate = manageChatUserCellDelegate;
    }

    public Object getCurrentObject() {
        return this.currentObject;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            int i = this.dividerColor;
            if (i >= 0) {
                Theme.dividerExtraPaint.setColor(Theme.getColor(i, this.resourcesProvider));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.dividerColor >= 0 ? Theme.dividerExtraPaint : Theme.dividerPaint);
        }
    }
}
