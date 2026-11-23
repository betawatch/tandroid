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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e8 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs, org.telegram.messenger.y5 {
    public static e8 T2;
    public static final float[] U2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hi.e A1;
    public final LaunchActivity A2;
    public final v4.z B1;
    public int B2;
    public final v7 C1;
    public float C2;
    public final w7 D1;
    public int D2;
    public final n7 E1;
    public long E2;
    public final o7 F1;
    public long F2;
    public final w7 G1;
    public boolean G2;
    public final org.telegram.ui.ActionBar.q0 H1;
    public float H2;
    public final org.telegram.ui.xq I1;
    public final i6.g I2;
    public org.telegram.ui.ActionBar.y0 J1;
    public r7 J2;
    public final p7 K1;
    public long K2;
    public final boolean L1;
    public float L2;
    public final u70 M1;
    public final org.telegram.ui.Cells.g2 M2;
    public final x7 N1;
    public ValueAnimator N2;
    public final org.telegram.ui.ActionBar.n5 O1;
    public int O2;
    public final org.telegram.ui.ActionBar.q0 P1;
    public boolean P2;
    public final ou0 Q1;
    public int Q2;
    public final org.telegram.ui.ActionBar.u0 R1;
    public int R2;
    public boolean S1;
    public int S2;
    public final org.telegram.ui.ActionBar.y0[] T1;
    public final TextView U1;
    public final org.telegram.ui.ActionBar.q0 V1;
    public final org.telegram.ui.ActionBar.y0 W1;
    public final org.telegram.ui.ActionBar.y0 X1;
    public final org.telegram.ui.ActionBar.y0 Y1;
    public final org.telegram.ui.ActionBar.y0 Z1;
    public final ImageView a2;
    public final ve0 b2;
    public final l7 c2;
    public final p9 d2;
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
    public final u7 n1;
    public int n2;
    public final View o1;
    public final boolean o2;
    public final View p1;
    public final boolean p2;
    public boolean q1;
    public org.telegram.messenger.gp q2;
    public boolean r1;
    public ArrayList r2;
    public final q7 s1;
    public org.telegram.messenger.fj s2;
    public final v4.c0 t1;
    public boolean t2;
    public final d8 u1;
    public int u2;
    public final LinearLayout v1;
    public String v2;
    public final TextView w1;
    public AnimatorSet w2;
    public final TextView x1;
    public int x2;
    public final l7 y1;
    public int y2;
    public final hi.e z1;
    public final int z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(Activity activity, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, (Context) activity, i6Var, true);
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.User c22;
        int i7 = 1;
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[6];
        this.T1 = y0VarArr;
        View[] viewArr = new View[5];
        this.h2 = viewArr;
        this.l2 = true;
        this.m2 = -1;
        this.u2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.C2 = -1.0f;
        this.H2 = -1.0f;
        this.I2 = new i6.g(this, 29);
        this.M2 = new org.telegram.ui.Cells.g2(this);
        this.r = true;
        O();
        org.telegram.messenger.fj fjVar = MediaController.B().v0;
        if (fjVar != null) {
            this.a = fjVar.K1;
        } else {
            this.a = org.telegram.messenger.i10.t0;
        }
        this.A2 = (LaunchActivity) activity;
        this.z2 = org.telegram.messenger.a6.q(this.a).k();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.X1);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.K0);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.L0);
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.X3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.M4);
        t7 t7Var = new t7(this, activity);
        this.b = t7Var;
        final int i10 = 0;
        t7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        u7 u7Var = new u7(this, activity, i6Var, i10);
        this.n1 = u7Var;
        u7Var.setBackgroundColor(0);
        u7Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, i12, i6Var);
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, org.telegram.ui.ActionBar.n6.Ej, i6Var);
        org.telegram.ui.ActionBar.u6.l(u7Var, 5, i12, i6Var);
        org.telegram.ui.ActionBar.u6.l(u7Var, 6, org.telegram.ui.ActionBar.n6.Gj, i6Var);
        u7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = u7Var.s();
        s5.setLayoutParams(c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        View view = new View(activity);
        this.m1 = view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, view, i6Var);
        u7Var.addView(view, 0, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        view.setAlpha(0.0f);
        u7Var.setAlpha(0.0f);
        u7Var.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 13));
        View view2 = new View(activity);
        this.o1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.p1 = view3;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view3, i6Var);
        l7 l7Var = new l7(this, activity, 2);
        this.y1 = l7Var;
        v7 v7Var = new v7(this, activity);
        this.C1 = v7Var;
        l7Var.addView(v7Var, c8.na.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        w7 w7Var = new w7(this, activity, activity, i10);
        this.D1 = w7Var;
        l7Var.addView(w7Var, c8.na.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        w7 w7Var2 = new w7(this, activity, activity, i7);
        this.G1 = w7Var2;
        l7Var.addView(w7Var2, c8.na.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        x7 x7Var = new x7(this, activity, i6Var);
        this.N1 = x7Var;
        x7Var.setLineWidth(4);
        x7Var.setDelegate(new j6.r(this, 25));
        x7Var.setReportChanges(true);
        l7Var.addView(x7Var, c8.na.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        gVar.b(new i7(this, i10));
        this.i2 = gVar;
        u70 u70Var = new u70(activity);
        this.M1 = u70Var;
        u70Var.setVisibility(4);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Kj, u70Var, i6Var);
        u70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mj, this.J0));
        l7Var.addView(u70Var, c8.na.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.O1 = n5Var;
        n5Var.setTextSize(12);
        n5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.n6.Jj;
        org.telegram.ui.ActionBar.u6.X(n5Var, i13, i6Var);
        n5Var.setImportantForAccessibility(2);
        l7Var.addView(n5Var, c8.na.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.U1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i13, i6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        l7Var.addView(textView, c8.na.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.n6.w0(i13, this.J0), false, i6Var);
        this.P1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754804, null));
        q0Var.setDelegate(new x6(this, i10));
        ou0 ou0Var = new ou0();
        this.Q1 = ou0Var;
        q0Var.setIcon(ou0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), i6Var);
        this.R1 = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        u0Var.setDrawShadow(true);
        u0Var.setOnValueChange(new y6(this, i10));
        y0VarArr[0] = q0Var.e(0, R.drawable.msg_speed_slow, org.telegram.messenger.gd.N0(2131745025, null));
        y0VarArr[1] = q0Var.e(1, R.drawable.msg_speed_normal, org.telegram.messenger.gd.N0(2131745026, null));
        y0VarArr[2] = q0Var.e(2, R.drawable.msg_speed_medium, org.telegram.messenger.gd.N0(2131745027, null));
        y0VarArr[3] = q0Var.e(3, R.drawable.msg_speed_fast, org.telegram.messenger.gd.N0(2131745029, null));
        y0VarArr[4] = q0Var.e(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.gd.N0(2131745023, null));
        y0VarArr[5] = q0Var.e(5, R.drawable.msg_speed_superfast, org.telegram.messenger.gd.N0(2131745024, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        l7Var.addView(q0Var, c8.na.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new oi.i1(27, this, fArr));
        q0Var.setOnLongClickListener(new fi.z1(2, this, i6Var));
        b1(false);
        l7 l7Var2 = new l7(this, activity, i10);
        l7Var.addView(l7Var2, c8.na.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, i6Var);
        this.V1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(q0Var2, h02, null, M, i6Var);
        l7Var2.addView(q0Var2, c8.na.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z6
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i15 = i10;
                e8 e8Var = this.b;
                switch (i15) {
                    case 0:
                        e8Var.e1();
                        e8Var.V1.V(null, null);
                        break;
                    default:
                        p7 p7Var = e8Var.K1;
                        org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                        if (fjVar2 != null) {
                            char c10 = 1;
                            x60 H = x60.H(e8Var.c, e8Var.J0, view4, true);
                            x60 K0 = e8Var.K0(H, fjVar2);
                            if (!e8Var.P0()) {
                                H.l(R.drawable.msg_stories_save, org.telegram.messenger.gd.N0(2131753913, null), new bi.a6(H, K0, 8), !e8Var.t2);
                                if (!e8Var.t2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.k();
                            }
                            H.l(R.drawable.msg_forward, org.telegram.messenger.gd.N0(2131750570, null), new e7(e8Var, H, 0), !e8Var.t2);
                            H.l(R.drawable.msg_shareout, org.telegram.messenger.gd.N0(2131745263, null), new e7(e8Var, H, c10 == true ? 1 : 0), !e8Var.t2);
                            H.l(R.drawable.msg_message, org.telegram.messenger.gd.N0(2131745146, null), new e7(e8Var, H, 2), fjVar2.e1() > 0);
                            if (e8Var.L1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, H.e, H.d, false, false);
                                H.d(y0Var);
                                e8Var.J1 = y0Var;
                                y0Var.j(org.telegram.messenger.gd.N0(2131743342, null), R.drawable.menu_video_chromecast, null);
                                e8Var.J1.setOnClickListener(new oi.i1(28, e8Var, H));
                                org.telegram.messenger.g0.E2(p7Var);
                                e8Var.J1.addView(p7Var, 0, c8.na.c(-1.0f, -1));
                                e8Var.updateColors();
                            }
                            H.m(R.drawable.msg_delete, new e7(e8Var, H, 3), org.telegram.messenger.gd.N0(2131746449, null), e8Var.P0(), true);
                            H.Y(org.telegram.messenger.g0.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        this.W1 = q0Var2.e(3, R.drawable.player_new_repeatone, org.telegram.messenger.gd.N0(2131746077, null));
        this.X1 = q0Var2.e(4, R.drawable.player_new_repeatall, org.telegram.messenger.gd.N0(2131746080, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = q0Var2.e(2, R.drawable.player_new_shuffle, org.telegram.messenger.gd.N0(2131745126, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Z1 = q0Var2.e(1, R.drawable.player_new_order, org.telegram.messenger.gd.N0(2131745831, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new x6(this, i7));
        int i15 = org.telegram.ui.ActionBar.n6.Nj;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        n7 n7Var = new n7(this, activity, scaledTouchSlop);
        this.E1 = n7Var;
        viewArr[1] = n7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n7Var.setScaleType(scaleType);
        n7Var.f(R.raw.player_prev, 20, 20, null);
        n7Var.h(w02, "Triangle 3");
        n7Var.h(w02, "Triangle 4");
        n7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        n7Var.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(n7Var, h03, null, M2, i6Var);
        l7Var2.addView(n7Var, c8.na.e(48, 48, 51));
        n7Var.setContentDescription(org.telegram.messenger.gd.N0(2131754799, null));
        ImageView imageView = new ImageView(activity);
        this.a2 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ve0 ve0Var = new ve0(28);
        this.b2 = ve0Var;
        imageView.setImageDrawable(ve0Var);
        ve0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.u6.s(imageView, i15, i6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.u6.j(imageView, h04, null, M3, i6Var);
        l7Var2.addView(imageView, c8.na.e(48, 48, 51));
        imageView.setOnClickListener(new bi.o(14));
        o7 o7Var = new o7(this, activity, scaledTouchSlop);
        this.F1 = o7Var;
        viewArr[3] = o7Var;
        o7Var.setScaleType(scaleType);
        o7Var.f(R.raw.player_prev, 20, 20, null);
        o7Var.h(w02, "Triangle 3");
        o7Var.h(w02, "Triangle 4");
        o7Var.h(w02, "Rectangle 4");
        o7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i14);
        o7Var.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(o7Var, h05, null, M4, i6Var);
        l7Var2.addView(o7Var, c8.na.e(48, 48, 51));
        o7Var.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, i6Var);
        this.H1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(R.drawable.ic_ab_other, activity, i6Var);
        this.I1 = xqVar;
        q0Var3.setIcon(xqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        final int i16 = 1;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(q0Var3, h06, null, M5, i6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z6
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i152 = i16;
                e8 e8Var = this.b;
                switch (i152) {
                    case 0:
                        e8Var.e1();
                        e8Var.V1.V(null, null);
                        break;
                    default:
                        p7 p7Var = e8Var.K1;
                        org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                        if (fjVar2 != null) {
                            char c10 = 1;
                            x60 H = x60.H(e8Var.c, e8Var.J0, view4, true);
                            x60 K0 = e8Var.K0(H, fjVar2);
                            if (!e8Var.P0()) {
                                H.l(R.drawable.msg_stories_save, org.telegram.messenger.gd.N0(2131753913, null), new bi.a6(H, K0, 8), !e8Var.t2);
                                if (!e8Var.t2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.k();
                            }
                            H.l(R.drawable.msg_forward, org.telegram.messenger.gd.N0(2131750570, null), new e7(e8Var, H, 0), !e8Var.t2);
                            H.l(R.drawable.msg_shareout, org.telegram.messenger.gd.N0(2131745263, null), new e7(e8Var, H, c10 == true ? 1 : 0), !e8Var.t2);
                            H.l(R.drawable.msg_message, org.telegram.messenger.gd.N0(2131745146, null), new e7(e8Var, H, 2), fjVar2.e1() > 0);
                            if (e8Var.L1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, H.e, H.d, false, false);
                                H.d(y0Var);
                                e8Var.J1 = y0Var;
                                y0Var.j(org.telegram.messenger.gd.N0(2131743342, null), R.drawable.menu_video_chromecast, null);
                                e8Var.J1.setOnClickListener(new oi.i1(28, e8Var, H));
                                org.telegram.messenger.g0.E2(p7Var);
                                e8Var.J1.addView(p7Var, 0, c8.na.c(-1.0f, -1));
                                e8Var.updateColors();
                            }
                            H.m(R.drawable.msg_delete, new e7(e8Var, H, 3), org.telegram.messenger.gd.N0(2131746449, null), e8Var.P0(), true);
                            H.Y(org.telegram.messenger.g0.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        l7Var2.addView(q0Var3, c8.na.e(48, 48, 51));
        p7 p7Var = new p7(this, activity, 0);
        this.K1 = p7Var;
        this.L1 = true;
        try {
            p7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.L1 = false;
        }
        this.K1.setVisibility(4);
        org.telegram.ui.xq xqVar2 = this.I1;
        if (xqVar2 != null) {
            xqVar2.a(d1.f.u());
        }
        this.H1.setShowedFromBottom(true);
        this.H1.setDelegate(new x6(this, 2));
        this.H1.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.v1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, c8.na.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.W5, i6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.na.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.w1 = textView2;
        int i18 = org.telegram.ui.ActionBar.n6.X5;
        org.telegram.ui.ActionBar.u6.U(textView2, i18, i6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.gd.N0(2131748050, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.x1 = textView3;
        org.telegram.ui.ActionBar.u6.U(textView3, i18, i6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.na.t(-2, -2, 17, 0, 6, 0, 0));
        q7 q7Var = new q7(this, activity);
        this.s1 = q7Var;
        q7Var.setClipToPadding(false);
        getContext();
        v4.c0 c0Var = new v4.c0(1, false);
        this.t1 = c0Var;
        q7Var.setLayoutManager(c0Var);
        q7Var.setHorizontalScrollBarEnabled(false);
        q7Var.setVerticalScrollBarEnabled(false);
        this.b.addView(q7Var, c8.na.e(-1, -1, 51));
        d8 d8Var = new d8(this, activity);
        this.u1 = d8Var;
        q7Var.setAdapter(d8Var);
        org.telegram.ui.ActionBar.u6.l(q7Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        q7Var.setOnItemClickListener(new bi.a(2));
        q7Var.setOnItemLongClickListener(new x6(this, 3));
        q7Var.setOnScrollListener(new bi.v1(this, 29));
        hi.e eVar = new hi.e(activity, i6Var, true);
        eVar.setRoundRadius(24);
        this.z1 = eVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final int i19 = 0;
        spannableStringBuilder.setSpan(new kq(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131753922, null));
        eVar.setText(spannableStringBuilder);
        eVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k7
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i20 = i19;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                e8 e8Var = this.b;
                switch (i20) {
                    case 0:
                        org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                        if (fjVar2 != null && e8Var.A2 != null) {
                            e8Var.S0(fjVar2, true, new org.telegram.messenger.j2(26), false);
                            e8Var.V0(true);
                            org.telegram.messenger.f3.n(null, 2131753909, new kc((FrameLayout) e8Var.b, i6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.fj fjVar3 = MediaController.B().v0;
                        if (fjVar3 != null && e8Var.A2 != null) {
                            e8Var.S0(fjVar3, false, new org.telegram.messenger.j2(26), false);
                            e8Var.V0(false);
                            org.telegram.messenger.f3.n(null, 2131753908, new kc((FrameLayout) e8Var.b, i6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.y1.addView(eVar, c8.na.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i20 = 1;
        hi.e eVar2 = new hi.e(activity, i6Var, true);
        eVar2.setRoundRadius(24);
        eVar2.e();
        this.A1 = eVar2;
        eVar2.setText(org.telegram.messenger.gd.N0(2131753914, null));
        eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k7
            public final /* synthetic */ e8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i202 = i20;
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                e8 e8Var = this.b;
                switch (i202) {
                    case 0:
                        org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                        if (fjVar2 != null && e8Var.A2 != null) {
                            e8Var.S0(fjVar2, true, new org.telegram.messenger.j2(26), false);
                            e8Var.V0(true);
                            org.telegram.messenger.f3.n(null, 2131753909, new kc((FrameLayout) e8Var.b, i6Var2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        org.telegram.messenger.fj fjVar3 = MediaController.B().v0;
                        if (fjVar3 != null && e8Var.A2 != null) {
                            e8Var.S0(fjVar3, false, new org.telegram.messenger.j2(26), false);
                            e8Var.V0(false);
                            org.telegram.messenger.f3.n(null, 2131753908, new kc((FrameLayout) e8Var.b, i6Var2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.y1.addView(eVar2, c8.na.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.gp gpVar = MediaController.B().R0;
        this.q2 = gpVar;
        boolean z10 = gpVar != null;
        this.o2 = z10;
        this.n1.n0 = z10;
        this.p2 = P0();
        this.r2 = MediaController.B().S0;
        if (P0()) {
            yVar = s5;
            this.e2 = yVar.a(8, R.drawable.msg_add);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.q0 a10 = yVar.a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.x1(this, 6);
        this.f2 = a10;
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        int i21 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(searchField, i21, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Jj, i6Var);
        org.telegram.ui.ActionBar.u6.l(searchField, 30, i21, i6Var);
        if (z10) {
            q7Var.r1();
            v0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var));
            this.n1.setAlpha(1.0f);
            this.m1.setAlpha(0.0f);
            org.telegram.ui.Cells.g2 g2Var = this.M2;
            u7 u7Var2 = this.n1;
            Float valueOf = Float.valueOf(0.0f);
            g2Var.getClass();
            g2Var.a(u7Var2, valueOf);
        }
        boolean z11 = this.r2.size() > 1;
        d8Var.h = z11;
        if (z11) {
            q7Var.setVisibility(0);
            q7Var.setTranslationY(0.0f);
        } else {
            q7Var.setVisibility(8);
            q7Var.setTranslationY(org.telegram.messenger.g0.q.y);
        }
        d8Var.f();
        this.n1.setTitle(org.telegram.messenger.gd.N0(2131753949, null));
        org.telegram.messenger.gp gpVar2 = this.q2;
        if (gpVar2 != null) {
            if (gpVar2.b == org.telegram.messenger.i10.i(this.a).e()) {
                this.n1.setTitle(org.telegram.messenger.gd.N0(2131746447, null));
            } else {
                this.n1.setTitle(org.telegram.messenger.gd.a0(null, null, 2131746448, org.telegram.messenger.n5.t(this.q2.b)));
            }
        } else if (fjVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.fj.B0(fjVar.k);
            if (org.telegram.messenger.n5.C(B0)) {
                TLRPC.EncryptedChat c12 = org.telegram.messenger.mp.u1(this.a).c1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (c12 != null && (c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(c12.user_id))) != null) {
                    this.n1.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                }
            } else if (B0 == org.telegram.messenger.i10.i(this.a).e()) {
                if (fjVar.P1() == 2666000) {
                    this.n1.setTitle(org.telegram.messenger.gd.N0(2131754249, null));
                } else {
                    this.n1.setTitle(org.telegram.messenger.gd.N0(2131745705, null));
                }
            } else if (org.telegram.messenger.n5.E(B0)) {
                TLRPC.User c23 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(B0));
                if (c23 != null) {
                    this.n1.setTitle(org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name));
                }
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-B0));
                if (O0 != null) {
                    this.n1.setTitle(O0.title);
                }
            }
        }
        if (P0()) {
            eVar.setVisibility(8);
            eVar2.setVisibility(8);
            v4.z zVar = new v4.z(new gi.c(this, 3));
            this.B1 = zVar;
            zVar.h(q7Var);
        }
        this.b.addView(this.y1, c8.na.e(-1, ((P0() || this.t2) ? 0 : 52) + org.telegram.messenger.ks.J2, 83));
        this.b.addView(this.p1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        ((FrameLayout.LayoutParams) this.y1.getLayoutParams()).height = org.telegram.messenger.g0.L(((P0() || this.t2) ? 0 : 52) + org.telegram.messenger.ks.J2);
        ((FrameLayout.LayoutParams) this.p1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.ks.J2 + ((P0() || this.t2) ? 0 : 52));
        this.b.addView(this.o1, c8.na.c(3.0f, -1));
        this.b.addView(this.n1);
        l7 l7Var3 = new l7(this, activity, 1);
        this.c2 = l7Var3;
        l7Var3.setAlpha(0.0f);
        l7Var3.setVisibility(4);
        this.c.addView(l7Var3);
        p9 p9Var = new p9(activity);
        this.d2 = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        p9Var.setScaleX(0.9f);
        p9Var.setScaleY(0.9f);
        l7Var3.addView(p9Var, c8.na.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        g1(false);
        d1();
        if (this.r1 && d8Var.b() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        a1();
    }

    public static void J0(e8 e8Var) {
        View view = e8Var.o1;
        u7 u7Var = e8Var.n1;
        q7 q7Var = e8Var.s1;
        if (q7Var.getChildCount() <= 0) {
            int paddingTop = q7Var.getPaddingTop();
            e8Var.u2 = paddingTop;
            q7Var.setTopGlowOffset(paddingTop);
            e8Var.b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = q7Var.getChildAt(0);
        mj0 mj0Var = (mj0) q7Var.G(childAt);
        int top = childAt instanceof org.telegram.ui.Cells.w ? childAt.getTop() : childAt.getBottom();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        boolean z11 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z11 && u7Var.getTag() == null) || (!z11 && u7Var.getTag() != null)) {
            u7Var.setTag(z11 ? 1 : null);
            AnimatorSet animatorSet = e8Var.w2;
            if (animatorSet != null) {
                animatorSet.cancel();
                e8Var.w2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            e8Var.w2 = animatorSet2;
            int i7 = 2;
            if (e8Var.o2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u7Var, e8Var.M2, z11 ? 1.0f : 0.0f);
                View view2 = e8Var.m1;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(u7Var, (Property<u7, Float>) property2, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z11 ? 1.0f : 0.0f));
            }
            e8Var.w2.setDuration(320L);
            e8Var.w2.setInterpolator(kr.h);
            e8Var.w2.addListener(new s7(e8Var, i7));
            e8Var.w2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q7Var.getLayoutParams();
        int i10 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.m, top);
        if (e8Var.u2 != i10) {
            e8Var.u2 = i10;
            q7Var.setTopGlowOffset((i10 - layoutParams.topMargin) - org.telegram.messenger.g0.m);
            e8Var.b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        float min = e8Var.t0 + ((int) (q7Var.getTranslationY() + ((e8Var.u2 - e8Var.t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) - e8Var.t0) / (org.telegram.messenger.g0.L(4.0f) + L2)) : 1.0f;
        e8Var.H2 = min;
        if (min <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, e8Var.J0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != e8Var.G2) {
            e8Var.G2 = z10;
            org.telegram.messenger.g0.p3(e8Var, z10);
        }
    }

    public static boolean M0(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static org.telegram.messenger.fc O0(org.telegram.messenger.fj fjVar) {
        TLRPC.Document F0 = fjVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w10 instanceof TLRPC.TL_photoSize) && !(w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            w10 = null;
        }
        if (w10 != null) {
            return org.telegram.messenger.fc.c(w10, F0);
        }
        String u02 = fjVar.u0(true);
        if (u02 != null) {
            return org.telegram.messenger.fc.g(u02);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Lj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ze));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    public final x60 K0(x60 x60Var, org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.fp J1 = org.telegram.messenger.mp.u1(this.a).J1();
        TLRPC.Document F0 = fjVar.F0();
        long j3 = F0 != null ? F0.id : 0L;
        x60 K = x60Var.K();
        K.c(R.drawable.ic_ab_back, org.telegram.messenger.gd.N0(2131753753, null), new org.telegram.ui.hq0(x60Var, 27), false);
        K.k();
        K.l(R.drawable.left_status_profile, org.telegram.messenger.gd.N0(2131753910, null), new d7(this, fjVar, x60Var, 6), !J1.b.contains(Long.valueOf(j3)));
        K.c(R.drawable.msg_saved, org.telegram.messenger.gd.N0(2131753907, null), new d7(this, fjVar, x60Var, 7), false);
        K.c(R.drawable.menu_download_round, org.telegram.messenger.gd.N0(2131753911, null), new d7(this, fjVar, x60Var, 8), false);
        K.k();
        K.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.gd.N0(2131753912, null));
        return K;
    }

    public final void L0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        int w02 = org.telegram.ui.ActionBar.n6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nj, this.J0);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, this.J0);
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
            org.telegram.ui.ActionBar.n6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.n6.H1(q0Var2.getBackground(), w04, true);
        }
        this.P2 = true;
        this.M1.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mj, this.J0));
        e1();
        int i7 = org.telegram.ui.ActionBar.n6.G8;
        q0Var.I(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        q0Var2.P(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), false);
        q0Var2.P(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), true);
        q0Var2.I(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
    }

    public final void N0(org.telegram.messenger.fj fjVar) {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        int i10 = org.telegram.messenger.i10.t0;
        int i11 = this.a;
        LaunchActivity launchActivity = this.A2;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
        l10.putBoolean("canSelectTopics", true);
        org.telegram.ui.bx bxVar = new org.telegram.ui.bx(l10);
        if (fjVar.e1() >= 0) {
            i7 = org.telegram.messenger.f3.i(fjVar);
            tL_document = null;
        } else {
            if (!(fjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) fjVar.F0();
            i7 = null;
        }
        bxVar.E2 = new a1.d(this, i7, tL_document, fjVar, 9);
        launchActivity.t0(bxVar);
        dismiss();
    }

    public final boolean P0() {
        org.telegram.messenger.gp gpVar = this.q2;
        return gpVar != null && gpVar.b == org.telegram.messenger.i10.i(this.a).e();
    }

    public final void Q0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.fj fjVar = MediaController.B().v0;
        if (fjVar == null || (launchActivity = this.A2) == null) {
            return;
        }
        if (i7 == 1) {
            N0(fjVar);
            return;
        }
        if (i7 == 2) {
            W0(fjVar);
            return;
        }
        if (i7 != 4) {
            if (i7 == 5) {
                R0(fjVar);
                return;
            }
            if (i7 == 6) {
                wf.b.I().Q(MediaController.B().z());
                this.K1.performClick();
                return;
            } else {
                if (i7 == 7) {
                    S0(fjVar, false, new a7(this, fjVar, 0), false);
                    return;
                }
                if (i7 == 8) {
                    hi.e7 e7Var = new hi.e7(getContext(), true, null, new c7(this, 0), null);
                    e7Var.d2 = true;
                    e7Var.V1 = false;
                    e7Var.l2.O(true);
                    e7Var.show();
                    return;
                }
                return;
            }
        }
        int i10 = org.telegram.messenger.i10.t0;
        int i11 = this.a;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        if (org.telegram.messenger.n5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        org.telegram.messenger.ks.f(this.a).k(org.telegram.messenger.ks.t, new Object[0]);
        launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
        dismiss();
    }

    public final void R0(org.telegram.messenger.fj fjVar) {
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) {
            LaunchActivity launchActivity = this.A2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(fjVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = fjVar.S0();
        }
        String str = B;
        String str2 = fjVar.k.attachPath;
        if (str2 != null && str2.length() > 0 && !a8.p0.B(str2)) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            org.telegram.messenger.w7.G(this.a);
            str2 = org.telegram.messenger.w7.M(fjVar.k, false, true).toString();
        }
        MediaController.d0(str2, this.A2, 3, str, fjVar.F0() != null ? fjVar.F0().mime_type : "", new c7(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int S() {
        l7 l7Var = this.y1;
        if (l7Var == null) {
            return 0;
        }
        if (this.r2.size() <= 1) {
            return l7Var.getMeasuredHeight() + this.t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.s1.getTranslationY() + ((this.u2 - this.t0) - L));
        if (this.t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.m);
    }

    public final void S0(org.telegram.messenger.fj fjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = fjVar.F0();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new f7(this, z11, fjVar, z10, runnable, j3, F0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T0(boolean z10) {
        org.telegram.messenger.fj fjVar = MediaController.B().v0;
        if (fjVar != null) {
            if (z10) {
                q7 q7Var = this.s1;
                int childCount = q7Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = q7Var.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.Cells.w) || ((org.telegram.ui.Cells.w) childAt).getMessageObject() != fjVar) {
                        i7++;
                    }
                }
            }
            int indexOf = this.r2.indexOf(fjVar);
            if (this.p2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z11 = org.telegram.messenger.bz.O0;
                v4.c0 c0Var = this.t1;
                if (z11) {
                    c0Var.n0(indexOf);
                    return true;
                }
                c0Var.n0(this.r2.size() - indexOf);
                return true;
            }
        }
        return false;
    }

    public final void U0(org.telegram.ui.ActionBar.y0 y0Var, boolean z10) {
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.n6.Oj;
            y0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        } else {
            int i10 = org.telegram.ui.ActionBar.n6.E8;
            y0Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 0);
        int i7 = org.telegram.ui.ActionBar.n6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.Jj;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.M1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mj));
        int i11 = org.telegram.ui.ActionBar.n6.w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.x7));
        int i12 = org.telegram.ui.ActionBar.n6.Nj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.V1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.Oj));
        int i13 = org.telegram.ui.ActionBar.n6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i13));
        int i14 = org.telegram.ui.ActionBar.n6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.H1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i14));
        n7 n7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(n7Var, new nh0[]{n7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(n7Var, new nh0[]{n7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(n7Var, new nh0[]{n7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.n6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a2, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i15));
        o7 o7Var = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(o7Var, new nh0[]{o7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(o7Var, new nh0[]{o7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(o7Var, new nh0[]{o7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.F1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i15));
        int i16 = org.telegram.ui.ActionBar.n6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.x1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.M1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.M1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        w7 w7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(w7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(w7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        w7 w7Var2 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(w7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(w7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        return arrayList;
    }

    public final void V0(final boolean z10) {
        boolean P0 = P0();
        hi.e eVar = this.A1;
        hi.e eVar2 = this.z1;
        if (P0 || this.t2) {
            eVar2.setVisibility(8);
            eVar.setVisibility(8);
            return;
        }
        eVar2.setVisibility(0);
        eVar.setVisibility(0);
        ViewPropertyAnimator duration = eVar2.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f).setDuration(420L);
        kr krVar = kr.h;
        final int i7 = 0;
        duration.setInterpolator(krVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.b7
            public final /* synthetic */ e8 b;

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
        eVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(!z10 ? 0.8f : 1.0f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(krVar).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.b7
            public final /* synthetic */ e8 b;

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

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(org.telegram.messenger.fj fjVar) {
        File file;
        try {
            if (!TextUtils.isEmpty(fjVar.k.attachPath)) {
                file = new File(fjVar.k.attachPath);
            }
            file = null;
            if (file == null) {
                org.telegram.messenger.w7.G(this.a);
                file = org.telegram.messenger.w7.M(fjVar.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.A2);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131747024, null);
                alertDialog$Builder.p();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(fjVar.t1());
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
            this.A2.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.N0(2131745263, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void X0(boolean z10, boolean z11) {
        p9 p9Var = this.d2;
        l7 l7Var = this.c2;
        if (z10) {
            if (l7Var.getVisibility() == 0 || this.g2) {
                return;
            }
            l7Var.setTag(1);
            v7 v7Var = this.C1;
            p9Var.setImageBitmap(v7Var.a[v7Var.b].getImageReceiver().n());
            this.g2 = true;
            yk0.d(new y6(this, 1));
            l7Var.setVisibility(0);
            l7Var.animate().alpha(1.0f).setDuration(180L).setListener(new s7(this, 0)).start();
            p9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (l7Var.getVisibility() != 0) {
            return;
        }
        l7Var.setTag(null);
        if (z11) {
            this.g2 = true;
            l7Var.animate().alpha(0.0f).setDuration(180L).setListener(new s7(this, 1)).start();
            p9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            l7Var.setAlpha(0.0f);
            l7Var.setVisibility(4);
            p9Var.setImageBitmap(null);
            p9Var.setScaleX(0.9f);
            p9Var.setScaleY(0.9f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.fj fjVar) {
        int i7 = 1;
        x60 H = x60.H(this.c, this.J0, wVar, true);
        Object[] objArr = 0;
        if (P0()) {
            H.l(R.drawable.msg_forward, org.telegram.messenger.gd.N0(2131750570, null), new d7(this, H, fjVar, (int) (objArr == true ? 1 : 0)), !this.t2);
            H.l(R.drawable.msg_shareout, org.telegram.messenger.gd.N0(2131745263, null), new d7(this, H, fjVar, i7), !this.t2);
            H.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751586, null), new d7(this, fjVar, H, 2), true);
        } else {
            H.l(R.drawable.msg_stories_save, org.telegram.messenger.gd.N0(2131753913, null), new bi.a6(H, K0(H, fjVar), 7), !this.t2);
            if (!this.t2 && H.z() != null) {
                H.z().setRightIcon(R.drawable.msg_arrowright);
            }
            H.k();
            H.l(R.drawable.msg_forward, org.telegram.messenger.gd.N0(2131750570, null), new d7(this, H, fjVar, r1), !this.t2);
            H.l(R.drawable.msg_share, org.telegram.messenger.gd.N0(2131745263, null), new d7(this, H, fjVar, 4), !this.t2);
            H.l(R.drawable.msg_view_file, org.telegram.messenger.gd.N0(2131745146, null), new a7(this, fjVar, i7), fjVar.e1() > 0);
        }
        H.W(org.telegram.messenger.gd.a0 ? 3 : 5);
        H.a0();
    }

    public final void Z0() {
        if (this.B2 == 1) {
            this.E2 = System.currentTimeMillis();
            this.C2 = MediaController.B().v0.b0;
            i6.g gVar = this.I2;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.g3(gVar);
        }
    }

    public final void a1() {
        LinearLayout linearLayout = this.v1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.y1.getVisibility() == 0 ? org.telegram.messenger.g0.L(150.0f) : -org.telegram.messenger.g0.L(30.0f))) / 2);
    }

    public final void b1(boolean z10) {
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
            org.telegram.ui.ActionBar.y0[] y0VarArr = this.T1;
            if (i7 >= y0VarArr.length) {
                return;
            }
            if (z11 || !M0(f10, U2[i7])) {
                org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.n6.E8;
                y0Var.d(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
            } else {
                org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.n6.Hi;
                y0Var2.d(org.telegram.ui.ActionBar.n6.w0(i11, this.J0), org.telegram.ui.ActionBar.n6.w0(i11, this.J0));
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
    public final void c1(org.telegram.messenger.fj fjVar, boolean z10) {
        boolean z11;
        float f10;
        int i7;
        x7 x7Var = this.N1;
        if (x7Var != null) {
            if (x7Var.x) {
                i7 = (int) (fjVar.L0() * x7Var.getProgress());
            } else {
                if (this.C2 >= 0.0f) {
                    int i10 = this.B2;
                    z11 = true;
                    if (i10 != -1) {
                        if (i10 == 1) {
                        }
                    }
                    if (z11) {
                        x7Var.e(z10, fjVar.b0);
                    } else {
                        x7Var.e(z10, this.C2);
                    }
                    f10 = 1.0f;
                    if (!this.k2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.j2) >= 500) {
                            if (MediaController.B().m0) {
                                f10 = org.telegram.messenger.w7.G(this.a).t(this.v2, fjVar.b0);
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
                        i7 = fjVar.i0;
                    } else {
                        i7 = (int) (fjVar.L0() * x7Var.getProgress());
                        fjVar.i0 = i7;
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
            x7Var.g(fjVar);
        }
    }

    public final void d1() {
        int i7 = org.telegram.messenger.bz.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                q0Var.setIcon(R.drawable.player_new_repeatone);
                int i10 = org.telegram.ui.ActionBar.n6.Oj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.n6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.n6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754784, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.bz.N0) {
            if (i7 == 0) {
                q0Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                q0Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!org.telegram.messenger.bz.O0) {
            q0Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i7 == 0) {
            q0Var.setIcon(R.drawable.player_new_order);
        } else {
            q0Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i7 == 0 && !org.telegram.messenger.bz.N0 && !org.telegram.messenger.bz.O0) {
            int i11 = org.telegram.ui.ActionBar.n6.Nj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.n6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754785, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.n6.Oj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.n6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.n6.w0(i12, this.J0), true);
        if (i7 != 0) {
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754786, null));
        } else if (org.telegram.messenger.bz.N0) {
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131745126, null));
        } else {
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131745831, null));
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.fj messageObject2;
        org.telegram.messenger.fj fjVar;
        int i11 = org.telegram.messenger.ks.h2;
        int i12 = org.telegram.messenger.ks.f2;
        int i13 = org.telegram.messenger.ks.g2;
        q7 q7Var = this.s1;
        if (i7 == i11 || i7 == i13 || i7 == i12) {
            g1(i7 == i12 && ((Boolean) objArr[1]).booleanValue());
            if (i7 == i12 || i7 == i13) {
                int childCount = q7Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = q7Var.getChildAt(i14);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.fj.R4(messageObject.k) || messageObject.I3())) {
                        wVar.b(false, true);
                    }
                }
                if (i7 == i13 && MediaController.B().v0 != null) {
                    if (MediaController.B().H()) {
                        Z0();
                    } else if (this.B2 == 1 && this.C2 != -1.0f) {
                        i6.g gVar = this.I2;
                        org.telegram.messenger.g0.r(gVar);
                        this.F2 = 0L;
                        gVar.run();
                        this.C2 = -1.0f;
                    }
                }
            } else {
                if (((org.telegram.messenger.fj) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = q7Var.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = q7Var.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.fj.R4(messageObject2.k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            }
            org.telegram.ui.xq xqVar = this.I1;
            if (xqVar != null) {
                xqVar.a(d1.f.u());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.e2) {
            org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
            if (fjVar2 == null || !fjVar2.I3()) {
                return;
            }
            c1(fjVar2, false);
            return;
        }
        if (i7 == org.telegram.messenger.ks.M4) {
            b1(true);
            return;
        }
        int i16 = org.telegram.messenger.ks.K0;
        d8 d8Var = this.u1;
        if (i7 == i16) {
            this.q2 = MediaController.B().R0;
            this.r2 = MediaController.B().S0;
            d8Var.f();
            return;
        }
        if (i7 == org.telegram.messenger.ks.L0) {
            this.q2 = MediaController.B().R0;
            this.r2 = MediaController.B().S0;
            d8Var.f();
            if (org.telegram.messenger.bz.O0) {
                q7Var.C0();
                int intValue = ((Integer) objArr[0]).intValue();
                v4.c0 c0Var = this.t1;
                c0Var.L0();
                int N0 = c0Var.N0();
                if (N0 != -1) {
                    View m10 = c0Var.m(N0);
                    c0Var.h1(N0 + intValue, m10 != null ? m10.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.Y1) {
            if (((String) objArr[0]).equals(this.v2)) {
                g1(false);
                this.k2 = true;
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.X1) {
            if (i7 == org.telegram.messenger.ks.X3) {
                g1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.v2) || (fjVar = MediaController.B().v0) == null) {
            return;
        }
        if (!this.k2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.j2) >= 500) {
                r13 = MediaController.B().m0 ? org.telegram.messenger.w7.G(this.a).t(this.v2, fjVar.b0) : 1.0f;
                this.j2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            r1.g gVar2 = this.i2;
            gVar2.m.i = r13 * 1000.0f;
            gVar2.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.X1);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.K0);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.L0);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.X3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.M4);
        org.telegram.messenger.a6.q(this.a).v(this);
        if (T2 == this) {
            T2 = null;
        }
    }

    public final void e1() {
        U0(this.Y1, org.telegram.messenger.bz.N0);
        U0(this.Z1, org.telegram.messenger.bz.O0);
        U0(this.X1, org.telegram.messenger.bz.S0 == 1);
        U0(this.W1, org.telegram.messenger.bz.S0 == 2);
    }

    public final void f1() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(this.o2 ? org.telegram.ui.ActionBar.n6.a7 : org.telegram.ui.ActionBar.n6.h5, this.J0);
        if (w02 != this.O2) {
            this.O2 = w02;
            v0(w02);
        }
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nj, this.J0);
        n7 n7Var = this.E1;
        if (n7Var != null) {
            n7Var.h(w03, "Triangle 3");
            n7Var.h(w03, "Triangle 4");
            n7Var.h(w03, "Rectangle 4");
        }
        o7 o7Var = this.F1;
        if (o7Var != null) {
            o7Var.h(w03, "Triangle 3");
            o7Var.h(w03, "Triangle 4");
            o7Var.h(w03, "Rectangle 4");
        }
        x7 x7Var = this.N1;
        if (x7Var != null) {
            x7Var.setOuterColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            float f10 = MediaController.B().r0;
            int w04 = org.telegram.ui.ActionBar.n6.w0(!M0(f10, 1.0f) ? org.telegram.ui.ActionBar.n6.Hi : org.telegram.ui.ActionBar.n6.x7, this.J0);
            ou0 ou0Var = this.Q1;
            if (ou0Var != null) {
                ou0Var.a.u(w04);
                Paint paint = ou0Var.b;
                if (paint != null) {
                    paint.setColor(w04);
                }
            }
            org.telegram.ui.ActionBar.n6.H1(q0Var.getBackground(), w04 & 436207615, true);
            int i7 = 0;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.T1;
                if (i7 >= y0VarArr.length) {
                    break;
                }
                if (y0VarArr[i7] != null) {
                    int w05 = org.telegram.ui.ActionBar.n6.w0(M0(f10, U2[i7]) ? org.telegram.ui.ActionBar.n6.Hi : org.telegram.ui.ActionBar.n6.E8, this.J0);
                    y0VarArr[i7].d(w05, w05);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.J1;
        if (y0Var != null) {
            p7 p7Var = this.K1;
            if (p7Var != null && p7Var.b()) {
                z10 = true;
            }
            int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.J0);
            int w07 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.n6.Fi;
            y0Var.e(w06, w07, org.telegram.ui.ActionBar.n6.w0(i10, this.J0), z10);
            this.J1.setSelectorColor((p7Var == null || !p7Var.b()) ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, this.J0) : org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, this.J0)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
    
        if (r2.exists() == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(boolean z10) {
        File file;
        boolean z11;
        boolean z12;
        boolean z13;
        p9 p9Var;
        ImageView imageView;
        int i7;
        String str;
        boolean z14;
        Bitmap bitmap;
        org.telegram.messenger.fj fjVar = MediaController.B().v0;
        if ((fjVar == null && z10) || (fjVar != null && !fjVar.I3())) {
            dismiss();
            return;
        }
        if (fjVar == null) {
            this.s2 = null;
            return;
        }
        boolean z15 = fjVar == this.s2;
        this.s2 = fjVar;
        long j3 = fjVar.T;
        org.telegram.ui.ActionBar.q0 q0Var = this.H1;
        if (j3 != 0 || fjVar.e1() <= -2000000000) {
            q0Var.setVisibility(4);
        } else {
            q0Var.setVisibility(0);
        }
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        long j10 = fjVar.F0() != null ? fjVar.F0().id : 0L;
        boolean z16 = (B0 < 0 && org.telegram.messenger.mp.u1(this.a).G2(B0)) || org.telegram.messenger.mp.u1(this.a).G2(org.telegram.messenger.fj.B0(fjVar.k)) || fjVar.k.noforwards;
        if (z16 != this.t2) {
            this.t2 = z16;
            l7 l7Var = this.y1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l7Var.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(((z16 || P0()) ? 0 : 52) + org.telegram.messenger.ks.J2);
            l7Var.setLayoutParams(layoutParams);
            View view = this.p1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(org.telegram.messenger.ks.J2 + ((P0() || z16) ? 0 : 52));
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
        String str2 = fjVar.k.attachPath;
        if (str2 != null && str2.length() > 0) {
            file = new File(fjVar.k.attachPath);
        }
        file = null;
        if (file == null) {
            org.telegram.messenger.w7.G(this.a);
            file = org.telegram.messenger.w7.M(fjVar.k, false, true);
        }
        boolean z17 = org.telegram.messenger.bz.B0 && ((int) org.telegram.messenger.fj.B0(fjVar.k)) != 0 && fjVar.I3();
        boolean exists = file.exists();
        ImageView imageView2 = this.a2;
        x7 x7Var = this.N1;
        u70 u70Var = this.M1;
        if (exists || z17) {
            org.telegram.messenger.a6.q(this.a).v(this);
            u70Var.setVisibility(4);
            x7Var.setVisibility(0);
            imageView2.setEnabled(true);
        } else {
            String S0 = fjVar.S0();
            org.telegram.messenger.a6.q(this.a).a(S0, null, this);
            Float w10 = org.telegram.messenger.ec.D().w(S0);
            u70Var.a(false, w10 != null ? w10.floatValue() : 0.0f);
            u70Var.setVisibility(0);
            x7Var.setVisibility(4);
            imageView2.setEnabled(false);
        }
        c1(fjVar, !z15);
        v7 v7Var = this.C1;
        p9 p9Var2 = z15 ? v7Var.a[v7Var.b] : v7Var.a[v7Var.b == 0 ? (char) 1 : (char) 0];
        rf.a aVar = MediaController.B().E0;
        if (z15) {
            z11 = true;
            z12 = false;
            z13 = z15;
        } else {
            AnimatorSet animatorSet = v7Var.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            v7Var.c = new AnimatorSet();
            int i10 = v7Var.b == 0 ? 1 : 0;
            v7Var.b = i10;
            z11 = true;
            p9[] p9VarArr = v7Var.a;
            p9 p9Var3 = p9VarArr[i10 ^ 1];
            p9 p9Var4 = p9VarArr[i10];
            boolean J = p9Var3.getImageReceiver().J();
            p9Var4.setAlpha(J ? 1.0f : 0.0f);
            p9Var4.setScaleX(0.8f);
            p9Var4.setScaleY(0.8f);
            p9Var4.setVisibility(0);
            if (J) {
                p9Var3.bringToFront();
            } else {
                p9Var3.setVisibility(8);
                p9Var3.setImageDrawable(null);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            z12 = false;
            z13 = z15;
            ofFloat.setDuration(125L);
            ofFloat.setInterpolator(kr.g);
            ofFloat.addUpdateListener(new ch.v(5, p9Var4, J));
            if (J) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(p9Var3.getScaleX(), 0.8f);
                ofFloat2.setDuration(125L);
                ofFloat2.setInterpolator(kr.i);
                ofFloat2.addUpdateListener(new ch.w(11, p9Var3, p9Var4));
                ofFloat2.addListener(new x(p9Var3, 4));
                v7Var.c.playSequentially(ofFloat2, ofFloat);
            } else {
                v7Var.c.play(ofFloat);
            }
            v7Var.c.start();
        }
        if (aVar == null || (bitmap = aVar.o) == null) {
            this.v2 = org.telegram.messenger.w7.r(null, fjVar.F0());
            boolean z18 = z12;
            this.k2 = z18;
            String u02 = fjVar.u0(z18);
            org.telegram.messenger.fc O0 = O0(fjVar);
            if (TextUtils.isEmpty(u02)) {
                p9Var = p9Var2;
                imageView = imageView2;
                i7 = 8;
                if (O0 != null) {
                    p9Var.g(1, 0L, fjVar, null, null, null, null, O0);
                } else {
                    str = null;
                    p9Var.setImageDrawable(null);
                    p9Var.invalidate();
                }
            } else {
                org.telegram.messenger.fc g10 = org.telegram.messenger.fc.g(u02);
                p9Var = p9Var2;
                imageView = imageView2;
                i7 = 8;
                p9Var.g(1, 0L, fjVar, null, null, null, g10, O0);
            }
            str = null;
            p9Var.invalidate();
        } else {
            p9Var2.setImageBitmap(bitmap);
            this.v2 = null;
            this.k2 = z11;
            str = null;
            imageView = imageView2;
            i7 = 8;
        }
        boolean H = MediaController.B().H();
        ve0 ve0Var = this.b2;
        if (H) {
            z14 = true;
            ve0Var.a(false, true);
            imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754929, str));
        } else {
            z14 = true;
            ve0Var.a(true, true);
            imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754930, str));
        }
        String y12 = fjVar.y1(z14);
        String w12 = fjVar.w1(z14);
        this.D1.setText(y12);
        this.G1.setText(w12);
        org.telegram.messenger.fp J1 = org.telegram.messenger.mp.u1(this.a).J1();
        this.z1.setLoading(J1.c);
        V0(J1.b.contains(Long.valueOf(j10)));
        int L0 = (int) fjVar.L0();
        this.y2 = L0;
        TextView textView = this.U1;
        if (textView != null) {
            textView.setText(L0 != 0 ? org.telegram.messenger.g0.g0(L0, false, false) : "-:--");
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.P1;
        if (L0 > 600) {
            q0Var2.setVisibility(0);
        } else {
            q0Var2.setVisibility(i7);
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
        int i11 = B.V0;
        int i12 = i11 + 1;
        int i13 = i11 - 1;
        if (i12 >= arrayList.size()) {
            i12 = 0;
        }
        if (i12 <= -1) {
            i12 = arrayList.size() - 1;
        }
        if (i13 <= -1) {
            i13 = arrayList.size() - 1;
        }
        if (i13 >= arrayList.size()) {
            i13 = 0;
        }
        arrayList2.add((org.telegram.messenger.fj) arrayList.get(i12));
        if (i12 != i13) {
            arrayList2.add((org.telegram.messenger.fj) arrayList.get(i13));
        }
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i14);
            org.telegram.messenger.fc O02 = O0(fjVar2);
            if (O02 != null) {
                if (O02.g != null) {
                    org.telegram.messenger.ec D = org.telegram.messenger.ec.D();
                    D.s.c(new org.telegram.messenger.gb(D, O02.g, 3));
                } else {
                    org.telegram.messenger.w7.G(this.a).V(O02, fjVar2, null, 0, 1);
                }
            }
        }
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.z2;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.M1.a(true, Math.min(1.0f, j3 / j10));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        l7 l7Var = this.c2;
        if (view != l7Var) {
            return false;
        }
        l7Var.layout(0, 0, l7Var.getMeasuredWidth(), l7Var.getMeasuredHeight());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean l0(View view, int i7, int i10) {
        l7 l7Var = this.c2;
        if (view != l7Var) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        l7Var.measure(View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        u7 u7Var = this.n1;
        if (u7Var != null && u7Var.o0) {
            u7Var.n(true);
        } else if (this.c2.getTag() != null) {
            X0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            if (this.f2 != null && this.V1 != null && this.H1 != null && this.M1 != null) {
                L0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            f1();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            float f10 = this.H2;
            if (f10 >= 0.0f) {
                boolean z10 = f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0)) > 0.699999988079071d;
                if (z10 != this.G2) {
                    this.G2 = z10;
                    org.telegram.messenger.g0.p3(this, z10);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        T2 = this;
    }

    public final void updateColors() {
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(!M0(MediaController.B().r0, 1.0f) ? org.telegram.ui.ActionBar.n6.Hi : org.telegram.ui.ActionBar.n6.x7, this.J0);
            ou0 ou0Var = this.Q1;
            if (ou0Var != null) {
                ou0Var.a.u(w02);
                Paint paint = ou0Var.b;
                if (paint != null) {
                    paint.setColor(w02);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(w02 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.J1;
        if (y0Var != null) {
            p7 p7Var = this.K1;
            boolean z10 = p7Var != null && p7Var.b();
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.J0);
            int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.J0);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            y0Var.e(w03, w04, org.telegram.ui.ActionBar.n6.w0(i7, this.J0), z10);
            this.J1.setSelectorColor((p7Var == null || !p7Var.b()) ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, this.J0) : org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i7, this.J0)));
        }
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
