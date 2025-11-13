package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Stars.StarsIntroActivity;

/* loaded from: classes4.dex */
public class ShareDialogCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final AvatarDrawable avatarDrawable;
    private final CheckBox2 checkBox;
    private final int currentAccount;
    private long currentDialog;
    private final int currentType;
    private final BackupImageView imageView;
    private long lastUpdateTime;
    private Drawable lockDrawable;
    private final TextView nameTextView;
    private float onlineProgress;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private final Paint priceBackgroundPaint;
    private Text priceText;
    private long priceTextValue;
    private RepostStoryDrawable repostStoryDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private final SimpleTextView topicTextView;
    private boolean topicWasVisible;
    private TLRPC.User user;

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public ShareDialogCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.priceBackgroundPaint = new Paint();
        this.resourcesProvider = resourcesProvider;
        this.avatarDrawable = new AvatarDrawable(resourcesProvider) { // from class: org.telegram.ui.Cells.ShareDialogCell.1
            @Override // android.graphics.drawable.Drawable
            public void invalidateSelf() {
                super.invalidateSelf();
                ShareDialogCell.this.imageView.invalidate();
            }
        };
        setWillNotDraw(false);
        this.currentType = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i == 2) {
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(backupImageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        TextView textView = new TextView(context) { // from class: org.telegram.ui.Cells.ShareDialogCell.2
            @Override // android.widget.TextView
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        this.nameTextView = textView;
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(getThemedColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack));
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.topicTextView = simpleTextView;
        simpleTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        simpleTextView.setTextSize(12);
        simpleTextView.setMaxLines(2);
        simpleTextView.setGravity(49);
        simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(4);
        checkBox2.setProgressDelegate(new CheckBoxBase.ProgressDelegate() { // from class: org.telegram.ui.Cells.ShareDialogCell$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.CheckBoxBase.ProgressDelegate
            public final void setProgress(float f) {
                ShareDialogCell.this.lambda$new$0(f);
            }
        });
        addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact isUserContactBlocked = this.user != null ? MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.user.id) : null;
            long sendPaidMessagesStars = this.currentDialog < 0 ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.currentDialog) : DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            if (this.premiumBlocked == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.starsPriceBlocked == sendPaidMessagesStars) {
                return;
            }
            boolean isPremiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.premiumBlocked = isPremiumBlocked;
            this.starsPriceBlocked = sendPaidMessagesStars;
            this.nameTextView.setTextColor(getThemedColor(isPremiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack));
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentType == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }

    protected String repostToCustomName() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        this.avatarDrawable.setScaleSize(1.0f);
        if (j == Long.MAX_VALUE) {
            this.nameTextView.setText(repostToCustomName());
            if (this.repostStoryDrawable == null) {
                this.repostStoryDrawable = new RepostStoryDrawable(getContext(), (View) this.imageView, true, this.resourcesProvider);
            }
            this.imageView.setImage((ImageLocation) null, (String) null, this.repostStoryDrawable, (Object) null);
        } else if (DialogObject.isUserDialog(j)) {
            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j);
            this.premiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            this.nameTextView.setTextColor(getThemedColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack));
            this.premiumBlockedT.force(this.premiumBlocked);
            this.starsBlockedT.force(this.starsPriceBlocked > 0);
            invalidate();
            this.avatarDrawable.setInfo(this.currentAccount, this.user);
            if (this.currentType != 2 && UserObject.isReplyUser(this.user)) {
                this.nameTextView.setText(LocaleController.getString(R.string.RepliesTitle));
                this.avatarDrawable.setAvatarType(12);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            } else if (this.currentType != 2 && UserObject.isUserSelf(this.user)) {
                this.nameTextView.setText(LocaleController.getString(R.string.SavedMessages));
                this.avatarDrawable.setAvatarType(1);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            } else {
                if (charSequence != null) {
                    this.nameTextView.setText(charSequence);
                } else {
                    TLRPC.User user = this.user;
                    if (user != null) {
                        this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        this.nameTextView.setText("");
                    }
                }
                this.imageView.setForUserOrChat(this.user, this.avatarDrawable);
            }
            this.imageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        } else {
            this.user = null;
            this.premiumBlocked = false;
            this.premiumBlockedT.force(0.0f);
            this.starsPriceBlocked = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j);
            this.starsBlockedT.force(false);
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat != null) {
                if (chat.monoforum) {
                    this.nameTextView.setText(ForumUtilities.getMonoForumTitle(this.currentAccount, chat));
                } else {
                    this.nameTextView.setText(chat.title);
                }
            } else {
                this.nameTextView.setText("");
            }
            if (ChatObject.isMonoForum(chat)) {
                ForumUtilities.setMonoForumAvatar(this.currentAccount, chat, this.avatarDrawable, this.imageView);
            } else {
                this.avatarDrawable.setInfo(this.currentAccount, chat);
                this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            }
            this.imageView.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
        }
        this.currentDialog = j;
        this.checkBox.setChecked(z, false);
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
        if (z) {
            return;
        }
        setTopic(null, true);
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setTopic(tL_forumTopic, false, z);
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
        boolean z3 = this.topicWasVisible;
        boolean z4 = tL_forumTopic != null;
        if (z3 == z4 && z2) {
            return;
        }
        SimpleTextView simpleTextView = this.topicTextView;
        int i = R.id.spring_tag;
        SpringAnimation springAnimation = (SpringAnimation) simpleTextView.getTag(i);
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        if (z4) {
            if (z) {
                this.topicTextView.setText(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)));
            } else {
                SimpleTextView simpleTextView2 = this.topicTextView;
                simpleTextView2.setText(ForumUtilities.getTopicSpannedName(tL_forumTopic, simpleTextView2.getTextPaint(), false));
            }
            this.topicTextView.requestLayout();
        }
        if (z2) {
            SpringAnimation springAnimation2 = (SpringAnimation) ((SpringAnimation) new SpringAnimation(new FloatValueHolder(z4 ? 0.0f : 1000.0f)).setSpring(new SpringForce(z4 ? 1000.0f : 0.0f).setStiffness(1500.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Cells.ShareDialogCell$$ExternalSyntheticLambda1
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    ShareDialogCell.this.lambda$setTopic$1(dynamicAnimation, f, f2);
                }
            })).addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Cells.ShareDialogCell$$ExternalSyntheticLambda2
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z5, float f, float f2) {
                    ShareDialogCell.this.lambda$setTopic$2(dynamicAnimation, z5, f, f2);
                }
            });
            this.topicTextView.setTag(i, springAnimation2);
            springAnimation2.start();
        } else if (z4) {
            this.topicTextView.setAlpha(1.0f);
            this.nameTextView.setAlpha(0.0f);
            this.topicTextView.setTranslationX(0.0f);
            this.nameTextView.setTranslationX(AndroidUtilities.dp(10.0f));
        } else {
            this.topicTextView.setAlpha(0.0f);
            this.nameTextView.setAlpha(1.0f);
            this.topicTextView.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.nameTextView.setTranslationX(0.0f);
        }
        this.topicWasVisible = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTopic$1(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.topicTextView.setAlpha(f3);
        float f4 = 1.0f - f3;
        this.nameTextView.setAlpha(f4);
        this.topicTextView.setTranslationX(f4 * (-AndroidUtilities.dp(10.0f)));
        this.nameTextView.setTranslationX(f3 * AndroidUtilities.dp(10.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTopic$2(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicTextView.setTag(R.id.spring_tag, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r6 > 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC.User user;
        float f;
        float f2;
        boolean z;
        TLRPC.UserStatus userStatus;
        Text text;
        Canvas canvas2 = canvas;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView && this.currentType != 2 && (user = this.user) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.lastUpdateTime;
            long j3 = j2 > 17 ? 17L : j2;
            this.lastUpdateTime = elapsedRealtime;
            float f3 = this.starsBlockedT.set(this.starsPriceBlocked > 0);
            if (f3 > 0.0f) {
                float left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(18.0f);
                float top = (this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(20.83f);
                if (this.priceText != null) {
                    long j4 = this.priceTextValue;
                    long j5 = this.starsPriceBlocked;
                    if (j4 != j5) {
                    }
                    Text text2 = this.priceText;
                    float currentWidth = (text2 != null ? 0.0f : text2.getCurrentWidth()) + AndroidUtilities.dp(10.0f);
                    float dp = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f4 = currentWidth / 2.0f;
                    float f5 = left - f4;
                    float f6 = dp / 2.0f;
                    rectF.set(f5, top - f6, left + f4, top + f6);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    this.priceBackgroundPaint.setColor(getThemedColor(Theme.key_dialogBackground));
                    canvas2 = canvas;
                    canvas2.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.priceBackgroundPaint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    this.priceBackgroundPaint.setColor(getThemedColor(Theme.key_dialogRoundCheckBox));
                    canvas2.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.priceBackgroundPaint);
                    text = this.priceText;
                    if (text != null) {
                        f = 0.0f;
                        text.draw(canvas, f5 + AndroidUtilities.dp(5.0f), top, -1, 1.0f);
                        f2 = this.premiumBlockedT.set(this.premiumBlocked);
                        if (f2 > f) {
                            int bottom = this.imageView.getBottom() - AndroidUtilities.dp(9.0f);
                            int right = this.imageView.getRight() - AndroidUtilities.dp(9.33f);
                            canvas.save();
                            Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            float f7 = right;
                            float f8 = bottom;
                            canvas2.drawCircle(f7, f8, AndroidUtilities.dp(12.0f) * f2, Theme.dialogs_onlineCirclePaint);
                            if (this.premiumGradient == null) {
                                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
                            }
                            this.premiumGradient.gradientMatrix(right - AndroidUtilities.dp(10.0f), bottom - AndroidUtilities.dp(10.0f), right + AndroidUtilities.dp(10.0f), bottom + AndroidUtilities.dp(10.0f), 0.0f, 0.0f);
                            canvas2.drawCircle(f7, f8, AndroidUtilities.dp(10.0f) * f2, this.premiumGradient.paint);
                            if (this.lockDrawable == null) {
                                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                this.lockDrawable = mutate;
                                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            }
                            this.lockDrawable.setBounds((int) (f7 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * f2)), (int) (f8 - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f2)), (int) (f7 + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f2)), (int) (f8 + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f2)));
                            this.lockDrawable.setAlpha((int) (255.0f * f2));
                            this.lockDrawable.draw(canvas2);
                            canvas.restore();
                        }
                        if (!this.premiumBlocked) {
                            TLRPC.User user2 = this.user;
                            if (!user2.self && !user2.bot && (((userStatus = user2.status) != null && userStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.user.id)))) {
                                z = true;
                                if (!z || this.onlineProgress != f) {
                                    int bottom2 = this.imageView.getBottom() - AndroidUtilities.dp(6.0f);
                                    int right2 = this.imageView.getRight() - AndroidUtilities.dp(10.0f);
                                    Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                    float f9 = right2;
                                    float f10 = bottom2;
                                    float f11 = 1.0f - f2;
                                    float f12 = 1.0f - f3;
                                    canvas2.drawCircle(f9, f10, AndroidUtilities.dp(7.0f) * this.onlineProgress * f11 * f12, Theme.dialogs_onlineCirclePaint);
                                    Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_chats_onlineCircle));
                                    canvas2.drawCircle(f9, f10, AndroidUtilities.dp(5.0f) * this.onlineProgress * f11 * f12, Theme.dialogs_onlineCirclePaint);
                                    if (z) {
                                        float f13 = this.onlineProgress;
                                        if (f13 < 1.0f) {
                                            float f14 = f13 + (j3 / 150.0f);
                                            this.onlineProgress = f14;
                                            if (f14 > 1.0f) {
                                                this.onlineProgress = 1.0f;
                                            }
                                            this.imageView.invalidate();
                                            invalidate();
                                        }
                                    } else {
                                        float f15 = this.onlineProgress;
                                        if (f15 > f) {
                                            float f16 = f15 - (j3 / 150.0f);
                                            this.onlineProgress = f16;
                                            if (f16 < f) {
                                                this.onlineProgress = f;
                                            }
                                            this.imageView.invalidate();
                                            invalidate();
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                        int bottom22 = this.imageView.getBottom() - AndroidUtilities.dp(6.0f);
                        int right22 = this.imageView.getRight() - AndroidUtilities.dp(10.0f);
                        Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        float f92 = right22;
                        float f102 = bottom22;
                        float f112 = 1.0f - f2;
                        float f122 = 1.0f - f3;
                        canvas2.drawCircle(f92, f102, AndroidUtilities.dp(7.0f) * this.onlineProgress * f112 * f122, Theme.dialogs_onlineCirclePaint);
                        Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_chats_onlineCircle));
                        canvas2.drawCircle(f92, f102, AndroidUtilities.dp(5.0f) * this.onlineProgress * f112 * f122, Theme.dialogs_onlineCirclePaint);
                        if (z) {
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("⭐️");
                long j6 = this.starsPriceBlocked;
                this.priceTextValue = j6;
                sb.append(AndroidUtilities.formatWholeNumber((int) j6, 0));
                this.priceText = new Text(StarsIntroActivity.replaceStars(sb.toString(), 0.65f), 9.33f, AndroidUtilities.bold());
                Text text22 = this.priceText;
                float currentWidth2 = (text22 != null ? 0.0f : text22.getCurrentWidth()) + AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f42 = currentWidth2 / 2.0f;
                float f52 = left - f42;
                float f62 = dp2 / 2.0f;
                rectF2.set(f52, top - f62, left + f42, top + f62);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                this.priceBackgroundPaint.setColor(getThemedColor(Theme.key_dialogBackground));
                canvas2 = canvas;
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.priceBackgroundPaint);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                this.priceBackgroundPaint.setColor(getThemedColor(Theme.key_dialogRoundCheckBox));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.priceBackgroundPaint);
                text = this.priceText;
                if (text != null) {
                }
            }
            f = 0.0f;
            f2 = this.premiumBlockedT.set(this.premiumBlocked);
            if (f2 > f) {
            }
            if (!this.premiumBlocked) {
            }
            z = false;
            if (!z) {
            }
            int bottom222 = this.imageView.getBottom() - AndroidUtilities.dp(6.0f);
            int right222 = this.imageView.getRight() - AndroidUtilities.dp(10.0f);
            Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
            float f922 = right222;
            float f1022 = bottom222;
            float f1122 = 1.0f - f2;
            float f1222 = 1.0f - f3;
            canvas2.drawCircle(f922, f1022, AndroidUtilities.dp(7.0f) * this.onlineProgress * f1122 * f1222, Theme.dialogs_onlineCirclePaint);
            Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_chats_onlineCircle));
            canvas2.drawCircle(f922, f1022, AndroidUtilities.dp(5.0f) * this.onlineProgress * f1122 * f1222, Theme.dialogs_onlineCirclePaint);
            if (z) {
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2);
        int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
        Theme.checkboxSquare_checkPaint.setColor(getThemedColor(Theme.key_dialogRoundCheckBox));
        Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.currentType == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(left - dp, top - dp, left + dp, top + dp);
        canvas.drawRoundRect(rectF, this.imageView.getRoundRadius()[0], this.imageView.getRoundRadius()[0], Theme.checkboxSquare_checkPaint);
        super.onDraw(canvas);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    public static class RepostStoryDrawable extends Drawable {
        int alpha;
        private final Drawable drawable;
        private final LinearGradient gradient;
        private final RLottieDrawable lottieDrawable;
        private final Paint paint;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public RepostStoryDrawable(Context context, View view, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this(context, view, z, R.drawable.large_repost_story, resourcesProvider);
        }

        public RepostStoryDrawable(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider) {
            this(context, view, false, i, resourcesProvider);
        }

        public RepostStoryDrawable(Context context, View view, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.alpha = NotificationCenter.cameraInitied;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{Theme.getColor(Theme.key_stories_circle1, resourcesProvider), Theme.getColor(Theme.key_stories_circle2, resourcesProvider)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradient = linearGradient;
            paint.setShader(linearGradient);
            if (z) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.story_repost, "story_repost", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
                this.lottieDrawable = rLottieDrawable;
                rLottieDrawable.setMasterParent(view);
                AndroidUtilities.runOnUIThread(new ShareDialogCell$RepostStoryDrawable$$ExternalSyntheticLambda0(rLottieDrawable), 450L);
                this.drawable = null;
                return;
            }
            this.lottieDrawable = null;
            Drawable mutate = context.getResources().getDrawable(i).mutate();
            this.drawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            this.paint.setAlpha(this.alpha);
            float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) * (this.alpha / 255.0f);
            canvas.drawRoundRect(rectF, min, min, this.paint);
            canvas.restore();
            int dp = AndroidUtilities.dp(this.lottieDrawable != null ? 20.0f : 15.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            Drawable drawable = this.lottieDrawable;
            if (drawable == null) {
                drawable = this.drawable;
            }
            if (drawable != null) {
                drawable.setBounds(rect);
                drawable.setAlpha(this.alpha);
                drawable.draw(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(56.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(56.0f);
        }
    }
}
