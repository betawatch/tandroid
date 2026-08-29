package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class if0 extends org.telegram.ui.Components.mv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int p0 = 0;
    public final TextView A;
    public final LinearLayout B;
    public final org.telegram.ui.Components.aj0 C;
    public Bundle D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final org.telegram.ui.Components.xi0 J;
    public final org.telegram.ui.Components.xi0 K;
    public final org.telegram.ui.Components.xi0 L;
    public boolean M;
    public Timer N;
    public Timer O;
    public int P;
    public final Object Q;
    public int R;
    public int S;
    public double T;
    public double U;
    public boolean V;
    public boolean W;
    public final org.telegram.ui.Components.xi0 a;
    public String a0;
    public String b;
    public final int b0;
    public String c;
    public int c0;
    public String d;
    public int d0;
    public String e;
    public boolean e0;
    public final sr f;
    public String f0;
    public String g0;
    public final org.telegram.ui.Components.voip.p2 h;
    public String h0;
    public int i0;
    public String j0;
    public Bundle k0;
    public TLRPC.TL_auth_sentCode l0;
    public boolean m0;
    public final TextView n;
    public final ue0 n0;
    public final /* synthetic */ fg0 o0;
    public final TextView r;
    public final org.telegram.ui.Components.aj0 s;
    public final gf0 v;
    public final od0 w;
    public final gf0 x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0495  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public if0(fg0 fg0Var, Context context, int i10) {
        super(context);
        ViewGroup viewGroup;
        this.o0 = fg0Var;
        this.Q = new Object();
        this.R = 60000;
        this.S = 15000;
        this.a0 = "";
        this.e0 = false;
        this.f0 = "*";
        this.g0 = "";
        this.n0 = new ue0(this, 2);
        this.b0 = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        th.n(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = fg0Var.B != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i10 == 11) {
            textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            ImageView imageView2 = new ImageView(context);
            this.I = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, i7.f6.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, i7.f6.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.F = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.x3.r(R.string.MissedCallDescriptionSubtitle, textView3);
            addView(textView3, i7.f6.t(-1, -2, 49, 36, 16, 36, 0));
            ff0 ff0Var = new ff0(this, context, 0);
            this.f = ff0Var;
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            TextView textView4 = new TextView(context);
            this.E = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            g10.addView(textView4, i7.f6.t(-2, -1, 16, 0, 0, 4, 0));
            g10.addView(ff0Var, i7.f6.n(-2, -1));
            addView(g10, i7.f6.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.G = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.x3.r(R.string.MissedCallDescriptionSubtitle2, textView5);
            addView(textView5, i7.f6.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, i7.f6.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, i7.f6.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, i7.f6.e(-2, -2, 1));
                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                this.s = aj0Var;
                int i11 = R.raw.phone_flash_call;
                org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i11, String.valueOf(i11), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.a = xi0Var;
                aj0Var.setAnimation(xi0Var);
                frameLayout3.addView(aj0Var, i7.f6.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i10 != 11) {
                    ff0 ff0Var2 = new ff0(this, context, 1);
                    this.f = ff0Var2;
                    addView(ff0Var2, i7.f6.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i10 == 3) {
                    this.f.setVisibility(8);
                }
                org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(fg0Var, context);
                this.h = p2Var;
                int i12 = org.telegram.ui.ActionBar.g6.I6;
                p2Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                p2Var.setTextColor(fg0Var.getThemedColor(i12));
                p2Var.setTextSize(1, 14.0f);
                p2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                p2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i13 = 0;
                p2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cf0
                    public final /* synthetic */ if0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i13) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                if0 if0Var = this.b;
                                gf0 gf0Var = if0Var.v;
                                if (if0Var.R <= 0 || if0Var.N == null) {
                                    if0Var.e0 = true;
                                    gf0Var.invalidate();
                                    gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    int i15 = if0Var.c0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                                            if0Var.V = false;
                                            if0Var.v();
                                            if0Var.e0 = false;
                                            if0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            gf0Var.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            gf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", if0Var.b);
                                        bundle.putString("ephone", if0Var.e);
                                        bundle.putString("phoneFormated", if0Var.d);
                                        bundle.putInt("prevType", if0Var.b0);
                                        if0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = if0Var.d;
                                        tL_auth_resendCode.phone_code_hash = if0Var.c;
                                        i14 = ((org.telegram.ui.ActionBar.o2) if0Var.o0).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ze0(if0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if0 if0Var2 = this.b;
                                if0Var2.getClass();
                                try {
                                    if0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(if0Var2.j0)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                addView(p2Var, i7.f6.t(-2, -2, 1, 0, 18, 0, 0));
                p2Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.y = frameLayout4;
                gf0 gf0Var = new gf0(this, context, 0);
                this.v = gf0Var;
                gf0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                gf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                gf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                gf0Var.setTextSize(1, 15.0f);
                gf0Var.setGravity(51);
                final int i14 = 1;
                gf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cf0
                    public final /* synthetic */ if0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i142;
                        switch (i14) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                if0 if0Var = this.b;
                                gf0 gf0Var2 = if0Var.v;
                                if (if0Var.R <= 0 || if0Var.N == null) {
                                    if0Var.e0 = true;
                                    gf0Var2.invalidate();
                                    gf0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    int i15 = if0Var.c0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                                            if0Var.V = false;
                                            if0Var.v();
                                            if0Var.e0 = false;
                                            if0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            gf0Var2.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            gf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", if0Var.b);
                                        bundle.putString("ephone", if0Var.e);
                                        bundle.putString("phoneFormated", if0Var.d);
                                        bundle.putInt("prevType", if0Var.b0);
                                        if0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = if0Var.d;
                                        tL_auth_resendCode.phone_code_hash = if0Var.c;
                                        i142 = ((org.telegram.ui.ActionBar.o2) if0Var.o0).currentAccount;
                                        ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ze0(if0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if0 if0Var2 = this.b;
                                if0Var2.getClass();
                                try {
                                    if0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(if0Var2.j0)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                frameLayout4.addView(gf0Var, i7.f6.e(-2, -2, 49));
                od0 od0Var = new od0(context, 1);
                this.w = od0Var;
                if (i10 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.ct.e;
                    loadAnimation.setInterpolator(interpolator);
                    od0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    od0Var.setOutAnimation(loadAnimation2);
                    gf0 gf0Var2 = new gf0(this, context, 1);
                    this.x = gf0Var2;
                    gf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    gf0Var2.setTextSize(1, 15.0f);
                    gf0Var2.setGravity(49);
                    gf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout4.addView(gf0Var2, i7.f6.e(-1, -2, 17));
                    od0Var.addView(frameLayout4, i7.f6.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.jr.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    od0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    od0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.B = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    int dp = AndroidUtilities.dp(6.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wh, false);
                    int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Q9, false);
                    linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, w03, w03));
                    final int i15 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cf0
                        public final /* synthetic */ if0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i142;
                            switch (i15) {
                                case 0:
                                    this.b.c(true);
                                    break;
                                case 1:
                                    if0 if0Var = this.b;
                                    gf0 gf0Var22 = if0Var.v;
                                    if (if0Var.R <= 0 || if0Var.N == null) {
                                        if0Var.e0 = true;
                                        gf0Var22.invalidate();
                                        gf0Var22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                        int i152 = if0Var.c0;
                                        if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                NotificationCenter.getGlobalInstance().removeObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                                                if0Var.V = false;
                                                if0Var.v();
                                                if0Var.e0 = false;
                                                if0Var.x();
                                                break;
                                            }
                                        } else {
                                            if (i152 == 4 || i152 == 11) {
                                                gf0Var22.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                gf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", if0Var.b);
                                            bundle.putString("ephone", if0Var.e);
                                            bundle.putString("phoneFormated", if0Var.d);
                                            bundle.putInt("prevType", if0Var.b0);
                                            if0Var.s();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = if0Var.d;
                                            tL_auth_resendCode.phone_code_hash = if0Var.c;
                                            i142 = ((org.telegram.ui.ActionBar.o2) if0Var.o0).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ze0(if0Var, bundle, 0), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if0 if0Var2 = this.b;
                                    if0Var2.getClass();
                                    try {
                                        if0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(if0Var2.j0)));
                                        break;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                            }
                        }
                    });
                    od0Var.addView(linearLayout2, i7.f6.c(52.0f, -1));
                    org.telegram.ui.Components.aj0 aj0Var2 = new org.telegram.ui.Components.aj0(context);
                    this.C = aj0Var2;
                    aj0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(aj0Var2, i7.f6.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(LocaleController.getString(R.string.OpenFragment));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(AndroidUtilities.bold());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.A = textView7;
                textView7.setLineSpacing(b.e(2.0f, R.string.WrongCode, textView7), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                od0Var.addView(textView7, i7.f6.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(od0Var, i7.f6.d(i10 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, i7.f6.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(od0Var, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                oc.i.K1(od0Var);
                if (i10 == 15) {
                    this.x.setOnClickListener(new t70(8, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, i7.f6.t(-2, -2, 49, 0, 16, 0, 0));
            int i16 = i10 == 1 ? 128 : 64;
            if (i10 == 1) {
                int i17 = R.raw.code_laptop;
                float f9 = i16;
                this.a = new org.telegram.ui.Components.xi0(i17, String.valueOf(i17), AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), true, null);
            } else {
                int i18 = R.raw.sms_incoming_info;
                float f10 = i16;
                this.a = new org.telegram.ui.Components.xi0(i18, String.valueOf(i18), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                int i19 = R.raw.phone_stars_to_dots;
                this.J = new org.telegram.ui.Components.xi0(i19, String.valueOf(i19), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                int i20 = R.raw.phone_dots;
                this.K = new org.telegram.ui.Components.xi0(i20, String.valueOf(i20), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                int i21 = R.raw.phone_dots_to_stars;
                this.L = new org.telegram.ui.Components.xi0(i21, String.valueOf(i21), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
            }
            org.telegram.ui.Components.aj0 aj0Var3 = new org.telegram.ui.Components.aj0(context);
            this.s = aj0Var3;
            aj0Var3.setAnimation(this.a);
            if (i10 == 1 && !AndroidUtilities.isSmallScreen()) {
                aj0Var3.setTranslationY(-AndroidUtilities.dp(24.0f));
            }
            frameLayout6.addView(aj0Var3, i7.f6.d(i16, i16, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
            if (string == null) {
                string = LocaleController.getString(i10 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
            }
            textView2.setText(string);
            addView(textView2, i7.f6.t(-2, -2, 49, 0, 18, 0, 0));
            int i22 = i10 == 15 ? 16 : 0;
            addView(textView, i7.f6.t(-2, -2, 49, i22, 17, i22, 0));
        }
        viewGroup = null;
        if (i10 != 11) {
        }
        if (i10 == 3) {
        }
        org.telegram.ui.Components.voip.p2 p2Var2 = new org.telegram.ui.Components.voip.p2(fg0Var, context);
        this.h = p2Var2;
        int i122 = org.telegram.ui.ActionBar.g6.I6;
        p2Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i122, false));
        p2Var2.setTextColor(fg0Var.getThemedColor(i122));
        p2Var2.setTextSize(1, 14.0f);
        p2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i132 = 0;
        p2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cf0
            public final /* synthetic */ if0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                switch (i132) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        if0 if0Var = this.b;
                        gf0 gf0Var22 = if0Var.v;
                        if (if0Var.R <= 0 || if0Var.N == null) {
                            if0Var.e0 = true;
                            gf0Var22.invalidate();
                            gf0Var22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                            int i152 = if0Var.c0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                                    if0Var.V = false;
                                    if0Var.v();
                                    if0Var.e0 = false;
                                    if0Var.x();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    gf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    gf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", if0Var.b);
                                bundle.putString("ephone", if0Var.e);
                                bundle.putString("phoneFormated", if0Var.d);
                                bundle.putInt("prevType", if0Var.b0);
                                if0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = if0Var.d;
                                tL_auth_resendCode.phone_code_hash = if0Var.c;
                                i142 = ((org.telegram.ui.ActionBar.o2) if0Var.o0).currentAccount;
                                ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ze0(if0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        if0 if0Var2 = this.b;
                        if0Var2.getClass();
                        try {
                            if0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(if0Var2.j0)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        addView(p2Var2, i7.f6.t(-2, -2, 1, 0, 18, 0, 0));
        p2Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.y = frameLayout42;
        gf0 gf0Var3 = new gf0(this, context, 0);
        this.v = gf0Var3;
        gf0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i122, false));
        gf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        gf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        gf0Var3.setTextSize(1, 15.0f);
        gf0Var3.setGravity(51);
        final int i142 = 1;
        gf0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cf0
            public final /* synthetic */ if0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1422;
                switch (i142) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        if0 if0Var = this.b;
                        gf0 gf0Var22 = if0Var.v;
                        if (if0Var.R <= 0 || if0Var.N == null) {
                            if0Var.e0 = true;
                            gf0Var22.invalidate();
                            gf0Var22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                            int i152 = if0Var.c0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(if0Var, NotificationCenter.didReceiveSmsCode);
                                    if0Var.V = false;
                                    if0Var.v();
                                    if0Var.e0 = false;
                                    if0Var.x();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    gf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    gf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", if0Var.b);
                                bundle.putString("ephone", if0Var.e);
                                bundle.putString("phoneFormated", if0Var.d);
                                bundle.putInt("prevType", if0Var.b0);
                                if0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = if0Var.d;
                                tL_auth_resendCode.phone_code_hash = if0Var.c;
                                i1422 = ((org.telegram.ui.ActionBar.o2) if0Var.o0).currentAccount;
                                ConnectionsManager.getInstance(i1422).sendRequest(tL_auth_resendCode, new ze0(if0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        if0 if0Var2 = this.b;
                        if0Var2.getClass();
                        try {
                            if0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(if0Var2.j0)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        frameLayout42.addView(gf0Var3, i7.f6.e(-2, -2, 49));
        od0 od0Var2 = new od0(context, 1);
        this.w = od0Var2;
        if (i10 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.A = textView72;
        textView72.setLineSpacing(b.e(2.0f, R.string.WrongCode, textView72), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        od0Var2.addView(textView72, i7.f6.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        oc.i.K1(od0Var2);
        if (i10 == 15) {
        }
    }

    public static /* synthetic */ void o(if0 if0Var, Context context) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(if0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str);
            sb2.append(if0Var.o0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(i10);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(if0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(if0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                        completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                        completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList != null) {
                        for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str2 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb3.append(str2);
                                sb3.append(".Phone: ");
                                sb3.append(number);
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".MCC: ");
                                sb3.append(subscriptionInfo.getMcc());
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".MNC: ");
                                sb3.append(subscriptionInfo.getMnc());
                                sb3.append("\n");
                                sb3.append(str2);
                                sb3.append(".Carrier: ");
                                sb3.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                                sb3.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb3.append("SIM0.Phone: ");
                            sb3.append(line1Number);
                            sb3.append("\n");
                            sb3.append("SIM0.MCC: unknown\n");
                            sb3.append("SIM0.MNC: unknown\n");
                            sb3.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb3.append("Signal: ");
                        sb3.append(signalStrength.getLevel());
                        sb3.append("/4\n");
                    } else {
                        sb3.append("Signal: unknown\n");
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            sb3.append(AndroidUtilities.isWifiEnabled(context));
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            sb3.append(AndroidUtilities.isInAirplaneMode(context));
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(BuildVars.APP_ID);
            sb3.append("\n");
            int i11 = packageInfo.versionCode % 10;
            String str3 = (i11 == 1 || i11 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb3.append("App version: ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(str3);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(if0Var.o0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(if0Var.a0)) {
                sb3.append("Error: ");
                sb3.append(if0Var.a0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            if0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            if0Var.o0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.xi0 xi0Var) {
        if (xi0Var != null) {
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Phone");
            xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        gf0 gf0Var = this.x;
        if (gf0Var == null) {
            return;
        }
        float f9 = z10 ? 1.0f : 0.0f;
        if (gf0Var.getAlpha() != f9) {
            gf0Var.animate().cancel();
            gf0Var.animate().alpha(f9).setDuration(150L).start();
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.xi0 xi0Var = this.J;
        if (xi0Var == null) {
            this.o0.n1(i10, true);
            return;
        }
        if (this.M) {
            return;
        }
        this.M = true;
        org.telegram.ui.Components.xi0 xi0Var2 = this.a;
        if (xi0Var2.X != xi0Var2.e[0] - 1) {
            xi0Var2.q0 = new af0(this, i10, 0);
            return;
        }
        xi0Var.q0 = new ue0(this, 3);
        org.telegram.ui.Components.aj0 aj0Var = this.s;
        aj0Var.setAutoRepeat(false);
        xi0Var.L(0, false, false);
        aj0Var.setAnimation(xi0Var);
        aj0Var.d();
    }

    @Override // org.telegram.ui.Components.mv0
    public final boolean a() {
        return this.b0 != 3;
    }

    @Override // org.telegram.ui.Components.mv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.mv0
    public final boolean c(boolean z10) {
        int i10;
        fg0 fg0Var = this.o0;
        int i11 = 0;
        if (fg0Var.B != 0) {
            fg0Var.finishFragment();
            return false;
        }
        int i12 = this.d0;
        if (i12 != 0) {
            fg0Var.u1(i12, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new we0(this, i11));
            fg0Var.showDialog(c2Var);
            return false;
        }
        this.W = false;
        z(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new lh.o5(14), 10);
        w();
        v();
        this.D = null;
        int i13 = this.b0;
        if (i13 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        return true;
    }

    @Override // org.telegram.ui.Components.mv0
    public final void d() {
        this.W = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.V) {
            sr srVar = this.f;
            if (srVar.f == null) {
                return;
            }
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                srVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.f0, str)) {
                    if (!this.f0.equals("*")) {
                        this.h0 = str;
                        AndroidUtilities.endIncomingCall();
                    }
                    h(str);
                    CallReceiver.clearLastCall();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void f() {
        int i10 = this.b0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        w();
        v();
    }

    @Override // org.telegram.ui.Components.mv0
    public final void g() {
        Bundle bundle;
        this.e0 = false;
        this.W = false;
        if (this.d0 == 0 || (bundle = this.D) == null) {
            return;
        }
        bundle.putInt("timeout", this.R);
    }

    @Override // org.telegram.ui.Components.mv0
    public String getHeaderName() {
        int i10 = this.b0;
        return (i10 == 3 || i10 == 11) ? this.b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override // org.telegram.ui.Components.mv0
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        fg0 fg0Var = this.o0;
        int i13 = fg0Var.a;
        if (i13 == 11) {
            if (this.W) {
                return;
            }
        } else {
            if (this.W) {
                return;
            }
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        }
        sr srVar = this.f;
        if (str == null) {
            str = srVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            fg0.U0(fg0Var, srVar, false);
            return;
        }
        int i15 = fg0Var.a;
        if (i15 < 1 || i15 > 4 || !srVar.e) {
            this.W = true;
            int i16 = this.b0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            int i17 = fg0Var.B;
            if (i17 == 1) {
                this.d = fg0Var.C;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                w();
                srVar.e = true;
                ur[] urVarArr = srVar.f;
                int length = urVarArr.length;
                while (i14 < length) {
                    urVarArr[i14].j(0.0f);
                    i14++;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new u80(6, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                w();
                srVar.e = true;
                ur[] urVarArr2 = srVar.f;
                int length2 = urVarArr2.length;
                while (i14 < length2) {
                    urVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i11).sendRequest(changephone, new o(this, 13), 2));
                fg0Var.v1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            w();
            srVar.e = true;
            ur[] urVarArr3 = srVar.f;
            int length3 = urVarArr3.length;
            while (i14 < length3) {
                urVarArr3[i14].j(0.0f);
                i14++;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new ve0(this, tL_auth_signIn, 0), 10));
            fg0Var.v1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void j() {
        org.telegram.ui.Components.xi0 xi0Var = this.a;
        if (xi0Var != null) {
            xi0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ue0(this, 0), fg0.p0);
    }

    @Override // org.telegram.ui.Components.mv0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.b0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.h0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            sr srVar = this.f;
            if (srVar.f != null) {
                srVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.R = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.P = i12;
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i10 = this.b0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.h0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.D != null) {
            bundle.putBundle(j7.l1.k(i10, "smsview_params_"), this.D);
        }
        int i11 = this.R;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.P;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x049b, code lost:
    
        if (r2 == 16) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0332  */
    @Override // org.telegram.ui.Components.mv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        float f9;
        int i10;
        CharSequence charSequence;
        SpannableStringBuilder replaceTags;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        String string;
        int i17 = 0;
        int i18 = 8;
        if (bundle == null) {
            if (this.k0 == null || this.l0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            gf0 gf0Var = this.x;
            if (gf0Var != null) {
                gf0Var.setVisibility(0);
                this.x.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                int i19 = this.c0;
                this.x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i19 == 17 ? R.string.ReturnEnteringPhrase : i19 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.V = true;
        int i20 = this.b0;
        if (i20 == 15) {
            f9 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f9 = 1.0f;
            if (i20 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i20 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new ef0(i17));
                }
            }
        }
        this.D = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.R = bundle.getInt("timeout");
        this.P = (int) (System.currentTimeMillis() / 1000);
        this.c0 = bundle.getInt("nextType");
        this.f0 = bundle.getString("pattern");
        this.g0 = bundle.getString("prefix");
        this.i0 = bundle.getInt("length");
        this.d0 = bundle.getInt("prevType", 0);
        if (this.i0 == 0) {
            this.i0 = 5;
        }
        this.j0 = bundle.getString("url");
        this.k0 = null;
        this.l0 = null;
        this.f.b(this.i0, this.b0);
        for (ur urVar : this.f.f) {
            urVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            urVar.addTextChangedListener(new p0(this, 9));
            urVar.setOnFocusChangeListener(new kd(this, i18));
        }
        int i21 = this.d0;
        if (i21 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f9)));
        } else if (i21 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f9)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = qe.b.c().b(this.b);
        if (this.o0.i1()) {
            replaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, qe.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) replaceTags, '*');
            int lastIndexOf = TextUtils.lastIndexOf(replaceTags, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                replaceTags.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                replaceTags.replace(indexOf, indexOf + 1, (CharSequence) "");
                replaceTags.setSpan(new org.telegram.ui.Components.a51("tg://settings/change_number", (org.telegram.ui.Components.h01) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            int i22 = this.b0;
            if (i22 == 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(b10)));
            } else if (i22 == 2) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(b10)));
            } else if (i22 == 3) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(b10)));
            } else {
                if (i22 != 4) {
                    if (i22 == 15) {
                        i10 = 4;
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(b10)));
                    } else {
                        i10 = 4;
                        charSequence = "";
                    }
                    this.n.setText(charSequence);
                    i11 = this.b0;
                    if (i11 != 15) {
                        if (i11 == 1) {
                            int i23 = this.c0;
                            if (i23 == 3 || i23 == i10 || i23 == 11) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                            } else if (i23 == 15) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                            } else if (i23 == 0) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                            } else {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                            }
                        } else {
                            this.x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                        }
                    }
                    if (this.b0 == 3) {
                        fg0.T0(this.o0, this.f.f[0]);
                        this.f.f[0].requestFocus();
                    } else {
                        AndroidUtilities.hideKeyboard(this.f.f[0]);
                    }
                    w();
                    v();
                    this.T = System.currentTimeMillis();
                    i12 = this.b0;
                    if (i12 != 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        gf0 gf0Var2 = this.x;
                        if (gf0Var2 != null) {
                            gf0Var2.setVisibility(0);
                        }
                    } else if (i12 == 3) {
                        int i24 = this.c0;
                        if (i24 == i10 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.x.setVisibility(8);
                            int i25 = this.c0;
                            if (i25 == i10 || i25 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i25 == 2 || i25 == 17 || i25 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                        } else {
                            this.v.setVisibility(8);
                        }
                        String obtainLoginPhoneCall = z10 ? AndroidUtilities.obtainLoginPhoneCall(this.f0) : null;
                        if (obtainLoginPhoneCall != null) {
                            h(obtainLoginPhoneCall);
                        } else {
                            String str2 = this.h0;
                            if (str2 != null) {
                                h(str2);
                            } else {
                                int i26 = this.c0;
                                if (i26 == i10 || i26 == 2 || i26 == 17 || i26 == 16 || i26 == 11) {
                                    t();
                                }
                            }
                        }
                    } else {
                        if (i12 == 2) {
                            int i27 = this.c0;
                            if (i27 != 2) {
                                i16 = 17;
                                i15 = 16;
                                if (i27 != 17 && i27 != 16 && i27 != i10 && i27 != 3) {
                                    i10 = 4;
                                }
                            } else {
                                i15 = 16;
                                i16 = 17;
                            }
                            if (i27 == 2 || i27 == i16 || i27 == i15) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.R < 1000);
                            this.v.setVisibility(this.R < 1000 ? 8 : 0);
                            gf0 gf0Var3 = this.x;
                            if (gf0Var3 != null) {
                                gf0Var3.setVisibility(this.R < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            String string2 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string2 + "|") && !this.o0.x) {
                                    str = string.substring(string.indexOf(124) + 1);
                                    if (str == null) {
                                        this.f.setCode(str);
                                        h(null);
                                    } else {
                                        t();
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        if (i12 == i10) {
                            int i28 = this.c0;
                            if (i28 != 2) {
                                i14 = 17;
                                i13 = (i28 == 17 || i28 == 11) ? 16 : 16;
                            } else {
                                i13 = 16;
                                i14 = 17;
                            }
                            if (i28 == 2 || i28 == i14 || i28 == i13) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.R < 1000);
                            this.v.setVisibility(this.R < 1000 ? 8 : 0);
                            gf0 gf0Var4 = this.x;
                            if (gf0Var4 != null) {
                                gf0Var4.setVisibility(this.R < 1000 ? 0 : 8);
                            }
                            t();
                        }
                        if (i12 == 11) {
                            int i29 = this.c0;
                            if (i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                                setProblemTextVisible(false);
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                int i30 = this.c0;
                                if (i30 == 4 || i30 == 11) {
                                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                } else if (i30 == 2 || i30 == 17 || i30 == 16) {
                                    this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                t();
                            }
                        } else {
                            this.v.setVisibility(8);
                            gf0 gf0Var5 = this.x;
                            if (gf0Var5 != null) {
                                gf0Var5.setVisibility(0);
                            }
                            setProblemTextVisible(false);
                            s();
                        }
                    }
                    if (this.b0 != 11) {
                        String str3 = this.g0;
                        for (int i31 = 0; i31 < this.i0; i31++) {
                            str3 = u3.c.k(str3, "0");
                        }
                        String b11 = qe.b.c().b("+" + str3);
                        for (int i32 = 0; i32 < this.i0; i32++) {
                            int lastIndexOf2 = b11.lastIndexOf("0");
                            if (lastIndexOf2 >= 0) {
                                b11 = b11.substring(0, lastIndexOf2);
                            }
                        }
                        this.E.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
                        return;
                    }
                    return;
                }
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(b10)));
            }
        }
        charSequence = replaceTags;
        i10 = 4;
        this.n.setText(charSequence);
        i11 = this.b0;
        if (i11 != 15) {
        }
        if (this.b0 == 3) {
        }
        w();
        v();
        this.T = System.currentTimeMillis();
        i12 = this.b0;
        if (i12 != 1) {
        }
        if (this.b0 != 11) {
        }
    }

    @Override // org.telegram.ui.Components.mv0
    public final void n() {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, this.o0.i1() ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = this.b0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.g6.y6;
            this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.H.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.I.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        r(this.a);
        r(this.J);
        r(this.K);
        r(this.L);
        sr srVar = this.f;
        if (srVar != null) {
            srVar.invalidate();
        }
        gf0 gf0Var = this.v;
        Integer num = (Integer) gf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.g6.D6);
        }
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, num.intValue(), false));
        if (i11 != 15) {
            this.x.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ur[] urVarArr;
        super.onConfigurationChanged(configuration);
        sr srVar = this.f;
        if (srVar == null || (urVarArr = srVar.f) == null) {
            return;
        }
        for (ur urVar : urVarArr) {
            urVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.n0);
    }

    public final void q(Runnable runnable) {
        if (this.b0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            sr srVar = this.f;
            if (i10 >= srVar.f.length) {
                srVar.postDelayed(new x60(29, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                srVar.postDelayed(new af0(this, i10, 2), i10 * 75);
                i10++;
            }
        }
    }

    public final void s() {
        if (this.O != null) {
            return;
        }
        this.S = 15000;
        int i10 = this.R;
        if (i10 > 15000) {
            this.S = i10;
        }
        this.O = new Timer();
        this.U = System.currentTimeMillis();
        this.O.schedule(new nh.g2(this, 2), 0L, 1000L);
    }

    public final void t() {
        if (this.N != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        gf0 gf0Var = this.v;
        gf0Var.setTextColor(w02);
        gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new hf0(this), 0L, 1000L);
    }

    public final void v() {
        try {
            synchronized (this.Q) {
                try {
                    Timer timer = this.O;
                    if (timer != null) {
                        timer.cancel();
                        this.O = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void w() {
        gf0 gf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.Q) {
                try {
                    Timer timer = this.N;
                    if (timer != null) {
                        timer.cancel();
                        this.N = null;
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void x() {
        int i10;
        if (this.W || this.e0) {
            return;
        }
        fg0 fg0Var = this.o0;
        if (fg0Var.k0) {
            return;
        }
        this.e0 = true;
        this.v.invalidate();
        this.x.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.b0);
        this.W = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        A(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ze0(this, bundle, 1), 10));
    }

    public final void y() {
        sr srVar = this.f;
        try {
            srVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            ur[] urVarArr = srVar.f;
            if (i10 >= urVarArr.length) {
                break;
            }
            urVarArr[i10].setText("");
            srVar.f[i10].i(1.0f);
            i10++;
        }
        od0 od0Var = this.w;
        if (od0Var.getCurrentView() != this.A) {
            od0Var.showNext();
        }
        srVar.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(srVar, this.b0 == 11 ? 3.5f : 10.0f, new ue0(this, 7));
        ue0 ue0Var = this.n0;
        removeCallbacks(ue0Var);
        postDelayed(ue0Var, 5000L);
        this.m0 = true;
    }

    public final void z(boolean z10) {
        if (this.J == null) {
            this.o0.k1(z10, true);
            return;
        }
        if (this.M) {
            this.M = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.xi0 xi0Var = this.K;
            xi0Var.I(0);
            xi0Var.P(xi0Var.e[0] - 1, new ue0(this, 1));
        }
    }
}
