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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, org.telegram.messenger.x5 {
    public static a8 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final v4.y A1;
    public int A2;
    public final r7 B1;
    public float B2;
    public final s7 C1;
    public int C2;
    public final j7 D1;
    public long D2;
    public final k7 E1;
    public long E2;
    public final s7 F1;
    public boolean F2;
    public final org.telegram.ui.ActionBar.r0 G1;
    public float G2;
    public final org.telegram.ui.xq H1;
    public final m.f3 H2;
    public org.telegram.ui.ActionBar.z0 I1;
    public n7 I2;
    public final l7 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final h70 L1;
    public final org.telegram.ui.Cells.f2 L2;
    public final t7 M1;
    public ValueAnimator M2;
    public final org.telegram.ui.ActionBar.m5 N1;
    public int N2;
    public final org.telegram.ui.ActionBar.r0 O1;
    public boolean O2;
    public final eu0 P1;
    public int P2;
    public final org.telegram.ui.ActionBar.v0 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final org.telegram.ui.ActionBar.z0[] S1;
    public final TextView T1;
    public final org.telegram.ui.ActionBar.r0 U1;
    public final org.telegram.ui.ActionBar.z0 V1;
    public final org.telegram.ui.ActionBar.z0 W1;
    public final org.telegram.ui.ActionBar.z0 X1;
    public final org.telegram.ui.ActionBar.z0 Y1;
    public final ImageView Z1;
    public final he0 a2;
    public final h7 b2;
    public final k9 c2;
    public final org.telegram.ui.ActionBar.r0 d2;
    public final org.telegram.ui.ActionBar.r0 e2;
    public boolean f2;
    public final View[] g2;
    public final r1.g h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final q7 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public org.telegram.messenger.kp p2;
    public boolean q1;
    public ArrayList q2;
    public final m7 r1;
    public org.telegram.messenger.ij r2;
    public final v4.b0 s1;
    public boolean s2;
    public final z7 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final h7 x1;
    public int x2;
    public final fi.d y1;
    public final int y2;
    public final fi.d z1;
    public final LaunchActivity z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(Activity activity, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, (Context) activity, h6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.User a22;
        int i7 = 1;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.S1 = z0VarArr;
        View[] viewArr = new View[5];
        this.g2 = viewArr;
        this.k2 = true;
        this.l2 = -1;
        this.t2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        int i10 = 25;
        this.H2 = new m.f3(this, i10);
        this.L2 = new org.telegram.ui.Cells.f2(this);
        this.r = true;
        N();
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            this.a = ijVar.I1;
        } else {
            this.a = org.telegram.messenger.p10.s0;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = org.telegram.messenger.z5.q(this.a).k();
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.J4);
        p7 p7Var = new p7(this, activity);
        this.b = p7Var;
        final int i11 = 0;
        p7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        q7 q7Var = new q7(this, activity, h6Var, i11);
        this.m1 = q7Var;
        q7Var.setBackgroundColor(0);
        q7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i13, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.Bj, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i13, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 6, org.telegram.ui.ActionBar.m6.Dj, h6Var);
        q7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = q7Var.s();
        s5.setLayoutParams(c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        View view = new View(activity);
        this.l1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, view, h6Var);
        q7Var.addView(view, 0, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        view.setAlpha(0.0f);
        q7Var.setAlpha(0.0f);
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 10));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.o1 = view3;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view3, h6Var);
        h7 h7Var = new h7(this, activity, 2);
        this.x1 = h7Var;
        r7 r7Var = new r7(this, activity);
        this.B1 = r7Var;
        h7Var.addView(r7Var, c8.ha.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(this, activity, activity, i11);
        this.C1 = s7Var;
        h7Var.addView(s7Var, c8.ha.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var2 = new s7(this, activity, activity, i7);
        this.F1 = s7Var2;
        h7Var.addView(s7Var2, c8.ha.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, h6Var);
        this.M1 = t7Var;
        t7Var.setLineWidth(4);
        t7Var.setDelegate(new gf.g(this, 28));
        t7Var.setReportChanges(true);
        h7Var.addView(t7Var, c8.ha.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        gVar.b(new d7(this, i11));
        this.h2 = gVar;
        h70 h70Var = new h70(activity);
        this.L1 = h70Var;
        h70Var.setVisibility(4);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Hj, h70Var, h6Var);
        h70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        h7Var.addView(h70Var, c8.ha.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.N1 = m5Var;
        m5Var.setTextSize(12);
        m5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.X(m5Var, i14, h6Var);
        m5Var.setImportantForAccessibility(2);
        h7Var.addView(m5Var, c8.ha.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i14, h6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        h7Var.addView(textView, c8.ha.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(activity, null, 0, org.telegram.ui.ActionBar.m6.w0(i14, this.I0), false, h6Var);
        this.O1 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setShowSubmenuByMove(false);
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754805, null));
        r0Var.setDelegate(new s6(this, i11));
        eu0 eu0Var = new eu0();
        this.P1 = eu0Var;
        r0Var.setIcon(eu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), h6Var);
        this.Q1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new t6(this, i11));
        z0VarArr[0] = r0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.id.M0(2131745266, null));
        z0VarArr[1] = r0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.id.M0(2131745267, null));
        z0VarArr[2] = r0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.id.M0(2131745268, null));
        z0VarArr[3] = r0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.id.M0(2131745270, null));
        z0VarArr[4] = r0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.id.M0(2131745264, null));
        z0VarArr[5] = r0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.id.M0(2131745265, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            r0Var.setPadding(0, 1, 0, 0);
        }
        r0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        r0Var.setShowedFromBottom(true);
        h7Var.addView(r0Var, c8.ha.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(i10, this, fArr));
        r0Var.setOnLongClickListener(new di.f2(2, this, h6Var));
        a1(false);
        h7 h7Var2 = new h7(this, activity, i11);
        h7Var.addView(h7Var2, c8.ha.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(activity, null, 0, 0, false, h6Var);
        this.U1 = r0Var2;
        viewArr[0] = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setShowSubmenuByMove(false);
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i15 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(r0Var2, h02, null, M, h6Var);
        h7Var2.addView(r0Var2, c8.ha.e(48, 48, 51));
        r0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u6
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i11;
                a8 a8Var = this.b;
                switch (i16) {
                    case 0:
                        a8Var.d1();
                        a8Var.U1.U(null, null);
                        break;
                    default:
                        l7 l7Var = a8Var.J1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null) {
                            char c10 = 1;
                            k60 G = k60.G(a8Var.c, a8Var.I0, view4, true);
                            k60 J0 = a8Var.J0(G, ijVar2);
                            if (!a8Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0, 7), !a8Var.s2);
                                if (!a8Var.s2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.id.M0(2131750587, null), new z6(a8Var, G, 0), !a8Var.s2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.id.M0(2131745459, null), new z6(a8Var, G, c10 == true ? 1 : 0), !a8Var.s2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.id.M0(2131745342, null), new z6(a8Var, G, 2), ijVar2.e1() > 0);
                            if (a8Var.K1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                a8Var.I1 = z0Var;
                                z0Var.j(org.telegram.messenger.id.M0(2131743589, null), R.drawable.menu_video_chromecast, null);
                                a8Var.I1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, a8Var, G));
                                org.telegram.messenger.g0.E2(l7Var);
                                a8Var.I1.addView(l7Var, 0, c8.ha.c(-1.0f, -1));
                                a8Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new z6(a8Var, G, 3), org.telegram.messenger.id.M0(2131746645, null), a8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.V1 = r0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.id.M0(2131746273, null));
        this.W1 = r0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.id.M0(2131746276, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.X1 = r0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.id.M0(2131745322, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = r0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.id.M0(2131746027, null));
        r0Var2.setShowedFromBottom(true);
        r0Var2.setDelegate(new s6(this, i7));
        int i16 = org.telegram.ui.ActionBar.m6.Kj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i16, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        j7 j7Var = new j7(this, activity, scaledTouchSlop);
        this.D1 = j7Var;
        viewArr[1] = j7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        j7Var.setScaleType(scaleType);
        j7Var.f(R.raw.player_prev, 20, 20, null);
        j7Var.h(w02, "Triangle 3");
        j7Var.h(w02, "Triangle 4");
        j7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
        j7Var.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(j7Var, h03, null, M2, h6Var);
        h7Var2.addView(j7Var, c8.ha.e(48, 48, 51));
        j7Var.setContentDescription(org.telegram.messenger.id.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        he0 he0Var = new he0(28);
        this.a2 = he0Var;
        imageView.setImageDrawable(he0Var);
        he0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.t6.s(imageView, i16, h6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView, h04, null, M3, h6Var);
        h7Var2.addView(imageView, c8.ha.e(48, 48, 51));
        imageView.setOnClickListener(new bi.l1(9));
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.E1 = k7Var;
        viewArr[3] = k7Var;
        k7Var.setScaleType(scaleType);
        k7Var.f(R.raw.player_prev, 20, 20, null);
        k7Var.h(w02, "Triangle 3");
        k7Var.h(w02, "Triangle 4");
        k7Var.h(w02, "Rectangle 4");
        k7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i15);
        k7Var.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(k7Var, h05, null, M4, h6Var);
        h7Var2.addView(k7Var, c8.ha.e(48, 48, 51));
        k7Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(activity, null, 0, w02, false, h6Var);
        this.G1 = r0Var3;
        viewArr[4] = r0Var3;
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(R.drawable.ic_ab_other, activity, h6Var);
        this.H1 = xqVar;
        r0Var3.setIcon(xqVar);
        r0Var3.setLongClickEnabled(false);
        r0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        final int i17 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i15);
        r0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(r0Var3, h06, null, M5, h6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u6
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i162 = i17;
                a8 a8Var = this.b;
                switch (i162) {
                    case 0:
                        a8Var.d1();
                        a8Var.U1.U(null, null);
                        break;
                    default:
                        l7 l7Var = a8Var.J1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null) {
                            char c10 = 1;
                            k60 G = k60.G(a8Var.c, a8Var.I0, view4, true);
                            k60 J0 = a8Var.J0(G, ijVar2);
                            if (!a8Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0, 7), !a8Var.s2);
                                if (!a8Var.s2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.id.M0(2131750587, null), new z6(a8Var, G, 0), !a8Var.s2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.id.M0(2131745459, null), new z6(a8Var, G, c10 == true ? 1 : 0), !a8Var.s2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.id.M0(2131745342, null), new z6(a8Var, G, 2), ijVar2.e1() > 0);
                            if (a8Var.K1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                a8Var.I1 = z0Var;
                                z0Var.j(org.telegram.messenger.id.M0(2131743589, null), R.drawable.menu_video_chromecast, null);
                                a8Var.I1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, a8Var, G));
                                org.telegram.messenger.g0.E2(l7Var);
                                a8Var.I1.addView(l7Var, 0, c8.ha.c(-1.0f, -1));
                                a8Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new z6(a8Var, G, 3), org.telegram.messenger.id.M0(2131746645, null), a8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        h7Var2.addView(r0Var3, c8.ha.e(48, 48, 51));
        l7 l7Var = new l7(this, activity, 0);
        this.J1 = l7Var;
        this.K1 = true;
        try {
            l7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        org.telegram.ui.xq xqVar2 = this.H1;
        if (xqVar2 != null) {
            xqVar2.a(d1.f.u());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new s6(this, 2));
        this.G1.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i18 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i19 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView2, i19, h6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131748243, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i19, h6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        m7 m7Var = new m7(this, activity);
        this.r1 = m7Var;
        m7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.s1 = b0Var;
        m7Var.setLayoutManager(b0Var);
        m7Var.setHorizontalScrollBarEnabled(false);
        m7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(m7Var, c8.ha.e(-1, -1, 51));
        z7 z7Var = new z7(this, activity);
        this.t1 = z7Var;
        m7Var.setAdapter(z7Var);
        org.telegram.ui.ActionBar.t6.l(m7Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        m7Var.setOnItemClickListener(new f7(0));
        m7Var.setOnItemLongClickListener(new s6(this, 3));
        m7Var.setOnScrollListener(new ai.b(this, 26));
        fi.d dVar = new fi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.y1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i20 = 0;
        spannableStringBuilder.setSpan(new wp(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i21 = i20;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                a8 a8Var = this.b;
                switch (i21) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null && a8Var.z2 != null) {
                            a8Var.R0(ijVar2, true, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.b, h6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().u0;
                        if (ijVar3 != null && a8Var.z2 != null) {
                            a8Var.R0(ijVar3, false, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new gc((FrameLayout) a8Var.b, h6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(dVar, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i21 = 1;
        fi.d dVar2 = new fi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.z1 = dVar2;
        dVar2.setText(org.telegram.messenger.id.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g7
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i212 = i21;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                a8 a8Var = this.b;
                switch (i212) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null && a8Var.z2 != null) {
                            a8Var.R0(ijVar2, true, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.b, h6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().u0;
                        if (ijVar3 != null && a8Var.z2 != null) {
                            a8Var.R0(ijVar3, false, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new gc((FrameLayout) a8Var.b, h6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(dVar2, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.kp kpVar = MediaController.B().Q0;
        this.p2 = kpVar;
        boolean z9 = kpVar != null;
        this.n2 = z9;
        this.m1.m0 = z9;
        this.o2 = O0();
        this.q2 = MediaController.B().R0;
        if (O0()) {
            yVar = s5;
            this.d2 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.r0 a10 = yVar.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, 5);
        this.e2 = a10;
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.id.M0(2131745836, null));
        int i22 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.U(searchField, i22, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Gj, h6Var);
        org.telegram.ui.ActionBar.t6.l(searchField, 30, i22, h6Var);
        if (z9) {
            m7Var.r1();
            v0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, h6Var));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.L2;
            q7 q7Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(q7Var2, valueOf);
        }
        boolean z10 = this.q2.size() > 1;
        z7Var.h = z10;
        if (z10) {
            m7Var.setVisibility(0);
            m7Var.setTranslationY(0.0f);
        } else {
            m7Var.setVisibility(8);
            m7Var.setTranslationY(org.telegram.messenger.g0.q.y);
        }
        z7Var.f();
        this.m1.setTitle(org.telegram.messenger.id.M0(2131753952, null));
        org.telegram.messenger.kp kpVar2 = this.p2;
        if (kpVar2 != null) {
            if (kpVar2.b == org.telegram.messenger.p10.i(this.a).e()) {
                this.m1.setTitle(org.telegram.messenger.id.M0(2131746643, null));
            } else {
                this.m1.setTitle(org.telegram.messenger.id.a0(null, null, 2131746644, org.telegram.messenger.m5.t(this.p2.b)));
            }
        } else if (ijVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.ij.B0(ijVar.k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.qp.s1(this.a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.m1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.p10.i(this.a).e()) {
                if (ijVar.P1() == 2666000) {
                    this.m1.setTitle(org.telegram.messenger.id.M0(2131754252, null));
                } else {
                    this.m1.setTitle(org.telegram.messenger.id.M0(2131745901, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.m1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.m1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new ei.d(this, 3));
            this.A1 = yVar2;
            yVar2.h(m7Var);
        }
        this.b.addView(this.x1, c8.ha.e(-1, ((O0() || this.s2) ? 0 : 52) + org.telegram.messenger.qs.J2, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        ((FrameLayout.LayoutParams) this.x1.getLayoutParams()).height = org.telegram.messenger.g0.L(((O0() || this.s2) ? 0 : 52) + org.telegram.messenger.qs.J2);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.qs.J2 + ((O0() || this.s2) ? 0 : 52));
        this.b.addView(this.n1, c8.ha.c(3.0f, -1));
        this.b.addView(this.m1);
        h7 h7Var3 = new h7(this, activity, 1);
        this.b2 = h7Var3;
        h7Var3.setAlpha(0.0f);
        h7Var3.setVisibility(4);
        this.c.addView(h7Var3);
        k9 k9Var = new k9(activity);
        this.c2 = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        k9Var.setScaleX(0.9f);
        k9Var.setScaleY(0.9f);
        h7Var3.addView(k9Var, c8.ha.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.q1 && z7Var.b() == 0) {
            i18 = 0;
        }
        linearLayout.setVisibility(i18);
        Z0();
    }

    public static void I0(a8 a8Var) {
        View view = a8Var.n1;
        q7 q7Var = a8Var.m1;
        m7 m7Var = a8Var.r1;
        if (m7Var.getChildCount() <= 0) {
            int paddingTop = m7Var.getPaddingTop();
            a8Var.t2 = paddingTop;
            m7Var.setTopGlowOffset(paddingTop);
            a8Var.b.invalidate();
            return;
        }
        boolean z9 = false;
        View childAt = m7Var.getChildAt(0);
        xi0 xi0Var = (xi0) m7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && q7Var.getTag() == null) || (!z10 && q7Var.getTag() != null)) {
            q7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = a8Var.v2;
            if (animatorSet != null) {
                animatorSet.cancel();
                a8Var.v2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            a8Var.v2 = animatorSet2;
            int i7 = 2;
            if (a8Var.n2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q7Var, a8Var.L2, z10 ? 1.0f : 0.0f);
                View view2 = a8Var.l1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(q7Var, (Property<q7, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            }
            a8Var.v2.setDuration(320L);
            a8Var.v2.setInterpolator(wq.h);
            a8Var.v2.addListener(new o7(a8Var, i7));
            a8Var.v2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.m, top);
        if (a8Var.t2 != D) {
            a8Var.t2 = D;
            m7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.m);
            a8Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        float min = a8Var.s0 + ((int) (m7Var.getTranslationY() + ((a8Var.t2 - a8Var.s0) - L2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) - a8Var.s0) / (org.telegram.messenger.g0.L(4.0f) + L2)) : 1.0f;
        a8Var.G2 = min;
        if (min <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, a8Var.I0)) > 0.699999988079071d) {
            z9 = true;
        }
        if (z9 != a8Var.F2) {
            a8Var.F2 = z9;
            org.telegram.messenger.g0.q3(a8Var, z9);
        }
    }

    public static boolean L0(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static org.telegram.messenger.hc N0(org.telegram.messenger.ij ijVar) {
        TLRPC.Document F0 = ijVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w10 instanceof TLRPC.TL_photoSize) && !(w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            w10 = null;
        }
        if (w10 != null) {
            return org.telegram.messenger.hc.c(w10, F0);
        }
        String u02 = ijVar.u0(true);
        if (u02 != null) {
            return org.telegram.messenger.hc.g(u02);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.We));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final k60 J0(k60 k60Var, org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.a).H1();
        TLRPC.Document F0 = ijVar.F0();
        long j3 = F0 != null ? F0.id : 0L;
        k60 J = k60Var.J();
        J.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, null), new org.telegram.ui.jq0(k60Var, 27), false);
        J.k();
        J.l(R.drawable.left_status_profile, org.telegram.messenger.id.M0(2131753913, null), new y6(this, ijVar, k60Var, 6), !H1.b.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, org.telegram.messenger.id.M0(2131753910, null), new y6(this, ijVar, k60Var, 7), false);
        J.c(R.drawable.menu_download_round, org.telegram.messenger.id.M0(2131753914, null), new y6(this, ijVar, k60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.id.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.U1;
        int w02 = org.telegram.ui.ActionBar.m6.w0(((Integer) r0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.I0);
        if (!this.O2 || w02 != this.P2) {
            this.P2 = w02;
            r0Var.setIconColor(w02);
        }
        boolean z9 = this.O2;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.G1;
        if (!z9 || w03 != this.Q2) {
            this.Q2 = w03;
            r0Var2.setIconColor(w03);
        }
        if (!this.O2 || w04 != this.R2) {
            this.R2 = w04;
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.m6.H1(r0Var2.getBackground(), w04, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        d1();
        int i7 = org.telegram.ui.ActionBar.m6.G8;
        r0Var.H(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        r0Var2.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), false);
        r0Var2.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), true);
        r0Var2.H(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
    }

    public final void M0(org.telegram.messenger.ij ijVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.p10.s0;
        int i10 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
        h.putBoolean("canSelectTopics", true);
        org.telegram.ui.zw zwVar = new org.telegram.ui.zw(h);
        if (ijVar.e1() >= 0) {
            k10 = org.telegram.messenger.k5.k(ijVar);
            tL_document = null;
        } else {
            if (!(ijVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ijVar.F0();
            k10 = null;
        }
        zwVar.D2 = new a1.d(this, k10, tL_document, ijVar, 9);
        launchActivity.t0(zwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.kp kpVar = this.p2;
        return kpVar != null && kpVar.b == org.telegram.messenger.p10.i(this.a).e();
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar == null || (launchActivity = this.z2) == null) {
            return;
        }
        if (i7 == 1) {
            M0(ijVar);
            return;
        }
        if (i7 == 2) {
            V0(ijVar);
            return;
        }
        if (i7 != 4) {
            if (i7 == 5) {
                Q0(ijVar);
                return;
            }
            if (i7 == 6) {
                wf.b.Z().h0(MediaController.B().z());
                this.J1.performClick();
                return;
            } else {
                if (i7 == 7) {
                    R0(ijVar, false, new v6(this, ijVar, 0), false);
                    return;
                }
                if (i7 == 8) {
                    fi.w6 w6Var = new fi.w6(getContext(), true, null, new x6(this, 0), null);
                    w6Var.c2 = true;
                    w6Var.U1 = false;
                    w6Var.k2.O(true);
                    w6Var.show();
                    return;
                }
                return;
            }
        }
        int i10 = org.telegram.messenger.p10.s0;
        int i11 = this.a;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        org.telegram.messenger.qs.f(this.a).k(org.telegram.messenger.qs.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.cn(bundle), false, false);
        dismiss();
    }

    public final void Q0(org.telegram.messenger.ij ijVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(ijVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = ijVar.S0();
        }
        String str = B;
        String str2 = ijVar.k.attachPath;
        if (str2 != null && str2.length() > 0 && !a8.p0.B(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            org.telegram.messenger.w7.G(this.a);
            str2 = org.telegram.messenger.w7.M(ijVar.k, false, true).toString();
        }
        MediaController.d0(str2, this.z2, 3, str, ijVar.F0() != null ? ijVar.F0().mime_type : "", new x6(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int R() {
        h7 h7Var = this.x1;
        if (h7Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return h7Var.getMeasuredHeight() + this.s0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.s0) - L));
        if (this.s0 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.s0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.m);
    }

    public final void R0(org.telegram.messenger.ij ijVar, boolean z9, Runnable runnable, boolean z10) {
        TLRPC.Document F0 = ijVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z9;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new a7(this, z10, ijVar, z9, runnable, j3, F0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0(boolean z9) {
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            if (z9) {
                m7 m7Var = this.r1;
                int childCount = m7Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = m7Var.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != ijVar) {
                        i7++;
                    }
                }
            }
            int indexOf = this.q2.indexOf(ijVar);
            if (this.o2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z10 = org.telegram.messenger.iz.O0;
                v4.b0 b0Var = this.s1;
                if (z10) {
                    b0Var.n0(indexOf);
                    return true;
                }
                b0Var.n0(this.q2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z9) {
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.m6.Lj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        } else {
            int i10 = org.telegram.ui.ActionBar.m6.E8;
            z0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        r6 r6Var = new r6(this, 0);
        int i7 = org.telegram.ui.ActionBar.m6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.r0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jj));
        int i11 = org.telegram.ui.ActionBar.m6.w7;
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.x7));
        int i12 = org.telegram.ui.ActionBar.m6.Kj;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.U1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.m6.Lj));
        int i13 = org.telegram.ui.ActionBar.m6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i13));
        int i14 = org.telegram.ui.ActionBar.m6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i14));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i14));
        j7 j7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        k7 k7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        int i16 = org.telegram.ui.ActionBar.m6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        s7 s7Var = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        s7 s7Var2 = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        return arrayList;
    }

    public final void U0(final boolean z9) {
        boolean O0 = O0();
        fi.d dVar = this.z1;
        fi.d dVar2 = this.y1;
        if (O0 || this.s2) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z9 ? 0.0f : 1.0f).scaleX(z9 ? 0.8f : 1.0f).scaleY(z9 ? 0.8f : 1.0f).setDuration(420L);
        wq wqVar = wq.h;
        final int i7 = 0;
        duration.setInterpolator(wqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.w6
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.y1.setVisibility(z9 ? 8 : 0);
                        break;
                    default:
                        this.b.z1.setVisibility(z9 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i10 = 1;
        dVar.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(!z9 ? 0.8f : 1.0f).scaleY(z9 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(wqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.w6
            public final /* synthetic */ a8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.y1.setVisibility(z9 ? 8 : 0);
                        break;
                    default:
                        this.b.z1.setVisibility(z9 ? 0 : 8);
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
    public final void V0(org.telegram.messenger.ij ijVar) {
        File file;
        try {
            if (!TextUtils.isEmpty(ijVar.k.attachPath)) {
                file = new File(ijVar.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7.G(this.a);
                file = org.telegram.messenger.w7.M(ijVar.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.z2);
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131747218, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ijVar.t1());
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
            this.z2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131745459, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void W0(boolean z9, boolean z10) {
        k9 k9Var = this.c2;
        h7 h7Var = this.b2;
        if (z9) {
            if (h7Var.getVisibility() == 0 || this.f2) {
                return;
            }
            h7Var.setTag(1);
            r7 r7Var = this.B1;
            k9Var.setImageBitmap(r7Var.a[r7Var.b].getImageReceiver().n());
            this.f2 = true;
            jk0.d(new t6(this, 1));
            h7Var.setVisibility(0);
            h7Var.animate().alpha(1.0f).setDuration(180L).setListener(new o7(this, 0)).start();
            k9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (h7Var.getVisibility() != 0) {
            return;
        }
        h7Var.setTag(null);
        if (z10) {
            this.f2 = true;
            h7Var.animate().alpha(0.0f).setDuration(180L).setListener(new o7(this, 1)).start();
            k9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            h7Var.setAlpha(0.0f);
            h7Var.setVisibility(4);
            k9Var.setImageBitmap(null);
            k9Var.setScaleX(0.9f);
            k9Var.setScaleY(0.9f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f11 >= childAt.getY() + this.E.getY()) {
                if (f11 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.E.getX()) {
                        if (f10 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.b.getTop();
        Drawable drawable = this.r0;
        return f11 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f10 < ((float) this.b.getLeft()) || f10 > ((float) this.b.getRight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.ij ijVar) {
        int i7 = 1;
        k60 G = k60.G(this.c, this.I0, wVar, true);
        Object[] objArr = 0;
        if (O0()) {
            G.l(R.drawable.msg_forward, org.telegram.messenger.id.M0(2131750587, null), new y6(this, G, ijVar, (int) (objArr == true ? 1 : 0)), !this.s2);
            G.l(R.drawable.msg_shareout, org.telegram.messenger.id.M0(2131745459, null), new y6(this, G, ijVar, i7), !this.s2);
            G.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null), new y6(this, ijVar, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0(G, ijVar), 6), !this.s2);
            if (!this.s2 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, org.telegram.messenger.id.M0(2131750587, null), new y6(this, G, ijVar, r1), !this.s2);
            G.l(R.drawable.msg_share, org.telegram.messenger.id.M0(2131745459, null), new y6(this, G, ijVar, 4), !this.s2);
            G.l(R.drawable.msg_view_file, org.telegram.messenger.id.M0(2131745342, null), new v6(this, ijVar, i7), ijVar.e1() > 0);
        }
        G.V(org.telegram.messenger.id.a0 ? 3 : 5);
        G.Z();
    }

    public final void Y0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.B().u0.b0;
            m.f3 f3Var = this.H2;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.h3(f3Var);
        }
    }

    public final void Z0() {
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.x1.getVisibility() == 0 ? org.telegram.messenger.g0.L(150.0f) : -org.telegram.messenger.g0.L(30.0f))) / 2);
    }

    public final void a1(boolean z9) {
        if (this.O1 == null) {
            return;
        }
        float f10 = MediaController.B().q0;
        this.P1.b(z9, f10);
        this.Q1.e(z9, f10);
        updateColors();
        boolean z10 = this.R1;
        int i7 = 0;
        this.R1 = false;
        while (true) {
            org.telegram.ui.ActionBar.z0[] z0VarArr = this.S1;
            if (i7 >= z0VarArr.length) {
                return;
            }
            if (z10 || !L0(f10, T2[i7])) {
                org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.m6.E8;
                z0Var.d(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
            } else {
                org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.m6.Ei;
                z0Var2.d(org.telegram.ui.ActionBar.m6.w0(i11, this.I0), org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
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
    public final void b1(org.telegram.messenger.ij ijVar, boolean z9) {
        boolean z10;
        float f10;
        int i7;
        t7 t7Var = this.M1;
        if (t7Var != null) {
            if (t7Var.x) {
                i7 = (int) (ijVar.L0() * t7Var.getProgress());
            } else {
                if (this.B2 >= 0.0f) {
                    int i10 = this.A2;
                    z10 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z10) {
                        t7Var.e(z9, ijVar.b0);
                    } else {
                        t7Var.e(z9, this.B2);
                    }
                    f10 = 1.0f;
                    if (!this.j2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                            if (MediaController.B().l0) {
                                f10 = org.telegram.messenger.w7.G(this.a).t(this.u2, ijVar.b0);
                            }
                            this.i2 = elapsedRealtime;
                        } else {
                            f10 = -1.0f;
                        }
                    }
                    if (f10 != -1.0f) {
                        r1.g gVar = this.h2;
                        gVar.m.i = f10 * 1000.0f;
                        gVar.h();
                    }
                    if (z10) {
                        i7 = ijVar.g0;
                    } else {
                        i7 = (int) (ijVar.L0() * t7Var.getProgress());
                        ijVar.g0 = i7;
                    }
                }
                z10 = false;
                if (z10) {
                }
                f10 = 1.0f;
                if (!this.j2) {
                }
                if (f10 != -1.0f) {
                }
                if (z10) {
                }
            }
            if (this.w2 != i7) {
                this.w2 = i7;
                this.N1.l(org.telegram.messenger.g0.g0(i7, false, false), false);
            }
            t7Var.g(ijVar);
        }
    }

    public final void c1() {
        int i7 = org.telegram.messenger.iz.S0;
        org.telegram.ui.ActionBar.r0 r0Var = this.U1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                r0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.m6.Lj;
                r0Var.setTag(Integer.valueOf(i10));
                r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(i10, this.I0) & 436207615, true);
                r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.iz.N0) {
            if (i7 == 0) {
                r0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                r0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!org.telegram.messenger.iz.O0) {
            r0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i7 == 0) {
            r0Var.setIcon(R.drawable.player_new_order);
        } else {
            r0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i7 == 0 && !org.telegram.messenger.iz.N0 && !org.telegram.messenger.iz.O0) {
            int i11 = org.telegram.ui.ActionBar.m6.Kj;
            r0Var.setTag(Integer.valueOf(i11));
            r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.I0), true);
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.m6.Lj;
        r0Var.setTag(Integer.valueOf(i12));
        r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.m6.w0(i12, this.I0), true);
        if (i7 != 0) {
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754787, null));
        } else if (org.telegram.messenger.iz.N0) {
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131745322, null));
        } else {
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131746027, null));
        }
    }

    public final void d1() {
        T0(this.X1, org.telegram.messenger.iz.N0);
        T0(this.Y1, org.telegram.messenger.iz.O0);
        T0(this.W1, org.telegram.messenger.iz.S0 == 1);
        T0(this.V1, org.telegram.messenger.iz.S0 == 2);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.messenger.ij ijVar;
        int i11 = org.telegram.messenger.qs.h2;
        int i12 = org.telegram.messenger.qs.f2;
        int i13 = org.telegram.messenger.qs.g2;
        m7 m7Var = this.r1;
        if (i7 == i11 || i7 == i13 || i7 == i12) {
            f1(i7 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i7 == i12 || i7 == i13) {
                int childCount = m7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = m7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.ij.R4(messageObject.k) || messageObject.I3())) {
                        wVar.b(false, true);
                    }
                }
                if (i7 == i13 && MediaController.B().u0 != null) {
                    if (MediaController.B().H()) {
                        Y0();
                    } else if (this.A2 == 1 && this.B2 != -1.0f) {
                        m.f3 f3Var = this.H2;
                        org.telegram.messenger.g0.r(f3Var);
                        this.E2 = 0L;
                        f3Var.run();
                        this.B2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.ij) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = m7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = m7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.ij.R4(messageObject2.k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.xq xqVar = this.H1;
            if (xqVar != null) {
                xqVar.a(d1.f.u());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.e2) {
            org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
            if (ijVar2 == null || !ijVar2.I3()) {
                return;
            }
            b1(ijVar2, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.J4) {
            a1(true);
            return;
        }
        int i16 = org.telegram.messenger.qs.K0;
        z7 z7Var = this.t1;
        if (i7 == i16) {
            this.p2 = MediaController.B().Q0;
            this.q2 = MediaController.B().R0;
            z7Var.f();
            return;
        }
        if (i7 == org.telegram.messenger.qs.L0) {
            this.p2 = MediaController.B().Q0;
            this.q2 = MediaController.B().R0;
            z7Var.f();
            if (org.telegram.messenger.iz.O0) {
                m7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                v4.b0 b0Var = this.s1;
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
        if (i7 == org.telegram.messenger.qs.Y1) {
            if (((String) objArr[0]).equals(this.u2)) {
                f1(false);
                this.j2 = true;
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.X1) {
            if (i7 == org.telegram.messenger.qs.U3) {
                f1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.u2) || (ijVar = MediaController.B().u0) == null) {
            return;
        }
        if (!this.j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                r13 = MediaController.B().l0 ? org.telegram.messenger.w7.G(this.a).t(this.u2, ijVar.b0) : 1.0f;
                this.i2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            r1.g gVar = this.h2;
            gVar.m.i = r13 * 1000.0f;
            gVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.f2);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.g2);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.h2);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.e2);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.J4);
        org.telegram.messenger.z5.q(this.a).v(this);
        if (S2 == this) {
            S2 = null;
        }
    }

    public final void e1() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(this.n2 ? org.telegram.ui.ActionBar.m6.a7 : org.telegram.ui.ActionBar.m6.h5, this.I0);
        if (w02 != this.N2) {
            this.N2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kj, this.I0);
        j7 j7Var = this.D1;
        if (j7Var != null) {
            j7Var.h(w03, "Triangle 3");
            j7Var.h(w03, "Triangle 4");
            j7Var.h(w03, "Rectangle 4");
        }
        k7 k7Var = this.E1;
        if (k7Var != null) {
            k7Var.h(w03, "Triangle 3");
            k7Var.h(w03, "Triangle 4");
            k7Var.h(w03, "Rectangle 4");
        }
        t7 t7Var = this.M1;
        if (t7Var != null) {
            t7Var.setOuterColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        }
        boolean z9 = false;
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        if (r0Var != null) {
            float f10 = MediaController.B().q0;
            int w04 = org.telegram.ui.ActionBar.m6.w0(!L0(f10, 1.0f) ? org.telegram.ui.ActionBar.m6.Ei : org.telegram.ui.ActionBar.m6.x7, this.I0);
            eu0 eu0Var = this.P1;
            if (eu0Var != null) {
                eu0Var.a.u(w04);
                Paint paint = eu0Var.b;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), w04 & 436207615, true);
            int i7 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.S1;
                if (i7 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i7] != null) {
                    int w05 = org.telegram.ui.ActionBar.m6.w0(L0(f10, T2[i7]) ? org.telegram.ui.ActionBar.m6.Ei : org.telegram.ui.ActionBar.m6.E8, this.I0);
                    z0VarArr[i7].d(w05, w05);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.I1;
        if (z0Var != null) {
            l7 l7Var = this.J1;
            if (l7Var != null && l7Var.b()) {
                z9 = true;
            }
            int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0);
            int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0);
            int i10 = org.telegram.ui.ActionBar.m6.Ci;
            z0Var.e(w06, w07, org.telegram.ui.ActionBar.m6.w0(i10, this.I0), z9);
            this.I1.setSelectorColor((l7Var == null || !l7Var.b()) ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.I0) : org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.I0)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z9) {
        File file;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        k9 k9Var;
        ImageView imageView;
        int i10;
        int i11;
        String str;
        boolean z13;
        Bitmap bitmap;
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if ((ijVar == null && z9) || (ijVar != null && !ijVar.I3())) {
            dismiss();
            return;
        }
        if (ijVar == null) {
            this.r2 = null;
            return;
        }
        boolean z14 = ijVar == this.r2;
        this.r2 = ijVar;
        long j3 = ijVar.T;
        org.telegram.ui.ActionBar.r0 r0Var = this.G1;
        if (j3 != 0 || ijVar.e1() <= -2000000000) {
            r0Var.setVisibility(4);
        } else {
            r0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        long j10 = ijVar.F0() != null ? ijVar.F0().id : 0L;
        boolean z15 = (B0 < 0 && org.telegram.messenger.qp.s1(this.a).A2(B0)) || org.telegram.messenger.qp.s1(this.a).A2(org.telegram.messenger.ij.B0(ijVar.k)) || ijVar.k.noforwards;
        if (z15 != this.s2) {
            this.s2 = z15;
            h7 h7Var = this.x1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(((z15 || O0()) ? 0 : 52) + org.telegram.messenger.qs.J2);
            h7Var.setLayoutParams(layoutParams);
            View view = this.o1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.qs.J2 + ((O0() || z15) ? 0 : 52));
            view.setLayoutParams(layoutParams2);
        }
        if (z15) {
            r0Var.t(1);
            r0Var.t(2);
            r0Var.t(5);
            r0Var.t(6);
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(16.0f));
        } else {
            r0Var.S(1);
            r0Var.S(2);
            r0Var.S(5);
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        }
        String str2 = ijVar.k.attachPath;
        if (str2 != null && str2.length() > 0) {
            file = new File(ijVar.k.attachPath);
        }
        file = null;
        if (file == null) {
            org.telegram.messenger.w7.G(this.a);
            file = org.telegram.messenger.w7.M(ijVar.k, false, true);
        }
        boolean z16 = org.telegram.messenger.iz.B0 && ((int) org.telegram.messenger.ij.B0(ijVar.k)) != 0 && ijVar.I3();
        boolean exists = file.exists();
        ImageView imageView2 = this.Z1;
        t7 t7Var = this.M1;
        h70 h70Var = this.L1;
        if (exists || z16) {
            org.telegram.messenger.z5.q(this.a).v(this);
            h70Var.setVisibility(4);
            t7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = ijVar.S0();
            org.telegram.messenger.z5.q(this.a).a(S0, null, this);
            Float w10 = org.telegram.messenger.gc.D().w(S0);
            h70Var.a(false, w10 != null ? w10.floatValue() : 0.0f);
            h70Var.setVisibility(0);
            t7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        b1(ijVar, !z14);
        r7 r7Var = this.B1;
        k9 k9Var2 = z14 ? r7Var.a[r7Var.b] : r7Var.a[r7Var.b == 0 ? (char) 1 : (char) 0];
        rf.a aVar = MediaController.B().D0;
        if (z14) {
            z10 = true;
            z11 = false;
            z12 = z14;
            i7 = 3;
        } else {
            AnimatorSet animatorSet = r7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            r7Var.c = new AnimatorSet();
            int i12 = r7Var.b == 0 ? 1 : 0;
            r7Var.b = i12;
            z10 = true;
            k9[] k9VarArr = r7Var.a;
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
            z11 = false;
            z12 = z14;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(wq.g);
            ofFloat.addUpdateListener(new ch.u(5, k9Var4, I));
            if (I) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(k9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(wq.i);
                ofFloat2.addUpdateListener(new bi.de(12, k9Var3, k9Var4));
                i7 = 3;
                ofFloat2.addListener(new y5(k9Var3, i7));
                r7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                i7 = 3;
                r7Var.c.play(ofFloat);
            }
            r7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.u2 = org.telegram.messenger.w7.r(null, ijVar.F0());
            boolean z17 = z11;
            this.j2 = z17;
            String u02 = ijVar.u0(z17);
            int i13 = i7;
            org.telegram.messenger.hc N0 = N0(ijVar);
            if (TextUtils.isEmpty(u02)) {
                k9Var = k9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                if (N0 != null) {
                    k9Var.g(1, 0L, ijVar, null, null, null, null, N0);
                } else {
                    str = null;
                    k9Var.setImageDrawable(null);
                    k9Var.invalidate();
                }
            } else {
                org.telegram.messenger.hc g10 = org.telegram.messenger.hc.g(u02);
                k9Var = k9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                k9Var.g(1, 0L, ijVar, null, null, null, g10, N0);
            }
            str = null;
            k9Var.invalidate();
        } else {
            k9Var2.setImageBitmap(bitmap);
            this.u2 = null;
            this.j2 = z10;
            str = null;
            imageView = imageView2;
            i10 = i7;
            i11 = 8;
        }
        boolean H = MediaController.B().H();
        he0 he0Var = this.a2;
        if (H) {
            z13 = true;
            he0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.id.M0(2131754929, str));
        } else {
            z13 = true;
            he0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.id.M0(2131754930, str));
        }
        String y12 = ijVar.y1(z13);
        String w12 = ijVar.w1(z13);
        this.C1.setText(y12);
        this.F1.setText(w12);
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.a).H1();
        this.y1.setLoading(H1.c);
        U0(H1.b.contains(Long.valueOf(j10)));
        int L0 = (int) ijVar.L0();
        this.x2 = L0;
        TextView textView = this.T1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.g0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.O1;
        if (L0 > 600) {
            r0Var2.setVisibility(0);
        } else {
            r0Var2.setVisibility(i11);
        }
        if (z12) {
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
        arrayList2.add((org.telegram.messenger.ij) arrayList.get(i15));
        if (i15 != i16) {
            arrayList2.add((org.telegram.messenger.ij) arrayList.get(i16));
        }
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i17);
            org.telegram.messenger.hc N02 = N0(ijVar2);
            if (N02 != null) {
                if (N02.g != null) {
                    org.telegram.messenger.gc D = org.telegram.messenger.gc.D();
                    D.s.c(new org.telegram.messenger.ib(D, N02.g, i10));
                } else {
                    org.telegram.messenger.w7.G(this.a).V(N02, ijVar2, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.y2;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.L1.a(true, Math.min(1.0f, j3 / j10));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        h7 h7Var = this.b2;
        if (view != h7Var) {
            return false;
        }
        h7Var.layout(0, 0, h7Var.getMeasuredWidth(), h7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean l0(View view, int i7, int i10) {
        h7 h7Var = this.b2;
        if (view != h7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        h7Var.measure(View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        q7 q7Var = this.m1;
        if (q7Var != null && q7Var.n0) {
            q7Var.n(true);
        } else if (this.b2.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            if (this.e2 != null && this.U1 != null && this.G1 != null && this.L1 != null) {
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
            float f10 = this.G2;
            if (f10 >= 0.0f) {
                boolean z9 = f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0)) > 0.699999988079071d;
                if (z9 != this.F2) {
                    this.F2 = z9;
                    org.telegram.messenger.g0.q3(this, z9);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        S2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        if (r0Var != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(!L0(MediaController.B().q0, 1.0f) ? org.telegram.ui.ActionBar.m6.Ei : org.telegram.ui.ActionBar.m6.x7, this.I0);
            eu0 eu0Var = this.P1;
            if (eu0Var != null) {
                eu0Var.a.u(w02);
                Paint paint = eu0Var.b;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            r0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(w02 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.I1;
        if (z0Var != null) {
            l7 l7Var = this.J1;
            boolean z9 = l7Var != null && l7Var.b();
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0);
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0);
            int i7 = org.telegram.ui.ActionBar.m6.Ci;
            z0Var.e(w03, w04, org.telegram.ui.ActionBar.m6.w0(i7, this.I0), z9);
            this.I1.setSelectorColor((l7Var == null || !l7Var.b()) ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.I0) : org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)));
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
