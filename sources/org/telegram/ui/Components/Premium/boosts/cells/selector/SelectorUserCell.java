package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.StatusBadgeComponent;
import org.telegram.ui.Components.UItem;

/* loaded from: classes5.dex */
public class SelectorUserCell extends BaseCell {
    private final ImageView audioView;
    private TL_stories.TL_myBoost boost;
    private TLRPC.Chat chat;
    private final CheckBox2 checkBox;
    private boolean hasAudioView;
    private boolean hasVideoView;
    private final boolean[] isOnline;
    private final ImageView optionsView;
    private boolean showCallButtons;
    StatusBadgeComponent statusBadgeComponent;
    private TLRPC.User user;
    private final ImageView videoView;

    public static class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        public static UItem make(TLRPC.User user) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = user;
            return ofFactory;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            selectorUserCell.setUser((TLRPC.User) uItem.object);
            selectorUserCell.setChecked(uItem.checked, false);
            selectorUserCell.setDivider(z);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public SelectorUserCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new SelectorUserCell(context, true, false, resourcesProvider, false);
        }
    }

    public SelectorUserCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, boolean z2) {
        this(context, z, false, resourcesProvider, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectorUserCell(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean z3) {
        super(context, resourcesProvider);
        this.isOnline = new boolean[1];
        this.showCallButtons = true;
        this.statusBadgeComponent = new StatusBadgeComponent(this);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.radioButton.setVisibility(8);
        if (z2) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z4 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 40.0f, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
        } else {
            if (!z) {
                this.checkBox = null;
                ImageView imageView = new ImageView(context);
                this.optionsView = imageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                imageView.setImageResource(R.drawable.ic_ab_other);
                int color = Theme.getColor(Theme.key_chat_inMenu, resourcesProvider);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                addView(imageView, LayoutHelper.createFrame(32, 32.0f, (!LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.audioView = imageView2;
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.menu_phone);
                int i = Theme.key_featuredStickers_addButton;
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), mode));
                boolean z5 = LocaleController.isRTL;
                addView(imageView2, LayoutHelper.createFrame(32, 32.0f, (!z5 ? 3 : 5) | 16, !z5 ? 52.0f : 12.0f, 0.0f, !z5 ? 12.0f : 52.0f, 0.0f));
                imageView2.setVisibility(8);
                ImageView imageView3 = new ImageView(context);
                this.videoView = imageView3;
                imageView3.setScaleType(scaleType);
                imageView3.setImageResource(R.drawable.menu_videocall);
                imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), mode));
                addView(imageView3, LayoutHelper.createFrame(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
                imageView3.setVisibility(8);
            }
            CheckBox2 checkBox22 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox22;
            checkBox22.setColor(z3 ? Theme.key_checkbox : Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
            checkBox22.setDrawUnchecked(true);
            checkBox22.setDrawBackgroundAsArc(10);
            addView(checkBox22);
            checkBox22.setChecked(false, false);
            checkBox22.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        }
        updateLayouts();
        ImageView imageView4 = new ImageView(context);
        this.optionsView = imageView4;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType2);
        imageView4.setImageResource(R.drawable.ic_ab_other);
        int color2 = Theme.getColor(Theme.key_chat_inMenu, resourcesProvider);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(color2, mode2));
        addView(imageView4, LayoutHelper.createFrame(32, 32.0f, (!LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView22 = new ImageView(context);
        this.audioView = imageView22;
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.menu_phone);
        int i2 = Theme.key_featuredStickers_addButton;
        imageView22.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode2));
        boolean z52 = LocaleController.isRTL;
        addView(imageView22, LayoutHelper.createFrame(32, 32.0f, (!z52 ? 3 : 5) | 16, !z52 ? 52.0f : 12.0f, 0.0f, !z52 ? 12.0f : 52.0f, 0.0f));
        imageView22.setVisibility(8);
        ImageView imageView32 = new ImageView(context);
        this.videoView = imageView32;
        imageView32.setScaleType(scaleType2);
        imageView32.setImageResource(R.drawable.menu_videocall);
        imageView32.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode2));
        addView(imageView32, LayoutHelper.createFrame(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView32.setVisibility(8);
    }

    public static String buildCountDownTime(long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j2)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j4)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j5)));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCallButtonsVisible$0() {
        this.audioView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCallButtonsVisible$1() {
        this.videoView.setVisibility(8);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.boost;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public TLRPC.User getUser() {
        return this.user;
    }

    @Override // org.telegram.ui.Components.Premium.boosts.cells.BaseCell
    protected boolean needCheck() {
        CheckBox2 checkBox2 = this.checkBox;
        return checkBox2 != null && checkBox2.getDrawUnchecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.statusBadgeComponent.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.statusBadgeComponent.onDetachedFromWindow();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.optionsView.setVisibility(8);
        this.boost = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.chat = chat;
        this.avatarDrawable.setInfo(chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(this.chat, this.avatarDrawable);
        this.titleTextView.setText(this.chat.title);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i = tL_myBoost.cooldown_until_date;
        if (i <= 0) {
            this.titleTextView.setAlpha(1.0f);
            this.subtitleTextView.setAlpha(1.0f);
            setCheckboxAlpha(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, buildCountDownTime((i * 1000) - System.currentTimeMillis())));
            this.titleTextView.setAlpha(0.65f);
            this.subtitleTextView.setAlpha(0.65f);
            setCheckboxAlpha(0.3f, false);
        }
    }

    public void setCallButtons(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        boolean z = onClickListener != null;
        this.hasAudioView = z;
        this.audioView.setVisibility((z && this.showCallButtons) ? 0 : 8);
        this.audioView.setOnClickListener(onClickListener);
        boolean z2 = onClickListener2 != null;
        this.hasVideoView = z2;
        this.videoView.setVisibility((z2 && this.showCallButtons) ? 0 : 8);
        this.videoView.setOnClickListener(onClickListener2);
    }

    public void setCallButtonsVisible(boolean z, boolean z2) {
        if (this.showCallButtons == z) {
            return;
        }
        this.showCallButtons = z;
        float f = 0.0f;
        if (z2) {
            this.audioView.setVisibility(0);
            this.audioView.animate().alpha((z && this.hasAudioView) ? 1.0f : 0.0f).withEndAction((z && this.hasAudioView) ? null : new Runnable() { // from class: org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectorUserCell.this.lambda$setCallButtonsVisible$0();
                }
            }).start();
            this.videoView.setVisibility(0);
            ViewPropertyAnimator animate = this.videoView.animate();
            if (z && this.hasVideoView) {
                f = 1.0f;
            }
            animate.alpha(f).withEndAction((z && this.hasVideoView) ? null : new Runnable() { // from class: org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SelectorUserCell.this.lambda$setCallButtonsVisible$1();
                }
            }).start();
            return;
        }
        this.audioView.animate().cancel();
        this.audioView.setAlpha((z && this.hasAudioView) ? 1.0f : 0.0f);
        this.audioView.setVisibility((z && this.hasAudioView) ? 0 : 8);
        this.videoView.animate().cancel();
        ImageView imageView = this.videoView;
        if (z && this.hasVideoView) {
            f = 1.0f;
        }
        imageView.setAlpha(f);
        this.videoView.setVisibility((z && this.hasVideoView) ? 0 : 8);
    }

    public void setChat(TLRPC.Chat chat, int i) {
        String string;
        this.optionsView.setVisibility(8);
        this.chat = chat;
        this.user = null;
        this.avatarDrawable.setInfo(chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f));
        this.imageView.setForUserOrChat(chat, this.avatarDrawable);
        this.titleTextView.setText(chat.title);
        this.titleTextView.setRightDrawable((Drawable) null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i >= 1) {
            string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i, new Object[0]);
        } else {
            string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
    }

    public void setCheckboxAlpha(float f, boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        if (!z) {
            checkBox2.animate().cancel();
            this.checkBox.setAlpha(f);
        } else if (Math.abs(checkBox2.getAlpha() - f) > 0.1d) {
            this.checkBox.animate().cancel();
            this.checkBox.animate().alpha(f).start();
        }
    }

    @Override // org.telegram.ui.Components.Premium.boosts.cells.BaseCell
    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null && checkBox2.getVisibility() == 0) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public void setCustomUser(Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
        this.optionsView.setVisibility(8);
        this.user = null;
        this.chat = null;
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setImageDrawable(drawable);
        this.titleTextView.setText(charSequence);
        this.isOnline[0] = false;
        setSubtitle(charSequence2);
        this.subtitleTextView.setTextColor(Theme.getColor(this.isOnline[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setAlpha(1.0f);
        }
        this.titleTextView.setRightDrawable((Drawable) null);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.optionsView.setVisibility(8);
        } else {
            this.optionsView.setVisibility(0);
            this.optionsView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        String formatUserStatus;
        this.optionsView.setVisibility(8);
        this.user = user;
        this.chat = null;
        this.avatarDrawable.setInfo(user);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(user, this.avatarDrawable);
        this.titleTextView.setText(UserObject.getUserName(user));
        this.isOnline[0] = false;
        if (UserObject.isBot(user)) {
            int i = user.bot_active_users;
            formatUserStatus = i > 0 ? LocaleController.formatPluralStringComma("BotUsers", i, ',') : LocaleController.getString(R.string.Bot);
        } else {
            formatUserStatus = LocaleController.formatUserStatus(UserConfig.selectedAccount, user, this.isOnline);
        }
        setSubtitle(formatUserStatus);
        this.subtitleTextView.setTextColor(Theme.getColor(this.isOnline[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setAlpha(1.0f);
        }
        this.titleTextView.setRightDrawable(this.statusBadgeComponent.updateDrawable(user, Theme.getColor(Theme.key_chats_verifiedBackground), false));
    }

    public void updateTimer() {
        int i = this.boost.cooldown_until_date;
        if (i > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, buildCountDownTime((i * 1000) - System.currentTimeMillis())));
            this.titleTextView.setAlpha(0.65f);
            this.subtitleTextView.setAlpha(0.65f);
            setCheckboxAlpha(0.3f, false);
            return;
        }
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(this.boost.expires * 1000))));
        if (this.titleTextView.getAlpha() < 1.0f) {
            this.titleTextView.animate().alpha(1.0f).start();
            this.subtitleTextView.animate().alpha(1.0f).start();
            setCheckboxAlpha(1.0f, true);
        } else {
            this.titleTextView.setAlpha(1.0f);
            this.subtitleTextView.setAlpha(1.0f);
            setCheckboxAlpha(1.0f, false);
        }
    }
}
