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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jf0 extends org.telegram.ui.Components.cv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int p0 = 0;
    public final TextView A;
    public final LinearLayout B;
    public final org.telegram.ui.Components.pi0 C;
    public Bundle D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final org.telegram.ui.Components.mi0 J;
    public final org.telegram.ui.Components.mi0 K;
    public final org.telegram.ui.Components.mi0 L;
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
    public final org.telegram.ui.Components.mi0 a;
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
    public final org.telegram.ui.Components.voip.m2 h;
    public String h0;
    public int i0;
    public String j0;
    public Bundle k0;
    public TLRPC.TL_auth_sentCode l0;
    public boolean m0;
    public final TextView n;
    public final ve0 n0;
    public final /* synthetic */ fg0 o0;
    public final TextView r;
    public final org.telegram.ui.Components.pi0 s;
    public final hf0 v;
    public final od0 w;
    public final hf0 x;
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
    public jf0(fg0 fg0Var, Context context, int i9) {
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
        this.n0 = new ve0(this, 2);
        this.b0 = i9;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        j3.r0.u(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = fg0Var.B != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i9 == 11) {
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
            addView(frameLayout, g7.e6.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, g7.e6.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.F = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.l0.m(R.string.MissedCallDescriptionSubtitle, textView3);
            addView(textView3, g7.e6.t(-1, -2, 49, 36, 16, 36, 0));
            gf0 gf0Var = new gf0(this, context, 0);
            this.f = gf0Var;
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            TextView textView4 = new TextView(context);
            this.E = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f10.addView(textView4, g7.e6.t(-2, -1, 16, 0, 0, 4, 0));
            f10.addView(gf0Var, g7.e6.n(-2, -1));
            addView(f10, g7.e6.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.G = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.l0.m(R.string.MissedCallDescriptionSubtitle2, textView5);
            addView(textView5, g7.e6.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i9 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, g7.e6.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, g7.e6.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, g7.e6.e(-2, -2, 1));
                org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
                this.s = pi0Var;
                int i10 = R.raw.phone_flash_call;
                org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i10, String.valueOf(i10), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.a = mi0Var;
                pi0Var.setAnimation(mi0Var);
                frameLayout3.addView(pi0Var, g7.e6.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, g7.e6.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i9 != 11) {
                    gf0 gf0Var2 = new gf0(this, context, 1);
                    this.f = gf0Var2;
                    addView(gf0Var2, g7.e6.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i9 == 3) {
                    this.f.setVisibility(8);
                }
                org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(fg0Var, context);
                this.h = m2Var;
                int i11 = org.telegram.ui.ActionBar.f6.I6;
                m2Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                m2Var.setTextColor(fg0Var.getThemedColor(i11));
                m2Var.setTextSize(1, 14.0f);
                m2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                m2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i12 = 0;
                m2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef0
                    public final /* synthetic */ jf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                jf0 jf0Var = this.b;
                                hf0 hf0Var = jf0Var.v;
                                if (jf0Var.R <= 0 || jf0Var.N == null) {
                                    jf0Var.e0 = true;
                                    hf0Var.invalidate();
                                    hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                    int i14 = jf0Var.c0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                                            jf0Var.V = false;
                                            jf0Var.v();
                                            jf0Var.e0 = false;
                                            jf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            hf0Var.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            hf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", jf0Var.b);
                                        bundle.putString("ephone", jf0Var.e);
                                        bundle.putString("phoneFormated", jf0Var.d);
                                        bundle.putInt("prevType", jf0Var.b0);
                                        jf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = jf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = jf0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.o2) jf0Var.o0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new af0(jf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                jf0 jf0Var2 = this.b;
                                jf0Var2.getClass();
                                try {
                                    jf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jf0Var2.j0)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                addView(m2Var, g7.e6.t(-2, -2, 1, 0, 18, 0, 0));
                m2Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.y = frameLayout4;
                hf0 hf0Var = new hf0(this, context, 0);
                this.v = hf0Var;
                hf0Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                hf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                hf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                hf0Var.setTextSize(1, 15.0f);
                hf0Var.setGravity(51);
                final int i13 = 1;
                hf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef0
                    public final /* synthetic */ jf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i132;
                        switch (i13) {
                            case 0:
                                this.b.c(true);
                                break;
                            case 1:
                                jf0 jf0Var = this.b;
                                hf0 hf0Var2 = jf0Var.v;
                                if (jf0Var.R <= 0 || jf0Var.N == null) {
                                    jf0Var.e0 = true;
                                    hf0Var2.invalidate();
                                    hf0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                    int i14 = jf0Var.c0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                                            jf0Var.V = false;
                                            jf0Var.v();
                                            jf0Var.e0 = false;
                                            jf0Var.x();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            hf0Var2.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            hf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", jf0Var.b);
                                        bundle.putString("ephone", jf0Var.e);
                                        bundle.putString("phoneFormated", jf0Var.d);
                                        bundle.putInt("prevType", jf0Var.b0);
                                        jf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = jf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = jf0Var.c;
                                        i132 = ((org.telegram.ui.ActionBar.o2) jf0Var.o0).currentAccount;
                                        ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new af0(jf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                jf0 jf0Var2 = this.b;
                                jf0Var2.getClass();
                                try {
                                    jf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jf0Var2.j0)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                frameLayout4.addView(hf0Var, g7.e6.e(-2, -2, 49));
                od0 od0Var = new od0(context, 1);
                this.w = od0Var;
                if (i9 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.xs.e;
                    loadAnimation.setInterpolator(interpolator);
                    od0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    od0Var.setOutAnimation(loadAnimation2);
                    hf0 hf0Var2 = new hf0(this, context, 1);
                    this.x = hf0Var2;
                    hf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    hf0Var2.setTextSize(1, 15.0f);
                    hf0Var2.setGravity(49);
                    hf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout4.addView(hf0Var2, g7.e6.e(-1, -2, 17));
                    od0Var.addView(frameLayout4, g7.e6.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.gr.f;
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
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wh, false);
                    int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Q9, false);
                    linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, w03, w03));
                    final int i14 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef0
                        public final /* synthetic */ jf0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            switch (i14) {
                                case 0:
                                    this.b.c(true);
                                    break;
                                case 1:
                                    jf0 jf0Var = this.b;
                                    hf0 hf0Var22 = jf0Var.v;
                                    if (jf0Var.R <= 0 || jf0Var.N == null) {
                                        jf0Var.e0 = true;
                                        hf0Var22.invalidate();
                                        hf0Var22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                                        int i142 = jf0Var.c0;
                                        if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                            if (i142 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                NotificationCenter.getGlobalInstance().removeObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                                                jf0Var.V = false;
                                                jf0Var.v();
                                                jf0Var.e0 = false;
                                                jf0Var.x();
                                                break;
                                            }
                                        } else {
                                            if (i142 == 4 || i142 == 11) {
                                                hf0Var22.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                hf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", jf0Var.b);
                                            bundle.putString("ephone", jf0Var.e);
                                            bundle.putString("phoneFormated", jf0Var.d);
                                            bundle.putInt("prevType", jf0Var.b0);
                                            jf0Var.s();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = jf0Var.d;
                                            tL_auth_resendCode.phone_code_hash = jf0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.o2) jf0Var.o0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new af0(jf0Var, bundle, 0), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    jf0 jf0Var2 = this.b;
                                    jf0Var2.getClass();
                                    try {
                                        jf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jf0Var2.j0)));
                                        break;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                            }
                        }
                    });
                    od0Var.addView(linearLayout2, g7.e6.c(52.0f, -1));
                    org.telegram.ui.Components.pi0 pi0Var2 = new org.telegram.ui.Components.pi0(context);
                    this.C = pi0Var2;
                    pi0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(pi0Var2, g7.e6.t(36, 36, 16, 0, 0, 2, 0));
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
                textView7.setLineSpacing(org.telegram.ui.Cells.j2.c(2.0f, R.string.WrongCode, textView7), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                od0Var.addView(textView7, g7.e6.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(od0Var, g7.e6.d(i9 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, g7.e6.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(od0Var, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                org.telegram.ui.Cells.e3.s2(od0Var);
                if (i9 == 15) {
                    this.x.setOnClickListener(new v80(7, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, g7.e6.t(-2, -2, 49, 0, 16, 0, 0));
            int i15 = i9 == 1 ? 128 : 64;
            if (i9 == 1) {
                int i16 = R.raw.code_laptop;
                float f11 = i15;
                this.a = new org.telegram.ui.Components.mi0(i16, String.valueOf(i16), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
            } else {
                int i17 = R.raw.sms_incoming_info;
                float f12 = i15;
                this.a = new org.telegram.ui.Components.mi0(i17, String.valueOf(i17), AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                int i18 = R.raw.phone_stars_to_dots;
                this.J = new org.telegram.ui.Components.mi0(i18, String.valueOf(i18), AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                int i19 = R.raw.phone_dots;
                this.K = new org.telegram.ui.Components.mi0(i19, String.valueOf(i19), AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
                int i20 = R.raw.phone_dots_to_stars;
                this.L = new org.telegram.ui.Components.mi0(i20, String.valueOf(i20), AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), true, null);
            }
            org.telegram.ui.Components.pi0 pi0Var3 = new org.telegram.ui.Components.pi0(context);
            this.s = pi0Var3;
            pi0Var3.setAnimation(this.a);
            if (i9 == 1 && !AndroidUtilities.isSmallScreen()) {
                pi0Var3.setTranslationY(-AndroidUtilities.dp(24.0f));
            }
            frameLayout6.addView(pi0Var3, g7.e6.d(i15, i15, 51, 0.0f, 0.0f, 0.0f, (i9 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
            if (string == null) {
                string = LocaleController.getString(i9 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
            }
            textView2.setText(string);
            addView(textView2, g7.e6.t(-2, -2, 49, 0, 18, 0, 0));
            int i21 = i9 == 15 ? 16 : 0;
            addView(textView, g7.e6.t(-2, -2, 49, i21, 17, i21, 0));
        }
        viewGroup = null;
        if (i9 != 11) {
        }
        if (i9 == 3) {
        }
        org.telegram.ui.Components.voip.m2 m2Var2 = new org.telegram.ui.Components.voip.m2(fg0Var, context);
        this.h = m2Var2;
        int i112 = org.telegram.ui.ActionBar.f6.I6;
        m2Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i112, false));
        m2Var2.setTextColor(fg0Var.getThemedColor(i112));
        m2Var2.setTextSize(1, 14.0f);
        m2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i122 = 0;
        m2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef0
            public final /* synthetic */ jf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                switch (i122) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        jf0 jf0Var = this.b;
                        hf0 hf0Var22 = jf0Var.v;
                        if (jf0Var.R <= 0 || jf0Var.N == null) {
                            jf0Var.e0 = true;
                            hf0Var22.invalidate();
                            hf0Var22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                            int i142 = jf0Var.c0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                                    jf0Var.V = false;
                                    jf0Var.v();
                                    jf0Var.e0 = false;
                                    jf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    hf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    hf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", jf0Var.b);
                                bundle.putString("ephone", jf0Var.e);
                                bundle.putString("phoneFormated", jf0Var.d);
                                bundle.putInt("prevType", jf0Var.b0);
                                jf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = jf0Var.d;
                                tL_auth_resendCode.phone_code_hash = jf0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.o2) jf0Var.o0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new af0(jf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        jf0 jf0Var2 = this.b;
                        jf0Var2.getClass();
                        try {
                            jf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jf0Var2.j0)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        addView(m2Var2, g7.e6.t(-2, -2, 1, 0, 18, 0, 0));
        m2Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.y = frameLayout42;
        hf0 hf0Var3 = new hf0(this, context, 0);
        this.v = hf0Var3;
        hf0Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i112, false));
        hf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        hf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        hf0Var3.setTextSize(1, 15.0f);
        hf0Var3.setGravity(51);
        final int i132 = 1;
        hf0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ef0
            public final /* synthetic */ jf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1322;
                switch (i132) {
                    case 0:
                        this.b.c(true);
                        break;
                    case 1:
                        jf0 jf0Var = this.b;
                        hf0 hf0Var22 = jf0Var.v;
                        if (jf0Var.R <= 0 || jf0Var.N == null) {
                            jf0Var.e0 = true;
                            hf0Var22.invalidate();
                            hf0Var22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                            int i142 = jf0Var.c0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(jf0Var, NotificationCenter.didReceiveSmsCode);
                                    jf0Var.V = false;
                                    jf0Var.v();
                                    jf0Var.e0 = false;
                                    jf0Var.x();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    hf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    hf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", jf0Var.b);
                                bundle.putString("ephone", jf0Var.e);
                                bundle.putString("phoneFormated", jf0Var.d);
                                bundle.putInt("prevType", jf0Var.b0);
                                jf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = jf0Var.d;
                                tL_auth_resendCode.phone_code_hash = jf0Var.c;
                                i1322 = ((org.telegram.ui.ActionBar.o2) jf0Var.o0).currentAccount;
                                ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new af0(jf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        jf0 jf0Var2 = this.b;
                        jf0Var2.getClass();
                        try {
                            jf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jf0Var2.j0)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        frameLayout42.addView(hf0Var3, g7.e6.e(-2, -2, 49));
        od0 od0Var2 = new od0(context, 1);
        this.w = od0Var2;
        if (i9 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.A = textView72;
        textView72.setLineSpacing(org.telegram.ui.Cells.j2.c(2.0f, R.string.WrongCode, textView72), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        od0Var2.addView(textView72, g7.e6.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        org.telegram.ui.Cells.e3.s2(od0Var2);
        if (i9 == 15) {
        }
    }

    public static /* synthetic */ void o(jf0 jf0Var, Context context) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str);
            sb2.append(jf0Var.o0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i9 = Build.VERSION.SDK_INT;
            sb3.append(i9);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(jf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i9 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(jf0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i9 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i9 >= 28) {
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
            int i10 = packageInfo.versionCode % 10;
            String str3 = (i10 == 1 || i10 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb3.append("App version: ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(str3);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(jf0Var.o0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(jf0Var.a0)) {
                sb3.append("Error: ");
                sb3.append(jf0Var.a0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            jf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            jf0Var.o0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.mi0 mi0Var) {
        if (mi0Var != null) {
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), "Bubble");
            int i9 = org.telegram.ui.ActionBar.f6.G6;
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i9, false), "Phone");
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i9, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        hf0 hf0Var = this.x;
        if (hf0Var == null) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (hf0Var.getAlpha() != f10) {
            hf0Var.animate().cancel();
            hf0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    public final void A(int i9) {
        org.telegram.ui.Components.mi0 mi0Var = this.J;
        if (mi0Var == null) {
            this.o0.n1(i9, true);
            return;
        }
        if (this.M) {
            return;
        }
        this.M = true;
        org.telegram.ui.Components.mi0 mi0Var2 = this.a;
        if (mi0Var2.X != mi0Var2.e[0] - 1) {
            mi0Var2.q0 = new bf0(this, i9, 0);
            return;
        }
        mi0Var.q0 = new ve0(this, 3);
        org.telegram.ui.Components.pi0 pi0Var = this.s;
        pi0Var.setAutoRepeat(false);
        mi0Var.L(0, false, false);
        pi0Var.setAnimation(mi0Var);
        pi0Var.d();
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean a() {
        return this.b0 != 3;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean c(boolean z10) {
        int i9;
        fg0 fg0Var = this.o0;
        int i10 = 0;
        if (fg0Var.B != 0) {
            fg0Var.finishFragment();
            return false;
        }
        int i11 = this.d0;
        if (i11 != 0) {
            fg0Var.u1(i11, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new xe0(this, i10));
            fg0Var.showDialog(c2Var);
            return false;
        }
        this.W = false;
        z(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_cancelCode, new ih.q5(14), 10);
        w();
        v();
        this.D = null;
        int i12 = this.b0;
        if (i12 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.W = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (this.V) {
            sr srVar = this.f;
            if (srVar.f == null) {
                return;
            }
            if (i9 == NotificationCenter.didReceiveSmsCode) {
                srVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i9 == NotificationCenter.didReceiveCall) {
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

    @Override // org.telegram.ui.Components.cv0
    public final void f() {
        int i9 = this.b0;
        if (i9 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        w();
        v();
    }

    @Override // org.telegram.ui.Components.cv0
    public final void g() {
        Bundle bundle;
        this.e0 = false;
        this.W = false;
        if (this.d0 == 0 || (bundle = this.D) == null) {
            return;
        }
        bundle.putInt("timeout", this.R);
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        int i9 = this.b0;
        return (i9 == 3 || i9 == 11) ? this.b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        int i9;
        int i10;
        int i11;
        fg0 fg0Var = this.o0;
        int i12 = fg0Var.a;
        if (i12 == 11) {
            if (this.W) {
                return;
            }
        } else {
            if (this.W) {
                return;
            }
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        }
        sr srVar = this.f;
        if (str == null) {
            str = srVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            fg0.U0(fg0Var, srVar, false);
            return;
        }
        int i14 = fg0Var.a;
        if (i14 < 1 || i14 > 4 || !srVar.e) {
            this.W = true;
            int i15 = this.b0;
            if (i15 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i15 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            int i16 = fg0Var.B;
            if (i16 == 1) {
                this.d = fg0Var.C;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                w();
                srVar.e = true;
                vr[] vrVarArr = srVar.f;
                int length = vrVarArr.length;
                while (i13 < length) {
                    vrVarArr[i13].j(0.0f);
                    i13++;
                }
                i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i9).sendRequest(confirmphone, new v40(10, this, confirmphone), 2));
                return;
            }
            if (i16 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                w();
                srVar.e = true;
                vr[] vrVarArr2 = srVar.f;
                int length2 = vrVarArr2.length;
                while (i13 < length2) {
                    vrVarArr2[i13].j(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                A(ConnectionsManager.getInstance(i10).sendRequest(changephone, new m(this, 13), 2));
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
            vr[] vrVarArr3 = srVar.f;
            int length3 = vrVarArr3.length;
            while (i13 < length3) {
                vrVarArr3[i13].j(0.0f);
                i13++;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            A(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new we0(this, tL_auth_signIn, 0), 10));
            fg0Var.v1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        org.telegram.ui.Components.mi0 mi0Var = this.a;
        if (mi0Var != null) {
            mi0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ve0(this, 0), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i9 = this.b0;
        sb2.append(i9);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.h0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i9);
        if (string2 != null) {
            sr srVar = this.f;
            if (srVar.f != null) {
                srVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.R = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.P = i11;
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i9 = this.b0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i9, code);
        }
        String str = this.h0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.D != null) {
            bundle.putBundle(j3.r0.l(i9, "smsview_params_"), this.D);
        }
        int i10 = this.R;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.P;
        if (i11 != 0) {
            bundle.putInt("open", i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x049d, code lost:
    
        if (r2 == 16) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0334  */
    @Override // org.telegram.ui.Components.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        float f10;
        int i9;
        CharSequence charSequence;
        SpannableStringBuilder replaceTags;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        String string;
        int i16 = 8;
        if (bundle == null) {
            if (this.k0 == null || this.l0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            hf0 hf0Var = this.x;
            if (hf0Var != null) {
                hf0Var.setVisibility(0);
                this.x.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                int i17 = this.c0;
                this.x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i17 == 17 ? R.string.ReturnEnteringPhrase : i17 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.V = true;
        int i18 = this.b0;
        if (i18 == 15) {
            f10 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f10 = 1.0f;
            if (i18 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i18 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(28));
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
        for (vr vrVar : this.f.f) {
            vrVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            vrVar.addTextChangedListener(new o0(this, 9));
            vrVar.setOnFocusChangeListener(new ld(this, i16));
        }
        int i19 = this.d0;
        if (i19 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else if (i19 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = ne.b.c().b(this.b);
        if (this.o0.i1()) {
            replaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, ne.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) replaceTags, '*');
            int lastIndexOf = TextUtils.lastIndexOf(replaceTags, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                replaceTags.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                replaceTags.replace(indexOf, indexOf + 1, (CharSequence) "");
                replaceTags.setSpan(new org.telegram.ui.Components.p41("tg://settings/change_number", (org.telegram.ui.Components.vz0) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            int i20 = this.b0;
            if (i20 == 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(b10)));
            } else if (i20 == 2) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(b10)));
            } else if (i20 == 3) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(b10)));
            } else {
                if (i20 != 4) {
                    if (i20 == 15) {
                        i9 = 4;
                        charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(b10)));
                    } else {
                        i9 = 4;
                        charSequence = "";
                    }
                    this.n.setText(charSequence);
                    i10 = this.b0;
                    if (i10 != 15) {
                        if (i10 == 1) {
                            int i21 = this.c0;
                            if (i21 == 3 || i21 == i9 || i21 == 11) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                            } else if (i21 == 15) {
                                this.x.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                            } else if (i21 == 0) {
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
                    i11 = this.b0;
                    if (i11 != 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        hf0 hf0Var2 = this.x;
                        if (hf0Var2 != null) {
                            hf0Var2.setVisibility(0);
                        }
                    } else if (i11 == 3) {
                        int i22 = this.c0;
                        if (i22 == i9 || i22 == 2 || i22 == 17 || i22 == 16 || i22 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.x.setVisibility(8);
                            int i23 = this.c0;
                            if (i23 == i9 || i23 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i23 == 2 || i23 == 17 || i23 == 16) {
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
                                int i24 = this.c0;
                                if (i24 == i9 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11) {
                                    t();
                                }
                            }
                        }
                    } else {
                        if (i11 == 2) {
                            int i25 = this.c0;
                            if (i25 != 2) {
                                i15 = 17;
                                i14 = 16;
                                if (i25 != 17 && i25 != 16 && i25 != i9 && i25 != 3) {
                                    i9 = 4;
                                }
                            } else {
                                i14 = 16;
                                i15 = 17;
                            }
                            if (i25 == 2 || i25 == i15 || i25 == i14) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.R < 1000);
                            this.v.setVisibility(this.R < 1000 ? 8 : 0);
                            hf0 hf0Var3 = this.x;
                            if (hf0Var3 != null) {
                                hf0Var3.setVisibility(this.R < 1000 ? 0 : 8);
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
                        if (i11 == i9) {
                            int i26 = this.c0;
                            if (i26 != 2) {
                                i13 = 17;
                                i12 = (i26 == 17 || i26 == 11) ? 16 : 16;
                            } else {
                                i12 = 16;
                                i13 = 17;
                            }
                            if (i26 == 2 || i26 == i13 || i26 == i12) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            } else {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                            }
                            setProblemTextVisible(this.R < 1000);
                            this.v.setVisibility(this.R < 1000 ? 8 : 0);
                            hf0 hf0Var4 = this.x;
                            if (hf0Var4 != null) {
                                hf0Var4.setVisibility(this.R < 1000 ? 0 : 8);
                            }
                            t();
                        }
                        if (i11 == 11) {
                            int i27 = this.c0;
                            if (i27 == 4 || i27 == 2 || i27 == 17 || i27 == 16 || i27 == 11) {
                                setProblemTextVisible(false);
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                int i28 = this.c0;
                                if (i28 == 4 || i28 == 11) {
                                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                                    this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                t();
                            }
                        } else {
                            this.v.setVisibility(8);
                            hf0 hf0Var5 = this.x;
                            if (hf0Var5 != null) {
                                hf0Var5.setVisibility(0);
                            }
                            setProblemTextVisible(false);
                            s();
                        }
                    }
                    if (this.b0 != 11) {
                        String str3 = this.g0;
                        for (int i29 = 0; i29 < this.i0; i29++) {
                            str3 = ta.b.j(str3, "0");
                        }
                        String b11 = ne.b.c().b("+" + str3);
                        for (int i30 = 0; i30 < this.i0; i30++) {
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
        i9 = 4;
        this.n.setText(charSequence);
        i10 = this.b0;
        if (i10 != 15) {
        }
        if (this.b0 == 3) {
        }
        w();
        v();
        this.T = System.currentTimeMillis();
        i11 = this.b0;
        if (i11 != 1) {
        }
        if (this.b0 != 11) {
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, this.o0.i1() ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(w02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int i10 = this.b0;
        if (i10 == 11) {
            int i11 = org.telegram.ui.ActionBar.f6.y6;
            this.F.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.G.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.H.setColorFilter(new PorterDuffColorFilter(w03, mode));
            this.I.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), mode));
            this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        r(this.a);
        r(this.J);
        r(this.K);
        r(this.L);
        sr srVar = this.f;
        if (srVar != null) {
            srVar.invalidate();
        }
        hf0 hf0Var = this.v;
        Integer num = (Integer) hf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.f6.D6);
        }
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, num.intValue(), false));
        if (i10 != 15) {
            this.x.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        super.onConfigurationChanged(configuration);
        sr srVar = this.f;
        if (srVar == null || (vrVarArr = srVar.f) == null) {
            return;
        }
        for (vr vrVar : vrVarArr) {
            vrVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
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
        int i9 = 0;
        while (true) {
            sr srVar = this.f;
            if (i9 >= srVar.f.length) {
                srVar.postDelayed(new cf0(2, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                srVar.postDelayed(new bf0(this, i9, 2), i9 * 75);
                i9++;
            }
        }
    }

    public final void s() {
        if (this.O != null) {
            return;
        }
        this.S = 15000;
        int i9 = this.R;
        if (i9 > 15000) {
            this.S = i9;
        }
        this.O = new Timer();
        this.U = System.currentTimeMillis();
        this.O.schedule(new kh.j2(this, 3), 0L, 1000L);
    }

    public final void t() {
        if (this.N != null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        hf0 hf0Var = this.v;
        hf0Var.setTextColor(w02);
        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i9));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new if0(this), 0L, 1000L);
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
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void w() {
        hf0 hf0Var = this.v;
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i9));
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
        int i9;
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
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        A(ConnectionsManager.getInstance(i9).sendRequest(tL_auth_resendCode, new af0(this, bundle, 1), 10));
    }

    public final void y() {
        sr srVar = this.f;
        try {
            srVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i9 = 0;
        while (true) {
            vr[] vrVarArr = srVar.f;
            if (i9 >= vrVarArr.length) {
                break;
            }
            vrVarArr[i9].setText("");
            srVar.f[i9].i(1.0f);
            i9++;
        }
        od0 od0Var = this.w;
        if (od0Var.getCurrentView() != this.A) {
            od0Var.showNext();
        }
        srVar.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(srVar, this.b0 == 11 ? 3.5f : 10.0f, new ve0(this, 7));
        ve0 ve0Var = this.n0;
        removeCallbacks(ve0Var);
        postDelayed(ve0Var, 5000L);
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
            org.telegram.ui.Components.mi0 mi0Var = this.K;
            mi0Var.I(0);
            mi0Var.P(mi0Var.e[0] - 1, new ve0(this, 1));
        }
    }
}
