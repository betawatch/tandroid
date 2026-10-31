package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w7 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us, org.telegram.messenger.z5 {
    public static w7 P2;
    public static final float[] Q2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final g7 A1;
    public long A2;
    public final h7 B1;
    public long B2;
    public final o7 C1;
    public boolean C2;
    public final org.telegram.ui.ActionBar.t0 D1;
    public float D2;
    public final org.telegram.ui.vr E1;
    public final mg.c2 E2;
    public org.telegram.ui.ActionBar.b1 F1;
    public org.telegram.ui.ij F2;
    public final i7 G1;
    public long G2;
    public final boolean H1;
    public float H2;
    public final a80 I1;
    public final org.telegram.ui.Cells.f2 I2;
    public final p7 J1;
    public ValueAnimator J2;
    public final org.telegram.ui.ActionBar.u5 K1;
    public int K2;
    public final org.telegram.ui.ActionBar.t0 L1;
    public boolean L2;
    public final jh.g M1;
    public int M2;
    public final org.telegram.ui.ActionBar.x0 N1;
    public int N2;
    public boolean O1;
    public int O2;
    public final org.telegram.ui.ActionBar.b1[] P1;
    public final TextView Q1;
    public final org.telegram.ui.ActionBar.t0 R1;
    public final org.telegram.ui.ActionBar.b1 S1;
    public final org.telegram.ui.ActionBar.b1 T1;
    public final org.telegram.ui.ActionBar.b1 U1;
    public final org.telegram.ui.ActionBar.b1 V1;
    public final ImageView W1;
    public final kf0 X1;
    public final e7 Y1;
    public final g9 Z1;
    public final org.telegram.ui.ActionBar.t0 a2;
    public final org.telegram.ui.ActionBar.t0 b2;
    public boolean c2;
    public final View[] d2;
    public final o1.j e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public final View i1;
    public int i2;
    public final kg.g1 j1;
    public int j2;
    public final View k1;
    public final boolean k2;
    public final View l1;
    public final boolean l2;
    public boolean m1;
    public org.telegram.messenger.pp m2;
    public boolean n1;
    public ArrayList n2;
    public final j7 o1;
    public org.telegram.messenger.jj o2;
    public final s4.a0 p1;
    public boolean p2;
    public final v7 q1;
    public int q2;
    public final LinearLayout r1;
    public String r2;
    public final TextView s1;
    public AnimatorSet s2;
    public final TextView t1;
    public int t2;
    public final e7 u1;
    public int u2;
    public final vh.d v1;
    public final int v2;
    public final vh.d w1;
    public final LaunchActivity w2;
    public final s4.x x1;
    public int x2;
    public final n7 y1;
    public float y2;
    public final o7 z1;
    public int z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(Activity activity, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, (Context) activity, p6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.User Z1;
        int i10 = 1;
        org.telegram.ui.ActionBar.b1[] b1VarArr = new org.telegram.ui.ActionBar.b1[6];
        this.P1 = b1VarArr;
        View[] viewArr = new View[5];
        this.d2 = viewArr;
        this.h2 = true;
        this.i2 = -1;
        this.q2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.y2 = -1.0f;
        this.D2 = -1.0f;
        this.E2 = new mg.c2(this, 23);
        this.I2 = new org.telegram.ui.Cells.f2(this);
        this.r = true;
        O();
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar != null) {
            this.a = jjVar.I1;
        } else {
            this.a = org.telegram.messenger.d20.s0;
        }
        this.w2 = (LaunchActivity) activity;
        this.v2 = org.telegram.messenger.b6.q(this.a).k();
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.K0);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.L0);
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.U3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.J4);
        m7 m7Var = new m7(this, activity);
        this.b = m7Var;
        final int i11 = 0;
        m7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        kg.g1 g1Var = new kg.g1(this, activity, p6Var, i10);
        this.j1 = g1Var;
        g1Var.setBackgroundColor(0);
        g1Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.Bj, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 6, org.telegram.ui.ActionBar.t6.Dj, p6Var);
        g1Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y p5 = g1Var.p();
        p5.setLayoutParams(w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        View view = new View(activity);
        this.i1 = view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, view, p6Var);
        g1Var.addView(view, 0, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        view.setAlpha(0.0f);
        g1Var.setAlpha(0.0f);
        g1Var.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, i10));
        View view2 = new View(activity);
        this.k1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.l1 = view3;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view3, p6Var);
        e7 e7Var = new e7(this, activity, 2);
        this.u1 = e7Var;
        n7 n7Var = new n7(this, activity);
        this.y1 = n7Var;
        e7Var.addView(n7Var, w7.b6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        o7 o7Var = new o7(this, activity, activity, i11);
        this.z1 = o7Var;
        e7Var.addView(o7Var, w7.b6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        o7 o7Var2 = new o7(this, activity, activity, i10);
        this.C1 = o7Var2;
        e7Var.addView(o7Var2, w7.b6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        p7 p7Var = new p7(this, activity, p6Var);
        this.J1 = p7Var;
        p7Var.setLineWidth(4);
        p7Var.setDelegate(new l2.f(this, 14));
        p7Var.setReportChanges(true);
        e7Var.addView(p7Var, w7.b6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new o1.i(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.m = kVar;
        jVar.b(new a7(this, i11));
        this.e2 = jVar;
        a80 a80Var = new a80(activity);
        this.I1 = a80Var;
        a80Var.setVisibility(4);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Hj, a80Var, p6Var);
        a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        e7Var.addView(a80Var, w7.b6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.K1 = u5Var;
        u5Var.setTextSize(12);
        u5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.t6.Gj;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i14, p6Var);
        u5Var.setImportantForAccessibility(2);
        e7Var.addView(u5Var, w7.b6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Q1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i14, p6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        e7Var.addView(textView, w7.b6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(activity, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
        this.L1 = t0Var;
        t0Var.setLongClickEnabled(false);
        t0Var.setShowSubmenuByMove(false);
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(224.0f));
        t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754805, null));
        t0Var.setDelegate(new p6(this, i11));
        jh.g gVar = new jh.g();
        this.M1 = gVar;
        t0Var.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(getContext(), p6Var);
        this.N1 = x0Var;
        x0Var.setRoundRadiusDp(6.0f);
        x0Var.setDrawShadow(true);
        x0Var.setOnValueChange(new q6(this, i11));
        b1VarArr[0] = t0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.cd.L0(2131745284, null));
        b1VarArr[1] = t0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.cd.L0(2131745285, null));
        b1VarArr[2] = t0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.cd.L0(2131745286, null));
        b1VarArr[3] = t0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.cd.L0(2131745288, null));
        b1VarArr[4] = t0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.cd.L0(2131745282, null));
        b1VarArr[5] = t0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.cd.L0(2131745283, null));
        if (org.telegram.messenger.i0.p >= 3.0f) {
            t0Var.setPadding(0, 1, 0, 0);
        }
        t0Var.setAdditionalXOffset(org.telegram.messenger.i0.L(8.0f));
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(400.0f));
        t0Var.setShowedFromBottom(true);
        e7Var.addView(t0Var, w7.b6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        t0Var.setOnClickListener(new org.telegram.ui.ud(17, this, fArr));
        t0Var.setOnLongClickListener(new b0(i10, this, p6Var));
        a1(false);
        e7 e7Var2 = new e7(this, activity, 0);
        e7Var.addView(e7Var2, w7.b6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(activity, null, 0, 0, false, p6Var);
        this.R1 = t0Var2;
        viewArr[0] = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setShowSubmenuByMove(false);
        t0Var2.setAdditionalYOffset(-org.telegram.messenger.i0.L(166.0f));
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var2, h02, null, N, p6Var);
        e7Var2.addView(t0Var2, w7.b6.e(48, 48, 51));
        t0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r6
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i11;
                w7 w7Var = this.b;
                switch (i16) {
                    case 0:
                        w7Var.d1();
                        w7Var.R1.U(null, null);
                        break;
                    default:
                        i7 i7Var = w7Var.G1;
                        org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                        if (jjVar2 != null) {
                            char c10 = 1;
                            z60 G = z60.G(w7Var.c, w7Var.I0, view4, true);
                            z60 J0 = w7Var.J0(G, jjVar2);
                            if (!w7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.cd.L0(2131753916, null), new bi.k(G, J0, 6), !w7Var.p2);
                                if (!w7Var.p2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.cd.L0(2131750588, null), new w6(w7Var, G, 0), !w7Var.p2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.cd.L0(2131745477, null), new w6(w7Var, G, c10 == true ? 1 : 0), !w7Var.p2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.cd.L0(2131745360, null), new w6(w7Var, G, 2), jjVar2.f1() > 0);
                            if (w7Var.H1) {
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, G.e, G.d, false, false);
                                G.d(b1Var);
                                w7Var.F1 = b1Var;
                                b1Var.j(org.telegram.messenger.cd.L0(2131743615, null), R.drawable.menu_video_chromecast, null);
                                w7Var.F1.setOnClickListener(new org.telegram.ui.ud(18, w7Var, G));
                                org.telegram.messenger.i0.E2(i7Var);
                                w7Var.F1.addView(i7Var, 0, w7.b6.c(-1.0f, -1));
                                w7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new w6(w7Var, G, 3), org.telegram.messenger.cd.L0(2131746660, null), w7Var.O0(), true);
                            G.X(org.telegram.messenger.i0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.S1 = t0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.cd.L0(2131746288, null));
        this.T1 = t0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.cd.L0(2131746291, null));
        t0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.i0.L(4.0f);
        this.U1 = t0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.cd.L0(2131745340, null));
        t0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.i0.L(4.0f);
        this.V1 = t0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.cd.L0(2131746044, null));
        t0Var2.setShowedFromBottom(true);
        t0Var2.setDelegate(new p6(this, i10));
        int i16 = org.telegram.ui.ActionBar.t6.Kj;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i16, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        g7 g7Var = new g7(this, activity, scaledTouchSlop);
        this.A1 = g7Var;
        viewArr[1] = g7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        g7Var.setScaleType(scaleType);
        g7Var.f(R.raw.player_prev, 20, 20, null);
        g7Var.h(w02, "Triangle 3");
        g7Var.h(w02, "Triangle 4");
        g7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(22.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        g7Var.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(g7Var, h03, null, N2, p6Var);
        e7Var2.addView(g7Var, w7.b6.e(48, 48, 51));
        g7Var.setContentDescription(org.telegram.messenger.cd.L0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.W1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        kf0 kf0Var = new kf0(28);
        this.X1 = kf0Var;
        imageView.setImageDrawable(kf0Var);
        kf0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(24.0f));
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView, h04, null, N3, p6Var);
        e7Var2.addView(imageView, w7.b6.e(48, 48, 51));
        imageView.setOnClickListener(new bh.c(5));
        h7 h7Var = new h7(this, activity, scaledTouchSlop);
        this.B1 = h7Var;
        viewArr[3] = h7Var;
        h7Var.setScaleType(scaleType);
        h7Var.f(R.raw.player_prev, 20, 20, null);
        h7Var.h(w02, "Triangle 3");
        h7Var.h(w02, "Triangle 4");
        h7Var.h(w02, "Rectangle 4");
        h7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(22.0f));
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i15);
        h7Var.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(h7Var, h05, null, N4, p6Var);
        e7Var2.addView(h7Var, w7.b6.e(48, 48, 51));
        h7Var.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(activity, null, 0, w02, false, p6Var);
        this.D1 = t0Var3;
        viewArr[4] = t0Var3;
        org.telegram.ui.vr vrVar = new org.telegram.ui.vr(R.drawable.ic_ab_other, activity, p6Var);
        this.E1 = vrVar;
        t0Var3.setIcon(vrVar);
        t0Var3.setLongClickEnabled(false);
        t0Var3.setAdditionalYOffset(-org.telegram.messenger.i0.L(197.0f));
        final int i17 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(t0Var3, h06, null, N5, p6Var);
        t0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r6
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i162 = i17;
                w7 w7Var = this.b;
                switch (i162) {
                    case 0:
                        w7Var.d1();
                        w7Var.R1.U(null, null);
                        break;
                    default:
                        i7 i7Var = w7Var.G1;
                        org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                        if (jjVar2 != null) {
                            char c10 = 1;
                            z60 G = z60.G(w7Var.c, w7Var.I0, view4, true);
                            z60 J0 = w7Var.J0(G, jjVar2);
                            if (!w7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.cd.L0(2131753916, null), new bi.k(G, J0, 6), !w7Var.p2);
                                if (!w7Var.p2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.cd.L0(2131750588, null), new w6(w7Var, G, 0), !w7Var.p2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.cd.L0(2131745477, null), new w6(w7Var, G, c10 == true ? 1 : 0), !w7Var.p2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.cd.L0(2131745360, null), new w6(w7Var, G, 2), jjVar2.f1() > 0);
                            if (w7Var.H1) {
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, G.e, G.d, false, false);
                                G.d(b1Var);
                                w7Var.F1 = b1Var;
                                b1Var.j(org.telegram.messenger.cd.L0(2131743615, null), R.drawable.menu_video_chromecast, null);
                                w7Var.F1.setOnClickListener(new org.telegram.ui.ud(18, w7Var, G));
                                org.telegram.messenger.i0.E2(i7Var);
                                w7Var.F1.addView(i7Var, 0, w7.b6.c(-1.0f, -1));
                                w7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new w6(w7Var, G, 3), org.telegram.messenger.cd.L0(2131746660, null), w7Var.O0(), true);
                            G.X(org.telegram.messenger.i0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        e7Var2.addView(t0Var3, w7.b6.e(48, 48, 51));
        i7 i7Var = new i7(this, activity, 0);
        this.G1 = i7Var;
        this.H1 = true;
        try {
            i7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            this.H1 = false;
        }
        this.G1.setVisibility(4);
        org.telegram.ui.vr vrVar2 = this.E1;
        if (vrVar2 != null) {
            vrVar2.a(b5.d.u());
        }
        this.D1.setShowedFromBottom(true);
        this.D1.setDelegate(new p6(this, 2));
        this.D1.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.r1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i18 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, w7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(10));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, w7.b6.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.s1 = textView2;
        int i19 = org.telegram.ui.ActionBar.t6.X5;
        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.cd.L0(2131748260, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.t1 = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i19, p6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(textView3, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        j7 j7Var = new j7(this, activity);
        this.o1 = j7Var;
        j7Var.setClipToPadding(false);
        getContext();
        s4.a0 a0Var = new s4.a0(1, false);
        this.p1 = a0Var;
        j7Var.setLayoutManager(a0Var);
        j7Var.setHorizontalScrollBarEnabled(false);
        j7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(j7Var, w7.b6.e(-1, -1, 51));
        v7 v7Var = new v7(this, activity);
        this.q1 = v7Var;
        j7Var.setAdapter(v7Var);
        org.telegram.ui.ActionBar.a7.m(j7Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        j7Var.setOnItemClickListener(new c7(0));
        j7Var.setOnItemLongClickListener(new p6(this, 3));
        j7Var.setOnScrollListener(new ag.u(this, 11));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        this.v1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i20 = 0;
        spannableStringBuilder.setSpan(new dq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d7
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i21 = i20;
                int i22 = 9;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                w7 w7Var = this.b;
                switch (i21) {
                    case 0:
                        org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                        if (jjVar2 != null && w7Var.w2 != null) {
                            w7Var.R0(jjVar2, true, new org.telegram.messenger.rz(i22), false);
                            w7Var.U0(true);
                            org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.b, p6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.jj jjVar3 = MediaController.B().u0;
                        if (jjVar3 != null && w7Var.w2 != null) {
                            w7Var.R0(jjVar3, false, new org.telegram.messenger.rz(i22), false);
                            w7Var.U0(false);
                            org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.b, p6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.u1.addView(dVar, w7.b6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i21 = 1;
        vh.d dVar2 = new vh.d(activity, p6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.w1 = dVar2;
        dVar2.setText(org.telegram.messenger.cd.L0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d7
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i212 = i21;
                int i22 = 9;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                w7 w7Var = this.b;
                switch (i212) {
                    case 0:
                        org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                        if (jjVar2 != null && w7Var.w2 != null) {
                            w7Var.R0(jjVar2, true, new org.telegram.messenger.rz(i22), false);
                            w7Var.U0(true);
                            org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.b, p6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.jj jjVar3 = MediaController.B().u0;
                        if (jjVar3 != null && w7Var.w2 != null) {
                            w7Var.R0(jjVar3, false, new org.telegram.messenger.rz(i22), false);
                            w7Var.U0(false);
                            org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.b, p6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.u1.addView(dVar2, w7.b6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.pp ppVar = MediaController.B().Q0;
        this.m2 = ppVar;
        boolean z10 = ppVar != null;
        this.k2 = z10;
        this.j1.m0 = z10;
        this.l2 = O0();
        this.n2 = MediaController.B().R0;
        if (O0()) {
            yVar = p5;
            this.a2 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = p5;
        }
        org.telegram.ui.ActionBar.t0 a2 = yVar.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new ag.l3(this, 5);
        this.b2 = a2;
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        int i22 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(searchField, i22, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, p6Var);
        org.telegram.ui.ActionBar.a7.m(searchField, 30, i22, p6Var);
        if (z10) {
            j7Var.r1();
            v0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var));
            this.j1.setAlpha(1.0f);
            this.i1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.I2;
            kg.g1 g1Var2 = this.j1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(g1Var2, valueOf);
        }
        boolean z11 = this.n2.size() > 1;
        v7Var.h = z11;
        if (z11) {
            j7Var.setVisibility(0);
            j7Var.setTranslationY(0.0f);
        } else {
            j7Var.setVisibility(8);
            j7Var.setTranslationY(org.telegram.messenger.i0.q.y);
        }
        v7Var.f();
        this.j1.setTitle(org.telegram.messenger.cd.L0(2131753952, null));
        org.telegram.messenger.pp ppVar2 = this.m2;
        if (ppVar2 != null) {
            if (ppVar2.b == org.telegram.messenger.d20.i(this.a).e()) {
                this.j1.setTitle(org.telegram.messenger.cd.L0(2131746658, null));
            } else {
                this.j1.setTitle(org.telegram.messenger.cd.a0(null, null, 2131746659, org.telegram.messenger.o5.t(this.m2.b)));
            }
        } else if (jjVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.jj.B0(jjVar.k);
            if (org.telegram.messenger.o5.C(B0)) {
                TLRPC.EncryptedChat Z0 = org.telegram.messenger.vp.r1(this.a).Z0(Integer.valueOf((int) (B0 & 4294967295L)));
                if (Z0 != null && (Z1 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(Z0.user_id))) != null) {
                    this.j1.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                }
            } else if (B0 == org.telegram.messenger.d20.i(this.a).e()) {
                if (jjVar.Q1() == 2666000) {
                    this.j1.setTitle(org.telegram.messenger.cd.L0(2131754252, null));
                } else {
                    this.j1.setTitle(org.telegram.messenger.cd.L0(2131745918, null));
                }
            } else if (org.telegram.messenger.o5.E(B0)) {
                TLRPC.User Z12 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(B0));
                if (Z12 != null) {
                    this.j1.setTitle(org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name));
                }
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-B0));
                if (L0 != null) {
                    this.j1.setTitle(L0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.x xVar = new s4.x(new org.telegram.ui.ja(this, 2));
            this.x1 = xVar;
            xVar.h(j7Var);
        }
        this.b.addView(this.u1, w7.b6.e(-1, ((O0() || this.p2) ? 0 : 52) + org.telegram.messenger.zs.J2, 83));
        this.b.addView(this.l1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83));
        ((FrameLayout.LayoutParams) this.u1.getLayoutParams()).height = org.telegram.messenger.i0.L(((O0() || this.p2) ? 0 : 52) + org.telegram.messenger.zs.J2);
        ((FrameLayout.LayoutParams) this.l1.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(org.telegram.messenger.zs.J2 + ((O0() || this.p2) ? 0 : 52));
        this.b.addView(this.k1, w7.b6.c(3.0f, -1));
        this.b.addView(this.j1);
        e7 e7Var3 = new e7(this, activity, 1);
        this.Y1 = e7Var3;
        e7Var3.setAlpha(0.0f);
        e7Var3.setVisibility(4);
        this.c.addView(e7Var3);
        g9 g9Var = new g9(activity);
        this.Z1 = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        g9Var.setScaleX(0.9f);
        g9Var.setScaleY(0.9f);
        e7Var3.addView(g9Var, w7.b6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.n1 && v7Var.b() == 0) {
            i18 = 0;
        }
        linearLayout.setVisibility(i18);
        Z0();
    }

    public static void I0(w7 w7Var) {
        View view = w7Var.k1;
        kg.g1 g1Var = w7Var.j1;
        j7 j7Var = w7Var.o1;
        if (j7Var.getChildCount() <= 0) {
            int paddingTop = j7Var.getPaddingTop();
            w7Var.q2 = paddingTop;
            j7Var.setTopGlowOffset(paddingTop);
            w7Var.b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = j7Var.getChildAt(0);
        ck0 ck0Var = (ck0) j7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        boolean z11 = top <= org.telegram.messenger.i0.L(12.0f);
        if ((z11 && g1Var.getTag() == null) || (!z11 && g1Var.getTag() != null)) {
            g1Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = w7Var.s2;
            if (animatorSet != null) {
                animatorSet.cancel();
                w7Var.s2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            w7Var.s2 = animatorSet2;
            if (w7Var.k2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, w7Var.I2, z11 ? 1.0f : 0.0f);
                View view2 = w7Var.i1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            w7Var.s2.setDuration(320L);
            w7Var.s2.setInterpolator(gr.h);
            w7Var.s2.addListener(new l7(w7Var, 2));
            w7Var.s2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j7Var.getLayoutParams();
        int D = org.telegram.messenger.z20.D(11.0f, layoutParams.topMargin - org.telegram.messenger.i0.m, top);
        if (w7Var.q2 != D) {
            w7Var.q2 = D;
            j7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.i0.m);
            w7Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.i0.L(13.0f);
        float min = w7Var.s0 + ((int) (j7Var.getTranslationY() + ((w7Var.q2 - w7Var.s0) - L2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) - w7Var.s0) / (org.telegram.messenger.i0.L(4.0f) + L2)) : 1.0f;
        w7Var.D2 = min;
        if (min <= 0.5f && i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, w7Var.I0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != w7Var.C2) {
            w7Var.C2 = z10;
            org.telegram.messenger.i0.p3(w7Var, z10);
        }
    }

    public static boolean L0(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static org.telegram.messenger.ic N0(org.telegram.messenger.jj jjVar) {
        TLRPC.Document F0 = jjVar.F0();
        TLRPC.PhotoSize w9 = F0 != null ? org.telegram.messenger.b8.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w9 instanceof TLRPC.TL_photoSize) && !(w9 instanceof TLRPC.TL_photoSizeProgressive)) {
            w9 = null;
        }
        if (w9 != null) {
            return org.telegram.messenger.ic.c(w9, F0);
        }
        String u02 = jjVar.u0(true);
        if (u02 != null) {
            return org.telegram.messenger.ic.g(u02);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.We));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final z60 J0(z60 z60Var, org.telegram.messenger.jj jjVar) {
        org.telegram.messenger.op G1 = org.telegram.messenger.vp.r1(this.a).G1();
        TLRPC.Document F0 = jjVar.F0();
        long j10 = F0 != null ? F0.id : 0L;
        z60 J = z60Var.J();
        J.c(R.drawable.ic_ab_back, org.telegram.messenger.cd.L0(2131753756, null), new org.telegram.ui.rr0(z60Var, 27), false);
        J.k();
        J.l(R.drawable.left_status_profile, org.telegram.messenger.cd.L0(2131753913, null), new v6(this, jjVar, z60Var, 6), !G1.b.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, org.telegram.messenger.cd.L0(2131753910, null), new v6(this, jjVar, z60Var, 7), false);
        J.c(R.drawable.menu_download_round, org.telegram.messenger.cd.L0(2131753914, null), new v6(this, jjVar, z60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.i0.L(200.0f), org.telegram.messenger.cd.L0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.t0 t0Var = this.R1;
        int w02 = org.telegram.ui.ActionBar.t6.w0(((Integer) t0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0);
        if (!this.L2 || w02 != this.M2) {
            this.M2 = w02;
            t0Var.setIconColor(w02);
        }
        boolean z10 = this.L2;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.D1;
        if (!z10 || w03 != this.N2) {
            this.N2 = w03;
            t0Var2.setIconColor(w03);
        }
        if (!this.L2 || w04 != this.O2) {
            this.O2 = w04;
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.t6.H1(t0Var2.getBackground(), w04, true);
        }
        this.L2 = true;
        this.I1.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        d1();
        int i10 = org.telegram.ui.ActionBar.t6.G8;
        t0Var.H(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        t0Var2.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), false);
        t0Var2.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), true);
        t0Var2.H(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
    }

    public final void M0(org.telegram.messenger.jj jjVar) {
        ArrayList j10;
        TLRPC.TL_document tL_document;
        int i10 = org.telegram.messenger.d20.s0;
        int i11 = this.a;
        LaunchActivity launchActivity = this.w2;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle j11 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
        j11.putBoolean("canSelectTopics", true);
        org.telegram.ui.ay ayVar = new org.telegram.ui.ay(j11);
        if (jjVar.f1() >= 0) {
            j10 = org.telegram.messenger.m5.j(jjVar);
            tL_document = null;
        } else {
            if (!(jjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) jjVar.F0();
            j10 = null;
        }
        ayVar.C2 = new a1.d(this, j10, tL_document, jjVar, 5);
        launchActivity.t0(ayVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.pp ppVar = this.m2;
        return ppVar != null && ppVar.b == org.telegram.messenger.d20.i(this.a).e();
    }

    public final void P0(int i10) {
        LaunchActivity launchActivity;
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar == null || (launchActivity = this.w2) == null) {
            return;
        }
        if (i10 == 1) {
            M0(jjVar);
            return;
        }
        if (i10 == 2) {
            V0(jjVar);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                Q0(jjVar);
                return;
            }
            if (i10 == 6) {
                hf.b.e0().l0(MediaController.B().z());
                this.G1.performClick();
                return;
            } else {
                if (i10 == 7) {
                    R0(jjVar, false, new s6(this, jjVar, 0), false);
                    return;
                }
                if (i10 == 8) {
                    vh.f5 f5Var = new vh.f5(getContext(), true, null, new u6(this, 0), null);
                    f5Var.Z1 = true;
                    f5Var.R1 = false;
                    f5Var.h2.O(true);
                    f5Var.show();
                    return;
                }
                return;
            }
        }
        int i11 = org.telegram.messenger.d20.s0;
        int i12 = this.a;
        if (i11 != i12) {
            launchActivity.O0(i12);
        }
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        if (org.telegram.messenger.o5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", jjVar.f1());
        org.telegram.messenger.zs.f(this.a).k(org.telegram.messenger.zs.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.un(bundle), false, false);
        dismiss();
    }

    public final void Q0(org.telegram.messenger.jj jjVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) {
            LaunchActivity launchActivity = this.w2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.b8.B(jjVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = jjVar.S0();
        }
        String str = B;
        String str2 = jjVar.k.attachPath;
        if (str2 != null && str2.length() > 0 && !sc.e.x(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            org.telegram.messenger.b8.G(this.a);
            str2 = org.telegram.messenger.b8.N(jjVar.k, false, true).toString();
        }
        MediaController.d0(str2, this.w2, 3, str, jjVar.F0() != null ? jjVar.F0().mime_type : "", new u6(this, 1));
    }

    public final void R0(org.telegram.messenger.jj jjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = jjVar.F0();
        if (F0 == null) {
            return;
        }
        long j10 = F0.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j10;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new x6(this, z11, jjVar, z10, runnable, j10, F0));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final int S() {
        e7 e7Var = this.u1;
        if (e7Var == null) {
            return 0;
        }
        if (this.n2.size() <= 1) {
            return e7Var.getMeasuredHeight() + this.s0;
        }
        int L = org.telegram.messenger.i0.L(13.0f);
        int translationY = (int) (this.o1.getTranslationY() + ((this.q2 - this.s0) - L));
        if (this.s0 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.i0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.s0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + org.telegram.messenger.i0.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0(boolean z10) {
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar != null) {
            if (z10) {
                j7 j7Var = this.o1;
                int childCount = j7Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = j7Var.getChildAt(i10);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != jjVar) {
                        i10++;
                    }
                }
            }
            int indexOf = this.n2.indexOf(jjVar);
            if (this.l2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = org.telegram.messenger.tz.O0;
                s4.a0 a0Var = this.p1;
                if (z11) {
                    a0Var.n0(indexOf);
                    return true;
                }
                a0Var.n0(this.n2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void T0(org.telegram.ui.ActionBar.b1 b1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.t6.Lj;
            b1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
            b1Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        } else {
            int i11 = org.telegram.ui.ActionBar.t6.E8;
            b1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
            b1Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        }
    }

    public final void U0(final boolean z10) {
        boolean O0 = O0();
        vh.d dVar = this.w1;
        vh.d dVar2 = this.v1;
        if (O0 || this.p2) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        gr grVar = gr.h;
        final int i10 = 0;
        duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.v1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.w1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i11 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.v1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.w1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        o6 o6Var = new o6(this, 0);
        int i10 = org.telegram.ui.ActionBar.t6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.j1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.j1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.r0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jj));
        int i12 = org.telegram.ui.ActionBar.t6.w7;
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x7));
        int i13 = org.telegram.ui.ActionBar.t6.Kj;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.R1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Lj));
        int i14 = org.telegram.ui.ActionBar.t6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i14));
        int i15 = org.telegram.ui.ActionBar.t6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i15));
        org.telegram.ui.ActionBar.t0 t0Var3 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i15));
        g7 g7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new bi0[]{g7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new bi0[]{g7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new bi0[]{g7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.t6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.A1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.W1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        h7 h7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new bi0[]{h7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new bi0[]{h7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new bi0[]{h7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        int i17 = org.telegram.ui.ActionBar.t6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        o7 o7Var = this.z1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        o7 o7Var2 = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(org.telegram.messenger.jj jjVar) {
        File file;
        try {
            if (!TextUtils.isEmpty(jjVar.k.attachPath)) {
                file = new File(jjVar.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.b8.G(this.a);
                file = org.telegram.messenger.b8.N(jjVar.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.w2);
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131747233, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(jjVar.u1());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Context context = org.telegram.messenger.w0.b;
                    org.telegram.messenger.w0.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(context, "org.telegram.messenger.beta.provider", file));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            }
            this.w2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131745477, null)), 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void W0(boolean z10, boolean z11) {
        g9 g9Var = this.Z1;
        e7 e7Var = this.Y1;
        if (z10) {
            if (e7Var.getVisibility() == 0 || this.c2) {
                return;
            }
            e7Var.setTag(1);
            n7 n7Var = this.y1;
            g9Var.setImageBitmap(n7Var.a[n7Var.b].getImageReceiver().n());
            this.c2 = true;
            nl0.d(new q6(this, 1));
            e7Var.setVisibility(0);
            e7Var.animate().alpha(1.0f).setDuration(180L).setListener(new l7(this, 0)).start();
            g9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (e7Var.getVisibility() != 0) {
            return;
        }
        e7Var.setTag(null);
        if (z11) {
            this.c2 = true;
            e7Var.animate().alpha(0.0f).setDuration(180L).setListener(new l7(this, 1)).start();
            g9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            e7Var.setAlpha(0.0f);
            e7Var.setVisibility(4);
            g9Var.setImageBitmap(null);
            g9Var.setScaleX(0.9f);
            g9Var.setScaleY(0.9f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.jj jjVar) {
        int i10 = 1;
        z60 G = z60.G(this.c, this.I0, wVar, true);
        int i11 = 5;
        Object[] objArr = 0;
        if (O0()) {
            G.l(R.drawable.msg_forward, org.telegram.messenger.cd.L0(2131750588, null), new v6(this, G, jjVar, (int) (objArr == true ? 1 : 0)), !this.p2);
            G.l(R.drawable.msg_shareout, org.telegram.messenger.cd.L0(2131745477, null), new v6(this, G, jjVar, i10), !this.p2);
            G.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new v6(this, jjVar, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, org.telegram.messenger.cd.L0(2131753916, null), new bi.k(G, J0(G, jjVar), i11), !this.p2);
            if (!this.p2 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, org.telegram.messenger.cd.L0(2131750588, null), new v6(this, G, jjVar, r1), !this.p2);
            G.l(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745477, null), new v6(this, G, jjVar, 4), !this.p2);
            G.l(R.drawable.msg_view_file, org.telegram.messenger.cd.L0(2131745360, null), new s6(this, jjVar, i10), jjVar.f1() > 0);
        }
        G.V(org.telegram.messenger.cd.X ? 3 : 5);
        G.Z();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean Y(float f7, float f10) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f10 >= childAt.getY() + this.E.getY()) {
                if (f10 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.E.getX()) {
                        if (f7 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.b.getTop();
        Drawable drawable = this.r0;
        return f10 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f7 < ((float) this.b.getLeft()) || f7 > ((float) this.b.getRight());
    }

    public final void Y0() {
        if (this.x2 == 1) {
            this.A2 = System.currentTimeMillis();
            this.y2 = MediaController.B().u0.b0;
            mg.c2 c2Var = this.E2;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.g3(c2Var);
        }
    }

    public final void Z0() {
        LinearLayout linearLayout = this.r1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.u1.getVisibility() == 0 ? org.telegram.messenger.i0.L(150.0f) : -org.telegram.messenger.i0.L(30.0f))) / 2);
    }

    public final void a1(boolean z10) {
        if (this.L1 == null) {
            return;
        }
        float f7 = MediaController.B().q0;
        this.M1.n(z10, f7);
        this.N1.e(z10, f7);
        updateColors();
        boolean z11 = this.O1;
        int i10 = 0;
        this.O1 = false;
        while (true) {
            org.telegram.ui.ActionBar.b1[] b1VarArr = this.P1;
            if (i10 >= b1VarArr.length) {
                return;
            }
            if (z11 || !L0(f7, Q2[i10])) {
                org.telegram.ui.ActionBar.b1 b1Var = b1VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.t6.E8;
                b1Var.d(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
            } else {
                org.telegram.ui.ActionBar.b1 b1Var2 = b1VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.t6.Ei;
                b1Var2.d(org.telegram.ui.ActionBar.t6.w0(i12, this.I0), org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (org.telegram.messenger.MediaController.B().H() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(org.telegram.messenger.jj jjVar, boolean z10) {
        boolean z11;
        float f7;
        int i10;
        p7 p7Var = this.J1;
        if (p7Var != null) {
            if (p7Var.x) {
                i10 = (int) (jjVar.L0() * p7Var.getProgress());
            } else {
                if (this.y2 >= 0.0f) {
                    int i11 = this.x2;
                    z11 = true;
                    if (i11 != -1) {
                        if (i11 == 1) {
                        }
                    }
                    if (z11) {
                        p7Var.e(z10, jjVar.b0);
                    } else {
                        p7Var.e(z10, this.y2);
                    }
                    f7 = 1.0f;
                    if (!this.g2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.f2) >= 500) {
                            if (MediaController.B().l0) {
                                f7 = org.telegram.messenger.b8.G(this.a).t(this.r2, jjVar.b0);
                            }
                            this.f2 = elapsedRealtime;
                        } else {
                            f7 = -1.0f;
                        }
                    }
                    if (f7 != -1.0f) {
                        o1.j jVar = this.e2;
                        jVar.m.i = f7 * 1000.0f;
                        jVar.h();
                    }
                    if (z11) {
                        i10 = jjVar.g0;
                    } else {
                        i10 = (int) (jjVar.L0() * p7Var.getProgress());
                        jjVar.g0 = i10;
                    }
                }
                z11 = false;
                if (z11) {
                }
                f7 = 1.0f;
                if (!this.g2) {
                }
                if (f7 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.t2 != i10) {
                this.t2 = i10;
                this.K1.l(org.telegram.messenger.i0.g0(i10, false, false), false);
            }
            p7Var.g(jjVar);
        }
    }

    public final void c1() {
        int i10 = org.telegram.messenger.tz.S0;
        org.telegram.ui.ActionBar.t0 t0Var = this.R1;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                t0Var.setIcon(R.drawable.player_new_repeatone);
                int i11 = org.telegram.ui.ActionBar.t6.Lj;
                t0Var.setTag(Integer.valueOf(i11));
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
                org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), org.telegram.ui.ActionBar.t6.w0(i11, this.I0) & 436207615, true);
                t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.tz.N0) {
            if (i10 == 0) {
                t0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                t0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!org.telegram.messenger.tz.O0) {
            t0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i10 == 0) {
            t0Var.setIcon(R.drawable.player_new_order);
        } else {
            t0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i10 == 0 && !org.telegram.messenger.tz.N0 && !org.telegram.messenger.tz.O0) {
            int i12 = org.telegram.ui.ActionBar.t6.Kj;
            t0Var.setTag(Integer.valueOf(i12));
            t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0), true);
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754786, null));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.t6.Lj;
        t0Var.setTag(Integer.valueOf(i13));
        t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i13, this.I0));
        org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.t6.w0(i13, this.I0), true);
        if (i10 != 0) {
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754787, null));
        } else if (org.telegram.messenger.tz.N0) {
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131745340, null));
        } else {
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131746044, null));
        }
    }

    public final void d1() {
        T0(this.U1, org.telegram.messenger.tz.N0);
        T0(this.V1, org.telegram.messenger.tz.O0);
        T0(this.T1, org.telegram.messenger.tz.S0 == 1);
        T0(this.S1, org.telegram.messenger.tz.S0 == 2);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.jj messageObject2;
        org.telegram.messenger.jj jjVar;
        int i12 = org.telegram.messenger.zs.h2;
        int i13 = org.telegram.messenger.zs.f2;
        int i14 = org.telegram.messenger.zs.g2;
        j7 j7Var = this.o1;
        if (i10 == i12 || i10 == i14 || i10 == i13) {
            f1(i10 == i13 && ((Boolean) objArr[1]).booleanValue());
            if (i10 == i13 || i10 == i14) {
                int childCount = j7Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = j7Var.getChildAt(i15);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.jj.R4(messageObject.k) || messageObject.I3())) {
                        wVar.b(false, true);
                    }
                }
                if (i10 == i14 && MediaController.B().u0 != null) {
                    if (MediaController.B().H()) {
                        Y0();
                    } else if (this.x2 == 1 && this.y2 != -1.0f) {
                        mg.c2 c2Var = this.E2;
                        org.telegram.messenger.i0.r(c2Var);
                        this.B2 = 0L;
                        c2Var.run();
                        this.y2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.jj) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = j7Var.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt2 = j7Var.getChildAt(i16);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.jj.R4(messageObject2.k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.vr vrVar = this.E1;
            if (vrVar != null) {
                vrVar.a(b5.d.u());
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.e2) {
            org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
            if (jjVar2 == null || !jjVar2.I3()) {
                return;
            }
            b1(jjVar2, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.J4) {
            a1(true);
            return;
        }
        int i17 = org.telegram.messenger.zs.K0;
        v7 v7Var = this.q1;
        if (i10 == i17) {
            this.m2 = MediaController.B().Q0;
            this.n2 = MediaController.B().R0;
            v7Var.f();
            return;
        }
        if (i10 == org.telegram.messenger.zs.L0) {
            this.m2 = MediaController.B().Q0;
            this.n2 = MediaController.B().R0;
            v7Var.f();
            if (org.telegram.messenger.tz.O0) {
                j7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                s4.a0 a0Var = this.p1;
                a0Var.L0();
                int N0 = a0Var.N0();
                if (N0 != -1) {
                    View m10 = a0Var.m(N0);
                    a0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.Y1) {
            if (((String) objArr[0]).equals(this.r2)) {
                f1(false);
                this.g2 = true;
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.X1) {
            if (i10 == org.telegram.messenger.zs.U3) {
                f1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.r2) || (jjVar = MediaController.B().u0) == null) {
            return;
        }
        if (!this.g2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.f2) >= 500) {
                r13 = MediaController.B().l0 ? org.telegram.messenger.b8.G(this.a).t(this.r2, jjVar.b0) : 1.0f;
                this.f2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            o1.j jVar = this.e2;
            jVar.m.i = r13 * 1000.0f;
            jVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.K0);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.L0);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.U3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.J4);
        org.telegram.messenger.b6.q(this.a).v(this);
        if (P2 == this) {
            P2 = null;
        }
    }

    public final void e1() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.k2 ? org.telegram.ui.ActionBar.t6.a7 : org.telegram.ui.ActionBar.t6.h5, this.I0);
        if (w02 != this.K2) {
            this.K2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kj, this.I0);
        g7 g7Var = this.A1;
        if (g7Var != null) {
            g7Var.h(w03, "Triangle 3");
            g7Var.h(w03, "Triangle 4");
            g7Var.h(w03, "Rectangle 4");
        }
        h7 h7Var = this.B1;
        if (h7Var != null) {
            h7Var.h(w03, "Triangle 3");
            h7Var.h(w03, "Triangle 4");
            h7Var.h(w03, "Rectangle 4");
        }
        p7 p7Var = this.J1;
        if (p7Var != null) {
            p7Var.setOuterColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        if (t0Var != null) {
            float f7 = MediaController.B().q0;
            int w04 = org.telegram.ui.ActionBar.t6.w0(!L0(f7, 1.0f) ? org.telegram.ui.ActionBar.t6.Ei : org.telegram.ui.ActionBar.t6.x7, this.I0);
            jh.g gVar = this.M1;
            if (gVar != null) {
                ((e6) gVar.b).u(w04);
                Paint paint = (Paint) gVar.c;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), w04 & 436207615, true);
            int i10 = 0;
            while (true) {
                org.telegram.ui.ActionBar.b1[] b1VarArr = this.P1;
                if (i10 >= b1VarArr.length) {
                    break;
                }
                if (b1VarArr[i10] != null) {
                    int w05 = org.telegram.ui.ActionBar.t6.w0(L0(f7, Q2[i10]) ? org.telegram.ui.ActionBar.t6.Ei : org.telegram.ui.ActionBar.t6.E8, this.I0);
                    b1VarArr[i10].d(w05, w05);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var = this.F1;
        if (b1Var != null) {
            i7 i7Var = this.G1;
            if (i7Var != null && i7Var.b()) {
                z10 = true;
            }
            int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0);
            int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0);
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            b1Var.e(w06, w07, org.telegram.ui.ActionBar.t6.w0(i11, this.I0), z10);
            this.F1.setSelectorColor((i7Var == null || !i7Var.b()) ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0) : org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, this.I0)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        g9 g9Var;
        ImageView imageView;
        int i11;
        int i12;
        String str;
        boolean z14;
        Bitmap bitmap;
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if ((jjVar == null && z10) || (jjVar != null && !jjVar.I3())) {
            dismiss();
            return;
        }
        if (jjVar == null) {
            this.o2 = null;
            return;
        }
        boolean z15 = jjVar == this.o2;
        this.o2 = jjVar;
        long j10 = jjVar.T;
        org.telegram.ui.ActionBar.t0 t0Var = this.D1;
        if (j10 != 0 || jjVar.f1() <= -2000000000) {
            t0Var.setVisibility(4);
        } else {
            t0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        long j11 = jjVar.F0() != null ? jjVar.F0().id : 0L;
        boolean z16 = (B0 < 0 && org.telegram.messenger.vp.r1(this.a).z2(B0)) || org.telegram.messenger.vp.r1(this.a).z2(org.telegram.messenger.jj.B0(jjVar.k)) || jjVar.k.noforwards;
        if (z16 != this.p2) {
            this.p2 = z16;
            e7 e7Var = this.u1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.i0.L(((z16 || O0()) ? 0 : 52) + org.telegram.messenger.zs.J2);
            e7Var.setLayoutParams(layoutParams);
            View view = this.l1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.i0.L(org.telegram.messenger.zs.J2 + ((O0() || z16) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z16) {
            t0Var.t(1);
            t0Var.t(2);
            t0Var.t(5);
            t0Var.t(6);
            t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(16.0f));
        } else {
            t0Var.S(1);
            t0Var.S(2);
            t0Var.S(5);
            t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(197.0f));
        }
        String str2 = jjVar.k.attachPath;
        if (str2 != null && str2.length() > 0) {
            file = new File(jjVar.k.attachPath);
        }
        file = null;
        if (file == null) {
            org.telegram.messenger.b8.G(this.a);
            file = org.telegram.messenger.b8.N(jjVar.k, false, true);
        }
        boolean z17 = org.telegram.messenger.tz.B0 && ((int) org.telegram.messenger.jj.B0(jjVar.k)) != 0 && jjVar.I3();
        boolean exists = file.exists();
        ImageView imageView2 = this.W1;
        p7 p7Var = this.J1;
        a80 a80Var = this.I1;
        if (exists || z17) {
            org.telegram.messenger.b6.q(this.a).v(this);
            a80Var.setVisibility(4);
            p7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = jjVar.S0();
            org.telegram.messenger.b6.q(this.a).a(S0, null, this);
            Float w9 = org.telegram.messenger.hc.D().w(S0);
            a80Var.a(false, w9 != null ? w9.floatValue() : 0.0f);
            a80Var.setVisibility(0);
            p7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        b1(jjVar, !z15);
        n7 n7Var = this.y1;
        g9 g9Var2 = z15 ? n7Var.a[n7Var.b] : n7Var.a[n7Var.b == 0 ? (char) 1 : (char) 0];
        cf.a aVar = MediaController.B().D0;
        if (z15) {
            z11 = true;
            z12 = false;
            z13 = z15;
            i10 = 3;
        } else {
            AnimatorSet animatorSet = n7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            n7Var.c = new AnimatorSet();
            int i13 = n7Var.b == 0 ? 1 : 0;
            n7Var.b = i13;
            g9[] g9VarArr = n7Var.a;
            z11 = true;
            g9 g9Var3 = g9VarArr[i13 ^ 1];
            g9 g9Var4 = g9VarArr[i13];
            boolean I = g9Var3.getImageReceiver().I();
            g9Var4.setAlpha(I ? 1.0f : 0.0f);
            g9Var4.setScaleX(0.8f);
            g9Var4.setScaleY(0.8f);
            g9Var4.setVisibility(0);
            if (I) {
                g9Var3.bringToFront();
            } else {
                g9Var3.setVisibility(8);
                g9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z12 = false;
            z13 = z15;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(gr.g);
            ofFloat.addUpdateListener(new jg.o0(3, g9Var4, I));
            if (I) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(gr.i);
                ofFloat2.addUpdateListener(new ag.p2(11, g9Var3, g9Var4));
                i10 = 3;
                ofFloat2.addListener(new w5(g9Var3, i10));
                n7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                i10 = 3;
                n7Var.c.play(ofFloat);
            }
            n7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.r2 = org.telegram.messenger.b8.r(null, jjVar.F0());
            boolean z18 = z12;
            this.g2 = z18;
            String u02 = jjVar.u0(z18);
            org.telegram.messenger.ic N0 = N0(jjVar);
            if (TextUtils.isEmpty(u02)) {
                g9Var = g9Var2;
                imageView = imageView2;
                i11 = i10;
                i12 = 8;
                if (N0 != null) {
                    g9Var.g(1, 0L, jjVar, null, null, null, null, N0);
                } else {
                    str = null;
                    g9Var.setImageDrawable(null);
                    g9Var.invalidate();
                }
            } else {
                org.telegram.messenger.ic g10 = org.telegram.messenger.ic.g(u02);
                g9Var = g9Var2;
                i11 = i10;
                imageView = imageView2;
                i12 = 8;
                g9Var.g(1, 0L, jjVar, null, null, null, g10, N0);
            }
            str = null;
            g9Var.invalidate();
        } else {
            g9Var2.setImageBitmap(bitmap);
            this.r2 = null;
            this.g2 = z11;
            str = null;
            imageView = imageView2;
            i11 = i10;
            i12 = 8;
        }
        boolean H = MediaController.B().H();
        kf0 kf0Var = this.X1;
        if (H) {
            z14 = true;
            kf0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754929, str));
        } else {
            z14 = true;
            kf0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754930, str));
        }
        String z19 = jjVar.z1(z14);
        String x12 = jjVar.x1(z14);
        this.z1.setText(z19);
        this.C1.setText(x12);
        org.telegram.messenger.op G1 = org.telegram.messenger.vp.r1(this.a).G1();
        this.v1.setLoading(G1.c);
        U0(G1.b.contains(Long.valueOf(j11)));
        int L0 = (int) jjVar.L0();
        this.u2 = L0;
        TextView textView = this.Q1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.i0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = this.L1;
        if (L0 > 600) {
            t0Var2.setVisibility(0);
        } else {
            t0Var2.setVisibility(i12);
        }
        if (z13) {
            return;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = B.R0;
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int i14 = B.U0;
        int i15 = i14 + 1;
        int i16 = i14 - 1;
        if (i15 >= arrayList.size()) {
            i15 = 0;
        }
        if (i15 <= -1) {
            i15 = arrayList.size() - 1;
        }
        if (i16 <= -1) {
            i16 = arrayList.size() - 1;
        }
        if (i16 >= arrayList.size()) {
            i16 = 0;
        }
        arrayList2.add((org.telegram.messenger.jj) arrayList.get(i15));
        if (i15 != i16) {
            arrayList2.add((org.telegram.messenger.jj) arrayList.get(i16));
        }
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i17);
            org.telegram.messenger.ic N02 = N0(jjVar2);
            if (N02 != null) {
                if (N02.g != null) {
                    org.telegram.messenger.hc D = org.telegram.messenger.hc.D();
                    D.s.c(new org.telegram.messenger.ib(D, N02.g, i11));
                } else {
                    org.telegram.messenger.b8.G(this.a).W(N02, jjVar2, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.v2;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.I1.a(true, Math.min(1.0f, j10 / j11));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        e7 e7Var = this.Y1;
        if (view != e7Var) {
            return false;
        }
        e7Var.layout(0, 0, e7Var.getMeasuredWidth(), e7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean l0(View view, int i10, int i11) {
        e7 e7Var = this.Y1;
        if (view != e7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        e7Var.measure(View.MeasureSpec.makeMeasureSpec(p2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(p2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        kg.g1 g1Var = this.j1;
        if (g1Var != null && g1Var.n0) {
            g1Var.k(true);
        } else if (this.Y1.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            if (this.b2 != null && this.R1 != null && this.D1 != null && this.I1 != null) {
                K0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            e1();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        try {
            float f7 = this.D2;
            if (f7 >= 0.0f) {
                boolean z10 = f7 <= 0.5f && i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) > 0.699999988079071d;
                if (z10 != this.C2) {
                    this.C2 = z10;
                    org.telegram.messenger.i0.p3(this, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        P2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        if (t0Var != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(!L0(MediaController.B().q0, 1.0f) ? org.telegram.ui.ActionBar.t6.Ei : org.telegram.ui.ActionBar.t6.x7, this.I0);
            jh.g gVar = this.M1;
            if (gVar != null) {
                ((e6) gVar.b).u(w02);
                Paint paint = (Paint) gVar.c;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            t0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(w02 & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.b1 b1Var = this.F1;
        if (b1Var != null) {
            i7 i7Var = this.G1;
            boolean z10 = i7Var != null && i7Var.b();
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0);
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            b1Var.e(w03, w04, org.telegram.ui.ActionBar.t6.w0(i10, this.I0), z10);
            this.F1.setSelectorColor((i7Var == null || !i7Var.b()) ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0) : org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)));
        }
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
