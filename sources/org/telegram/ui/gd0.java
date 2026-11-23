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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gd0 extends org.telegram.ui.Components.iu0 implements org.telegram.messenger.gs {
    public static final /* synthetic */ int w0 = 0;
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.rh0 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final org.telegram.ui.Components.oh0 Q;
    public final org.telegram.ui.Components.oh0 R;
    public final org.telegram.ui.Components.oh0 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final org.telegram.ui.Components.oh0 a;
    public final Object a0;
    public String b;
    public int b0;
    public String c;
    public int c0;
    public String d;
    public double d0;
    public String e;
    public double e0;
    public final br f;
    public boolean f0;
    public boolean g0;
    public final eb0 h;
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
    public final org.telegram.ui.Components.rh0 s;
    public TLRPC.TL_auth_sentCode s0;
    public boolean t0;
    public final tc0 u0;
    public final /* synthetic */ de0 v0;
    public final ed0 w;
    public final ob0 x;
    public final ed0 y;

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
    public gd0(de0 de0Var, Context context, int i7) {
        super(context);
        ViewGroup viewGroup;
        this.v0 = de0Var;
        this.a0 = new Object();
        this.b0 = 60000;
        this.c0 = 15000;
        this.h0 = "";
        this.l0 = false;
        this.m0 = "*";
        this.n0 = "";
        this.u0 = new tc0(this, 2);
        this.i0 = i7;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        i5.c.x(textView2, 1, 18.0f);
        textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String N0 = de0Var.G != 1 ? null : org.telegram.messenger.hd.N0(2131752576, null);
        if (i7 == 11) {
            textView2.setText(N0 == null ? org.telegram.messenger.hd.N0(2131748218, null) : N0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.M = imageView;
            ImageView imageView2 = new ImageView(context);
            this.N = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, c8.ma.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, c8.ma.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.K = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748220, null)));
            addView(textView3, c8.ma.t(-1, -2, 49, 36, 16, 36, 0));
            dd0 dd0Var = new dd0(this, context, 0);
            this.f = dd0Var;
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            TextView textView4 = new TextView(context);
            this.J = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            g10.addView(textView4, c8.ma.t(-2, -1, 16, 0, 0, 4, 0));
            g10.addView(dd0Var, c8.ma.o(-2, -1));
            addView(g10, c8.ma.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.L = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            textView5.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748219, null)));
            addView(textView5, c8.ma.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i7 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, c8.ma.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, c8.ma.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, c8.ma.e(-2, -2, 1));
                org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
                this.s = rh0Var;
                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(R.raw.phone_flash_call, org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(64.0f), true, null);
                this.a = oh0Var;
                rh0Var.setAnimation(oh0Var);
                frameLayout3.addView(rh0Var, c8.ma.c(64.0f, 64));
                textView2.setText(N0 == null ? org.telegram.messenger.hd.N0(2131742561, null) : N0);
                linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i7 != 11) {
                    dd0 dd0Var2 = new dd0(this, context, 1);
                    this.f = dd0Var2;
                    addView(dd0Var2, c8.ma.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i7 == 3) {
                    this.f.setVisibility(8);
                }
                eb0 eb0Var = new eb0(de0Var, context);
                this.h = eb0Var;
                int i11 = org.telegram.ui.ActionBar.m6.I6;
                org.telegram.ui.ActionBar.t6.G(eb0Var, i11, null);
                org.telegram.ui.ActionBar.t6.U(eb0Var, i11, de0Var.getResourceProvider());
                eb0Var.setTextSize(1, 14.0f);
                eb0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                eb0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                final int i12 = 0;
                eb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ad0
                    public final /* synthetic */ gd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i12;
                        gd0 gd0Var = this.b;
                        switch (i14) {
                            case 0:
                                gd0Var.c(true);
                                break;
                            case 1:
                                ed0 ed0Var = gd0Var.w;
                                if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                                    gd0Var.l0 = true;
                                    ed0Var.invalidate();
                                    org.telegram.ui.ActionBar.t6.U(ed0Var, org.telegram.ui.ActionBar.m6.I6, null);
                                    int i15 = gd0Var.j0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.C3(false);
                                            org.telegram.messenger.ls.e().n(gd0Var, org.telegram.messenger.ls.j4);
                                            gd0Var.f0 = false;
                                            gd0Var.t();
                                            gd0Var.l0 = false;
                                            gd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            ed0Var.setText(org.telegram.messenger.hd.N0(2131752585, null));
                                        } else {
                                            ed0Var.setText(org.telegram.messenger.hd.N0(2131745381, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", gd0Var.b);
                                        bundle.putString("ephone", gd0Var.e);
                                        bundle.putString("phoneFormated", gd0Var.d);
                                        bundle.putInt("prevType", gd0Var.i0);
                                        gd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = gd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = gd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.g2) gd0Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new xc0(gd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    gd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(gd0Var.q0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                addView(eb0Var, c8.ma.t(-2, -2, 1, 0, 18, 0, 0));
                eb0Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.E = frameLayout4;
                ed0 ed0Var = new ed0(this, context, 0);
                this.w = ed0Var;
                org.telegram.ui.ActionBar.t6.G(ed0Var, i11, null);
                ed0Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                ed0Var.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                ed0Var.setTextSize(1, 15.0f);
                ed0Var.setGravity(51);
                ed0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ad0
                    public final /* synthetic */ gd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        int i14 = i10;
                        gd0 gd0Var = this.b;
                        switch (i14) {
                            case 0:
                                gd0Var.c(true);
                                break;
                            case 1:
                                ed0 ed0Var2 = gd0Var.w;
                                if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                                    gd0Var.l0 = true;
                                    ed0Var2.invalidate();
                                    org.telegram.ui.ActionBar.t6.U(ed0Var2, org.telegram.ui.ActionBar.m6.I6, null);
                                    int i15 = gd0Var.j0;
                                    int i16 = 0;
                                    if (i15 != 4 && i15 != 2 && i15 != 17 && i15 != 16 && i15 != 11 && i15 != 15) {
                                        if (i15 == 3) {
                                            org.telegram.messenger.g0.C3(false);
                                            org.telegram.messenger.ls.e().n(gd0Var, org.telegram.messenger.ls.j4);
                                            gd0Var.f0 = false;
                                            gd0Var.t();
                                            gd0Var.l0 = false;
                                            gd0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i15 == 4 || i15 == 11) {
                                            ed0Var2.setText(org.telegram.messenger.hd.N0(2131752585, null));
                                        } else {
                                            ed0Var2.setText(org.telegram.messenger.hd.N0(2131745381, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", gd0Var.b);
                                        bundle.putString("ephone", gd0Var.e);
                                        bundle.putString("phoneFormated", gd0Var.d);
                                        bundle.putInt("prevType", gd0Var.i0);
                                        gd0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = gd0Var.d;
                                        tL_auth_resendCode.phone_code_hash = gd0Var.c;
                                        i13 = ((org.telegram.ui.ActionBar.g2) gd0Var.v0).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new xc0(gd0Var, bundle, i16), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    gd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(gd0Var.q0)));
                                    break;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(ed0Var, c8.ma.e(-2, -2, 49));
                ob0 ob0Var = new ob0(context, i10);
                this.x = ob0Var;
                if (i7 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.zs.e;
                    loadAnimation.setInterpolator(interpolator);
                    ob0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    ob0Var.setOutAnimation(loadAnimation2);
                    ed0 ed0Var2 = new ed0(this, context, 1);
                    this.y = ed0Var2;
                    ed0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    ed0Var2.setTextSize(1, 15.0f);
                    ed0Var2.setGravity(49);
                    ed0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
                    frameLayout4.addView(ed0Var2, c8.ma.e(-1, -2, 17));
                    ob0Var.addView(frameLayout4, c8.ma.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.nr.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    ob0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    ob0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.G = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    int L = org.telegram.messenger.g0.L(6.0f);
                    int i13 = org.telegram.ui.ActionBar.m6.Ni;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                    int i14 = org.telegram.ui.ActionBar.m6.Q9;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
                    linearLayout2.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(linearLayout2, k02, M, M2, null);
                    final int i15 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ad0
                        public final /* synthetic */ gd0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i132;
                            int i142 = i15;
                            gd0 gd0Var = this.b;
                            switch (i142) {
                                case 0:
                                    gd0Var.c(true);
                                    break;
                                case 1:
                                    ed0 ed0Var22 = gd0Var.w;
                                    if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                                        gd0Var.l0 = true;
                                        ed0Var22.invalidate();
                                        org.telegram.ui.ActionBar.t6.U(ed0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                                        int i152 = gd0Var.j0;
                                        int i16 = 0;
                                        if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                            if (i152 == 3) {
                                                org.telegram.messenger.g0.C3(false);
                                                org.telegram.messenger.ls.e().n(gd0Var, org.telegram.messenger.ls.j4);
                                                gd0Var.f0 = false;
                                                gd0Var.t();
                                                gd0Var.l0 = false;
                                                gd0Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i152 == 4 || i152 == 11) {
                                                ed0Var22.setText(org.telegram.messenger.hd.N0(2131752585, null));
                                            } else {
                                                ed0Var22.setText(org.telegram.messenger.hd.N0(2131745381, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", gd0Var.b);
                                            bundle.putString("ephone", gd0Var.e);
                                            bundle.putString("phoneFormated", gd0Var.d);
                                            bundle.putInt("prevType", gd0Var.i0);
                                            gd0Var.r();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = gd0Var.d;
                                            tL_auth_resendCode.phone_code_hash = gd0Var.c;
                                            i132 = ((org.telegram.ui.ActionBar.g2) gd0Var.v0).currentAccount;
                                            ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new xc0(gd0Var, bundle, i16), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        gd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(gd0Var.q0)));
                                        break;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                            }
                        }
                    });
                    ob0Var.addView(linearLayout2, c8.ma.c(52.0f, -1));
                    org.telegram.ui.Components.rh0 rh0Var2 = new org.telegram.ui.Components.rh0(context);
                    this.H = rh0Var2;
                    rh0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(rh0Var2, c8.ma.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(org.telegram.messenger.hd.N0(2131747611, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(org.telegram.messenger.g0.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.F = textView7;
                textView7.setText(org.telegram.messenger.hd.N0(2131742595, null));
                textView7.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                ob0Var.addView(textView7, c8.ma.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(ob0Var, c8.ma.d(i7 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, c8.ma.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(ob0Var, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                h6.m.i(ob0Var);
                if (i7 == 15) {
                    this.y.setOnClickListener(new org.telegram.ui.Components.q31(28, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, c8.ma.t(-2, -2, 49, 0, 16, 0, 0));
            int i16 = i7 == 1 ? 128 : 64;
            if (i7 == 1) {
                float f10 = i16;
                this.a = new org.telegram.ui.Components.oh0(R.raw.code_laptop, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), true, null);
            } else {
                float f11 = i16;
                this.a = new org.telegram.ui.Components.oh0(R.raw.sms_incoming_info, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
                this.Q = new org.telegram.ui.Components.oh0(R.raw.phone_stars_to_dots, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
                this.R = new org.telegram.ui.Components.oh0(R.raw.phone_dots, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
                this.S = new org.telegram.ui.Components.oh0(R.raw.phone_dots_to_stars, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), true, null);
            }
            org.telegram.ui.Components.rh0 rh0Var3 = new org.telegram.ui.Components.rh0(context);
            this.s = rh0Var3;
            rh0Var3.setAnimation(this.a);
            if (i7 == 1 && !org.telegram.messenger.g0.O1()) {
                rh0Var3.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
            }
            frameLayout6.addView(rh0Var3, c8.ma.d(i16, i16, 51, 0.0f, 0.0f, 0.0f, (i7 != 1 || org.telegram.messenger.g0.O1()) ? 0.0f : -org.telegram.messenger.g0.L(16.0f)));
            if (N0 == null) {
                N0 = org.telegram.messenger.hd.N0(i7 == 1 ? 2131745376 : 2131745370, null);
            }
            textView2.setText(N0);
            addView(textView2, c8.ma.t(-2, -2, 49, 0, 18, 0, 0));
            int i17 = i7 == 15 ? 16 : 0;
            addView(textView, c8.ma.t(-2, -2, 49, i17, 17, i17, 0));
        }
        viewGroup = null;
        if (i7 != 11) {
        }
        if (i7 == 3) {
        }
        eb0 eb0Var2 = new eb0(de0Var, context);
        this.h = eb0Var2;
        int i112 = org.telegram.ui.ActionBar.m6.I6;
        org.telegram.ui.ActionBar.t6.G(eb0Var2, i112, null);
        org.telegram.ui.ActionBar.t6.U(eb0Var2, i112, de0Var.getResourceProvider());
        eb0Var2.setTextSize(1, 14.0f);
        eb0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        eb0Var2.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        final int i122 = 0;
        eb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ad0
            public final /* synthetic */ gd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i122;
                gd0 gd0Var = this.b;
                switch (i142) {
                    case 0:
                        gd0Var.c(true);
                        break;
                    case 1:
                        ed0 ed0Var22 = gd0Var.w;
                        if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                            gd0Var.l0 = true;
                            ed0Var22.invalidate();
                            org.telegram.ui.ActionBar.t6.U(ed0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                            int i152 = gd0Var.j0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.C3(false);
                                    org.telegram.messenger.ls.e().n(gd0Var, org.telegram.messenger.ls.j4);
                                    gd0Var.f0 = false;
                                    gd0Var.t();
                                    gd0Var.l0 = false;
                                    gd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    ed0Var22.setText(org.telegram.messenger.hd.N0(2131752585, null));
                                } else {
                                    ed0Var22.setText(org.telegram.messenger.hd.N0(2131745381, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", gd0Var.b);
                                bundle.putString("ephone", gd0Var.e);
                                bundle.putString("phoneFormated", gd0Var.d);
                                bundle.putInt("prevType", gd0Var.i0);
                                gd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = gd0Var.d;
                                tL_auth_resendCode.phone_code_hash = gd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.g2) gd0Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new xc0(gd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            gd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(gd0Var.q0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        addView(eb0Var2, c8.ma.t(-2, -2, 1, 0, 18, 0, 0));
        eb0Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.E = frameLayout42;
        ed0 ed0Var3 = new ed0(this, context, 0);
        this.w = ed0Var3;
        org.telegram.ui.ActionBar.t6.G(ed0Var3, i112, null);
        ed0Var3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ed0Var3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f));
        ed0Var3.setTextSize(1, 15.0f);
        ed0Var3.setGravity(51);
        ed0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ad0
            public final /* synthetic */ gd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i10;
                gd0 gd0Var = this.b;
                switch (i142) {
                    case 0:
                        gd0Var.c(true);
                        break;
                    case 1:
                        ed0 ed0Var22 = gd0Var.w;
                        if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                            gd0Var.l0 = true;
                            ed0Var22.invalidate();
                            org.telegram.ui.ActionBar.t6.U(ed0Var22, org.telegram.ui.ActionBar.m6.I6, null);
                            int i152 = gd0Var.j0;
                            int i162 = 0;
                            if (i152 != 4 && i152 != 2 && i152 != 17 && i152 != 16 && i152 != 11 && i152 != 15) {
                                if (i152 == 3) {
                                    org.telegram.messenger.g0.C3(false);
                                    org.telegram.messenger.ls.e().n(gd0Var, org.telegram.messenger.ls.j4);
                                    gd0Var.f0 = false;
                                    gd0Var.t();
                                    gd0Var.l0 = false;
                                    gd0Var.v();
                                    break;
                                }
                            } else {
                                if (i152 == 4 || i152 == 11) {
                                    ed0Var22.setText(org.telegram.messenger.hd.N0(2131752585, null));
                                } else {
                                    ed0Var22.setText(org.telegram.messenger.hd.N0(2131745381, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", gd0Var.b);
                                bundle.putString("ephone", gd0Var.e);
                                bundle.putString("phoneFormated", gd0Var.d);
                                bundle.putInt("prevType", gd0Var.i0);
                                gd0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = gd0Var.d;
                                tL_auth_resendCode.phone_code_hash = gd0Var.c;
                                i132 = ((org.telegram.ui.ActionBar.g2) gd0Var.v0).currentAccount;
                                ConnectionsManager.getInstance(i132).sendRequest(tL_auth_resendCode, new xc0(gd0Var, bundle, i162), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            gd0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(gd0Var.q0)));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(ed0Var3, c8.ma.e(-2, -2, 49));
        ob0 ob0Var2 = new ob0(context, i10);
        this.x = ob0Var2;
        if (i7 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.F = textView72;
        textView72.setText(org.telegram.messenger.hd.N0(2131742595, null));
        textView72.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        ob0Var2.addView(textView72, c8.ma.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        h6.m.i(ob0Var2);
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
    public static void n(gd0 gd0Var, Context context) {
        boolean z10;
        int i7;
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
            sb2.append(gd0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str2);
            sb2.append(gd0Var.v0.e ? " #paidauth" : "");
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
            sb3.append(gd0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(gd0Var.getContext());
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
                    sb3.append(org.telegram.messenger.s2.d);
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
                    sb3.append(!gd0Var.v0.e ? "no_otp" : "no_otp_paid");
                    sb3.append("\n");
                    if (!TextUtils.isEmpty(gd0Var.h0)) {
                        sb3.append("Error: ");
                        sb3.append(gd0Var.h0);
                        sb3.append("\n");
                    }
                    sb3.append("\n\n================================================\n");
                    sb3.append("WRITE YOUR COMMENT HERE:\n");
                    sb3.append("\n");
                    sb3.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                    gd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
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
            sb3.append(org.telegram.messenger.s2.d);
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
            sb3.append(!gd0Var.v0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(gd0Var.h0)) {
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            gd0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            gd0Var.v0.D1(org.telegram.messenger.hd.N0(R.string.AppName, null), org.telegram.messenger.hd.N0(2131748006, "NoMailInstalled"));
        }
    }

    public static void q(org.telegram.ui.Components.oh0 oh0Var) {
        if (oh0Var != null) {
            oh0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            oh0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Phone");
            oh0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        ed0 ed0Var = this.y;
        if (ed0Var == null) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (ed0Var.getAlpha() != f10) {
            ed0Var.animate().cancel();
            ed0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public final boolean a() {
        return this.i0 != 3;
    }

    @Override // org.telegram.ui.Components.iu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.iu0
    public final boolean c(boolean z10) {
        int i7;
        de0 de0Var = this.v0;
        int i10 = 0;
        if (de0Var.G != 0) {
            de0Var.finishFragment();
            return false;
        }
        int i11 = this.k0;
        if (i11 != 0) {
            de0Var.M1(i11, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131751251, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("EditNumberInfo", null, 2131751250, this.b));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752029, null), null);
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751323, null), new vc0(this, i10));
            de0Var.showDialog(t1Var);
            return false;
        }
        this.g0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.l5(23), 10);
        u();
        t();
        this.I = null;
        int i12 = org.telegram.messenger.ls.j4;
        int i13 = this.i0;
        if (i13 == 15) {
            org.telegram.messenger.ls.e().n(this, i12);
        } else if (i13 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ls.e().n(this, i12);
        } else if (i13 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.k4);
        }
        this.f0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.iu0
    public final void d() {
        this.g0 = false;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f0) {
            br brVar = this.f;
            if (brVar.f == null) {
                return;
            }
            if (i7 == org.telegram.messenger.ls.j4) {
                brVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i7 == org.telegram.messenger.ls.k4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.m0, str)) {
                    if (!this.m0.equals("*")) {
                        this.o0 = str;
                        org.telegram.messenger.g0.T();
                    }
                    h(str);
                    int i11 = CallReceiver.a;
                    org.telegram.messenger.cz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public final void f() {
        int i7 = org.telegram.messenger.ls.j4;
        int i10 = this.i0;
        if (i10 == 15) {
            org.telegram.messenger.ls.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ls.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.k4);
        }
        this.f0 = false;
        u();
        t();
    }

    @Override // org.telegram.ui.Components.iu0
    public final void g() {
        Bundle bundle;
        this.l0 = false;
        this.g0 = false;
        if (this.k0 == 0 || (bundle = this.I) == null) {
            return;
        }
        bundle.putInt("timeout", this.b0);
    }

    @Override // org.telegram.ui.Components.iu0
    public String getHeaderName() {
        int i7 = this.i0;
        return (i7 == 3 || i7 == 11) ? this.b : org.telegram.messenger.hd.N0(2131742561, "YourCode");
    }

    @Override // org.telegram.ui.Components.iu0
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        de0 de0Var = this.v0;
        int i12 = de0Var.a;
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
        br brVar = this.f;
        if (str == null) {
            str = brVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            de0.c1(de0Var, brVar, false);
            return;
        }
        int i14 = de0Var.a;
        if (i14 < 1 || i14 > 4 || !brVar.e) {
            this.g0 = true;
            int i15 = org.telegram.messenger.ls.j4;
            int i16 = this.i0;
            if (i16 == 15) {
                org.telegram.messenger.ls.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ls.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.k4);
            }
            this.f0 = false;
            int i17 = de0Var.G;
            if (i17 == 1) {
                this.d = de0Var.H;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                u();
                brVar.e = true;
                er[] erVarArr = brVar.f;
                int length = erVarArr.length;
                while (i13 < length) {
                    erVarArr[i13].B(0.0f);
                    i13++;
                }
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new e00(11, this, confirmphone), 2));
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
                    erVarArr2[i13].B(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                de0Var.N1(true, true);
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
                erVarArr3[i13].B(0.0f);
                i13++;
            }
            i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new uc0(this, tL_auth_signIn, 0), 10));
            de0Var.N1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public final void j() {
        org.telegram.ui.Components.oh0 oh0Var = this.a;
        if (oh0Var != null) {
            oh0Var.M(0);
        }
        org.telegram.messenger.g0.h3(new tc0(this, 0), de0.A0);
    }

    @Override // org.telegram.ui.Components.iu0
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.i0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.o0 = string;
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
            this.b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public final void l(Bundle bundle) {
        String code = this.f.getCode();
        int length = code.length();
        int i7 = this.i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(i5.c.i(i7, "smsview_params_"), this.I);
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

    /* JADX WARN: Code restructure failed: missing block: B:192:0x052e, code lost:
    
        if (r2 == 16) goto L225;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0517  */
    @Override // org.telegram.ui.Components.iu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        String str;
        int i7;
        String str2;
        String string;
        int i10 = org.telegram.messenger.ls.j4;
        int i11 = 0;
        int i12 = 8;
        String str3 = null;
        if (bundle == null) {
            if (this.r0 == null || this.s0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            ed0 ed0Var = this.y;
            if (ed0Var != null) {
                ed0Var.setVisibility(0);
                org.telegram.ui.ActionBar.t6.U(this.y, org.telegram.ui.ActionBar.m6.I6, null);
                int i13 = this.j0;
                this.y.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.N0(i13 == 17 ? 2131745854 : i13 == 16 ? 2131745852 : 2131745853, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        this.f0 = true;
        int i14 = this.i0;
        if (i14 == 15) {
            org.telegram.messenger.ls.e().b(this, i10);
        } else if (i14 == 2) {
            org.telegram.messenger.g0.C3(true);
            org.telegram.messenger.ls.e().b(this, i10);
        } else if (i14 == 3) {
            org.telegram.messenger.g0.B3(true);
            org.telegram.messenger.ls.e().b(this, org.telegram.messenger.ls.k4);
            if (z10) {
                org.telegram.messenger.g0.g3(new cd0(i11));
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
        er[] erVarArr = this.f.f;
        int length = erVarArr.length;
        int i15 = 0;
        while (true) {
            int i16 = 11;
            if (i15 >= length) {
                break;
            }
            er erVar = erVarArr[i15];
            erVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.g0.C1());
            erVar.addTextChangedListener(new m0(this, i16));
            erVar.setOnFocusChangeListener(new ed(this, i12));
            i15++;
        }
        int i17 = this.k0;
        if (i17 == 17) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.N0(2131753751, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i17 == 16) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.N0(2131753750, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = pf.b.c().b(this.b);
        if (this.v0.A1()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("CancelAccountResetInfo2", null, 2131752575, pf.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new org.telegram.messenger.c0(false));
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.s41("tg://settings/change_number", (org.telegram.ui.Components.fz0) null), indexOf, lastIndexOf - 1, 33);
                str = spannableStringBuilder;
            }
        } else {
            int i18 = this.i0;
            str = i18 == 1 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SentAppCodeWithPhone", null, 2131745375, org.telegram.messenger.hd.a(b10))) : i18 == 2 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SentSmsCode", null, 2131745371, org.telegram.messenger.hd.a(b10))) : i18 == 3 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SentCallCode", null, 2131745374, org.telegram.messenger.hd.a(b10))) : i18 == 4 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SentCallOnly", null, 2131745373, org.telegram.messenger.hd.a(b10))) : i18 == 15 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("SentFragmentCode", null, 2131745372, org.telegram.messenger.hd.a(b10))) : "";
        }
        this.n.setText(str);
        int i19 = this.i0;
        if (i19 != 15) {
            if (i19 == 1) {
                int i20 = this.j0;
                if (i20 == 3 || i20 == 4 || i20 == 11) {
                    this.y.setText(org.telegram.messenger.hd.N0(2131751432, null));
                } else if (i20 == 15) {
                    this.y.setText(org.telegram.messenger.hd.N0(2131751435, null));
                } else if (i20 == 0) {
                    this.y.setText(org.telegram.messenger.hd.N0(2131751437, null));
                } else {
                    this.y.setText(org.telegram.messenger.hd.N0(2131751431, null));
                }
            } else {
                this.y.setText(org.telegram.messenger.hd.N0(2131751437, null));
            }
        }
        if (this.i0 != 3) {
            de0.b1(this.v0, this.f.f[0]);
            this.f.f[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.f.f[0]);
        }
        u();
        t();
        this.d0 = System.currentTimeMillis();
        int i21 = this.i0;
        if (i21 == 1) {
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            ed0 ed0Var2 = this.y;
            if (ed0Var2 != null) {
                ed0Var2.setVisibility(0);
            }
        } else {
            int i22 = 1;
            if (i21 == 3) {
                int i23 = this.j0;
                if (i23 == 4 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                    setProblemTextVisible(false);
                    this.w.setVisibility(0);
                    this.y.setVisibility(8);
                    int i24 = this.j0;
                    if (i24 == 4 || i24 == 11) {
                        this.w.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752618, 1, 0));
                    } else if (i24 == 2 || i24 == 17 || i24 == 16) {
                        this.w.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745101, 1, 0));
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
                                long j3 = query.getLong(i22);
                                if (org.telegram.messenger.s2.a) {
                                    org.telegram.messenger.a8.d("number = " + string2);
                                }
                                if (Math.abs(System.currentTimeMillis() - j3) < 3600000 && org.telegram.messenger.g0.x(str4, string2)) {
                                    query.close();
                                    str3 = string2;
                                    break;
                                }
                                i22 = 1;
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
                        int i25 = this.j0;
                        if (i25 == 4 || i25 == 2 || i25 == 17 || i25 == 16 || i25 == 11) {
                            s();
                        }
                    }
                }
            } else {
                if (i21 == 2) {
                    int i26 = this.j0;
                    if (i26 == 2 || i26 == 17 || i26 == 16 || i26 == 4 || i26 == 3) {
                        if (i26 == 2 || i26 == 17 || i26 == 16) {
                            this.w.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745101, 1, 0));
                        } else {
                            this.w.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752618, 2, 0));
                        }
                        setProblemTextVisible(this.b0 < 1000);
                        this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                        ed0 ed0Var3 = this.y;
                        if (ed0Var3 != null) {
                            ed0Var3.setVisibility(this.b0 < 1000 ? 0 : 8);
                        }
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
                        String string3 = sharedPreferences.getString("sms_hash", null);
                        if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                            if (string.contains(string3 + "|") && !this.v0.y) {
                                str2 = string.substring(string.indexOf(org.telegram.messenger.ls.I1) + 1);
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
                if (i21 == i7) {
                    int i27 = this.j0;
                    int i28 = (i27 == 2 || i27 == 17 || i27 == 11) ? 16 : 16;
                    if (i27 == 2 || i27 == 17 || i27 == i28) {
                        this.w.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745101, 1, 0));
                    } else {
                        this.w.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752618, 2, 0));
                    }
                    setProblemTextVisible(this.b0 < 1000);
                    this.w.setVisibility(this.b0 < 1000 ? 8 : 0);
                    ed0 ed0Var4 = this.y;
                    if (ed0Var4 != null) {
                        ed0Var4.setVisibility(this.b0 < 1000 ? 0 : 8);
                    }
                    s();
                }
                if (i21 == 11) {
                    int i29 = this.j0;
                    if (i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                        setProblemTextVisible(false);
                        this.w.setVisibility(0);
                        this.y.setVisibility(8);
                        int i30 = this.j0;
                        if (i30 == 4 || i30 == 11) {
                            this.w.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752618, 1, 0));
                        } else if (i30 == 2 || i30 == 17 || i30 == 16) {
                            this.w.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745101, 1, 0));
                        }
                        s();
                    }
                } else {
                    this.w.setVisibility(8);
                    ed0 ed0Var5 = this.y;
                    if (ed0Var5 != null) {
                        ed0Var5.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    r();
                }
            }
        }
        if (this.i0 == 11) {
            String str6 = this.n0;
            for (int i31 = 0; i31 < this.p0; i31++) {
                str6 = p5.c.v(str6, "0");
            }
            String b11 = pf.b.c().b("+" + str6);
            for (int i32 = 0; i32 < this.p0; i32++) {
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
        removeCallbacks(this.u0);
    }

    public final void p(Runnable runnable) {
        if (this.i0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            br brVar = this.f;
            if (i7 >= brVar.f.length) {
                brVar.postDelayed(new h60(26, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                brVar.postDelayed(new yc0(this, i7, 2), i7 * 75);
                i7++;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.c0 = 15000;
        int i7 = this.b0;
        if (i7 > 15000) {
            this.c0 = i7;
        }
        this.V = new Timer();
        this.e0 = System.currentTimeMillis();
        this.V.schedule(new fd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        ed0 ed0Var = this.w;
        org.telegram.ui.ActionBar.t6.U(ed0Var, i7, null);
        ed0Var.setTag(R.id.color_key_tag, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new fd0(this, 1), 0L, 1000L);
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
        ed0 ed0Var = this.w;
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        org.telegram.ui.ActionBar.t6.U(ed0Var, i7, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i7));
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

    @Override // org.telegram.ui.Components.iu0
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.v0.A1() ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false));
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = this.i0;
        if (i10 == 11) {
            int i11 = org.telegram.ui.ActionBar.m6.y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.l6, false);
            int i12 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            de0.u1(this.M, x03, i12, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            de0.u1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        }
        q(this.a);
        q(this.Q);
        q(this.R);
        q(this.S);
        br brVar = this.f;
        if (brVar != null) {
            brVar.invalidate();
        }
        ed0 ed0Var = this.w;
        Integer num = (Integer) ed0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.m6.D6);
        }
        ed0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, num.intValue(), false));
        if (i10 != 15) {
            this.y.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false));
    }

    public final void v() {
        int i7;
        if (this.g0 || this.l0) {
            return;
        }
        de0 de0Var = this.v0;
        if (de0Var.r0) {
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
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new xc0(this, bundle, 1), 10));
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
            brVar.f[i7].A(1.0f);
            i7++;
        }
        ob0 ob0Var = this.x;
        if (ob0Var.getCurrentView() != this.F) {
            ob0Var.showNext();
        }
        brVar.f[0].requestFocus();
        org.telegram.messenger.g0.E3(this.i0 == 11 ? 3.5f : 10.0f, brVar, new tc0(this, 7));
        tc0 tc0Var = this.u0;
        removeCallbacks(tc0Var);
        postDelayed(tc0Var, 5000L);
        this.t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q == null) {
            this.v0.C1(z10, true);
            return;
        }
        if (this.T) {
            this.T = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.oh0 oh0Var = this.R;
            oh0Var.K(0);
            oh0Var.S(oh0Var.e[0] - 1, new tc0(this, 1));
        }
    }

    public final void z(int i7) {
        org.telegram.ui.Components.oh0 oh0Var = this.Q;
        if (oh0Var == null) {
            this.v0.F1(i7, true);
            return;
        }
        if (this.T) {
            return;
        }
        this.T = true;
        org.telegram.ui.Components.oh0 oh0Var2 = this.a;
        if (oh0Var2.b0 != oh0Var2.e[0] - 1) {
            oh0Var2.u0 = new yc0(this, i7, 0);
            return;
        }
        oh0Var.u0 = new tc0(this, 3);
        org.telegram.ui.Components.rh0 rh0Var = this.s;
        rh0Var.setAutoRepeat(false);
        oh0Var.N(0, false, false);
        rh0Var.setAnimation(oh0Var);
        rh0Var.d();
    }
}
