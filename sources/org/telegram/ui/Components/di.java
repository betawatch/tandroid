package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class di extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.p2, te.b {
    public static final /* synthetic */ int E4 = 0;
    public org.telegram.messenger.v10 A1;
    public final int[] A2;
    public int A3;
    public final ri.c A4;
    public int B1;
    public final dh B2;
    public org.telegram.messenger.ij B3;
    public final dh.c B4;
    public int C1;
    public final lh C2;
    public boolean C3;
    public final dh.c C4;
    public boolean D1;
    public final TextPaint D2;
    public final int D3;
    public final ug D4;
    public boolean E1;
    public final RectF E2;
    public boolean E3;
    public boolean F1;
    public final Paint F2;
    public boolean F3;
    public boolean G1;
    public AnimatorSet G2;
    public boolean G3;
    public h30 H1;
    public long H2;
    public boolean H3;
    public boolean I1;
    public final bi.x5 I2;
    public boolean I3;
    public final ec0 J1;
    public final ih J2;
    public boolean J3;
    public cn K1;
    public int K2;
    public boolean K3;
    public j30 L1;
    public qs L2;
    public boolean L3;
    public boolean M1;
    public boolean M2;
    public int M3;
    public boolean N1;
    public boolean N2;
    public boolean N3;
    public mj O1;
    public boolean O2;
    public boolean O3;
    public ki P1;
    public final float P2;
    public float P3;
    public long Q1;
    public long Q2;
    public float Q3;
    public boolean R1;
    public final r7 R2;
    public ValueAnimator R3;
    public final dh.d S1;
    public AnimatorSet S2;
    public int S3;
    public boolean T1;
    public AnimatorSet T2;
    public bi T3;
    public float U1;
    public final org.telegram.ui.ActionBar.r0 U2;
    public om U3;
    public final oh V1;
    public final fi.u V2;
    public final int[] V3;
    public final org.telegram.ui.ActionBar.f2 W1;
    public final org.telegram.ui.ActionBar.r0 W2;
    public int W3;
    public final boolean X1;
    public fi.m3 X2;
    public float X3;
    public ue Y1;
    public final org.telegram.ui.ActionBar.r0 Y2;
    public float Y3;
    public boolean Z1;
    public final ei.k Z2;
    public boolean Z3;
    public final ChatAttachAlertPhotoLayout a2;
    public float a3;
    public float a4;
    public fj b2;
    public float b3;
    public final boolean b4;
    public ni c2;
    public final dh c3;
    public boolean c4;
    public bn d2;
    public final TextView d3;
    public final ArrayList d4;
    public bn e2;
    public final org.telegram.ui.ActionBar.r0 e3;
    public final Rect e4;
    public wk f2;
    public final LinearLayout f3;
    public float f4;
    public vj g2;
    public final ImageView g3;
    public boolean g4;
    public bm h2;
    public final LinearLayout h3;
    public int h4;
    public final te.a i1;
    public qi i2;
    public final TextView i3;
    public final oh i4;
    public final te.a j1;
    public kg.g0 j2;
    public float j3;
    public r1.g j4;
    public final te.a k1;
    public wj k2;
    public boolean k3;
    public AnimatorSet k4;
    public final te.a l1;
    public wj l2;
    public final qh l3;
    public int l4;
    public final te.a m1;
    public li.p m2;
    public boolean m3;
    public int m4;
    public final te.a n1;
    public ik n2;
    public Object n3;
    public boolean n4;
    public final te.j o1;
    public boolean o2;
    public boolean o3;
    public boolean o4;
    public org.telegram.ui.ym p1;
    public float p2;
    public final lh.f p3;
    public boolean p4;
    public final j6 q1;
    public final vh[] q2;
    public final fh q3;
    public vk q4;
    public final j6 r1;
    public final LongSparseArray r2;
    public final dh r3;
    public boolean r4;
    public final ImageView s1;
    public vh s2;
    public final eh s3;
    public boolean s4;
    public final org.telegram.ui.ActionBar.u2 t1;
    public vh t2;
    public final v4.b0 t3;
    public File t4;
    public final ImageView u1;
    public final fh.g u2;
    public final ai u3;
    public double[] u4;
    public final org.telegram.ui.ActionBar.u2 v1;
    public final fh.g v2;
    public boolean v3;
    public boolean v4;
    public boolean w1;
    public final kg.j w2;
    public final RadialProgressView w3;
    public boolean w4;
    public boolean x1;
    public final dh x2;
    public boolean x3;
    public boolean x4;
    public boolean y1;
    public final gh y2;
    public final j6 y3;
    public fi.i y4;
    public int z1;
    public final ImageView z2;
    public float z3;
    public final dh.g z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.ui.ActionBar.r0 r0Var;
        ei.k kVar;
        boolean z12;
        float f10;
        int i7 = 1;
        int i10 = 0;
        xq xqVar = xq.h;
        this.i1 = new te.a(0, this, xqVar, 380L, false);
        this.j1 = new te.a(1, this, xqVar, 380L, false);
        this.k1 = new te.a(2, this, xqVar, 380L, false);
        this.l1 = new te.a(3, this, xqVar, 380L, false);
        this.m1 = new te.a(4, this, xqVar, 380L, true);
        this.n1 = new te.a(5, this, xqVar, 320L, false);
        te.j jVar = new te.j(new mg(this, 2), xqVar, 380L);
        this.o1 = jVar;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.U1 = 0.0f;
        this.V1 = new oh(this, 0);
        this.Z1 = false;
        vh[] vhVarArr = new vh[12];
        this.q2 = vhVarArr;
        this.r2 = new LongSparseArray();
        this.A2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.D2 = textPaint;
        this.E2 = new RectF();
        this.F2 = new Paint(1);
        this.O2 = true;
        this.P2 = 1.0f;
        this.v3 = false;
        this.x3 = false;
        int i11 = org.telegram.messenger.p10.s0;
        this.D3 = i11;
        this.E3 = true;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.M3 = -1;
        this.N3 = true;
        this.S3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.V3 = new int[2];
        new Paint(1);
        this.c4 = false;
        ArrayList arrayList = new ArrayList();
        this.d4 = arrayList;
        Rect rect = new Rect();
        this.e4 = rect;
        this.i4 = new oh(this, 1);
        this.o4 = true;
        this.p4 = false;
        this.w4 = false;
        this.x4 = false;
        this.y = true;
        ri.c cVar = new ri.c();
        this.A4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.I0));
        this.X0.E.add(new oi.o(cVar, new mg(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.iz.f()) {
            this.z4 = null;
            this.B4 = new dh.c(cVar, cVar, cVar);
            this.C4 = new dh.c(cVar, cVar, cVar);
        } else {
            dh.g gVar = new dh.g(false);
            this.z4 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(cVar);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            ri.f fVar2 = new ri.f(null);
            fVar2.f = cVar;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.B4 = cVar2;
            cVar2.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.C4 = cVar3;
            cVar3.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.e = L2;
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.D4 = new ug(this, i10);
        this.b4 = z9;
        this.X1 = (f2Var instanceof org.telegram.ui.an) && f2Var.isInBubbleMode();
        this.k0 = new OvershootInterpolator(0.7f);
        this.W1 = f2Var;
        this.F = true;
        this.y0 = this;
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.f(i11).c(this, org.telegram.messenger.qs.F1);
        arrayList.add(rect);
        qh qhVar = new qh(this, context);
        this.l3 = qhVar;
        qhVar.setDelegate(new rh(this));
        this.b = qhVar;
        qhVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i12 = this.t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        r7 r7Var = new r7(this, context, f6Var, i7);
        this.R2 = r7Var;
        r7Var.c1 = true;
        r7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i13, f6Var);
        int i14 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, i14, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, i13, f6Var);
        r7Var.setOccupyStatusBar(true);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 12));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), false, f6Var);
        this.U2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(R.drawable.ic_ab_other);
        r0Var2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new mg(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 6, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, h02, null, N, f6Var);
        final int i15 = 5;
        r0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i15) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i16 = 0; i16 < chatAttachAlertPhotoLayout.E.getChildCount(); i16++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i16);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), false, f6Var);
        this.W2 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.V2 = uVar;
        r0Var3.setIcon(uVar);
        r0Var3.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i16 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 6, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(r0Var3, h03, null, N2, f6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i16) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        ei.k kVar2 = new ei.k(this, context);
        org.telegram.ui.ActionBar.r6.V(kVar2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        kVar2.setText(org.telegram.messenger.id.M0(2131751753, null));
        kVar2.setTypeface(org.telegram.messenger.g0.o());
        kVar2.setTextSize(1, 14.0f);
        kVar2.setVisibility(4);
        kVar2.setAlpha(0.0f);
        kVar2.setGravity(17);
        kVar2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        kVar2.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i17 = 7;
        kVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i17) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        c8.ka.a(kVar2);
        this.Z2 = kVar2;
        L1();
        if (f2Var != null) {
            r0Var = r0Var3;
            kVar = kVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), false, f6Var);
            this.Y2 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(R.drawable.outline_header_search);
            r0Var4.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
            r0Var4.setVisibility(4);
            z12 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 6, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(r0Var4, h04, null, N3, f6Var);
            r0Var4.setOnClickListener(new di.a2(5, this, z10));
        } else {
            r0Var = r0Var3;
            kVar = kVar2;
            z12 = false;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), false, f6Var);
        this.e3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(R.drawable.ic_ab_other);
        r0Var5.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        final int i18 = 8;
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 3, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(r0Var5, h05, null, N4, f6Var);
        final int i19 = 2;
        r0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131744880, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final di diVar = this.b;
                        gh ghVar = diVar.y2;
                        if (ghVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar.getText());
                            final int i20 = 0;
                            g0Var.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            gh ghVar2 = diVar.y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar = diVar.J2;
                                            ihVar.setText(charSequence);
                                            ihVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            boolean z13 = diVar.B3 != null;
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.e2 = z13;
                            g0Var.f2 = wgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final di diVar2 = this.b;
                        ih ihVar = diVar2.J2;
                        if (ihVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar.getText());
                            final int i21 = 1;
                            g0Var2.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            gh ghVar2 = diVar2.y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar2 = diVar2.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            boolean z14 = diVar2.B3 != null;
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.e2 = z14;
                            g0Var2.f2 = wgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        di diVar3 = this.b;
                        diVar3.e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i22 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i22;
                        p13.n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i23 = point.x;
                        int i24 = point.y;
                        if (i23 > 1080 || i24 > 1080) {
                            float min = Math.min(i23, i24) / 1080.0f;
                            i23 = (int) (i23 * min);
                            i24 = (int) (i24 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i23, i24, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new uh(diVar3, gfVar), f2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) f2Var2 : null);
                        if (diVar3.x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
                            break;
                        }
                        break;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i18) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        final int i20 = 0;
        dh dhVar = new dh(this, context, i20);
        this.c3 = dhVar;
        dhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i20) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        dhVar.setAlpha(0.0f);
        dhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.d3 = textView;
        org.telegram.messenger.k5.n(textView, i13, f6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.g3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(imageView, mutate, i13, f6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ha.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        dhVar.addView(linearLayout, c8.ha.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.r6.y(imageView2, mutate2, i13, f6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.i3 = textView2;
        org.telegram.messenger.k5.n(textView2, i13, f6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ha.r(-2, -2, 16));
        dhVar.addView(linearLayout2, c8.ha.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z9, z11, f6Var);
        this.a2 = chatAttachAlertPhotoLayout;
        vhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.s2 = chatAttachAlertPhotoLayout;
        this.Q2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, c8.ha.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.p3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.b.addView(fVar3, c8.ha.g());
        this.b.addView(dhVar, c8.ha.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.x5 x5Var = new bi.x5(context, 12);
        this.I2 = x5Var;
        this.b.addView(x5Var, c8.ha.e(-1, -2, 55));
        this.b.addView(r7Var, c8.ha.c(-2.0f, -1));
        this.b.addView(r0Var2, c8.ha.e(48, 48, 53));
        this.b.addView(r0Var, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.Y2;
        if (r0Var6 != null) {
            this.b.addView(r0Var6, c8.ha.e(48, 48, 53));
        }
        dhVar.addView(r0Var5, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(kVar, c8.ha.e(-2, 48, 53));
        dh dhVar2 = new dh(this, context, 1);
        this.r3 = dhVar2;
        eh ehVar = new eh(context, 0);
        this.s3 = ehVar;
        ehVar.setClipChildren(true);
        ehVar.setClipToPadding(false);
        ai aiVar = new ai(this, context);
        this.u3 = aiVar;
        ehVar.setAdapter(aiVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.t3 = b0Var;
        ehVar.setLayoutManager(b0Var);
        ehVar.setVerticalScrollBarEnabled(false);
        ehVar.setHorizontalScrollBarEnabled(false);
        ehVar.setItemAnimator(null);
        ehVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(ehVar, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        ehVar.y2 = true;
        ehVar.setOverScrollMode(2);
        dh.c cVar5 = this.B4;
        oi.q qVar = this.X0;
        cVar5.j = qVar;
        this.C4.j = qVar;
        cVar4.j = qVar;
        fh fhVar = new fh(this, context, 0);
        this.q3 = fhVar;
        dh.d dVar = new dh.d(cVar4.c(fhVar, null, false));
        this.S1 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(fhVar, c8.ha.g());
        fh.g c10 = this.B4.c(dhVar2, c8.g0.f(f6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        dhVar2.setBackground(c10);
        ehVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        ehVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        bg.q0 q0Var = bg.u0.a;
        ehVar.setOutlineProvider(new bg.s0(L3, L4));
        ehVar.setImportantForAccessibility(1);
        dhVar2.addView(ehVar, c8.ha.g());
        this.b.addView(dhVar2, c8.ha.e(-1, 70, 81));
        ehVar.setOnItemClickListener(new di.p4(9, this, f6Var));
        ehVar.setOnItemLongClickListener(new mg(this, 3));
        j6 j6Var = new j6(context, true, false, true);
        this.y3 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        j6Var.setPadding(L5, 0, L5, 0);
        j6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i21 = 1;
        j6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i21) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(j6Var, c8.ha.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.w3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.z2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i22 = org.telegram.ui.ActionBar.k6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i22, f6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i23) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        dh dhVar3 = new dh(this, context, i23);
        this.x2 = dhVar3;
        kg.j jVar2 = new kg.j(this, context);
        this.w2 = jVar2;
        dhVar3.addView(jVar2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fh.g c11 = this.C4.c(qhVar, c8.g0.o(f6Var), false);
        this.u2 = c11;
        c11.S = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.Q.g = 0.4f;
        c11.n();
        fh.g c12 = this.B4.c(jVar2, c8.g0.o(f6Var), false);
        this.v2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar2.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        dhVar3.setWillNotDraw(false);
        dhVar3.setVisibility(4);
        dhVar3.setAlpha(0.0f);
        this.b.addView(dhVar3, c8.ha.e(-1, -2, 83));
        dhVar3.setOnTouchListener(new ei.b(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.q1 = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i24 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i24, f6Var);
        j6Var2.setTypeface(org.telegram.messenger.g0.o());
        j6Var2.setGravity(17);
        jVar2.addView(j6Var2, c8.ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.s1 = imageView4;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(context);
        this.t1 = u2Var;
        imageView4.setImageDrawable(u2Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.k6.Kl;
        org.telegram.ui.ActionBar.r6.t(imageView4, i25, f6Var, mode);
        int i26 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i26, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i26);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView4, h06, null, N5, f6Var);
        jVar2.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final di diVar = this.b;
                        gh ghVar = diVar.y2;
                        if (ghVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar.getText());
                            final int i202 = 0;
                            g0Var.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            gh ghVar2 = diVar.y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar2 = diVar.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            boolean z13 = diVar.B3 != null;
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.e2 = z13;
                            g0Var.f2 = wgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final di diVar2 = this.b;
                        ih ihVar = diVar2.J2;
                        if (ihVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar.getText());
                            final int i212 = 1;
                            g0Var2.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            gh ghVar2 = diVar2.y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar2 = diVar2.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            boolean z14 = diVar2.B3 != null;
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.e2 = z14;
                            g0Var2.f2 = wgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        di diVar3 = this.b;
                        diVar3.e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new uh(diVar3, gfVar), f2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) f2Var2 : null);
                        if (diVar3.x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.B1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0();
        gh ghVar = new gh(this, context, qhVar, f6Var);
        this.y2 = ghVar;
        ghVar.J = true;
        ghVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        ghVar.s();
        ghVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        ghVar.getEditText().addTextChangedListener(new hh(this, 0));
        jVar2.addView(ghVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar2.setClipChildren(false);
        dhVar3.setClipChildren(false);
        ghVar.setClipChildren(false);
        x5Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        x5Var.setWillNotDraw(false);
        ih ihVar = new ih(this, context, qhVar, f6Var);
        this.J2 = ihVar;
        ihVar.J = true;
        ihVar.getEditText().addTextChangedListener(new kh(this, f2Var));
        ihVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        ihVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        ihVar.getEditText().setTextSize(1, 17.0f);
        ihVar.getEmojiButton().setLayoutParams(c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        ihVar.setHint(org.telegram.messenger.id.M0(2131754454, "AddCaption"));
        x5Var.addView(ihVar, c8.ha.e(-1, -2, org.telegram.messenger.qs.E1));
        x5Var.setAlpha(0.0f);
        x5Var.setVisibility(8);
        ghVar.addView(imageView3, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.B4.c(x5Var, c8.g0.o(f6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        x5Var.setBackground(c13);
        x5Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.r1 = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var3, i24, f6Var);
        j6Var3.setTypeface(org.telegram.messenger.g0.o());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        x5Var.addView(j6Var3, c8.ha.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Le, f6Var, mode2);
        ihVar.addView(imageView5, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i28) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.u1 = imageView6;
        org.telegram.ui.ActionBar.u2 u2Var2 = new org.telegram.ui.ActionBar.u2(context);
        this.v1 = u2Var2;
        imageView6.setImageDrawable(u2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView6, i25, f6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i26, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i26);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.r6.k(imageView6, h07, null, N6, f6Var);
        x5Var.addView(imageView6, c8.ha.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final di diVar = this.b;
                        gh ghVar2 = diVar.y2;
                        if (ghVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar2.getText());
                            final int i202 = 0;
                            g0Var.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            gh ghVar22 = diVar.y2;
                                            ghVar22.setText(charSequence);
                                            ghVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar2 = diVar.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            boolean z13 = diVar.B3 != null;
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.e2 = z13;
                            g0Var.f2 = wgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final di diVar2 = this.b;
                        ih ihVar2 = diVar2.J2;
                        if (ihVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar2.getText());
                            final int i212 = 1;
                            g0Var2.b2 = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vg
                                @Override // org.telegram.messenger.c20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            gh ghVar22 = diVar2.y2;
                                            ghVar22.setText(charSequence);
                                            ghVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ih ihVar22 = diVar2.J2;
                                            ihVar22.setText(charSequence);
                                            ihVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            boolean z14 = diVar2.B3 != null;
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.e2 = z14;
                            g0Var2.f2 = wgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        di diVar3 = this.b;
                        diVar3.e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i222 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i222;
                        p13.n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer.p1().e2(arrayList2, 0, 11, false, new uh(diVar3, gfVar), f2Var2 instanceof org.telegram.ui.an ? (org.telegram.ui.an) f2Var2 : null);
                        if (diVar3.x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
                            break;
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        dh dhVar4 = new dh(this, context, 3);
        this.B2 = dhVar4;
        dhVar4.setFocusable(true);
        dhVar4.setFocusableInTouchMode(true);
        dhVar4.setVisibility(4);
        dhVar4.setScaleX(0.2f);
        dhVar4.setScaleY(0.2f);
        dhVar4.setAlpha(0.0f);
        dhVar4.setClipChildren(false);
        dhVar4.setClipToPadding(false);
        this.b.addView(dhVar4, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
        lh lhVar = new lh(context, f6Var, this);
        this.C2 = lhVar;
        lhVar.setImportantForAccessibility(2);
        dhVar4.addView(lhVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        lhVar.setTranslationX(this.t0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        lhVar.I = L6;
        lhVar.J = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        lhVar.M = L8;
        lhVar.N = L9;
        lhVar.h0 = true;
        final int i30 = 4;
        lhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rg
            public final /* synthetic */ di b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.c4 c4Var;
                switch (i30) {
                    case 0:
                        di diVar = this.b;
                        diVar.O1(diVar.s2 != diVar.h2);
                        break;
                    case 1:
                        di diVar2 = this.b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        di diVar3 = this.b;
                        boolean z13 = diVar3.T1;
                        if (!z13) {
                            diVar3.v1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        di diVar4 = this.b;
                        boolean z14 = diVar4.T1;
                        if (z14) {
                            diVar4.v1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        di diVar5 = this.b;
                        if (diVar5.a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z15 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i162 = 0; i162 < chatAttachAlertPhotoLayout2.E.getChildCount(); i162++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i162);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.i1 = z15;
                                edit.putBoolean("photoLiveDefault", z15).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(!U ? 2131748833 : 2131748834, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.q0 = new f(11, diVar5, m3Var2);
                            diVar5.b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            break;
                        }
                        break;
                    case 7:
                        vh vhVar = this.b.s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        lhVar.setOnLongClickListener(new org.telegram.ui.of(this, context, f6Var, f2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        fh fhVar2 = new fh(this, context, 1);
        fhVar2.setAlpha(0.0f);
        fhVar2.setScaleX(0.2f);
        fhVar2.setScaleY(0.2f);
        if (z9) {
            P0();
            this.F0 = -1;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().a(this.B4, c8.g0.o(f6Var));
        ec0 ec0Var = new ec0(context);
        this.J1 = ec0Var;
        this.b.addView(ec0Var, c8.ha.c(-1.0f, -1));
        gh.e eVar = new gh.e(f6Var);
        eVar.e = new mg(this, 5);
        eVar.c = new mg(this, 6);
        eVar.d = new mg(this, 7);
        eVar.b = new mg(this, 8);
        float N7 = org.telegram.messenger.g0.N(3.3333333f);
        float N8 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N7;
        eVar.r = N8;
        float N9 = org.telegram.messenger.g0.N(1.0f);
        float N10 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N9;
        eVar.h = N10;
        r7Var.M(this.B4, eVar, false);
        jVar.f(1L, false);
        this.X0.i(this.b);
        oi.q qVar2 = this.X0;
        qVar2.a = new mg(this, 9);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static void I0(di diVar) {
        r7 r7Var = diVar.R2;
        lh.f fVar = diVar.p3;
        if (fVar == null || r7Var == null) {
            return;
        }
        vh vhVar = diVar.t2;
        if (vhVar == null) {
            vhVar = diVar.s2;
        }
        int i7 = 0;
        boolean z9 = vhVar != null && vhVar.f();
        org.telegram.ui.ActionBar.f6 f6Var = diVar.I0;
        boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        if (!z9 && r7Var.getVisibility() == 0) {
            i7 = (int) (r7Var.getAlpha() * (a10 ? org.telegram.messenger.qs.e4 : org.telegram.messenger.qs.q2));
        }
        fVar.setFadeTopAlpha(i7);
    }

    public static void K0(di diVar) {
        fi.i iVar = new fi.i(diVar, diVar.getContext(), diVar.Q1, LaunchActivity.Q(), diVar.I0, 1);
        diVar.y4 = iVar;
        iVar.p(new h9.f1(diVar, 29));
        ViewGroup viewGroup = diVar.b;
        viewGroup.addView(diVar.y4, viewGroup.indexOfChild(diVar.x2), c8.ha.e(-1, -1, 83));
        fi.i iVar2 = diVar.y4;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            jg.i1 adapter = iVar2.getAdapter();
            anVar.j();
            TLRPC.Chat chat = anVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(anVar.p8);
            iVar2.getAdapter().e0 = anVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        diVar.J1();
    }

    public static int L0(di diVar) {
        vh vhVar = diVar.s2;
        bn bnVar = diVar.d2;
        if (vhVar == bnVar && bnVar.E != null) {
            return bnVar.getEmojiPadding();
        }
        bn bnVar2 = diVar.e2;
        return (vhVar != bnVar2 || bnVar2.E == null) ? diVar.T1 ? diVar.J2.getEmojiPadding() : diVar.y2.getEmojiPadding() : bnVar2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.t(user) || org.telegram.messenger.t10.x(user) || org.telegram.messenger.t10.A(user.id) || org.telegram.messenger.t10.z(user) || org.telegram.messenger.t10.s(user) || user.id == 489000 || org.telegram.messenger.qp.F2(user)) ? false : true;
    }

    public static void s1(vh vhVar) {
        if (vhVar == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.r6.b;
        Object tag = vhVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
            return;
        }
        vhVar.setTag(R.id.theme_generation, Integer.valueOf(i7));
        try {
            org.telegram.ui.ActionBar.r6.d0(vhVar, true);
            vhVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(String str) {
        this.K2 = 1;
        this.w1 = true;
        this.M2 = false;
        this.G3 = false;
        this.r3.setVisibility(8);
        this.d3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            di diVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (diVar.K2 == 0 || diVar.w1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z9) {
        boolean z10;
        if (z9) {
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if ((f2Var instanceof org.telegram.ui.an) && !((org.telegram.ui.an) f2Var).z()) {
                z10 = true;
                if (this.v4 != z10) {
                    return;
                }
                if (z10) {
                    org.telegram.messenger.qp.s1(this.D3).R1().b();
                }
                this.v4 = z10;
                ImageView imageView = this.s1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.u1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f);
                xq xqVar = xq.h;
                scaleY.setInterpolator(xqVar).setDuration(420L).withEndAction(new zg(this, z10, 1)).start();
                imageView2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(xqVar).setDuration(420L).withEndAction(new zg(this, z10, 2)).start();
                if (z10) {
                    org.telegram.ui.ActionBar.u2 u2Var = this.t1;
                    Objects.requireNonNull(u2Var);
                    imageView.postDelayed(new j0(u2Var, 1), 220L);
                    org.telegram.ui.ActionBar.u2 u2Var2 = this.v1;
                    Objects.requireNonNull(u2Var2);
                    imageView2.postDelayed(new j0(u2Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.v4 != z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0202, code lost:
    
        r12.start_param = r30;
        r12.flags |= 8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(long j3, String str, boolean z9, boolean z10) {
        int i7;
        boolean z11;
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.r2;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((hi.c4) longSparseArray.get(j3)).getStartCommand())) {
            hi.c4 c4Var = (hi.c4) longSparseArray.get(j3);
            if (c4Var.H) {
                c4Var.H = false;
            }
            i7 = 8;
            z11 = true;
            if (longSparseArray.get(j3) != null) {
                ((hi.c4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(z11);
                G1((vh) longSparseArray.get(j3), -j3, z10);
                if (z9) {
                    hi.c4 c4Var2 = (hi.c4) longSparseArray.get(j3);
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(c4Var2.F).a2(Long.valueOf(c4Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(c4Var2.F).b.bots;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                        i11++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == c4Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.i3(new ha.b(i7, c4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753138, a22.first_name) : z12 ? org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedSide", null, 2131753137, a22.first_name) : org.telegram.messenger.id.a0("BotAttachMenuShortcatAddedAttach", null, 2131753139, a22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.I0;
            hi.c4 c4Var3 = new hi.c4(context, f6Var, this);
            c4Var3.U = new hi.s3(c4Var3, 2);
            org.telegram.ui.ActionBar.r0 a10 = c4Var3.b.R2.q().a(0, R.drawable.ic_ab_other);
            c4Var3.K = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.id.M0(2131752912, null));
            org.telegram.ui.ActionBar.z0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.id.M0(2131752897, null));
            c4Var3.L = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.id.M0(2131752911, null));
            org.telegram.ui.ActionBar.z0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.id.M0(2131754390, null));
            c4Var3.M = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.id.M0(2131752894, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.id.M0(2131752910, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131752915, null));
            hi.s2 s2Var = new hi.s2(c4Var3, context, f6Var, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, c4Var3.a), 1);
            c4Var3.n = s2Var;
            hi.r2 r2Var = new hi.r2(i10, context, c4Var3);
            c4Var3.J = r2Var;
            i7 = 8;
            r2Var.addView(s2Var, c8.ha.c(-1.0f, -1));
            int i12 = 3;
            r2Var.setScrollListener(new hi.s3(c4Var3, i12));
            z11 = true;
            r2Var.setScrollEndListener(new hi.s3(c4Var3, 4));
            r2Var.setDelegate(new hi.u3(c4Var3));
            r2Var.setIsKeyboardVisible(new hi.u3(c4Var3));
            c4Var3.addView(r2Var, c8.ha.c(-1.0f, -1));
            hi.v3 v3Var = new hi.v3(context, f6Var);
            c4Var3.I = v3Var;
            c4Var3.addView(v3Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            s2Var.setWebViewProgressListener(new bi.q9(c4Var3, i12));
            org.telegram.messenger.qs.e().c(c4Var3, org.telegram.messenger.qs.n4);
            longSparseArray.put(j3, c4Var3);
            ((hi.c4) longSparseArray.get(j3)).setDelegate(new jh(this, c4Var3, str, j3));
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            org.telegram.messenger.ij replyingMessageObject = anVar.Z.getReplyingMessageObject();
            hi.c4 c4Var4 = (hi.c4) longSparseArray.get(j3);
            long a11 = anVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long h92 = anVar.h9();
            hi.s2 s2Var2 = c4Var4.n;
            int i14 = this.D3;
            c4Var4.F = i14;
            c4Var4.x = a11;
            c4Var4.w = j3;
            c4Var4.D = i13;
            c4Var4.E = h92;
            c4Var4.G = str;
            org.telegram.ui.ActionBar.z0 z0Var = c4Var4.M;
            if (z0Var != null) {
                org.telegram.messenger.ui.b0(i14);
                z0Var.setVisibility(0);
            }
            s2Var2.setBotUser(org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j3)));
            s2Var2.s(i14, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.qp.s1(i14).j1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.qp.s1(i14).o1(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0 && (N0 = org.telegram.messenger.qp.s1(i14).N0(-a11)) != null && (peer = N0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = org.telegram.messenger.qp.s1(i14).m1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (i13 != 0) {
                org.telegram.messenger.gz.C(i14);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i13;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (h92 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.qp.s1(i14).j1(h92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (h92 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.qp.s1(i14).j1(h92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = hi.a3.u(c4Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new bi.j2(c4Var4, i14, 5));
            org.telegram.messenger.qs.f(i14).c(c4Var4, org.telegram.messenger.qs.z1);
            if (longSparseArray.get(j3) != null) {
            }
        }
        i7 = 8;
        z11 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void D1(org.telegram.ui.ActionBar.f2 f2Var) {
        if ((f2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) f2Var).e)) {
            new hc(this.l3, this.I0).f(org.telegram.messenger.qp.s1(this.D3).U4, new f(12, this, f2Var)).j();
        }
    }

    public final boolean E1(boolean z9, boolean z10) {
        float f10;
        int i7;
        vh vhVar;
        r7 r7Var;
        this.j1.a(z9, true);
        dh dhVar = this.x2;
        if (z9 == (dhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dhVar.setTag(z9 ? 1 : null);
        gh ghVar = this.y2;
        if (ghVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(ghVar.getEditText());
        }
        ghVar.k(true);
        this.J2.k(true);
        dh dhVar2 = this.r3;
        dh dhVar3 = this.B2;
        if (z9) {
            if (!this.E1) {
                dhVar.setVisibility(0);
            }
            dhVar3.setVisibility(0);
        } else if (this.M2) {
            dhVar2.setVisibility(0);
        }
        vh vhVar2 = this.s2;
        boolean z11 = (vhVar2 == this.a2 || vhVar2 == this.h2) && this.T1;
        r7 r7Var2 = this.R2;
        bi.x5 x5Var = this.I2;
        kg.j jVar = this.w2;
        lh lhVar = this.C2;
        if (z10) {
            this.G2 = new AnimatorSet();
            if (z11) {
                x5Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(dhVar, (Property<dh, Float>) property, z9 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) property, (!z9 || z11) ? 0.0f : 1.0f));
            if (!z9 || z11) {
                r7Var = r7Var2;
            } else {
                jVar.setVisibility(0);
                r7Var = r7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<kg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property, (z9 && z11) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, (Property<dh, Float>) property2, z9 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, (Property<dh, Float>) property3, z9 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, (Property<dh, Float>) property, z9 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) property2, z9 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) property3, z9 ? 1.0f : 0.2f));
            if (r7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(dhVar, (Property<dh, Float>) View.TRANSLATION_Y, z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.M2) {
                arrayList.add(ObjectAnimator.ofFloat(dhVar2, (Property<dh, Float>) View.TRANSLATION_Y, z9 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(dhVar2, (Property<dh, Float>) property, z9 ? 0.0f : 1.0f));
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new og(this, 5));
                arrayList.add(ofFloat);
            }
            this.G2.playTogether(arrayList);
            this.G2.setInterpolator(new DecelerateInterpolator());
            this.G2.setDuration(180L);
            this.G2.addListener(new org.telegram.ui.ActionBar.g(this, z9, z11, 3));
            this.G2.start();
            i7 = 0;
        } else {
            dhVar.setAlpha(z9 ? 1.0f : 0.0f);
            jVar.setAlpha((z9 && z11) ? 1.0f : 0.0f);
            if (!z9 || z11) {
                f10 = 0.0f;
                i7 = 0;
            } else {
                i7 = 0;
                jVar.setVisibility(0);
                f10 = 0.0f;
                jVar.setTranslationY(0.0f);
            }
            dhVar3.setScaleX(z9 ? 1.0f : 0.2f);
            dhVar3.setScaleY(z9 ? 1.0f : 0.2f);
            dhVar3.setAlpha(z9 ? 1.0f : f10);
            x5Var.setVisibility((z9 && z11) ? i7 : 8);
            x5Var.setAlpha((z9 && z11) ? 1.0f : f10);
            lhVar.setScaleX(z9 ? 1.0f : 0.2f);
            lhVar.setScaleY(z9 ? 1.0f : 0.2f);
            if (r7Var2.getTag() != null) {
                dhVar.setTranslationY(z9 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.M2 && ((vhVar = this.s2) == null || vhVar.M())) {
                dhVar2.setTranslationY(z9 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z9) {
                dhVar.setVisibility(4);
                dhVar3.setVisibility(4);
            }
            if (z11) {
                Q1();
            }
        }
        if (z9) {
            i7 = Math.max(1, this.s2.getSelectedItemsCount());
        }
        lhVar.e(i7, z10);
        lhVar.i(X0() + this.s2.getSelectedItemsCount(), this.B3 != null ? 0L : org.telegram.messenger.qp.s1(this.D3).N1(b1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ghVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), lhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            ghVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(vh vhVar) {
        long j3 = this.Q2;
        cn cnVar = this.K1;
        if (vhVar == cnVar) {
            j3 = cnVar.s;
        } else if (vhVar == this.a2) {
            j3 = 1;
        } else if (vhVar == this.c2) {
            j3 = 3;
        } else if (vhVar == this.g2) {
            j3 = 4;
        } else if (vhVar == this.b2) {
            j3 = 5;
        } else if (vhVar == this.f2) {
            j3 = 6;
        } else if (vhVar == this.d2) {
            j3 = 9;
        } else if (vhVar == this.i2) {
            j3 = 10;
        } else if (vhVar == this.j2) {
            j3 = 11;
        } else if (vhVar == this.e2) {
            j3 = 12;
        } else if (vhVar == this.k2) {
            j3 = 14;
        } else if (vhVar == this.l2) {
            j3 = 13;
        } else if (vhVar == this.m2) {
            j3 = 16;
        } else if (vhVar == this.n2) {
            j3 = 17;
        }
        G1(vhVar, j3, true);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void G1(vh vhVar, long j3, boolean z9) {
        ql qlVar;
        ql qlVar2;
        int i7;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.n3 == null && this.G2 == null) {
            vh vhVar2 = this.s2;
            if (vhVar2 == vhVar) {
                vhVar2.J();
                return;
            }
            if (vhVar == this.e2 && !org.telegram.messenger.p10.i(this.D3).q()) {
                new ug.w0(this.W1, 39, false).show();
                return;
            }
            int i11 = 1;
            this.m1.a(j3 == 1, z9);
            this.o1.f(Long.valueOf(j3), z9);
            this.x3 = false;
            this.v3 = false;
            this.z3 = 0.0f;
            this.y3.setVisibility(8);
            RadialProgressView radialProgressView = this.w3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            dh dhVar = this.r3;
            dhVar.setAlpha(1.0f);
            dhVar.setTranslationY(this.z3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.r2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((hi.c4) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.Q2 = j3;
            eh ehVar = this.s3;
            int childCount = ehVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = ehVar.getChildAt(i13);
                if (childAt instanceof xh) {
                    xh xhVar = (xh) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    xhVar.a.f(((long) xhVar.b) == xhVar.c.Q2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof wh) {
                        ((wh) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.s2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.V3[0];
            this.t2 = vhVar;
            S0(vhVar);
            int i14 = this.t2.j() != 0 ? 0 : 4;
            r7 r7Var = this.R2;
            r7Var.setVisibility(i14);
            if (r7Var.n0) {
                r7Var.l(true);
            }
            this.s2.u();
            vh vhVar3 = this.t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if (vhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.t2.H(this.s2);
            this.t2.setVisibility(0);
            if (vhVar.getParent() != null) {
                this.b.removeView(this.t2);
            }
            int indexOfChild = this.b.indexOfChild(this.s2);
            if (this.t2.getParent() != this.b) {
                s1(this.t2);
                ViewGroup viewGroup = this.b;
                vh vhVar4 = this.t2;
                if (vhVar4 != this.f2) {
                    indexOfChild++;
                }
                viewGroup.addView(vhVar4, indexOfChild, c8.ha.c(-1.0f, -1));
            }
            qg qgVar = new qg(this, 5);
            vh vhVar5 = this.s2;
            boolean z10 = vhVar5 instanceof bm;
            oh ohVar = this.V1;
            if (z10 || (this.t2 instanceof bm)) {
                int max = Math.max(this.t2.getWidth(), this.s2.getWidth());
                vh vhVar6 = this.t2;
                if (vhVar6 instanceof bm) {
                    vhVar6.setTranslationX(max);
                    vh vhVar7 = this.s2;
                    if ((vhVar7 instanceof ChatAttachAlertPhotoLayout) && (qlVar2 = ((ChatAttachAlertPhotoLayout) vhVar7).P) != null) {
                        qlVar2.setVisibility(4);
                    }
                } else {
                    this.s2.setTranslationX(-max);
                    vh vhVar8 = this.t2;
                    if (vhVar8 == chatAttachAlertPhotoLayout && (qlVar = ((ChatAttachAlertPhotoLayout) vhVar8).P) != null) {
                        qlVar.setVisibility(0);
                    }
                }
                this.t2.setAlpha(1.0f);
                this.s2.setAlpha(1.0f);
                if (z9) {
                    vh vhVar9 = this.s2;
                    ohVar.getClass();
                    ohVar.a(vhVar9, f11);
                    org.telegram.messenger.g0.h3(new ng(this, vhVar, qgVar, 0));
                } else {
                    boolean z11 = this.t2.getCurrentItemTop() <= vhVar.getButtonsHideOffset();
                    this.s2.v(1.0f);
                    this.t2.v(1.0f);
                    this.s2.m(this.f4);
                    this.t2.m(this.f4);
                    this.b.invalidate();
                    this.X0.g();
                    vh vhVar10 = this.s2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    ohVar.getClass();
                    ohVar.a(vhVar10, valueOf2);
                    r7Var.setTag(z11 ? 1 : null);
                    qgVar.run();
                }
            } else if (z9) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.t2.setAlpha(0.0f);
                this.t2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.s2, (Property<vh, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.s2, ohVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) View.ALPHA, r7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(xq.f);
                animatorSet.addListener(new bi.y4(this, firstOffset, qgVar, i11));
                this.n3 = animatorSet;
                vh vhVar11 = this.s2;
                ohVar.getClass();
                ohVar.a(vhVar11, f11);
                animatorSet.start();
            } else {
                vhVar5.setAlpha(0.0f);
                qgVar.run();
                P1(0);
                this.b.invalidate();
            }
            if (!this.g4 || (vhVar instanceof hi.c4)) {
                i7 = 0;
            } else {
                i7 = 0;
                this.g4 = false;
                r7Var.updateColors();
                r7Var.invalidate();
                i1();
            }
            r7Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (vhVar instanceof hi.c4)) ? org.telegram.messenger.g0.L(46.0f) : j3 == 4 ? org.telegram.messenger.g0.L(84.0f) : i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean H() {
        return this.s2.b();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean H0() {
        vh vhVar = this.s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        return vhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    public final void H1(boolean z9, Boolean bool) {
        di diVar;
        if (this.d2 == null) {
            diVar = this;
            bn bnVar = new bn(diVar, getContext(), false, this.I0, bool);
            diVar.d2 = bnVar;
            diVar.q2[1] = bnVar;
            bnVar.setDelegate(new mg(this, 17));
        } else {
            diVar = this;
        }
        G1(diVar.d2, 9L, z9);
    }

    public final void I1(boolean z9, boolean z10) {
        vh vhVar;
        this.k1.a(z9, z10);
        r7 r7Var = this.R2;
        if (!(z9 && r7Var.getTag() == null) && (z9 || r7Var.getTag() == null)) {
            return;
        }
        r7Var.setTag(z9 ? 1 : null);
        AnimatorSet animatorSet = this.S2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S2 = null;
        }
        boolean z11 = (this.w1 || this.N2 || (this.K2 == 0 && this.k3) || this.s2 != this.a2 || (!this.F3 && !this.G3)) ? false : true;
        if (this.s2 == this.K1) {
            z11 = false;
        }
        dh dhVar = this.r3;
        org.telegram.ui.ActionBar.r0 r0Var = this.U2;
        if (z9) {
            if (z11) {
                r0Var.setVisibility(0);
                r0Var.setClickable(true);
            }
        } else if (this.M2 && this.x2.getTag() == null) {
            dhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var != null) {
            if (z9) {
                org.telegram.messenger.g0.q3(this, i0.a.h(org.telegram.ui.ActionBar.k6.w0(this.b4 ? org.telegram.ui.ActionBar.k6.hh : org.telegram.ui.ActionBar.k6.h5, this.I0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
        }
        int i7 = 4;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z9 ? 1.0f : 0.0f) - r7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, z9 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new og(this, i7));
            arrayList.add(ofFloat);
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, z9 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, z9 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.6f));
            }
            this.S2.playTogether(arrayList);
            this.S2.addListener(new t9(2, this, z9));
            this.S2.setInterpolator(xq.h);
            this.S2.setDuration(380L);
            this.S2.start();
            return;
        }
        if (z9 && this.M2 && ((vhVar = this.s2) == null || vhVar.M())) {
            dhVar.setVisibility(4);
        }
        r7Var.setAlpha(z9 ? 1.0f : 0.0f);
        if (z11) {
            r0Var.setAlpha(z9 ? 1.0f : 0.0f);
            r0Var.setScaleX(z9 ? 1.0f : 0.6f);
            r0Var.setScaleY(z9 ? 1.0f : 0.6f);
        }
        if (z9) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.Y2;
        if (r0Var2 != null) {
            r0Var2.setVisibility(4);
        }
        if (this.K2 == 0 && this.k3) {
            return;
        }
        r0Var.setVisibility(4);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void J() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.j4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.k4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.z0 = null;
            this.A0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.A2;
        gh ghVar = this.y2;
        ghVar.getLocationOnScreen(iArr);
        if (this.y4 != null) {
            vh vhVar = this.s2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if ((vhVar == chatAttachAlertPhotoLayout || vhVar == this.h2) && this.T1) {
                bi.x5 x5Var = this.I2;
                alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + (x5Var.getY() - this.y4.getTop());
            } else {
                alpha = -ghVar.getHeight();
            }
            if (Math.abs(this.y4.getTranslationY() - alpha) > 0.5f) {
                this.y4.setTranslationY(alpha);
                this.y4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public void K() {
        bi biVar = this.T3;
        if (biVar != null) {
            biVar.c0(new qg(this, 4));
        } else {
            t1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.n3 != null) {
            return;
        }
        int selectedItemsCount = this.s2.getSelectedItemsCount();
        lh lhVar = this.C2;
        if (selectedItemsCount == 0) {
            lhVar.e(0, i7 != 0);
            E1(false, i7 != 0);
        } else {
            if (E1(true, i7 != 0) || i7 == 0) {
                lhVar.e(selectedItemsCount, i7 != 0);
                lhVar.a();
            } else {
                lhVar.e(selectedItemsCount, true);
                lhVar.a();
            }
        }
        this.s2.D(selectedItemsCount);
        Q0(i7 != 0);
        if (this.s2 == this.a2 && ((((z9 = (f2Var = this.W1) instanceof org.telegram.ui.an)) || this.K2 != 0 || this.N2) && ((selectedItemsCount == 0 && this.k3) || ((selectedItemsCount != 0 || this.K2 != 0 || this.N2) && !this.k3)))) {
            this.k3 = (selectedItemsCount == 0 && this.K2 == 0 && !this.N2) ? false : true;
            AnimatorSet animatorSet = this.T2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T2 = null;
            }
            int i10 = this.K2;
            r7 r7Var = this.R2;
            org.telegram.ui.ActionBar.r0 r0Var = this.Y2;
            if (i10 != 0 && r0Var != null && r7Var.getTag() != null && z9) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
                if (!org.telegram.messenger.t3.T(anVar.e) || (tL_chatBannedRights = anVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z10 = true;
                    z11 = this.k3;
                    dh dhVar = this.c3;
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.U2;
                    if (!z11) {
                        if (this.K2 == 0 && !this.N2) {
                            r0Var2.setVisibility(0);
                            r0Var2.setClickable(true);
                        }
                        dhVar.setVisibility(0);
                    } else if (r7Var.getTag() != null && r0Var != null) {
                        r0Var.setVisibility(0);
                    }
                    if (i7 != 0) {
                        if (r7Var.getTag() == null && this.K2 == 0 && !this.N2) {
                            r0Var2.setAlpha(this.k3 ? 1.0f : 0.0f);
                            r0Var2.setScaleX(this.k3 ? 1.0f : 0.6f);
                            r0Var2.setScaleY(this.k3 ? 1.0f : 0.6f);
                        }
                        dhVar.setAlpha(this.k3 ? 1.0f : 0.0f);
                        if (z10) {
                            r0Var.setAlpha(this.k3 ? 0.0f : 1.0f);
                        }
                        if (this.k3 && r0Var != null) {
                            r0Var.setVisibility(4);
                        }
                    } else {
                        this.T2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (r7Var.getTag() == null && this.K2 == 0 && !this.N2) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.ALPHA, this.k3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_X, this.k3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(r0Var2, (Property<org.telegram.ui.ActionBar.r0, Float>) View.SCALE_Y, this.k3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(dhVar, (Property<dh, Float>) property, this.k3 ? 1.0f : 0.0f));
                        if (z10) {
                            arrayList.add(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.ActionBar.r0, Float>) property, this.k3 ? 0.0f : 1.0f));
                        }
                        this.T2.playTogether(arrayList);
                        this.T2.addListener(new z5(this, 10));
                        this.T2.setDuration(180L);
                        this.T2.start();
                    }
                }
            }
            z10 = false;
            z11 = this.k3;
            dh dhVar2 = this.c3;
            org.telegram.ui.ActionBar.r0 r0Var22 = this.U2;
            if (!z11) {
            }
            if (i7 != 0) {
            }
        }
        N1(i7 != 0);
        org.telegram.messenger.ij ijVar = this.B3;
        long N1 = (ijVar == null || ijVar.q5()) ? org.telegram.messenger.qp.s1(this.D3).N1(b1()) : 0L;
        vh vhVar = this.s2;
        lhVar.i(X0() + (vhVar != null ? vhVar.getSelectedItemsCount() : 0), N1, true);
        gh ghVar = this.y2;
        if (ghVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ghVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), lhVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                ghVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void L(int i7) {
        super.L(i7);
        this.s2.r(i7);
    }

    public final void L1() {
        float f10;
        vh vhVar = this.s2;
        boolean i7 = vhVar == null ? false : vhVar.i();
        ei.k kVar = this.Z2;
        kVar.setEnabled(i7);
        vh vhVar2 = this.s2;
        if (vhVar2 != null) {
            f10 = ((vhVar2.i() ? 1.0f : 0.5f) * (this.t2 == null ? 1.0f : this.U1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        vh vhVar3 = this.t2;
        if (vhVar3 != null) {
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.U1, vhVar3.i() ? 1.0f : 0.5f, f10);
        }
        this.a3 = f10;
        if (kVar != null) {
            float f11 = f10 * this.b3;
            kVar.setAlpha(f11);
            kVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void M0() {
        if (a1().a.length() <= 0) {
            return;
        }
        this.s2.a(a1().getText());
    }

    public final void M1(vh vhVar, int i7) {
        if (vhVar == null) {
            return;
        }
        dh.g gVar = this.z4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i7);
        }
        int currentItemTop = vhVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z9 = false;
        boolean z10 = vhVar == this.s2 && currentItemTop <= vhVar.getButtonsHideOffset();
        this.I1 = z10;
        if (vhVar == this.s2) {
            I1(z10, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vhVar.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        vh vhVar2 = this.s2;
        int i10 = vhVar2 == vhVar ? 0 : 1;
        if ((vhVar2 instanceof bm) || (this.t2 instanceof bm)) {
            Object obj = this.n3;
            if ((obj instanceof r1.g) && ((r1.g) obj).f) {
                z9 = true;
            }
        }
        int[] iArr = this.V3;
        int i11 = iArr[i10];
        if (i11 == D && !z9) {
            if (i7 != 0) {
                this.W3 = i11;
            }
        } else {
            this.W3 = i11;
            iArr[i10] = D;
            P1(i10);
            this.b.invalidate();
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        return (f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).Y6();
    }

    public final void N1(boolean z9) {
        fi.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.V2) == null) {
            return;
        }
        boolean z10 = this.k3 && this.Z1 && this.s2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z11 = !ChatAttachAlertPhotoLayout.U();
        uVar.f = z11;
        if (!z9) {
            ((w5) uVar.g).a(z11);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.r0 r0Var = this.W2;
        if (z9 && this.k3) {
            r0Var.setVisibility(0);
            r0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(xq.h).withEndAction(new zg(this, z10, 0)).start();
        } else {
            r0Var.setVisibility(z10 ? 0 : 8);
            r0Var.setAlpha(z10 ? 1.0f : 0.0f);
            r0Var.setScaleX(z10 ? 1.0f : 0.6f);
            r0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (!(f2Var instanceof org.telegram.ui.an)) {
            return false;
        }
        return ChatActivityEnterView.C(this.D3, ((org.telegram.ui.an) f2Var).a(), f2Var, charSequence);
    }

    public final void O1(boolean z9) {
        vh vhVar = this.a2;
        if (!z9) {
            F1(vhVar);
            return;
        }
        if (this.D1) {
            if (this.h2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.p1;
                if (f6Var == null) {
                    f6Var = this.I0;
                }
                bm bmVar = new bm(context, f6Var, this);
                bmVar.D = 0.0f;
                bmVar.E = 0.0f;
                bmVar.F = 0.0f;
                bmVar.G = 0.0f;
                bmVar.H = 0.0f;
                bmVar.I = 0.0f;
                bmVar.J = null;
                bmVar.K = false;
                bmVar.M = 0.0f;
                bmVar.Q = false;
                bmVar.S = false;
                Point point = org.telegram.messenger.g0.q;
                bmVar.T = point.y > point.x;
                bmVar.n = f6Var;
                bmVar.f = true;
                bmVar.setWillNotDraw(false);
                di diVar = bmVar.b;
                org.telegram.ui.ActionBar.y q10 = diVar.R2.q();
                TextView textView = new TextView(context);
                bmVar.y = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = bmVar.a;
                fi.w2 w2Var = new fi.w2(bmVar, context, q10, f6Var2, 2);
                diVar.R2.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var2);
                textView.setText(org.telegram.messenger.id.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.q1 q1Var = new bi.q1(bmVar, context, f6Var2, 17);
                bmVar.r = q1Var;
                q1Var.setAdapter(new org.telegram.ui.x7(bmVar, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                bmVar.s = b0Var;
                q1Var.setLayoutManager(b0Var);
                q1Var.setClipChildren(false);
                q1Var.setClipToPadding(false);
                q1Var.setOverScrollMode(2);
                q1Var.setVerticalScrollBarEnabled(false);
                am amVar = new am(bmVar, context);
                bmVar.w = amVar;
                amVar.setClipToPadding(true);
                amVar.setClipChildren(true);
                bmVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                bmVar.P = diVar.a2;
                amVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.P;
                amVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                amVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                amVar.c();
                UndoView undoView = new UndoView(context, null, false, diVar.p1);
                bmVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                bmVar.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                bmVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.h2 = bmVar;
                bmVar.bringToFront();
            }
            vh vhVar2 = this.s2;
            bm bmVar2 = this.h2;
            if (vhVar2 != bmVar2) {
                vhVar = bmVar2;
            }
            F1(vhVar);
        }
    }

    public final void P0() {
        eh ehVar = this.s3;
        if (ehVar == null) {
            return;
        }
        int childCount = ehVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ehVar.getChildAt(i7);
        }
        boolean z9 = this.b4;
        org.telegram.ui.ActionBar.r6.V(this.d3, z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.I0);
        org.telegram.ui.ActionBar.r6.V(this.i3, z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.I0);
        org.telegram.ui.ActionBar.r6.V(this.Z2, org.telegram.ui.ActionBar.k6.Gi, this.I0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.I0);
        boolean z10 = (this.n4 && w02 == this.m4) ? false : true;
        this.n4 = true;
        this.m4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.U2;
        if (z10) {
            r0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.I0), r0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        r0Var.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), false);
        r0Var.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), true);
        r0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.I0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.W2;
        if (r0Var2 != null && z10) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.Y2;
        if (r0Var3 != null) {
            if (z10) {
                r0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.I0), r0Var3.getBackground());
        }
        gh ghVar = this.y2;
        org.telegram.ui.ActionBar.f6 f6Var = ghVar.M;
        ft ftVar = ghVar.a;
        int i11 = ghVar.L;
        if (i11 == 0) {
            ftVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, f6Var));
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            ftVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
            ftVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        } else if (i11 == 2 || i11 == 3) {
            ftVar.setHintTextColor(-1929379841);
            ftVar.setTextColor(-1);
            ftVar.setCursorColor(-1);
            ftVar.setHandlesColor(-1);
            ftVar.setHighlightColor(822083583);
            ftVar.D = -1;
        } else {
            ftVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t5, f6Var));
            ftVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var));
        }
        ghVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Le, f6Var), PorterDuff.Mode.MULTIPLY));
        gt gtVar = ghVar.d;
        if (gtVar != null) {
            gtVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(ehVar, 21, org.telegram.ui.ActionBar.k6.A5, this.I0);
        int i13 = z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.I0;
        r7 r7Var = this.R2;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i13, f6Var2);
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, z9 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.I0);
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.I0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.r0);
        ri.c cVar = this.A4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.p3;
            if (fVar != null) {
                fVar.invalidate();
            }
            fh fhVar = this.q3;
            if (fhVar != null) {
                fhVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i14 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i14];
            if (vhVar != null) {
                vhVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            P(org.telegram.ui.ActionBar.k6.h5);
            return;
        }
        this.F0 = -1;
        this.G0 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.I0);
        org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0), false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(int i7) {
        int i10;
        float f10;
        org.telegram.ui.ActionBar.r0 r0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        ei.k kVar;
        float max;
        int i11;
        float f15 = this.k1.e;
        vh vhVar = i7 == 0 ? this.s2 : this.t2;
        if (vhVar == null || vhVar.getVisibility() != 0) {
            return;
        }
        int c12 = c1(i7);
        if (vhVar == this.d2 || vhVar == this.e2) {
            org.telegram.messenger.g0.L(13.0f);
            org.telegram.messenger.g0.L(11.0f);
        } else {
            org.telegram.messenger.g0.L(39.0f);
            org.telegram.messenger.g0.L(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (org.telegram.messenger.g0.Q1()) {
            i10 = 16;
        } else {
            Point point = org.telegram.messenger.g0.q;
            i10 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.R2.getAlpha();
        dh dhVar = this.c3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - dhVar.getAlpha()) * 26.0f);
        boolean z9 = this.k3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.U2;
        bi.x5 x5Var = this.I2;
        if (z9 && this.K2 == 0 && !this.N2) {
            r0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((c12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (x5Var.getAlpha() * x5Var.getMeasuredHeight())) + this.f4);
        } else {
            r0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.f4);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.W2;
        if (r0Var3 != null) {
            r0Var3.setTranslationY(r0Var2.getTranslationY());
        }
        fi.m3 m3Var = this.X2;
        if (m3Var != null) {
            m3Var.setTranslationY(r0Var2.getTranslationY());
        }
        if (this.w1 && this.m3) {
            vh vhVar2 = this.t2;
            if (vhVar2 != null && this.s2 != null) {
                f10 = Math.min(vhVar2.getTranslationY(), this.s2.getTranslationY());
            } else if (vhVar2 != null) {
                f10 = vhVar2.getTranslationY();
            }
            r0Var = this.Y2;
            if (r0Var != null) {
                r0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.f4);
            }
            float L2 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.f4) + f10) - (x5Var.getAlpha() * x5Var.getMeasuredHeight());
            this.j3 = L2;
            dhVar.setTranslationY(Math.max(this.f4, L2));
            x5Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f4, (dhVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.j3 + org.telegram.messenger.g0.L(8.0f)));
            if (this.T1) {
                J1();
            }
            U0();
            int i12 = 59;
            if (this.d2 != null) {
                if (org.telegram.messenger.g0.Q1()) {
                    i11 = 63;
                } else {
                    Point point2 = org.telegram.messenger.g0.q;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                bn bnVar = this.d2;
                if (bnVar == this.t2) {
                    f12 = (bnVar.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.U1;
                } else if (bnVar == this.s2) {
                    f12 = (bnVar.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.t2 == null ? 1.0f : 1.0f - this.U1;
                }
                if (this.e2 != null) {
                    if (org.telegram.messenger.g0.Q1()) {
                        i12 = 63;
                    } else {
                        Point point3 = org.telegram.messenger.g0.q;
                        if (point3.x > point3.y) {
                            i12 = 53;
                        }
                    }
                    bn bnVar2 = this.e2;
                    if (bnVar2 == this.t2) {
                        f14 = (bnVar2.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.U1;
                    } else if (bnVar2 == this.s2) {
                        f14 = (bnVar2.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.t2 == null ? 1.0f : 1.0f - this.U1;
                    }
                    kVar = this.Z2;
                    if (kVar != null) {
                        int measuredWidth = org.telegram.messenger.id.a0 ? (this.b.getMeasuredWidth() - kVar.getMeasuredWidth()) - org.telegram.messenger.g0.L(62.0f) : 0;
                        if (f11 <= 0.0f || f13 <= 0.0f) {
                            if (f11 <= 0.0f) {
                                f12 = 0.0f;
                            }
                            if (f13 <= 0.0f) {
                                f14 = 0.0f;
                            }
                            max = Math.max(f12, f14);
                        } else {
                            max = org.telegram.messenger.g0.T1(f12, f14, f13);
                        }
                        kVar.setTranslationY(Math.max(0.0f, max) + this.f4);
                        kVar.setTranslationX(-((measuredWidth * (1.0f - f15)) + org.telegram.messenger.g0.L((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.b3 = max2;
                    if (kVar == null) {
                        float f16 = this.a3 * max2;
                        kVar.setAlpha(f16);
                        kVar.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                kVar = this.Z2;
                if (kVar != null) {
                }
                float max22 = Math.max(f13, f11);
                this.b3 = max22;
                if (kVar == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.e2 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            kVar = this.Z2;
            if (kVar != null) {
            }
            float max222 = Math.max(f13, f11);
            this.b3 = max222;
            if (kVar == null) {
            }
        }
        f10 = 0.0f;
        r0Var = this.Y2;
        if (r0Var != null) {
        }
        float L22 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.f4) + f10) - (x5Var.getAlpha() * x5Var.getMeasuredHeight());
        this.j3 = L22;
        dhVar.setTranslationY(Math.max(this.f4, L22));
        x5Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f4, (dhVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.j3 + org.telegram.messenger.g0.L(8.0f)));
        if (this.T1) {
        }
        U0();
        int i122 = 59;
        if (this.d2 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.e2 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        kVar = this.Z2;
        if (kVar != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.b3 = max2222;
        if (kVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (org.telegram.messenger.ij.d3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z9) {
        boolean z10;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var == null || !(f2Var instanceof org.telegram.ui.an)) {
            return;
        }
        org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
        lt ltVar = this.T1 ? this.J2 : this.y2;
        String obj = ltVar != null ? ltVar.getText().toString() : null;
        if (this.B3 == null) {
            vh vhVar = this.s2;
            z10 = true;
            if (vhVar != null) {
            }
            if (bg.w.g(this.D3).e(obj, anVar.t8) <= 0) {
                org.telegram.messenger.ij ijVar = anVar.D5;
                if (ijVar != null) {
                }
            }
            this.n1.a(z10, z9);
            if (z10 || !f1()) {
            }
            v1(false, z9);
            return;
        }
        z10 = false;
        this.n1.a(z10, z9);
        if (z10) {
        }
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.l3.invalidate();
        bi.x5 x5Var = this.I2;
        x5Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            jl jlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.X();
            if (jlVar != null && jlVar.getFastScroll() != null) {
                ui0 fastScroll = jlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.T1) {
                    i7 = (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i7;
                jlVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.j1.e;
        this.q3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.k1.e))), 1.0f - ((1.0f - this.i1.e) * f10)));
    }

    public final void S0(vh vhVar) {
        boolean e10 = vhVar.e();
        lh.f fVar = this.p3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        fh fhVar = this.q3;
        if (fhVar != null) {
            fhVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void T0() {
        q00.d(this.z2, com.google.android.recaptcha.internal.a.D(this.l1.e, this.m1.e, a8.j7.a(this.n1.e), this.L3 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i7 >= vhVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i5));
                return arrayList;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null && (themeDescriptions = vhVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i7++;
        }
    }

    public final void U0() {
        lh lhVar = this.C2;
        dh dhVar = this.B2;
        bi.x5 x5Var = this.I2;
        if (x5Var == null || x5Var.getVisibility() != 0 || x5Var.getAlpha() == 0.0f) {
            dhVar.setTranslationY(this.a4);
            lhVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.i1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        lhVar.setAlpha(abs * abs * abs * abs);
        dhVar.setTranslationY(org.telegram.messenger.g0.T1(this.a4, ((x5Var.getTranslationY() + x5Var.getTop()) - dhVar.getTop()) + org.telegram.messenger.g0.L(8.0f), xq.j.getInterpolation(f10)));
    }

    public final void V0(int i7) {
        this.M2 = true;
        this.r3.setVisibility(0);
        this.y1 = true;
        this.z1 = i7;
        this.K2 = 0;
        this.w1 = false;
        this.x1 = false;
        this.A1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.e3;
        if (r0Var != null) {
            this.d3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void W0(hi.u1 u1Var) {
        String M0 = org.telegram.messenger.id.M0(2131752122, null);
        TextView textView = this.d3;
        textView.setText(M0);
        this.M2 = false;
        this.r3.setVisibility(8);
        this.K2 = 1;
        this.w1 = true;
        this.x1 = true;
        this.Z1 = false;
        this.A1 = u1Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.e3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (!(f2Var instanceof org.telegram.ui.an) || (mjVar = ((org.telegram.ui.an) f2Var).v5) == null || (kjVar = mjVar.b) == null) {
            return 0;
        }
        return kjVar.g.size();
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        vh vhVar;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        if (i7 == 2) {
            R0();
            bn bnVar = this.d2;
            if (bnVar != null && ((vhVar = this.t2) == bnVar || this.s2 == bnVar)) {
                P1(vhVar == bnVar ? 1 : 0);
            }
            bn bnVar2 = this.e2;
            if (bnVar2 != null) {
                vh vhVar2 = this.t2;
                if (vhVar2 == bnVar2 || this.s2 == bnVar2) {
                    P1(vhVar2 != bnVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 1) {
            R0();
            return;
        }
        if (i7 == 3) {
            T0();
            return;
        }
        if (i7 == 4) {
            T0();
            return;
        }
        if (i7 == 5) {
            T0();
            lh lhVar = this.C2;
            if (lhVar != null) {
                lhVar.setEphemeralFactor(f10);
                lhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        return f2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var).e : org.telegram.messenger.qp.s1(this.D3).M0(Long.valueOf(-this.Q1));
    }

    public final float Z0() {
        return r0.getMeasuredHeight() - ((1.0f - this.x2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override // org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public final void a(boolean z9) {
        if (z9) {
            this.x4 = z9;
        }
        dismiss();
    }

    public final lt a1() {
        vh vhVar;
        return (this.T1 && ((vhVar = this.s2) == this.a2 || vhVar == this.h2)) ? this.J2 : this.y2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        return f2Var instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var).a() : this.Q1;
    }

    public final int c1(int i7) {
        vh vhVar = this.t2;
        int[] iArr = this.V3;
        if (vhVar == null || !((this.s2 instanceof bm) || (vhVar instanceof bm))) {
            return iArr[i7];
        }
        return org.telegram.messenger.g0.W1(this.U1, iArr[0], iArr[1]);
    }

    public final int d1(boolean z9) {
        r7 r7Var;
        if (this.b4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hh, this.I0);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        Iterator it = this.o1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a11 = c8.j9.a(f10, 0.0f, 1.0f);
        if (z9 && (r7Var = this.R2) != null && r7Var.getVisibility() == 0) {
            a11 *= 1.0f - r7Var.getAlpha();
        }
        return i0.a.f(a11, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0), org.telegram.ui.ActionBar.k6.w0(a10 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, this.I0));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T0 && i7 != org.telegram.messenger.qs.W4 && i7 != org.telegram.messenger.qs.F1) {
            if (i7 == org.telegram.messenger.qs.f5) {
                this.B1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0();
            }
        } else {
            ai aiVar = this.u3;
            if (aiVar != null) {
                aiVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        ih ihVar;
        gh ghVar;
        if (this.s2.q() || this.I) {
            return;
        }
        vh vhVar = this.s2;
        ik ikVar = this.n2;
        int i7 = 1;
        int i10 = 0;
        boolean z9 = (vhVar != ikVar || ikVar == null || ikVar.K || ikVar.P0 == null) ? false : true;
        this.o2 = z9;
        if (!z9 && (ghVar = this.y2) != null) {
            org.telegram.messenger.g0.v1(ghVar.getEditText());
        }
        if (!this.o2 && (ihVar = this.J2) != null) {
            org.telegram.messenger.g0.v1(ihVar.getEditText());
        }
        this.r2.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        if (this.x4 || f2Var == null || this.s2.getSelectedItemsCount() <= 0 || this.w1) {
            int i11 = 0;
            while (true) {
                vh[] vhVarArr = this.q2;
                if (i11 >= vhVarArr.length) {
                    break;
                }
                vh vhVar2 = vhVarArr[i11];
                if (vhVar2 != null && this.s2 != vhVar2) {
                    vhVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0), 0), true, new mg(this, 11));
            if (f2Var != null) {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
            this.c4 = false;
            super.dismiss();
            this.x4 = false;
            return;
        }
        if (this.w4) {
            return;
        }
        this.w4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131751400, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751401, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751407, null), new mg(this, i7));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        u1Var.setOnCancelListener(new tg(this, i10));
        u1Var.N = new p0(this, 4);
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.I0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        di diVar;
        ql qlVar;
        org.telegram.messenger.we weVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        vh vhVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.H2 = 0L;
        this.C2.setEffect(0L);
        int i7 = 0;
        this.x3 = false;
        this.v3 = false;
        this.z3 = 0.0f;
        this.y3.setVisibility(8);
        RadialProgressView radialProgressView = this.w3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        dh dhVar = this.r3;
        dhVar.setAlpha(1.0f);
        dhVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.r2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((hi.c4) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.K2;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (i11 != 2) {
            if (f2Var instanceof org.telegram.ui.an) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
                chat = anVar.e;
                user = anVar.j();
            } else {
                long j3 = this.Q1;
                int i12 = this.D3;
                if (j3 >= 0) {
                    user = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(this.Q1));
                    chat = null;
                } else if (j3 < 0) {
                    chat = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-this.Q1));
                    user = null;
                }
            }
            z9 = f2Var instanceof org.telegram.ui.an;
            if ((z9 && this.K2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.F3 = org.telegram.messenger.t3.p(chat);
                    this.G3 = org.telegram.messenger.t3.u(chat);
                    this.H3 = org.telegram.messenger.t3.o(chat);
                    this.I3 = org.telegram.messenger.t3.r(chat);
                    this.J3 = !org.telegram.messenger.t3.V(chat) && org.telegram.messenger.t3.r(chat);
                    this.K3 = org.telegram.messenger.t3.q(chat);
                    this.E3 = org.telegram.messenger.t3.l(chat);
                } else {
                    this.I3 = org.telegram.messenger.t10.t(user) || org.telegram.messenger.t10.B(user);
                    this.J3 = !z9 || ((org.telegram.ui.an) f2Var).h == null;
                }
            }
            if (this.x1) {
                this.F3 = true;
                this.G3 = true;
            }
            if (this.L3) {
                this.I3 = false;
                this.J3 = false;
            }
            gh ghVar = this.y2;
            if (z9 || this.K2 == 2) {
                ghVar.setVisibility(this.N1 ? 0 : 4);
            }
            boolean z10 = this.G3;
            boolean z11 = this.F3;
            boolean z12 = this.E3;
            chatAttachAlertPhotoLayout = this.a2;
            diVar = chatAttachAlertPhotoLayout.b;
            jy jyVar = chatAttachAlertPhotoLayout.H;
            boolean z13 = !z10 || z11;
            chatAttachAlertPhotoLayout.v0 = z13;
            chatAttachAlertPhotoLayout.w0 = z10;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.z0 = z12;
            qlVar = chatAttachAlertPhotoLayout.P;
            if (qlVar != null) {
                qlVar.setAlpha(z13 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((diVar.W1 instanceof org.telegram.ui.an) && diVar.Y0() == null) && diVar.K2 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
                if (chatAttachAlertPhotoLayout.v0) {
                    jyVar.setText(org.telegram.messenger.id.M0(2131748181, null));
                    jyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Y0 = diVar.Y0();
                    jyVar.a(R.raw.media_forbidden, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2);
                    if (org.telegram.messenger.t3.P(7, Y0)) {
                        jyVar.setText(org.telegram.messenger.id.M0(2131749544, null));
                    } else if (org.telegram.messenger.g0.D1(Y0.banned_rights)) {
                        jyVar.setText(org.telegram.messenger.id.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]));
                    } else {
                        jyVar.setText(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(Y0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.t0()) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
            } else {
                chatAttachAlertPhotoLayout.U0 = MediaController.a2;
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
                for (int i13 = 0; i13 < Math.min(100, chatAttachAlertPhotoLayout.U0.e.size()); i13++) {
                    ((org.telegram.messenger.gf) chatAttachAlertPhotoLayout.U0.e.get(i13)).e();
                }
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
                chatAttachAlertPhotoLayout.X0 = false;
                if (jyVar != null) {
                    jyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            ghVar.k(true);
            this.J2.k(true);
            this.o3 = false;
            A0(false);
            if (!this.F1 || this.G1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.f2 == null) {
                    wk wkVar = new wk(this, getContext(), this.I0, (this.y1 || this.G1 || this.L3) ? false : true);
                    this.f2 = wkVar;
                    this.q2[5] = wkVar;
                    vk vkVar = this.q4;
                    if (vkVar != null) {
                        wkVar.setDelegate(vkVar);
                    } else {
                        wkVar.setDelegate(new mg(this, i7));
                    }
                }
                this.Q2 = 5L;
                vhVar = this.f2;
            } else if (this.E1) {
                r1(false);
                vhVar = this.g2;
                this.Q2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.ij ijVar = this.B3;
                if (ijVar != null) {
                    int i14 = this.A3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i14 == -1) {
                        this.M2 = true;
                        if (ijVar.J3()) {
                            p1(false);
                            vhVar = this.c2;
                            this.Q2 = 3L;
                        } else if (this.B3.V2()) {
                            r1(false);
                            vhVar = this.g2;
                            this.Q2 = 4L;
                        } else {
                            this.Q2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            p1(false);
                            vhVar = this.c2;
                            this.Q2 = 3L;
                        } else if (i14 == 1) {
                            r1(false);
                            vhVar = this.g2;
                            this.Q2 = 4L;
                        } else {
                            this.Q2 = 1L;
                            vhVar = chatAttachAlertPhotoLayout2;
                        }
                        this.M2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.M2 = this.K2 == 0 && !this.N2;
                    this.Q2 = 1L;
                }
                vhVar = chatAttachAlertPhotoLayout2;
            }
            dhVar.setVisibility(this.M2 ? 0 : 8);
            if (this.s2 != vhVar) {
                r7 r7Var = this.R2;
                if (r7Var.n0) {
                    r7Var.l(true);
                }
                this.b.removeView(this.s2);
                this.s2.u();
                this.s2.setVisibility(8);
                this.s2.t();
                this.s2 = vhVar;
                this.q0 = true;
                if (vhVar.getParent() == null) {
                    s1(this.s2);
                    this.b.addView(this.s2, 0, c8.ha.c(-1.0f, -1));
                }
                vhVar.setAlpha(1.0f);
                vhVar.setVisibility(0);
                vhVar.H(null);
                vhVar.I();
                S0(vhVar);
                r7Var.setVisibility(vhVar.j() != 0 ? 0 : 4);
                v1(this.T1, false);
                L1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.s2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            K1(0);
            this.u3.f();
            a1().setText("");
            this.t3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z9 = f2Var instanceof org.telegram.ui.an;
        if (z9) {
            if (chat != null) {
            }
            if (this.x1) {
            }
            if (this.L3) {
            }
            gh ghVar2 = this.y2;
            if (z9) {
            }
            ghVar2.setVisibility(this.N1 ? 0 : 4);
            boolean z102 = this.G3;
            boolean z112 = this.F3;
            boolean z122 = this.E3;
            chatAttachAlertPhotoLayout = this.a2;
            diVar = chatAttachAlertPhotoLayout.b;
            jy jyVar2 = chatAttachAlertPhotoLayout.H;
            if (z102) {
            }
            chatAttachAlertPhotoLayout.v0 = z13;
            chatAttachAlertPhotoLayout.w0 = z102;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.z0 = z122;
            qlVar = chatAttachAlertPhotoLayout.P;
            if (qlVar != null) {
            }
            if (diVar.W1 instanceof org.telegram.ui.an) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            ghVar2.k(true);
            this.J2.k(true);
            this.o3 = false;
            A0(false);
            if (this.F1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.f2 == null) {
            }
            this.Q2 = 5L;
            vhVar = this.f2;
            dhVar.setVisibility(this.M2 ? 0 : 8);
            if (this.s2 != vhVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.s2 != chatAttachAlertPhotoLayout3) {
            }
            K1(0);
            this.u3.f();
            a1().setText("");
            this.t3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.x1) {
        }
        if (this.L3) {
        }
        gh ghVar22 = this.y2;
        if (z9) {
        }
        ghVar22.setVisibility(this.N1 ? 0 : 4);
        boolean z1022 = this.G3;
        boolean z1122 = this.F3;
        boolean z1222 = this.E3;
        chatAttachAlertPhotoLayout = this.a2;
        diVar = chatAttachAlertPhotoLayout.b;
        jy jyVar22 = chatAttachAlertPhotoLayout.H;
        if (z1022) {
        }
        chatAttachAlertPhotoLayout.v0 = z13;
        chatAttachAlertPhotoLayout.w0 = z1022;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.z0 = z1222;
        qlVar = chatAttachAlertPhotoLayout.P;
        if (qlVar != null) {
        }
        if (diVar.W1 instanceof org.telegram.ui.an) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.h0();
        if (chatAttachAlertPhotoLayout.U0 != null) {
        }
        chatAttachAlertPhotoLayout.c0();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.F.h1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.id.M0(2131752238, null));
        weVar = chatAttachAlertPhotoLayout.U0;
        chatAttachAlertPhotoLayout.T0 = weVar;
        if (weVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        ghVar22.k(true);
        this.J2.k(true);
        this.o3 = false;
        A0(false);
        if (this.F1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.f2 == null) {
        }
        this.Q2 = 5L;
        vhVar = this.f2;
        dhVar.setVisibility(this.M2 ? 0 : 8);
        if (this.s2 != vhVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.s2 != chatAttachAlertPhotoLayout3) {
        }
        K1(0);
        this.u3.f();
        a1().setText("");
        this.t3.h1(0, 1000000);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean f0(MotionEvent motionEvent) {
        return this.s2.o(motionEvent);
    }

    public final boolean f1() {
        if (!this.T1) {
            return false;
        }
        vh vhVar = this.s2;
        return vhVar == this.a2 || vhVar == this.h2;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z9) {
        bi biVar = this.T3;
        if (biVar == null || this.o3) {
            return;
        }
        boolean f02 = biVar.f0();
        this.o3 = true;
        org.telegram.messenger.g0.i3(new bi.u7(this, editTextBoldCursor, z9, 19), f02 ? 200L : 0L);
    }

    public final void i1() {
        if (this.r0 == null || this.b == null) {
            return;
        }
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.r0);
        ri.c cVar = this.A4;
        if (cVar.b != d12) {
            cVar.a(d12);
            lh.f fVar = this.p3;
            if (fVar != null) {
                fVar.invalidate();
            }
            fh fhVar = this.q3;
            if (fhVar != null) {
                fhVar.invalidate();
            }
        }
        L1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final ik ikVar = this.n2;
        if (ikVar != null && this.s2 == ikVar) {
            final qg qgVar = new qg(this, 1);
            int i7 = ikVar.n;
            org.telegram.ui.Wallet.l9 l9Var = ikVar.R;
            di diVar = ikVar.b;
            AnimatorSet animatorSet = null;
            if (!ikVar.K && (wallettransaction = ikVar.P0) != null && ikVar.Q0 == null && ikVar.R0 == null) {
                if (ikVar.S0) {
                    org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5();
                    x5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if (f2Var != null && f2Var.presentFragment(x5Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.aa aaVar = new org.telegram.ui.Wallet.aa(diVar.c, diVar.b, l9Var.getDiamondView(), x5Var, ikVar.P0, new Runnable() { // from class: org.telegram.ui.Components.ak
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!ikVar.K) {
                                            qgVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!ikVar.K) {
                                            qgVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, diVar);
                        ikVar.R0 = aaVar;
                        animatorSet = aaVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.v6 diamondView = l9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (anVar.getCurrentAccount() == i7 && anVar.a() == ikVar.r.id && anVar.f4 == 0 && anVar.getFragmentView() != null && anVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.n6 n6Var = new org.telegram.ui.Wallet.n6(diVar.c, diVar.b, l9Var.getDiamondView(), anVar, ikVar.P0, new Runnable() { // from class: org.telegram.ui.Components.ak
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!ikVar.K) {
                                                    qgVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!ikVar.K) {
                                                    qgVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, diVar);
                                ikVar.Q0 = n6Var;
                                animatorSet = n6Var.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.z0 = animatorSet;
                this.A0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.p();
            }
            i7++;
        }
        int i10 = this.D3;
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f5);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.F1);
        this.M1 = true;
        gh ghVar = this.y2;
        if (ghVar != null) {
            ghVar.o();
        }
        ih ihVar = this.J2;
        if (ihVar != null) {
            ihVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        r71 r71Var = chatAttachAlertPhotoLayout.l0;
        bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        jl jlVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        boolean z9 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == e5Var) {
            if (z9) {
                if (jlVar.getVisibility() == 0) {
                    e5Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                e5Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (jlVar.getVisibility() == 0) {
                e5Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            e5Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == r71Var) {
            if (z9) {
                if (jlVar.getVisibility() == 0) {
                    r71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                r71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            }
            if (jlVar.getVisibility() == 0) {
                r71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            r71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != jlVar) {
                return false;
            }
            if (z9) {
                int z10 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z10, view.getMeasuredWidth(), view.getMeasuredHeight() + z10);
                return true;
            }
            int L2 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z9) {
            L = (i13 - textView.getMeasuredWidth()) / 2;
            int L3 = i12 - org.telegram.messenger.g0.L(167.0f);
            textView.setRotation(0.0f);
            if (jlVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (jlVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.t10.p(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.D3).b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.id.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.id.M0(2131753001, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.id.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, "OK"), new a3.h(this, tL_attachMenuBot, user, 24));
        jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean l0(View view, int i7, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        tl tlVar = chatAttachAlertPhotoLayout.w;
        di diVar = chatAttachAlertPhotoLayout.b;
        jl jlVar = chatAttachAlertPhotoLayout.r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z9 = i7 < i10;
        if (view != chatAttachAlertPhotoLayout.P) {
            bi.e5 e5Var = chatAttachAlertPhotoLayout.j0;
            if (view == e5Var) {
                if (z9) {
                    e5Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                e5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            r71 r71Var = chatAttachAlertPhotoLayout.l0;
            if (view == r71Var) {
                if (z9) {
                    r71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                r71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == jlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z9) {
                    jlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        jlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        tlVar.f();
                    }
                } else {
                    jlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        jlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        tlVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(diVar.T() + diVar.S() + i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i7 >= vhVarArr.length) {
                this.Z3 = true;
                return;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.A();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean m0() {
        this.a2.setTranslationX(0.0f);
        this.h3.setAlpha(0.0f);
        this.f3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.k4 = animatorSet;
        int i7 = 2;
        oh ohVar = this.i4;
        int i10 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, ohVar, 0.0f, 400.0f));
        this.k4.setDuration(400L);
        this.k4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        ohVar.getClass();
        ohVar.a(this, valueOf);
        this.k4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new og(this, i7));
        r1.g gVar = this.j4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.b, (r1.e) r1.g.p, 0.0f);
        this.j4 = gVar2;
        if (this.B3 != null) {
            gVar2.m.a(0.75f);
            this.j4.m.b(350.0f);
        } else {
            gVar2.m.a(0.75f);
            this.j4.m.b(350.0f);
        }
        this.j4.h();
        if (this.J) {
            this.c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.z0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, m6.d, this.o0 ? this.p0 : 0));
        this.z0.setDuration(400L);
        this.z0.setStartDelay(20L);
        this.z0.setInterpolator(this.k0);
        h2.f fVar = new h2.f((int[]) null);
        ng ngVar = new ng(this, fVar, this.y0, i10);
        this.j4.a(new hi.y3(i7, this, ngVar));
        this.z0.addListener(new ah.l(25, this, ngVar));
        fVar.d();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        this.z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new og(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(xq.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.Z3 = false;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.T3.f0();
        }
        ai aiVar = this.u3;
        if (aiVar != null) {
            aiVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.ij ijVar = this.B3;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        int i7 = this.D3;
        if (ijVar != null && ijVar.q5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.ij.B0(this.B3.k)) && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            org.telegram.messenger.nj njVar = anVar.w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.B3.k.suggested_post);
            }
            if (!bi.ea.T(i7, njVar.a)) {
                anVar.wc(njVar);
                return;
            }
        }
        if (this.B1 - this.C1 < 0) {
            org.telegram.messenger.g0.F3(this.q1);
            org.telegram.messenger.g0.F3(this.r1);
            try {
                this.C2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.qp.s1(i7).D3() || org.telegram.messenger.qp.s1(i7).U4 <= this.C1) {
                return;
            }
            D1(f2Var);
            return;
        }
        if (this.B3 == null && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar2 = (org.telegram.ui.an) f2Var;
            if (anVar2.c()) {
                v4.J(getContext(), anVar2.a(), new mg(this, 14), this.I0);
                return;
            }
        }
        vh vhVar = this.s2;
        if (vhVar == this.a2 || vhVar == this.h2) {
            u1(true, 0, 0, this.H2, f1());
        } else {
            if (vhVar.L(true, 0, 0, this.H2, f1())) {
                return;
            }
            this.x4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void o0() {
        if (this.s2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (i7 == 3) {
            if (this.H3 || !N0()) {
                Activity parentActivity = f2Var != null ? f2Var.getParentActivity() : null;
                if (parentActivity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                p1(true);
                return;
            }
            return;
        }
        if (i7 == 6 && org.telegram.messenger.g0.J1(f2Var)) {
            if (this.f2 == null) {
                wk wkVar = new wk(this, getContext(), this.I0, (this.y1 || this.L3) ? false : true);
                this.f2 = wkVar;
                this.q2[5] = wkVar;
                vk vkVar = this.q4;
                if (vkVar != null) {
                    wkVar.setDelegate(vkVar);
                } else if (f2Var instanceof org.telegram.ui.an) {
                    wkVar.setDelegate(new mg(this, 18));
                }
            }
            F1(this.f2);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (this.J1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        r7 r7Var = this.R2;
        if (r7Var.n0) {
            r7Var.l(true);
            return;
        }
        if (this.s2.k()) {
            return;
        }
        if (a1() == null || !a1().e) {
            super.onBackPressed();
        } else {
            a1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.s2.G(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).z0.add(this.J1);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).z0.remove(this.J1);
        }
    }

    public final void p1(boolean z9) {
        if (!this.H3 && z9) {
            cn cnVar = new cn(3, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        int i7 = 1;
        if (this.c2 == null) {
            ni niVar = new ni(getContext(), this.I0, this);
            this.c2 = niVar;
            this.q2[3] = niVar;
            niVar.setupBlurredSearchField(this.B4);
            this.c2.setDelegate(new mg(this, 15));
            if (this.y1) {
                this.c2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).e;
            ni niVar2 = this.c2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                i7 = -1;
            }
            niVar2.setMaxSelectedFiles(i7);
        }
        if (z9) {
            F1(this.c2);
        }
    }

    public final void q1() {
        if (!this.K3) {
            cn cnVar = new cn(5, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        if (this.b2 == null) {
            fj fjVar = new fj(getContext(), this.I0, this);
            this.b2 = fjVar;
            this.q2[2] = fjVar;
            fjVar.setupBlurredSearchField(this.B4);
            this.b2.setDelegate(new mh(this));
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).e;
            this.b2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled);
        }
        F1(this.b2);
    }

    public final void r1(boolean z9) {
        if (!this.E3 && z9) {
            cn cnVar = new cn(4, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        boolean z10 = false;
        if (this.g2 == null) {
            vj vjVar = new vj(this.E1 ? 2 : 0, getContext(), this.I0, this);
            this.g2 = vjVar;
            this.q2[4] = vjVar;
            vjVar.setDelegate(new nh(this));
        }
        int i7 = 1;
        if (this.y1) {
            this.g2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var instanceof org.telegram.ui.an) {
                TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).e;
                vj vjVar2 = this.g2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                    i7 = -1;
                }
                vjVar2.setMaxSelectedFiles(i7);
            } else {
                this.g2.setMaxSelectedFiles(this.M3);
                vj vjVar3 = this.g2;
                if (!this.E1 && !this.N1) {
                    z10 = true;
                }
                vjVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        vj vjVar4 = this.g2;
        vjVar4.d0 = this.E1;
        if (z9) {
            F1(vjVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.S1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.I0);
            org.telegram.ui.ActionBar.r0 r0Var = this.e3;
            if (r0Var == null || w02 == this.l4) {
                return;
            }
            this.l4 = w02;
            r0Var.setIconColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        this.C3 = false;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            this.h0 = ((org.telegram.ui.an) f2Var).T9();
        }
        L1();
        this.m3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0), 0);
            this.G0 = o4;
            org.telegram.messenger.g0.u3(this, o4, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
        }
        if (this.g4) {
            this.g4 = false;
            r7 r7Var = this.R2;
            r7Var.updateColors();
            r7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        r7 r7Var = this.R2;
        int i7 = 1;
        if (r7Var.n0) {
            r7Var.l(true);
        }
        this.b2 = null;
        this.j2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = null;
        this.g2 = null;
        this.n2 = null;
        while (true) {
            vh[] vhVarArr = this.q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.p();
                this.b.removeView(vhVarArr[i7]);
                vhVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.K();
        if (this.o2) {
            this.o2 = false;
            this.p2 = 0.0f;
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var == null || f2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = f2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void u0(boolean z9) {
        this.q0 = true;
    }

    public final boolean u1(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        if (this.C3) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            TLRPC.Chat chat = anVar.e;
            if (anVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                org.telegram.messenger.qp.s1(this.D3).d7.edit().putBoolean("silent_" + anVar.a(), !z9).commit();
            }
        }
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.n1.f) {
            this.C3 = true;
            this.T3.o1(7, true, z9, i7, i10, j3, z10, false, 0L);
            return true;
        }
        long b12 = b1();
        vh vhVar = this.s2;
        return v4.Y(this.D3, b12, X0() + (vhVar != null ? vhVar.getSelectedItemsCount() : 1), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ah
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                di diVar = di.this;
                diVar.C3 = true;
                diVar.T3.o1(7, true, z9, i7, i10, j3, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        if (this.W1 instanceof org.telegram.ui.an) {
            String[] strArr = MediaController.V1;
        } else {
            String[] strArr2 = MediaController.V1;
        }
        this.s2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754921, "AccDescrAttachButton"));
        this.m3 = true;
        if (this.G3 || this.F3) {
            return;
        }
        N0();
    }

    public final void v1(boolean z9, boolean z10) {
        this.i1.a(z9, z10);
        lt a12 = a1();
        this.T1 = z9;
        lt a13 = a1();
        final boolean z11 = this.x2.getTag() != null;
        vh vhVar = this.s2;
        final boolean z12 = this.T1 && (vhVar == this.a2 || vhVar == this.h2);
        bi.x5 x5Var = this.I2;
        kg.j jVar = this.w2;
        if (z10) {
            x5Var.setVisibility(z11 ? 0 : 8);
            ViewPropertyAnimator duration = x5Var.animate().alpha((z12 && z11) ? 1.0f : 0.0f).setDuration(320L);
            xq xqVar = xq.h;
            final int i7 = 0;
            duration.setInterpolator(xqVar).setUpdateListener(new og(this, i7)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.pg
                public final /* synthetic */ di b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            di diVar = this.b;
                            if (!z12 || !z11) {
                                diVar.I2.setVisibility(8);
                            }
                            diVar.Q1();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.w2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z12 || !z11) ? jVar.getMeasuredHeight() : 0.0f).alpha((z12 || !z11) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new og(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.pg
                public final /* synthetic */ di b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            di diVar = this.b;
                            if (!z12 || !z11) {
                                diVar.I2.setVisibility(8);
                            }
                            diVar.Q1();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.w2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            x5Var.setVisibility((z12 && z11) ? 0 : 8);
            x5Var.setAlpha((z12 && z11) ? 1.0f : 0.0f);
            Q1();
            jVar.setAlpha((z12 || !z11) ? 0.0f : 1.0f);
            jVar.setTranslationY((z12 || !z11) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z12 || !z11) ? 8 : 0);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(r5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new qg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.ij ijVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ijVar != null && (chatAttachAlertPhotoLayout = this.a2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.B3 == ijVar && this.A3 == i7) {
            return;
        }
        this.B3 = ijVar;
        if (ijVar != null && ijVar.A2()) {
            i7 = this.B3.J3() ? 2 : this.B3.V2() ? 1 : 0;
        }
        this.A3 = i7;
        if (this.B3 != null) {
            this.M3 = 1;
            this.N3 = false;
        } else {
            this.M3 = -1;
            this.N3 = true;
        }
        this.u3.f();
        K1(0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.b.getTranslationY() - this.p2;
        this.p2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        ik ikVar = this.n2;
        if (ikVar != null) {
            ikVar.setSendTransitionProgress(f10);
        }
        if (this.o0) {
            i7 = Math.round((1.0f - f10) * this.p0);
        } else {
            i7 = 0;
        }
        this.Y.setAlpha(i7);
        this.C0 = 1.0f - f10;
        this.c.invalidate();
    }

    public final void y1(int i7, boolean z9) {
        if (this.B3 != null) {
            return;
        }
        this.M3 = i7;
        this.N3 = z9;
    }

    public final void z1(float f10) {
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0), Math.min(org.telegram.messenger.qs.e4, Math.max(0, (int) (f10 * 255.0f))));
        this.G0 = o4;
        org.telegram.messenger.g0.u3(this, o4, false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
        this.c.invalidate();
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    public di(Activity activity, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        this(activity, f2Var, z9, z10, true, null);
    }
}
