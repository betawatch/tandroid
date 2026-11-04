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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dd0 extends org.telegram.ui.Components.vt0 implements org.telegram.messenger.cs {
    public static final /* synthetic */ int w0 = 0;
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.fh0 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final org.telegram.ui.Components.ch0 Q;
    public final org.telegram.ui.Components.ch0 R;
    public final org.telegram.ui.Components.ch0 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final org.telegram.ui.Components.ch0 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final xq f;
    public boolean f0;
    public boolean g0;
    public final za0 h;
    public String h0;
    public final int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public String m0;
    public final TextView n;
    public String n0;
    public String o0;
    public int p0;
    public String q0;
    public final TextView r;
    public Bundle r0;
    public final org.telegram.ui.Components.fh0 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final rc0 u0;
    public final /* synthetic */ xd0 v0;
    public final bd0 w;
    public final kb0 x;
    public final bd0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dd0(xd0 xd0Var, Context context, int i3) {
        super(context);
        ViewGroup viewGroup;
        this.v0 = xd0Var;
        this.a0 = new Object();
        this.b0 = 60000;
        this.c0 = 15000;
        this.h0 = "";
        this.l0 = false;
        this.m0 = "*";
        this.n0 = "";
        this.u0 = new rc0(this, 2);
        this.i0 = i3;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        k2.p1.t(textView2, 1, 18.0f);
        textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String M0 = xd0Var.G != 1 ? null : org.telegram.messenger.bd.M0(2131752588, null);
        if (i3 == 11) {
            textView2.setText(M0 == null ? org.telegram.messenger.bd.M0(2131748419, null) : M0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.M = imageView;
            ImageView imageView2 = new ImageView(context);
            this.N = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, b8.mf.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, b8.mf.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.K = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748421, null)));
            addView(textView3, b8.mf.t(-1, -2, 49, 36, 16, 36, 0));
            ad0 ad0Var = new ad0(this, context, 0);
            this.f = ad0Var;
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            TextView textView4 = new TextView(context);
            this.J = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f10.addView(textView4, b8.mf.t(-2, -1, 16, 0, 0, 4, 0));
            f10.addView(ad0Var, b8.mf.o(-2, -1));
            addView(f10, b8.mf.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.L = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView5.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748420, null)));
            addView(textView5, b8.mf.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i3 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, b8.mf.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, b8.mf.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, b8.mf.e(-2, -2, 1));
                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
                this.s = fh0Var;
                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.phone_flash_call, org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(64.0f), true, null);
                this.a = ch0Var;
                fh0Var.setAnimation(ch0Var);
                frameLayout3.addView(fh0Var, b8.mf.c(64.0f, 64));
                textView2.setText(M0 == null ? org.telegram.messenger.bd.M0(2131742837, null) : M0);
                linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, b8.mf.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i3 != 11) {
                    ad0 ad0Var2 = new ad0(this, context, 1);
                    this.f = ad0Var2;
                    addView(ad0Var2, b8.mf.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i3 == 3) {
                    this.f.setVisibility(8);
                }
                za0 za0Var = new za0(xd0Var, context);
                this.h = za0Var;
                int i11 = org.telegram.ui.ActionBar.k6.I6;
                org.telegram.ui.ActionBar.r6.H(za0Var, i11, null);
                org.telegram.ui.ActionBar.r6.V(za0Var, i11, xd0Var.getResourceProvider());
                za0Var.setTextSize(1, 14.0f);
                za0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                za0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                final int i12 = 0;
                za0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
                    public final /* synthetic */ dd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i12;
                        dd0 dd0Var = this.b;
                        switch (i14) {
                            case 0:
                                dd0Var.c(true);
                                break;
                            case 1:
                                bd0 bd0Var = dd0Var.w;
                                if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                                    dd0Var.l0 = true;
                                    bd0Var.invalidate();
                                    org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                                    int i15 = dd0Var.j0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.E3(false);
                                            org.telegram.messenger.hs.e().n(dd0Var, org.telegram.messenger.hs.g4);
                                            dd0Var.f0 = false;
                                            dd0Var.t();
                                            dd0Var.l0 = false;
                                            dd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            bd0Var.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                        } else {
                                            bd0Var.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", dd0Var.b);
                                        bundle.putString("ephone", dd0Var.e);
                                        bundle.putString("phoneFormated", dd0Var.d);
                                        bundle.putInt("prevType", dd0Var.i0);
                                        dd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = dd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = dd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.d2) dd0Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new vc0(dd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    dd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd0Var.q0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                addView(za0Var, b8.mf.t(-2, -2, 1, 0, 18, 0, 0));
                za0Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.E = frameLayout4;
                bd0 bd0Var = new bd0(this, context, 0);
                this.w = bd0Var;
                org.telegram.ui.ActionBar.r6.H(bd0Var, i11, null);
                bd0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                bd0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                bd0Var.setTextSize(1, 15.0f);
                bd0Var.setGravity(51);
                bd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
                    public final /* synthetic */ dd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i10;
                        dd0 dd0Var = this.b;
                        switch (i14) {
                            case 0:
                                dd0Var.c(true);
                                break;
                            case 1:
                                bd0 bd0Var2 = dd0Var.w;
                                if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                                    dd0Var.l0 = true;
                                    bd0Var2.invalidate();
                                    org.telegram.ui.ActionBar.r6.V(bd0Var2, org.telegram.ui.ActionBar.k6.I6, null);
                                    int i15 = dd0Var.j0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.E3(false);
                                            org.telegram.messenger.hs.e().n(dd0Var, org.telegram.messenger.hs.g4);
                                            dd0Var.f0 = false;
                                            dd0Var.t();
                                            dd0Var.l0 = false;
                                            dd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            bd0Var2.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                        } else {
                                            bd0Var2.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", dd0Var.b);
                                        bundle.putString("ephone", dd0Var.e);
                                        bundle.putString("phoneFormated", dd0Var.d);
                                        bundle.putInt("prevType", dd0Var.i0);
                                        dd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = dd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = dd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.d2) dd0Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new vc0(dd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    dd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd0Var.q0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(bd0Var, b8.mf.e(-2, -2, 49));
                kb0 kb0Var = new kb0(context, i10);
                this.x = kb0Var;
                if (i3 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.ks.e;
                    loadAnimation.setInterpolator(interpolator);
                    kb0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    kb0Var.setOutAnimation(loadAnimation2);
                    bd0 bd0Var2 = new bd0(this, context, 1);
                    this.y = bd0Var2;
                    bd0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    bd0Var2.setTextSize(1, 15.0f);
                    bd0Var2.setGravity(49);
                    bd0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                    frameLayout4.addView(bd0Var2, b8.mf.e(-1, -2, 17));
                    kb0Var.addView(frameLayout4, b8.mf.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.xq.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    kb0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    kb0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.G = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    int L = org.telegram.messenger.g0.L(6.0f);
                    int i13 = org.telegram.ui.ActionBar.k6.Ki;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.k6.Q9;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                    linearLayout2.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(linearLayout2, k02, N, N2, null);
                    final int i15 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
                        public final /* synthetic */ dd0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            int i142 = i15;
                            dd0 dd0Var = this.b;
                            switch (i142) {
                                case 0:
                                    dd0Var.c(true);
                                    break;
                                case 1:
                                    bd0 bd0Var22 = dd0Var.w;
                                    if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                                        dd0Var.l0 = true;
                                        bd0Var22.invalidate();
                                        org.telegram.ui.ActionBar.r6.V(bd0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                                        int i152 = dd0Var.j0;
                                        int i16 = 0;
                                        if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                org.telegram.messenger.g0.E3(false);
                                                org.telegram.messenger.hs.e().n(dd0Var, org.telegram.messenger.hs.g4);
                                                dd0Var.f0 = false;
                                                dd0Var.t();
                                                dd0Var.l0 = false;
                                                dd0Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i152 == 4 || i152 == 11) {
                                                bd0Var22.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                            } else {
                                                bd0Var22.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", dd0Var.b);
                                            bundle.putString("ephone", dd0Var.e);
                                            bundle.putString("phoneFormated", dd0Var.d);
                                            bundle.putInt("prevType", dd0Var.i0);
                                            dd0Var.r();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = dd0Var.d;
                                            tL_auth_resendCode.phone_code_hash = dd0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.d2) dd0Var.v0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new vc0(dd0Var, bundle, i16), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        dd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd0Var.q0)));
                                        break;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                            }
                        }
                    });
                    kb0Var.addView(linearLayout2, b8.mf.c(52.0f, -1));
                    org.telegram.ui.Components.fh0 fh0Var2 = new org.telegram.ui.Components.fh0(context);
                    this.H = fh0Var2;
                    fh0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(fh0Var2, b8.mf.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(org.telegram.messenger.bd.M0(2131747813, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.F = textView7;
                textView7.setText(org.telegram.messenger.bd.M0(2131742871, null));
                textView7.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                kb0Var.addView(textView7, b8.mf.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(kb0Var, b8.mf.d(i3 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, b8.mf.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(kb0Var, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                k4.j.k(kb0Var);
                if (i3 == 15) {
                    this.y.setOnClickListener(new hb0(2, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, b8.mf.t(-2, -2, 49, 0, 16, 0, 0));
            int i16 = i3 == 1 ? 128 : 64;
            if (i3 == 1) {
                float f11 = i16;
                this.a = new org.telegram.ui.Components.ch0(R.raw.code_laptop, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
            } else {
                float f12 = i16;
                this.a = new org.telegram.ui.Components.ch0(R.raw.sms_incoming_info, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.Q = new org.telegram.ui.Components.ch0(R.raw.phone_stars_to_dots, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.R = new org.telegram.ui.Components.ch0(R.raw.phone_dots, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
                this.S = new org.telegram.ui.Components.ch0(R.raw.phone_dots_to_stars, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), true, null);
            }
            org.telegram.ui.Components.fh0 fh0Var3 = new org.telegram.ui.Components.fh0(context);
            this.s = fh0Var3;
            fh0Var3.setAnimation(this.a);
            if (i3 == 1 && !org.telegram.messenger.g0.O1()) {
                fh0Var3.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
            }
            frameLayout6.addView(fh0Var3, b8.mf.d(i16, i16, 51, 0.0f, 0.0f, 0.0f, (i3 != 1 || org.telegram.messenger.g0.O1()) ? 0.0f : -org.telegram.messenger.g0.L(16.0f)));
            if (M0 == null) {
                M0 = org.telegram.messenger.bd.M0(i3 == 1 ? 2131745582 : 2131745576, null);
            }
            textView2.setText(M0);
            addView(textView2, b8.mf.t(-2, -2, 49, 0, 18, 0, 0));
            int i17 = i3 == 15 ? 16 : 0;
            addView(textView, b8.mf.t(-2, -2, 49, i17, 17, i17, 0));
        }
        viewGroup = null;
        if (i3 != 11) {
        }
        if (i3 == 3) {
        }
        za0 za0Var2 = new za0(xd0Var, context);
        this.h = za0Var2;
        int i112 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.ActionBar.r6.H(za0Var2, i112, null);
        org.telegram.ui.ActionBar.r6.V(za0Var2, i112, xd0Var.getResourceProvider());
        za0Var2.setTextSize(1, 14.0f);
        za0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        za0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        final int i122 = 0;
        za0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
            public final /* synthetic */ dd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i122;
                dd0 dd0Var = this.b;
                switch (i142) {
                    case 0:
                        dd0Var.c(true);
                        break;
                    case 1:
                        bd0 bd0Var22 = dd0Var.w;
                        if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                            dd0Var.l0 = true;
                            bd0Var22.invalidate();
                            org.telegram.ui.ActionBar.r6.V(bd0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                            int i152 = dd0Var.j0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.E3(false);
                                    org.telegram.messenger.hs.e().n(dd0Var, org.telegram.messenger.hs.g4);
                                    dd0Var.f0 = false;
                                    dd0Var.t();
                                    dd0Var.l0 = false;
                                    dd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    bd0Var22.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                } else {
                                    bd0Var22.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", dd0Var.b);
                                bundle.putString("ephone", dd0Var.e);
                                bundle.putString("phoneFormated", dd0Var.d);
                                bundle.putInt("prevType", dd0Var.i0);
                                dd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = dd0Var.d;
                                tL_auth_resendCode.phone_code_hash = dd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.d2) dd0Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new vc0(dd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            dd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd0Var.q0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        addView(za0Var2, b8.mf.t(-2, -2, 1, 0, 18, 0, 0));
        za0Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.E = frameLayout42;
        bd0 bd0Var3 = new bd0(this, context, 0);
        this.w = bd0Var3;
        org.telegram.ui.ActionBar.r6.H(bd0Var3, i112, null);
        bd0Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        bd0Var3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        bd0Var3.setTextSize(1, 15.0f);
        bd0Var3.setGravity(51);
        bd0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
            public final /* synthetic */ dd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i10;
                dd0 dd0Var = this.b;
                switch (i142) {
                    case 0:
                        dd0Var.c(true);
                        break;
                    case 1:
                        bd0 bd0Var22 = dd0Var.w;
                        if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                            dd0Var.l0 = true;
                            bd0Var22.invalidate();
                            org.telegram.ui.ActionBar.r6.V(bd0Var22, org.telegram.ui.ActionBar.k6.I6, null);
                            int i152 = dd0Var.j0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.E3(false);
                                    org.telegram.messenger.hs.e().n(dd0Var, org.telegram.messenger.hs.g4);
                                    dd0Var.f0 = false;
                                    dd0Var.t();
                                    dd0Var.l0 = false;
                                    dd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    bd0Var22.setText(org.telegram.messenger.bd.M0(2131752597, null));
                                } else {
                                    bd0Var22.setText(org.telegram.messenger.bd.M0(2131745587, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", dd0Var.b);
                                bundle.putString("ephone", dd0Var.e);
                                bundle.putString("phoneFormated", dd0Var.d);
                                bundle.putInt("prevType", dd0Var.i0);
                                dd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = dd0Var.d;
                                tL_auth_resendCode.phone_code_hash = dd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.d2) dd0Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new vc0(dd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            dd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd0Var.q0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(bd0Var3, b8.mf.e(-2, -2, 49));
        kb0 kb0Var2 = new kb0(context, i10);
        this.x = kb0Var2;
        if (i3 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.F = textView72;
        textView72.setText(org.telegram.messenger.bd.M0(2131742871, null));
        textView72.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        kb0Var2.addView(textView72, b8.mf.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        k4.j.k(kb0Var2);
        if (i3 == 15) {
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
    public static void n(dd0 dd0Var, Context context) {
        boolean z10;
        int i3;
        String str;
        WifiManager wifiManager;
        try {
            boolean z11 = false;
            PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dd0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str2);
            sb2.append(dd0Var.v0.e ? " #paidauth" : "");
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
            sb3.append(dd0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(dd0Var.getContext());
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
                    z10 = true;
                    sb3.append(z10);
                    sb3.append("\n");
                    sb3.append("Airplane Mode: ");
                    if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z11 = true;
                    }
                    sb3.append(z11);
                    sb3.append("\n");
                    sb3.append("\n");
                    sb3.append("App: ");
                    sb3.append(org.telegram.messenger.r2.d);
                    sb3.append("\n");
                    i3 = packageInfo.versionCode % 10;
                    if (i3 != 1 || i3 == 2) {
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
                    sb3.append(!dd0Var.v0.e ? "no_otp" : "no_otp_paid");
                    sb3.append("\n");
                    if (!TextUtils.isEmpty(dd0Var.h0)) {
                        sb3.append("Error: ");
                        sb3.append(dd0Var.h0);
                        sb3.append("\n");
                    }
                    sb3.append("\n\n================================================\n");
                    sb3.append("WRITE YOUR COMMENT HERE:\n");
                    sb3.append("\n");
                    sb3.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                    dd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z10 = false;
            sb3.append(z10);
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb3.append(z11);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(org.telegram.messenger.r2.d);
            sb3.append("\n");
            i3 = packageInfo.versionCode % 10;
            if (i3 != 1) {
            }
            str = "store";
            sb3.append("App version: ");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(str);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(!dd0Var.v0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(dd0Var.h0)) {
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            dd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            dd0Var.v0.u1(org.telegram.messenger.bd.M0(R.string.AppName, null), org.telegram.messenger.bd.M0(2131748207, "NoMailInstalled"));
        }
    }

    public static void q(org.telegram.ui.Components.ch0 ch0Var) {
        if (ch0Var != null) {
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false), "Bubble");
            int i3 = org.telegram.ui.ActionBar.k6.G6;
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i3, false), "Phone");
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i3, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        bd0 bd0Var = this.y;
        if (bd0Var == null) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (bd0Var.getAlpha() != f10) {
            bd0Var.animate().cancel();
            bd0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean a() {
        return this.i0 != 3;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean c(boolean z10) {
        int i3;
        xd0 xd0Var = this.v0;
        int i10 = 0;
        if (xd0Var.G != 0) {
            xd0Var.finishFragment();
            return false;
        }
        int i11 = this.k0;
        if (i11 != 0) {
            xd0Var.D1(i11, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131751264, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("EditNumberInfo", null, 2131751263, this.b));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751336, null), new tc0(this, i10));
            xd0Var.showDialog(s1Var);
            return false;
        }
        this.g0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_cancelCode, new ei.u5(23), 10);
        u();
        t();
        this.I = null;
        int i12 = org.telegram.messenger.hs.g4;
        int i13 = this.i0;
        if (i13 == 15) {
            org.telegram.messenger.hs.e().n(this, i12);
        } else if (i13 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, i12);
        } else if (i13 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
        }
        this.f0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void d() {
        this.g0 = false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (this.f0) {
            xq xqVar = this.f;
            if (xqVar.f == null) {
                return;
            }
            if (i3 == org.telegram.messenger.hs.g4) {
                xqVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i3 == org.telegram.messenger.hs.h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.m0, str)) {
                    if (!this.m0.equals("*")) {
                        this.o0 = str;
                        org.telegram.messenger.g0.T();
                    }
                    h(str);
                    int i11 = CallReceiver.a;
                    org.telegram.messenger.az.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void f() {
        int i3 = org.telegram.messenger.hs.g4;
        int i10 = this.i0;
        if (i10 == 15) {
            org.telegram.messenger.hs.e().n(this, i3);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, i3);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
        }
        this.f0 = false;
        u();
        t();
    }

    @Override // org.telegram.ui.Components.vt0
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 == 0 || (bundle = this.I) == null) {
            return;
        }
        bundle.putInt("timeout", this.b0);
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        int i3 = this.i0;
        return (i3 == 3 || i3 == 11) ? this.b : org.telegram.messenger.bd.M0(2131742837, "YourCode");
    }

    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        int i3;
        int i10;
        int i11;
        xd0 xd0Var = this.v0;
        int i12 = xd0Var.a;
        if (i12 == 11) {
            if (this.g0) {
                return;
            }
        } else {
            if (this.g0) {
                return;
            }
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        }
        xq xqVar = this.f;
        if (str == null) {
            str = xqVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            xd0.b1(xd0Var, xqVar, false);
            return;
        }
        int i14 = xd0Var.a;
        if (i14 < 1 || i14 > 4 || !xqVar.e) {
            this.g0 = true;
            int i15 = org.telegram.messenger.hs.g4;
            int i16 = this.i0;
            if (i16 == 15) {
                org.telegram.messenger.hs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.hs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.h4);
            }
            this.f0 = false;
            int i17 = xd0Var.G;
            if (i17 == 1) {
                this.d = xd0Var.H;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                u();
                xqVar.e = true;
                zq[] zqVarArr = xqVar.f;
                int length = zqVarArr.length;
                while (i13 < length) {
                    zqVarArr[i13].A(0.0f);
                    i13++;
                }
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                z(ConnectionsManager.getInstance(i3).sendRequest(confirmphone, new xy(12, this, confirmphone), 2));
                return;
            }
            if (i17 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                u();
                xqVar.e = true;
                zq[] zqVarArr2 = xqVar.f;
                int length2 = zqVarArr2.length;
                while (i13 < length2) {
                    zqVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 14), 2));
                xd0Var.E1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            u();
            xqVar.e = true;
            zq[] zqVarArr3 = xqVar.f;
            int length3 = zqVarArr3.length;
            while (i13 < length3) {
                zqVarArr3[i13].A(0.0f);
                i13++;
            }
            i11 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new sc0(this, tL_auth_signIn, 0), 10));
            xd0Var.E1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        org.telegram.ui.Components.ch0 ch0Var = this.a;
        if (ch0Var != null) {
            ch0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new rc0(this, 0), xd0.z0);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i3 = this.i0;
        sb2.append(i3);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i3);
        if (string2 != null) {
            xq xqVar = this.f;
            if (xqVar.f != null) {
                xqVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i3 = this.i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i3, code);
        }
        String str = this.o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(k2.p1.i(i3, "smsview_params_"), this.I);
        }
        int i10 = this.b0;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.W;
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
    @Override // org.telegram.ui.Components.vt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        String str;
        int i3;
        String str2;
        String string;
        int i10 = org.telegram.messenger.hs.g4;
        int i11 = 8;
        String str3 = null;
        if (bundle == null) {
            if (this.r0 == null || this.s0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            bd0 bd0Var = this.y;
            if (bd0Var != null) {
                bd0Var.setVisibility(0);
                org.telegram.ui.ActionBar.r6.V(this.y, org.telegram.ui.ActionBar.k6.I6, null);
                int i12 = this.j0;
                this.y.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(i12 == 17 ? 2131746060 : i12 == 16 ? 2131746058 : 2131746059, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        this.f0 = true;
        int i13 = this.i0;
        if (i13 == 15) {
            org.telegram.messenger.hs.e().b(this, i10);
        } else if (i13 == 2) {
            org.telegram.messenger.g0.E3(true);
            org.telegram.messenger.hs.e().b(this, i10);
        } else if (i13 == 3) {
            org.telegram.messenger.g0.D3(true);
            org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.h4);
            if (z10) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(23));
            }
        }
        this.I = bundle;
        this.b = bundle.getString("phone");
        this.e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.c = bundle.getString("phoneHash");
        this.b0 = bundle.getInt("timeout");
        this.W = (int) (System.currentTimeMillis() / 1000);
        this.j0 = bundle.getInt("nextType");
        this.m0 = bundle.getString("pattern");
        this.n0 = bundle.getString("prefix");
        this.p0 = bundle.getInt("length");
        this.k0 = bundle.getInt("prevType", 0);
        if (this.p0 == 0) {
            this.p0 = 5;
        }
        this.q0 = bundle.getString("url");
        this.r0 = null;
        this.s0 = null;
        this.f.b(this.p0, this.i0);
        zq[] zqVarArr = this.f.f;
        int length = zqVarArr.length;
        int i14 = 0;
        while (true) {
            int i15 = 11;
            if (i14 >= length) {
                break;
            }
            zq zqVar = zqVarArr[i14];
            zqVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.g0.C1());
            zqVar.addTextChangedListener(new n0(this, i15));
            zqVar.setOnFocusChangeListener(new ed(this, i11));
            i14++;
        }
        int i16 = this.k0;
        if (i16 == 17) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i16 == 16) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = mf.b.c().b(this.b);
        if (this.v0.r1()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("CancelAccountResetInfo2", null, 2131752587, mf.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new org.telegram.messenger.c0(false));
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31("tg://settings/change_number", (org.telegram.ui.Components.ty0) null), indexOf, lastIndexOf - 1, 33);
                str = spannableStringBuilder;
            }
        } else {
            int i17 = this.i0;
            str = i17 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentAppCodeWithPhone", null, 2131745581, org.telegram.messenger.bd.a(b10))) : i17 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentSmsCode", null, 2131745577, org.telegram.messenger.bd.a(b10))) : i17 == 3 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallCode", null, 2131745580, org.telegram.messenger.bd.a(b10))) : i17 == 4 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallOnly", null, 2131745579, org.telegram.messenger.bd.a(b10))) : i17 == 15 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentFragmentCode", null, 2131745578, org.telegram.messenger.bd.a(b10))) : "";
        }
        this.n.setText(str);
        int i18 = this.i0;
        if (i18 != 15) {
            if (i18 == 1) {
                int i19 = this.j0;
                if (i19 == 3 || i19 == 4 || i19 == 11) {
                    this.y.setText(org.telegram.messenger.bd.M0(2131751445, null));
                } else if (i19 == 15) {
                    this.y.setText(org.telegram.messenger.bd.M0(2131751448, null));
                } else if (i19 == 0) {
                    this.y.setText(org.telegram.messenger.bd.M0(2131751450, null));
                } else {
                    this.y.setText(org.telegram.messenger.bd.M0(2131751444, null));
                }
            } else {
                this.y.setText(org.telegram.messenger.bd.M0(2131751450, null));
            }
        }
        if (this.i0 != 3) {
            xd0.a1(this.v0, this.f.f[0]);
            this.f.f[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.f.f[0]);
        }
        u();
        t();
        this.d0 = System.currentTimeMillis();
        int i20 = this.i0;
        if (i20 == 1) {
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            bd0 bd0Var2 = this.y;
            if (bd0Var2 != null) {
                bd0Var2.setVisibility(0);
            }
        } else {
            int i21 = 1;
            if (i20 == 3) {
                int i22 = this.j0;
                if (i22 == 4 || i22 == 2 || i22 == 17 || i22 == 16 || i22 == 11) {
                    setProblemTextVisible(false);
                    this.w.setVisibility(0);
                    this.y.setVisibility(8);
                    int i23 = this.j0;
                    if (i23 == 4 || i23 == 11) {
                        this.w.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, 1, 0));
                    } else if (i23 == 2 || i23 == 17 || i23 == 16) {
                        this.w.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, 1, 0));
                    }
                } else {
                    this.w.setVisibility(8);
                }
                if (z10) {
                    String str4 = this.m0;
                    try {
                        Cursor query = org.telegram.messenger.t0.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
                        while (true) {
                            try {
                                if (!query.moveToNext()) {
                                    query.close();
                                    break;
                                }
                                String string2 = query.getString(0);
                                long j10 = query.getLong(i21);
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.a8.d("number = " + string2);
                                }
                                if (Math.abs(System.currentTimeMillis() - j10) < 3600000 && org.telegram.messenger.g0.x(str4, string2)) {
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
                    String str5 = this.o0;
                    if (str5 != null) {
                        h(str5);
                    } else {
                        int i24 = this.j0;
                        if (i24 == 4 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11) {
                            s();
                        }
                    }
                }
            } else {
                if (i20 == 2) {
                    int i25 = this.j0;
                    if (i25 == 2 || i25 == 17 || i25 == 16 || i25 == 4 || i25 == 3) {
                        if (i25 == 2 || i25 == 17 || i25 == 16) {
                            this.w.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, 1, 0));
                        } else {
                            this.w.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, 2, 0));
                        }
                        setProblemTextVisible(this.b0 < 1000);
                        this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                        bd0 bd0Var3 = this.y;
                        if (bd0Var3 != null) {
                            bd0Var3.setVisibility(this.b0 < 1000 ? 0 : 8);
                        }
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
                        String string3 = sharedPreferences.getString("sms_hash", null);
                        if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                            if (string.contains(string3 + "|") && !this.v0.y) {
                                str2 = string.substring(string.indexOf(org.telegram.messenger.hs.I1) + 1);
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
                        i3 = 4;
                    }
                } else {
                    i3 = 4;
                }
                if (i20 == i3) {
                    int i26 = this.j0;
                    int i27 = (i26 == 2 || i26 == 17 || i26 == 11) ? 16 : 16;
                    if (i26 == 2 || i26 == 17 || i26 == i27) {
                        this.w.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, 1, 0));
                    } else {
                        this.w.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, 2, 0));
                    }
                    setProblemTextVisible(this.b0 < 1000);
                    this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                    bd0 bd0Var4 = this.y;
                    if (bd0Var4 != null) {
                        bd0Var4.setVisibility(this.b0 < 1000 ? 0 : 8);
                    }
                    s();
                }
                if (i20 == 11) {
                    int i28 = this.j0;
                    if (i28 == 4 || i28 == 2 || i28 == 17 || i28 == 16 || i28 == 11) {
                        setProblemTextVisible(false);
                        this.w.setVisibility(0);
                        this.y.setVisibility(8);
                        int i29 = this.j0;
                        if (i29 == 4 || i29 == 11) {
                            this.w.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, 1, 0));
                        } else if (i29 == 2 || i29 == 17 || i29 == 16) {
                            this.w.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, 1, 0));
                        }
                        s();
                    }
                } else {
                    this.w.setVisibility(8);
                    bd0 bd0Var5 = this.y;
                    if (bd0Var5 != null) {
                        bd0Var5.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    r();
                }
            }
        }
        if (this.i0 == 11) {
            String str6 = this.n0;
            for (int i30 = 0; i30 < this.p0; i30++) {
                str6 = t4.c.q(str6, "0");
            }
            String b11 = mf.b.c().b("+" + str6);
            for (int i31 = 0; i31 < this.p0; i31++) {
                int lastIndexOf2 = b11.lastIndexOf("0");
                if (lastIndexOf2 >= 0) {
                    b11 = b11.substring(0, lastIndexOf2);
                }
            }
            this.J.setText(b11.replaceAll("\\)", "").replaceAll("\\(", ""));
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        zq[] zqVarArr;
        super.onConfigurationChanged(configuration);
        xq xqVar = this.f;
        if (xqVar == null || (zqVarArr = xqVar.f) == null) {
            return;
        }
        for (zq zqVar : zqVarArr) {
            zqVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.g0.C1());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.u0);
    }

    public final void p(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            xq xqVar = this.f;
            if (i3 >= xqVar.f.length) {
                xqVar.postDelayed(new tb0(8, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                xqVar.postDelayed(new wc0(this, i3, 2), i3 * 75);
                i3++;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.c0 = 15000;
        int i3 = this.b0;
        if (i3 > 15000) {
            this.c0 = i3;
        }
        this.V = new Timer();
        this.e0 = System.currentTimeMillis();
        this.V.schedule(new cd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        bd0 bd0Var = this.w;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        bd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i3));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new cd0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.a0) {
                try {
                    Timer timer = this.V;
                    if (timer != null) {
                        timer.cancel();
                        this.V = null;
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
        bd0 bd0Var = this.w;
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i3));
        try {
            synchronized (this.a0) {
                try {
                    Timer timer = this.U;
                    if (timer != null) {
                        timer.cancel();
                        this.U = null;
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.v0.r1() ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int i10 = this.i0;
        if (i10 == 11) {
            int i11 = org.telegram.ui.ActionBar.k6.y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            int i12 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            xd0.l1(this.M, x03, i12, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            xd0.l1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        }
        q(this.a);
        q(this.Q);
        q(this.R);
        q(this.S);
        xq xqVar = this.f;
        if (xqVar != null) {
            xqVar.invalidate();
        }
        bd0 bd0Var = this.w;
        Integer num = (Integer) bd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.D6);
        }
        bd0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
        if (i10 != 15) {
            this.y.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
    }

    public final void v() {
        int i3;
        if (this.g0 || this.l0) {
            return;
        }
        xd0 xd0Var = this.v0;
        if (xd0Var.q0) {
            return;
        }
        this.l0 = true;
        this.w.invalidate();
        this.y.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.b);
        bundle.putString("ephone", this.e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.i0);
        this.g0 = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.c;
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode, new vc0(this, bundle, 1), 10));
    }

    public final void w() {
        xq xqVar = this.f;
        try {
            xqVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i3 = 0;
        while (true) {
            zq[] zqVarArr = xqVar.f;
            if (i3 >= zqVarArr.length) {
                break;
            }
            zqVarArr[i3].setText("");
            xqVar.f[i3].z(1.0f);
            i3++;
        }
        kb0 kb0Var = this.x;
        if (kb0Var.getCurrentView() != this.F) {
            kb0Var.showNext();
        }
        xqVar.f[0].requestFocus();
        org.telegram.messenger.g0.G3(this.i0 == 11 ? 3.5f : 10.0f, xqVar, new rc0(this, 7));
        rc0 rc0Var = this.u0;
        removeCallbacks(rc0Var);
        postDelayed(rc0Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q == null) {
            this.v0.t1(z10, true);
            return;
        }
        if (this.T) {
            this.T = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.ch0 ch0Var = this.R;
            ch0Var.K(0);
            ch0Var.S(ch0Var.e[0] - 1, new rc0(this, 1));
        }
    }

    public final void z(int i3) {
        org.telegram.ui.Components.ch0 ch0Var = this.Q;
        if (ch0Var == null) {
            this.v0.w1(i3, true);
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        org.telegram.ui.Components.ch0 ch0Var2 = this.a;
        if (ch0Var2.b0 != ch0Var2.e[0] - 1) {
            ch0Var2.u0 = new wc0(this, i3, 0);
            return;
        }
        ch0Var.u0 = new rc0(this, 3);
        org.telegram.ui.Components.fh0 fh0Var = this.s;
        fh0Var.setAutoRepeat(false);
        ch0Var.N(0, false, false);
        fh0Var.setAnimation(ch0Var);
        fh0Var.d();
    }
}
