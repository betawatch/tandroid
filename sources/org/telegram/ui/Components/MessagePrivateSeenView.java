package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes5.dex */
public class MessagePrivateSeenView extends FrameLayout {
    private final int currentAccount;
    private final long dialogId;
    private final Runnable dismiss;
    private final int edit_date;
    private final int fwd_date;
    public boolean isPremiumLocked;
    private final TextView loadingView;
    private final int messageDiff;
    private final int messageId;
    float minWidth;
    private final TextView premiumTextView;
    private final Theme.ResourcesProvider resourcesProvider;
    private final int sent_date;
    private final int type;
    private final LinearLayout valueLayout;
    private final TextView valueTextView;

    public MessagePrivateSeenView(Context context, int i, MessageObject messageObject, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.isPremiumLocked = false;
        this.minWidth = -1.0f;
        this.type = i;
        int i3 = messageObject.currentAccount;
        this.currentAccount = i3;
        this.resourcesProvider = resourcesProvider;
        this.dismiss = runnable;
        this.messageDiff = ConnectionsManager.getInstance(i3).getCurrentTime() - messageObject.messageOwner.date;
        this.dialogId = messageObject.getDialogId();
        this.messageId = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        this.sent_date = message == null ? 0 : message.date;
        this.edit_date = message == null ? 0 : message.edit_date;
        this.fwd_date = (message == null || (messageFwdHeader = message.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            if (AppGlobalConfig.getInstance(i3).messagePrimaryEditedDate.get()) {
                i2 = R.drawable.outline_message_time_24;
            } else {
                i2 = R.drawable.menu_edited_stamp;
            }
        } else if (i == 2) {
            i2 = R.drawable.menu_forward_stamp;
        } else if (messageObject.isVoice()) {
            i2 = R.drawable.msg_played;
        } else {
            i2 = R.drawable.msg_seen;
        }
        Drawable mutate = ContextCompat.getDrawable(context, i2).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.loadingView = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new LoadingSpan(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), resourcesProvider), 0, spannableStringBuilder.length() - 1, 17);
        int i4 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.multAlpha(Theme.getColor(i4, resourcesProvider), 0.7f));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, LayoutHelper.createFrame(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.valueLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTextColor(Theme.getColor(i4, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 19, 0, -1, 0, 0));
        TextView textView3 = new TextView(context);
        this.premiumTextView = textView3;
        textView3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.multAlpha(Theme.getColor(Theme.key_divider, resourcesProvider), 0.75f)));
        textView3.setTextColor(Theme.getColor(i4, resourcesProvider));
        textView3.setTextSize(1, 11.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 19, 4, 0, 0, 0));
        request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void request() {
        String formatPmEditedDate;
        int i = this.type;
        if (i == 1) {
            this.valueLayout.setAlpha(1.0f);
            this.loadingView.setAlpha(0.0f);
            this.premiumTextView.setVisibility(8);
            TextView textView = this.valueTextView;
            if (AppGlobalConfig.getInstance(this.currentAccount).messagePrimaryEditedDate.get()) {
                formatPmEditedDate = LocaleController.formatPmSentDate(this.sent_date);
            } else {
                formatPmEditedDate = LocaleController.formatPmEditedDate(this.edit_date);
            }
            textView.setText(formatPmEditedDate);
            return;
        }
        if (i == 2) {
            this.valueLayout.setAlpha(1.0f);
            this.loadingView.setAlpha(0.0f);
            this.premiumTextView.setVisibility(8);
            this.valueTextView.setText(LocaleController.formatPmFwdDate(this.fwd_date));
            return;
        }
        setOnClickListener(null);
        this.valueLayout.setAlpha(0.0f);
        this.loadingView.setAlpha(1.0f);
        this.premiumTextView.setVisibility(0);
        TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
        tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_getOutboxReadDate.msg_id = this.messageId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getOutboxReadDate, new RequestDelegate() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagePrivateSeenView.$r8$lambda$oLIwLc7C7ddHwdykxy5BQI4fe6s(MessagePrivateSeenView.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$oLIwLc7C7ddHwdykxy5BQI4fe6s(final MessagePrivateSeenView messagePrivateSeenView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        messagePrivateSeenView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MessagePrivateSeenView.$r8$lambda$vi8mOgQT9rxFcW7zbYQxpfmDnzY(MessagePrivateSeenView.this, tL_error, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$vi8mOgQT9rxFcW7zbYQxpfmDnzY(final MessagePrivateSeenView messagePrivateSeenView, TLRPC.TL_error tL_error, TLObject tLObject) {
        messagePrivateSeenView.getClass();
        if (tL_error != null) {
            if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                messagePrivateSeenView.valueTextView.setText(LocaleController.getString(R.string.PmReadUnknown));
                messagePrivateSeenView.premiumTextView.setVisibility(8);
            } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                messagePrivateSeenView.isPremiumLocked = true;
                messagePrivateSeenView.valueTextView.setText(LocaleController.getString(R.string.PmRead));
                messagePrivateSeenView.premiumTextView.setText(LocaleController.getString(R.string.PmReadShowWhen));
            } else {
                messagePrivateSeenView.valueTextView.setText(LocaleController.getString("UnknownError"));
                messagePrivateSeenView.premiumTextView.setVisibility(8);
                BulletinFactory.of(Bulletin.BulletinWindow.make(messagePrivateSeenView.getContext()), messagePrivateSeenView.resourcesProvider).showForError(tL_error);
            }
        } else if (tLObject instanceof TLRPC.TL_outboxReadDate) {
            messagePrivateSeenView.valueTextView.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject).date));
            messagePrivateSeenView.premiumTextView.setVisibility(8);
        }
        ViewPropertyAnimator alpha = messagePrivateSeenView.valueLayout.animate().alpha(1.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        alpha.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
        messagePrivateSeenView.loadingView.animate().alpha(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
        if (messagePrivateSeenView.isPremiumLocked) {
            messagePrivateSeenView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, messagePrivateSeenView.resourcesProvider), 6, 0));
            messagePrivateSeenView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessagePrivateSeenView.showSheet(r0.getContext(), r0.currentAccount, r0.dialogId, false, r0.dismiss, new Runnable() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagePrivateSeenView.this.request();
                        }
                    }, MessagePrivateSeenView.this.resourcesProvider);
                }
            });
        } else {
            messagePrivateSeenView.setBackground(null);
            messagePrivateSeenView.setOnClickListener(null);
        }
    }

    public static void showSheet(final Context context, final int i, long j, final boolean z, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        String str;
        int i2;
        final BottomSheet bottomSheet = new BottomSheet(context, false, resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(z ? R.string.PremiumLastSeenHeader1 : R.string.PremiumReadHeader1));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        if (j <= 0) {
            str = "";
        } else {
            str = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        String str2 = str;
        if (z) {
            i2 = premiumFeaturesBlocked ? R.string.PremiumLastSeenText1Locked : R.string.PremiumLastSeenText1;
        } else {
            i2 = premiumFeaturesBlocked ? R.string.PremiumReadText1Locked : R.string.PremiumReadText1;
        }
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i2, str2)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        round.setText(LocaleController.getString(z ? R.string.PremiumLastSeenButton1 : R.string.PremiumReadButton1), false);
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 1));
        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePrivateSeenView.$r8$lambda$1onCj4pvO6L8Hb9bbMPAmbQK-A4(ButtonWithCounterView.this, z, i, bottomSheet, runnable2, context, resourcesProvider, view);
            }
        });
        if (!premiumFeaturesBlocked) {
            SimpleTextView simpleTextView = new SimpleTextView(context) { // from class: org.telegram.ui.Components.MessagePrivateSeenView.1
                private final Paint paint = new Paint(1);

                @Override // android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(Theme.getColor(Theme.key_dialogGrayLine, resourcesProvider));
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, this.paint);
                    canvas.drawLine((getWidth() / 2.0f) + (getTextWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            simpleTextView.setGravity(17);
            simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            simpleTextView.setText(" " + LocaleController.getString(R.string.PremiumOr) + " ");
            simpleTextView.setTextSize(14);
            linearLayout.addView(simpleTextView, LayoutHelper.createLinear(NotificationCenter.locationPermissionGranted, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView3.setTextSize(1, 20.0f);
            textView3.setText(LocaleController.getString(z ? R.string.PremiumLastSeenHeader2 : R.string.PremiumReadHeader2));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView4.setTextSize(1, 14.0f);
            textView4.setText(AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.PremiumLastSeenText2 : R.string.PremiumReadText2, str2)));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, resourcesProvider);
            premiumButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessagePrivateSeenView.$r8$lambda$6VkjybRO9MqmC2d3jzpplZhufnY(z, bottomSheet, runnable, view);
                }
            });
            premiumButtonView.setOverlayText(LocaleController.getString(z ? R.string.PremiumLastSeenButton2 : R.string.PremiumReadButton2), false, false);
            linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    public static /* synthetic */ void $r8$lambda$1onCj4pvO6L8Hb9bbMPAmbQK-A4(final ButtonWithCounterView buttonWithCounterView, boolean z, int i, final BottomSheet bottomSheet, final Runnable runnable, final Context context, final Theme.ResourcesProvider resourcesProvider, View view) {
        buttonWithCounterView.setLoading(true);
        if (z) {
            TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
            setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
            setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            ConnectionsManager.getInstance(i).sendRequest(setprivacy, new RequestDelegate() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda4
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagePrivateSeenView.$r8$lambda$guwLb45BisSIq2eY_xOdk0X5n-Y(TLRPC.TL_error.this, r2, r3, r4);
                        }
                    });
                }
            });
            return;
        }
        TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i).getGlobalPrivacySettings();
        setglobalprivacysettings.settings = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
        }
        setglobalprivacysettings.settings.hide_read_marks = false;
        ConnectionsManager.getInstance(i).sendRequest(setglobalprivacysettings, new RequestDelegate() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.MessagePrivateSeenView$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagePrivateSeenView.$r8$lambda$mFKiuqa7A-9qEAjUuAbSEUUzIag(TLRPC.TL_error.this, r2, r3, r4, r5, r6);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$guwLb45BisSIq2eY_xOdk0X5n-Y(TLRPC.TL_error tL_error, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable) {
        if (tL_error != null) {
            BulletinFactory.global().showForError(tL_error);
            return;
        }
        buttonWithCounterView.setLoading(false);
        bottomSheet.dismiss();
        BulletinFactory.global().createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.PremiumLastSeenSet)).show();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$mFKiuqa7A-9qEAjUuAbSEUUzIag(TLRPC.TL_error tL_error, Context context, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable) {
        if (tL_error != null) {
            BulletinFactory.of(Bulletin.BulletinWindow.make(context), resourcesProvider).showForError(tL_error);
            return;
        }
        buttonWithCounterView.setLoading(false);
        bottomSheet.dismiss();
        BulletinFactory.of(Bulletin.BulletinWindow.make(context), resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.PremiumReadSet)).show();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$6VkjybRO9MqmC2d3jzpplZhufnY(boolean z, BottomSheet bottomSheet, Runnable runnable, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment(z ? "lastseen" : "readtime"));
            bottomSheet.dismiss();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Bulletin.getVisibleBulletin() != null) {
            Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin.getLayout() == null || visibleBulletin.getLayout().getParent() == null || !(visibleBulletin.getLayout().getParent().getParent() instanceof Bulletin.BulletinWindow.BulletinWindowLayout)) {
                return;
            }
            visibleBulletin.hide();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.minWidth < 0.0f) {
            this.minWidth = 0.0f;
            if (this.type == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.minWidth, AndroidUtilities.dp(144.0f));
                this.minWidth = max;
                float max2 = Math.max(max, AndroidUtilities.dp(48.0f) + this.valueTextView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)));
                this.minWidth = max2;
                float max3 = Math.max(max2, AndroidUtilities.dp(64.0f) + this.valueTextView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.premiumTextView.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))));
                this.minWidth = max3;
                float max4 = Math.max(max3, ((float) AndroidUtilities.dp(48.0f)) + this.valueTextView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))));
                this.minWidth = max4;
                if (this.messageDiff > 86400) {
                    this.minWidth = Math.max(max4, AndroidUtilities.dp(48.0f) + this.valueTextView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))));
                }
                if (this.messageDiff > 172800) {
                    float f = this.minWidth;
                    float dp = AndroidUtilities.dp(48.0f);
                    TextPaint paint = this.valueTextView.getPaint();
                    int i3 = R.string.PmReadDateTimeAt;
                    float max5 = Math.max(f, dp + paint.measureText(LocaleController.formatString(i3, LocaleController.getInstance().getFormatterDayMonth().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))));
                    this.minWidth = max5;
                    this.minWidth = Math.max(max5, AndroidUtilities.dp(48.0f) + this.valueTextView.getPaint().measureText(LocaleController.formatString(i3, LocaleController.getInstance().getFormatterYear().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))));
                }
            } else {
                this.minWidth = AndroidUtilities.dp(48.0f) + this.valueTextView.getPaint().measureText(this.valueTextView.getText().toString());
            }
        }
        int i4 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = TLObject.FLAG_30;
        }
        float f2 = size;
        float f3 = this.minWidth;
        if (f2 < f3 || mode == Integer.MIN_VALUE) {
            size = (int) f3;
        } else {
            i4 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i4), i2);
    }
}
