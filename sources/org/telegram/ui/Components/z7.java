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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z7 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, org.telegram.messenger.x5 {
    public static z7 Q2;
    public static final float[] R2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final r7 A1;
    public int A2;
    public final i7 B1;
    public long B2;
    public final j7 C1;
    public long C2;
    public final r7 D1;
    public boolean D2;
    public final org.telegram.ui.ActionBar.q0 E1;
    public float E2;
    public final org.telegram.ui.tq F1;
    public final mi.b0 F2;
    public org.telegram.ui.ActionBar.y0 G1;
    public m7 G2;
    public final k7 H1;
    public long H2;
    public final boolean I1;
    public float I2;
    public final d70 J1;
    public final org.telegram.ui.Cells.f2 J2;
    public final s7 K1;
    public ValueAnimator K2;
    public final org.telegram.ui.ActionBar.k5 L1;
    public int L2;
    public final org.telegram.ui.ActionBar.q0 M1;
    public boolean M2;
    public final cu0 N1;
    public int N2;
    public final org.telegram.ui.ActionBar.u0 O1;
    public int O2;
    public boolean P1;
    public int P2;
    public final org.telegram.ui.ActionBar.y0[] Q1;
    public final TextView R1;
    public final org.telegram.ui.ActionBar.q0 S1;
    public final org.telegram.ui.ActionBar.y0 T1;
    public final org.telegram.ui.ActionBar.y0 U1;
    public final org.telegram.ui.ActionBar.y0 V1;
    public final org.telegram.ui.ActionBar.y0 W1;
    public final ImageView X1;
    public final je0 Y1;
    public final g7 Z1;
    public final k9 a2;
    public final org.telegram.ui.ActionBar.q0 b2;
    public final org.telegram.ui.ActionBar.q0 c2;
    public boolean d2;
    public final View[] e2;
    public final q1.g f2;
    public long g2;
    public boolean h2;
    public boolean i2;
    public final View j1;
    public int j2;
    public final p7 k1;
    public int k2;
    public final View l1;
    public final boolean l2;
    public final View m1;
    public final boolean m2;
    public boolean n1;
    public org.telegram.messenger.bp n2;
    public boolean o1;
    public ArrayList o2;
    public final l7 p1;
    public org.telegram.messenger.zi p2;
    public final u4.b0 q1;
    public boolean q2;
    public final y7 r1;
    public int r2;
    public final LinearLayout s1;
    public String s2;
    public final TextView t1;
    public AnimatorSet t2;
    public final TextView u1;
    public int u2;
    public final g7 v1;
    public int v2;
    public final gi.d w1;
    public final int w2;
    public final gi.d x1;
    public final LaunchActivity x2;
    public final u4.y y1;
    public int y2;
    public final q7 z1;
    public float z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(Activity activity, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) activity, e6Var, true);
        org.telegram.ui.ActionBar.x xVar;
        TLRPC.User a22;
        int i3 = 1;
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[6];
        this.Q1 = y0VarArr;
        View[] viewArr = new View[5];
        this.e2 = viewArr;
        this.i2 = true;
        this.j2 = -1;
        this.r2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z2 = -1.0f;
        this.E2 = -1.0f;
        this.F2 = new mi.b0(this, 24);
        this.J2 = new org.telegram.ui.Cells.f2(this);
        this.r = true;
        N();
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if (ziVar != null) {
            this.a = ziVar.I1;
        } else {
            this.a = org.telegram.messenger.h10.t0;
        }
        this.x2 = (LaunchActivity) activity;
        this.w2 = org.telegram.messenger.z5.q(this.a).k();
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.K0);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.L0);
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.U3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.J4);
        o7 o7Var = new o7(this, activity);
        this.b = o7Var;
        final int i10 = 0;
        o7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        p7 p7Var = new p7(this, activity, e6Var, i10);
        this.k1 = p7Var;
        p7Var.setBackgroundColor(0);
        p7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.Bj, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 6, org.telegram.ui.ActionBar.k6.Dj, e6Var);
        p7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.x q10 = p7Var.q();
        q10.setLayoutParams(b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        View view = new View(activity);
        this.j1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, view, e6Var);
        p7Var.addView(view, 0, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        view.setAlpha(0.0f);
        p7Var.setAlpha(0.0f);
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 11));
        View view2 = new View(activity);
        this.l1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.m1 = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, e6Var);
        g7 g7Var = new g7(this, activity, 2);
        this.v1 = g7Var;
        q7 q7Var = new q7(this, activity);
        this.z1 = q7Var;
        g7Var.addView(q7Var, b8.mf.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(this, activity, activity, i10);
        this.A1 = r7Var;
        g7Var.addView(r7Var, b8.mf.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        r7 r7Var2 = new r7(this, activity, activity, i3);
        this.D1 = r7Var2;
        g7Var.addView(r7Var2, b8.mf.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(this, activity, e6Var);
        this.K1 = s7Var;
        s7Var.setLineWidth(4);
        s7Var.setDelegate(new gi.v5(this, 28));
        s7Var.setReportChanges(true);
        g7Var.addView(s7Var, b8.mf.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        q1.g gVar = new q1.g(new q1.f(0.0f));
        q1.h hVar = new q1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        gVar.b(new c7(this, i10));
        this.f2 = gVar;
        d70 d70Var = new d70(activity);
        this.J1 = d70Var;
        d70Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Hj, d70Var, e6Var);
        d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        g7Var.addView(d70Var, b8.mf.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.L1 = k5Var;
        k5Var.setTextSize(12);
        k5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.k6.Gj;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i13, e6Var);
        k5Var.setImportantForAccessibility(2);
        g7Var.addView(k5Var, b8.mf.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.R1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        g7Var.addView(textView, b8.mf.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.J0), false, e6Var);
        this.M1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754805, null));
        q0Var.setDelegate(new r6(this, i10));
        cu0 cu0Var = new cu0();
        this.N1 = cu0Var;
        q0Var.setIcon(cu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), e6Var);
        this.O1 = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        u0Var.setDrawShadow(true);
        u0Var.setOnValueChange(new s6(this, i10));
        y0VarArr[0] = q0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.bd.M0(2131745276, null));
        y0VarArr[1] = q0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.bd.M0(2131745277, null));
        y0VarArr[2] = q0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.bd.M0(2131745278, null));
        y0VarArr[3] = q0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.bd.M0(2131745280, null));
        y0VarArr[4] = q0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.bd.M0(2131745274, null));
        y0VarArr[5] = q0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.bd.M0(2131745275, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        g7Var.addView(q0Var, b8.mf.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new q2(i3, this, fArr));
        q0Var.setOnLongClickListener(new ei.j2(2, this, e6Var));
        a1(false);
        g7 g7Var2 = new g7(this, activity, 0);
        g7Var.addView(g7Var2, b8.mf.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, e6Var);
        this.S1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var2, h02, null, N, e6Var);
        g7Var2.addView(q0Var2, b8.mf.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i15 = i10;
                z7 z7Var = this.b;
                switch (i15) {
                    case 0:
                        z7Var.d1();
                        z7Var.S1.U(null, null);
                        break;
                    default:
                        k7 k7Var = z7Var.H1;
                        org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                        if (ziVar2 != null) {
                            char c2 = 1;
                            f60 G = f60.G(z7Var.c, z7Var.J0, view4, true);
                            f60 J0 = z7Var.J0(G, ziVar2);
                            if (!z7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0, 8), !z7Var.q2);
                                if (!z7Var.q2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.bd.M0(2131750588, null), new y6(z7Var, G, 0), !z7Var.q2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.bd.M0(2131745469, null), new y6(z7Var, G, c2 == true ? 1 : 0), !z7Var.q2);
                            int i16 = 2;
                            G.l(R.drawable.msg_message, org.telegram.messenger.bd.M0(2131745352, null), new y6(z7Var, G, i16), ziVar2.f1() > 0);
                            if (z7Var.I1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, G.e, G.d, false, false);
                                G.d(y0Var);
                                z7Var.G1 = y0Var;
                                y0Var.j(org.telegram.messenger.bd.M0(2131743599, null), R.drawable.menu_video_chromecast, null);
                                z7Var.G1.setOnClickListener(new q2(i16, z7Var, G));
                                org.telegram.messenger.g0.E2(k7Var);
                                z7Var.G1.addView(k7Var, 0, b8.mf.c(-1.0f, -1));
                                z7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new y6(z7Var, G, 3), org.telegram.messenger.bd.M0(2131746653, null), z7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.T1 = q0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.bd.M0(2131746281, null));
        this.U1 = q0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.bd.M0(2131746284, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.V1 = q0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.bd.M0(2131745332, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.W1 = q0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.bd.M0(2131746037, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new r6(this, i3));
        int i15 = org.telegram.ui.ActionBar.k6.Kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        i7 i7Var = new i7(this, activity, scaledTouchSlop);
        this.B1 = i7Var;
        viewArr[1] = i7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        i7Var.setScaleType(scaleType);
        i7Var.f(R.raw.player_prev, 20, 20, null);
        i7Var.h(w02, "Triangle 3");
        i7Var.h(w02, "Triangle 4");
        i7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        i7Var.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(i7Var, h03, null, N2, e6Var);
        g7Var2.addView(i7Var, b8.mf.e(48, 48, 51));
        i7Var.setContentDescription(org.telegram.messenger.bd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.X1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        je0 je0Var = new je0(28);
        this.Y1 = je0Var;
        imageView.setImageDrawable(je0Var);
        je0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView, h04, null, N3, e6Var);
        g7Var2.addView(imageView, b8.mf.e(48, 48, 51));
        imageView.setOnClickListener(new ai.t(13));
        j7 j7Var = new j7(this, activity, scaledTouchSlop);
        this.C1 = j7Var;
        viewArr[3] = j7Var;
        j7Var.setScaleType(scaleType);
        j7Var.f(R.raw.player_prev, 20, 20, null);
        j7Var.h(w02, "Triangle 3");
        j7Var.h(w02, "Triangle 4");
        j7Var.h(w02, "Rectangle 4");
        j7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        j7Var.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(j7Var, h05, null, N4, e6Var);
        g7Var2.addView(j7Var, b8.mf.e(48, 48, 51));
        j7Var.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, e6Var);
        this.E1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.tq tqVar = new org.telegram.ui.tq(R.drawable.ic_ab_other, activity, e6Var);
        this.F1 = tqVar;
        q0Var3.setIcon(tqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        final int i16 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(q0Var3, h06, null, N5, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i152 = i16;
                z7 z7Var = this.b;
                switch (i152) {
                    case 0:
                        z7Var.d1();
                        z7Var.S1.U(null, null);
                        break;
                    default:
                        k7 k7Var = z7Var.H1;
                        org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                        if (ziVar2 != null) {
                            char c2 = 1;
                            f60 G = f60.G(z7Var.c, z7Var.J0, view4, true);
                            f60 J0 = z7Var.J0(G, ziVar2);
                            if (!z7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0, 8), !z7Var.q2);
                                if (!z7Var.q2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.bd.M0(2131750588, null), new y6(z7Var, G, 0), !z7Var.q2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.bd.M0(2131745469, null), new y6(z7Var, G, c2 == true ? 1 : 0), !z7Var.q2);
                            int i162 = 2;
                            G.l(R.drawable.msg_message, org.telegram.messenger.bd.M0(2131745352, null), new y6(z7Var, G, i162), ziVar2.f1() > 0);
                            if (z7Var.I1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, G.e, G.d, false, false);
                                G.d(y0Var);
                                z7Var.G1 = y0Var;
                                y0Var.j(org.telegram.messenger.bd.M0(2131743599, null), R.drawable.menu_video_chromecast, null);
                                z7Var.G1.setOnClickListener(new q2(i162, z7Var, G));
                                org.telegram.messenger.g0.E2(k7Var);
                                z7Var.G1.addView(k7Var, 0, b8.mf.c(-1.0f, -1));
                                z7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new y6(z7Var, G, 3), org.telegram.messenger.bd.M0(2131746653, null), z7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        g7Var2.addView(q0Var3, b8.mf.e(48, 48, 51));
        k7 k7Var = new k7(this, activity, 0);
        this.H1 = k7Var;
        this.I1 = true;
        try {
            k7Var.setRouteSelector(f6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.I1 = false;
        }
        this.H1.setVisibility(4);
        org.telegram.ui.tq tqVar2 = this.F1;
        if (tqVar2 != null) {
            tqVar2.a(d1.f.u());
        }
        this.E1.setShowedFromBottom(true);
        this.E1.setDelegate(new r6(this, 2));
        this.E1.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.s1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, b8.mf.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new fi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, b8.mf.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.t1 = textView2;
        int i18 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, e6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.bd.M0(2131748251, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.u1 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i18, e6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
        l7 l7Var = new l7(this, activity);
        this.p1 = l7Var;
        l7Var.setClipToPadding(false);
        getContext();
        u4.b0 b0Var = new u4.b0(1, false);
        this.q1 = b0Var;
        l7Var.setLayoutManager(b0Var);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(l7Var, b8.mf.e(-1, -1, 51));
        y7 y7Var = new y7(this, activity);
        this.r1 = y7Var;
        l7Var.setAdapter(y7Var);
        org.telegram.ui.ActionBar.r6.m(l7Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        l7Var.setOnItemClickListener(new ai.a(2));
        l7Var.setOnItemLongClickListener(new r6(this, 3));
        l7Var.setOnScrollListener(new ai.j5(this, 28));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.w1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i19 = 0;
        spannableStringBuilder.setSpan(new wp(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f7
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i20 = i19;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                z7 z7Var = this.b;
                switch (i20) {
                    case 0:
                        org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                        if (ziVar2 != null && z7Var.x2 != null) {
                            z7Var.R0(ziVar2, true, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.b, e6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.zi ziVar3 = MediaController.B().v0;
                        if (ziVar3 != null && z7Var.x2 != null) {
                            z7Var.R0(ziVar3, false, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.b, e6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.v1.addView(dVar, b8.mf.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i20 = 1;
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.x1 = dVar2;
        dVar2.setText(org.telegram.messenger.bd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f7
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i202 = i20;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                z7 z7Var = this.b;
                switch (i202) {
                    case 0:
                        org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                        if (ziVar2 != null && z7Var.x2 != null) {
                            z7Var.R0(ziVar2, true, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.b, e6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.zi ziVar3 = MediaController.B().v0;
                        if (ziVar3 != null && z7Var.x2 != null) {
                            z7Var.R0(ziVar3, false, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.b, e6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.v1.addView(dVar2, b8.mf.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.bp bpVar = MediaController.B().R0;
        this.n2 = bpVar;
        boolean z10 = bpVar != null;
        this.l2 = z10;
        this.k1.n0 = z10;
        this.m2 = O0();
        this.o2 = MediaController.B().S0;
        if (O0()) {
            xVar = q10;
            this.b2 = xVar.a(8, R.drawable.msg_add);
        } else {
            xVar = q10;
        }
        org.telegram.ui.ActionBar.q0 a10 = xVar.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, 5);
        this.c2 = a10;
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        int i21 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(searchField, i21, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, e6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i21, e6Var);
        if (z10) {
            l7Var.r1();
            v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var));
            this.k1.setAlpha(1.0f);
            this.j1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.J2;
            p7 p7Var2 = this.k1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(p7Var2, valueOf);
        }
        boolean z11 = this.o2.size() > 1;
        y7Var.h = z11;
        if (z11) {
            l7Var.setVisibility(0);
            l7Var.setTranslationY(0.0f);
        } else {
            l7Var.setVisibility(8);
            l7Var.setTranslationY(org.telegram.messenger.g0.q.y);
        }
        y7Var.f();
        this.k1.setTitle(org.telegram.messenger.bd.M0(2131753952, null));
        org.telegram.messenger.bp bpVar2 = this.n2;
        if (bpVar2 != null) {
            if (bpVar2.b == org.telegram.messenger.h10.i(this.a).e()) {
                this.k1.setTitle(org.telegram.messenger.bd.M0(2131746651, null));
            } else {
                this.k1.setTitle(org.telegram.messenger.bd.a0(null, null, 2131746652, org.telegram.messenger.m5.t(this.n2.b)));
            }
        } else if (ziVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.zi.B0(ziVar.k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.hp.s1(this.a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.k1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.h10.i(this.a).e()) {
                if (ziVar.Q1() == 2666000) {
                    this.k1.setTitle(org.telegram.messenger.bd.M0(2131754252, null));
                } else {
                    this.k1.setTitle(org.telegram.messenger.bd.M0(2131745911, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.k1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.k1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            u4.y yVar = new u4.y(new fi.c(this, 3));
            this.y1 = yVar;
            yVar.h(l7Var);
        }
        this.b.addView(this.v1, b8.mf.e(-1, ((O0() || this.q2) ? 0 : 52) + org.telegram.messenger.hs.J2, 83));
        this.b.addView(this.m1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).height = org.telegram.messenger.g0.L(((O0() || this.q2) ? 0 : 52) + org.telegram.messenger.hs.J2);
        ((FrameLayout.LayoutParams) this.m1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.hs.J2 + ((O0() || this.q2) ? 0 : 52));
        this.b.addView(this.l1, b8.mf.c(3.0f, -1));
        this.b.addView(this.k1);
        g7 g7Var3 = new g7(this, activity, 1);
        this.Z1 = g7Var3;
        g7Var3.setAlpha(0.0f);
        g7Var3.setVisibility(4);
        this.c.addView(g7Var3);
        k9 k9Var = new k9(activity);
        this.a2 = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        k9Var.setScaleX(0.9f);
        k9Var.setScaleY(0.9f);
        g7Var3.addView(k9Var, b8.mf.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.o1 && y7Var.b() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        Z0();
    }

    public static void I0(z7 z7Var) {
        View view = z7Var.l1;
        p7 p7Var = z7Var.k1;
        l7 l7Var = z7Var.p1;
        if (l7Var.getChildCount() <= 0) {
            int paddingTop = l7Var.getPaddingTop();
            z7Var.r2 = paddingTop;
            l7Var.setTopGlowOffset(paddingTop);
            z7Var.b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = l7Var.getChildAt(0);
        bj0 bj0Var = (bj0) l7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        boolean z11 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z11 && p7Var.getTag() == null) || (!z11 && p7Var.getTag() != null)) {
            p7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = z7Var.t2;
            if (animatorSet != null) {
                animatorSet.cancel();
                z7Var.t2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            z7Var.t2 = animatorSet2;
            if (z7Var.l2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, z7Var.J2, z11 ? 1.0f : 0.0f);
                View view2 = z7Var.j1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(p7Var, (Property<p7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            z7Var.t2.setDuration(320L);
            z7Var.t2.setInterpolator(xq.h);
            z7Var.t2.addListener(new n7(z7Var, 2));
            z7Var.t2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.m, top);
        if (z7Var.r2 != D) {
            z7Var.r2 = D;
            l7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.m);
            z7Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        float min = z7Var.t0 + ((int) (l7Var.getTranslationY() + ((z7Var.r2 - z7Var.t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - z7Var.t0) / (org.telegram.messenger.g0.L(4.0f) + L2)) : 1.0f;
        z7Var.E2 = min;
        if (min <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, z7Var.J0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != z7Var.D2) {
            z7Var.D2 = z10;
            org.telegram.messenger.g0.q3(z7Var, z10);
        }
    }

    public static boolean L0(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static org.telegram.messenger.ac N0(org.telegram.messenger.zi ziVar) {
        TLRPC.Document F0 = ziVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w10 instanceof TLRPC.TL_photoSize) && !(w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            w10 = null;
        }
        if (w10 != null) {
            return org.telegram.messenger.ac.c(w10, F0);
        }
        String u02 = ziVar.u0(true);
        if (u02 != null) {
            return org.telegram.messenger.ac.g(u02);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final f60 J0(f60 f60Var, org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.ap H1 = org.telegram.messenger.hp.s1(this.a).H1();
        TLRPC.Document F0 = ziVar.F0();
        long j10 = F0 != null ? F0.id : 0L;
        f60 J = f60Var.J();
        J.c(R.drawable.ic_ab_back, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(f60Var, 27), false);
        J.k();
        J.l(R.drawable.left_status_profile, org.telegram.messenger.bd.M0(2131753913, null), new x6(this, ziVar, f60Var, 6), !H1.b.contains(Long.valueOf(j10)));
        J.c(R.drawable.msg_saved, org.telegram.messenger.bd.M0(2131753910, null), new x6(this, ziVar, f60Var, 7), false);
        J.c(R.drawable.menu_download_round, org.telegram.messenger.bd.M0(2131753914, null), new x6(this, ziVar, f60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.bd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.S1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.J0);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0);
        if (!this.M2 || w02 != this.N2) {
            this.N2 = w02;
            q0Var.setIconColor(w02);
        }
        boolean z10 = this.M2;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.E1;
        if (!z10 || w03 != this.O2) {
            this.O2 = w03;
            q0Var2.setIconColor(w03);
        }
        if (!this.M2 || w04 != this.P2) {
            this.P2 = w04;
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.k6.H1(q0Var2.getBackground(), w04, true);
        }
        this.M2 = true;
        this.J1.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        d1();
        int i3 = org.telegram.ui.ActionBar.k6.G8;
        q0Var.H(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        q0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), false);
        q0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), true);
        q0Var2.H(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
    }

    public final void M0(org.telegram.messenger.zi ziVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i3 = org.telegram.messenger.h10.t0;
        int i10 = this.a;
        LaunchActivity launchActivity = this.x2;
        if (i3 != i10) {
            launchActivity.O0(i10);
        }
        Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
        l10.putBoolean("canSelectTopics", true);
        org.telegram.ui.uw uwVar = new org.telegram.ui.uw(l10);
        if (ziVar.f1() >= 0) {
            k10 = org.telegram.messenger.k5.k(ziVar);
            tL_document = null;
        } else {
            if (!(ziVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ziVar.F0();
            k10 = null;
        }
        uwVar.D2 = new a1.d(this, k10, tL_document, ziVar, 8);
        launchActivity.t0(uwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.bp bpVar = this.n2;
        return bpVar != null && bpVar.b == org.telegram.messenger.h10.i(this.a).e();
    }

    public final void P0(int i3) {
        LaunchActivity launchActivity;
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if (ziVar == null || (launchActivity = this.x2) == null) {
            return;
        }
        if (i3 == 1) {
            M0(ziVar);
            return;
        }
        if (i3 == 2) {
            V0(ziVar);
            return;
        }
        if (i3 != 4) {
            if (i3 == 5) {
                Q0(ziVar);
                return;
            }
            if (i3 == 6) {
                tf.b.t().z(MediaController.B().z());
                this.H1.performClick();
                return;
            } else {
                if (i3 == 7) {
                    R0(ziVar, false, new u6(this, ziVar, 0), false);
                    return;
                }
                if (i3 == 8) {
                    gi.x6 x6Var = new gi.x6(getContext(), true, null, new w6(this, 0), null);
                    x6Var.a2 = true;
                    x6Var.S1 = false;
                    x6Var.i2.O(true);
                    x6Var.show();
                    return;
                }
                return;
            }
        }
        int i10 = org.telegram.messenger.h10.t0;
        int i11 = this.a;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ziVar.f1());
        org.telegram.messenger.hs.f(this.a).k(org.telegram.messenger.hs.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.wm(bundle), false, false);
        dismiss();
    }

    public final void Q0(org.telegram.messenger.zi ziVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
            LaunchActivity launchActivity = this.x2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(ziVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = ziVar.S0();
        }
        String str = B;
        String str2 = ziVar.k.attachPath;
        if (str2 != null && str2.length() > 0 && !t4.c.p(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            org.telegram.messenger.w7.G(this.a);
            str2 = org.telegram.messenger.w7.N(ziVar.k, false, true).toString();
        }
        MediaController.d0(str2, this.x2, 3, str, ziVar.F0() != null ? ziVar.F0().mime_type : "", new w6(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final int R() {
        g7 g7Var = this.v1;
        if (g7Var == null) {
            return 0;
        }
        if (this.o2.size() <= 1) {
            return g7Var.getMeasuredHeight() + this.t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.p1.getTranslationY() + ((this.r2 - this.t0) - L));
        if (this.t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.m);
    }

    public final void R0(org.telegram.messenger.zi ziVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = ziVar.F0();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new z6(this, z11, ziVar, z10, runnable, j10, F0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0(boolean z10) {
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if (ziVar != null) {
            if (z10) {
                l7 l7Var = this.p1;
                int childCount = l7Var.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = l7Var.getChildAt(i3);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != ziVar) {
                        i3++;
                    }
                }
            }
            int indexOf = this.o2.indexOf(ziVar);
            if (this.m2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = org.telegram.messenger.az.O0;
                u4.b0 b0Var = this.q1;
                if (z11) {
                    b0Var.n0(indexOf);
                    return true;
                }
                b0Var.n0(this.o2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void T0(org.telegram.ui.ActionBar.y0 y0Var, boolean z10) {
        if (z10) {
            int i3 = org.telegram.ui.ActionBar.k6.Lj;
            y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.E8;
            y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 0);
        int i3 = org.telegram.ui.ActionBar.k6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jj));
        int i11 = org.telegram.ui.ActionBar.k6.w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x7));
        int i12 = org.telegram.ui.ActionBar.k6.Kj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.S1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.Lj));
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        i7 i7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        j7 j7Var = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.C1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.u1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        r7 r7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        r7 r7Var2 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        return arrayList;
    }

    public final void U0(final boolean z10) {
        boolean O0 = O0();
        gi.d dVar = this.x1;
        gi.d dVar2 = this.w1;
        if (O0 || this.q2) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        xq xqVar = xq.h;
        final int i3 = 0;
        duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.w1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.x1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i10 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ z7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.w1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.x1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(org.telegram.messenger.zi ziVar) {
        File file;
        try {
            if (!TextUtils.isEmpty(ziVar.k.attachPath)) {
                file = new File(ziVar.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7.G(this.a);
                file = org.telegram.messenger.w7.N(ziVar.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.x2);
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131747226, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ziVar.u1());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Context context = org.telegram.messenger.t0.b;
                    org.telegram.messenger.t0.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.d(context, "org.telegram.messenger.beta.provider", file));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            }
            this.x2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131745469, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void W0(boolean z10, boolean z11) {
        k9 k9Var = this.a2;
        g7 g7Var = this.Z1;
        if (z10) {
            if (g7Var.getVisibility() == 0 || this.d2) {
                return;
            }
            g7Var.setTag(1);
            q7 q7Var = this.z1;
            k9Var.setImageBitmap(q7Var.a[q7Var.b].getImageReceiver().n());
            this.d2 = true;
            nk0.d(new s6(this, 1));
            g7Var.setVisibility(0);
            g7Var.animate().alpha(1.0f).setDuration(180L).setListener(new n7(this, 0)).start();
            k9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (g7Var.getVisibility() != 0) {
            return;
        }
        g7Var.setTag(null);
        if (z11) {
            this.d2 = true;
            g7Var.animate().alpha(0.0f).setDuration(180L).setListener(new n7(this, 1)).start();
            k9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            g7Var.setAlpha(0.0f);
            g7Var.setVisibility(4);
            k9Var.setImageBitmap(null);
            k9Var.setScaleX(0.9f);
            k9Var.setScaleY(0.9f);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f11 >= childAt.getY() + this.F.getY()) {
                if (f11 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.F.getX()) {
                        if (f10 <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.b.getTop();
        Drawable drawable = this.s0;
        return f11 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f10 < ((float) this.b.getLeft()) || f10 > ((float) this.b.getRight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.zi ziVar) {
        int i3 = 1;
        f60 G = f60.G(this.c, this.J0, wVar, true);
        Object[] objArr = 0;
        if (O0()) {
            G.l(R.drawable.msg_forward, org.telegram.messenger.bd.M0(2131750588, null), new x6(this, G, ziVar, (int) (objArr == true ? 1 : 0)), !this.q2);
            G.l(R.drawable.msg_shareout, org.telegram.messenger.bd.M0(2131745469, null), new x6(this, G, ziVar, i3), !this.q2);
            G.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new x6(this, ziVar, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0(G, ziVar), 7), !this.q2);
            if (!this.q2 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, org.telegram.messenger.bd.M0(2131750588, null), new x6(this, G, ziVar, r1), !this.q2);
            G.l(R.drawable.msg_share, org.telegram.messenger.bd.M0(2131745469, null), new x6(this, G, ziVar, 4), !this.q2);
            G.l(R.drawable.msg_view_file, org.telegram.messenger.bd.M0(2131745352, null), new u6(this, ziVar, i3), ziVar.f1() > 0);
        }
        G.V(org.telegram.messenger.bd.a0 ? 3 : 5);
        G.Z();
    }

    public final void Y0() {
        if (this.y2 == 1) {
            this.B2 = System.currentTimeMillis();
            this.z2 = MediaController.B().v0.b0;
            mi.b0 b0Var = this.F2;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.h3(b0Var);
        }
    }

    public final void Z0() {
        LinearLayout linearLayout = this.s1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.v1.getVisibility() == 0 ? org.telegram.messenger.g0.L(150.0f) : -org.telegram.messenger.g0.L(30.0f))) / 2);
    }

    public final void a1(boolean z10) {
        if (this.M1 == null) {
            return;
        }
        float f10 = MediaController.B().r0;
        this.N1.b(z10, f10);
        this.O1.e(z10, f10);
        updateColors();
        boolean z11 = this.P1;
        int i3 = 0;
        this.P1 = false;
        while (true) {
            org.telegram.ui.ActionBar.y0[] y0VarArr = this.Q1;
            if (i3 >= y0VarArr.length) {
                return;
            }
            if (z11 || !L0(f10, R2[i3])) {
                org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[i3];
                int i10 = org.telegram.ui.ActionBar.k6.E8;
                y0Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
            } else {
                org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[i3];
                int i11 = org.telegram.ui.ActionBar.k6.Ei;
                y0Var2.d(org.telegram.ui.ActionBar.k6.w0(i11, this.J0), org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
            }
            i3++;
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
    public final void b1(org.telegram.messenger.zi ziVar, boolean z10) {
        boolean z11;
        float f10;
        int i3;
        s7 s7Var = this.K1;
        if (s7Var != null) {
            if (s7Var.x) {
                i3 = (int) (ziVar.L0() * s7Var.getProgress());
            } else {
                if (this.z2 >= 0.0f) {
                    int i10 = this.y2;
                    z11 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z11) {
                        s7Var.e(z10, ziVar.b0);
                    } else {
                        s7Var.e(z10, this.z2);
                    }
                    f10 = 1.0f;
                    if (!this.h2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.g2) >= 500) {
                            if (MediaController.B().m0) {
                                f10 = org.telegram.messenger.w7.G(this.a).t(this.s2, ziVar.b0);
                            }
                            this.g2 = elapsedRealtime;
                        } else {
                            f10 = -1.0f;
                        }
                    }
                    if (f10 != -1.0f) {
                        q1.g gVar = this.f2;
                        gVar.m.i = f10 * 1000.0f;
                        gVar.h();
                    }
                    if (z11) {
                        i3 = ziVar.g0;
                    } else {
                        i3 = (int) (ziVar.L0() * s7Var.getProgress());
                        ziVar.g0 = i3;
                    }
                }
                z11 = false;
                if (z11) {
                }
                f10 = 1.0f;
                if (!this.h2) {
                }
                if (f10 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.u2 != i3) {
                this.u2 = i3;
                this.L1.l(org.telegram.messenger.g0.g0(i3, false, false), false);
            }
            s7Var.g(ziVar);
        }
    }

    public final void c1() {
        int i3 = org.telegram.messenger.az.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.S1;
        if (i3 != 0 && i3 != 1) {
            if (i3 == 2) {
                q0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.k6.Lj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.az.N0) {
            if (i3 == 0) {
                q0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                q0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!org.telegram.messenger.az.O0) {
            q0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i3 == 0) {
            q0Var.setIcon(R.drawable.player_new_order);
        } else {
            q0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i3 == 0 && !org.telegram.messenger.az.N0 && !org.telegram.messenger.az.O0) {
            int i11 = org.telegram.ui.ActionBar.k6.Kj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Lj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.J0), true);
        if (i3 != 0) {
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754787, null));
        } else if (org.telegram.messenger.az.N0) {
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131745332, null));
        } else {
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131746037, null));
        }
    }

    public final void d1() {
        T0(this.V1, org.telegram.messenger.az.N0);
        T0(this.W1, org.telegram.messenger.az.O0);
        T0(this.U1, org.telegram.messenger.az.S0 == 1);
        T0(this.T1, org.telegram.messenger.az.S0 == 2);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.messenger.zi ziVar;
        int i11 = org.telegram.messenger.hs.h2;
        int i12 = org.telegram.messenger.hs.f2;
        int i13 = org.telegram.messenger.hs.g2;
        l7 l7Var = this.p1;
        if (i3 == i11 || i3 == i13 || i3 == i12) {
            f1(i3 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i3 == i12 || i3 == i13) {
                int childCount = l7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = l7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.zi.S4(messageObject.k) || messageObject.J3())) {
                        wVar.b(false, true);
                    }
                }
                if (i3 == i13 && MediaController.B().v0 != null) {
                    if (MediaController.B().H()) {
                        Y0();
                    } else if (this.y2 == 1 && this.z2 != -1.0f) {
                        mi.b0 b0Var = this.F2;
                        org.telegram.messenger.g0.r(b0Var);
                        this.C2 = 0L;
                        b0Var.run();
                        this.z2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.zi) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = l7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = l7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.zi.S4(messageObject2.k) || messageObject2.J3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.tq tqVar = this.F1;
            if (tqVar != null) {
                tqVar.a(d1.f.u());
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.e2) {
            org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
            if (ziVar2 == null || !ziVar2.J3()) {
                return;
            }
            b1(ziVar2, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.J4) {
            a1(true);
            return;
        }
        int i16 = org.telegram.messenger.hs.K0;
        y7 y7Var = this.r1;
        if (i3 == i16) {
            this.n2 = MediaController.B().R0;
            this.o2 = MediaController.B().S0;
            y7Var.f();
            return;
        }
        if (i3 == org.telegram.messenger.hs.L0) {
            this.n2 = MediaController.B().R0;
            this.o2 = MediaController.B().S0;
            y7Var.f();
            if (org.telegram.messenger.az.O0) {
                l7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                u4.b0 b0Var2 = this.q1;
                b0Var2.L0();
                int N0 = b0Var2.N0();
                if (N0 != -1) {
                    View m10 = b0Var2.m(N0);
                    b0Var2.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.Y1) {
            if (((String) objArr[0]).equals(this.s2)) {
                f1(false);
                this.h2 = true;
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.X1) {
            if (i3 == org.telegram.messenger.hs.U3) {
                f1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.s2) || (ziVar = MediaController.B().v0) == null) {
            return;
        }
        if (!this.h2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.g2) >= 500) {
                r13 = MediaController.B().m0 ? org.telegram.messenger.w7.G(this.a).t(this.s2, ziVar.b0) : 1.0f;
                this.g2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            q1.g gVar = this.f2;
            gVar.m.i = r13 * 1000.0f;
            gVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.K0);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.L0);
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.U3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.J4);
        org.telegram.messenger.z5.q(this.a).v(this);
        if (Q2 == this) {
            Q2 = null;
        }
    }

    public final void e1() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.l2 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.h5, this.J0);
        if (w02 != this.L2) {
            this.L2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.J0);
        i7 i7Var = this.B1;
        if (i7Var != null) {
            i7Var.h(w03, "Triangle 3");
            i7Var.h(w03, "Triangle 4");
            i7Var.h(w03, "Rectangle 4");
        }
        j7 j7Var = this.C1;
        if (j7Var != null) {
            j7Var.h(w03, "Triangle 3");
            j7Var.h(w03, "Triangle 4");
            j7Var.h(w03, "Rectangle 4");
        }
        s7 s7Var = this.K1;
        if (s7Var != null) {
            s7Var.setOuterColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        if (q0Var != null) {
            float f10 = MediaController.B().r0;
            int w04 = org.telegram.ui.ActionBar.k6.w0(!L0(f10, 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7, this.J0);
            cu0 cu0Var = this.N1;
            if (cu0Var != null) {
                cu0Var.a.u(w04);
                Paint paint = cu0Var.b;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), w04 & 436207615, true);
            int i3 = 0;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.Q1;
                if (i3 >= y0VarArr.length) {
                    break;
                }
                if (y0VarArr[i3] != null) {
                    int w05 = org.telegram.ui.ActionBar.k6.w0(L0(f10, R2[i3]) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.E8, this.J0);
                    y0VarArr[i3].d(w05, w05);
                }
                i3++;
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.G1;
        if (y0Var != null) {
            k7 k7Var = this.H1;
            if (k7Var != null && k7Var.b()) {
                z10 = true;
            }
            int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.J0);
            int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            y0Var.e(w06, w07, org.telegram.ui.ActionBar.k6.w0(i10, this.J0), z10);
            this.G1.setSelectorColor((k7Var == null || !k7Var.b()) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.J0)));
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
        int i3;
        k9 k9Var;
        ImageView imageView;
        int i10;
        int i11;
        String str;
        boolean z14;
        Bitmap bitmap;
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        if ((ziVar == null && z10) || (ziVar != null && !ziVar.J3())) {
            dismiss();
            return;
        }
        if (ziVar == null) {
            this.p2 = null;
            return;
        }
        boolean z15 = ziVar == this.p2;
        this.p2 = ziVar;
        long j10 = ziVar.T;
        org.telegram.ui.ActionBar.q0 q0Var = this.E1;
        if (j10 != 0 || ziVar.f1() <= -2000000000) {
            q0Var.setVisibility(4);
        } else {
            q0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        long j11 = ziVar.F0() != null ? ziVar.F0().id : 0L;
        boolean z16 = (B0 < 0 && org.telegram.messenger.hp.s1(this.a).A2(B0)) || org.telegram.messenger.hp.s1(this.a).A2(org.telegram.messenger.zi.B0(ziVar.k)) || ziVar.k.noforwards;
        if (z16 != this.q2) {
            this.q2 = z16;
            g7 g7Var = this.v1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(((z16 || O0()) ? 0 : 52) + org.telegram.messenger.hs.J2);
            g7Var.setLayoutParams(layoutParams);
            View view = this.m1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.hs.J2 + ((O0() || z16) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z16) {
            q0Var.t(1);
            q0Var.t(2);
            q0Var.t(5);
            q0Var.t(6);
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(16.0f));
        } else {
            q0Var.S(1);
            q0Var.S(2);
            q0Var.S(5);
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        }
        String str2 = ziVar.k.attachPath;
        if (str2 != null && str2.length() > 0) {
            file = new File(ziVar.k.attachPath);
        }
        file = null;
        if (file == null) {
            org.telegram.messenger.w7.G(this.a);
            file = org.telegram.messenger.w7.N(ziVar.k, false, true);
        }
        boolean z17 = org.telegram.messenger.az.B0 && ((int) org.telegram.messenger.zi.B0(ziVar.k)) != 0 && ziVar.J3();
        boolean exists = file.exists();
        ImageView imageView2 = this.X1;
        s7 s7Var = this.K1;
        d70 d70Var = this.J1;
        if (exists || z17) {
            org.telegram.messenger.z5.q(this.a).v(this);
            d70Var.setVisibility(4);
            s7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = ziVar.S0();
            org.telegram.messenger.z5.q(this.a).a(S0, null, this);
            Float w10 = org.telegram.messenger.zb.D().w(S0);
            d70Var.a(false, w10 != null ? w10.floatValue() : 0.0f);
            d70Var.setVisibility(0);
            s7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        b1(ziVar, !z15);
        q7 q7Var = this.z1;
        k9 k9Var2 = z15 ? q7Var.a[q7Var.b] : q7Var.a[q7Var.b == 0 ? (char) 1 : (char) 0];
        of.a aVar = MediaController.B().E0;
        if (z15) {
            z11 = true;
            z12 = false;
            z13 = z15;
            i3 = 3;
        } else {
            AnimatorSet animatorSet = q7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            q7Var.c = new AnimatorSet();
            int i12 = q7Var.b == 0 ? 1 : 0;
            q7Var.b = i12;
            z11 = true;
            k9[] k9VarArr = q7Var.a;
            k9 k9Var3 = k9VarArr[i12 ^ 1];
            k9 k9Var4 = k9VarArr[i12];
            boolean I = k9Var3.getImageReceiver().I();
            k9Var4.setAlpha(I ? 1.0f : 0.0f);
            k9Var4.setScaleX(0.8f);
            k9Var4.setScaleY(0.8f);
            k9Var4.setVisibility(0);
            if (I) {
                k9Var3.bringToFront();
            } else {
                k9Var3.setVisibility(8);
                k9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z12 = false;
            z13 = z15;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(xq.g);
            ofFloat.addUpdateListener(new dh.u(5, k9Var4, I));
            if (I) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(k9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(xq.i);
                ofFloat2.addUpdateListener(new ci.uc(12, k9Var3, k9Var4));
                i3 = 3;
                ofFloat2.addListener(new x5(k9Var3, i3));
                q7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                i3 = 3;
                q7Var.c.play(ofFloat);
            }
            q7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.s2 = org.telegram.messenger.w7.r(null, ziVar.F0());
            boolean z18 = z12;
            this.h2 = z18;
            String u02 = ziVar.u0(z18);
            int i13 = i3;
            org.telegram.messenger.ac N0 = N0(ziVar);
            if (TextUtils.isEmpty(u02)) {
                k9Var = k9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                if (N0 != null) {
                    k9Var.g(1, 0L, ziVar, null, null, null, null, N0);
                } else {
                    str = null;
                    k9Var.setImageDrawable(null);
                    k9Var.invalidate();
                }
            } else {
                org.telegram.messenger.ac g7 = org.telegram.messenger.ac.g(u02);
                k9Var = k9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                k9Var.g(1, 0L, ziVar, null, null, null, g7, N0);
            }
            str = null;
            k9Var.invalidate();
        } else {
            k9Var2.setImageBitmap(bitmap);
            this.s2 = null;
            this.h2 = z11;
            str = null;
            imageView = imageView2;
            i10 = i3;
            i11 = 8;
        }
        boolean H = MediaController.B().H();
        je0 je0Var = this.Y1;
        if (H) {
            z14 = true;
            je0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754929, str));
        } else {
            z14 = true;
            je0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754930, str));
        }
        String z19 = ziVar.z1(z14);
        String x12 = ziVar.x1(z14);
        this.A1.setText(z19);
        this.D1.setText(x12);
        org.telegram.messenger.ap H1 = org.telegram.messenger.hp.s1(this.a).H1();
        this.w1.setLoading(H1.c);
        U0(H1.b.contains(Long.valueOf(j11)));
        int L0 = (int) ziVar.L0();
        this.v2 = L0;
        TextView textView = this.R1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.g0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.M1;
        if (L0 > 600) {
            q0Var2.setVisibility(0);
        } else {
            q0Var2.setVisibility(i11);
        }
        if (z13) {
            return;
        }
        MediaController B = MediaController.B();
        ArrayList arrayList = B.S0;
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int i14 = B.V0;
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
        arrayList2.add((org.telegram.messenger.zi) arrayList.get(i15));
        if (i15 != i16) {
            arrayList2.add((org.telegram.messenger.zi) arrayList.get(i16));
        }
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i17);
            org.telegram.messenger.ac N02 = N0(ziVar2);
            if (N02 != null) {
                if (N02.g != null) {
                    org.telegram.messenger.zb D = org.telegram.messenger.zb.D();
                    D.s.c(new org.telegram.messenger.bb(D, N02.g, i10));
                } else {
                    org.telegram.messenger.w7.G(this.a).W(N02, ziVar2, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.w2;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.J1.a(true, Math.min(1.0f, j10 / j11));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        g7 g7Var = this.Z1;
        if (view != g7Var) {
            return false;
        }
        g7Var.layout(0, 0, g7Var.getMeasuredWidth(), g7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean l0(View view, int i3, int i10) {
        g7 g7Var = this.Z1;
        if (view != g7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        g7Var.measure(View.MeasureSpec.makeMeasureSpec(j2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(j2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        p7 p7Var = this.k1;
        if (p7Var != null && p7Var.o0) {
            p7Var.l(true);
        } else if (this.Z1.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            if (this.c2 != null && this.S1 != null && this.E1 != null && this.J1 != null) {
                K0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            e1();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            float f10 = this.E2;
            if (f10 >= 0.0f) {
                boolean z10 = f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) > 0.699999988079071d;
                if (z10 != this.D2) {
                    this.D2 = z10;
                    org.telegram.messenger.g0.q3(this, z10);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        Q2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        if (q0Var != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(!L0(MediaController.B().r0, 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7, this.J0);
            cu0 cu0Var = this.N1;
            if (cu0Var != null) {
                cu0Var.a.u(w02);
                Paint paint = cu0Var.b;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(w02 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.G1;
        if (y0Var != null) {
            k7 k7Var = this.H1;
            boolean z10 = k7Var != null && k7Var.b();
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.J0);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.J0);
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            y0Var.e(w03, w04, org.telegram.ui.ActionBar.k6.w0(i3, this.J0), z10);
            this.G1.setSelectorColor((k7Var == null || !k7Var.b()) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)));
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
