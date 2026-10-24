package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mf0 extends org.telegram.ui.Components.tw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int v0 = 0;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.bk0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.yj0 P;
    public final org.telegram.ui.Components.yj0 Q;
    public final org.telegram.ui.Components.yj0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.yj0 a;
    public int a0;
    public String b;
    public int b0;
    public String c;
    public double c0;
    public String d;
    public double d0;
    public String e;
    public boolean e0;
    public final sr f;
    public boolean f0;
    public String g0;
    public final gd0 h;
    public final int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public String l0;
    public String m0;
    public final TextView n;
    public String n0;
    public int o0;
    public String p0;
    public Bundle q0;
    public final TextView r;
    public TLRPC.TL_auth_sentCode r0;
    public final org.telegram.ui.Components.bk0 s;
    public boolean s0;
    public final ze0 t0;
    public final /* synthetic */ ig0 u0;
    public final kf0 v;
    public final qd0 w;
    public final kf0 x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x046d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mf0(ig0 ig0Var, Context context, int i10) {
        super(context);
        ViewGroup viewGroup;
        this.u0 = ig0Var;
        this.W = new Object();
        this.a0 = 60000;
        this.b0 = 15000;
        this.g0 = "";
        this.k0 = false;
        this.l0 = "*";
        this.m0 = "";
        this.t0 = new ze0(this, 2);
        this.h0 = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = ig0Var.F != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i10 == 11) {
            textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.L = imageView;
            ImageView imageView2 = new ImageView(context);
            this.M = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, w7.z5.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, w7.z5.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.J = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.v0.m(R.string.MissedCallDescriptionSubtitle, textView3);
            addView(textView3, w7.z5.t(-1, -2, 49, 36, 16, 36, 0));
            jf0 jf0Var = new jf0(this, context, 0);
            this.f = jf0Var;
            LinearLayout e = org.telegram.messenger.sl.e(context, 0);
            TextView textView4 = new TextView(context);
            this.I = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            e.addView(textView4, w7.z5.t(-2, -1, 16, 0, 0, 4, 0));
            e.addView(jf0Var, w7.z5.n(-2, -1));
            addView(e, w7.z5.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.K = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            org.telegram.messenger.v0.m(R.string.MissedCallDescriptionSubtitle2, textView5);
            addView(textView5, w7.z5.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, w7.z5.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, w7.z5.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, w7.z5.e(-2, -2, 1));
                org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                this.s = bk0Var;
                org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.phone_flash_call, AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.a = yj0Var;
                bk0Var.setAnimation(yj0Var);
                frameLayout3.addView(bk0Var, w7.z5.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i10 != 11) {
                    jf0 jf0Var2 = new jf0(this, context, 1);
                    this.f = jf0Var2;
                    addView(jf0Var2, w7.z5.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i10 == 3) {
                    this.f.setVisibility(8);
                }
                gd0 gd0Var = new gd0(ig0Var, context);
                this.h = gd0Var;
                int i11 = org.telegram.ui.ActionBar.k6.I6;
                org.telegram.ui.ActionBar.r6.I(gd0Var, i11, null);
                org.telegram.ui.ActionBar.r6.W(gd0Var, i11, ig0Var.getResourceProvider());
                gd0Var.setTextSize(1, 14.0f);
                gd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                gd0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i12 = 0;
                gd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gf0
                    public final /* synthetic */ mf0 b;

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
                                mf0 mf0Var = this.b;
                                kf0 kf0Var = mf0Var.v;
                                if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                                    mf0Var.k0 = true;
                                    kf0Var.invalidate();
                                    org.telegram.ui.ActionBar.r6.W(kf0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                    int i14 = mf0Var.i0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                            mf0Var.e0 = false;
                                            mf0Var.t();
                                            mf0Var.k0 = false;
                                            mf0Var.w();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            kf0Var.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            kf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", mf0Var.b);
                                        bundle.putString("ephone", mf0Var.e);
                                        bundle.putString("phoneFormated", mf0Var.d);
                                        bundle.putInt("prevType", mf0Var.h0);
                                        mf0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = mf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = mf0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.o2) mf0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mf0 mf0Var2 = this.b;
                                mf0Var2.getClass();
                                try {
                                    mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.p0)));
                                    break;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                        }
                    }
                });
                addView(gd0Var, w7.z5.t(-2, -2, 1, 0, 18, 0, 0));
                gd0Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.y = frameLayout4;
                kf0 kf0Var = new kf0(this, context, 0);
                this.v = kf0Var;
                org.telegram.ui.ActionBar.r6.I(kf0Var, i11, null);
                kf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                kf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                kf0Var.setTextSize(1, 15.0f);
                kf0Var.setGravity(51);
                final int i13 = 1;
                kf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gf0
                    public final /* synthetic */ mf0 b;

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
                                mf0 mf0Var = this.b;
                                kf0 kf0Var2 = mf0Var.v;
                                if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                                    mf0Var.k0 = true;
                                    kf0Var2.invalidate();
                                    org.telegram.ui.ActionBar.r6.W(kf0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                    int i14 = mf0Var.i0;
                                    if (i14 != 4 && i14 != 2 && i14 != 17 && i14 != 16 && i14 != 11 && i14 != 15) {
                                        if (i14 == 3) {
                                            AndroidUtilities.setWaitingForSms(false);
                                            NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                            mf0Var.e0 = false;
                                            mf0Var.t();
                                            mf0Var.k0 = false;
                                            mf0Var.w();
                                            break;
                                        }
                                    } else {
                                        if (i14 == 4 || i14 == 11) {
                                            kf0Var2.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            kf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", mf0Var.b);
                                        bundle.putString("ephone", mf0Var.e);
                                        bundle.putString("phoneFormated", mf0Var.d);
                                        bundle.putInt("prevType", mf0Var.h0);
                                        mf0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = mf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = mf0Var.c;
                                        i132 = ((org.telegram.ui.ActionBar.o2) mf0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                mf0 mf0Var2 = this.b;
                                mf0Var2.getClass();
                                try {
                                    mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.p0)));
                                    break;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                        }
                    }
                });
                frameLayout4.addView(kf0Var, w7.z5.e(-2, -2, 49));
                qd0 qd0Var = new qd0(context, 1);
                this.w = qd0Var;
                if (i10 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.st.e;
                    loadAnimation.setInterpolator(interpolator);
                    qd0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    qd0Var.setOutAnimation(loadAnimation2);
                    kf0 kf0Var2 = new kf0(this, context, 1);
                    this.x = kf0Var2;
                    kf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    kf0Var2.setTextSize(1, 15.0f);
                    kf0Var2.setGravity(49);
                    kf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    frameLayout4.addView(kf0Var2, w7.z5.e(-1, -2, 17));
                    qd0Var.addView(frameLayout4, w7.z5.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.bs.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    qd0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    qd0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.F = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    int dp = AndroidUtilities.dp(6.0f);
                    int i14 = org.telegram.ui.ActionBar.k6.Wh;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.k6.Q9;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                    org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x02, x03, x03);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
                    linearLayout2.setBackground(j02);
                    org.telegram.ui.ActionBar.r6.k(linearLayout2, j02, O, O2, null);
                    final int i16 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gf0
                        public final /* synthetic */ mf0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            switch (i16) {
                                case 0:
                                    this.b.c(true);
                                    break;
                                case 1:
                                    mf0 mf0Var = this.b;
                                    kf0 kf0Var22 = mf0Var.v;
                                    if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                                        mf0Var.k0 = true;
                                        kf0Var22.invalidate();
                                        org.telegram.ui.ActionBar.r6.W(kf0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                                        int i142 = mf0Var.i0;
                                        if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                            if (i142 == 3) {
                                                AndroidUtilities.setWaitingForSms(false);
                                                NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                                mf0Var.e0 = false;
                                                mf0Var.t();
                                                mf0Var.k0 = false;
                                                mf0Var.w();
                                                break;
                                            }
                                        } else {
                                            if (i142 == 4 || i142 == 11) {
                                                kf0Var22.setText(LocaleController.getString(R.string.Calling));
                                            } else {
                                                kf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", mf0Var.b);
                                            bundle.putString("ephone", mf0Var.e);
                                            bundle.putString("phoneFormated", mf0Var.d);
                                            bundle.putInt("prevType", mf0Var.h0);
                                            mf0Var.r();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = mf0Var.d;
                                            tL_auth_resendCode.phone_code_hash = mf0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.o2) mf0Var.u0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    mf0 mf0Var2 = this.b;
                                    mf0Var2.getClass();
                                    try {
                                        mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.p0)));
                                        break;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                            }
                        }
                    });
                    qd0Var.addView(linearLayout2, w7.z5.c(52.0f, -1));
                    org.telegram.ui.Components.bk0 bk0Var2 = new org.telegram.ui.Components.bk0(context);
                    this.G = bk0Var2;
                    bk0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(bk0Var2, w7.z5.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(LocaleController.getString(R.string.OpenFragment));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(AndroidUtilities.bold());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.E = textView7;
                textView7.setLineSpacing(org.telegram.ui.Cells.b1.e(2.0f, R.string.WrongCode, textView7), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                qd0Var.addView(textView7, w7.z5.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(qd0Var, w7.z5.d(i10 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, w7.z5.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(qd0Var, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                m.g3.p(qd0Var);
                if (i10 == 15) {
                    this.x.setOnClickListener(new ae0(1, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, w7.z5.t(-2, -2, 49, 0, 16, 0, 0));
            int i17 = i10 == 1 ? 128 : 64;
            if (i10 == 1) {
                float f7 = i17;
                this.a = new org.telegram.ui.Components.yj0(R.raw.code_laptop, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), true, null);
            } else {
                float f10 = i17;
                this.a = new org.telegram.ui.Components.yj0(R.raw.sms_incoming_info, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                this.P = new org.telegram.ui.Components.yj0(R.raw.phone_stars_to_dots, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                this.Q = new org.telegram.ui.Components.yj0(R.raw.phone_dots, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                this.R = new org.telegram.ui.Components.yj0(R.raw.phone_dots_to_stars, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
            }
            org.telegram.ui.Components.bk0 bk0Var3 = new org.telegram.ui.Components.bk0(context);
            this.s = bk0Var3;
            bk0Var3.setAnimation(this.a);
            if (i10 == 1 && !AndroidUtilities.isSmallScreen()) {
                bk0Var3.setTranslationY(-AndroidUtilities.dp(24.0f));
            }
            frameLayout6.addView(bk0Var3, w7.z5.d(i17, i17, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
            if (string == null) {
                string = LocaleController.getString(i10 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
            }
            textView2.setText(string);
            addView(textView2, w7.z5.t(-2, -2, 49, 0, 18, 0, 0));
            int i18 = i10 == 15 ? 16 : 0;
            addView(textView, w7.z5.t(-2, -2, 49, i18, 17, i18, 0));
        }
        viewGroup = null;
        if (i10 != 11) {
        }
        if (i10 == 3) {
        }
        gd0 gd0Var2 = new gd0(ig0Var, context);
        this.h = gd0Var2;
        int i112 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.ActionBar.r6.I(gd0Var2, i112, null);
        org.telegram.ui.ActionBar.r6.W(gd0Var2, i112, ig0Var.getResourceProvider());
        gd0Var2.setTextSize(1, 14.0f);
        gd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        gd0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i122 = 0;
        gd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gf0
            public final /* synthetic */ mf0 b;

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
                        mf0 mf0Var = this.b;
                        kf0 kf0Var22 = mf0Var.v;
                        if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                            mf0Var.k0 = true;
                            kf0Var22.invalidate();
                            org.telegram.ui.ActionBar.r6.W(kf0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                            int i142 = mf0Var.i0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                    mf0Var.e0 = false;
                                    mf0Var.t();
                                    mf0Var.k0 = false;
                                    mf0Var.w();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    kf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    kf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", mf0Var.b);
                                bundle.putString("ephone", mf0Var.e);
                                bundle.putString("phoneFormated", mf0Var.d);
                                bundle.putInt("prevType", mf0Var.h0);
                                mf0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = mf0Var.d;
                                tL_auth_resendCode.phone_code_hash = mf0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.o2) mf0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        mf0 mf0Var2 = this.b;
                        mf0Var2.getClass();
                        try {
                            mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.p0)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                }
            }
        });
        addView(gd0Var2, w7.z5.t(-2, -2, 1, 0, 18, 0, 0));
        gd0Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.y = frameLayout42;
        kf0 kf0Var3 = new kf0(this, context, 0);
        this.v = kf0Var3;
        org.telegram.ui.ActionBar.r6.I(kf0Var3, i112, null);
        kf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        kf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        kf0Var3.setTextSize(1, 15.0f);
        kf0Var3.setGravity(51);
        final int i132 = 1;
        kf0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gf0
            public final /* synthetic */ mf0 b;

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
                        mf0 mf0Var = this.b;
                        kf0 kf0Var22 = mf0Var.v;
                        if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                            mf0Var.k0 = true;
                            kf0Var22.invalidate();
                            org.telegram.ui.ActionBar.r6.W(kf0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                            int i142 = mf0Var.i0;
                            if (i142 != 4 && i142 != 2 && i142 != 17 && i142 != 16 && i142 != 11 && i142 != 15) {
                                if (i142 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                    mf0Var.e0 = false;
                                    mf0Var.t();
                                    mf0Var.k0 = false;
                                    mf0Var.w();
                                    break;
                                }
                            } else {
                                if (i142 == 4 || i142 == 11) {
                                    kf0Var22.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    kf0Var22.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", mf0Var.b);
                                bundle.putString("ephone", mf0Var.e);
                                bundle.putString("phoneFormated", mf0Var.d);
                                bundle.putInt("prevType", mf0Var.h0);
                                mf0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = mf0Var.d;
                                tL_auth_resendCode.phone_code_hash = mf0Var.c;
                                i1322 = ((org.telegram.ui.ActionBar.o2) mf0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i1322).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        mf0 mf0Var2 = this.b;
                        mf0Var2.getClass();
                        try {
                            mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.p0)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                }
            }
        });
        frameLayout42.addView(kf0Var3, w7.z5.e(-2, -2, 49));
        qd0 qd0Var2 = new qd0(context, 1);
        this.w = qd0Var2;
        if (i10 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.E = textView72;
        textView72.setLineSpacing(org.telegram.ui.Cells.b1.e(2.0f, R.string.WrongCode, textView72), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        qd0Var2.addView(textView72, w7.z5.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        m.g3.p(qd0Var2);
        if (i10 == 15) {
        }
    }

    public static /* synthetic */ void n(mf0 mf0Var, Context context) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mf0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str);
            sb2.append(mf0Var.u0.e ? " #paidauth" : "");
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
            sb3.append(mf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(mf0Var.getContext());
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
            } catch (Exception e) {
                FileLog.e(e);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
            sb3.append(mf0Var.u0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(mf0Var.g0)) {
                sb3.append("Error: ");
                sb3.append(mf0Var.g0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            mf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            mf0Var.u0.p1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void q(org.telegram.ui.Components.yj0 yj0Var) {
        if (yj0Var != null) {
            yj0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            yj0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i10, false), "Phone");
            yj0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i10, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        kf0 kf0Var = this.x;
        if (kf0Var == null) {
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (kf0Var.getAlpha() != f7) {
            kf0Var.animate().cancel();
            kf0Var.animate().alpha(f7).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean a() {
        return this.h0 != 3;
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean c(boolean z10) {
        int i10;
        ig0 ig0Var = this.u0;
        int i11 = 0;
        if (ig0Var.F != 0) {
            ig0Var.finishFragment();
            return false;
        }
        int i12 = this.j0;
        if (i12 != 0) {
            ig0Var.y1(i12, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new bf0(this, i11));
            ig0Var.showDialog(c2Var);
            return false;
        }
        this.f0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ci.d6(17), 10);
        u();
        t();
        this.H = null;
        int i13 = this.h0;
        if (i13 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i13 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.e0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final void d() {
        this.f0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.e0) {
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
                if (AndroidUtilities.checkPhonePattern(this.l0, str)) {
                    if (!this.l0.equals("*")) {
                        this.n0 = str;
                        AndroidUtilities.endIncomingCall();
                    }
                    h(str);
                    CallReceiver.clearLastCall();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void f() {
        int i10 = this.h0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.e0 = false;
        u();
        t();
    }

    @Override // org.telegram.ui.Components.tw0
    public final void g() {
        Bundle bundle;
        this.k0 = false;
        this.f0 = false;
        if (this.j0 == 0 || (bundle = this.H) == null) {
            return;
        }
        bundle.putInt("timeout", this.a0);
    }

    @Override // org.telegram.ui.Components.tw0
    public String getHeaderName() {
        int i10 = this.h0;
        return (i10 == 3 || i10 == 11) ? this.b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        ig0 ig0Var = this.u0;
        int i13 = ig0Var.a;
        if (i13 == 11) {
            if (this.f0) {
                return;
            }
        } else {
            if (this.f0) {
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
            ig0.W0(ig0Var, srVar, false);
            return;
        }
        int i15 = ig0Var.a;
        if (i15 < 1 || i15 > 4 || !srVar.e) {
            this.f0 = true;
            int i16 = this.h0;
            if (i16 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.e0 = false;
            int i17 = ig0Var.F;
            if (i17 == 1) {
                this.d = ig0Var.G;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                u();
                srVar.e = true;
                vr[] vrVarArr = srVar.f;
                int length = vrVarArr.length;
                while (i14 < length) {
                    vrVarArr[i14].j(0.0f);
                    i14++;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new a50(10, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                u();
                srVar.e = true;
                vr[] vrVarArr2 = srVar.f;
                int length2 = vrVarArr2.length;
                while (i14 < length2) {
                    vrVarArr2[i14].j(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new l(this, 14), 2));
                ig0Var.z1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            u();
            srVar.e = true;
            vr[] vrVarArr3 = srVar.f;
            int length3 = vrVarArr3.length;
            while (i14 < length3) {
                vrVarArr3[i14].j(0.0f);
                i14++;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
            z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new af0(this, tL_auth_signIn, 0), 10));
            ig0Var.z1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void j() {
        org.telegram.ui.Components.yj0 yj0Var = this.a;
        if (yj0Var != null) {
            yj0Var.M(0);
        }
        AndroidUtilities.runOnUIThread(new ze0(this, 0), ig0.x0);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.h0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.n0 = string;
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
            this.a0 = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.V = i12;
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i10 = this.h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(i2.o1.k(i10, "smsview_params_"), this.H);
        }
        int i11 = this.a0;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.V;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0498, code lost:
    
        if (r2 == 16) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032e  */
    @Override // org.telegram.ui.Components.tw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        float f7;
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
            if (this.q0 == null || this.r0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            kf0 kf0Var = this.x;
            if (kf0Var != null) {
                kf0Var.setVisibility(0);
                org.telegram.ui.ActionBar.r6.W(this.x, org.telegram.ui.ActionBar.k6.I6, null);
                int i19 = this.i0;
                this.x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i19 == 17 ? R.string.ReturnEnteringPhrase : i19 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.e0 = true;
        int i20 = this.h0;
        if (i20 == 15) {
            f7 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f7 = 1.0f;
            if (i20 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i20 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new if0(i17));
                }
            }
        }
        this.H = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.a0 = bundle.getInt("timeout");
        this.V = (int) (System.currentTimeMillis() / 1000);
        this.i0 = bundle.getInt("nextType");
        this.l0 = bundle.getString("pattern");
        this.m0 = bundle.getString("prefix");
        this.o0 = bundle.getInt("length");
        this.j0 = bundle.getInt("prevType", 0);
        if (this.o0 == 0) {
            this.o0 = 5;
        }
        this.p0 = bundle.getString("url");
        this.q0 = null;
        this.r0 = null;
        this.f.b(this.o0, this.h0);
        for (vr vrVar : this.f.f) {
            vrVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            vrVar.addTextChangedListener(new n0(this, 9));
            vrVar.setOnFocusChangeListener(new pd(this, i18));
        }
        int i21 = this.j0;
        if (i21 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f7)));
        } else if (i21 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f7)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = jf.b.c().b(this.b);
        if (this.u0.m1()) {
            replaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, jf.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) replaceTags, '*');
            int lastIndexOf = TextUtils.lastIndexOf(replaceTags, '*');
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                replaceTags.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                replaceTags.replace(indexOf, indexOf + 1, (CharSequence) "");
                replaceTags.setSpan(new org.telegram.ui.Components.q61("tg://settings/change_number", (org.telegram.ui.Components.q11) null), indexOf, lastIndexOf - 1, 33);
            }
        } else {
            int i22 = this.h0;
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
                    i11 = this.h0;
                    if (i11 != 15) {
                        if (i11 == 1) {
                            int i23 = this.i0;
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
                    if (this.h0 == 3) {
                        ig0.V0(this.u0, this.f.f[0]);
                        this.f.f[0].requestFocus();
                    } else {
                        AndroidUtilities.hideKeyboard(this.f.f[0]);
                    }
                    u();
                    t();
                    this.c0 = System.currentTimeMillis();
                    i12 = this.h0;
                    if (i12 != 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        kf0 kf0Var2 = this.x;
                        if (kf0Var2 != null) {
                            kf0Var2.setVisibility(0);
                        }
                    } else if (i12 == 3) {
                        int i24 = this.i0;
                        if (i24 == i10 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.x.setVisibility(8);
                            int i25 = this.i0;
                            if (i25 == i10 || i25 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i25 == 2 || i25 == 17 || i25 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                        } else {
                            this.v.setVisibility(8);
                        }
                        String obtainLoginPhoneCall = z10 ? AndroidUtilities.obtainLoginPhoneCall(this.l0) : null;
                        if (obtainLoginPhoneCall != null) {
                            h(obtainLoginPhoneCall);
                        } else {
                            String str2 = this.n0;
                            if (str2 != null) {
                                h(str2);
                            } else {
                                int i26 = this.i0;
                                if (i26 == i10 || i26 == 2 || i26 == 17 || i26 == 16 || i26 == 11) {
                                    s();
                                }
                            }
                        }
                    } else {
                        if (i12 == 2) {
                            int i27 = this.i0;
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
                            setProblemTextVisible(this.a0 < 1000);
                            this.v.setVisibility(this.a0 < 1000 ? 8 : 0);
                            kf0 kf0Var3 = this.x;
                            if (kf0Var3 != null) {
                                kf0Var3.setVisibility(this.a0 < 1000 ? 0 : 8);
                            }
                            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                            String string2 = sharedPreferences.getString("sms_hash", null);
                            if (!TextUtils.isEmpty(string2) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                                if (string.contains(string2 + "|") && !this.u0.x) {
                                    str = string.substring(string.indexOf(124) + 1);
                                    if (str == null) {
                                        this.f.setCode(str);
                                        h(null);
                                    } else {
                                        s();
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        if (i12 == i10) {
                            int i28 = this.i0;
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
                            setProblemTextVisible(this.a0 < 1000);
                            this.v.setVisibility(this.a0 < 1000 ? 8 : 0);
                            kf0 kf0Var4 = this.x;
                            if (kf0Var4 != null) {
                                kf0Var4.setVisibility(this.a0 < 1000 ? 0 : 8);
                            }
                            s();
                        }
                        if (i12 == 11) {
                            int i29 = this.i0;
                            if (i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                                setProblemTextVisible(false);
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                int i30 = this.i0;
                                if (i30 == 4 || i30 == 11) {
                                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                } else if (i30 == 2 || i30 == 17 || i30 == 16) {
                                    this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                s();
                            }
                        } else {
                            this.v.setVisibility(8);
                            kf0 kf0Var5 = this.x;
                            if (kf0Var5 != null) {
                                kf0Var5.setVisibility(0);
                            }
                            setProblemTextVisible(false);
                            r();
                        }
                    }
                    if (this.h0 != 11) {
                        String str3 = this.m0;
                        for (int i31 = 0; i31 < this.o0; i31++) {
                            str3 = si.o0.u(str3, "0");
                        }
                        String b11 = jf.b.c().b("+" + str3);
                        for (int i32 = 0; i32 < this.o0; i32++) {
                            int lastIndexOf2 = b11.lastIndexOf("0");
                            if (lastIndexOf2 >= 0) {
                                b11 = b11.substring(0, lastIndexOf2);
                            }
                        }
                        this.I.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
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
        i11 = this.h0;
        if (i11 != 15) {
        }
        if (this.h0 == 3) {
        }
        u();
        t();
        this.c0 = System.currentTimeMillis();
        i12 = this.h0;
        if (i12 != 1) {
        }
        if (this.h0 != 11) {
        }
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
        removeCallbacks(this.t0);
    }

    public final void p(Runnable runnable) {
        if (this.h0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            sr srVar = this.f;
            if (i10 >= srVar.f.length) {
                srVar.postDelayed(new f80(25, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                srVar.postDelayed(new ef0(this, i10, 2), i10 * 75);
                i10++;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.b0 = 15000;
        int i10 = this.a0;
        if (i10 > 15000) {
            this.b0 = i10;
        }
        this.U = new Timer();
        this.d0 = System.currentTimeMillis();
        this.U.schedule(new e6.r(this, 3), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        kf0 kf0Var = this.v;
        org.telegram.ui.ActionBar.r6.W(kf0Var, i10, null);
        kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new lf0(this), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.W) {
                try {
                    Timer timer = this.U;
                    if (timer != null) {
                        timer.cancel();
                        this.U = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void u() {
        kf0 kf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.W(kf0Var, i10, null);
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.W) {
                try {
                    Timer timer = this.T;
                    if (timer != null) {
                        timer.cancel();
                        this.T = null;
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.u0.m1() ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = this.h0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.k6.y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            int i13 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ig0.g1(this.L, x03, i13, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ig0.g1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        q(this.a);
        q(this.P);
        q(this.Q);
        q(this.R);
        sr srVar = this.f;
        if (srVar != null) {
            srVar.invalidate();
        }
        kf0 kf0Var = this.v;
        Integer num = (Integer) kf0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.D6);
        }
        kf0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.x.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
    }

    public final void w() {
        int i10;
        if (this.f0 || this.k0) {
            return;
        }
        ig0 ig0Var = this.u0;
        if (ig0Var.o0) {
            return;
        }
        this.k0 = true;
        this.v.invalidate();
        this.x.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.h0);
        this.f0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
        z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new df0(this, bundle, 1), 10));
    }

    public final void x() {
        sr srVar = this.f;
        try {
            srVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            vr[] vrVarArr = srVar.f;
            if (i10 >= vrVarArr.length) {
                break;
            }
            vrVarArr[i10].setText("");
            srVar.f[i10].i(1.0f);
            i10++;
        }
        qd0 qd0Var = this.w;
        if (qd0Var.getCurrentView() != this.E) {
            qd0Var.showNext();
        }
        srVar.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(srVar, this.h0 == 11 ? 3.5f : 10.0f, new ze0(this, 7));
        ze0 ze0Var = this.t0;
        removeCallbacks(ze0Var);
        postDelayed(ze0Var, 5000L);
        this.s0 = true;
    }

    public final void y(boolean z10) {
        if (this.P == null) {
            this.u0.o1(z10, true);
            return;
        }
        if (this.S) {
            this.S = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.yj0 yj0Var = this.Q;
            yj0Var.K(0);
            yj0Var.S(yj0Var.e[0] - 1, new ze0(this, 1));
        }
    }

    public final void z(int i10) {
        org.telegram.ui.Components.yj0 yj0Var = this.P;
        if (yj0Var == null) {
            this.u0.r1(i10, true);
            return;
        }
        if (this.S) {
            return;
        }
        this.S = true;
        org.telegram.ui.Components.yj0 yj0Var2 = this.a;
        if (yj0Var2.a0 != yj0Var2.e[0] - 1) {
            yj0Var2.t0 = new ef0(this, i10, 0);
            return;
        }
        yj0Var.t0 = new ze0(this, 3);
        org.telegram.ui.Components.bk0 bk0Var = this.s;
        bk0Var.setAutoRepeat(false);
        yj0Var.N(0, false, false);
        bk0Var.setAnimation(yj0Var);
        bk0Var.d();
    }
}
