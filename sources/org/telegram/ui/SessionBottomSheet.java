package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.SessionBottomSheet;

/* loaded from: classes4.dex */
public class SessionBottomSheet extends BottomSheet {
    RLottieImageView imageView;
    BaseFragment parentFragment;
    TLRPC.TL_authorization session;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 8 implements View.OnClickListener {
        final /* synthetic */ Callback val$callback;
        final /* synthetic */ BaseFragment val$fragment;
        final /* synthetic */ TLRPC.TL_authorization val$session;

        8(Callback callback, TLRPC.TL_authorization tL_authorization, BaseFragment baseFragment) {
            this.val$callback = callback;
            this.val$session = tL_authorization;
            this.val$fragment = baseFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0(Callback callback, TLRPC.TL_authorization tL_authorization, DialogInterface dialogInterface, int i) {
            callback.onSessionTerminated(tL_authorization);
            SessionBottomSheet.this.dismiss();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SessionBottomSheet.this.parentFragment.getParentActivity());
            builder.setMessage(LocaleController.getString(R.string.TerminateSessionText));
            builder.setTitle(LocaleController.getString(R.string.AreYouSureSessionTitle));
            String string = LocaleController.getString(R.string.Terminate);
            final Callback callback = this.val$callback;
            final TLRPC.TL_authorization tL_authorization = this.val$session;
            builder.setPositiveButton(string, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet$8$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SessionBottomSheet.8.this.lambda$onClick$0(callback, tL_authorization, dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog create = builder.create();
            this.val$fragment.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Callback {
        void onSessionTerminated(TLRPC.TL_authorization tL_authorization);
    }

    /* loaded from: classes4.dex */
    private static class ItemView extends FrameLayout {
        TextView descriptionText;
        ImageView iconView;
        boolean needDivider;
        Switch switchView;
        TextView valueText;

        public ItemView(Context context, boolean z) {
            super(context);
            this.needDivider = false;
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.iconView, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
            TextView textView = new TextView(context);
            this.valueText = textView;
            textView.setTextSize(2, 16.0f);
            this.valueText.setGravity(3);
            this.valueText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            linearLayout.addView(this.valueText, LayoutHelper.createLinear(-1, -2, 0, 0, 0, z ? 64 : 0, 0));
            TextView textView2 = new TextView(context);
            this.descriptionText = textView2;
            textView2.setTextSize(2, 13.0f);
            this.descriptionText.setGravity(3);
            this.descriptionText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
            linearLayout.addView(this.descriptionText, LayoutHelper.createLinear(-1, -2, 0, 0, 4, z ? 64 : 0, 0));
            setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            if (z) {
                Switch r2 = new Switch(context);
                this.switchView = r2;
                r2.setDrawIconType(1);
                addView(this.switchView, LayoutHelper.createFrame(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.switchView != null) {
                accessibilityNodeInfo.setClassName("android.widget.Switch");
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(this.switchView.isChecked());
                StringBuilder sb = new StringBuilder();
                sb.append((Object) this.valueText.getText());
                sb.append("\n");
                sb.append((Object) this.descriptionText.getText());
                sb.append("\n");
                sb.append(LocaleController.getString(this.switchView.isChecked() ? R.string.NotificationsOn : R.string.NotificationsOff));
                accessibilityNodeInfo.setText(sb.toString());
            }
        }
    }

    public SessionBottomSheet(BaseFragment baseFragment, final TLRPC.TL_authorization tL_authorization, boolean z, Callback callback) {
        super(baseFragment.getParentActivity(), false);
        setOpenNoDelay(true);
        Activity parentActivity = baseFragment.getParentActivity();
        this.session = tL_authorization;
        this.parentFragment = baseFragment;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(parentActivity);
        this.imageView = rLottieImageView;
        rLottieImageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SessionBottomSheet.this.imageView.isPlaying() || SessionBottomSheet.this.imageView.getAnimatedDrawable() == null) {
                    return;
                }
                SessionBottomSheet.this.imageView.getAnimatedDrawable().setCurrentFrame(40);
                SessionBottomSheet.this.imageView.playAnimation();
            }
        });
        this.imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(this.imageView, LayoutHelper.createLinear(70, 70, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        textView.setTextSize(2, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 21, 12, 21, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 21, 4, 21, 21));
        textView2.setText((tL_authorization.flags & 1) != 0 ? LocaleController.getString(R.string.Online) : LocaleController.formatDateTime(tL_authorization.date_active, true));
        StringBuilder sb = new StringBuilder();
        if (tL_authorization.device_model.length() != 0) {
            sb.append(tL_authorization.device_model);
        }
        if (sb.length() == 0) {
            if (tL_authorization.platform.length() != 0) {
                sb.append(tL_authorization.platform);
            }
            if (tL_authorization.system_version.length() != 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(" ");
                }
                sb.append(tL_authorization.system_version);
            }
        }
        textView.setText(sb);
        setAnimation(tL_authorization, this.imageView);
        ItemView itemView = new ItemView(parentActivity, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_authorization.app_name);
        sb2.append(" ");
        sb2.append(tL_authorization.app_version);
        itemView.valueText.setText(sb2);
        Drawable mutate = ContextCompat.getDrawable(parentActivity, R.drawable.menu_devices).mutate();
        int i = Theme.key_windowBackgroundWhiteGrayIcon;
        int color = Theme.getColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(color, mode));
        itemView.iconView.setImageDrawable(mutate);
        itemView.descriptionText.setText(LocaleController.getString(R.string.Application));
        linearLayout.addView(itemView);
        if (tL_authorization.country.length() != 0) {
            ItemView itemView2 = new ItemView(parentActivity, false);
            itemView2.valueText.setText(tL_authorization.country);
            Drawable mutate2 = ContextCompat.getDrawable(parentActivity, R.drawable.msg_location).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
            itemView2.iconView.setImageDrawable(mutate2);
            itemView2.descriptionText.setText(LocaleController.getString(R.string.Location));
            itemView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                }
            });
            itemView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.SessionBottomSheet.3
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            linearLayout.addView(itemView2);
            itemView.needDivider = true;
            itemView = itemView2;
        }
        if (tL_authorization.ip.length() != 0) {
            ItemView itemView3 = new ItemView(parentActivity, false);
            itemView3.valueText.setText(tL_authorization.ip);
            Drawable mutate3 = ContextCompat.getDrawable(parentActivity, R.drawable.msg_language).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
            itemView3.iconView.setImageDrawable(mutate3);
            itemView3.descriptionText.setText(LocaleController.getString(R.string.IpAddress));
            itemView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.ip);
                }
            });
            itemView3.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.SessionBottomSheet.5
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView3.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            linearLayout.addView(itemView3);
            itemView.needDivider = true;
            itemView = itemView3;
        }
        if (secretChatsEnabled(tL_authorization)) {
            final ItemView itemView4 = new ItemView(parentActivity, true);
            itemView4.valueText.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable mutate4 = ContextCompat.getDrawable(parentActivity, R.drawable.msg_secret).mutate();
            mutate4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
            itemView4.iconView.setImageDrawable(mutate4);
            itemView4.switchView.setChecked(!tL_authorization.encrypted_requests_disabled, false);
            itemView4.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 7));
            itemView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    itemView4.switchView.setChecked(!r3.isChecked(), true);
                    tL_authorization.encrypted_requests_disabled = !itemView4.switchView.isChecked();
                    SessionBottomSheet.this.uploadSessionSettings();
                }
            });
            itemView.needDivider = true;
            itemView4.descriptionText.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout.addView(itemView4);
            itemView = itemView4;
        }
        final ItemView itemView5 = new ItemView(parentActivity, true);
        itemView5.valueText.setText(LocaleController.getString(R.string.AcceptCalls));
        Drawable mutate5 = ContextCompat.getDrawable(parentActivity, R.drawable.msg_calls).mutate();
        mutate5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
        itemView5.iconView.setImageDrawable(mutate5);
        itemView5.switchView.setChecked(!tL_authorization.call_requests_disabled, false);
        itemView5.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 7));
        itemView5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                itemView5.switchView.setChecked(!r3.isChecked(), true);
                tL_authorization.call_requests_disabled = !itemView5.switchView.isChecked();
                SessionBottomSheet.this.uploadSessionSettings();
            }
        });
        itemView.needDivider = true;
        itemView5.descriptionText.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
        linearLayout.addView(itemView5);
        if (!z) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.TerminateSession));
            textView3.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_chat_attachAudioBackground), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 120)));
            linearLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new 8(callback, tL_authorization, baseFragment));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyText(final String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.SessionBottomSheet$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SessionBottomSheet.this.lambda$copyText$1(str, dialogInterface, i);
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copyText$1(String str, DialogInterface dialogInterface, int i) {
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
        BulletinFactory.of(getContainer(), null).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uploadSessionSettings$0(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private boolean secretChatsEnabled(TLRPC.TL_authorization tL_authorization) {
        int i = tL_authorization.api_id;
        return (i == 2040 || i == 2496) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r8.app_name.toLowerCase().contains("desktop") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setAnimation(TLRPC.TL_authorization tL_authorization, RLottieImageView rLottieImageView) {
        int i;
        int i2;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        boolean z = true;
        if (lowerCase2.contains("safari")) {
            i = R.raw.safari_30;
        } else if (lowerCase2.contains("edge")) {
            i = R.raw.edge_30;
        } else {
            if (!lowerCase2.contains("chrome")) {
                if (lowerCase2.contains("firefox")) {
                    i = R.raw.firefox_30;
                    i2 = Theme.key_avatar_backgroundRed;
                } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                    i = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                    i2 = Theme.key_avatar_backgroundPink;
                    z = false;
                } else {
                    if (lowerCase.contains("ubuntu")) {
                        i = R.raw.ubuntu_30;
                    } else if (lowerCase.contains("linux")) {
                        i = R.raw.linux_30;
                    } else if (lowerCase.contains("ios")) {
                        i = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                    } else {
                        if (!lowerCase.contains("windows")) {
                            if (lowerCase.contains("macos")) {
                                i = R.raw.mac_30;
                                i2 = Theme.key_avatar_backgroundCyan;
                            } else if (lowerCase.contains("android")) {
                                i = R.raw.android_30;
                                i2 = Theme.key_avatar_backgroundGreen;
                            }
                        }
                        i = R.raw.windows_30;
                        i2 = Theme.key_avatar_backgroundCyan;
                    }
                    i2 = Theme.key_avatar_backgroundBlue;
                }
                rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(i2)));
                if (z) {
                    rLottieImageView.setImageDrawable(ContextCompat.getDrawable(getContext(), i));
                    return;
                } else {
                    rLottieImageView.setAnimation(i, 50, 50, new int[]{0, Theme.getColor(i2)});
                    return;
                }
            }
            i = R.raw.chrome_30;
        }
        i2 = Theme.key_avatar_backgroundPink;
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(i2)));
        if (z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadSessionSettings() {
        TLRPC.TL_account_changeAuthorizationSettings tL_account_changeAuthorizationSettings = new TLRPC.TL_account_changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = this.session;
        tL_account_changeAuthorizationSettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        tL_account_changeAuthorizationSettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        tL_account_changeAuthorizationSettings.flags = 3;
        tL_account_changeAuthorizationSettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_changeAuthorizationSettings, new RequestDelegate() { // from class: org.telegram.ui.SessionBottomSheet$$ExternalSyntheticLambda1
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SessionBottomSheet.lambda$uploadSessionSettings$0(tLObject, tL_error);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        super.show();
        this.imageView.playAnimation();
    }
}
