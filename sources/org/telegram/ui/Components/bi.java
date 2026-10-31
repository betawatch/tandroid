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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class bi extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us, org.telegram.ui.ActionBar.t2, fe.e {
    public static final /* synthetic */ int E4 = 0;
    public org.telegram.messenger.j20 A1;
    public final int[] A2;
    public int A3;
    public final hi.c A4;
    public int B1;
    public final ah B2;
    public org.telegram.messenger.jj B3;
    public final tg.b B4;
    public int C1;
    public final ih C2;
    public boolean C3;
    public final tg.b C4;
    public boolean D1;
    public final TextPaint D2;
    public final int D3;
    public final qg D4;
    public boolean E1;
    public final RectF E2;
    public boolean E3;
    public boolean F1;
    public final Paint F2;
    public boolean F3;
    public boolean G1;
    public AnimatorSet G2;
    public boolean G3;
    public z30 H1;
    public long H2;
    public boolean H3;
    public boolean I1;
    public final fg.i I2;
    public boolean I3;
    public final zc0 J1;
    public final fh J2;
    public boolean J3;
    public kn K1;
    public int K2;
    public boolean K3;
    public b40 L1;
    public ct L2;
    public boolean L3;
    public boolean M1;
    public boolean M2;
    public int M3;
    public boolean N1;
    public boolean N2;
    public boolean N3;
    public nj O1;
    public boolean O2;
    public boolean O3;
    public ji P1;
    public final float P2;
    public float P3;
    public long Q1;
    public long Q2;
    public float Q3;
    public boolean R1;
    public final kg.g1 R2;
    public ValueAnimator R3;
    public final tg.c S1;
    public AnimatorSet S2;
    public int S3;
    public boolean T1;
    public AnimatorSet T2;
    public ai T3;
    public float U1;
    public final org.telegram.ui.ActionBar.t0 U2;
    public wm U3;
    public final mh V1;
    public final ob0 V2;
    public final int[] V3;
    public final org.telegram.ui.ActionBar.k2 W1;
    public final org.telegram.ui.ActionBar.t0 W2;
    public int W3;
    public final boolean X1;
    public vh.p2 X2;
    public float X3;
    public pe Y1;
    public final org.telegram.ui.ActionBar.t0 Y2;
    public float Y3;
    public boolean Z1;
    public final bi.j6 Z2;
    public boolean Z3;
    public final ChatAttachAlertPhotoLayout a2;
    public float a3;
    public float a4;
    public ej b2;
    public float b3;
    public final boolean b4;
    public mi c2;
    public final ah c3;
    public boolean c4;
    public jn d2;
    public final TextView d3;
    public final ArrayList d4;
    public jn e2;
    public final org.telegram.ui.ActionBar.t0 e3;
    public final Rect e4;
    public bl f2;
    public final LinearLayout f3;
    public float f4;
    public xj g2;
    public final ImageView g3;
    public boolean g4;
    public jm h2;
    public final LinearLayout h3;
    public int h4;
    public final fe.b i1;
    public qi i2;
    public final TextView i3;
    public final mh i4;
    public final fe.b j1;
    public ag.h1 j2;
    public float j3;
    public o1.j j4;
    public final fe.b k1;
    public yj k2;
    public boolean k3;
    public AnimatorSet k4;
    public final fe.b l1;
    public yj l2;
    public final ph l3;
    public int l4;
    public final fe.b m1;
    public bi.t m2;
    public boolean m3;
    public int m4;
    public final fe.b n1;
    public kk n2;
    public Object n3;
    public boolean n4;
    public final fe.m o1;
    public boolean o2;
    public boolean o3;
    public boolean o4;
    public org.telegram.ui.sn p1;
    public float p2;
    public final bh.i p3;
    public boolean p4;
    public final f6 q1;
    public final uh[] q2;
    public final ch q3;
    public wk q4;
    public final f6 r1;
    public final LongSparseArray r2;
    public final ah r3;
    public boolean r4;
    public final ImageView s1;
    public uh s2;
    public final bh s3;
    public boolean s4;
    public final org.telegram.ui.ActionBar.y2 t1;
    public uh t2;
    public final s4.a0 t3;
    public File t4;
    public final ImageView u1;
    public final vg.f u2;
    public final zh u3;
    public double[] u4;
    public final org.telegram.ui.ActionBar.y2 v1;
    public final vg.f v2;
    public boolean v3;
    public boolean v4;
    public boolean w1;
    public final ag.q w2;
    public final RadialProgressView w3;
    public boolean w4;
    public boolean x1;
    public final ah x2;
    public boolean x3;
    public boolean x4;
    public boolean y1;
    public final dh y2;
    public final f6 y3;
    public oh y4;
    public int z1;
    public final ImageView z2;
    public float z3;
    public final tg.f z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        org.telegram.ui.ActionBar.t0 t0Var;
        bi.j6 j6Var;
        boolean z13;
        int i10;
        float f7;
        int i11 = 0;
        gr grVar = gr.h;
        this.i1 = new fe.b(0, this, grVar, 380L, false);
        this.j1 = new fe.b(1, this, grVar, 380L, false);
        this.k1 = new fe.b(2, this, grVar, 380L, false);
        this.l1 = new fe.b(3, this, grVar, 380L, false);
        this.m1 = new fe.b(4, this, grVar, 380L, true);
        this.n1 = new fe.b(5, this, grVar, 320L, false);
        fe.m mVar = new fe.m(new ig(this, 2), grVar, 380L);
        this.o1 = mVar;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.U1 = 0.0f;
        this.V1 = new mh(this, 0);
        this.Z1 = false;
        uh[] uhVarArr = new uh[12];
        this.q2 = uhVarArr;
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
        int i12 = org.telegram.messenger.d20.s0;
        this.D3 = i12;
        this.E3 = true;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.M3 = -1;
        this.N3 = true;
        this.S3 = org.telegram.messenger.i0.L(85.0f);
        new DecelerateInterpolator();
        this.V3 = new int[2];
        new Paint(1);
        this.c4 = false;
        ArrayList arrayList = new ArrayList();
        this.d4 = arrayList;
        Rect rect = new Rect();
        this.e4 = rect;
        this.i4 = new mh(this, 1);
        this.o4 = true;
        this.p4 = false;
        this.w4 = false;
        this.x4 = false;
        this.y = true;
        hi.c cVar = new hi.c();
        this.A4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0));
        this.X0.E.add(new ei.p(cVar, new ig(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.tz.f()) {
            this.z4 = null;
            this.B4 = new tg.b(cVar);
            this.C4 = new tg.b(cVar);
        } else {
            tg.f fVar = new tg.f(false);
            this.z4 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(cVar);
            fVar2.f = cVar;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            fVar3.f = cVar;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2);
            this.B4 = bVar;
            bVar.i = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.b = L;
            bVar.c = L;
            tg.b bVar2 = new tg.b(fVar3);
            this.C4 = bVar2;
            bVar2.i = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.b = L2;
            bVar2.c = L2;
        }
        tg.b bVar3 = new tg.b(cVar);
        this.D4 = new qg(this, i11);
        this.b4 = z10;
        this.X1 = (k2Var instanceof org.telegram.ui.un) && k2Var.isInBubbleMode();
        this.k0 = new OvershootInterpolator(0.7f);
        this.W1 = k2Var;
        this.F = true;
        this.y0 = this;
        org.telegram.messenger.zs.f(i12).c(this, org.telegram.messenger.zs.T0);
        org.telegram.messenger.zs.f(i12).c(this, org.telegram.messenger.zs.W4);
        org.telegram.messenger.zs.f(i12).c(this, org.telegram.messenger.zs.f5);
        org.telegram.messenger.zs.f(i12).c(this, org.telegram.messenger.zs.F1);
        arrayList.add(rect);
        ph phVar = new ph(this, context);
        this.l3 = phVar;
        phVar.setDelegate(new qh(this));
        this.b = phVar;
        phVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i13 = this.t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        kg.g1 g1Var = new kg.g1(this, context, p6Var, 2);
        this.R2 = g1Var;
        g1Var.b1 = true;
        g1Var.setForcedMenuWidth(org.telegram.messenger.i0.L(46.0f));
        g1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        int i14 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i14, p6Var);
        int i15 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, i15, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i14, p6Var);
        g1Var.setOccupyStatusBar(true);
        g1Var.setAlpha(0.0f);
        g1Var.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 3));
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
        this.U2 = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setIcon(R.drawable.ic_ab_other);
        t0Var2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        t0Var2.setVisibility(4);
        t0Var2.setAlpha(0.0f);
        t0Var2.setScaleX(0.6f);
        t0Var2.setScaleY(0.6f);
        t0Var2.setSubMenuOpenSide(2);
        t0Var2.setDelegate(new ig(this, 10));
        t0Var2.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
        t0Var2.setTranslationX(org.telegram.messenger.i0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 6, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var2, h02, null, N, p6Var);
        final int i16 = 5;
        t0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i16) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i17 = 0; i17 < chatAttachAlertPhotoLayout.E.getChildCount(); i17++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i17);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var3 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var3.getWidth() / 2.0f) + t0Var3.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
        this.W2 = t0Var3;
        t0Var3.setLongClickEnabled(false);
        ob0 ob0Var = new ob0();
        this.V2 = ob0Var;
        t0Var3.setIcon(ob0Var);
        t0Var3.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        t0Var3.setVisibility(8);
        t0Var3.setAlpha(0.0f);
        t0Var3.setScaleX(0.6f);
        t0Var3.setScaleY(0.6f);
        t0Var3.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
        t0Var3.setTranslationX(-org.telegram.messenger.i0.L(3.0f));
        final int i17 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 6, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(t0Var3, h03, null, N2, p6Var);
        t0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i17) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        bi.j6 j6Var2 = new bi.j6(this, context);
        org.telegram.ui.ActionBar.a7.V(j6Var2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        j6Var2.setText(org.telegram.messenger.cd.L0(2131751753, null));
        j6Var2.setTypeface(org.telegram.messenger.i0.o());
        j6Var2.setTextSize(1, 14.0f);
        j6Var2.setVisibility(4);
        j6Var2.setAlpha(0.0f);
        j6Var2.setGravity(17);
        j6Var2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        j6Var2.setTranslationX(-org.telegram.messenger.i0.L(12.0f));
        final int i18 = 7;
        j6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i18) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        w7.e6.a(j6Var2);
        this.Z2 = j6Var2;
        K1();
        if (k2Var != null) {
            t0Var = t0Var3;
            j6Var = j6Var2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.t0 t0Var4 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
            this.Y2 = t0Var4;
            t0Var4.setLongClickEnabled(false);
            t0Var4.setIcon(R.drawable.outline_header_search);
            t0Var4.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
            t0Var4.setVisibility(4);
            z13 = false;
            t0Var4.setAlpha(0.0f);
            t0Var4.setTranslationX(-org.telegram.messenger.i0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 6, -1);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
            t0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.a7.k(t0Var4, h04, null, N3, p6Var);
            i10 = 3;
            t0Var4.setOnClickListener(new org.telegram.ui.ActionBar.c0(i10, this, z11));
        } else {
            t0Var = t0Var3;
            j6Var = j6Var2;
            z13 = false;
            i10 = 3;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.t0 t0Var5 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
        this.e3 = t0Var5;
        t0Var5.setLongClickEnabled(false);
        t0Var5.setIcon(R.drawable.ic_ab_other);
        t0Var5.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        final int i19 = 8;
        t0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 3, -1);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(t0Var5, h05, null, N4, p6Var);
        final int i20 = 2;
        t0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.cd.L0(2131744895, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar = biVar.y2;
                        if (dhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar.getText());
                            final int i21 = 0;
                            g0Var.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            dh dhVar2 = biVar.y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar = biVar.J2;
                                            fhVar.setText(charSequence);
                                            fhVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            boolean z14 = biVar.B3 != null;
                            sg sgVar = new sg(biVar, 0);
                            g0Var.d2 = j10;
                            g0Var.e2 = z14;
                            g0Var.f2 = sgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar = biVar2.J2;
                        if (fhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar.getText());
                            final int i22 = 1;
                            g0Var2.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i22) {
                                        case 0:
                                            dh dhVar2 = biVar2.y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar2.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            boolean z15 = biVar2.B3 != null;
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.d2 = j11;
                            g0Var2.e2 = z15;
                            g0Var2.f2 = sgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i23 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i23;
                        v13.n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.q;
                        int i24 = point.x;
                        int i25 = point.y;
                        if (i24 > 1080 || i25 > 1080) {
                            float min = Math.min(i24, i25) / 1080.0f;
                            i24 = (int) (i24 * min);
                            i25 = (int) (i25 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i24, i25, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new th(biVar3, efVar), k2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var2 : null);
                        if (biVar3.x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
                            break;
                        }
                        break;
                }
            }
        });
        t0Var5.setMenuYOffset(org.telegram.messenger.i0.L(-12.0f));
        t0Var5.setAdditionalXOffset(org.telegram.messenger.i0.L(12.0f));
        t0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i19) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        final int i21 = 0;
        ah ahVar = new ah(this, context, i21);
        this.c3 = ahVar;
        ahVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i21) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        ahVar.setAlpha(0.0f);
        ahVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.d3 = textView;
        org.telegram.messenger.m5.m(textView, i14, p6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.g3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(imageView, mutate, i14, p6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.b6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ahVar.addView(linearLayout, w7.b6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.a7.y(imageView2, mutate2, i14, p6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.b6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.i3 = textView2;
        org.telegram.messenger.m5.m(textView2, i14, p6Var, 1, 16.0f);
        org.telegram.messenger.m5.l(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.b6.r(-2, -2, 16));
        ahVar.addView(linearLayout2, w7.b6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, p6Var);
        this.a2 = chatAttachAlertPhotoLayout;
        uhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.s2 = chatAttachAlertPhotoLayout;
        this.Q2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, w7.b6.c(-1.0f, -1));
        bh.i iVar = new bh.i(context);
        this.p3 = iVar;
        iVar.setup(bVar3);
        iVar.setFadeTopAlpha(0);
        iVar.setFadeHeightTop(org.telegram.messenger.i0.L(48.0f));
        iVar.setFadeHeightBottom(org.telegram.messenger.i0.L(48.0f));
        iVar.setFadeZoneTop(org.telegram.messenger.i0.L(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m);
        this.b.addView(iVar, w7.b6.g());
        this.b.addView(ahVar, w7.b6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        fg.i iVar2 = new fg.i(context);
        this.I2 = iVar2;
        this.b.addView(iVar2, w7.b6.e(-1, -2, 55));
        this.b.addView(g1Var, w7.b6.c(-2.0f, -1));
        this.b.addView(t0Var2, w7.b6.e(48, 48, 53));
        this.b.addView(t0Var, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var6 = this.Y2;
        if (t0Var6 != null) {
            this.b.addView(t0Var6, w7.b6.e(48, 48, 53));
        }
        ahVar.addView(t0Var5, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(j6Var, w7.b6.e(-2, 48, 53));
        ah ahVar2 = new ah(this, context, 1);
        this.r3 = ahVar2;
        bh bhVar = new bh(context, 0);
        this.s3 = bhVar;
        bhVar.setClipChildren(true);
        bhVar.setClipToPadding(false);
        zh zhVar = new zh(this, context);
        this.u3 = zhVar;
        bhVar.setAdapter(zhVar);
        s4.a0 a0Var = new s4.a0(0, false);
        this.t3 = a0Var;
        bhVar.setLayoutManager(a0Var);
        bhVar.setVerticalScrollBarEnabled(false);
        bhVar.setHorizontalScrollBarEnabled(false);
        bhVar.setItemAnimator(null);
        bhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.a7.m(bhVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        bhVar.y2 = true;
        bhVar.setOverScrollMode(2);
        tg.b bVar4 = this.B4;
        ei.r rVar = this.X0;
        bVar4.h = rVar;
        this.C4.h = rVar;
        bVar3.h = rVar;
        ch chVar = new ch(this, context, 0);
        this.q3 = chVar;
        tg.c cVar2 = new tg.c(bVar3.c(chVar, null, false));
        this.S1 = cVar2;
        if (org.telegram.messenger.tz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        cVar2.b(org.telegram.messenger.i0.L(72.0f), true);
        this.b.addView(chVar, w7.b6.g());
        vg.f c10 = this.B4.c(ahVar2, w7.b9.f(p6Var), false);
        c10.q(org.telegram.messenger.i0.L(28.0f));
        c10.p(org.telegram.messenger.i0.L(7.0f));
        ahVar2.setBackground(c10);
        bhVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f));
        bhVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.i0.L(11.0f);
        float L4 = org.telegram.messenger.i0.L(28.0f);
        bi.d2 d2Var = rf.e0.a;
        bhVar.setOutlineProvider(new rf.c0(L3, L4));
        bhVar.setImportantForAccessibility(1);
        ahVar2.addView(bhVar, w7.b6.g());
        this.b.addView(ahVar2, w7.b6.e(-1, 70, 81));
        bhVar.setOnItemClickListener(new mg.q0(8, this, p6Var));
        bhVar.setOnItemLongClickListener(new ig(this, 3));
        f6 f6Var = new f6(context, true, false, true);
        this.y3 = f6Var;
        f6Var.setVisibility(8);
        f6Var.setAlpha(0.0f);
        f6Var.setGravity(17);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int L5 = org.telegram.messenger.i0.L(16.0f);
        f6Var.setPadding(L5, 0, L5, 0);
        f6Var.setTextSize(org.telegram.messenger.i0.L(f7));
        final int i22 = 1;
        f6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i22) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout2.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(f6Var, w7.b6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.w3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, w7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.z2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i23 = org.telegram.ui.ActionBar.t6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView3, i23, p6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i24 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i24) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout2.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        ah ahVar3 = new ah(this, context, i24);
        this.x2 = ahVar3;
        ag.q qVar = new ag.q(this, context);
        this.w2 = qVar;
        ahVar3.addView(qVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        vg.f c11 = this.C4.c(phVar, w7.b9.o(p6Var), false);
        this.u2 = c11;
        c11.O = true;
        c11.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
        c11.t(org.telegram.messenger.i0.L(32.0f));
        c11.M.g = 0.4f;
        c11.m();
        vg.f c12 = this.B4.c(qVar, w7.b9.o(p6Var), false);
        this.v2 = c12;
        c12.q(org.telegram.messenger.i0.L(22.0f));
        c12.p(org.telegram.messenger.i0.L(7.0f));
        qVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(5.0f));
        ahVar3.setWillNotDraw(false);
        ahVar3.setVisibility(4);
        ahVar3.setAlpha(0.0f);
        this.b.addView(ahVar3, w7.b6.e(-1, -2, 83));
        ahVar3.setOnTouchListener(new org.telegram.ui.ActionBar.n2(12));
        f6 f6Var2 = new f6(context, false, false, false);
        this.q1 = f6Var2;
        f6Var2.setAllowCancel(true);
        f6Var2.setScaleProperty(0.6f);
        f6Var2.setVisibility(8);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        int i25 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i25, p6Var);
        f6Var2.setTypeface(org.telegram.messenger.i0.o());
        f6Var2.setGravity(17);
        qVar.addView(f6Var2, w7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.s1 = imageView4;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(context);
        this.t1 = y2Var;
        imageView4.setImageDrawable(y2Var);
        imageView4.setScaleType(scaleType);
        int i26 = org.telegram.ui.ActionBar.t6.Kl;
        org.telegram.ui.ActionBar.a7.t(imageView4, i26, p6Var, mode);
        int i27 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i27, this.I0), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i27);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(imageView4, h06, null, N5, p6Var);
        qVar.addView(imageView4, w7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView4);
        final int i28 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar = biVar.y2;
                        if (dhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar.getText());
                            final int i212 = 0;
                            g0Var.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            dh dhVar2 = biVar.y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            boolean z14 = biVar.B3 != null;
                            sg sgVar = new sg(biVar, 0);
                            g0Var.d2 = j10;
                            g0Var.e2 = z14;
                            g0Var.f2 = sgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar = biVar2.J2;
                        if (fhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar.getText());
                            final int i222 = 1;
                            g0Var2.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            dh dhVar2 = biVar2.y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar2.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            boolean z15 = biVar2.B3 != null;
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.d2 = j11;
                            g0Var2.e2 = z15;
                            g0Var2.f2 = sgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i232 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i232;
                        v13.n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.q;
                        int i242 = point.x;
                        int i252 = point.y;
                        if (i242 > 1080 || i252 > 1080) {
                            float min = Math.min(i242, i252) / 1080.0f;
                            i242 = (int) (i242 * min);
                            i252 = (int) (i252 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i242, i252, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new th(biVar3, efVar), k2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var2 : null);
                        if (biVar3.x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
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
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0);
        this.B1 = r12.getUserConfig().q() ? r12.V4 : r12.U4;
        dh dhVar = new dh(this, context, phVar, p6Var);
        this.y2 = dhVar;
        dhVar.J = true;
        dhVar.setHint(org.telegram.messenger.cd.L0(2131754454, "AddCaption"));
        dhVar.s();
        dhVar.getEditText().setLayoutParams(w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        dhVar.getEditText().addTextChangedListener(new eh(this, 0));
        qVar.addView(dhVar, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        qVar.setClipChildren(false);
        ahVar3.setClipChildren(false);
        dhVar.setClipChildren(false);
        iVar2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        iVar2.setWillNotDraw(false);
        fh fhVar = new fh(this, context, phVar, p6Var);
        this.J2 = fhVar;
        fhVar.J = true;
        fhVar.getEditText().addTextChangedListener(new hh(this, k2Var));
        fhVar.getEditText().setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        fhVar.getEditText().setLayoutParams(w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        fhVar.getEditText().setTextSize(1, 17.0f);
        fhVar.getEmojiButton().setLayoutParams(w7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        fhVar.setHint(org.telegram.messenger.cd.L0(2131754454, "AddCaption"));
        iVar2.addView(fhVar, w7.b6.e(-1, -2, org.telegram.messenger.zs.E1));
        iVar2.setAlpha(0.0f);
        iVar2.setVisibility(8);
        dhVar.addView(imageView3, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        vg.f c13 = this.B4.c(iVar2, w7.b9.o(p6Var), false);
        c13.q(org.telegram.messenger.i0.L(22.0f));
        c13.p(org.telegram.messenger.i0.L(7.0f));
        iVar2.setBackground(c13);
        iVar2.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(9.0f));
        f6 f6Var3 = new f6(context, false, false, false);
        this.r1 = f6Var3;
        f6Var3.setScaleProperty(0.6f);
        f6Var3.setVisibility(8);
        f6Var3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var3, i25, p6Var);
        f6Var3.setTypeface(org.telegram.messenger.i0.o());
        f6Var3.setGravity(17);
        f6Var3.setAllowCancel(true);
        iVar2.addView(f6Var3, w7.b6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.a7.t(imageView5, org.telegram.ui.ActionBar.t6.Le, p6Var, mode2);
        fhVar.addView(imageView5, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i29 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i29) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout2.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
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
        org.telegram.ui.ActionBar.y2 y2Var2 = new org.telegram.ui.ActionBar.y2(context);
        this.v1 = y2Var2;
        imageView6.setImageDrawable(y2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView6, i26, p6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i27, this.I0), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i27);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.a7.k(imageView6, h07, null, N6, p6Var);
        iVar2.addView(imageView6, w7.b6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView6);
        final int i30 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i30) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar2 = biVar.y2;
                        if (dhVar2 != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar2.getText());
                            final int i212 = 0;
                            g0Var.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            dh dhVar22 = biVar.y2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            boolean z14 = biVar.B3 != null;
                            sg sgVar = new sg(biVar, 0);
                            g0Var.d2 = j10;
                            g0Var.e2 = z14;
                            g0Var.f2 = sgVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar2 = biVar2.J2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar2.getText());
                            final int i222 = 1;
                            g0Var2.b2 = new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.rg
                                @Override // org.telegram.messenger.q20
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            dh dhVar22 = biVar2.y2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar22 = biVar2.J2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            boolean z15 = biVar2.B3 != null;
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.d2 = j11;
                            g0Var2.e2 = z15;
                            g0Var2.f2 = sgVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i232 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i232;
                        v13.n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.q;
                        int i242 = point.x;
                        int i252 = point.y;
                        if (i242 > 1080 || i252 > 1080) {
                            float min = Math.min(i242, i252) / 1080.0f;
                            i242 = (int) (i242 * min);
                            i252 = (int) (i252 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i242, i252, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new th(biVar3, efVar), k2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var2 : null);
                        if (biVar3.x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
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
        ah ahVar4 = new ah(this, context, 3);
        this.B2 = ahVar4;
        ahVar4.setFocusable(true);
        ahVar4.setFocusableInTouchMode(true);
        ahVar4.setVisibility(4);
        ahVar4.setScaleX(0.2f);
        ahVar4.setScaleY(0.2f);
        ahVar4.setAlpha(0.0f);
        ahVar4.setClipChildren(false);
        ahVar4.setClipToPadding(false);
        this.b.addView(ahVar4, w7.b6.e(org.telegram.messenger.zs.v1, 50, 85));
        ih ihVar = new ih(context, p6Var, this);
        this.C2 = ihVar;
        ihVar.setImportantForAccessibility(2);
        ahVar4.addView(ihVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        ihVar.setTranslationX(this.t0);
        int L6 = org.telegram.messenger.i0.L(52.0f);
        int L7 = org.telegram.messenger.i0.L(38.0f);
        ihVar.I = L6;
        ihVar.J = L7;
        float L8 = org.telegram.messenger.i0.L(7.0f);
        float L9 = org.telegram.messenger.i0.L(6.0f);
        ihVar.M = L8;
        ihVar.N = L9;
        ihVar.h0 = true;
        final int i31 = 4;
        ihVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ng
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh.i3 i3Var;
                switch (i31) {
                    case 0:
                        bi biVar = this.b;
                        biVar.N1(biVar.s2 != biVar.h2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.T1;
                        if (!z14) {
                            biVar3.u1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.T1;
                        if (z15) {
                            biVar4.u1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.m1();
                        break;
                    case 5:
                        this.b.U2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z16 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i172 = 0; i172 < chatAttachAlertPhotoLayout2.E.getChildCount(); i172++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i172);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(!T ? 2131748842 : 2131748843, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.l0 = new cd(5, biVar5, p2Var2);
                            biVar5.b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            break;
                        }
                        break;
                    case 7:
                        uh uhVar = this.b.s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.e3.U(null, null);
                        break;
                }
            }
        });
        ihVar.setOnLongClickListener(new org.telegram.ui.bg(this, context, p6Var, k2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        ch chVar2 = new ch(this, context, 1);
        chVar2.setAlpha(0.0f);
        chVar2.setScaleX(0.2f);
        chVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.F0 = -1;
        }
        zj0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        tg.b bVar5 = this.B4;
        wg.d o10 = w7.b9.o(p6Var);
        tk0 tk0Var = fastScroll.p0;
        vg.f c14 = bVar5.c(tk0Var.d1, o10, false);
        fastScroll.e0 = c14;
        c14.p(org.telegram.messenger.i0.L(4.0f));
        fastScroll.e0.q(org.telegram.messenger.i0.L(24.0f));
        vg.f c15 = bVar5.c(tk0Var.d1, o10, false);
        fastScroll.f0 = c15;
        c15.p(org.telegram.messenger.i0.L(6.0f));
        fastScroll.f0.t(org.telegram.messenger.i0.L(4.0f));
        fastScroll.f0.q(org.telegram.messenger.i0.L(f7));
        zc0 zc0Var = new zc0(context);
        this.J1 = zc0Var;
        this.b.addView(zc0Var, w7.b6.c(-1.0f, -1));
        wg.d dVar = new wg.d(p6Var);
        dVar.e = new ig(this, 5);
        dVar.c = new ig(this, 6);
        dVar.d = new ig(this, 7);
        dVar.b = new ig(this, 8);
        float N7 = org.telegram.messenger.i0.N(3.3333333f);
        float N8 = org.telegram.messenger.i0.N(0.6666667f);
        dVar.n = N7;
        dVar.r = N8;
        float N9 = org.telegram.messenger.i0.N(1.0f);
        float N10 = org.telegram.messenger.i0.N(0.6666667f);
        dVar.f = N9;
        dVar.h = N10;
        g1Var.M(this.B4, dVar, false);
        mVar.l(1L, false);
        this.X0.i(this.b);
        ei.r rVar2 = this.X0;
        rVar2.a = new ig(this, 9);
        rVar2.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
    }

    public static void I0(bi biVar) {
        kg.g1 g1Var = biVar.R2;
        bh.i iVar = biVar.p3;
        if (iVar == null || g1Var == null) {
            return;
        }
        uh uhVar = biVar.t2;
        if (uhVar == null) {
            uhVar = biVar.s2;
        }
        int i10 = 0;
        boolean z10 = uhVar != null && (uhVar instanceof kk);
        org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        if (!z10 && g1Var.getVisibility() == 0) {
            i10 = (int) (g1Var.getAlpha() * (a2 ? org.telegram.messenger.zs.e4 : org.telegram.messenger.zs.q2));
        }
        iVar.setFadeTopAlpha(i10);
    }

    public static void K0(bi biVar) {
        oh ohVar = new oh(biVar, biVar.getContext(), biVar.Q1, LaunchActivity.Q(), biVar.I0, 0);
        biVar.y4 = ohVar;
        ohVar.p(new k2.m0(biVar));
        ViewGroup viewGroup = biVar.b;
        viewGroup.addView(biVar.y4, viewGroup.indexOfChild(biVar.x2), w7.b6.e(-1, -1, 83));
        oh ohVar2 = biVar.y4;
        ohVar2.getAdapter().c = false;
        ohVar2.getAdapter().d = false;
        ohVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            ohVar2.getAdapter().m0 = false;
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            zf.x0 adapter = ohVar2.getAdapter();
            unVar.j();
            TLRPC.Chat chat = unVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            ohVar2.getAdapter().W(unVar.p8);
            ohVar2.getAdapter().e0 = unVar.e != null;
        } else {
            ohVar2.getAdapter().m0 = true;
            ohVar2.getAdapter().W(null);
            ohVar2.getAdapter().e0 = false;
        }
        ohVar2.getAdapter().f0 = false;
        biVar.I1();
    }

    public static int L0(bi biVar) {
        uh uhVar = biVar.s2;
        jn jnVar = biVar.d2;
        if (uhVar == jnVar && jnVar.E != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = biVar.e2;
        return (uhVar != jnVar2 || jnVar2.E == null) ? biVar.T1 ? biVar.J2.getEmojiPadding() : biVar.y2.getEmojiPadding() : jnVar2.getEmojiPadding();
    }

    public static boolean f1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.h20.B(user) || org.telegram.messenger.h20.t(user) || org.telegram.messenger.h20.x(user) || org.telegram.messenger.h20.A(user.id) || org.telegram.messenger.h20.z(user) || org.telegram.messenger.h20.s(user) || user.id == 489000 || org.telegram.messenger.vp.E2(user)) ? false : true;
    }

    public static void r1(uh uhVar) {
        if (uhVar == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.a7.b;
        Object tag = uhVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
            return;
        }
        uhVar.setTag(R.id.theme_generation, Integer.valueOf(i10));
        try {
            org.telegram.ui.ActionBar.a7.d0(uhVar, true);
            uhVar.d();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if ((k2Var instanceof org.telegram.ui.un) && !((org.telegram.ui.un) k2Var).z()) {
                z11 = true;
                if (this.v4 != z11) {
                    return;
                }
                if (z11) {
                    org.telegram.messenger.vp.r1(this.D3).Q1().b();
                }
                this.v4 = z11;
                ImageView imageView = this.s1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.u1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                gr grVar = gr.h;
                scaleY.setInterpolator(grVar).setDuration(420L).withEndAction(new wg(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(grVar).setDuration(420L).withEndAction(new wg(this, z11, 2)).start();
                if (z11) {
                    org.telegram.ui.ActionBar.y2 y2Var = this.t1;
                    Objects.requireNonNull(y2Var);
                    imageView.postDelayed(new j0(y2Var, 1), 220L);
                    org.telegram.ui.ActionBar.y2 y2Var2 = this.v1;
                    Objects.requireNonNull(y2Var2);
                    imageView2.postDelayed(new j0(y2Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.v4 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(long j10, String str, boolean z10, boolean z11) {
        TLRPC.ChatFull M0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.r2;
        int i10 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((xh.i3) longSparseArray.get(j10)).getStartCommand())) {
            xh.i3 i3Var = (xh.i3) longSparseArray.get(j10);
            if (i3Var.H) {
                i3Var.H = false;
            }
            if (longSparseArray.get(j10) == null) {
                ((xh.i3) longSparseArray.get(j10)).J.setSwipeOffsetAnimationDisallowed(true);
                F1((uh) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    xh.i3 i3Var2 = (xh.i3) longSparseArray.get(j10);
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i3Var2.F).Z1(Long.valueOf(i3Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(i3Var2.F).b.bots;
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
                        if (tL_attachMenuBot.bot_id == i3Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.i0.h3(new vh.d1(29, i3Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.cd.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753138, Z1.first_name) : z12 ? org.telegram.messenger.cd.a0("BotAttachMenuShortcatAddedSide", null, 2131753137, Z1.first_name) : org.telegram.messenger.cd.a0("BotAttachMenuShortcatAddedAttach", null, 2131753139, Z1.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            Context context = getContext();
            org.telegram.ui.ActionBar.p6 p6Var = this.I0;
            xh.i3 i3Var3 = new xh.i3(context, p6Var, this);
            i3Var3.U = new xh.b3(i3Var3, 2);
            org.telegram.ui.ActionBar.t0 a2 = i3Var3.b.R2.p().a(0, R.drawable.ic_ab_other);
            i3Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.cd.L0(2131752912, null));
            org.telegram.ui.ActionBar.b1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.cd.L0(2131752897, null));
            i3Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.cd.L0(2131752911, null));
            org.telegram.ui.ActionBar.b1 e7 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
            i3Var3.M = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.cd.L0(2131752894, null));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.cd.L0(2131752910, null));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131752915, null));
            xh.e2 e2Var = new xh.e2(i3Var3, context, p6Var, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, i3Var3.a), 1);
            i3Var3.n = e2Var;
            xh.d2 d2Var = new xh.d2(i3Var3, context, i10);
            i3Var3.J = d2Var;
            d2Var.addView(e2Var, w7.b6.c(-1.0f, -1));
            d2Var.setScrollListener(new xh.b3(i3Var3, 3));
            d2Var.setScrollEndListener(new xh.b3(i3Var3, 4));
            d2Var.setDelegate(new xh.d3(i3Var3));
            d2Var.setIsKeyboardVisible(new xh.d3(i3Var3));
            i3Var3.addView(d2Var, w7.b6.c(-1.0f, -1));
            xh.e3 e3Var = new xh.e3(context, p6Var);
            i3Var3.I = e3Var;
            i3Var3.addView(e3Var, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            e2Var.setWebViewProgressListener(new ig.i(i3Var3, 5));
            org.telegram.messenger.zs.e().c(i3Var3, org.telegram.messenger.zs.n4);
            longSparseArray.put(j10, i3Var3);
            ((xh.i3) longSparseArray.get(j10)).setDelegate(new gh(this, i3Var3, str, j10));
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            org.telegram.messenger.jj replyingMessageObject = unVar.Z.getReplyingMessageObject();
            xh.i3 i3Var4 = (xh.i3) longSparseArray.get(j10);
            long a10 = unVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long a92 = unVar.a9();
            xh.e2 e2Var2 = i3Var4.n;
            int i13 = this.D3;
            i3Var4.F = i13;
            i3Var4.x = a10;
            i3Var4.w = j10;
            i3Var4.D = i12;
            i3Var4.E = a92;
            i3Var4.G = str;
            org.telegram.ui.ActionBar.b1 b1Var = i3Var4.M;
            if (b1Var != null) {
                org.telegram.messenger.ui.b0(i13);
                b1Var.setVisibility(0);
            }
            e2Var2.setBotUser(org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(j10)));
            e2Var2.s(i13, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.vp.r1(i13).i1(a10);
            tL_messages_requestWebView.bot = org.telegram.messenger.vp.r1(i13).n1(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0 && (M0 = org.telegram.messenger.vp.r1(i13).M0(-a10)) != null && (peer = M0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = org.telegram.messenger.vp.r1(i13).l1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i12 != 0) {
                org.telegram.messenger.qz.C(i13);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i12;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (a92 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.vp.r1(i13).i1(a92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (a92 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.vp.r1(i13).i1(a92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = xh.m2.u(i3Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new org.telegram.messenger.voip.g0(i3Var4, i13, 9));
            org.telegram.messenger.zs.f(i13).c(i3Var4, org.telegram.messenger.zs.z1);
        }
        if (longSparseArray.get(j10) == null) {
        }
    }

    public final void C1(org.telegram.ui.ActionBar.k2 k2Var) {
        if ((k2Var instanceof org.telegram.ui.un) && org.telegram.messenger.w3.V(((org.telegram.ui.un) k2Var).e)) {
            new cc(this.l3, this.I0).f(org.telegram.messenger.vp.r1(this.D3).V4, new cd(6, this, k2Var)).j();
        }
    }

    public final boolean D1(boolean z10, boolean z11) {
        float f7;
        int i10;
        uh uhVar;
        kg.g1 g1Var;
        this.j1.a(z10, true);
        ah ahVar = this.x2;
        if (z10 == (ahVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ahVar.setTag(z10 ? 1 : null);
        dh dhVar = this.y2;
        if (dhVar.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(dhVar.getEditText());
        }
        dhVar.k(true);
        this.J2.k(true);
        ah ahVar2 = this.r3;
        ah ahVar3 = this.B2;
        if (z10) {
            if (!this.E1) {
                ahVar.setVisibility(0);
            }
            ahVar3.setVisibility(0);
        } else if (this.M2) {
            ahVar2.setVisibility(0);
        }
        uh uhVar2 = this.s2;
        boolean z12 = (uhVar2 == this.a2 || uhVar2 == this.h2) && this.T1;
        kg.g1 g1Var2 = this.R2;
        fg.i iVar = this.I2;
        ag.q qVar = this.w2;
        ih ihVar = this.C2;
        if (z11) {
            this.G2 = new AnimatorSet();
            if (z12) {
                iVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(qVar, (Property<ag.q, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                g1Var = g1Var2;
            } else {
                qVar.setVisibility(0);
                g1Var = g1Var2;
                arrayList.add(ObjectAnimator.ofFloat(qVar, (Property<ag.q, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(iVar, (Property<fg.i, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property3, z10 ? 1.0f : 0.2f));
            if (g1Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) View.TRANSLATION_Y, z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f)));
            } else if (this.M2) {
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, (Property<ah, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.i0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, (Property<ah, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kg(this, 5));
                arrayList.add(ofFloat);
            }
            this.G2.playTogether(arrayList);
            this.G2.setInterpolator(new DecelerateInterpolator());
            this.G2.setDuration(180L);
            this.G2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.G2.start();
            i10 = 0;
        } else {
            ahVar.setAlpha(z10 ? 1.0f : 0.0f);
            qVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                f7 = 0.0f;
                i10 = 0;
            } else {
                i10 = 0;
                qVar.setVisibility(0);
                f7 = 0.0f;
                qVar.setTranslationY(0.0f);
            }
            ahVar3.setScaleX(z10 ? 1.0f : 0.2f);
            ahVar3.setScaleY(z10 ? 1.0f : 0.2f);
            ahVar3.setAlpha(z10 ? 1.0f : f7);
            iVar.setVisibility((z10 && z12) ? i10 : 8);
            iVar.setAlpha((z10 && z12) ? 1.0f : f7);
            ihVar.setScaleX(z10 ? 1.0f : 0.2f);
            ihVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (g1Var2.getTag() != null) {
                ahVar.setTranslationY(z10 ? f7 : org.telegram.messenger.i0.L(48.0f));
            } else if (this.M2 && ((uhVar = this.s2) == null || uhVar.L())) {
                ahVar2.setTranslationY(z10 ? org.telegram.messenger.i0.L(84.0f) : f7);
            }
            if (!z10) {
                ahVar.setVisibility(4);
                ahVar3.setVisibility(4);
            }
            if (z12) {
                P1();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.s2.getSelectedItemsCount());
        }
        ihVar.g(i10, z11);
        ihVar.i(W0() + this.s2.getSelectedItemsCount(), this.B3 != null ? 0L : org.telegram.messenger.vp.r1(this.D3).M1(a1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.i0.L(48.0f), ihVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            dhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void E1(uh uhVar) {
        long j10 = this.Q2;
        kn knVar = this.K1;
        if (uhVar == knVar) {
            j10 = knVar.s;
        } else if (uhVar == this.a2) {
            j10 = 1;
        } else if (uhVar == this.c2) {
            j10 = 3;
        } else if (uhVar == this.g2) {
            j10 = 4;
        } else if (uhVar == this.b2) {
            j10 = 5;
        } else if (uhVar == this.f2) {
            j10 = 6;
        } else if (uhVar == this.d2) {
            j10 = 9;
        } else if (uhVar == this.i2) {
            j10 = 10;
        } else if (uhVar == this.j2) {
            j10 = 11;
        } else if (uhVar == this.e2) {
            j10 = 12;
        } else if (uhVar == this.k2) {
            j10 = 14;
        } else if (uhVar == this.l2) {
            j10 = 13;
        } else if (uhVar == this.m2) {
            j10 = 16;
        } else if (uhVar == this.n2) {
            j10 = 17;
        }
        F1(uhVar, j10, true);
    }

    public final void F1(uh uhVar, long j10, boolean z10) {
        yl ylVar;
        yl ylVar2;
        Float f7;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.n3 == null && this.G2 == null) {
            uh uhVar2 = this.s2;
            if (uhVar2 == uhVar) {
                uhVar2.I();
                return;
            }
            int i11 = 0;
            if (uhVar == this.e2 && !org.telegram.messenger.d20.i(this.D3).q()) {
                new kg.i1(this.W1, 39, false).show();
                return;
            }
            this.m1.a(j10 == 1, z10);
            this.o1.l(Long.valueOf(j10), z10);
            this.x3 = false;
            this.v3 = false;
            this.z3 = 0.0f;
            this.y3.setVisibility(8);
            RadialProgressView radialProgressView = this.w3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ah ahVar = this.r3;
            ahVar.setAlpha(1.0f);
            ahVar.setTranslationY(this.z3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.r2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((xh.i3) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.Q2 = j10;
            bh bhVar = this.s3;
            int childCount = bhVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = bhVar.getChildAt(i13);
                if (childAt instanceof wh) {
                    wh whVar = (wh) childAt;
                    i10 = childCount;
                    f7 = valueOf;
                    whVar.a.f(((long) whVar.b) == whVar.c.Q2, true);
                } else {
                    f7 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof vh) {
                        ((vh) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int firstOffset = (this.s2.getFirstOffset() - org.telegram.messenger.i0.L(11.0f)) - this.V3[0];
            this.t2 = uhVar;
            boolean e = uhVar.e();
            bh.i iVar = this.p3;
            if (iVar != null) {
                iVar.setFadeHeightBottom(e ? 0 : org.telegram.messenger.i0.L(48.0f));
            }
            ch chVar = this.q3;
            if (chVar != null) {
                chVar.setVisibility(e ? 4 : 0);
            }
            int i14 = this.t2.i() != 0 ? 0 : 4;
            kg.g1 g1Var = this.R2;
            g1Var.setVisibility(i14);
            if (g1Var.n0) {
                g1Var.k(true);
            }
            this.s2.t();
            uh uhVar3 = this.t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if (uhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.t2.G(this.s2);
            this.t2.setVisibility(0);
            if (uhVar.getParent() != null) {
                this.b.removeView(this.t2);
            }
            int indexOfChild = this.b.indexOfChild(this.s2);
            if (this.t2.getParent() != this.b) {
                r1(this.t2);
                ViewGroup viewGroup = this.b;
                uh uhVar4 = this.t2;
                if (uhVar4 != this.f2) {
                    indexOfChild++;
                }
                viewGroup.addView(uhVar4, indexOfChild, w7.b6.c(-1.0f, -1));
            }
            mg mgVar = new mg(this, 5);
            uh uhVar5 = this.s2;
            boolean z11 = uhVar5 instanceof jm;
            mh mhVar = this.V1;
            if (z11 || (this.t2 instanceof jm)) {
                int max = Math.max(this.t2.getWidth(), this.s2.getWidth());
                uh uhVar6 = this.t2;
                if (uhVar6 instanceof jm) {
                    uhVar6.setTranslationX(max);
                    uh uhVar7 = this.s2;
                    if ((uhVar7 instanceof ChatAttachAlertPhotoLayout) && (ylVar2 = ((ChatAttachAlertPhotoLayout) uhVar7).P) != null) {
                        ylVar2.setVisibility(4);
                    }
                } else {
                    this.s2.setTranslationX(-max);
                    uh uhVar8 = this.t2;
                    if (uhVar8 == chatAttachAlertPhotoLayout && (ylVar = ((ChatAttachAlertPhotoLayout) uhVar8).P) != null) {
                        ylVar.setVisibility(0);
                    }
                }
                this.t2.setAlpha(1.0f);
                this.s2.setAlpha(1.0f);
                if (z10) {
                    uh uhVar9 = this.s2;
                    mhVar.getClass();
                    mhVar.a(uhVar9, f10);
                    org.telegram.messenger.i0.g3(new jg(this, uhVar, mgVar, i11));
                } else {
                    boolean z12 = this.t2.getCurrentItemTop() <= uhVar.getButtonsHideOffset();
                    this.s2.u(1.0f);
                    this.t2.u(1.0f);
                    this.s2.l(this.f4);
                    this.t2.l(this.f4);
                    this.b.invalidate();
                    this.X0.g();
                    uh uhVar10 = this.s2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    mhVar.getClass();
                    mhVar.a(uhVar10, valueOf2);
                    g1Var.setTag(z12 ? 1 : null);
                    mgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.t2.setAlpha(0.0f);
                this.t2.setTranslationY(org.telegram.messenger.i0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.s2, (Property<uh, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.s2, mhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) View.ALPHA, g1Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(gr.f);
                animatorSet.addListener(new jh(this, firstOffset, mgVar, i11));
                this.n3 = animatorSet;
                uh uhVar11 = this.s2;
                mhVar.getClass();
                mhVar.a(uhVar11, f10);
                animatorSet.start();
            } else {
                uhVar5.setAlpha(0.0f);
                mgVar.run();
                O1(0);
                this.b.invalidate();
            }
            if (this.g4 && !(uhVar instanceof xh.i3)) {
                this.g4 = false;
                g1Var.updateColors();
                g1Var.invalidate();
                h1();
            }
            if (j10 == 1 || j10 == 6 || j10 == 17 || (uhVar instanceof xh.i3)) {
                i11 = org.telegram.messenger.i0.L(46.0f);
            } else if (j10 == 4) {
                i11 = org.telegram.messenger.i0.L(84.0f);
            }
            g1Var.setForcedMenuWidth(i11);
        }
    }

    public final void G1(boolean z10, Boolean bool) {
        bi biVar;
        if (this.d2 == null) {
            biVar = this;
            jn jnVar = new jn(biVar, getContext(), false, this.I0, bool);
            biVar.d2 = jnVar;
            biVar.q2[1] = jnVar;
            jnVar.setDelegate(new ig(this, 17));
        } else {
            biVar = this;
        }
        F1(biVar.d2, 9L, z10);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H0() {
        uh uhVar = this.s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        return uhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    public final void H1(boolean z10, boolean z11) {
        uh uhVar;
        this.k1.a(z10, z11);
        kg.g1 g1Var = this.R2;
        if (!(z10 && g1Var.getTag() == null) && (z10 || g1Var.getTag() == null)) {
            return;
        }
        g1Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.S2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S2 = null;
        }
        boolean z12 = (this.w1 || this.N2 || (this.K2 == 0 && this.k3) || this.s2 != this.a2 || (!this.F3 && !this.G3)) ? false : true;
        if (this.s2 == this.K1) {
            z12 = false;
        }
        ah ahVar = this.r3;
        org.telegram.ui.ActionBar.t0 t0Var = this.U2;
        if (z10) {
            if (z12) {
                t0Var.setVisibility(0);
                t0Var.setClickable(true);
            }
        } else if (this.M2 && this.x2.getTag() == null) {
            ahVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var != null) {
            if (z10) {
                org.telegram.messenger.i0.p3(this, i0.b.h(org.telegram.ui.ActionBar.t6.w0(this.b4 ? org.telegram.ui.ActionBar.t6.hh : org.telegram.ui.ActionBar.t6.h5, this.I0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
            }
        }
        int i10 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - g1Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new kg(this, i10));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.S2.playTogether(arrayList);
            this.S2.addListener(new eg.m(18, this, z10));
            this.S2.setInterpolator(gr.h);
            this.S2.setDuration(380L);
            this.S2.start();
            return;
        }
        if (z10 && this.M2 && ((uhVar = this.s2) == null || uhVar.L())) {
            ahVar.setVisibility(4);
        }
        g1Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            t0Var.setAlpha(z10 ? 1.0f : 0.0f);
            t0Var.setScaleX(z10 ? 1.0f : 0.6f);
            t0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = this.Y2;
        if (t0Var2 != null) {
            t0Var2.setVisibility(4);
        }
        if (this.K2 == 0 && this.k3) {
            return;
        }
        t0Var.setVisibility(4);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean I() {
        return this.s2.b();
    }

    public final void I1() {
        float alpha;
        int[] iArr = this.A2;
        dh dhVar = this.y2;
        dhVar.getLocationOnScreen(iArr);
        if (this.y4 != null) {
            uh uhVar = this.s2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if ((uhVar == chatAttachAlertPhotoLayout || uhVar == this.h2) && this.T1) {
                fg.i iVar = this.I2;
                alpha = (iVar.getAlpha() * iVar.getMeasuredHeight()) + (iVar.getY() - this.y4.getTop());
            } else {
                alpha = -dhVar.getHeight();
            }
            if (Math.abs(this.y4.getTranslationY() - alpha) > 0.5f) {
                this.y4.setTranslationY(alpha);
                this.y4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                }
            }
        }
        T0();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J1(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.n3 != null) {
            return;
        }
        int selectedItemsCount = this.s2.getSelectedItemsCount();
        ih ihVar = this.C2;
        if (selectedItemsCount == 0) {
            ihVar.g(0, i10 != 0);
            D1(false, i10 != 0);
        } else {
            if (D1(true, i10 != 0) || i10 == 0) {
                ihVar.g(selectedItemsCount, i10 != 0);
                ihVar.c();
            } else {
                ihVar.g(selectedItemsCount, true);
                ihVar.c();
            }
        }
        this.s2.D(selectedItemsCount);
        Q0(i10 != 0);
        if (this.s2 == this.a2 && ((((z10 = (k2Var = this.W1) instanceof org.telegram.ui.un)) || this.K2 != 0 || this.N2) && ((selectedItemsCount == 0 && this.k3) || ((selectedItemsCount != 0 || this.K2 != 0 || this.N2) && !this.k3)))) {
            this.k3 = (selectedItemsCount == 0 && this.K2 == 0 && !this.N2) ? false : true;
            AnimatorSet animatorSet = this.T2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T2 = null;
            }
            int i11 = this.K2;
            kg.g1 g1Var = this.R2;
            org.telegram.ui.ActionBar.t0 t0Var = this.Y2;
            if (i11 != 0 && t0Var != null && g1Var.getTag() != null && z10) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                if (!org.telegram.messenger.w3.T(unVar.e) || (tL_chatBannedRights = unVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.k3;
                    ah ahVar = this.c3;
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.U2;
                    if (!z12) {
                        if (this.K2 == 0 && !this.N2) {
                            t0Var2.setVisibility(0);
                            t0Var2.setClickable(true);
                        }
                        ahVar.setVisibility(0);
                    } else if (g1Var.getTag() != null && t0Var != null) {
                        t0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (g1Var.getTag() == null && this.K2 == 0 && !this.N2) {
                            t0Var2.setAlpha(this.k3 ? 1.0f : 0.0f);
                            t0Var2.setScaleX(this.k3 ? 1.0f : 0.6f);
                            t0Var2.setScaleY(this.k3 ? 1.0f : 0.6f);
                        }
                        ahVar.setAlpha(this.k3 ? 1.0f : 0.0f);
                        if (z11) {
                            t0Var.setAlpha(this.k3 ? 0.0f : 1.0f);
                        }
                        if (this.k3 && t0Var != null) {
                            t0Var.setVisibility(4);
                        }
                    } else {
                        this.T2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (g1Var.getTag() == null && this.K2 == 0 && !this.N2) {
                            arrayList.add(ObjectAnimator.ofFloat(t0Var2, (Property<org.telegram.ui.ActionBar.t0, Float>) View.ALPHA, this.k3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(t0Var2, (Property<org.telegram.ui.ActionBar.t0, Float>) View.SCALE_X, this.k3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(t0Var2, (Property<org.telegram.ui.ActionBar.t0, Float>) View.SCALE_Y, this.k3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) property, this.k3 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.ActionBar.t0, Float>) property, this.k3 ? 0.0f : 1.0f));
                        }
                        this.T2.playTogether(arrayList);
                        this.T2.addListener(new w5(this, 10));
                        this.T2.setDuration(180L);
                        this.T2.start();
                    }
                }
            }
            z11 = false;
            z12 = this.k3;
            ah ahVar2 = this.c3;
            org.telegram.ui.ActionBar.t0 t0Var22 = this.U2;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        M1(i10 != 0);
        org.telegram.messenger.jj jjVar = this.B3;
        long M1 = (jjVar == null || jjVar.p5()) ? org.telegram.messenger.vp.r1(this.D3).M1(a1()) : 0L;
        uh uhVar = this.s2;
        ihVar.i(W0() + (uhVar != null ? uhVar.getSelectedItemsCount() : 0), M1, true);
        dh dhVar = this.y2;
        if (dhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.i0.L(48.0f), ihVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                dhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void K() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.j4;
            if (jVar != null) {
                jVar.d();
            }
            AnimatorSet animatorSet2 = this.k4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.z0 = null;
            this.A0 = 0;
        }
    }

    public final void K1() {
        float f7;
        uh uhVar = this.s2;
        boolean h = uhVar == null ? false : uhVar.h();
        bi.j6 j6Var = this.Z2;
        j6Var.setEnabled(h);
        uh uhVar2 = this.s2;
        if (uhVar2 != null) {
            f7 = ((uhVar2.h() ? 1.0f : 0.5f) * (this.t2 == null ? 1.0f : this.U1)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        uh uhVar3 = this.t2;
        if (uhVar3 != null) {
            f7 = c3.i0.z(1.0f, this.U1, uhVar3.h() ? 1.0f : 0.5f, f7);
        }
        this.a3 = f7;
        if (j6Var != null) {
            float f10 = f7 * this.b3;
            j6Var.setAlpha(f10);
            j6Var.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public void L() {
        ai aiVar = this.T3;
        if (aiVar != null) {
            aiVar.C(new mg(this, 4));
        } else {
            s1();
        }
    }

    public final void L1(uh uhVar, int i10) {
        if (uhVar == null) {
            return;
        }
        tg.f fVar = this.z4;
        if (fVar != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(0.0f, i10);
        }
        int currentItemTop = uhVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = uhVar == this.s2 && currentItemTop <= uhVar.getButtonsHideOffset();
        this.I1 = z11;
        if (uhVar == this.s2) {
            H1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uhVar.getLayoutParams();
        int D = org.telegram.messenger.z20.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        uh uhVar2 = this.s2;
        int i11 = uhVar2 == uhVar ? 0 : 1;
        if ((uhVar2 instanceof jm) || (this.t2 instanceof jm)) {
            Object obj = this.n3;
            if ((obj instanceof o1.j) && ((o1.j) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.V3;
        int i12 = iArr[i11];
        if (i12 == D && !z10) {
            if (i10 != 0) {
                this.W3 = i12;
            }
        } else {
            this.W3 = i12;
            iArr[i11] = D;
            O1(i11);
            this.b.invalidate();
        }
    }

    public final void M0() {
        if (Z0().a.length() <= 0) {
            return;
        }
        this.s2.a(Z0().getText());
    }

    public final void M1(boolean z10) {
        ob0 ob0Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout == null || (ob0Var = this.V2) == null) {
            return;
        }
        boolean z11 = this.k3 && this.Z1 && this.s2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.d0();
        boolean z12 = !ChatAttachAlertPhotoLayout.T();
        ob0Var.f = z12;
        if (!z10) {
            ((t5) ob0Var.g).a(z12);
        }
        ob0Var.invalidateSelf();
        org.telegram.ui.ActionBar.t0 t0Var = this.W2;
        if (z10 && this.k3) {
            t0Var.setVisibility(0);
            t0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(gr.h).withEndAction(new wg(this, z11, 0)).start();
        } else {
            t0Var.setVisibility(z11 ? 0 : 8);
            t0Var.setAlpha(z11 ? 1.0f : 0.0f);
            t0Var.setScaleX(z11 ? 1.0f : 0.6f);
            t0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void N(int i10) {
        super.N(i10);
        this.s2.q(i10);
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        return (k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).S6();
    }

    public final void N1(boolean z10) {
        uh uhVar = this.a2;
        if (!z10) {
            E1(uhVar);
            return;
        }
        if (this.D1) {
            if (this.h2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.p6 p6Var = this.p1;
                if (p6Var == null) {
                    p6Var = this.I0;
                }
                jm jmVar = new jm(context, p6Var, this);
                jmVar.D = 0.0f;
                jmVar.E = 0.0f;
                jmVar.F = 0.0f;
                jmVar.G = 0.0f;
                jmVar.H = 0.0f;
                jmVar.I = 0.0f;
                jmVar.J = null;
                jmVar.K = false;
                jmVar.M = 0.0f;
                jmVar.Q = false;
                jmVar.S = false;
                Point point = org.telegram.messenger.i0.q;
                jmVar.T = point.y > point.x;
                jmVar.n = p6Var;
                jmVar.f = true;
                jmVar.setWillNotDraw(false);
                bi biVar = jmVar.b;
                org.telegram.ui.ActionBar.y p5 = biVar.R2.p();
                TextView textView = new TextView(context);
                jmVar.y = textView;
                org.telegram.ui.ActionBar.p6 p6Var2 = jmVar.a;
                tl tlVar = new tl(jmVar, context, p5, p6Var2, 1);
                biVar.R2.addView(tlVar, 0, w7.b6.d(-2, -1.0f, 51, org.telegram.messenger.i0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var2);
                textView.setText(org.telegram.messenger.cd.L0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ag.b1 b1Var = new ag.b1(jmVar, context, p6Var2, 12);
                jmVar.r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.x7(jmVar, 3));
                s4.a0 a0Var = new s4.a0(1, false);
                jmVar.s = a0Var;
                b1Var.setLayoutManager(a0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                im imVar = new im(jmVar, context);
                jmVar.w = imVar;
                imVar.setClipToPadding(true);
                imVar.setClipChildren(true);
                jmVar.addView(b1Var, w7.b6.c(-1.0f, -1));
                jmVar.P = biVar.a2;
                imVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.P;
                imVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                imVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                imVar.c();
                UndoView undoView = new UndoView(context, null, false, biVar.p1);
                jmVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.i0.L(32.0f));
                jmVar.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                jmVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.h2 = jmVar;
                jmVar.bringToFront();
            }
            uh uhVar2 = this.s2;
            jm jmVar2 = this.h2;
            if (uhVar2 != jmVar2) {
                uhVar = jmVar2;
            }
            E1(uhVar);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (!(k2Var instanceof org.telegram.ui.un)) {
            return false;
        }
        return ChatActivityEnterView.C(this.D3, ((org.telegram.ui.un) k2Var).a(), k2Var, charSequence);
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
    public final void O1(int i10) {
        int i11;
        float f7;
        org.telegram.ui.ActionBar.t0 t0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        bi.j6 j6Var;
        float max;
        int i12;
        float f14 = this.k1.e;
        uh uhVar = i10 == 0 ? this.s2 : this.t2;
        if (uhVar == null || uhVar.getVisibility() != 0) {
            return;
        }
        int b12 = b1(i10);
        if (uhVar == this.d2 || uhVar == this.e2) {
            org.telegram.messenger.i0.L(13.0f);
            org.telegram.messenger.i0.L(11.0f);
        } else {
            org.telegram.messenger.i0.L(39.0f);
            org.telegram.messenger.i0.L(43.0f);
        }
        org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (org.telegram.messenger.i0.Q1()) {
            i11 = 16;
        } else {
            Point point = org.telegram.messenger.i0.q;
            i11 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.R2.getAlpha();
        ah ahVar = this.c3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.i0.L((1.0f - ahVar.getAlpha()) * 26.0f);
        boolean z10 = this.k3;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.U2;
        fg.i iVar = this.I2;
        if (z10 && this.K2 == 0 && !this.N2) {
            t0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(3.0f)) - org.telegram.messenger.i0.L(i11 + 37), ((b12 - org.telegram.messenger.i0.L((i11 * f14) + 37.0f)) + L) - (iVar.getAlpha() * iVar.getMeasuredHeight())) + this.f4);
        } else {
            t0Var2.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(3.0f)) - org.telegram.messenger.i0.L(i11 + 37)) + this.f4);
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = this.W2;
        if (t0Var3 != null) {
            t0Var3.setTranslationY(t0Var2.getTranslationY());
        }
        vh.p2 p2Var = this.X2;
        if (p2Var != null) {
            p2Var.setTranslationY(t0Var2.getTranslationY());
        }
        if (this.w1 && this.m3) {
            uh uhVar2 = this.t2;
            if (uhVar2 != null && this.s2 != null) {
                f7 = Math.min(uhVar2.getTranslationY(), this.s2.getTranslationY());
            } else if (uhVar2 != null) {
                f7 = uhVar2.getTranslationY();
            }
            t0Var = this.Y2;
            if (t0Var != null) {
                t0Var.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(i11 + 37)) + this.f4);
            }
            float L2 = ((((b12 - org.telegram.messenger.i0.L((i11 * f14) + 25.0f)) + L) + this.f4) + f7) - (iVar.getAlpha() * iVar.getMeasuredHeight());
            this.j3 = L2;
            ahVar.setTranslationY(Math.max(this.f4, L2));
            iVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f4, (ahVar.getAlpha() * org.telegram.messenger.i0.L(26.0f)) + this.j3 + org.telegram.messenger.i0.L(8.0f)));
            if (this.T1) {
                I1();
            }
            T0();
            int i13 = 59;
            if (this.d2 != null) {
                if (org.telegram.messenger.i0.Q1()) {
                    i12 = 63;
                } else {
                    Point point2 = org.telegram.messenger.i0.q;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                jn jnVar = this.d2;
                if (jnVar == this.t2) {
                    f11 = (jnVar.getTranslationY() + b1(1)) - org.telegram.messenger.i0.L(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.U1;
                } else if (jnVar == this.s2) {
                    f11 = (jnVar.getTranslationY() + b1(0)) - org.telegram.messenger.i0.L(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.t2 == null ? 1.0f : 1.0f - this.U1;
                }
                if (this.e2 != null) {
                    if (org.telegram.messenger.i0.Q1()) {
                        i13 = 63;
                    } else {
                        Point point3 = org.telegram.messenger.i0.q;
                        if (point3.x > point3.y) {
                            i13 = 53;
                        }
                    }
                    jn jnVar2 = this.e2;
                    if (jnVar2 == this.t2) {
                        f13 = (jnVar2.getTranslationY() + b1(1)) - org.telegram.messenger.i0.L(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.U1;
                    } else if (jnVar2 == this.s2) {
                        f13 = (jnVar2.getTranslationY() + b1(0)) - org.telegram.messenger.i0.L(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.t2 == null ? 1.0f : 1.0f - this.U1;
                    }
                    j6Var = this.Z2;
                    if (j6Var != null) {
                        int measuredWidth = org.telegram.messenger.cd.X ? (this.b.getMeasuredWidth() - j6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(62.0f) : 0;
                        if (f10 <= 0.0f || f12 <= 0.0f) {
                            if (f10 <= 0.0f) {
                                f11 = 0.0f;
                            }
                            if (f12 <= 0.0f) {
                                f13 = 0.0f;
                            }
                            max = Math.max(f11, f13);
                        } else {
                            max = org.telegram.messenger.i0.T1(f11, f13, f12);
                        }
                        j6Var.setTranslationY(Math.max(0.0f, max) + this.f4);
                        j6Var.setTranslationX(-((measuredWidth * (1.0f - f14)) + org.telegram.messenger.i0.L((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.b3 = max2;
                    if (j6Var == null) {
                        float f15 = this.a3 * max2;
                        j6Var.setAlpha(f15);
                        j6Var.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                j6Var = this.Z2;
                if (j6Var != null) {
                }
                float max22 = Math.max(f12, f10);
                this.b3 = max22;
                if (j6Var == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.e2 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            j6Var = this.Z2;
            if (j6Var != null) {
            }
            float max222 = Math.max(f12, f10);
            this.b3 = max222;
            if (j6Var == null) {
            }
        }
        f7 = 0.0f;
        t0Var = this.Y2;
        if (t0Var != null) {
        }
        float L22 = ((((b12 - org.telegram.messenger.i0.L((i11 * f14) + 25.0f)) + L) + this.f4) + f7) - (iVar.getAlpha() * iVar.getMeasuredHeight());
        this.j3 = L22;
        ahVar.setTranslationY(Math.max(this.f4, L22));
        iVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f4, (ahVar.getAlpha() * org.telegram.messenger.i0.L(26.0f)) + this.j3 + org.telegram.messenger.i0.L(8.0f)));
        if (this.T1) {
        }
        T0();
        int i132 = 59;
        if (this.d2 != null) {
        }
        f10 = 0.0f;
        f11 = 0.0f;
        if (this.e2 != null) {
        }
        f12 = 0.0f;
        f13 = 0.0f;
        j6Var = this.Z2;
        if (j6Var != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.b3 = max2222;
        if (j6Var == null) {
        }
    }

    public final void P0() {
        bh bhVar = this.s3;
        if (bhVar == null) {
            return;
        }
        int childCount = bhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            bhVar.getChildAt(i10);
        }
        boolean z10 = this.b4;
        org.telegram.ui.ActionBar.a7.V(this.d3, z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5, this.I0);
        org.telegram.ui.ActionBar.a7.V(this.i3, z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5, this.I0);
        org.telegram.ui.ActionBar.a7.V(this.Z2, org.telegram.ui.ActionBar.t6.Gi, this.I0);
        int w02 = org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5, this.I0);
        boolean z11 = (this.n4 && w02 == this.m4) ? false : true;
        this.n4 = true;
        this.m4 = w02;
        org.telegram.ui.ActionBar.t0 t0Var = this.U2;
        if (z11) {
            t0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Wg : org.telegram.ui.ActionBar.t6.I5, this.I0), t0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        t0Var.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), false);
        t0Var.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), true);
        t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.I0));
        org.telegram.ui.ActionBar.t0 t0Var2 = this.W2;
        if (t0Var2 != null && z11) {
            t0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = this.Y2;
        if (t0Var3 != null) {
            if (z11) {
                t0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Wg : org.telegram.ui.ActionBar.t6.I5, this.I0), t0Var3.getBackground());
        }
        dh dhVar = this.y2;
        org.telegram.ui.ActionBar.p6 p6Var = dhVar.M;
        rt rtVar = dhVar.a;
        int i12 = dhVar.L;
        if (i12 == 0) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.H6, p6Var));
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            rtVar.setCursorColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        } else if (i12 == 2 || i12 == 3) {
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.D = -1;
        } else {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t5, p6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, p6Var));
        }
        dhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Le, p6Var), PorterDuff.Mode.MULTIPLY));
        st stVar = dhVar.d;
        if (stVar != null) {
            stVar.updateColors();
        }
        org.telegram.ui.ActionBar.a7.m(bhVar, 21, org.telegram.ui.ActionBar.t6.A5, this.I0);
        int i14 = z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
        kg.g1 g1Var = this.R2;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i14, p6Var2);
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, z10 ? org.telegram.ui.ActionBar.t6.Wg : org.telegram.ui.ActionBar.t6.I5, this.I0);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5, this.I0);
        int c12 = c1(false);
        org.telegram.ui.ActionBar.t6.C1(c12, this.r0);
        hi.c cVar = this.A4;
        if (cVar.b != c12) {
            cVar.a(c12);
            bh.i iVar = this.p3;
            if (iVar != null) {
                iVar.invalidate();
            }
            ch chVar = this.q3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        this.b.invalidate();
        int i15 = 0;
        while (true) {
            uh[] uhVarArr = this.q2;
            if (i15 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i15];
            if (uhVar != null) {
                uhVar.d();
            }
            i15++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Q(org.telegram.ui.ActionBar.t6.h5);
            return;
        }
        this.F0 = -1;
        this.G0 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, this.I0);
        org.telegram.messenger.i0.t3(this, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0), false, null);
        org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(this.G0)) > 0.721d);
    }

    public final void P1() {
        int i10 = 0;
        O1(0);
        this.l3.invalidate();
        fg.i iVar = this.I2;
        iVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            pl plVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.W();
            if (plVar != null && plVar.getFastScroll() != null) {
                zj0 fastScroll = plVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.T1) {
                    i10 = (int) (iVar.getAlpha() * iVar.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                plVar.getFastScroll().invalidate();
            }
        }
        I1();
        T0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (org.telegram.messenger.jj.c3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var == null || !(k2Var instanceof org.telegram.ui.un)) {
            return;
        }
        org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
        wt wtVar = this.T1 ? this.J2 : this.y2;
        String obj = wtVar != null ? wtVar.getText().toString() : null;
        if (this.B3 == null) {
            uh uhVar = this.s2;
            z11 = true;
            if (uhVar != null) {
            }
            if (rf.s.g(this.D3).e(obj, unVar.t8) <= 0) {
                org.telegram.messenger.jj jjVar = unVar.D5;
                if (jjVar != null) {
                }
            }
            this.n1.a(z11, z10);
            if (z11 || !e1()) {
            }
            u1(false, z10);
            return;
        }
        z11 = false;
        this.n1.a(z11, z10);
        if (z11) {
        }
    }

    public final void R0() {
        float f7 = this.j1.e;
        this.q3.setTranslationY(org.telegram.messenger.i0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.k1.e))), 1.0f - ((1.0f - this.i1.e) * f7)));
    }

    public final void S0() {
        f10.d(this.z2, c3.i0.E(this.l1.e, this.m1.e, w7.n7.a(this.n1.e), this.L3 ? 0.0f : 1.0f));
    }

    public final void T0() {
        ih ihVar = this.C2;
        ah ahVar = this.B2;
        fg.i iVar = this.I2;
        if (iVar == null || iVar.getVisibility() != 0 || iVar.getAlpha() == 0.0f) {
            ahVar.setTranslationY(this.a4);
            ihVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.i1.e;
        float abs = Math.abs(org.telegram.messenger.i0.T1(-1.0f, 1.0f, f7));
        ihVar.setAlpha(abs * abs * abs * abs);
        ahVar.setTranslationY(org.telegram.messenger.i0.T1(this.a4, ((iVar.getTranslationY() + iVar.getTop()) - ahVar.getTop()) + org.telegram.messenger.i0.L(8.0f), gr.j.getInterpolation(f7)));
    }

    public final void U0(int i10) {
        this.M2 = true;
        this.r3.setVisibility(0);
        this.y1 = true;
        this.z1 = i10;
        this.K2 = 0;
        this.w1 = false;
        this.x1 = false;
        this.A1 = null;
        org.telegram.ui.ActionBar.t0 t0Var = this.e3;
        if (t0Var != null) {
            this.d3.setTranslationY(0.0f);
            t0Var.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.c7> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.q2;
            if (i10 >= uhVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i5));
                return arrayList;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null && (themeDescriptions = uhVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void V0(ag.a aVar) {
        String L0 = org.telegram.messenger.cd.L0(2131752122, null);
        TextView textView = this.d3;
        textView.setText(L0);
        this.M2 = false;
        this.r3.setVisibility(8);
        this.K2 = 1;
        this.w1 = true;
        this.x1 = true;
        this.Z1 = false;
        this.A1 = aVar;
        org.telegram.ui.ActionBar.t0 t0Var = this.e3;
        if (t0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            t0Var.setVisibility(0);
            t0Var.setClickable(true);
            t0Var.setAlpha(1.0f);
            t0Var.setScaleX(1.0f);
            t0Var.setScaleY(1.0f);
        }
    }

    public final int W0() {
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.lj ljVar;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (!(k2Var instanceof org.telegram.ui.un) || (njVar = ((org.telegram.ui.un) k2Var).v5) == null || (ljVar = njVar.b) == null) {
            return 0;
        }
        return ljVar.g.size();
    }

    public final TLRPC.Chat X0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        return k2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var).e : org.telegram.messenger.vp.r1(this.D3).L0(Long.valueOf(-this.Q1));
    }

    public final float Y0() {
        return r0.getMeasuredHeight() - ((1.0f - this.x2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.i0.L(84.0f)));
    }

    public final wt Z0() {
        uh uhVar;
        return (this.T1 && ((uhVar = this.s2) == this.a2 || uhVar == this.h2)) ? this.J2 : this.y2;
    }

    @Override // org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public final void a(boolean z10) {
        if (z10) {
            this.x4 = z10;
        }
        dismiss();
    }

    public final long a1() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        return k2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var).a() : this.Q1;
    }

    public final int b1(int i10) {
        uh uhVar = this.t2;
        int[] iArr = this.V3;
        if (uhVar == null || !((this.s2 instanceof jm) || (uhVar instanceof jm))) {
            return iArr[i10];
        }
        return org.telegram.messenger.i0.W1(this.U1, iArr[0], iArr[1]);
    }

    public final int c1(boolean z10) {
        kg.g1 g1Var;
        if (this.b4) {
            return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hh, this.I0);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        Iterator it = this.o1.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            long longValue = ((Long) hVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += hVar.c();
            }
        }
        float a10 = w7.u.a(f7, 0.0f, 1.0f);
        if (z10 && (g1Var = this.R2) != null && g1Var.getVisibility() == 0) {
            a10 *= 1.0f - g1Var.getAlpha();
        }
        return i0.b.f(a10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0), org.telegram.ui.ActionBar.t6.w0(a2 ? org.telegram.ui.ActionBar.t6.a7 : org.telegram.ui.ActionBar.t6.i5, this.I0));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        bi biVar;
        yl ylVar;
        org.telegram.messenger.we weVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        uh uhVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.H2 = 0L;
        this.C2.setEffect(0L);
        int i10 = 0;
        this.x3 = false;
        this.v3 = false;
        this.z3 = 0.0f;
        this.y3.setVisibility(8);
        RadialProgressView radialProgressView = this.w3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ah ahVar = this.r3;
        ahVar.setAlpha(1.0f);
        ahVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.r2;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((xh.i3) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.K2;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (i12 != 2) {
            if (k2Var instanceof org.telegram.ui.un) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                chat = unVar.e;
                user = unVar.j();
            } else {
                long j10 = this.Q1;
                int i13 = this.D3;
                if (j10 >= 0) {
                    user = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(this.Q1));
                    chat = null;
                } else if (j10 < 0) {
                    chat = org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(-this.Q1));
                    user = null;
                }
            }
            z10 = k2Var instanceof org.telegram.ui.un;
            if ((z10 && this.K2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.F3 = org.telegram.messenger.w3.p(chat);
                    this.G3 = org.telegram.messenger.w3.u(chat);
                    this.H3 = org.telegram.messenger.w3.o(chat);
                    this.I3 = org.telegram.messenger.w3.r(chat);
                    this.J3 = !org.telegram.messenger.w3.V(chat) && org.telegram.messenger.w3.r(chat);
                    this.K3 = org.telegram.messenger.w3.q(chat);
                    this.E3 = org.telegram.messenger.w3.l(chat);
                } else {
                    this.I3 = org.telegram.messenger.h20.t(user) || org.telegram.messenger.h20.B(user);
                    this.J3 = !z10 || ((org.telegram.ui.un) k2Var).h == null;
                }
            }
            if (this.L3) {
                this.I3 = false;
                this.J3 = false;
            }
            dh dhVar = this.y2;
            if (z10 || this.K2 == 2) {
                dhVar.setVisibility(this.N1 ? 0 : 4);
            }
            boolean z11 = this.G3;
            boolean z12 = this.F3;
            boolean z13 = this.E3;
            chatAttachAlertPhotoLayout = this.a2;
            biVar = chatAttachAlertPhotoLayout.b;
            xy xyVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            ylVar = chatAttachAlertPhotoLayout.P;
            if (ylVar != null) {
                ylVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((biVar.W1 instanceof org.telegram.ui.un) && biVar.X0() == null) && biVar.K2 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Y1;
                if (chatAttachAlertPhotoLayout.v0) {
                    xyVar.setText(org.telegram.messenger.cd.L0(2131748197, null));
                    xyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat X0 = biVar.X0();
                    xyVar.a(R.raw.media_forbidden, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2);
                    if (org.telegram.messenger.w3.P(7, X0)) {
                        xyVar.setText(org.telegram.messenger.cd.L0(2131749552, null));
                    } else if (org.telegram.messenger.i0.D1(X0.banned_rights)) {
                        xyVar.setText(org.telegram.messenger.cd.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]));
                    } else {
                        xyVar.setText(org.telegram.messenger.cd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.cd.v(X0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.r0()) {
                chatAttachAlertPhotoLayout.U0 = MediaController.Y1;
            } else {
                chatAttachAlertPhotoLayout.U0 = MediaController.Z1;
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.f0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
                for (int i14 = 0; i14 < Math.min(100, chatAttachAlertPhotoLayout.U0.e.size()); i14++) {
                    ((org.telegram.messenger.ef) chatAttachAlertPhotoLayout.U0.e.get(i14)).e();
                }
            }
            chatAttachAlertPhotoLayout.a0();
            chatAttachAlertPhotoLayout.z0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.cd.L0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
                chatAttachAlertPhotoLayout.X0 = false;
                if (xyVar != null) {
                    xyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.v0();
            dhVar.k(true);
            this.J2.k(true);
            this.o3 = false;
            A0(false);
            if (!this.F1 || this.G1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.f2 == null) {
                    bl blVar = new bl(this, getContext(), this.I0, (this.y1 || this.G1 || this.L3) ? false : true);
                    this.f2 = blVar;
                    this.q2[5] = blVar;
                    wk wkVar = this.q4;
                    if (wkVar != null) {
                        blVar.setDelegate(wkVar);
                    } else {
                        blVar.setDelegate(new ig(this, i10));
                    }
                }
                this.Q2 = 5L;
                uhVar = this.f2;
            } else if (this.E1) {
                q1(false);
                uhVar = this.g2;
                this.Q2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.jj jjVar = this.B3;
                if (jjVar != null) {
                    int i15 = this.A3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i15 == -1) {
                        this.M2 = true;
                        if (jjVar.I3()) {
                            o1(false);
                            uhVar = this.c2;
                            this.Q2 = 3L;
                        } else if (this.B3.U2()) {
                            q1(false);
                            uhVar = this.g2;
                            this.Q2 = 4L;
                        } else {
                            this.Q2 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            o1(false);
                            uhVar = this.c2;
                            this.Q2 = 3L;
                        } else if (i15 == 1) {
                            q1(false);
                            uhVar = this.g2;
                            this.Q2 = 4L;
                        } else {
                            this.Q2 = 1L;
                            uhVar = chatAttachAlertPhotoLayout2;
                        }
                        this.M2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.M2 = this.K2 == 0 && !this.N2;
                    this.Q2 = 1L;
                }
                uhVar = chatAttachAlertPhotoLayout2;
            }
            ahVar.setVisibility(this.M2 ? 0 : 8);
            if (this.s2 != uhVar) {
                kg.g1 g1Var = this.R2;
                if (g1Var.n0) {
                    g1Var.k(true);
                }
                this.b.removeView(this.s2);
                this.s2.t();
                this.s2.setVisibility(8);
                this.s2.s();
                this.s2 = uhVar;
                this.q0 = true;
                if (uhVar.getParent() == null) {
                    r1(this.s2);
                    this.b.addView(this.s2, 0, w7.b6.c(-1.0f, -1));
                }
                uhVar.setAlpha(1.0f);
                uhVar.setVisibility(0);
                uhVar.G(null);
                uhVar.H();
                g1Var.setVisibility(uhVar.i() != 0 ? 0 : 4);
                u1(this.T1, false);
                K1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.s2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            J1(0);
            this.u3.f();
            Z0().setText("");
            this.t3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z10 = k2Var instanceof org.telegram.ui.un;
        if (z10) {
            if (chat != null) {
            }
            if (this.L3) {
            }
            dh dhVar2 = this.y2;
            if (z10) {
            }
            dhVar2.setVisibility(this.N1 ? 0 : 4);
            boolean z112 = this.G3;
            boolean z122 = this.F3;
            boolean z132 = this.E3;
            chatAttachAlertPhotoLayout = this.a2;
            biVar = chatAttachAlertPhotoLayout.b;
            xy xyVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            ylVar = chatAttachAlertPhotoLayout.P;
            if (ylVar != null) {
            }
            if (biVar.W1 instanceof org.telegram.ui.un) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.Y1;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.f0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
            }
            chatAttachAlertPhotoLayout.a0();
            chatAttachAlertPhotoLayout.z0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.F.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.cd.L0(2131752238, null));
            weVar = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = weVar;
            if (weVar != null) {
            }
            chatAttachAlertPhotoLayout.v0();
            dhVar2.k(true);
            this.J2.k(true);
            this.o3 = false;
            A0(false);
            if (this.F1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.f2 == null) {
            }
            this.Q2 = 5L;
            uhVar = this.f2;
            ahVar.setVisibility(this.M2 ? 0 : 8);
            if (this.s2 != uhVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.s2 != chatAttachAlertPhotoLayout3) {
            }
            J1(0);
            this.u3.f();
            Z0().setText("");
            this.t3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.L3) {
        }
        dh dhVar22 = this.y2;
        if (z10) {
        }
        dhVar22.setVisibility(this.N1 ? 0 : 4);
        boolean z1122 = this.G3;
        boolean z1222 = this.F3;
        boolean z1322 = this.E3;
        chatAttachAlertPhotoLayout = this.a2;
        biVar = chatAttachAlertPhotoLayout.b;
        xy xyVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        ylVar = chatAttachAlertPhotoLayout.P;
        if (ylVar != null) {
        }
        if (biVar.W1 instanceof org.telegram.ui.un) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.Y1;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.f0();
        if (chatAttachAlertPhotoLayout.U0 != null) {
        }
        chatAttachAlertPhotoLayout.a0();
        chatAttachAlertPhotoLayout.z0(false);
        chatAttachAlertPhotoLayout.s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.F.h1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.cd.L0(2131752238, null));
        weVar = chatAttachAlertPhotoLayout.U0;
        chatAttachAlertPhotoLayout.T0 = weVar;
        if (weVar != null) {
        }
        chatAttachAlertPhotoLayout.v0();
        dhVar22.k(true);
        this.J2.k(true);
        this.o3 = false;
        A0(false);
        if (this.F1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.f2 == null) {
        }
        this.Q2 = 5L;
        uhVar = this.f2;
        ahVar.setVisibility(this.M2 ? 0 : 8);
        if (this.s2 != uhVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.s2 != chatAttachAlertPhotoLayout3) {
        }
        J1(0);
        this.u3.f();
        Z0().setText("");
        this.t3.h1(0, 1000000);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T0 || i10 == org.telegram.messenger.zs.W4 || i10 == org.telegram.messenger.zs.F1) {
            zh zhVar = this.u3;
            if (zhVar != null) {
                zhVar.f();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f5) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0);
            this.B1 = r12.getUserConfig().q() ? r12.V4 : r12.U4;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        fh fhVar;
        dh dhVar;
        if (this.s2.p() || this.I) {
            return;
        }
        uh uhVar = this.s2;
        kk kkVar = this.n2;
        int i10 = 1;
        int i11 = 0;
        boolean z10 = (uhVar != kkVar || kkVar == null || kkVar.K || kkVar.P0 == null) ? false : true;
        this.o2 = z10;
        if (!z10 && (dhVar = this.y2) != null) {
            org.telegram.messenger.i0.v1(dhVar.getEditText());
        }
        if (!this.o2 && (fhVar = this.J2) != null) {
            org.telegram.messenger.i0.v1(fhVar.getEditText());
        }
        this.r2.clear();
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var == null) {
            k2Var = LaunchActivity.Q();
        }
        if (this.x4 || k2Var == null || this.s2.getSelectedItemsCount() <= 0 || this.w1) {
            int i12 = 0;
            while (true) {
                uh[] uhVarArr = this.q2;
                if (i12 >= uhVarArr.length) {
                    break;
                }
                uh uhVar2 = uhVarArr[i12];
                if (uhVar2 != null && this.s2 != uhVar2) {
                    uhVar2.p();
                }
                i12++;
            }
            org.telegram.messenger.i0.t3(this, i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0), 0), true, new ig(this, 11));
            if (k2Var != null) {
                org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), this.I0);
        String L0 = org.telegram.messenger.cd.L0(2131751400, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131751401, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751407, null), new ig(this, i10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        x1Var.setOnCancelListener(new pg(this, i11));
        x1Var.N = new r0(this, 4);
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, this.I0);
        }
    }

    public final boolean e1() {
        if (!this.T1) {
            return false;
        }
        uh uhVar = this.s2;
        return uhVar == this.a2 || uhVar == this.h2;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean f0(MotionEvent motionEvent) {
        return this.s2.n(motionEvent);
    }

    public final void g1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ai aiVar = this.T3;
        if (aiVar == null || this.o3) {
            return;
        }
        boolean D = aiVar.D();
        this.o3 = true;
        org.telegram.messenger.i0.h3(new ag.j0(this, editTextBoldCursor, z10, 16), D ? 200L : 0L);
    }

    public final void h1() {
        if (this.r0 == null || this.b == null) {
            return;
        }
        int c12 = c1(false);
        org.telegram.ui.ActionBar.t6.C1(c12, this.r0);
        hi.c cVar = this.A4;
        if (cVar.b != c12) {
            cVar.a(c12);
            bh.i iVar = this.p3;
            if (iVar != null) {
                iVar.invalidate();
            }
            ch chVar = this.q3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        K1();
        this.b.invalidate();
    }

    public final void i1() {
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.o();
            }
            i10++;
        }
        int i11 = this.D3;
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.T0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.W4);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f5);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.F1);
        this.M1 = true;
        dh dhVar = this.y2;
        if (dhVar != null) {
            dhVar.o();
        }
        fh fhVar = this.J2;
        if (fhVar != null) {
            fhVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final kk kkVar = this.n2;
        if (kkVar != null && this.s2 == kkVar) {
            final mg mgVar = new mg(this, 1);
            int i10 = kkVar.n;
            org.telegram.ui.Wallet.q9 q9Var = kkVar.R;
            bi biVar = kkVar.b;
            AnimatorSet animatorSet = null;
            if (!kkVar.K && (wallettransaction = kkVar.P0) != null && kkVar.Q0 == null && kkVar.R0 == null) {
                if (kkVar.S0) {
                    org.telegram.ui.Wallet.b6 b6Var = new org.telegram.ui.Wallet.b6();
                    b6Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                    if (k2Var != null && k2Var.presentFragment(b6Var, false, true)) {
                        final int i11 = 0;
                        org.telegram.ui.Wallet.fa faVar = new org.telegram.ui.Wallet.fa(biVar.c, biVar.b, q9Var.getDiamondView(), b6Var, kkVar.P0, new Runnable() { // from class: org.telegram.ui.Components.ck
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        if (!kkVar.K) {
                                            mgVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!kkVar.K) {
                                            mgVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, biVar);
                        kkVar.R0 = faVar;
                        animatorSet = faVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.a7 diamondView = q9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (unVar.getCurrentAccount() == i10 && unVar.a() == kkVar.r.id && unVar.f4 == 0 && unVar.getFragmentView() != null && unVar.getFragmentView().isAttachedToWindow()) {
                                final int i12 = 1;
                                org.telegram.ui.Wallet.s6 s6Var = new org.telegram.ui.Wallet.s6(biVar.c, biVar.b, q9Var.getDiamondView(), unVar, kkVar.P0, new Runnable() { // from class: org.telegram.ui.Components.ck
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                if (!kkVar.K) {
                                                    mgVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!kkVar.K) {
                                                    mgVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, biVar);
                                kkVar.Q0 = s6Var;
                                animatorSet = s6Var.m;
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

    public final void j1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p5 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.h20.p(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.D3).b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.cd.a0("BotRemoveFromMenu", null, 2131753002, p5);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String L0 = org.telegram.messenger.cd.L0(2131753001, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.cd.a0("BotRemoveInlineFromMenu", null, 2131753000, p5);
        }
        x1Var.T = org.telegram.messenger.i0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 16));
        i0.a.s("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        s81 s81Var = chatAttachAlertPhotoLayout.l0;
        jg.l0 l0Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        pl plVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = org.telegram.messenger.i0.n;
        if (view == l0Var) {
            if (z10) {
                if (plVar.getVisibility() == 0) {
                    l0Var.layout(0, org.telegram.messenger.m5.z(222.0f, i13, i16), i14, org.telegram.messenger.m5.z(96.0f, i13, i16));
                    return true;
                }
                l0Var.layout(0, org.telegram.messenger.m5.z(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (plVar.getVisibility() == 0) {
                l0Var.layout(org.telegram.messenger.m5.z(222.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(96.0f), i15 - i16);
                return true;
            }
            l0Var.layout(org.telegram.messenger.m5.z(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == s81Var) {
            if (z10) {
                if (plVar.getVisibility() == 0) {
                    s81Var.layout(0, org.telegram.messenger.m5.z(310.0f, i13, i16), i14, org.telegram.messenger.m5.z(260.0f, i13, i16));
                    return true;
                }
                s81Var.layout(0, org.telegram.messenger.m5.z(176.0f, i13, i16), i14, org.telegram.messenger.m5.z(126.0f, i13, i16));
                return true;
            }
            if (plVar.getVisibility() == 0) {
                s81Var.layout(org.telegram.messenger.m5.z(310.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(260.0f), i15 - i16);
                return true;
            }
            s81Var.layout(org.telegram.messenger.m5.z(176.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != plVar) {
                return false;
            }
            if (z10) {
                int z11 = org.telegram.messenger.m5.z(88.0f, i15, i16);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L2 = (i10 + i14) - org.telegram.messenger.i0.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            L = (i14 - textView.getMeasuredWidth()) / 2;
            int L3 = i13 - org.telegram.messenger.i0.L(167.0f);
            textView.setRotation(0.0f);
            if (plVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.i0.L(96.0f);
            }
            measuredWidth = L3 - i16;
        } else {
            L = i12 - org.telegram.messenger.i0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (plVar.getVisibility() == 0) {
                L -= org.telegram.messenger.i0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1() {
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.q2;
            if (i10 >= uhVarArr.length) {
                this.Z3 = true;
                return;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.A();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean l0(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        bm bmVar = chatAttachAlertPhotoLayout.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        pl plVar = chatAttachAlertPhotoLayout.r;
        dh.f fVar = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        if (view != chatAttachAlertPhotoLayout.P) {
            jg.l0 l0Var = chatAttachAlertPhotoLayout.j0;
            if (view == l0Var) {
                if (z10) {
                    l0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                l0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            s81 s81Var = chatAttachAlertPhotoLayout.l0;
            if (view == s81Var) {
                if (z10) {
                    s81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                s81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == plVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30));
                    if (fVar.o != 0) {
                        plVar.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                        fVar.j1(0);
                        bmVar.f();
                    }
                } else {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (fVar.o != 1) {
                        plVar.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                        fVar.j1(1);
                        bmVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(biVar.U() + biVar.T() + i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1() {
        int i10 = 0;
        this.Z3 = false;
        while (true) {
            uh[] uhVarArr = this.q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.T3.D();
        }
        zh zhVar = this.u3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean m0() {
        this.a2.setTranslationX(0.0f);
        this.h3.setAlpha(0.0f);
        this.f3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.k4 = animatorSet;
        int i10 = 2;
        mh mhVar = this.i4;
        int i11 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, mhVar, 0.0f, 400.0f));
        this.k4.setDuration(400L);
        this.k4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        mhVar.getClass();
        mhVar.a(this, valueOf);
        this.k4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new kg(this, i10));
        o1.j jVar = this.j4;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = new o1.j((Object) this.b, (o1.h) o1.j.p, 0.0f);
        this.j4 = jVar2;
        if (this.B3 != null) {
            jVar2.m.a(0.75f);
            this.j4.m.b(350.0f);
        } else {
            jVar2.m.a(0.75f);
            this.j4.m.b(350.0f);
        }
        this.j4.h();
        if (this.J) {
            this.c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.z0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, i6.d, this.o0 ? this.p0 : 0));
        this.z0.setDuration(400L);
        this.z0.setStartDelay(20L);
        this.z0.setInterpolator(this.k0);
        e2.f fVar = new e2.f(null);
        jg jgVar = new jg(this, fVar, this.y0, i11);
        this.j4.a(new za(i11, this, jgVar));
        this.z0.addListener(new bg.f(20, this, jgVar));
        fVar.d();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 512);
        this.z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        y1(0.0f);
        ofFloat2.addUpdateListener(new kg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(gr.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        org.telegram.messenger.jj jjVar = this.B3;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        int i10 = this.D3;
        if (jjVar != null && jjVar.p5() && !org.telegram.messenger.w3.z(i10, 24, org.telegram.messenger.jj.B0(this.B3.k)) && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            org.telegram.messenger.oj ojVar = unVar.w5;
            if (ojVar == null) {
                ojVar = org.telegram.messenger.oj.b(this.B3.k.suggested_post);
            }
            if (!rh.e6.T(i10, ojVar.a)) {
                unVar.mc(ojVar);
                return;
            }
        }
        if (this.B1 - this.C1 < 0) {
            org.telegram.messenger.i0.E3(this.q1);
            org.telegram.messenger.i0.E3(this.r1);
            try {
                this.C2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.vp.r1(i10).A3() || org.telegram.messenger.vp.r1(i10).V4 <= this.C1) {
                return;
            }
            C1(k2Var);
            return;
        }
        if (this.B3 == null && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar2 = (org.telegram.ui.un) k2Var;
            if (unVar2.c()) {
                s4.L(getContext(), unVar2.a(), new ig(this, 14), this.I0);
                return;
            }
        }
        uh uhVar = this.s2;
        if (uhVar == this.a2 || uhVar == this.h2) {
            t1(true, 0, 0, this.H2, e1());
        } else {
            if (uhVar.J(true, 0, 0, this.H2, e1())) {
                return;
            }
            this.x4 = true;
            dismiss();
        }
    }

    public final void n1(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (i10 == 3) {
            if (this.H3 || !N0()) {
                Activity parentActivity = k2Var != null ? k2Var.getParentActivity() : null;
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
                o1(true);
                return;
            }
            return;
        }
        if (i10 == 6 && org.telegram.messenger.i0.J1(k2Var)) {
            if (this.f2 == null) {
                bl blVar = new bl(this, getContext(), this.I0, (this.y1 || this.L3) ? false : true);
                this.f2 = blVar;
                this.q2[5] = blVar;
                wk wkVar = this.q4;
                if (wkVar != null) {
                    blVar.setDelegate(wkVar);
                } else if (k2Var instanceof org.telegram.ui.un) {
                    blVar.setDelegate(new ig(this, 18));
                }
            }
            E1(this.f2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void o0() {
        if (this.s2.r()) {
            dismiss();
        }
    }

    public final void o1(boolean z10) {
        if (!this.H3 && z10) {
            kn knVar = new kn(3, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        int i10 = 1;
        if (this.c2 == null) {
            mi miVar = new mi(getContext(), this.I0, this);
            this.c2 = miVar;
            this.q2[3] = miVar;
            miVar.setupBlurredSearchField(this.B4);
            this.c2.setDelegate(new ig(this, 15));
            if (this.y1) {
                this.c2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
            mi miVar2 = this.c2;
            if ((chat == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                i10 = -1;
            }
            miVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            E1(this.c2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        if (this.J1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        kg.g1 g1Var = this.R2;
        if (g1Var.n0) {
            g1Var.k(true);
            return;
        }
        if (this.s2.j()) {
            return;
        }
        if (Z0() == null || !Z0().e) {
            super.onBackPressed();
        } else {
            Z0().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var != null) {
            org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.s2.F(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.J1);
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
            ((LaunchActivity) context).B0.remove(this.J1);
        }
    }

    public final void p1() {
        if (!this.K3) {
            kn knVar = new kn(5, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        if (this.b2 == null) {
            ej ejVar = new ej(getContext(), this.I0, this);
            this.b2 = ejVar;
            this.q2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.B4);
            this.b2.setDelegate(new kh(this));
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
            this.b2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled);
        }
        E1(this.b2);
    }

    public final void q1(boolean z10) {
        if (!this.E3 && z10) {
            kn knVar = new kn(4, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        boolean z11 = false;
        if (this.g2 == null) {
            xj xjVar = new xj(this.E1 ? 2 : 0, getContext(), this.I0, this);
            this.g2 = xjVar;
            this.q2[4] = xjVar;
            xjVar.setDelegate(new lh(this));
        }
        int i10 = 1;
        if (this.y1) {
            this.g2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var instanceof org.telegram.ui.un) {
                TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
                xj xjVar2 = this.g2;
                if ((chat == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                    i10 = -1;
                }
                xjVar2.setMaxSelectedFiles(i10);
            } else {
                this.g2.setMaxSelectedFiles(this.M3);
                xj xjVar3 = this.g2;
                if (!this.E1 && !this.N1) {
                    z11 = true;
                }
                xjVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        xj xjVar4 = this.g2;
        xjVar4.d0 = this.E1;
        if (z10) {
            E1(xjVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            P0();
            tg.c cVar = this.S1;
            if (cVar != null) {
                cVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, this.I0);
            org.telegram.ui.ActionBar.t0 t0Var = this.e3;
            if (t0Var == null || w02 == this.l4) {
                return;
            }
            this.l4 = w02;
            t0Var.setIconColor(w02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        kg.g1 g1Var = this.R2;
        int i10 = 1;
        if (g1Var.n0) {
            g1Var.k(true);
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
            uh[] uhVarArr = this.q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.o();
                this.b.removeView(uhVarArr[i10]);
                uhVarArr[i10] = null;
            }
            i10++;
        }
        H1(false, false);
        super.L();
        if (this.o2) {
            this.o2 = false;
            this.p2 = 0.0f;
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var == null || k2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = k2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.h0.a;
            r0.x.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        this.C3 = false;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            this.h0 = ((org.telegram.ui.un) k2Var).J9();
        }
        K1();
        this.m3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0), 0);
            this.G0 = o10;
            org.telegram.messenger.i0.t3(this, o10, false, null);
            org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(this.G0)) > 0.721d);
        }
        if (this.g4) {
            this.g4 = false;
            kg.g1 g1Var = this.R2;
            g1Var.updateColors();
            g1Var.invalidate();
            h1();
        }
    }

    public final boolean t1(final boolean z10, final int i10, final int i11, final long j10, final boolean z11) {
        if (this.C3) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            TLRPC.Chat chat = unVar.e;
            if (unVar.j() != null || ((org.telegram.messenger.w3.T(chat) && chat.megagroup) || !org.telegram.messenger.w3.T(chat))) {
                org.telegram.messenger.vp.r1(this.D3).e7.edit().putBoolean("silent_" + unVar.a(), !z10).commit();
            }
        }
        if (O0(Z0().getText())) {
            return true;
        }
        M0();
        if (this.n1.f) {
            this.C3 = true;
            this.T3.H0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long a12 = a1();
        uh uhVar = this.s2;
        return s4.a0(this.D3, a12, W0() + (uhVar != null ? uhVar.getSelectedItemsCount() : 1), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.xg
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                bi biVar = bi.this;
                biVar.C3 = true;
                biVar.T3.H0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void u0(boolean z10) {
        this.q0 = true;
    }

    public final void u1(boolean z10, boolean z11) {
        this.i1.a(z10, z11);
        wt Z0 = Z0();
        this.T1 = z10;
        wt Z02 = Z0();
        final boolean z12 = this.x2.getTag() != null;
        uh uhVar = this.s2;
        final boolean z13 = this.T1 && (uhVar == this.a2 || uhVar == this.h2);
        fg.i iVar = this.I2;
        ag.q qVar = this.w2;
        if (z11) {
            iVar.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = iVar.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            gr grVar = gr.h;
            final int i10 = 0;
            duration.setInterpolator(grVar).setUpdateListener(new kg(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.lg
                public final /* synthetic */ bi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            bi biVar = this.b;
                            if (!z13 || !z12) {
                                biVar.I2.setVisibility(8);
                            }
                            biVar.P1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.w2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            qVar.setVisibility(0);
            ViewPropertyAnimator interpolator = qVar.animate().translationY((z13 || !z12) ? qVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new kg(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.lg
                public final /* synthetic */ bi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            bi biVar = this.b;
                            if (!z13 || !z12) {
                                biVar.I2.setVisibility(8);
                            }
                            biVar.P1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.w2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            iVar.setVisibility((z13 && z12) ? 0 : 8);
            iVar.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            P1();
            qVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            qVar.setTranslationY((z13 || !z12) ? qVar.getMeasuredHeight() : 0.0f);
            qVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (Z0 != Z02) {
            Z0.k(true);
            Z02.setText(o5.cloneSpans(Z0.getText()));
            Z02.getEditText().setAllowTextEntitiesIntersection(Z0.getEditText().getAllowTextEntitiesIntersection());
            if (Z0.getEditText().isFocused()) {
                Z02.getEditText().requestFocus();
                Z02.getEditText().setSelection(Z0.getEditText().getSelectionStart(), Z0.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.i0.g3(new mg(this, 0));
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        uh uhVar;
        if (i10 == 0) {
            T0();
            R0();
            return;
        }
        if (i10 == 2) {
            R0();
            jn jnVar = this.d2;
            if (jnVar != null && ((uhVar = this.t2) == jnVar || this.s2 == jnVar)) {
                O1(uhVar == jnVar ? 1 : 0);
            }
            jn jnVar2 = this.e2;
            if (jnVar2 != null) {
                uh uhVar2 = this.t2;
                if (uhVar2 == jnVar2 || this.s2 == jnVar2) {
                    O1(uhVar2 != jnVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            R0();
            return;
        }
        if (i10 == 3) {
            S0();
            return;
        }
        if (i10 == 4) {
            S0();
            return;
        }
        if (i10 == 5) {
            S0();
            ih ihVar = this.C2;
            if (ihVar != null) {
                ihVar.setEphemeralFactor(f7);
                ihVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void v1(int i10, org.telegram.messenger.jj jjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (jjVar != null && (chatAttachAlertPhotoLayout = this.a2) != null) {
            chatAttachAlertPhotoLayout.a0();
        }
        if (this.B3 == jjVar && this.A3 == i10) {
            return;
        }
        this.B3 = jjVar;
        if (jjVar != null && jjVar.z2()) {
            i10 = this.B3.I3() ? 2 : this.B3.U2() ? 1 : 0;
        }
        this.A3 = i10;
        if (this.B3 != null) {
            this.M3 = 1;
            this.N3 = false;
        } else {
            this.M3 = -1;
            this.N3 = true;
        }
        this.u3.f();
        J1(0);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        if (this.W1 instanceof org.telegram.ui.un) {
            String[] strArr = MediaController.U1;
        } else {
            String[] strArr2 = MediaController.U1;
        }
        this.s2.x();
        org.telegram.messenger.i0.i2(org.telegram.messenger.cd.L0(2131754921, "AccDescrAttachButton"));
        this.m3 = true;
        if (this.G3 || this.F3) {
            return;
        }
        N0();
    }

    public final void w1(float f7) {
        int i10;
        float translationY = this.b.getTranslationY() - this.p2;
        this.p2 = this.b.getHeight() * f7;
        this.b.setTranslationY(translationY);
        kk kkVar = this.n2;
        if (kkVar != null) {
            kkVar.setSendTransitionProgress(f7);
        }
        if (this.o0) {
            i10 = Math.round((1.0f - f7) * this.p0);
        } else {
            i10 = 0;
        }
        this.Y.setAlpha(i10);
        this.C0 = 1.0f - f7;
        this.c.invalidate();
    }

    public final void x1(int i10, boolean z10) {
        if (this.B3 != null) {
            return;
        }
        this.M3 = i10;
        this.N3 = z10;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean y() {
        return true;
    }

    public final void y1(float f7) {
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0), Math.min(org.telegram.messenger.zs.e4, Math.max(0, (int) (f7 * 255.0f))));
        this.G0 = o10;
        org.telegram.messenger.i0.t3(this, o10, false, null);
        org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(this.G0)) > 0.721d);
        this.c.invalidate();
    }

    public final void z1(String str) {
        this.K2 = 1;
        this.w1 = true;
        this.M2 = false;
        this.G3 = false;
        this.r3.setVisibility(8);
        this.d3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            bi biVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (biVar.K2 == 0 || biVar.w1) ? false : true;
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    public bi(Activity activity, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11) {
        this(activity, k2Var, z10, z11, true, null);
    }
}
