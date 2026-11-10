package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.Settings;
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
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jd0 extends org.telegram.ui.Components.xt0 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.ch0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.zg0 P;
    public final org.telegram.ui.Components.zg0 Q;
    public final org.telegram.ui.Components.zg0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.zg0 a;
    public int a0;
    public String b;
    public int b0;
    public String c;
    public double c0;
    public String d;
    public double d0;
    public String e;
    public boolean e0;
    public final br f;
    public boolean f0;
    public String g0;
    public final gb0 h;
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
    public final org.telegram.ui.Components.ch0 s;
    public boolean s0;
    public final xc0 t0;
    public final /* synthetic */ fe0 u0;
    public final hd0 w;
    public final qb0 x;
    public final hd0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jd0(fe0 fe0Var, Context context, int i7) {
        super(context);
        ViewGroup viewGroup;
        this.u0 = fe0Var;
        this.W = new Object();
        this.a0 = 60000;
        this.b0 = 15000;
        this.g0 = "";
        this.k0 = false;
        this.l0 = "*";
        this.m0 = "";
        this.t0 = new xc0(this, 2);
        this.h0 = i7;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        com.google.android.recaptcha.internal.a.q(textView2, 1, 18.0f);
        textView2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String M0 = fe0Var.F != 1 ? null : org.telegram.messenger.id.M0(2131752588, null);
        if (i7 == 11) {
            textView2.setText(M0 == null ? org.telegram.messenger.id.M0(2131748411, null) : M0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.L = imageView;
            ImageView imageView2 = new ImageView(context);
            this.M = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, c8.ha.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, c8.ha.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.J = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748413, null)));
            addView(textView3, c8.ha.t(-1, -2, 49, 36, 16, 36, 0));
            gd0 gd0Var = new gd0(this, context, 0);
            this.f = gd0Var;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            TextView textView4 = new TextView(context);
            this.I = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f10.addView(textView4, c8.ha.t(-2, -1, 16, 0, 0, 4, 0));
            f10.addView(gd0Var, c8.ha.o(-2, -1));
            addView(f10, c8.ha.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.K = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView5.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748412, null)));
            addView(textView5, c8.ha.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i7 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, c8.ha.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ha.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, c8.ha.e(-2, -2, 1));
                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
                this.s = ch0Var;
                org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.phone_flash_call, org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(64.0f), true, null);
                this.a = zg0Var;
                ch0Var.setAnimation(zg0Var);
                frameLayout3.addView(ch0Var, c8.ha.c(64.0f, 64));
                textView2.setText(M0 == null ? org.telegram.messenger.id.M0(2131742827, null) : M0);
                linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i7 != 11) {
                    gd0 gd0Var2 = new gd0(this, context, 1);
                    this.f = gd0Var2;
                    addView(gd0Var2, c8.ha.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i7 == 3) {
                    this.f.setVisibility(8);
                }
                gb0 gb0Var = new gb0(fe0Var, context);
                this.h = gb0Var;
                int i11 = org.telegram.ui.ActionBar.m6.I6;
                org.telegram.ui.ActionBar.t6.G(gb0Var, i11, null);
                org.telegram.ui.ActionBar.t6.U(gb0Var, i11, fe0Var.getResourceProvider());
                gb0Var.setTextSize(1, 14.0f);
                gb0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                gb0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                final int i12 = 0;
                gb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ed0
                    public final /* synthetic */ jd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i12;
                        jd0 jd0Var = this.b;
                        switch (i14) {
                            case 0:
                                jd0Var.c(true);
                                break;
                            case 1:
                                hd0 hd0Var = jd0Var.w;
                                if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                                    jd0Var.k0 = true;
                                    hd0Var.invalidate();
                                    org.telegram.ui.ActionBar.t6.U(hd0Var, org.telegram.ui.ActionBar.m6.I6, null);
                                    int i15 = jd0Var.i0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.E3(false);
                                            org.telegram.messenger.qs.e().n(jd0Var, org.telegram.messenger.qs.g4);
                                            jd0Var.e0 = false;
                                            jd0Var.t();
                                            jd0Var.k0 = false;
                                            jd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            hd0Var.setText(org.telegram.messenger.id.M0(2131752597, null));
                                        } else {
                                            hd0Var.setText(org.telegram.messenger.id.M0(2131745577, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", jd0Var.b);
                                        bundle.putString("ephone", jd0Var.e);
                                        bundle.putString("phoneFormated", jd0Var.d);
                                        bundle.putInt("prevType", jd0Var.h0);
                                        jd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = jd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = jd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.f2) jd0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new bd0(jd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    jd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jd0Var.p0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                addView(gb0Var, c8.ha.t(-2, -2, 1, 0, 18, 0, 0));
                gb0Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.D = frameLayout4;
                hd0 hd0Var = new hd0(this, context, 0);
                this.w = hd0Var;
                org.telegram.ui.ActionBar.t6.G(hd0Var, i11, null);
                hd0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                hd0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                hd0Var.setTextSize(1, 15.0f);
                hd0Var.setGravity(51);
                hd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ed0
                    public final /* synthetic */ jd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i10;
                        jd0 jd0Var = this.b;
                        switch (i14) {
                            case 0:
                                jd0Var.c(true);
                                break;
                            case 1:
                                hd0 hd0Var2 = jd0Var.w;
                                if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                                    jd0Var.k0 = true;
                                    hd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.t6.U(hd0Var2, org.telegram.ui.ActionBar.m6.I6, null);
                                    int i15 = jd0Var.i0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.E3(false);
                                            org.telegram.messenger.qs.e().n(jd0Var, org.telegram.messenger.qs.g4);
                                            jd0Var.e0 = false;
                                            jd0Var.t();
                                            jd0Var.k0 = false;
                                            jd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            hd0Var2.setText(org.telegram.messenger.id.M0(2131752597, null));
                                        } else {
                                            hd0Var2.setText(org.telegram.messenger.id.M0(2131745577, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", jd0Var.b);
                                        bundle.putString("ephone", jd0Var.e);
                                        bundle.putString("phoneFormated", jd0Var.d);
                                        bundle.putInt("prevType", jd0Var.h0);
                                        jd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = jd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = jd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.f2) jd0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new bd0(jd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    jd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jd0Var.p0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(hd0Var, c8.ha.e(-2, -2, 49));
                qb0 qb0Var = new qb0(context, i10);
                this.x = qb0Var;
                if (i7 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.js.e;
                    loadAnimation.setInterpolator(interpolator);
                    qb0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    qb0Var.setOutAnimation(loadAnimation2);
                    hd0 hd0Var2 = new hd0(this, context, 1);
                    this.y = hd0Var2;
                    hd0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    hd0Var2.setTextSize(1, 15.0f);
                    hd0Var2.setGravity(49);
                    hd0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                    frameLayout4.addView(hd0Var2, c8.ha.e(-1, -2, 17));
                    qb0Var.addView(frameLayout4, c8.ha.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.wq.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    qb0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    qb0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.F = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    int L = org.telegram.messenger.g0.L(6.0f);
                    int i13 = org.telegram.ui.ActionBar.m6.Ki;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.m6.Q9;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
                    linearLayout2.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(linearLayout2, k02, M, M2, null);
                    final int i15 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ed0
                        public final /* synthetic */ jd0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            int i142 = i15;
                            jd0 jd0Var = this.b;
                            switch (i142) {
                                case 0:
                                    jd0Var.c(true);
                                    break;
                                case 1:
                                    hd0 hd0Var22 = jd0Var.w;
                                    if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                                        jd0Var.k0 = true;
                                        hd0Var22.invalidate();
                                        org.telegram.ui.ActionBar.t6.U(hd0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                                        int i152 = jd0Var.i0;
                                        int i16 = 0;
                                        if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                org.telegram.messenger.g0.E3(false);
                                                org.telegram.messenger.qs.e().n(jd0Var, org.telegram.messenger.qs.g4);
                                                jd0Var.e0 = false;
                                                jd0Var.t();
                                                jd0Var.k0 = false;
                                                jd0Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i152 == 4 || i152 == 11) {
                                                hd0Var22.setText(org.telegram.messenger.id.M0(2131752597, null));
                                            } else {
                                                hd0Var22.setText(org.telegram.messenger.id.M0(2131745577, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", jd0Var.b);
                                            bundle.putString("ephone", jd0Var.e);
                                            bundle.putString("phoneFormated", jd0Var.d);
                                            bundle.putInt("prevType", jd0Var.h0);
                                            jd0Var.r();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = jd0Var.d;
                                            tL_auth_resendCode.phone_code_hash = jd0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.f2) jd0Var.u0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new bd0(jd0Var, bundle, i16), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        jd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jd0Var.p0)));
                                        break;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                            }
                        }
                    });
                    qb0Var.addView(linearLayout2, c8.ha.c(52.0f, -1));
                    org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(context);
                    this.G = ch0Var2;
                    ch0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(ch0Var2, c8.ha.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(org.telegram.messenger.id.M0(2131747805, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.E = textView7;
                textView7.setText(org.telegram.messenger.id.M0(2131742861, null));
                textView7.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                qb0Var.addView(textView7, c8.ha.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(qb0Var, c8.ha.d(i7 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, c8.ha.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(qb0Var, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                h6.m.g(qb0Var);
                if (i7 == 15) {
                    this.y.setOnClickListener(new org.telegram.ui.Components.u41(26, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, c8.ha.t(-2, -2, 49, 0, 16, 0, 0));
            int i16 = i7 == 1 ? 128 : 64;
            if (i7 == 1) {
                float f11 = i16;
                this.a = new org.telegram.ui.Components.zg0(R.raw.code_laptop, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
            } else {
                float f12 = i16;
                this.a = new org.telegram.ui.Components.zg0(R.raw.sms_incoming_info, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.P = new org.telegram.ui.Components.zg0(R.raw.phone_stars_to_dots, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.Q = new org.telegram.ui.Components.zg0(R.raw.phone_dots, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.R = new org.telegram.ui.Components.zg0(R.raw.phone_dots_to_stars, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
            }
            org.telegram.ui.Components.ch0 ch0Var3 = new org.telegram.ui.Components.ch0(context);
            this.s = ch0Var3;
            ch0Var3.setAnimation(this.a);
            if (i7 == 1 && !org.telegram.messenger.g0.O1()) {
                ch0Var3.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
            }
            frameLayout6.addView(ch0Var3, c8.ha.d(i16, i16, 51, 0.0f, 0.0f, 0.0f, (i7 != 1 || org.telegram.messenger.g0.O1()) ? 0.0f : -org.telegram.messenger.g0.L(16.0f)));
            if (M0 == null) {
                M0 = org.telegram.messenger.id.M0(i7 == 1 ? 2131745572 : 2131745566, null);
            }
            textView2.setText(M0);
            addView(textView2, c8.ha.t(-2, -2, 49, 0, 18, 0, 0));
            int i17 = i7 == 15 ? 16 : 0;
            addView(textView, c8.ha.t(-2, -2, 49, i17, 17, i17, 0));
        }
        viewGroup = null;
        if (i7 != 11) {
        }
        if (i7 == 3) {
        }
        gb0 gb0Var2 = new gb0(fe0Var, context);
        this.h = gb0Var2;
        int i112 = org.telegram.ui.ActionBar.m6.I6;
        org.telegram.ui.ActionBar.t6.G(gb0Var2, i112, null);
        org.telegram.ui.ActionBar.t6.U(gb0Var2, i112, fe0Var.getResourceProvider());
        gb0Var2.setTextSize(1, 14.0f);
        gb0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        gb0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        final int i122 = 0;
        gb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ed0
            public final /* synthetic */ jd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i122;
                jd0 jd0Var = this.b;
                switch (i142) {
                    case 0:
                        jd0Var.c(true);
                        break;
                    case 1:
                        hd0 hd0Var22 = jd0Var.w;
                        if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                            jd0Var.k0 = true;
                            hd0Var22.invalidate();
                            org.telegram.ui.ActionBar.t6.U(hd0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                            int i152 = jd0Var.i0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.E3(false);
                                    org.telegram.messenger.qs.e().n(jd0Var, org.telegram.messenger.qs.g4);
                                    jd0Var.e0 = false;
                                    jd0Var.t();
                                    jd0Var.k0 = false;
                                    jd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    hd0Var22.setText(org.telegram.messenger.id.M0(2131752597, null));
                                } else {
                                    hd0Var22.setText(org.telegram.messenger.id.M0(2131745577, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", jd0Var.b);
                                bundle.putString("ephone", jd0Var.e);
                                bundle.putString("phoneFormated", jd0Var.d);
                                bundle.putInt("prevType", jd0Var.h0);
                                jd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = jd0Var.d;
                                tL_auth_resendCode.phone_code_hash = jd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.f2) jd0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new bd0(jd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            jd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jd0Var.p0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        addView(gb0Var2, c8.ha.t(-2, -2, 1, 0, 18, 0, 0));
        gb0Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.D = frameLayout42;
        hd0 hd0Var3 = new hd0(this, context, 0);
        this.w = hd0Var3;
        org.telegram.ui.ActionBar.t6.G(hd0Var3, i112, null);
        hd0Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        hd0Var3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        hd0Var3.setTextSize(1, 15.0f);
        hd0Var3.setGravity(51);
        hd0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ed0
            public final /* synthetic */ jd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i10;
                jd0 jd0Var = this.b;
                switch (i142) {
                    case 0:
                        jd0Var.c(true);
                        break;
                    case 1:
                        hd0 hd0Var22 = jd0Var.w;
                        if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                            jd0Var.k0 = true;
                            hd0Var22.invalidate();
                            org.telegram.ui.ActionBar.t6.U(hd0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                            int i152 = jd0Var.i0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.E3(false);
                                    org.telegram.messenger.qs.e().n(jd0Var, org.telegram.messenger.qs.g4);
                                    jd0Var.e0 = false;
                                    jd0Var.t();
                                    jd0Var.k0 = false;
                                    jd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    hd0Var22.setText(org.telegram.messenger.id.M0(2131752597, null));
                                } else {
                                    hd0Var22.setText(org.telegram.messenger.id.M0(2131745577, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", jd0Var.b);
                                bundle.putString("ephone", jd0Var.e);
                                bundle.putString("phoneFormated", jd0Var.d);
                                bundle.putInt("prevType", jd0Var.h0);
                                jd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = jd0Var.d;
                                tL_auth_resendCode.phone_code_hash = jd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.f2) jd0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new bd0(jd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            jd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jd0Var.p0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(hd0Var3, c8.ha.e(-2, -2, 49));
        qb0 qb0Var2 = new qb0(context, i10);
        this.x = qb0Var2;
        if (i7 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.E = textView72;
        textView72.setText(org.telegram.messenger.id.M0(2131742861, null));
        textView72.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        qb0Var2.addView(textView72, c8.ha.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        h6.m.g(qb0Var2);
        if (i7 == 15) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:2|3|(1:5)(1:91)|6|7|8|9|(1:11)(1:87)|(1:86)|(1:83)|(3:19|(4:22|(5:24|25|(1:27)(1:31)|28|29)(1:32)|30|20)|33)|35|36|(4:73|74|(1:76)(1:79)|77)(1:38)|39|40|41|(2:43|(13:45|46|47|48|(1:50)|51|(1:67)(1:55)|56|(1:58)(1:66)|59|(1:61)|62|64))|71|46|47|48|(0)|51|(1:53)|67|56|(0)(0)|59|(0)|62|64) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0250 A[Catch: Exception -> 0x0284, TryCatch #3 {Exception -> 0x0284, blocks: (B:3:0x0005, B:6:0x006f, B:35:0x0181, B:39:0x01be, B:46:0x01dc, B:51:0x01f4, B:55:0x0213, B:56:0x021e, B:59:0x0242, B:61:0x0250, B:62:0x025d, B:38:0x01bb, B:82:0x01b7, B:90:0x017e, B:9:0x00c8, B:11:0x00d4, B:13:0x00df, B:16:0x00ef, B:19:0x00fb, B:20:0x00ff, B:22:0x0105, B:25:0x0115, B:28:0x0175, B:31:0x0171, B:83:0x00f5, B:86:0x00e9, B:74:0x0189, B:76:0x019f, B:79:0x01b3), top: B:2:0x0005, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(jd0 jd0Var, Context context) {
        boolean z9;
        int i7;
        String str;
        WifiManager wifiManager;
        try {
            boolean z10 = false;
            PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jd0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str2);
            sb2.append(jd0Var.u0.e ? " #paidauth" : "");
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
            sb3.append(jd0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(jd0Var.getContext());
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
                            String str3 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb3.append(str3);
                            sb3.append(".Phone: ");
                            sb3.append(number);
                            sb3.append("\n");
                            sb3.append(str3);
                            sb3.append(".MCC: ");
                            sb3.append(subscriptionInfo.getMcc());
                            sb3.append("\n");
                            sb3.append(str3);
                            sb3.append(".MNC: ");
                            sb3.append(subscriptionInfo.getMnc());
                            sb3.append("\n");
                            sb3.append(str3);
                            sb3.append(".Carrier: ");
                            sb3.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb3.append("\n\n");
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
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
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            Typeface typeface = org.telegram.messenger.g0.a;
            try {
                wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z9 = true;
                    sb3.append(z9);
                    sb3.append("\n");
                    sb3.append("Airplane Mode: ");
                    if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z10 = true;
                    }
                    sb3.append(z10);
                    sb3.append("\n");
                    sb3.append("\n");
                    sb3.append("App: ");
                    sb3.append(org.telegram.messenger.r2.d);
                    sb3.append("\n");
                    i7 = packageInfo.versionCode % 10;
                    if (i7 != 1 || i7 == 2) {
                        str = "store";
                    } else {
                        org.telegram.messenger.t0.u();
                        org.telegram.messenger.t0.n();
                        str = "beta";
                    }
                    sb3.append("App version: ");
                    sb3.append(str2);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append("\n");
                    sb3.append("\n");
                    sb3.append("Issue: ");
                    sb3.append(!jd0Var.u0.e ? "no_otp" : "no_otp_paid");
                    sb3.append("\n");
                    if (!TextUtils.isEmpty(jd0Var.g0)) {
                        sb3.append("Error: ");
                        sb3.append(jd0Var.g0);
                        sb3.append("\n");
                    }
                    sb3.append("\n\n================================================\n");
                    sb3.append("WRITE YOUR COMMENT HERE:\n");
                    sb3.append("\n");
                    sb3.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                    jd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z9 = false;
            sb3.append(z9);
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb3.append(z10);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(org.telegram.messenger.r2.d);
            sb3.append("\n");
            i7 = packageInfo.versionCode % 10;
            if (i7 != 1) {
            }
            str = "store";
            sb3.append("App version: ");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(str);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(!jd0Var.u0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(jd0Var.g0)) {
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            jd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            jd0Var.u0.D1(org.telegram.messenger.id.M0(R.string.AppName, null), org.telegram.messenger.id.M0(2131748199, "NoMailInstalled"));
        }
    }

    public static void q(org.telegram.ui.Components.zg0 zg0Var) {
        if (zg0Var != null) {
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Phone");
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z9) {
        hd0 hd0Var = this.y;
        if (hd0Var == null) {
            return;
        }
        float f10 = z9 ? 1.0f : 0.0f;
        if (hd0Var.getAlpha() != f10) {
            hd0Var.animate().cancel();
            hd0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean a() {
        return this.h0 != 3;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean c(boolean z9) {
        int i7;
        fe0 fe0Var = this.u0;
        int i10 = 0;
        if (fe0Var.F != 0) {
            fe0Var.finishFragment();
            return false;
        }
        int i11 = this.j0;
        if (i11 != 0) {
            fe0Var.M1(i11, true, null, true);
            return false;
        }
        if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751263, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EditNumberInfo", null, 2131751262, this.b));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751335, null), new zc0(this, i10));
            fe0Var.showDialog(u1Var);
            return false;
        }
        this.f0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.v5(23), 10);
        u();
        t();
        this.H = null;
        int i12 = org.telegram.messenger.qs.g4;
        int i13 = this.h0;
        if (i13 == 15) {
            org.telegram.messenger.qs.e().n(this, i12);
        } else if (i13 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, i12);
        } else if (i13 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
        }
        this.e0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void d() {
        this.f0 = false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.e0) {
            br brVar = this.f;
            if (brVar.f == null) {
                return;
            }
            if (i7 == org.telegram.messenger.qs.g4) {
                brVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i7 == org.telegram.messenger.qs.h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.l0, str)) {
                    if (!this.l0.equals("*")) {
                        this.n0 = str;
                        org.telegram.messenger.g0.T();
                    }
                    h(str);
                    int i11 = CallReceiver.a;
                    org.telegram.messenger.iz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void f() {
        int i7 = org.telegram.messenger.qs.g4;
        int i10 = this.h0;
        if (i10 == 15) {
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
        }
        this.e0 = false;
        u();
        t();
    }

    @Override // org.telegram.ui.Components.xt0
    public final void g() {
        Bundle bundle;
        this.k0 = false;
        this.f0 = false;
        if (this.j0 == 0 || (bundle = this.H) == null) {
            return;
        }
        bundle.putInt("timeout", this.a0);
    }

    @Override // org.telegram.ui.Components.xt0
    public String getHeaderName() {
        int i7 = this.h0;
        return (i7 == 3 || i7 == 11) ? this.b : org.telegram.messenger.id.M0(2131742827, "YourCode");
    }

    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        fe0 fe0Var = this.u0;
        int i12 = fe0Var.a;
        if (i12 == 11) {
            if (this.f0) {
                return;
            }
        } else {
            if (this.f0) {
                return;
            }
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        }
        br brVar = this.f;
        if (str == null) {
            str = brVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            fe0.c1(fe0Var, brVar, false);
            return;
        }
        int i14 = fe0Var.a;
        if (i14 < 1 || i14 > 4 || !brVar.e) {
            this.f0 = true;
            int i15 = org.telegram.messenger.qs.g4;
            int i16 = this.h0;
            if (i16 == 15) {
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
            }
            this.e0 = false;
            int i17 = fe0Var.F;
            if (i17 == 1) {
                this.d = fe0Var.G;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                u();
                brVar.e = true;
                er[] erVarArr = brVar.f;
                int length = erVarArr.length;
                while (i13 < length) {
                    erVarArr[i13].A(0.0f);
                    i13++;
                }
                i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new k50(9, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                u();
                brVar.e = true;
                er[] erVarArr2 = brVar.f;
                int length2 = erVarArr2.length;
                while (i13 < length2) {
                    erVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                fe0Var.N1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            u();
            brVar.e = true;
            er[] erVarArr3 = brVar.f;
            int length3 = erVarArr3.length;
            while (i13 < length3) {
                erVarArr3[i13].A(0.0f);
                i13++;
            }
            i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new yc0(this, tL_auth_signIn, 0), 10));
            fe0Var.N1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void j() {
        org.telegram.ui.Components.zg0 zg0Var = this.a;
        if (zg0Var != null) {
            zg0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new xc0(this, 0), fe0.y0);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.h0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            br brVar = this.f;
            if (brVar.f != null) {
                brVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.a0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.V = i11;
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i7 = this.h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(jg.g.j(i7, "smsview_params_"), this.H);
        }
        int i10 = this.a0;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.V;
        if (i11 != 0) {
            bundle.putInt("open", i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0530, code lost:
    
        if (r2 == 16) goto L225;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0519  */
    @Override // org.telegram.ui.Components.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z9) {
        String str;
        int i7;
        String str2;
        String string;
        int i10 = org.telegram.messenger.qs.g4;
        int i11 = 8;
        String str3 = null;
        if (bundle == null) {
            if (this.q0 == null || this.r0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            hd0 hd0Var = this.y;
            if (hd0Var != null) {
                hd0Var.setVisibility(0);
                org.telegram.ui.ActionBar.t6.U(this.y, org.telegram.ui.ActionBar.m6.I6, null);
                int i12 = this.i0;
                this.y.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(i12 == 17 ? 2131746050 : i12 == 16 ? 2131746048 : 2131746049, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        this.e0 = true;
        int i13 = this.h0;
        if (i13 == 15) {
            org.telegram.messenger.qs.e().b(this, i10);
        } else if (i13 == 2) {
            org.telegram.messenger.g0.E3(true);
            org.telegram.messenger.qs.e().b(this, i10);
        } else if (i13 == 3) {
            org.telegram.messenger.g0.D3(true);
            org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.h4);
            if (z9) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(24));
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
        er[] erVarArr = this.f.f;
        int length = erVarArr.length;
        int i14 = 0;
        while (true) {
            int i15 = 11;
            if (i14 >= length) {
                break;
            }
            er erVar = erVarArr[i14];
            erVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.g0.C1());
            erVar.addTextChangedListener(new m0(this, i15));
            erVar.setOnFocusChangeListener(new fd(this, i11));
            i14++;
        }
        int i16 = this.j0;
        if (i16 == 17) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i16 == 16) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = pf.b.c().b(this.b);
        if (this.u0.A1()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("CancelAccountResetInfo2", null, 2131752587, pf.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new org.telegram.messenger.c0(false));
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.b41("tg://settings/change_number", (org.telegram.ui.Components.uy0) null), indexOf, lastIndexOf - 1, 33);
                str = spannableStringBuilder;
            }
        } else {
            int i17 = this.h0;
            str = i17 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentAppCodeWithPhone", null, 2131745571, org.telegram.messenger.id.a(b10))) : i17 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentSmsCode", null, 2131745567, org.telegram.messenger.id.a(b10))) : i17 == 3 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallCode", null, 2131745570, org.telegram.messenger.id.a(b10))) : i17 == 4 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallOnly", null, 2131745569, org.telegram.messenger.id.a(b10))) : i17 == 15 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentFragmentCode", null, 2131745568, org.telegram.messenger.id.a(b10))) : "";
        }
        this.n.setText(str);
        int i18 = this.h0;
        if (i18 != 15) {
            if (i18 == 1) {
                int i19 = this.i0;
                if (i19 == 3 || i19 == 4 || i19 == 11) {
                    this.y.setText(org.telegram.messenger.id.M0(2131751444, null));
                } else if (i19 == 15) {
                    this.y.setText(org.telegram.messenger.id.M0(2131751447, null));
                } else if (i19 == 0) {
                    this.y.setText(org.telegram.messenger.id.M0(2131751449, null));
                } else {
                    this.y.setText(org.telegram.messenger.id.M0(2131751443, null));
                }
            } else {
                this.y.setText(org.telegram.messenger.id.M0(2131751449, null));
            }
        }
        if (this.h0 != 3) {
            fe0.b1(this.u0, this.f.f[0]);
            this.f.f[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.f.f[0]);
        }
        u();
        t();
        this.c0 = System.currentTimeMillis();
        int i20 = this.h0;
        if (i20 == 1) {
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            hd0 hd0Var2 = this.y;
            if (hd0Var2 != null) {
                hd0Var2.setVisibility(0);
            }
        } else {
            int i21 = 1;
            if (i20 == 3) {
                int i22 = this.i0;
                if (i22 == 4 || i22 == 2 || i22 == 17 || i22 == 16 || i22 == 11) {
                    setProblemTextVisible(false);
                    this.w.setVisibility(0);
                    this.y.setVisibility(8);
                    int i23 = this.i0;
                    if (i23 == 4 || i23 == 11) {
                        this.w.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, 1, 0));
                    } else if (i23 == 2 || i23 == 17 || i23 == 16) {
                        this.w.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, 1, 0));
                    }
                } else {
                    this.w.setVisibility(8);
                }
                if (z9) {
                    String str4 = this.l0;
                    try {
                        Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
                        while (true) {
                            try {
                                if (!query.moveToNext()) {
                                    query.close();
                                    break;
                                }
                                String string2 = query.getString(0);
                                long j3 = query.getLong(i21);
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.a8.d("number = " + string2);
                                }
                                if (Math.abs(System.currentTimeMillis() - j3) < 3600000 && org.telegram.messenger.g0.x(str4, string2)) {
                                    query.close();
                                    str3 = string2;
                                    break;
                                }
                                i21 = 1;
                            } catch (Throwable th2) {
                                if (query == null) {
                                    throw th2;
                                }
                                try {
                                    query.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (str3 != null) {
                    h(str3);
                } else {
                    String str5 = this.n0;
                    if (str5 != null) {
                        h(str5);
                    } else {
                        int i24 = this.i0;
                        if (i24 == 4 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11) {
                            s();
                        }
                    }
                }
            } else {
                if (i20 == 2) {
                    int i25 = this.i0;
                    if (i25 == 2 || i25 == 17 || i25 == 16 || i25 == 4 || i25 == 3) {
                        if (i25 == 2 || i25 == 17 || i25 == 16) {
                            this.w.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, 1, 0));
                        } else {
                            this.w.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, 2, 0));
                        }
                        setProblemTextVisible(this.a0 < 1000);
                        this.w.setVisibility(this.a0 < 1000 ? 8 : 0);
                        hd0 hd0Var3 = this.y;
                        if (hd0Var3 != null) {
                            hd0Var3.setVisibility(this.a0 < 1000 ? 0 : 8);
                        }
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
                        String string3 = sharedPreferences.getString("sms_hash", null);
                        if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                            if (string.contains(string3 + "|") && !this.u0.y) {
                                str2 = string.substring(string.indexOf(org.telegram.messenger.qs.I1) + 1);
                                if (str2 == null) {
                                    this.f.setCode(str2);
                                    h(null);
                                } else {
                                    s();
                                }
                            }
                        }
                        str2 = null;
                        if (str2 == null) {
                        }
                    } else {
                        i7 = 4;
                    }
                } else {
                    i7 = 4;
                }
                if (i20 == i7) {
                    int i26 = this.i0;
                    int i27 = (i26 == 2 || i26 == 17 || i26 == 11) ? 16 : 16;
                    if (i26 == 2 || i26 == 17 || i26 == i27) {
                        this.w.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, 1, 0));
                    } else {
                        this.w.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, 2, 0));
                    }
                    setProblemTextVisible(this.a0 < 1000);
                    this.w.setVisibility(this.a0 < 1000 ? 8 : 0);
                    hd0 hd0Var4 = this.y;
                    if (hd0Var4 != null) {
                        hd0Var4.setVisibility(this.a0 < 1000 ? 0 : 8);
                    }
                    s();
                }
                if (i20 == 11) {
                    int i28 = this.i0;
                    if (i28 == 4 || i28 == 2 || i28 == 17 || i28 == 16 || i28 == 11) {
                        setProblemTextVisible(false);
                        this.w.setVisibility(0);
                        this.y.setVisibility(8);
                        int i29 = this.i0;
                        if (i29 == 4 || i29 == 11) {
                            this.w.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, 1, 0));
                        } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                            this.w.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, 1, 0));
                        }
                        s();
                    }
                } else {
                    this.w.setVisibility(8);
                    hd0 hd0Var5 = this.y;
                    if (hd0Var5 != null) {
                        hd0Var5.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    r();
                }
            }
        }
        if (this.h0 == 11) {
            String str6 = this.m0;
            for (int i30 = 0; i30 < this.o0; i30++) {
                str6 = rf.b.r(str6, "0");
            }
            String b11 = pf.b.c().b("+" + str6);
            for (int i31 = 0; i31 < this.o0; i31++) {
                int lastIndexOf2 = b11.lastIndexOf("0");
                if (lastIndexOf2 >= 0) {
                    b11 = b11.substring(0, lastIndexOf2);
                }
            }
            this.I.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        super.onConfigurationChanged(configuration);
        br brVar = this.f;
        if (brVar == null || (erVarArr = brVar.f) == null) {
            return;
        }
        for (er erVar : erVarArr) {
            erVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.g0.C1());
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
        int i7 = 0;
        while (true) {
            br brVar = this.f;
            if (i7 >= brVar.f.length) {
                brVar.postDelayed(new tc0(4, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                brVar.postDelayed(new cd0(this, i7, 2), i7 * 75);
                i7++;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.b0 = 15000;
        int i7 = this.a0;
        if (i7 > 15000) {
            this.b0 = i7;
        }
        this.U = new Timer();
        this.d0 = System.currentTimeMillis();
        this.U.schedule(new id0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        hd0 hd0Var = this.w;
        org.telegram.ui.ActionBar.t6.U(hd0Var, i7, null);
        hd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new id0(this, 1), 0L, 1000L);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void u() {
        hd0 hd0Var = this.w;
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        org.telegram.ui.ActionBar.t6.U(hd0Var, i7, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i7));
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.u0.A1() ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = this.h0;
        if (i10 == 11) {
            int i11 = org.telegram.ui.ActionBar.m6.y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.l6, false);
            int i12 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            fe0.u1(this.L, x03, i12, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            fe0.u1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        }
        q(this.a);
        q(this.P);
        q(this.Q);
        q(this.R);
        br brVar = this.f;
        if (brVar != null) {
            brVar.invalidate();
        }
        hd0 hd0Var = this.w;
        Integer num = (Integer) hd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.m6.D6);
        }
        hd0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, num.intValue(), false));
        if (i10 != 15) {
            this.y.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false));
    }

    public final void v() {
        int i7;
        if (this.f0 || this.k0) {
            return;
        }
        fe0 fe0Var = this.u0;
        if (fe0Var.p0) {
            return;
        }
        this.k0 = true;
        this.w.invalidate();
        this.y.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.h0);
        this.f0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new bd0(this, bundle, 1), 10));
    }

    public final void w() {
        br brVar = this.f;
        try {
            brVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            er[] erVarArr = brVar.f;
            if (i7 >= erVarArr.length) {
                break;
            }
            erVarArr[i7].setText("");
            brVar.f[i7].z(1.0f);
            i7++;
        }
        qb0 qb0Var = this.x;
        if (qb0Var.getCurrentView() != this.E) {
            qb0Var.showNext();
        }
        brVar.f[0].requestFocus();
        org.telegram.messenger.g0.G3(this.h0 == 11 ? 3.5f : 10.0f, brVar, new xc0(this, 7));
        xc0 xc0Var = this.t0;
        removeCallbacks(xc0Var);
        postDelayed(xc0Var, 5000L);
        this.s0 = true;
    }

    public final void y(boolean z9) {
        if (this.P == null) {
            this.u0.C1(z9, true);
            return;
        }
        if (this.S) {
            this.S = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.zg0 zg0Var = this.Q;
            zg0Var.K(0);
            zg0Var.S(zg0Var.e[0] - 1, new xc0(this, 1));
        }
    }

    public final void z(int i7) {
        org.telegram.ui.Components.zg0 zg0Var = this.P;
        if (zg0Var == null) {
            this.u0.F1(i7, true);
            return;
        }
        if (this.S) {
            return;
        }
        this.S = true;
        org.telegram.ui.Components.zg0 zg0Var2 = this.a;
        if (zg0Var2.a0 != zg0Var2.e[0] - 1) {
            zg0Var2.t0 = new cd0(this, i7, 0);
            return;
        }
        zg0Var.t0 = new xc0(this, 3);
        org.telegram.ui.Components.ch0 ch0Var = this.s;
        ch0Var.setAutoRepeat(false);
        zg0Var.N(0, false, false);
        ch0Var.setAnimation(zg0Var);
        ch0Var.d();
    }
}
