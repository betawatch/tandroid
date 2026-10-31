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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class me0 extends org.telegram.ui.Components.zu0 implements org.telegram.messenger.us {
    public static final /* synthetic */ int v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.ei0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.bi0 P;
    public final org.telegram.ui.Components.bi0 Q;
    public final org.telegram.ui.Components.bi0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.bi0 a;
    public int a0;
    public String b;
    public int b0;
    public String c;
    public double c0;
    public String d;
    public double d0;
    public String e;
    public boolean e0;
    public final zr f;
    public boolean f0;
    public String g0;
    public final mc0 h;
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
    public final org.telegram.ui.Components.ei0 s;
    public boolean s0;
    public final ae0 t0;
    public final /* synthetic */ hf0 u0;
    public final ke0 w;
    public final vc0 x;
    public final ke0 y;

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
    public me0(hf0 hf0Var, Context context, int i10) {
        super(context);
        ViewGroup viewGroup;
        this.u0 = hf0Var;
        this.W = new Object();
        this.a0 = 60000;
        this.b0 = 15000;
        this.g0 = "";
        this.k0 = false;
        this.l0 = "*";
        this.m0 = "";
        this.t0 = new ae0(this, 2);
        this.h0 = i10;
        final int i11 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        sc.e.t(textView2, 1, 18.0f);
        textView2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        String L0 = hf0Var.F != 1 ? null : org.telegram.messenger.cd.L0(2131752588, null);
        if (i10 == 11) {
            textView2.setText(L0 == null ? org.telegram.messenger.cd.L0(2131748426, null) : L0);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            this.L = imageView;
            ImageView imageView2 = new ImageView(context);
            this.M = imageView2;
            frameLayout.addView(imageView);
            frameLayout.addView(imageView2);
            imageView.setImageResource(R.drawable.login_arrow1);
            imageView2.setImageResource(R.drawable.login_phone1);
            addView(frameLayout, w7.b6.t(64, 64, 1, 0, 16, 0, 0));
            addView(textView2, w7.b6.t(-2, -2, 49, 0, 8, 0, 0));
            TextView textView3 = new TextView(context);
            this.J = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            textView3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748428, null)));
            addView(textView3, w7.b6.t(-1, -2, 49, 36, 16, 36, 0));
            je0 je0Var = new je0(this, context, 0);
            this.f = je0Var;
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
            TextView textView4 = new TextView(context);
            this.I = textView4;
            textView4.setTextSize(1, 20.0f);
            textView4.setMaxLines(1);
            textView4.setTypeface(org.telegram.messenger.i0.o());
            textView4.setPadding(0, 0, 0, 0);
            textView4.setGravity(16);
            f7.addView(textView4, w7.b6.t(-2, -1, 16, 0, 0, 4, 0));
            f7.addView(je0Var, w7.b6.o(-2, -1));
            addView(f7, w7.b6.t(-2, 34, 1, 0, 28, 0, 0));
            TextView textView5 = new TextView(context);
            this.K = textView5;
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(1);
            textView5.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            textView5.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748427, null)));
            addView(textView5, w7.b6.t(-1, -2, 49, 36, 28, 36, 12));
        } else {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, w7.b6.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, w7.b6.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.Q1() ? 0 : org.telegram.messenger.i0.m;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, w7.b6.e(-2, -2, 1));
                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
                this.s = ei0Var;
                org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.phone_flash_call, org.telegram.messenger.i0.L(64.0f), org.telegram.messenger.i0.L(64.0f), true, null);
                this.a = bi0Var;
                ei0Var.setAnimation(bi0Var);
                frameLayout3.addView(ei0Var, w7.b6.c(64.0f, 64));
                textView2.setText(L0 == null ? org.telegram.messenger.cd.L0(2131742852, null) : L0);
                linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, w7.b6.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
                if (i10 != 11) {
                    je0 je0Var2 = new je0(this, context, 1);
                    this.f = je0Var2;
                    addView(je0Var2, w7.b6.t(-2, 42, 1, 0, 32, 0, 0));
                }
                if (i10 == 3) {
                    this.f.setVisibility(8);
                }
                mc0 mc0Var = new mc0(hf0Var, context);
                this.h = mc0Var;
                int i12 = org.telegram.ui.ActionBar.t6.I6;
                org.telegram.ui.ActionBar.a7.H(mc0Var, i12, null);
                org.telegram.ui.ActionBar.a7.V(mc0Var, i12, hf0Var.getResourceProvider());
                mc0Var.setTextSize(1, 14.0f);
                mc0Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                mc0Var.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                final int i13 = 0;
                mc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.he0
                    public final /* synthetic */ me0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        int i15 = i13;
                        me0 me0Var = this.b;
                        switch (i15) {
                            case 0:
                                me0Var.c(true);
                                break;
                            case 1:
                                ke0 ke0Var = me0Var.w;
                                if (me0Var.a0 <= 0 || me0Var.T == null) {
                                    me0Var.k0 = true;
                                    ke0Var.invalidate();
                                    org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                                    int i16 = me0Var.i0;
                                    int i17 = 0;
                                    if (i16 != 4 && i16 != 2 && i16 != 17 && i16 != 16 && i16 != 11 && i16 != 15) {
                                        if (i16 == 3) {
                                            org.telegram.messenger.i0.D3(false);
                                            org.telegram.messenger.zs.e().n(me0Var, org.telegram.messenger.zs.g4);
                                            me0Var.e0 = false;
                                            me0Var.t();
                                            me0Var.k0 = false;
                                            me0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i16 == 4 || i16 == 11) {
                                            ke0Var.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                        } else {
                                            ke0Var.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", me0Var.b);
                                        bundle.putString("ephone", me0Var.e);
                                        bundle.putString("phoneFormated", me0Var.d);
                                        bundle.putInt("prevType", me0Var.h0);
                                        me0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = me0Var.d;
                                        tL_auth_resendCode.phone_code_hash = me0Var.c;
                                        i14 = ((org.telegram.ui.ActionBar.k2) me0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ee0(me0Var, bundle, i17), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    me0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(me0Var.p0)));
                                    break;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                addView(mc0Var, w7.b6.t(-2, -2, 1, 0, 18, 0, 0));
                mc0Var.setVisibility(8);
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.D = frameLayout4;
                ke0 ke0Var = new ke0(this, context, 0);
                this.w = ke0Var;
                org.telegram.ui.ActionBar.a7.H(ke0Var, i12, null);
                ke0Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                ke0Var.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                ke0Var.setTextSize(1, 15.0f);
                ke0Var.setGravity(51);
                ke0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.he0
                    public final /* synthetic */ me0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        int i15 = i11;
                        me0 me0Var = this.b;
                        switch (i15) {
                            case 0:
                                me0Var.c(true);
                                break;
                            case 1:
                                ke0 ke0Var2 = me0Var.w;
                                if (me0Var.a0 <= 0 || me0Var.T == null) {
                                    me0Var.k0 = true;
                                    ke0Var2.invalidate();
                                    org.telegram.ui.ActionBar.a7.V(ke0Var2, org.telegram.ui.ActionBar.t6.I6, null);
                                    int i16 = me0Var.i0;
                                    int i17 = 0;
                                    if (i16 != 4 && i16 != 2 && i16 != 17 && i16 != 16 && i16 != 11 && i16 != 15) {
                                        if (i16 == 3) {
                                            org.telegram.messenger.i0.D3(false);
                                            org.telegram.messenger.zs.e().n(me0Var, org.telegram.messenger.zs.g4);
                                            me0Var.e0 = false;
                                            me0Var.t();
                                            me0Var.k0 = false;
                                            me0Var.v();
                                            break;
                                        }
                                    } else {
                                        if (i16 == 4 || i16 == 11) {
                                            ke0Var2.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                        } else {
                                            ke0Var2.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", me0Var.b);
                                        bundle.putString("ephone", me0Var.e);
                                        bundle.putString("phoneFormated", me0Var.d);
                                        bundle.putInt("prevType", me0Var.h0);
                                        me0Var.r();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = me0Var.d;
                                        tL_auth_resendCode.phone_code_hash = me0Var.c;
                                        i14 = ((org.telegram.ui.ActionBar.k2) me0Var.u0).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ee0(me0Var, bundle, i17), 10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                try {
                                    me0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(me0Var.p0)));
                                    break;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                        }
                    }
                });
                frameLayout4.addView(ke0Var, w7.b6.e(-2, -2, 49));
                vc0 vc0Var = new vc0(context, i11);
                this.x = vc0Var;
                if (i10 == 15) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = org.telegram.ui.Components.vs.e;
                    loadAnimation.setInterpolator(interpolator);
                    vc0Var.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    loadAnimation2.setInterpolator(interpolator);
                    vc0Var.setOutAnimation(loadAnimation2);
                    ke0 ke0Var2 = new ke0(this, context, 1);
                    this.y = ke0Var2;
                    ke0Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    ke0Var2.setTextSize(1, 15.0f);
                    ke0Var2.setGravity(49);
                    ke0Var2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
                    frameLayout4.addView(ke0Var2, w7.b6.e(-1, -2, 17));
                    vc0Var.addView(frameLayout4, w7.b6.e(-2, -2, 17));
                } else {
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    Interpolator interpolator2 = org.telegram.ui.Components.gr.f;
                    loadAnimation3.setInterpolator(interpolator2);
                    vc0Var.setInAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    loadAnimation4.setInterpolator(interpolator2);
                    vc0Var.setOutAnimation(loadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.F = linearLayout2;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                    int L = org.telegram.messenger.i0.L(6.0f);
                    int i14 = org.telegram.ui.ActionBar.t6.Ki;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.t6.Q9;
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, x03, x03);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
                    linearLayout2.setBackground(k02);
                    org.telegram.ui.ActionBar.a7.k(linearLayout2, k02, N, N2, null);
                    final int i16 = 2;
                    linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.he0
                        public final /* synthetic */ me0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i142;
                            int i152 = i16;
                            me0 me0Var = this.b;
                            switch (i152) {
                                case 0:
                                    me0Var.c(true);
                                    break;
                                case 1:
                                    ke0 ke0Var22 = me0Var.w;
                                    if (me0Var.a0 <= 0 || me0Var.T == null) {
                                        me0Var.k0 = true;
                                        ke0Var22.invalidate();
                                        org.telegram.ui.ActionBar.a7.V(ke0Var22, org.telegram.ui.ActionBar.t6.I6, null);
                                        int i162 = me0Var.i0;
                                        int i17 = 0;
                                        if (i162 != 4 && i162 != 2 && i162 != 17 && i162 != 16 && i162 != 11 && i162 != 15) {
                                            if (i162 == 3) {
                                                org.telegram.messenger.i0.D3(false);
                                                org.telegram.messenger.zs.e().n(me0Var, org.telegram.messenger.zs.g4);
                                                me0Var.e0 = false;
                                                me0Var.t();
                                                me0Var.k0 = false;
                                                me0Var.v();
                                                break;
                                            }
                                        } else {
                                            if (i162 == 4 || i162 == 11) {
                                                ke0Var22.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                            } else {
                                                ke0Var22.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putString("phone", me0Var.b);
                                            bundle.putString("ephone", me0Var.e);
                                            bundle.putString("phoneFormated", me0Var.d);
                                            bundle.putInt("prevType", me0Var.h0);
                                            me0Var.r();
                                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                            tL_auth_resendCode.phone_number = me0Var.d;
                                            tL_auth_resendCode.phone_code_hash = me0Var.c;
                                            i142 = ((org.telegram.ui.ActionBar.k2) me0Var.u0).currentAccount;
                                            ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ee0(me0Var, bundle, i17), 10);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    try {
                                        me0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(me0Var.p0)));
                                        break;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                            }
                        }
                    });
                    vc0Var.addView(linearLayout2, w7.b6.c(52.0f, -1));
                    org.telegram.ui.Components.ei0 ei0Var2 = new org.telegram.ui.Components.ei0(context);
                    this.G = ei0Var2;
                    ei0Var2.f(R.raw.fragment, 36, 36, null);
                    linearLayout2.addView(ei0Var2, w7.b6.t(36, 36, 16, 0, 0, 2, 0));
                    TextView textView6 = new TextView(context);
                    textView6.setText(org.telegram.messenger.cd.L0(2131747821, null));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(1, 15.0f);
                    textView6.setGravity(17);
                    textView6.setTypeface(org.telegram.messenger.i0.o());
                    linearLayout2.addView(textView6);
                }
                TextView textView7 = new TextView(context);
                this.E = textView7;
                textView7.setText(org.telegram.messenger.cd.L0(2131742886, null));
                textView7.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView7.setTextSize(1, 15.0f);
                textView7.setGravity(49);
                textView7.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
                vc0Var.addView(textView7, w7.b6.e(-2, -2, 17));
                if (viewGroup != null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.addView(vc0Var, w7.b6.d(i10 == 15 ? -1 : -2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(frameLayout5, w7.b6.l(1.0f, -1, 0));
                } else {
                    viewGroup.addView(vc0Var, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                li.k.i(vc0Var);
                if (i10 == 15) {
                    this.y.setOnClickListener(new wu(20, this, context));
                    return;
                }
                return;
            }
            textView.setGravity(49);
            FrameLayout frameLayout6 = new FrameLayout(context);
            addView(frameLayout6, w7.b6.t(-2, -2, 49, 0, 16, 0, 0));
            int i17 = i10 == 1 ? 128 : 64;
            if (i10 == 1) {
                float f10 = i17;
                this.a = new org.telegram.ui.Components.bi0(R.raw.code_laptop, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), true, null);
            } else {
                float f11 = i17;
                this.a = new org.telegram.ui.Components.bi0(R.raw.sms_incoming_info, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), true, null);
                this.P = new org.telegram.ui.Components.bi0(R.raw.phone_stars_to_dots, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), true, null);
                this.Q = new org.telegram.ui.Components.bi0(R.raw.phone_dots, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), true, null);
                this.R = new org.telegram.ui.Components.bi0(R.raw.phone_dots_to_stars, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11), true, null);
            }
            org.telegram.ui.Components.ei0 ei0Var3 = new org.telegram.ui.Components.ei0(context);
            this.s = ei0Var3;
            ei0Var3.setAnimation(this.a);
            if (i10 == 1 && !org.telegram.messenger.i0.O1()) {
                ei0Var3.setTranslationY(-org.telegram.messenger.i0.L(24.0f));
            }
            frameLayout6.addView(ei0Var3, w7.b6.d(i17, i17, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || org.telegram.messenger.i0.O1()) ? 0.0f : -org.telegram.messenger.i0.L(16.0f)));
            if (L0 == null) {
                L0 = org.telegram.messenger.cd.L0(i10 == 1 ? 2131745589 : 2131745583, null);
            }
            textView2.setText(L0);
            addView(textView2, w7.b6.t(-2, -2, 49, 0, 18, 0, 0));
            int i18 = i10 == 15 ? 16 : 0;
            addView(textView, w7.b6.t(-2, -2, 49, i18, 17, i18, 0));
        }
        viewGroup = null;
        if (i10 != 11) {
        }
        if (i10 == 3) {
        }
        mc0 mc0Var2 = new mc0(hf0Var, context);
        this.h = mc0Var2;
        int i122 = org.telegram.ui.ActionBar.t6.I6;
        org.telegram.ui.ActionBar.a7.H(mc0Var2, i122, null);
        org.telegram.ui.ActionBar.a7.V(mc0Var2, i122, hf0Var.getResourceProvider());
        mc0Var2.setTextSize(1, 14.0f);
        mc0Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        mc0Var2.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
        final int i132 = 0;
        mc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i132;
                me0 me0Var = this.b;
                switch (i152) {
                    case 0:
                        me0Var.c(true);
                        break;
                    case 1:
                        ke0 ke0Var22 = me0Var.w;
                        if (me0Var.a0 <= 0 || me0Var.T == null) {
                            me0Var.k0 = true;
                            ke0Var22.invalidate();
                            org.telegram.ui.ActionBar.a7.V(ke0Var22, org.telegram.ui.ActionBar.t6.I6, null);
                            int i162 = me0Var.i0;
                            int i172 = 0;
                            if (i162 != 4 && i162 != 2 && i162 != 17 && i162 != 16 && i162 != 11 && i162 != 15) {
                                if (i162 == 3) {
                                    org.telegram.messenger.i0.D3(false);
                                    org.telegram.messenger.zs.e().n(me0Var, org.telegram.messenger.zs.g4);
                                    me0Var.e0 = false;
                                    me0Var.t();
                                    me0Var.k0 = false;
                                    me0Var.v();
                                    break;
                                }
                            } else {
                                if (i162 == 4 || i162 == 11) {
                                    ke0Var22.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                } else {
                                    ke0Var22.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", me0Var.b);
                                bundle.putString("ephone", me0Var.e);
                                bundle.putString("phoneFormated", me0Var.d);
                                bundle.putInt("prevType", me0Var.h0);
                                me0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = me0Var.d;
                                tL_auth_resendCode.phone_code_hash = me0Var.c;
                                i142 = ((org.telegram.ui.ActionBar.k2) me0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ee0(me0Var, bundle, i172), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            me0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(me0Var.p0)));
                            break;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                }
            }
        });
        addView(mc0Var2, w7.b6.t(-2, -2, 1, 0, 18, 0, 0));
        mc0Var2.setVisibility(8);
        FrameLayout frameLayout42 = new FrameLayout(context);
        this.D = frameLayout42;
        ke0 ke0Var3 = new ke0(this, context, 0);
        this.w = ke0Var3;
        org.telegram.ui.ActionBar.a7.H(ke0Var3, i122, null);
        ke0Var3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        ke0Var3.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f));
        ke0Var3.setTextSize(1, 15.0f);
        ke0Var3.setGravity(51);
        ke0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i11;
                me0 me0Var = this.b;
                switch (i152) {
                    case 0:
                        me0Var.c(true);
                        break;
                    case 1:
                        ke0 ke0Var22 = me0Var.w;
                        if (me0Var.a0 <= 0 || me0Var.T == null) {
                            me0Var.k0 = true;
                            ke0Var22.invalidate();
                            org.telegram.ui.ActionBar.a7.V(ke0Var22, org.telegram.ui.ActionBar.t6.I6, null);
                            int i162 = me0Var.i0;
                            int i172 = 0;
                            if (i162 != 4 && i162 != 2 && i162 != 17 && i162 != 16 && i162 != 11 && i162 != 15) {
                                if (i162 == 3) {
                                    org.telegram.messenger.i0.D3(false);
                                    org.telegram.messenger.zs.e().n(me0Var, org.telegram.messenger.zs.g4);
                                    me0Var.e0 = false;
                                    me0Var.t();
                                    me0Var.k0 = false;
                                    me0Var.v();
                                    break;
                                }
                            } else {
                                if (i162 == 4 || i162 == 11) {
                                    ke0Var22.setText(org.telegram.messenger.cd.L0(2131752597, null));
                                } else {
                                    ke0Var22.setText(org.telegram.messenger.cd.L0(2131745594, null));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", me0Var.b);
                                bundle.putString("ephone", me0Var.e);
                                bundle.putString("phoneFormated", me0Var.d);
                                bundle.putInt("prevType", me0Var.h0);
                                me0Var.r();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = me0Var.d;
                                tL_auth_resendCode.phone_code_hash = me0Var.c;
                                i142 = ((org.telegram.ui.ActionBar.k2) me0Var.u0).currentAccount;
                                ConnectionsManager.getInstance(i142).sendRequest(tL_auth_resendCode, new ee0(me0Var, bundle, i172), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        try {
                            me0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(me0Var.p0)));
                            break;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                }
            }
        });
        frameLayout42.addView(ke0Var3, w7.b6.e(-2, -2, 49));
        vc0 vc0Var2 = new vc0(context, i11);
        this.x = vc0Var2;
        if (i10 == 15) {
        }
        TextView textView72 = new TextView(context);
        this.E = textView72;
        textView72.setText(org.telegram.messenger.cd.L0(2131742886, null));
        textView72.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView72.setTextSize(1, 15.0f);
        textView72.setGravity(49);
        textView72.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        vc0Var2.addView(textView72, w7.b6.e(-2, -2, 17));
        if (viewGroup != null) {
        }
        li.k.i(vc0Var2);
        if (i10 == 15) {
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
    public static void n(me0 me0Var, Context context) {
        boolean z10;
        int i10;
        String str;
        WifiManager wifiManager;
        try {
            boolean z11 = false;
            PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(me0Var.e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str2);
            sb2.append(me0Var.u0.e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i11 = Build.VERSION.SDK_INT;
            sb3.append(i11);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(me0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(me0Var.getContext());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i11 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i11 >= 28) {
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
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
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
                    org.telegram.messenger.f8.g(e7, true);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            Typeface typeface = org.telegram.messenger.i0.a;
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
                    sb3.append(org.telegram.messenger.v2.d);
                    sb3.append("\n");
                    i10 = packageInfo.versionCode % 10;
                    if (i10 != 1 || i10 == 2) {
                        str = "store";
                    } else {
                        org.telegram.messenger.w0.u();
                        org.telegram.messenger.w0.n();
                        str = "beta";
                    }
                    sb3.append("App version: ");
                    sb3.append(str2);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append("\n");
                    sb3.append("\n");
                    sb3.append("Issue: ");
                    sb3.append(!me0Var.u0.e ? "no_otp" : "no_otp_paid");
                    sb3.append("\n");
                    if (!TextUtils.isEmpty(me0Var.g0)) {
                        sb3.append("Error: ");
                        sb3.append(me0Var.g0);
                        sb3.append("\n");
                    }
                    sb3.append("\n\n================================================\n");
                    sb3.append("WRITE YOUR COMMENT HERE:\n");
                    sb3.append("\n");
                    sb3.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb3.toString());
                    me0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
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
            sb3.append(org.telegram.messenger.v2.d);
            sb3.append("\n");
            i10 = packageInfo.versionCode % 10;
            if (i10 != 1) {
            }
            str = "store";
            sb3.append("App version: ");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(str);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(!me0Var.u0.e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(me0Var.g0)) {
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            me0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            me0Var.u0.t1(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.L0(2131748216, "NoMailInstalled"));
        }
    }

    public static void q(org.telegram.ui.Components.bi0 bi0Var) {
        if (bi0Var != null) {
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Phone");
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Note");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProblemTextVisible(boolean z10) {
        ke0 ke0Var = this.y;
        if (ke0Var == null) {
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (ke0Var.getAlpha() != f7) {
            ke0Var.animate().cancel();
            ke0Var.animate().alpha(f7).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean a() {
        return this.h0 != 3;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean c(boolean z10) {
        int i10;
        hf0 hf0Var = this.u0;
        int i11 = 0;
        if (hf0Var.F != 0) {
            hf0Var.finishFragment();
            return false;
        }
        int i12 = this.j0;
        if (i12 != 0) {
            hf0Var.C1(i12, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131751264, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("EditNumberInfo", null, 2131751263, this.b));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751336, null), new ce0(this, i11));
            hf0Var.showDialog(x1Var);
            return false;
        }
        this.f0 = false;
        y(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.c;
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ag.c3(18), 10);
        u();
        t();
        this.H = null;
        int i13 = org.telegram.messenger.zs.g4;
        int i14 = this.h0;
        if (i14 == 15) {
            org.telegram.messenger.zs.e().n(this, i13);
        } else if (i14 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, i13);
        } else if (i14 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
        }
        this.e0 = false;
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.f0 = false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.e0) {
            zr zrVar = this.f;
            if (zrVar.f == null) {
                return;
            }
            if (i10 == org.telegram.messenger.zs.g4) {
                zrVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i10 == org.telegram.messenger.zs.h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.i0.x(this.l0, str)) {
                    if (!this.l0.equals("*")) {
                        this.n0 = str;
                        org.telegram.messenger.i0.T();
                    }
                    h(str);
                    int i12 = CallReceiver.a;
                    org.telegram.messenger.tz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void f() {
        int i10 = org.telegram.messenger.zs.g4;
        int i11 = this.h0;
        if (i11 == 15) {
            org.telegram.messenger.zs.e().n(this, i10);
        } else if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, i10);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
        }
        this.e0 = false;
        u();
        t();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void g() {
        Bundle bundle;
        this.k0 = false;
        this.f0 = false;
        if (this.j0 == 0 || (bundle = this.H) == null) {
            return;
        }
        bundle.putInt("timeout", this.a0);
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        int i10 = this.h0;
        return (i10 == 3 || i10 == 11) ? this.b : org.telegram.messenger.cd.L0(2131742852, "YourCode");
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        hf0 hf0Var = this.u0;
        int i13 = hf0Var.a;
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
        zr zrVar = this.f;
        if (str == null) {
            str = zrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            hf0.a1(hf0Var, zrVar, false);
            return;
        }
        int i15 = hf0Var.a;
        if (i15 < 1 || i15 > 4 || !zrVar.e) {
            this.f0 = true;
            int i16 = org.telegram.messenger.zs.g4;
            int i17 = this.h0;
            if (i17 == 15) {
                org.telegram.messenger.zs.e().n(this, i16);
            } else if (i17 == 2) {
                org.telegram.messenger.i0.D3(false);
                org.telegram.messenger.zs.e().n(this, i16);
            } else if (i17 == 3) {
                org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
            }
            this.e0 = false;
            int i18 = hf0Var.F;
            if (i18 == 1) {
                this.d = hf0Var.G;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.c;
                u();
                zrVar.e = true;
                bs[] bsVarArr = zrVar.f;
                int length = bsVarArr.length;
                while (i14 < length) {
                    bsVarArr[i14].A(0.0f);
                    i14++;
                }
                i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new org.telegram.ui.Components.t20(23, this, confirmphone), 2));
                return;
            }
            if (i18 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.c;
                u();
                zrVar.e = true;
                bs[] bsVarArr2 = zrVar.f;
                int length2 = bsVarArr2.length;
                while (i14 < length2) {
                    bsVarArr2[i14].A(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new k(this, 14), 2));
                hf0Var.D1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.c;
            tL_auth_signIn.flags |= 1;
            u();
            zrVar.e = true;
            bs[] bsVarArr3 = zrVar.f;
            int length3 = bsVarArr3.length;
            while (i14 < length3) {
                bsVarArr3[i14].A(0.0f);
                i14++;
            }
            i12 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new be0(this, tL_auth_signIn, 0), 10));
            hf0Var.D1(true, true);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        org.telegram.ui.Components.bi0 bi0Var = this.a;
        if (bi0Var != null) {
            bi0Var.M(0);
        }
        org.telegram.messenger.i0.h3(new ae0(this, 0), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
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
            zr zrVar = this.f;
            if (zrVar.f != null) {
                zrVar.setText(string2);
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

    @Override // org.telegram.ui.Components.zu0
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
            bundle.putBundle(i0.a.i(i10, "smsview_params_"), this.H);
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

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0530, code lost:
    
        if (r2 == 16) goto L225;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0519  */
    @Override // org.telegram.ui.Components.zu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Bundle bundle, boolean z10) {
        String str;
        int i10;
        String str2;
        String string;
        int i11 = org.telegram.messenger.zs.g4;
        int i12 = 8;
        String str3 = null;
        if (bundle == null) {
            if (this.q0 == null || this.r0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            ke0 ke0Var = this.y;
            if (ke0Var != null) {
                ke0Var.setVisibility(0);
                org.telegram.ui.ActionBar.a7.V(this.y, org.telegram.ui.ActionBar.t6.I6, null);
                int i13 = this.i0;
                this.y.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(i13 == 17 ? 2131746067 : i13 == 16 ? 2131746065 : 2131746066, null), true, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
                return;
            }
            return;
        }
        this.e0 = true;
        int i14 = this.h0;
        if (i14 == 15) {
            org.telegram.messenger.zs.e().b(this, i11);
        } else if (i14 == 2) {
            org.telegram.messenger.i0.D3(true);
            org.telegram.messenger.zs.e().b(this, i11);
        } else if (i14 == 3) {
            org.telegram.messenger.i0.C3(true);
            org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.h4);
            if (z10) {
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(10));
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
        bs[] bsVarArr = this.f.f;
        int length = bsVarArr.length;
        int i15 = 0;
        while (true) {
            int i16 = 11;
            if (i15 >= length) {
                break;
            }
            bs bsVar = bsVarArr[i15];
            bsVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.i0.C1());
            bsVar.addTextChangedListener(new n0(this, i16));
            bsVar.setOnFocusChangeListener(new od(this, i12));
            i15++;
        }
        int i17 = this.j0;
        if (i17 == 17) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753754, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else if (i17 == 16) {
            this.h.setVisibility(0);
            this.h.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753753, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.b == null) {
            return;
        }
        String b10 = af.b.c().b(this.b);
        if (this.u0.q1()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("CancelAccountResetInfo2", null, 2131752587, af.b.c().b("+" + b10))));
            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            str = spannableStringBuilder;
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                this.n.setMovementMethod(new org.telegram.messenger.e0(false));
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51("tg://settings/change_number", (org.telegram.ui.Components.yz0) null), indexOf, lastIndexOf - 1, 33);
                str = spannableStringBuilder;
            }
        } else {
            int i18 = this.h0;
            str = i18 == 1 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentAppCodeWithPhone", null, 2131745588, org.telegram.messenger.cd.a(b10))) : i18 == 2 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentSmsCode", null, 2131745584, org.telegram.messenger.cd.a(b10))) : i18 == 3 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallCode", null, 2131745587, org.telegram.messenger.cd.a(b10))) : i18 == 4 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallOnly", null, 2131745586, org.telegram.messenger.cd.a(b10))) : i18 == 15 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentFragmentCode", null, 2131745585, org.telegram.messenger.cd.a(b10))) : "";
        }
        this.n.setText(str);
        int i19 = this.h0;
        if (i19 != 15) {
            if (i19 == 1) {
                int i20 = this.i0;
                if (i20 == 3 || i20 == 4 || i20 == 11) {
                    this.y.setText(org.telegram.messenger.cd.L0(2131751445, null));
                } else if (i20 == 15) {
                    this.y.setText(org.telegram.messenger.cd.L0(2131751448, null));
                } else if (i20 == 0) {
                    this.y.setText(org.telegram.messenger.cd.L0(2131751450, null));
                } else {
                    this.y.setText(org.telegram.messenger.cd.L0(2131751444, null));
                }
            } else {
                this.y.setText(org.telegram.messenger.cd.L0(2131751450, null));
            }
        }
        if (this.h0 != 3) {
            hf0.Z0(this.u0, this.f.f[0]);
            this.f.f[0].requestFocus();
        } else {
            org.telegram.messenger.i0.v1(this.f.f[0]);
        }
        u();
        t();
        this.c0 = System.currentTimeMillis();
        int i21 = this.h0;
        if (i21 == 1) {
            setProblemTextVisible(true);
            this.w.setVisibility(8);
            ke0 ke0Var2 = this.y;
            if (ke0Var2 != null) {
                ke0Var2.setVisibility(0);
            }
        } else {
            int i22 = 1;
            if (i21 == 3) {
                int i23 = this.i0;
                if (i23 == 4 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11) {
                    setProblemTextVisible(false);
                    this.w.setVisibility(0);
                    this.y.setVisibility(8);
                    int i24 = this.i0;
                    if (i24 == 4 || i24 == 11) {
                        this.w.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, 1, 0));
                    } else if (i24 == 2 || i24 == 17 || i24 == 16) {
                        this.w.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, 1, 0));
                    }
                } else {
                    this.w.setVisibility(8);
                }
                if (z10) {
                    String str4 = this.l0;
                    try {
                        Cursor query = org.telegram.messenger.w0.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
                        while (true) {
                            try {
                                if (!query.moveToNext()) {
                                    query.close();
                                    break;
                                }
                                String string2 = query.getString(0);
                                long j10 = query.getLong(i22);
                                if (org.telegram.messenger.v2.a) {
                                    org.telegram.messenger.f8.d("number = " + string2);
                                }
                                if (Math.abs(System.currentTimeMillis() - j10) < 3600000 && org.telegram.messenger.i0.x(str4, string2)) {
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
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                if (str3 != null) {
                    h(str3);
                } else {
                    String str5 = this.n0;
                    if (str5 != null) {
                        h(str5);
                    } else {
                        int i25 = this.i0;
                        if (i25 == 4 || i25 == 2 || i25 == 17 || i25 == 16 || i25 == 11) {
                            s();
                        }
                    }
                }
            } else {
                if (i21 == 2) {
                    int i26 = this.i0;
                    if (i26 == 2 || i26 == 17 || i26 == 16 || i26 == 4 || i26 == 3) {
                        if (i26 == 2 || i26 == 17 || i26 == 16) {
                            this.w.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, 1, 0));
                        } else {
                            this.w.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, 2, 0));
                        }
                        setProblemTextVisible(this.a0 < 1000);
                        this.w.setVisibility(this.a0 < 1000 ? 8 : 0);
                        ke0 ke0Var3 = this.y;
                        if (ke0Var3 != null) {
                            ke0Var3.setVisibility(this.a0 < 1000 ? 0 : 8);
                        }
                        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
                        String string3 = sharedPreferences.getString("sms_hash", null);
                        if (!TextUtils.isEmpty(string3) && (string = sharedPreferences.getString("sms_hash_code", null)) != null) {
                            if (string.contains(string3 + "|") && !this.u0.y) {
                                str2 = string.substring(string.indexOf(org.telegram.messenger.zs.I1) + 1);
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
                        i10 = 4;
                    }
                } else {
                    i10 = 4;
                }
                if (i21 == i10) {
                    int i27 = this.i0;
                    int i28 = (i27 == 2 || i27 == 17 || i27 == 11) ? 16 : 16;
                    if (i27 == 2 || i27 == 17 || i27 == i28) {
                        this.w.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, 1, 0));
                    } else {
                        this.w.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, 2, 0));
                    }
                    setProblemTextVisible(this.a0 < 1000);
                    this.w.setVisibility(this.a0 < 1000 ? 8 : 0);
                    ke0 ke0Var4 = this.y;
                    if (ke0Var4 != null) {
                        ke0Var4.setVisibility(this.a0 < 1000 ? 0 : 8);
                    }
                    s();
                }
                if (i21 == 11) {
                    int i29 = this.i0;
                    if (i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                        setProblemTextVisible(false);
                        this.w.setVisibility(0);
                        this.y.setVisibility(8);
                        int i30 = this.i0;
                        if (i30 == 4 || i30 == 11) {
                            this.w.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, 1, 0));
                        } else if (i30 == 2 || i30 == 17 || i30 == 16) {
                            this.w.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, 1, 0));
                        }
                        s();
                    }
                } else {
                    this.w.setVisibility(8);
                    ke0 ke0Var5 = this.y;
                    if (ke0Var5 != null) {
                        ke0Var5.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    r();
                }
            }
        }
        if (this.h0 == 11) {
            String str6 = this.m0;
            for (int i31 = 0; i31 < this.o0; i31++) {
                str6 = sc.e.A(str6, "0");
            }
            String b11 = af.b.c().b("+" + str6);
            for (int i32 = 0; i32 < this.o0; i32++) {
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
        bs[] bsVarArr;
        super.onConfigurationChanged(configuration);
        zr zrVar = this.f;
        if (zrVar == null || (bsVarArr = zrVar.f) == null) {
            return;
        }
        for (bs bsVar : bsVarArr) {
            bsVar.setShowSoftInputOnFocusCompat(!a() || org.telegram.messenger.i0.C1());
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
            zr zrVar = this.f;
            if (i10 >= zrVar.f.length) {
                zrVar.postDelayed(new f70(26, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                zrVar.postDelayed(new fe0(this, i10, 2), i10 * 75);
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
        this.U.schedule(new le0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        ke0 ke0Var = this.w;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        ke0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new le0(this, 1), 0L, 1000L);
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
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void u() {
        ke0 ke0Var = this.w;
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        this.w.setTag(R.id.color_key_tag, Integer.valueOf(i10));
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
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.u0.q1() ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.D6, false);
        TextView textView = this.n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false));
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int i11 = this.h0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.t6.y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false);
            int i13 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            hf0.k1(this.L, x03, i13, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            hf0.k1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        }
        q(this.a);
        q(this.P);
        q(this.Q);
        q(this.R);
        zr zrVar = this.f;
        if (zrVar != null) {
            zrVar.invalidate();
        }
        ke0 ke0Var = this.w;
        Integer num = (Integer) ke0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.t6.D6);
        }
        ke0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.y.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false));
    }

    public final void v() {
        int i10;
        if (this.f0 || this.k0) {
            return;
        }
        hf0 hf0Var = this.u0;
        if (hf0Var.p0) {
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
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ee0(this, bundle, 1), 10));
    }

    public final void w() {
        zr zrVar = this.f;
        try {
            zrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = zrVar.f;
            if (i10 >= bsVarArr.length) {
                break;
            }
            bsVarArr[i10].setText("");
            zrVar.f[i10].z(1.0f);
            i10++;
        }
        vc0 vc0Var = this.x;
        if (vc0Var.getCurrentView() != this.E) {
            vc0Var.showNext();
        }
        zrVar.f[0].requestFocus();
        org.telegram.messenger.i0.F3(this.h0 == 11 ? 3.5f : 10.0f, zrVar, new ae0(this, 7));
        ae0 ae0Var = this.t0;
        removeCallbacks(ae0Var);
        postDelayed(ae0Var, 5000L);
        this.s0 = true;
    }

    public final void y(boolean z10) {
        if (this.P == null) {
            this.u0.s1(z10, true);
            return;
        }
        if (this.S) {
            this.S = false;
            this.s.setAutoRepeat(false);
            org.telegram.ui.Components.bi0 bi0Var = this.Q;
            bi0Var.K(0);
            bi0Var.S(bi0Var.e[0] - 1, new ae0(this, 1));
        }
    }

    public final void z(int i10) {
        org.telegram.ui.Components.bi0 bi0Var = this.P;
        if (bi0Var == null) {
            this.u0.v1(i10, true);
            return;
        }
        if (this.S) {
            return;
        }
        this.S = true;
        org.telegram.ui.Components.bi0 bi0Var2 = this.a;
        if (bi0Var2.a0 != bi0Var2.e[0] - 1) {
            bi0Var2.t0 = new fe0(this, i10, 0);
            return;
        }
        bi0Var.t0 = new ae0(this, 3);
        org.telegram.ui.Components.ei0 ei0Var = this.s;
        ei0Var.setAutoRepeat(false);
        bi0Var.N(0, false, false);
        ei0Var.setAnimation(bi0Var);
        ei0Var.d();
    }
}
