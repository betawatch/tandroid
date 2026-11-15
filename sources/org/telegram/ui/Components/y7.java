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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is, org.telegram.messenger.x5 {
    public static y7 T2;
    public static final float[] U2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hi.d A1;
    public final LaunchActivity A2;
    public final v4.y B1;
    public int B2;
    public final p7 C1;
    public float C2;
    public final q7 D1;
    public int D2;
    public final h7 E1;
    public long E2;
    public final i7 F1;
    public long F2;
    public final q7 G1;
    public boolean G2;
    public final org.telegram.ui.ActionBar.q0 H1;
    public float H2;
    public final org.telegram.ui.wq I1;
    public final j6.o I2;
    public org.telegram.ui.ActionBar.z0 J1;
    public l7 J2;
    public final j7 K1;
    public long K2;
    public final boolean L1;
    public float L2;
    public final k70 M1;
    public final org.telegram.ui.Cells.f2 M2;
    public final r7 N1;
    public ValueAnimator N2;
    public final org.telegram.ui.ActionBar.j5 O1;
    public int O2;
    public final org.telegram.ui.ActionBar.q0 P1;
    public boolean P2;
    public final eu0 Q1;
    public int Q2;
    public final org.telegram.ui.ActionBar.v0 R1;
    public int R2;
    public boolean S1;
    public int S2;
    public final org.telegram.ui.ActionBar.z0[] T1;
    public final TextView U1;
    public final org.telegram.ui.ActionBar.q0 V1;
    public final org.telegram.ui.ActionBar.z0 W1;
    public final org.telegram.ui.ActionBar.z0 X1;
    public final org.telegram.ui.ActionBar.z0 Y1;
    public final org.telegram.ui.ActionBar.z0 Z1;
    public final ImageView a2;
    public final ke0 b2;
    public final f7 c2;
    public final i9 d2;
    public final org.telegram.ui.ActionBar.q0 e2;
    public final org.telegram.ui.ActionBar.q0 f2;
    public boolean g2;
    public final View[] h2;
    public final r1.g i2;
    public long j2;
    public boolean k2;
    public boolean l2;
    public final View m1;
    public int m2;
    public final o7 n1;
    public int n2;
    public final View o1;
    public final boolean o2;
    public final View p1;
    public final boolean p2;
    public boolean q1;
    public org.telegram.messenger.hp q2;
    public boolean r1;
    public ArrayList r2;
    public final k7 s1;
    public org.telegram.messenger.gj s2;
    public final v4.b0 t1;
    public boolean t2;
    public final x7 u1;
    public int u2;
    public final LinearLayout v1;
    public String v2;
    public final TextView w1;
    public AnimatorSet w2;
    public final TextView x1;
    public int x2;
    public final f7 y1;
    public int y2;
    public final hi.d z1;
    public final int z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(Activity activity, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) activity, e6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.User a22;
        int i7 = 1;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.T1 = z0VarArr;
        View[] viewArr = new View[5];
        this.h2 = viewArr;
        this.l2 = true;
        this.m2 = -1;
        this.u2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.C2 = -1.0f;
        this.H2 = -1.0f;
        this.I2 = new j6.o(this, 28);
        this.M2 = new org.telegram.ui.Cells.f2(this);
        this.r = true;
        O();
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar != null) {
            this.a = gjVar.K1;
        } else {
            this.a = org.telegram.messenger.m10.t0;
        }
        this.A2 = (LaunchActivity) activity;
        this.z2 = org.telegram.messenger.z5.q(this.a).k();
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.f2);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.g2);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.h2);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.e2);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.X1);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.K0);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.L0);
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.U3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.J4);
        n7 n7Var = new n7(this, activity);
        this.b = n7Var;
        final int i10 = 0;
        n7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        o7 o7Var = new o7(this, activity, e6Var, i10);
        this.n1 = o7Var;
        o7Var.setBackgroundColor(0);
        o7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i12, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, org.telegram.ui.ActionBar.j6.Ej, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i12, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 6, org.telegram.ui.ActionBar.j6.Gj, e6Var);
        o7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = o7Var.s();
        s5.setLayoutParams(c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        View view = new View(activity);
        this.m1 = view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, view, e6Var);
        o7Var.addView(view, 0, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        view.setAlpha(0.0f);
        o7Var.setAlpha(0.0f);
        o7Var.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 11));
        View view2 = new View(activity);
        this.o1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.p1 = view3;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view3, e6Var);
        f7 f7Var = new f7(this, activity, 2);
        this.y1 = f7Var;
        p7 p7Var = new p7(this, activity);
        this.C1 = p7Var;
        f7Var.addView(p7Var, c8.ja.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        q7 q7Var = new q7(this, activity, activity, i10);
        this.D1 = q7Var;
        f7Var.addView(q7Var, c8.ja.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        q7 q7Var2 = new q7(this, activity, activity, i7);
        this.G1 = q7Var2;
        f7Var.addView(q7Var2, c8.ja.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(this, activity, e6Var);
        this.N1 = r7Var;
        r7Var.setLineWidth(4);
        r7Var.setDelegate(new hi.l0(this, 29));
        r7Var.setReportChanges(true);
        f7Var.addView(r7Var, c8.ja.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        gVar.b(new c7(this, i10));
        this.i2 = gVar;
        k70 k70Var = new k70(activity);
        this.M1 = k70Var;
        k70Var.setVisibility(4);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Kj, k70Var, e6Var);
        k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        f7Var.addView(k70Var, c8.ja.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.O1 = j5Var;
        j5Var.setTextSize(12);
        j5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.j6.Jj;
        org.telegram.ui.ActionBar.q6.X(j5Var, i13, e6Var);
        j5Var.setImportantForAccessibility(2);
        f7Var.addView(j5Var, c8.ja.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.U1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        f7Var.addView(textView, c8.ja.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.j6.w0(i13, this.J0), false, e6Var);
        this.P1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        q0Var.setDelegate(new r6(this, i10));
        eu0 eu0Var = new eu0();
        this.Q1 = eu0Var;
        q0Var.setIcon(eu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), e6Var);
        this.R1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new s6(this, i10));
        z0VarArr[0] = q0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.hd.M0(2131745266, null));
        z0VarArr[1] = q0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.hd.M0(2131745267, null));
        z0VarArr[2] = q0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.hd.M0(2131745268, null));
        z0VarArr[3] = q0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.hd.M0(2131745270, null));
        z0VarArr[4] = q0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.hd.M0(2131745264, null));
        z0VarArr[5] = q0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.hd.M0(2131745265, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        f7Var.addView(q0Var, c8.ja.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new n2(2, this, fArr));
        q0Var.setOnLongClickListener(new fi.b2(2, this, e6Var));
        a1(false);
        f7 f7Var2 = new f7(this, activity, i10);
        f7Var.addView(f7Var2, c8.ja.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, e6Var);
        this.V1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M, e6Var);
        f7Var2.addView(q0Var2, c8.ja.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i15 = i10;
                y7 y7Var = this.b;
                switch (i15) {
                    case 0:
                        y7Var.d1();
                        y7Var.V1.V(null, null);
                        break;
                    default:
                        j7 j7Var = y7Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
                        if (gjVar2 != null) {
                            char c10 = 1;
                            m60 G = m60.G(y7Var.c, y7Var.J0, view4, true);
                            m60 J0 = y7Var.J0(G, gjVar2);
                            if (!y7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0, 8), !y7Var.t2);
                                if (!y7Var.t2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750587, null), new y6(y7Var, G, 0), !y7Var.t2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745459, null), new y6(y7Var, G, c10 == true ? 1 : 0), !y7Var.t2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.hd.M0(2131745342, null), new y6(y7Var, G, 2), gjVar2.e1() > 0);
                            int i16 = 3;
                            if (y7Var.L1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                y7Var.J1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743589, null), R.drawable.menu_video_chromecast, null);
                                y7Var.J1.setOnClickListener(new n2(i16, y7Var, G));
                                org.telegram.messenger.g0.E2(j7Var);
                                y7Var.J1.addView(j7Var, 0, c8.ja.c(-1.0f, -1));
                                y7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new y6(y7Var, G, i16), org.telegram.messenger.hd.M0(2131746645, null), y7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.W1 = q0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.hd.M0(2131746273, null));
        this.X1 = q0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.hd.M0(2131746276, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = q0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.hd.M0(2131745322, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Z1 = q0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.hd.M0(2131746027, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new r6(this, i7));
        int i15 = org.telegram.ui.ActionBar.j6.Nj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        h7 h7Var = new h7(this, activity, scaledTouchSlop);
        this.E1 = h7Var;
        viewArr[1] = h7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        h7Var.setScaleType(scaleType);
        h7Var.f(R.raw.player_prev, 20, 20, null);
        h7Var.h(w02, "Triangle 3");
        h7Var.h(w02, "Triangle 4");
        h7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        h7Var.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(h7Var, h03, null, M2, e6Var);
        f7Var2.addView(h7Var, c8.ja.e(48, 48, 51));
        h7Var.setContentDescription(org.telegram.messenger.hd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.a2 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ke0 ke0Var = new ke0(28);
        this.b2 = ke0Var;
        imageView.setImageDrawable(ke0Var);
        ke0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.q6.s(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.q6.j(imageView, h04, null, M3, e6Var);
        f7Var2.addView(imageView, c8.ja.e(48, 48, 51));
        imageView.setOnClickListener(new bi.o(12));
        i7 i7Var = new i7(this, activity, scaledTouchSlop);
        this.F1 = i7Var;
        viewArr[3] = i7Var;
        i7Var.setScaleType(scaleType);
        i7Var.f(R.raw.player_prev, 20, 20, null);
        i7Var.h(w02, "Triangle 3");
        i7Var.h(w02, "Triangle 4");
        i7Var.h(w02, "Rectangle 4");
        i7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i14);
        i7Var.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(i7Var, h05, null, M4, e6Var);
        f7Var2.addView(i7Var, c8.ja.e(48, 48, 51));
        i7Var.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, e6Var);
        this.H1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(R.drawable.ic_ab_other, activity, e6Var);
        this.I1 = wqVar;
        q0Var3.setIcon(wqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        final int i16 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(q0Var3, h06, null, M5, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t6
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i152 = i16;
                y7 y7Var = this.b;
                switch (i152) {
                    case 0:
                        y7Var.d1();
                        y7Var.V1.V(null, null);
                        break;
                    default:
                        j7 j7Var = y7Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
                        if (gjVar2 != null) {
                            char c10 = 1;
                            m60 G = m60.G(y7Var.c, y7Var.J0, view4, true);
                            m60 J0 = y7Var.J0(G, gjVar2);
                            if (!y7Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0, 8), !y7Var.t2);
                                if (!y7Var.t2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750587, null), new y6(y7Var, G, 0), !y7Var.t2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745459, null), new y6(y7Var, G, c10 == true ? 1 : 0), !y7Var.t2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.hd.M0(2131745342, null), new y6(y7Var, G, 2), gjVar2.e1() > 0);
                            int i162 = 3;
                            if (y7Var.L1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                y7Var.J1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743589, null), R.drawable.menu_video_chromecast, null);
                                y7Var.J1.setOnClickListener(new n2(i162, y7Var, G));
                                org.telegram.messenger.g0.E2(j7Var);
                                y7Var.J1.addView(j7Var, 0, c8.ja.c(-1.0f, -1));
                                y7Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new y6(y7Var, G, i162), org.telegram.messenger.hd.M0(2131746645, null), y7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        f7Var2.addView(q0Var3, c8.ja.e(48, 48, 51));
        j7 j7Var = new j7(this, activity, 0);
        this.K1 = j7Var;
        this.L1 = true;
        try {
            j7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.L1 = false;
        }
        this.K1.setVisibility(4);
        org.telegram.ui.wq wqVar2 = this.I1;
        if (wqVar2 != null) {
            wqVar2.a(d1.f.u());
        }
        this.H1.setShowedFromBottom(true);
        this.H1.setDelegate(new r6(this, 2));
        this.H1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, c8.ja.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.W5, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ja.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.w1 = textView2;
        int i18 = org.telegram.ui.ActionBar.j6.X5;
        org.telegram.ui.ActionBar.q6.U(textView2, i18, e6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.hd.M0(2131748243, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.x1 = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i18, e6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ja.t(-2, -2, 17, 0, 6, 0, 0));
        k7 k7Var = new k7(this, activity);
        this.s1 = k7Var;
        k7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.t1 = b0Var;
        k7Var.setLayoutManager(b0Var);
        k7Var.setHorizontalScrollBarEnabled(false);
        k7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(k7Var, c8.ja.e(-1, -1, 51));
        x7 x7Var = new x7(this, activity);
        this.u1 = x7Var;
        k7Var.setAdapter(x7Var);
        org.telegram.ui.ActionBar.q6.l(k7Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        k7Var.setOnItemClickListener(new bi.a(2));
        k7Var.setOnItemLongClickListener(new r6(this, 3));
        k7Var.setOnScrollListener(new bi.z4(this, 28));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.z1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i19 = 0;
        spannableStringBuilder.setSpan(new eq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i20 = i19;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                y7 y7Var = this.b;
                switch (i20) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
                        if (gjVar2 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar2, true, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(true);
                            org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.b, e6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().v0;
                        if (gjVar3 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar3, false, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(false);
                            org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.b, e6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.y1.addView(dVar, c8.ja.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i20 = 1;
        hi.d dVar2 = new hi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.A1 = dVar2;
        dVar2.setText(org.telegram.messenger.hd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e7
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i202 = i20;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                y7 y7Var = this.b;
                switch (i202) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
                        if (gjVar2 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar2, true, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(true);
                            org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.b, e6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().v0;
                        if (gjVar3 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar3, false, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(false);
                            org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.b, e6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.y1.addView(dVar2, c8.ja.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.hp hpVar = MediaController.B().R0;
        this.q2 = hpVar;
        boolean z10 = hpVar != null;
        this.o2 = z10;
        this.n1.n0 = z10;
        this.p2 = O0();
        this.r2 = MediaController.B().S0;
        if (O0()) {
            yVar = s5;
            this.e2 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.q0 a10 = yVar.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new kg.x1(this, 5);
        this.f2 = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        int i21 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(searchField, i21, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Jj, e6Var);
        org.telegram.ui.ActionBar.q6.l(searchField, 30, i21, e6Var);
        if (z10) {
            k7Var.r1();
            v0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var));
            this.n1.setAlpha(1.0f);
            this.m1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.M2;
            o7 o7Var2 = this.n1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(o7Var2, valueOf);
        }
        boolean z11 = this.r2.size() > 1;
        x7Var.h = z11;
        if (z11) {
            k7Var.setVisibility(0);
            k7Var.setTranslationY(0.0f);
        } else {
            k7Var.setVisibility(8);
            k7Var.setTranslationY(org.telegram.messenger.g0.q.y);
        }
        x7Var.f();
        this.n1.setTitle(org.telegram.messenger.hd.M0(2131753952, null));
        org.telegram.messenger.hp hpVar2 = this.q2;
        if (hpVar2 != null) {
            if (hpVar2.b == org.telegram.messenger.m10.i(this.a).e()) {
                this.n1.setTitle(org.telegram.messenger.hd.M0(2131746643, null));
            } else {
                this.n1.setTitle(org.telegram.messenger.hd.a0(null, null, 2131746644, org.telegram.messenger.m5.t(this.q2.b)));
            }
        } else if (gjVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.gj.B0(gjVar.k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.np.s1(this.a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.n1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.m10.i(this.a).e()) {
                if (gjVar.P1() == 2666000) {
                    this.n1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else {
                    this.n1.setTitle(org.telegram.messenger.hd.M0(2131745901, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.n1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.n1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new gi.c(this, 3));
            this.B1 = yVar2;
            yVar2.h(k7Var);
        }
        this.b.addView(this.y1, c8.ja.e(-1, ((O0() || this.t2) ? 0 : 52) + org.telegram.messenger.ns.J2, 83));
        this.b.addView(this.p1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        ((FrameLayout.LayoutParams) this.y1.getLayoutParams()).height = org.telegram.messenger.g0.L(((O0() || this.t2) ? 0 : 52) + org.telegram.messenger.ns.J2);
        ((FrameLayout.LayoutParams) this.p1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.ns.J2 + ((O0() || this.t2) ? 0 : 52));
        this.b.addView(this.o1, c8.ja.c(3.0f, -1));
        this.b.addView(this.n1);
        f7 f7Var3 = new f7(this, activity, 1);
        this.c2 = f7Var3;
        f7Var3.setAlpha(0.0f);
        f7Var3.setVisibility(4);
        this.c.addView(f7Var3);
        i9 i9Var = new i9(activity);
        this.d2 = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        i9Var.setScaleX(0.9f);
        i9Var.setScaleY(0.9f);
        f7Var3.addView(i9Var, c8.ja.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.r1 && x7Var.b() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        Z0();
    }

    public static void I0(y7 y7Var) {
        View view = y7Var.o1;
        o7 o7Var = y7Var.n1;
        k7 k7Var = y7Var.s1;
        if (k7Var.getChildCount() <= 0) {
            int paddingTop = k7Var.getPaddingTop();
            y7Var.u2 = paddingTop;
            k7Var.setTopGlowOffset(paddingTop);
            y7Var.b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = k7Var.getChildAt(0);
        cj0 cj0Var = (cj0) k7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        boolean z11 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z11 && o7Var.getTag() == null) || (!z11 && o7Var.getTag() != null)) {
            o7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = y7Var.w2;
            if (animatorSet != null) {
                animatorSet.cancel();
                y7Var.w2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            y7Var.w2 = animatorSet2;
            int i7 = 2;
            if (y7Var.o2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o7Var, y7Var.M2, z11 ? 1.0f : 0.0f);
                View view2 = y7Var.m1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(o7Var, (Property<o7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            y7Var.w2.setDuration(320L);
            y7Var.w2.setInterpolator(er.h);
            y7Var.w2.addListener(new m7(y7Var, i7));
            y7Var.w2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k7Var.getLayoutParams();
        int D = org.telegram.messenger.i20.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.m, top);
        if (y7Var.u2 != D) {
            y7Var.u2 = D;
            k7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.m);
            y7Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        float min = y7Var.t0 + ((int) (k7Var.getTranslationY() + ((y7Var.u2 - y7Var.t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - y7Var.t0) / (org.telegram.messenger.g0.L(4.0f) + L2)) : 1.0f;
        y7Var.H2 = min;
        if (min <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, y7Var.J0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != y7Var.G2) {
            y7Var.G2 = z10;
            org.telegram.messenger.g0.q3(y7Var, z10);
        }
    }

    public static boolean L0(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static org.telegram.messenger.gc N0(org.telegram.messenger.gj gjVar) {
        TLRPC.Document F0 = gjVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w10 instanceof TLRPC.TL_photoSize) && !(w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            w10 = null;
        }
        if (w10 != null) {
            return org.telegram.messenger.gc.c(w10, F0);
        }
        String u02 = gjVar.u0(true);
        if (u02 != null) {
            return org.telegram.messenger.gc.g(u02);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Lj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ze));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final m60 J0(m60 m60Var, org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.gp H1 = org.telegram.messenger.np.s1(this.a).H1();
        TLRPC.Document F0 = gjVar.F0();
        long j3 = F0 != null ? F0.id : 0L;
        m60 J = m60Var.J();
        J.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(m60Var, 27), false);
        J.k();
        J.l(R.drawable.left_status_profile, org.telegram.messenger.hd.M0(2131753913, null), new x6(this, gjVar, m60Var, 6), !H1.b.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, org.telegram.messenger.hd.M0(2131753910, null), new x6(this, gjVar, m60Var, 7), false);
        J.c(R.drawable.menu_download_round, org.telegram.messenger.hd.M0(2131753914, null), new x6(this, gjVar, m60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        int w02 = org.telegram.ui.ActionBar.j6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nj, this.J0);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0);
        if (!this.P2 || w02 != this.Q2) {
            this.Q2 = w02;
            q0Var.setIconColor(w02);
        }
        boolean z10 = this.P2;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H1;
        if (!z10 || w03 != this.R2) {
            this.R2 = w03;
            q0Var2.setIconColor(w03);
        }
        if (!this.P2 || w04 != this.S2) {
            this.S2 = w04;
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.j6.H1(q0Var2.getBackground(), w04, true);
        }
        this.P2 = true;
        this.M1.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        d1();
        int i7 = org.telegram.ui.ActionBar.j6.G8;
        q0Var.I(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        q0Var2.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), false);
        q0Var2.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), true);
        q0Var2.I(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
    }

    public final void M0(org.telegram.messenger.gj gjVar) {
        ArrayList j3;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.m10.t0;
        int i10 = this.a;
        LaunchActivity launchActivity = this.A2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle j10 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
        j10.putBoolean("canSelectTopics", true);
        org.telegram.ui.yw ywVar = new org.telegram.ui.yw(j10);
        if (gjVar.e1() >= 0) {
            j3 = org.telegram.messenger.k5.j(gjVar);
            tL_document = null;
        } else {
            if (!(gjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) gjVar.F0();
            j3 = null;
        }
        ywVar.E2 = new a1.d(this, j3, tL_document, gjVar, 9);
        launchActivity.t0(ywVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.hp hpVar = this.q2;
        return hpVar != null && hpVar.b == org.telegram.messenger.m10.i(this.a).e();
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar == null || (launchActivity = this.A2) == null) {
            return;
        }
        if (i7 == 1) {
            M0(gjVar);
            return;
        }
        if (i7 == 2) {
            V0(gjVar);
            return;
        }
        if (i7 != 4) {
            if (i7 == 5) {
                Q0(gjVar);
                return;
            }
            if (i7 == 6) {
                wf.b.I().P(MediaController.B().z());
                this.K1.performClick();
                return;
            } else {
                if (i7 == 7) {
                    R0(gjVar, false, new u6(this, gjVar, 0), false);
                    return;
                }
                if (i7 == 8) {
                    hi.v6 v6Var = new hi.v6(getContext(), true, null, new w6(this, 0), null);
                    v6Var.d2 = true;
                    v6Var.V1 = false;
                    v6Var.l2.O(true);
                    v6Var.show();
                    return;
                }
                return;
            }
        }
        int i10 = org.telegram.messenger.m10.t0;
        int i11 = this.a;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        org.telegram.messenger.ns.f(this.a).k(org.telegram.messenger.ns.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
        dismiss();
    }

    public final void Q0(org.telegram.messenger.gj gjVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
            LaunchActivity launchActivity = this.A2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(gjVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = gjVar.S0();
        }
        String str = B;
        String str2 = gjVar.k.attachPath;
        if (str2 != null && str2.length() > 0 && !a8.p0.B(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            org.telegram.messenger.w7.G(this.a);
            str2 = org.telegram.messenger.w7.M(gjVar.k, false, true).toString();
        }
        MediaController.d0(str2, this.A2, 3, str, gjVar.F0() != null ? gjVar.F0().mime_type : "", new w6(this, 1));
    }

    public final void R0(org.telegram.messenger.gj gjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = gjVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new z6(this, z11, gjVar, z10, runnable, j3, F0));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final int S() {
        f7 f7Var = this.y1;
        if (f7Var == null) {
            return 0;
        }
        if (this.r2.size() <= 1) {
            return f7Var.getMeasuredHeight() + this.t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.s1.getTranslationY() + ((this.u2 - this.t0) - L));
        if (this.t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0(boolean z10) {
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar != null) {
            if (z10) {
                k7 k7Var = this.s1;
                int childCount = k7Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = k7Var.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != gjVar) {
                        i7++;
                    }
                }
            }
            int indexOf = this.r2.indexOf(gjVar);
            if (this.p2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = org.telegram.messenger.gz.O0;
                v4.b0 b0Var = this.t1;
                if (z11) {
                    b0Var.n0(indexOf);
                    return true;
                }
                b0Var.n0(this.r2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z10) {
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.j6.Oj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        }
    }

    public final void U0(final boolean z10) {
        boolean O0 = O0();
        hi.d dVar = this.A1;
        hi.d dVar2 = this.z1;
        if (O0 || this.t2) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        er erVar = er.h;
        final int i7 = 0;
        duration.setInterpolator(erVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.z1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.A1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i10 = 1;
        dVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(erVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ y7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.z1.setVisibility(z10 ? 8 : 0);
                        break;
                    default:
                        this.b.A1.setVisibility(z10 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 0);
        int i7 = org.telegram.ui.ActionBar.j6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.Jj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mj));
        int i11 = org.telegram.ui.ActionBar.j6.w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.x7));
        int i12 = org.telegram.ui.ActionBar.j6.Nj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.V1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.Oj));
        int i13 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        int i14 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.H1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        h7 h7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a2, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        i7 i7Var = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.F1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.x1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
        q7 q7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        q7 q7Var2 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(org.telegram.messenger.gj gjVar) {
        File file;
        try {
            if (!TextUtils.isEmpty(gjVar.k.attachPath)) {
                file = new File(gjVar.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7.G(this.a);
                file = org.telegram.messenger.w7.M(gjVar.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.A2);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131747218, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(gjVar.t1());
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
            this.A2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131745459, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void W0(boolean z10, boolean z11) {
        i9 i9Var = this.d2;
        f7 f7Var = this.c2;
        if (z10) {
            if (f7Var.getVisibility() == 0 || this.g2) {
                return;
            }
            f7Var.setTag(1);
            p7 p7Var = this.C1;
            i9Var.setImageBitmap(p7Var.a[p7Var.b].getImageReceiver().n());
            this.g2 = true;
            ok0.d(new s6(this, 1));
            f7Var.setVisibility(0);
            f7Var.animate().alpha(1.0f).setDuration(180L).setListener(new m7(this, 0)).start();
            i9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (f7Var.getVisibility() != 0) {
            return;
        }
        f7Var.setTag(null);
        if (z11) {
            this.g2 = true;
            f7Var.animate().alpha(0.0f).setDuration(180L).setListener(new m7(this, 1)).start();
            i9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            f7Var.setAlpha(0.0f);
            f7Var.setVisibility(4);
            i9Var.setImageBitmap(null);
            i9Var.setScaleX(0.9f);
            i9Var.setScaleY(0.9f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.gj gjVar) {
        int i7 = 1;
        m60 G = m60.G(this.c, this.J0, wVar, true);
        Object[] objArr = 0;
        if (O0()) {
            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750587, null), new x6(this, G, gjVar, (int) (objArr == true ? 1 : 0)), !this.t2);
            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745459, null), new x6(this, G, gjVar, i7), !this.t2);
            G.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new x6(this, gjVar, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0(G, gjVar), 7), !this.t2);
            if (!this.t2 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750587, null), new x6(this, G, gjVar, r1), !this.t2);
            G.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745459, null), new x6(this, G, gjVar, 4), !this.t2);
            G.l(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131745342, null), new u6(this, gjVar, i7), gjVar.e1() > 0);
        }
        G.V(org.telegram.messenger.hd.a0 ? 3 : 5);
        G.Z();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean Y(float f10, float f11) {
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

    public final void Y0() {
        if (this.B2 == 1) {
            this.E2 = System.currentTimeMillis();
            this.C2 = MediaController.B().v0.b0;
            j6.o oVar = this.I2;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.h3(oVar);
        }
    }

    public final void Z0() {
        LinearLayout linearLayout = this.v1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.y1.getVisibility() == 0 ? org.telegram.messenger.g0.L(150.0f) : -org.telegram.messenger.g0.L(30.0f))) / 2);
    }

    public final void a1(boolean z10) {
        if (this.P1 == null) {
            return;
        }
        float f10 = MediaController.B().r0;
        this.Q1.b(z10, f10);
        this.R1.e(z10, f10);
        updateColors();
        boolean z11 = this.S1;
        int i7 = 0;
        this.S1 = false;
        while (true) {
            org.telegram.ui.ActionBar.z0[] z0VarArr = this.T1;
            if (i7 >= z0VarArr.length) {
                return;
            }
            if (z11 || !L0(f10, U2[i7])) {
                org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.j6.E8;
                z0Var.d(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
            } else {
                org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.j6.Hi;
                z0Var2.d(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
            }
            i7++;
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
    public final void b1(org.telegram.messenger.gj gjVar, boolean z10) {
        boolean z11;
        float f10;
        int i7;
        r7 r7Var = this.N1;
        if (r7Var != null) {
            if (r7Var.x) {
                i7 = (int) (gjVar.L0() * r7Var.getProgress());
            } else {
                if (this.C2 >= 0.0f) {
                    int i10 = this.B2;
                    z11 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z11) {
                        r7Var.e(z10, gjVar.b0);
                    } else {
                        r7Var.e(z10, this.C2);
                    }
                    f10 = 1.0f;
                    if (!this.k2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.j2) >= 500) {
                            if (MediaController.B().m0) {
                                f10 = org.telegram.messenger.w7.G(this.a).t(this.v2, gjVar.b0);
                            }
                            this.j2 = elapsedRealtime;
                        } else {
                            f10 = -1.0f;
                        }
                    }
                    if (f10 != -1.0f) {
                        r1.g gVar = this.i2;
                        gVar.m.i = f10 * 1000.0f;
                        gVar.h();
                    }
                    if (z11) {
                        i7 = gjVar.i0;
                    } else {
                        i7 = (int) (gjVar.L0() * r7Var.getProgress());
                        gjVar.i0 = i7;
                    }
                }
                z11 = false;
                if (z11) {
                }
                f10 = 1.0f;
                if (!this.k2) {
                }
                if (f10 != -1.0f) {
                }
                if (z11) {
                }
            }
            if (this.x2 != i7) {
                this.x2 = i7;
                this.O1.l(org.telegram.messenger.g0.g0(i7, false, false), false);
            }
            r7Var.g(gjVar);
        }
    }

    public final void c1() {
        int i7 = org.telegram.messenger.gz.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                q0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.j6.Oj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.gz.N0) {
            if (i7 == 0) {
                q0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                q0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!org.telegram.messenger.gz.O0) {
            q0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i7 == 0) {
            q0Var.setIcon(R.drawable.player_new_order);
        } else {
            q0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i7 == 0 && !org.telegram.messenger.gz.N0 && !org.telegram.messenger.gz.O0) {
            int i11 = org.telegram.ui.ActionBar.j6.Nj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.Oj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.j6.w0(i12, this.J0), true);
        if (i7 != 0) {
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754787, null));
        } else if (org.telegram.messenger.gz.N0) {
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131745322, null));
        } else {
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131746027, null));
        }
    }

    public final void d1() {
        T0(this.Y1, org.telegram.messenger.gz.N0);
        T0(this.Z1, org.telegram.messenger.gz.O0);
        T0(this.X1, org.telegram.messenger.gz.S0 == 1);
        T0(this.W1, org.telegram.messenger.gz.S0 == 2);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.gj messageObject2;
        org.telegram.messenger.gj gjVar;
        int i11 = org.telegram.messenger.ns.h2;
        int i12 = org.telegram.messenger.ns.f2;
        int i13 = org.telegram.messenger.ns.g2;
        k7 k7Var = this.s1;
        if (i7 == i11 || i7 == i13 || i7 == i12) {
            f1(i7 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i7 == i12 || i7 == i13) {
                int childCount = k7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = k7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject.k) || messageObject.I3())) {
                        wVar.b(false, true);
                    }
                }
                if (i7 == i13 && MediaController.B().v0 != null) {
                    if (MediaController.B().H()) {
                        Y0();
                    } else if (this.B2 == 1 && this.C2 != -1.0f) {
                        j6.o oVar = this.I2;
                        org.telegram.messenger.g0.r(oVar);
                        this.F2 = 0L;
                        oVar.run();
                        this.C2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.gj) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = k7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = k7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject2.k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.wq wqVar = this.I1;
            if (wqVar != null) {
                wqVar.a(d1.f.u());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.e2) {
            org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
            if (gjVar2 == null || !gjVar2.I3()) {
                return;
            }
            b1(gjVar2, false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.J4) {
            a1(true);
            return;
        }
        int i16 = org.telegram.messenger.ns.K0;
        x7 x7Var = this.u1;
        if (i7 == i16) {
            this.q2 = MediaController.B().R0;
            this.r2 = MediaController.B().S0;
            x7Var.f();
            return;
        }
        if (i7 == org.telegram.messenger.ns.L0) {
            this.q2 = MediaController.B().R0;
            this.r2 = MediaController.B().S0;
            x7Var.f();
            if (org.telegram.messenger.gz.O0) {
                k7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                v4.b0 b0Var = this.t1;
                b0Var.L0();
                int N0 = b0Var.N0();
                if (N0 != -1) {
                    View m10 = b0Var.m(N0);
                    b0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.Y1) {
            if (((String) objArr[0]).equals(this.v2)) {
                f1(false);
                this.k2 = true;
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.X1) {
            if (i7 == org.telegram.messenger.ns.U3) {
                f1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.v2) || (gjVar = MediaController.B().v0) == null) {
            return;
        }
        if (!this.k2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.j2) >= 500) {
                r13 = MediaController.B().m0 ? org.telegram.messenger.w7.G(this.a).t(this.v2, gjVar.b0) : 1.0f;
                this.j2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            r1.g gVar = this.i2;
            gVar.m.i = r13 * 1000.0f;
            gVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.f2);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.g2);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.h2);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.e2);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.X1);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.K0);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.L0);
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.U3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.J4);
        org.telegram.messenger.z5.q(this.a).v(this);
        if (T2 == this) {
            T2 = null;
        }
    }

    public final void e1() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(this.o2 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.h5, this.J0);
        if (w02 != this.O2) {
            this.O2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nj, this.J0);
        h7 h7Var = this.E1;
        if (h7Var != null) {
            h7Var.h(w03, "Triangle 3");
            h7Var.h(w03, "Triangle 4");
            h7Var.h(w03, "Rectangle 4");
        }
        i7 i7Var = this.F1;
        if (i7Var != null) {
            i7Var.h(w03, "Triangle 3");
            i7Var.h(w03, "Triangle 4");
            i7Var.h(w03, "Rectangle 4");
        }
        r7 r7Var = this.N1;
        if (r7Var != null) {
            r7Var.setOuterColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            float f10 = MediaController.B().r0;
            int w04 = org.telegram.ui.ActionBar.j6.w0(!L0(f10, 1.0f) ? org.telegram.ui.ActionBar.j6.Hi : org.telegram.ui.ActionBar.j6.x7, this.J0);
            eu0 eu0Var = this.Q1;
            if (eu0Var != null) {
                eu0Var.a.u(w04);
                Paint paint = eu0Var.b;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), w04 & 436207615, true);
            int i7 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.T1;
                if (i7 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i7] != null) {
                    int w05 = org.telegram.ui.ActionBar.j6.w0(L0(f10, U2[i7]) ? org.telegram.ui.ActionBar.j6.Hi : org.telegram.ui.ActionBar.j6.E8, this.J0);
                    z0VarArr[i7].d(w05, w05);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.J1;
        if (z0Var != null) {
            j7 j7Var = this.K1;
            if (j7Var != null && j7Var.b()) {
                z10 = true;
            }
            int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0);
            int w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            z0Var.e(w06, w07, org.telegram.ui.ActionBar.j6.w0(i10, this.J0), z10);
            this.J1.setSelectorColor((j7Var == null || !j7Var.b()) ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0) : org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, this.J0)));
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
        int i7;
        i9 i9Var;
        ImageView imageView;
        int i10;
        int i11;
        String str;
        boolean z14;
        Bitmap bitmap;
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if ((gjVar == null && z10) || (gjVar != null && !gjVar.I3())) {
            dismiss();
            return;
        }
        if (gjVar == null) {
            this.s2 = null;
            return;
        }
        boolean z15 = gjVar == this.s2;
        this.s2 = gjVar;
        long j3 = gjVar.T;
        org.telegram.ui.ActionBar.q0 q0Var = this.H1;
        if (j3 != 0 || gjVar.e1() <= -2000000000) {
            q0Var.setVisibility(4);
        } else {
            q0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        long j10 = gjVar.F0() != null ? gjVar.F0().id : 0L;
        boolean z16 = (B0 < 0 && org.telegram.messenger.np.s1(this.a).A2(B0)) || org.telegram.messenger.np.s1(this.a).A2(org.telegram.messenger.gj.B0(gjVar.k)) || gjVar.k.noforwards;
        if (z16 != this.t2) {
            this.t2 = z16;
            f7 f7Var = this.y1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(((z16 || O0()) ? 0 : 52) + org.telegram.messenger.ns.J2);
            f7Var.setLayoutParams(layoutParams);
            View view = this.p1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.ns.J2 + ((O0() || z16) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z16) {
            q0Var.u(1);
            q0Var.u(2);
            q0Var.u(5);
            q0Var.u(6);
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(16.0f));
        } else {
            q0Var.T(1);
            q0Var.T(2);
            q0Var.T(5);
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        }
        String str2 = gjVar.k.attachPath;
        if (str2 != null && str2.length() > 0) {
            file = new File(gjVar.k.attachPath);
        }
        file = null;
        if (file == null) {
            org.telegram.messenger.w7.G(this.a);
            file = org.telegram.messenger.w7.M(gjVar.k, false, true);
        }
        boolean z17 = org.telegram.messenger.gz.B0 && ((int) org.telegram.messenger.gj.B0(gjVar.k)) != 0 && gjVar.I3();
        boolean exists = file.exists();
        ImageView imageView2 = this.a2;
        r7 r7Var = this.N1;
        k70 k70Var = this.M1;
        if (exists || z17) {
            org.telegram.messenger.z5.q(this.a).v(this);
            k70Var.setVisibility(4);
            r7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = gjVar.S0();
            org.telegram.messenger.z5.q(this.a).a(S0, null, this);
            Float w10 = org.telegram.messenger.fc.D().w(S0);
            k70Var.a(false, w10 != null ? w10.floatValue() : 0.0f);
            k70Var.setVisibility(0);
            r7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        b1(gjVar, !z15);
        p7 p7Var = this.C1;
        i9 i9Var2 = z15 ? p7Var.a[p7Var.b] : p7Var.a[p7Var.b == 0 ? (char) 1 : (char) 0];
        rf.a aVar = MediaController.B().E0;
        if (z15) {
            z11 = true;
            z12 = false;
            z13 = z15;
            i7 = 3;
        } else {
            AnimatorSet animatorSet = p7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            p7Var.c = new AnimatorSet();
            int i12 = p7Var.b == 0 ? 1 : 0;
            p7Var.b = i12;
            z11 = true;
            i9[] i9VarArr = p7Var.a;
            i9 i9Var3 = i9VarArr[i12 ^ 1];
            i9 i9Var4 = i9VarArr[i12];
            boolean I = i9Var3.getImageReceiver().I();
            i9Var4.setAlpha(I ? 1.0f : 0.0f);
            i9Var4.setScaleX(0.8f);
            i9Var4.setScaleY(0.8f);
            i9Var4.setVisibility(0);
            if (I) {
                i9Var3.bringToFront();
            } else {
                i9Var3.setVisibility(8);
                i9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z12 = false;
            z13 = z15;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(er.g);
            ofFloat.addUpdateListener(new ch.u(5, i9Var4, I));
            if (I) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(er.i);
                ofFloat2.addUpdateListener(new ch.v(11, i9Var3, i9Var4));
                i7 = 3;
                ofFloat2.addListener(new x5(i9Var3, i7));
                p7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                i7 = 3;
                p7Var.c.play(ofFloat);
            }
            p7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.v2 = org.telegram.messenger.w7.r(null, gjVar.F0());
            boolean z18 = z12;
            this.k2 = z18;
            String u02 = gjVar.u0(z18);
            int i13 = i7;
            org.telegram.messenger.gc N0 = N0(gjVar);
            if (TextUtils.isEmpty(u02)) {
                i9Var = i9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                if (N0 != null) {
                    i9Var.g(1, 0L, gjVar, null, null, null, null, N0);
                } else {
                    str = null;
                    i9Var.setImageDrawable(null);
                    i9Var.invalidate();
                }
            } else {
                org.telegram.messenger.gc g10 = org.telegram.messenger.gc.g(u02);
                i9Var = i9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                i9Var.g(1, 0L, gjVar, null, null, null, g10, N0);
            }
            str = null;
            i9Var.invalidate();
        } else {
            i9Var2.setImageBitmap(bitmap);
            this.v2 = null;
            this.k2 = z11;
            str = null;
            imageView = imageView2;
            i10 = i7;
            i11 = 8;
        }
        boolean H = MediaController.B().H();
        ke0 ke0Var = this.b2;
        if (H) {
            z14 = true;
            ke0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754929, str));
        } else {
            z14 = true;
            ke0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754930, str));
        }
        String y12 = gjVar.y1(z14);
        String w12 = gjVar.w1(z14);
        this.D1.setText(y12);
        this.G1.setText(w12);
        org.telegram.messenger.gp H1 = org.telegram.messenger.np.s1(this.a).H1();
        this.z1.setLoading(H1.c);
        U0(H1.b.contains(Long.valueOf(j10)));
        int L0 = (int) gjVar.L0();
        this.y2 = L0;
        TextView textView = this.U1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.g0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.P1;
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
        arrayList2.add((org.telegram.messenger.gj) arrayList.get(i15));
        if (i15 != i16) {
            arrayList2.add((org.telegram.messenger.gj) arrayList.get(i16));
        }
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i17);
            org.telegram.messenger.gc N02 = N0(gjVar2);
            if (N02 != null) {
                if (N02.g != null) {
                    org.telegram.messenger.fc D = org.telegram.messenger.fc.D();
                    D.s.c(new org.telegram.messenger.hb(D, N02.g, i10));
                } else {
                    org.telegram.messenger.w7.G(this.a).V(N02, gjVar2, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.z2;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.M1.a(true, Math.min(1.0f, j3 / j10));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        f7 f7Var = this.c2;
        if (view != f7Var) {
            return false;
        }
        f7Var.layout(0, 0, f7Var.getMeasuredWidth(), f7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean l0(View view, int i7, int i10) {
        f7 f7Var = this.c2;
        if (view != f7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        f7Var.measure(View.MeasureSpec.makeMeasureSpec(k2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(k2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        o7 o7Var = this.n1;
        if (o7Var != null && o7Var.o0) {
            o7Var.n(true);
        } else if (this.c2.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            if (this.f2 != null && this.V1 != null && this.H1 != null && this.M1 != null) {
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
            float f10 = this.H2;
            if (f10 >= 0.0f) {
                boolean z10 = f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) > 0.699999988079071d;
                if (z10 != this.G2) {
                    this.G2 = z10;
                    org.telegram.messenger.g0.q3(this, z10);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        T2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(!L0(MediaController.B().r0, 1.0f) ? org.telegram.ui.ActionBar.j6.Hi : org.telegram.ui.ActionBar.j6.x7, this.J0);
            eu0 eu0Var = this.Q1;
            if (eu0Var != null) {
                eu0Var.a.u(w02);
                Paint paint = eu0Var.b;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(w02 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.J1;
        if (z0Var != null) {
            j7 j7Var = this.K1;
            boolean z10 = j7Var != null && j7Var.b();
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0);
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0);
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            z0Var.e(w03, w04, org.telegram.ui.ActionBar.j6.w0(i7, this.J0), z10);
            this.J1.setSelectorColor((j7Var == null || !j7Var.b()) ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.J0) : org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)));
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void N(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
