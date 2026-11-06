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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, org.telegram.messenger.x5 {
    public static b8 P2;
    public static final float[] Q2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final k7 A1;
    public long A2;
    public final l7 B1;
    public long B2;
    public final t7 C1;
    public boolean C2;
    public final org.telegram.ui.ActionBar.r0 D1;
    public float D2;
    public final org.telegram.ui.uq E1;
    public final m.f3 E2;
    public org.telegram.ui.ActionBar.z0 F1;
    public o7 F2;
    public final m7 G1;
    public long G2;
    public final boolean H1;
    public float H2;
    public final h70 I1;
    public final org.telegram.ui.Cells.f2 I2;
    public final u7 J1;
    public ValueAnimator J2;
    public final org.telegram.ui.ActionBar.k5 K1;
    public int K2;
    public final org.telegram.ui.ActionBar.r0 L1;
    public boolean L2;
    public final du0 M1;
    public int M2;
    public final org.telegram.ui.ActionBar.v0 N1;
    public int N2;
    public boolean O1;
    public int O2;
    public final org.telegram.ui.ActionBar.z0[] P1;
    public final TextView Q1;
    public final org.telegram.ui.ActionBar.r0 R1;
    public final org.telegram.ui.ActionBar.z0 S1;
    public final org.telegram.ui.ActionBar.z0 T1;
    public final org.telegram.ui.ActionBar.z0 U1;
    public final org.telegram.ui.ActionBar.z0 V1;
    public final ImageView W1;
    public final he0 X1;
    public final i7 Y1;
    public final l9 Z1;
    public final org.telegram.ui.ActionBar.r0 a2;
    public final org.telegram.ui.ActionBar.r0 b2;
    public boolean c2;
    public final View[] d2;
    public final r1.g e2;
    public long f2;
    public boolean g2;
    public boolean h2;
    public final View i1;
    public int i2;
    public final r7 j1;
    public int j2;
    public final View k1;
    public final boolean k2;
    public final View l1;
    public final boolean l2;
    public boolean m1;
    public org.telegram.messenger.kp m2;
    public boolean n1;
    public ArrayList n2;
    public final n7 o1;
    public org.telegram.messenger.ij o2;
    public final v4.b0 p1;
    public boolean p2;
    public final a8 q1;
    public int q2;
    public final LinearLayout r1;
    public String r2;
    public final TextView s1;
    public AnimatorSet s2;
    public final TextView t1;
    public int t2;
    public final i7 u1;
    public int u2;
    public final fi.d v1;
    public final int v2;
    public final fi.d w1;
    public final LaunchActivity w2;
    public final v4.y x1;
    public int x2;
    public final s7 y1;
    public float y2;
    public final t7 z1;
    public int z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.User a22;
        int i7 = 1;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.P1 = z0VarArr;
        View[] viewArr = new View[5];
        this.d2 = viewArr;
        this.h2 = true;
        this.i2 = -1;
        this.q2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.y2 = -1.0f;
        this.D2 = -1.0f;
        int i10 = 25;
        this.E2 = new m.f3(this, i10);
        this.I2 = new org.telegram.ui.Cells.f2(this);
        this.r = true;
        N();
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            this.a = ijVar.I1;
        } else {
            this.a = org.telegram.messenger.p10.s0;
        }
        this.w2 = (LaunchActivity) activity;
        this.v2 = org.telegram.messenger.z5.q(this.a).k();
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
        q7 q7Var = new q7(this, activity);
        this.b = q7Var;
        final int i11 = 0;
        q7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        r7 r7Var = new r7(this, activity, f6Var, i11);
        this.j1 = r7Var;
        r7Var.setBackgroundColor(0);
        r7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i13, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, org.telegram.ui.ActionBar.k6.Bj, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, i13, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 6, org.telegram.ui.ActionBar.k6.Dj, f6Var);
        r7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y q10 = r7Var.q();
        q10.setLayoutParams(c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        View view = new View(activity);
        this.i1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, view, f6Var);
        r7Var.addView(view, 0, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        view.setAlpha(0.0f);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 10));
        View view2 = new View(activity);
        this.k1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.l1 = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, f6Var);
        i7 i7Var = new i7(this, activity, 2);
        this.u1 = i7Var;
        s7 s7Var = new s7(this, activity);
        this.y1 = s7Var;
        i7Var.addView(s7Var, c8.ha.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, activity, i11);
        this.z1 = t7Var;
        i7Var.addView(t7Var, c8.ha.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var2 = new t7(this, activity, activity, i7);
        this.C1 = t7Var2;
        i7Var.addView(t7Var2, c8.ha.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        u7 u7Var = new u7(this, activity, f6Var);
        this.J1 = u7Var;
        u7Var.setLineWidth(4);
        u7Var.setDelegate(new gf.g(this, 28));
        u7Var.setReportChanges(true);
        i7Var.addView(u7Var, c8.ha.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        gVar.b(new e7(this, i11));
        this.e2 = gVar;
        h70 h70Var = new h70(activity);
        this.I1 = h70Var;
        h70Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Hj, h70Var, f6Var);
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        i7Var.addView(h70Var, c8.ha.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.K1 = k5Var;
        k5Var.setTextSize(12);
        k5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.k6.Gj;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i14, f6Var);
        k5Var.setImportantForAccessibility(2);
        i7Var.addView(k5Var, c8.ha.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Q1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i14, f6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        i7Var.addView(textView, c8.ha.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(activity, null, 0, org.telegram.ui.ActionBar.k6.w0(i14, this.I0), false, f6Var);
        this.L1 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setShowSubmenuByMove(false);
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        r0Var.setDelegate(new t6(this, i11));
        du0 du0Var = new du0();
        this.M1 = du0Var;
        r0Var.setIcon(du0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), f6Var);
        this.N1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new u6(this, i11));
        z0VarArr[0] = r0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.hd.M0(2131745267, null));
        z0VarArr[1] = r0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.hd.M0(2131745268, null));
        z0VarArr[2] = r0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.hd.M0(2131745269, null));
        z0VarArr[3] = r0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.hd.M0(2131745271, null));
        z0VarArr[4] = r0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.hd.M0(2131745265, null));
        z0VarArr[5] = r0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.hd.M0(2131745266, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            r0Var.setPadding(0, 1, 0, 0);
        }
        r0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        r0Var.setShowedFromBottom(true);
        i7Var.addView(r0Var, c8.ha.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(i10, this, fArr));
        r0Var.setOnLongClickListener(new di.f2(2, this, f6Var));
        a1(false);
        i7 i7Var2 = new i7(this, activity, i11);
        i7Var.addView(i7Var2, c8.ha.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(activity, null, 0, 0, false, f6Var);
        this.R1 = r0Var2;
        viewArr[0] = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setShowSubmenuByMove(false);
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, h02, null, N, f6Var);
        i7Var2.addView(r0Var2, c8.ha.e(48, 48, 51));
        r0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i11;
                b8 b8Var = this.b;
                switch (i16) {
                    case 0:
                        b8Var.d1();
                        b8Var.R1.U(null, null);
                        break;
                    default:
                        m7 m7Var = b8Var.G1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null) {
                            char c10 = 1;
                            k60 G = k60.G(b8Var.c, b8Var.I0, view4, true);
                            k60 J0 = b8Var.J0(G, ijVar2);
                            if (!b8Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0, 7), !b8Var.p2);
                                if (!b8Var.p2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750588, null), new a7(b8Var, G, 0), !b8Var.p2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745460, null), new a7(b8Var, G, c10 == true ? 1 : 0), !b8Var.p2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.hd.M0(2131745343, null), new a7(b8Var, G, 2), ijVar2.f1() > 0);
                            if (b8Var.H1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                b8Var.F1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743590, null), R.drawable.menu_video_chromecast, null);
                                b8Var.F1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, b8Var, G));
                                org.telegram.messenger.g0.E2(m7Var);
                                b8Var.F1.addView(m7Var, 0, c8.ha.c(-1.0f, -1));
                                b8Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new a7(b8Var, G, 3), org.telegram.messenger.hd.M0(2131746644, null), b8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        this.S1 = r0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.hd.M0(2131746272, null));
        this.T1 = r0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.hd.M0(2131746275, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.U1 = r0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.hd.M0(2131745323, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.V1 = r0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.hd.M0(2131746028, null));
        r0Var2.setShowedFromBottom(true);
        r0Var2.setDelegate(new t6(this, i7));
        int i16 = org.telegram.ui.ActionBar.k6.Kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i16, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.A1 = k7Var;
        viewArr[1] = k7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k7Var.setScaleType(scaleType);
        k7Var.f(R.raw.player_prev, 20, 20, null);
        k7Var.h(w02, "Triangle 3");
        k7Var.h(w02, "Triangle 4");
        k7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
        k7Var.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(k7Var, h03, null, N2, f6Var);
        i7Var2.addView(k7Var, c8.ha.e(48, 48, 51));
        k7Var.setContentDescription(org.telegram.messenger.hd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.W1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        he0 he0Var = new he0(28);
        this.X1 = he0Var;
        imageView.setImageDrawable(he0Var);
        he0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i16, f6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView, h04, null, N3, f6Var);
        i7Var2.addView(imageView, c8.ha.e(48, 48, 51));
        imageView.setOnClickListener(new bi.l1(9));
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.B1 = l7Var;
        viewArr[3] = l7Var;
        l7Var.setScaleType(scaleType);
        l7Var.f(R.raw.player_prev, 20, 20, null);
        l7Var.h(w02, "Triangle 3");
        l7Var.h(w02, "Triangle 4");
        l7Var.h(w02, "Rectangle 4");
        l7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i15);
        l7Var.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(l7Var, h05, null, N4, f6Var);
        i7Var2.addView(l7Var, c8.ha.e(48, 48, 51));
        l7Var.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(activity, null, 0, w02, false, f6Var);
        this.D1 = r0Var3;
        viewArr[4] = r0Var3;
        org.telegram.ui.uq uqVar = new org.telegram.ui.uq(R.drawable.ic_ab_other, activity, f6Var);
        this.E1 = uqVar;
        r0Var3.setIcon(uqVar);
        r0Var3.setLongClickEnabled(false);
        r0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        final int i17 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i15);
        r0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(r0Var3, h06, null, N5, f6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v6
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i162 = i17;
                b8 b8Var = this.b;
                switch (i162) {
                    case 0:
                        b8Var.d1();
                        b8Var.R1.U(null, null);
                        break;
                    default:
                        m7 m7Var = b8Var.G1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null) {
                            char c10 = 1;
                            k60 G = k60.G(b8Var.c, b8Var.I0, view4, true);
                            k60 J0 = b8Var.J0(G, ijVar2);
                            if (!b8Var.O0()) {
                                G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0, 7), !b8Var.p2);
                                if (!b8Var.p2 && G.y() != null) {
                                    G.y().setRightIcon(R.drawable.msg_arrowright);
                                }
                                G.k();
                            }
                            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750588, null), new a7(b8Var, G, 0), !b8Var.p2);
                            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745460, null), new a7(b8Var, G, c10 == true ? 1 : 0), !b8Var.p2);
                            G.l(R.drawable.msg_message, org.telegram.messenger.hd.M0(2131745343, null), new a7(b8Var, G, 2), ijVar2.f1() > 0);
                            if (b8Var.H1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.e, G.d, false, false);
                                G.d(z0Var);
                                b8Var.F1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743590, null), R.drawable.menu_video_chromecast, null);
                                b8Var.F1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, b8Var, G));
                                org.telegram.messenger.g0.E2(m7Var);
                                b8Var.F1.addView(m7Var, 0, c8.ha.c(-1.0f, -1));
                                b8Var.updateColors();
                            }
                            G.m(R.drawable.msg_delete, new a7(b8Var, G, 3), org.telegram.messenger.hd.M0(2131746644, null), b8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            break;
                        }
                        break;
                }
            }
        });
        i7Var2.addView(r0Var3, c8.ha.e(48, 48, 51));
        m7 m7Var = new m7(this, activity, 0);
        this.G1 = m7Var;
        this.H1 = true;
        try {
            m7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.H1 = false;
        }
        this.G1.setVisibility(4);
        org.telegram.ui.uq uqVar2 = this.E1;
        if (uqVar2 != null) {
            uqVar2.a(d1.f.u());
        }
        this.D1.setShowedFromBottom(true);
        this.D1.setDelegate(new t6(this, 2));
        this.D1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.r1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i18 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, f6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.s1 = textView2;
        int i19 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView2, i19, f6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.hd.M0(2131748242, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.t1 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i19, f6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        n7 n7Var = new n7(this, activity);
        this.o1 = n7Var;
        n7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.p1 = b0Var;
        n7Var.setLayoutManager(b0Var);
        n7Var.setHorizontalScrollBarEnabled(false);
        n7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(n7Var, c8.ha.e(-1, -1, 51));
        a8 a8Var = new a8(this, activity);
        this.q1 = a8Var;
        n7Var.setAdapter(a8Var);
        org.telegram.ui.ActionBar.r6.m(n7Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        n7Var.setOnItemClickListener(new g7(0));
        n7Var.setOnItemLongClickListener(new t6(this, 3));
        n7Var.setOnScrollListener(new ai.b(this, 26));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.v1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i20 = 0;
        spannableStringBuilder.setSpan(new wp(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h7
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i21 = i20;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                b8 b8Var = this.b;
                switch (i21) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null && b8Var.w2 != null) {
                            b8Var.R0(ijVar2, true, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.b, f6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().u0;
                        if (ijVar3 != null && b8Var.w2 != null) {
                            b8Var.R0(ijVar3, false, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.b, f6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.u1.addView(dVar, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i21 = 1;
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.w1 = dVar2;
        dVar2.setText(org.telegram.messenger.hd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h7
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i212 = i21;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                b8 b8Var = this.b;
                switch (i212) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
                        if (ijVar2 != null && b8Var.w2 != null) {
                            b8Var.R0(ijVar2, true, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.b, f6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().u0;
                        if (ijVar3 != null && b8Var.w2 != null) {
                            b8Var.R0(ijVar3, false, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.b, f6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.u1.addView(dVar2, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.kp kpVar = MediaController.B().Q0;
        this.m2 = kpVar;
        boolean z9 = kpVar != null;
        this.k2 = z9;
        this.j1.m0 = z9;
        this.l2 = O0();
        this.n2 = MediaController.B().R0;
        if (O0()) {
            yVar = q10;
            this.a2 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = q10;
        }
        org.telegram.ui.ActionBar.r0 a10 = yVar.a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, 5);
        this.b2 = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        int i22 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(searchField, i22, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, f6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i22, f6Var);
        if (z9) {
            n7Var.r1();
            v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var));
            this.j1.setAlpha(1.0f);
            this.i1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.I2;
            r7 r7Var2 = this.j1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(r7Var2, valueOf);
        }
        boolean z10 = this.n2.size() > 1;
        a8Var.h = z10;
        if (z10) {
            n7Var.setVisibility(0);
            n7Var.setTranslationY(0.0f);
        } else {
            n7Var.setVisibility(8);
            n7Var.setTranslationY(org.telegram.messenger.g0.q.y);
        }
        a8Var.f();
        this.j1.setTitle(org.telegram.messenger.hd.M0(2131753952, null));
        org.telegram.messenger.kp kpVar2 = this.m2;
        if (kpVar2 != null) {
            if (kpVar2.b == org.telegram.messenger.p10.i(this.a).e()) {
                this.j1.setTitle(org.telegram.messenger.hd.M0(2131746642, null));
            } else {
                this.j1.setTitle(org.telegram.messenger.hd.a0(null, null, 2131746643, org.telegram.messenger.m5.t(this.m2.b)));
            }
        } else if (ijVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.ij.B0(ijVar.k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.qp.s1(this.a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.j1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.p10.i(this.a).e()) {
                if (ijVar.Q1() == 2666000) {
                    this.j1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else {
                    this.j1.setTitle(org.telegram.messenger.hd.M0(2131745902, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.j1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.j1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new ei.d(this, 3));
            this.x1 = yVar2;
            yVar2.h(n7Var);
        }
        this.b.addView(this.u1, c8.ha.e(-1, ((O0() || this.p2) ? 0 : 52) + org.telegram.messenger.qs.J2, 83));
        this.b.addView(this.l1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        ((FrameLayout.LayoutParams) this.u1.getLayoutParams()).height = org.telegram.messenger.g0.L(((O0() || this.p2) ? 0 : 52) + org.telegram.messenger.qs.J2);
        ((FrameLayout.LayoutParams) this.l1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.qs.J2 + ((O0() || this.p2) ? 0 : 52));
        this.b.addView(this.k1, c8.ha.c(3.0f, -1));
        this.b.addView(this.j1);
        i7 i7Var3 = new i7(this, activity, 1);
        this.Y1 = i7Var3;
        i7Var3.setAlpha(0.0f);
        i7Var3.setVisibility(4);
        this.c.addView(i7Var3);
        l9 l9Var = new l9(activity);
        this.Z1 = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        l9Var.setScaleX(0.9f);
        l9Var.setScaleY(0.9f);
        i7Var3.addView(l9Var, c8.ha.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.n1 && a8Var.b() == 0) {
            i18 = 0;
        }
        linearLayout.setVisibility(i18);
        Z0();
    }

    public static void I0(b8 b8Var) {
        View view = b8Var.k1;
        r7 r7Var = b8Var.j1;
        n7 n7Var = b8Var.o1;
        if (n7Var.getChildCount() <= 0) {
            int paddingTop = n7Var.getPaddingTop();
            b8Var.q2 = paddingTop;
            n7Var.setTopGlowOffset(paddingTop);
            b8Var.b.invalidate();
            return;
        }
        boolean z9 = false;
        View childAt = n7Var.getChildAt(0);
        xi0 xi0Var = (xi0) n7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && r7Var.getTag() == null) || (!z10 && r7Var.getTag() != null)) {
            r7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = b8Var.s2;
            if (animatorSet != null) {
                animatorSet.cancel();
                b8Var.s2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            b8Var.s2 = animatorSet2;
            int i7 = 2;
            if (b8Var.k2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, b8Var.I2, z10 ? 1.0f : 0.0f);
                View view2 = b8Var.i1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            }
            b8Var.s2.setDuration(320L);
            b8Var.s2.setInterpolator(xq.h);
            b8Var.s2.addListener(new p7(b8Var, i7));
            b8Var.s2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.m, top);
        if (b8Var.q2 != D) {
            b8Var.q2 = D;
            n7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.m);
            b8Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        float min = b8Var.s0 + ((int) (n7Var.getTranslationY() + ((b8Var.q2 - b8Var.s0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - b8Var.s0) / (org.telegram.messenger.g0.L(4.0f) + L2)) : 1.0f;
        b8Var.D2 = min;
        if (min <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, b8Var.I0)) > 0.699999988079071d) {
            z9 = true;
        }
        if (z9 != b8Var.C2) {
            b8Var.C2 = z9;
            org.telegram.messenger.g0.q3(b8Var, z9);
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

    @Override // org.telegram.ui.ActionBar.v2
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

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final k60 J0(k60 k60Var, org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.a).H1();
        TLRPC.Document F0 = ijVar.F0();
        long j3 = F0 != null ? F0.id : 0L;
        k60 J = k60Var.J();
        J.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.gq0(k60Var, 27), false);
        J.k();
        J.l(R.drawable.left_status_profile, org.telegram.messenger.hd.M0(2131753913, null), new z6(this, ijVar, k60Var, 6), !H1.b.contains(Long.valueOf(j3)));
        J.c(R.drawable.msg_saved, org.telegram.messenger.hd.M0(2131753910, null), new z6(this, ijVar, k60Var, 7), false);
        J.c(R.drawable.menu_download_round, org.telegram.messenger.hd.M0(2131753914, null), new z6(this, ijVar, k60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.R1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) r0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0);
        if (!this.L2 || w02 != this.M2) {
            this.M2 = w02;
            r0Var.setIconColor(w02);
        }
        boolean z9 = this.L2;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.D1;
        if (!z9 || w03 != this.N2) {
            this.N2 = w03;
            r0Var2.setIconColor(w03);
        }
        if (!this.L2 || w04 != this.O2) {
            this.O2 = w04;
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.k6.H1(r0Var2.getBackground(), w04, true);
        }
        this.L2 = true;
        this.I1.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        d1();
        int i7 = org.telegram.ui.ActionBar.k6.G8;
        r0Var.H(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        r0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), false);
        r0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), true);
        r0Var2.H(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
    }

    public final void M0(org.telegram.messenger.ij ijVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.p10.s0;
        int i10 = this.a;
        LaunchActivity launchActivity = this.w2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
        h.putBoolean("canSelectTopics", true);
        org.telegram.ui.ww wwVar = new org.telegram.ui.ww(h);
        if (ijVar.f1() >= 0) {
            k10 = org.telegram.messenger.k5.k(ijVar);
            tL_document = null;
        } else {
            if (!(ijVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ijVar.F0();
            k10 = null;
        }
        wwVar.C2 = new a1.d(this, k10, tL_document, ijVar, 9);
        launchActivity.t0(wwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.kp kpVar = this.m2;
        return kpVar != null && kpVar.b == org.telegram.messenger.p10.i(this.a).e();
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar == null || (launchActivity = this.w2) == null) {
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
                this.G1.performClick();
                return;
            } else {
                if (i7 == 7) {
                    R0(ijVar, false, new w6(this, ijVar, 0), false);
                    return;
                }
                if (i7 == 8) {
                    fi.w6 w6Var = new fi.w6(getContext(), true, null, new y6(this, 0), null);
                    w6Var.Z1 = true;
                    w6Var.R1 = false;
                    w6Var.h2.O(true);
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
        bundle.putInt("message_id", ijVar.f1());
        org.telegram.messenger.qs.f(this.a).k(org.telegram.messenger.qs.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
        dismiss();
    }

    public final void Q0(org.telegram.messenger.ij ijVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
            LaunchActivity launchActivity = this.w2;
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
        MediaController.d0(str2, this.w2, 3, str, ijVar.F0() != null ? ijVar.F0().mime_type : "", new y6(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final int R() {
        i7 i7Var = this.u1;
        if (i7Var == null) {
            return 0;
        }
        if (this.n2.size() <= 1) {
            return i7Var.getMeasuredHeight() + this.s0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.o1.getTranslationY() + ((this.q2 - this.s0) - L));
        if (this.s0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.s0) / L2));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new b7(this, z10, ijVar, z9, runnable, j3, F0));
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
                n7 n7Var = this.o1;
                int childCount = n7Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = n7Var.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != ijVar) {
                        i7++;
                    }
                }
            }
            int indexOf = this.n2.indexOf(ijVar);
            if (this.l2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z10 = org.telegram.messenger.iz.O0;
                v4.b0 b0Var = this.p1;
                if (z10) {
                    b0Var.n0(indexOf);
                    return true;
                }
                b0Var.n0(this.n2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z9) {
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.k6.Lj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.E8;
            z0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 0);
        int i7 = org.telegram.ui.ActionBar.k6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.r0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jj));
        int i11 = org.telegram.ui.ActionBar.k6.w7;
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x7));
        int i12 = org.telegram.ui.ActionBar.k6.Kj;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.R1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Lj));
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i13));
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i14));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i14));
        k7 k7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        l7 l7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        t7 t7Var = this.z1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        t7 t7Var2 = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        return arrayList;
    }

    public final void U0(final boolean z9) {
        boolean O0 = O0();
        fi.d dVar = this.w1;
        fi.d dVar2 = this.v1;
        if (O0 || this.p2) {
            dVar2.setVisibility(8);
            dVar.setVisibility(8);
            return;
        }
        dVar2.setVisibility(0);
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar2.animate().alpha(z9 ? 0.0f : 1.0f).scaleX(z9 ? 0.8f : 1.0f).scaleY(z9 ? 0.8f : 1.0f).setDuration(420L);
        xq xqVar = xq.h;
        final int i7 = 0;
        duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.x6
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.v1.setVisibility(z9 ? 8 : 0);
                        break;
                    default:
                        this.b.w1.setVisibility(z9 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final int i10 = 1;
        dVar.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(!z9 ? 0.8f : 1.0f).scaleY(z9 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.x6
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.v1.setVisibility(z9 ? 8 : 0);
                        break;
                    default:
                        this.b.w1.setVisibility(z9 ? 0 : 8);
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.w2);
                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131747217, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ijVar.u1());
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
            this.w2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131745460, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void W0(boolean z9, boolean z10) {
        l9 l9Var = this.Z1;
        i7 i7Var = this.Y1;
        if (z9) {
            if (i7Var.getVisibility() == 0 || this.c2) {
                return;
            }
            i7Var.setTag(1);
            s7 s7Var = this.y1;
            l9Var.setImageBitmap(s7Var.a[s7Var.b].getImageReceiver().n());
            this.c2 = true;
            jk0.d(new u6(this, 1));
            i7Var.setVisibility(0);
            i7Var.animate().alpha(1.0f).setDuration(180L).setListener(new p7(this, 0)).start();
            l9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (i7Var.getVisibility() != 0) {
            return;
        }
        i7Var.setTag(null);
        if (z10) {
            this.c2 = true;
            i7Var.animate().alpha(0.0f).setDuration(180L).setListener(new p7(this, 1)).start();
            l9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            i7Var.setAlpha(0.0f);
            i7Var.setVisibility(4);
            l9Var.setImageBitmap(null);
            l9Var.setScaleX(0.9f);
            l9Var.setScaleY(0.9f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
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
            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750588, null), new z6(this, G, ijVar, (int) (objArr == true ? 1 : 0)), !this.p2);
            G.l(R.drawable.msg_shareout, org.telegram.messenger.hd.M0(2131745460, null), new z6(this, G, ijVar, i7), !this.p2);
            G.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null), new z6(this, ijVar, G, 2), true);
        } else {
            G.l(R.drawable.msg_stories_save, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0(G, ijVar), 6), !this.p2);
            if (!this.p2 && G.y() != null) {
                G.y().setRightIcon(R.drawable.msg_arrowright);
            }
            G.k();
            G.l(R.drawable.msg_forward, org.telegram.messenger.hd.M0(2131750588, null), new z6(this, G, ijVar, r1), !this.p2);
            G.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745460, null), new z6(this, G, ijVar, 4), !this.p2);
            G.l(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131745343, null), new w6(this, ijVar, i7), ijVar.f1() > 0);
        }
        G.V(org.telegram.messenger.hd.a0 ? 3 : 5);
        G.Z();
    }

    public final void Y0() {
        if (this.x2 == 1) {
            this.A2 = System.currentTimeMillis();
            this.y2 = MediaController.B().u0.b0;
            m.f3 f3Var = this.E2;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.h3(f3Var);
        }
    }

    public final void Z0() {
        LinearLayout linearLayout = this.r1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.u1.getVisibility() == 0 ? org.telegram.messenger.g0.L(150.0f) : -org.telegram.messenger.g0.L(30.0f))) / 2);
    }

    public final void a1(boolean z9) {
        if (this.L1 == null) {
            return;
        }
        float f10 = MediaController.B().q0;
        this.M1.b(z9, f10);
        this.N1.e(z9, f10);
        updateColors();
        boolean z10 = this.O1;
        int i7 = 0;
        this.O1 = false;
        while (true) {
            org.telegram.ui.ActionBar.z0[] z0VarArr = this.P1;
            if (i7 >= z0VarArr.length) {
                return;
            }
            if (z10 || !L0(f10, Q2[i7])) {
                org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.k6.E8;
                z0Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
            } else {
                org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.k6.Ei;
                z0Var2.d(org.telegram.ui.ActionBar.k6.w0(i11, this.I0), org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
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
        u7 u7Var = this.J1;
        if (u7Var != null) {
            if (u7Var.x) {
                i7 = (int) (ijVar.L0() * u7Var.getProgress());
            } else {
                if (this.y2 >= 0.0f) {
                    int i10 = this.x2;
                    z10 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z10) {
                        u7Var.e(z9, ijVar.b0);
                    } else {
                        u7Var.e(z9, this.y2);
                    }
                    f10 = 1.0f;
                    if (!this.g2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.f2) >= 500) {
                            if (MediaController.B().l0) {
                                f10 = org.telegram.messenger.w7.G(this.a).t(this.r2, ijVar.b0);
                            }
                            this.f2 = elapsedRealtime;
                        } else {
                            f10 = -1.0f;
                        }
                    }
                    if (f10 != -1.0f) {
                        r1.g gVar = this.e2;
                        gVar.m.i = f10 * 1000.0f;
                        gVar.h();
                    }
                    if (z10) {
                        i7 = ijVar.g0;
                    } else {
                        i7 = (int) (ijVar.L0() * u7Var.getProgress());
                        ijVar.g0 = i7;
                    }
                }
                z10 = false;
                if (z10) {
                }
                f10 = 1.0f;
                if (!this.g2) {
                }
                if (f10 != -1.0f) {
                }
                if (z10) {
                }
            }
            if (this.t2 != i7) {
                this.t2 = i7;
                this.K1.l(org.telegram.messenger.g0.g0(i7, false, false), false);
            }
            u7Var.g(ijVar);
        }
    }

    public final void c1() {
        int i7 = org.telegram.messenger.iz.S0;
        org.telegram.ui.ActionBar.r0 r0Var = this.R1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                r0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.k6.Lj;
                r0Var.setTag(Integer.valueOf(i10));
                r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(i10, this.I0) & 436207615, true);
                r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754785, null));
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
            int i11 = org.telegram.ui.ActionBar.k6.Kj;
            r0Var.setTag(Integer.valueOf(i11));
            r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0), true);
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Lj;
        r0Var.setTag(Integer.valueOf(i12));
        r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.I0), true);
        if (i7 != 0) {
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754787, null));
        } else if (org.telegram.messenger.iz.N0) {
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131745323, null));
        } else {
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131746028, null));
        }
    }

    public final void d1() {
        T0(this.U1, org.telegram.messenger.iz.N0);
        T0(this.V1, org.telegram.messenger.iz.O0);
        T0(this.T1, org.telegram.messenger.iz.S0 == 1);
        T0(this.S1, org.telegram.messenger.iz.S0 == 2);
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
        n7 n7Var = this.o1;
        if (i7 == i11 || i7 == i13 || i7 == i12) {
            f1(i7 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i7 == i12 || i7 == i13) {
                int childCount = n7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = n7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.ij.S4(messageObject.k) || messageObject.J3())) {
                        wVar.b(false, true);
                    }
                }
                if (i7 == i13 && MediaController.B().u0 != null) {
                    if (MediaController.B().H()) {
                        Y0();
                    } else if (this.x2 == 1 && this.y2 != -1.0f) {
                        m.f3 f3Var = this.E2;
                        org.telegram.messenger.g0.r(f3Var);
                        this.B2 = 0L;
                        f3Var.run();
                        this.y2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.ij) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = n7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = n7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.ij.S4(messageObject2.k) || messageObject2.J3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.uq uqVar = this.E1;
            if (uqVar != null) {
                uqVar.a(d1.f.u());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.e2) {
            org.telegram.messenger.ij ijVar2 = MediaController.B().u0;
            if (ijVar2 == null || !ijVar2.J3()) {
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
        a8 a8Var = this.q1;
        if (i7 == i16) {
            this.m2 = MediaController.B().Q0;
            this.n2 = MediaController.B().R0;
            a8Var.f();
            return;
        }
        if (i7 == org.telegram.messenger.qs.L0) {
            this.m2 = MediaController.B().Q0;
            this.n2 = MediaController.B().R0;
            a8Var.f();
            if (org.telegram.messenger.iz.O0) {
                n7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                v4.b0 b0Var = this.p1;
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
            if (((String) objArr[0]).equals(this.r2)) {
                f1(false);
                this.g2 = true;
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
        if (!((String) objArr[0]).equals(this.r2) || (ijVar = MediaController.B().u0) == null) {
            return;
        }
        if (!this.g2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.f2) >= 500) {
                r13 = MediaController.B().l0 ? org.telegram.messenger.w7.G(this.a).t(this.r2, ijVar.b0) : 1.0f;
                this.f2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            r1.g gVar = this.e2;
            gVar.m.i = r13 * 1000.0f;
            gVar.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
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
        if (P2 == this) {
            P2 = null;
        }
    }

    public final void e1() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.k2 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.h5, this.I0);
        if (w02 != this.K2) {
            this.K2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.I0);
        k7 k7Var = this.A1;
        if (k7Var != null) {
            k7Var.h(w03, "Triangle 3");
            k7Var.h(w03, "Triangle 4");
            k7Var.h(w03, "Rectangle 4");
        }
        l7 l7Var = this.B1;
        if (l7Var != null) {
            l7Var.h(w03, "Triangle 3");
            l7Var.h(w03, "Triangle 4");
            l7Var.h(w03, "Rectangle 4");
        }
        u7 u7Var = this.J1;
        if (u7Var != null) {
            u7Var.setOuterColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        }
        boolean z9 = false;
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        if (r0Var != null) {
            float f10 = MediaController.B().q0;
            int w04 = org.telegram.ui.ActionBar.k6.w0(!L0(f10, 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7, this.I0);
            du0 du0Var = this.M1;
            if (du0Var != null) {
                du0Var.a.u(w04);
                Paint paint = du0Var.b;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), w04 & 436207615, true);
            int i7 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.P1;
                if (i7 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i7] != null) {
                    int w05 = org.telegram.ui.ActionBar.k6.w0(L0(f10, Q2[i7]) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.E8, this.I0);
                    z0VarArr[i7].d(w05, w05);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.F1;
        if (z0Var != null) {
            m7 m7Var = this.G1;
            if (m7Var != null && m7Var.b()) {
                z9 = true;
            }
            int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.I0);
            int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.I0);
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            z0Var.e(w06, w07, org.telegram.ui.ActionBar.k6.w0(i10, this.I0), z9);
            this.F1.setSelectorColor((m7Var == null || !m7Var.b()) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.I0)));
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
        l9 l9Var;
        ImageView imageView;
        int i10;
        int i11;
        String str;
        boolean z13;
        Bitmap bitmap;
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if ((ijVar == null && z9) || (ijVar != null && !ijVar.J3())) {
            dismiss();
            return;
        }
        if (ijVar == null) {
            this.o2 = null;
            return;
        }
        boolean z14 = ijVar == this.o2;
        this.o2 = ijVar;
        long j3 = ijVar.T;
        org.telegram.ui.ActionBar.r0 r0Var = this.D1;
        if (j3 != 0 || ijVar.f1() <= -2000000000) {
            r0Var.setVisibility(4);
        } else {
            r0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        long j10 = ijVar.F0() != null ? ijVar.F0().id : 0L;
        boolean z15 = (B0 < 0 && org.telegram.messenger.qp.s1(this.a).A2(B0)) || org.telegram.messenger.qp.s1(this.a).A2(org.telegram.messenger.ij.B0(ijVar.k)) || ijVar.k.noforwards;
        if (z15 != this.p2) {
            this.p2 = z15;
            i7 i7Var = this.u1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(((z15 || O0()) ? 0 : 52) + org.telegram.messenger.qs.J2);
            i7Var.setLayoutParams(layoutParams);
            View view = this.l1;
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
        boolean z16 = org.telegram.messenger.iz.B0 && ((int) org.telegram.messenger.ij.B0(ijVar.k)) != 0 && ijVar.J3();
        boolean exists = file.exists();
        ImageView imageView2 = this.W1;
        u7 u7Var = this.J1;
        h70 h70Var = this.I1;
        if (exists || z16) {
            org.telegram.messenger.z5.q(this.a).v(this);
            h70Var.setVisibility(4);
            u7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = ijVar.S0();
            org.telegram.messenger.z5.q(this.a).a(S0, null, this);
            Float w10 = org.telegram.messenger.gc.D().w(S0);
            h70Var.a(false, w10 != null ? w10.floatValue() : 0.0f);
            h70Var.setVisibility(0);
            u7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        b1(ijVar, !z14);
        s7 s7Var = this.y1;
        l9 l9Var2 = z14 ? s7Var.a[s7Var.b] : s7Var.a[s7Var.b == 0 ? (char) 1 : (char) 0];
        rf.a aVar = MediaController.B().D0;
        if (z14) {
            z10 = true;
            z11 = false;
            z12 = z14;
            i7 = 3;
        } else {
            AnimatorSet animatorSet = s7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            s7Var.c = new AnimatorSet();
            int i12 = s7Var.b == 0 ? 1 : 0;
            s7Var.b = i12;
            z10 = true;
            l9[] l9VarArr = s7Var.a;
            l9 l9Var3 = l9VarArr[i12 ^ 1];
            l9 l9Var4 = l9VarArr[i12];
            boolean I = l9Var3.getImageReceiver().I();
            l9Var4.setAlpha(I ? 1.0f : 0.0f);
            l9Var4.setScaleX(0.8f);
            l9Var4.setScaleY(0.8f);
            l9Var4.setVisibility(0);
            if (I) {
                l9Var3.bringToFront();
            } else {
                l9Var3.setVisibility(8);
                l9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z11 = false;
            z12 = z14;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(xq.g);
            ofFloat.addUpdateListener(new ch.u(5, l9Var4, I));
            if (I) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(l9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(xq.i);
                ofFloat2.addUpdateListener(new bi.de(12, l9Var3, l9Var4));
                i7 = 3;
                ofFloat2.addListener(new z5(l9Var3, i7));
                s7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                i7 = 3;
                s7Var.c.play(ofFloat);
            }
            s7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.r2 = org.telegram.messenger.w7.r(null, ijVar.F0());
            boolean z17 = z11;
            this.g2 = z17;
            String u02 = ijVar.u0(z17);
            int i13 = i7;
            org.telegram.messenger.hc N0 = N0(ijVar);
            if (TextUtils.isEmpty(u02)) {
                l9Var = l9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                if (N0 != null) {
                    l9Var.g(1, 0L, ijVar, null, null, null, null, N0);
                } else {
                    str = null;
                    l9Var.setImageDrawable(null);
                    l9Var.invalidate();
                }
            } else {
                org.telegram.messenger.hc g10 = org.telegram.messenger.hc.g(u02);
                l9Var = l9Var2;
                imageView = imageView2;
                i10 = i13;
                i11 = 8;
                l9Var.g(1, 0L, ijVar, null, null, null, g10, N0);
            }
            str = null;
            l9Var.invalidate();
        } else {
            l9Var2.setImageBitmap(bitmap);
            this.r2 = null;
            this.g2 = z10;
            str = null;
            imageView = imageView2;
            i10 = i7;
            i11 = 8;
        }
        boolean H = MediaController.B().H();
        he0 he0Var = this.X1;
        if (H) {
            z13 = true;
            he0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754929, str));
        } else {
            z13 = true;
            he0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754930, str));
        }
        String z18 = ijVar.z1(z13);
        String x12 = ijVar.x1(z13);
        this.z1.setText(z18);
        this.C1.setText(x12);
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.a).H1();
        this.v1.setLoading(H1.c);
        U0(H1.b.contains(Long.valueOf(j10)));
        int L0 = (int) ijVar.L0();
        this.u2 = L0;
        TextView textView = this.Q1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.g0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.L1;
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
        return this.v2;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.I1.a(true, Math.min(1.0f, j3 / j10));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        i7 i7Var = this.Y1;
        if (view != i7Var) {
            return false;
        }
        i7Var.layout(0, 0, i7Var.getMeasuredWidth(), i7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean l0(View view, int i7, int i10) {
        i7 i7Var = this.Y1;
        if (view != i7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.l2 l2Var = this.c;
        i7Var.measure(View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        r7 r7Var = this.j1;
        if (r7Var != null && r7Var.n0) {
            r7Var.l(true);
        } else if (this.Y1.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            if (this.b2 != null && this.R1 != null && this.D1 != null && this.I1 != null) {
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
            float f10 = this.D2;
            if (f10 >= 0.0f) {
                boolean z9 = f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0)) > 0.699999988079071d;
                if (z9 != this.C2) {
                    this.C2 = z9;
                    org.telegram.messenger.g0.q3(this, z9);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        P2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        if (r0Var != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(!L0(MediaController.B().q0, 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7, this.I0);
            du0 du0Var = this.M1;
            if (du0Var != null) {
                du0Var.a.u(w02);
                Paint paint = du0Var.b;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            r0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(w02 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.F1;
        if (z0Var != null) {
            m7 m7Var = this.G1;
            boolean z9 = m7Var != null && m7Var.b();
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.I0);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.I0);
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            z0Var.e(w03, w04, org.telegram.ui.ActionBar.k6.w0(i7, this.I0), z9);
            this.F1.setSelectorColor((m7Var == null || !m7Var.b()) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.I0) : org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)));
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
