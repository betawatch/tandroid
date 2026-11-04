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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class bi extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.n2, qe.b {
    public static final /* synthetic */ int F4 = 0;
    public int A1;
    public final ImageView A2;
    public float A3;
    public final eh.g A4;
    public org.telegram.messenger.n10 B1;
    public final int[] B2;
    public int B3;
    public final si.c B4;
    public int C1;
    public final ah C2;
    public org.telegram.messenger.zi C3;
    public final eh.c C4;
    public int D1;
    public final ih D2;
    public boolean D3;
    public final eh.c D4;
    public boolean E1;
    public final TextPaint E2;
    public final int E3;
    public final rg E4;
    public boolean F1;
    public final RectF F2;
    public boolean F3;
    public boolean G1;
    public final Paint G2;
    public boolean G3;
    public boolean H1;
    public AnimatorSet H2;
    public boolean H3;
    public d30 I1;
    public long I2;
    public boolean I3;
    public boolean J1;
    public final ai.c0 J2;
    public boolean J3;
    public final zb0 K1;
    public final fh K2;
    public boolean K3;
    public bn L1;
    public int L2;
    public boolean L3;
    public f30 M1;
    public qs M2;
    public boolean M3;
    public boolean N1;
    public boolean N2;
    public int N3;
    public boolean O1;
    public boolean O2;
    public boolean O3;
    public lj P1;
    public boolean P2;
    public boolean P3;
    public ki Q1;
    public final float Q2;
    public float Q3;
    public long R1;
    public long R2;
    public float R3;
    public boolean S1;
    public final p7 S2;
    public ValueAnimator S3;
    public final eh.d T1;
    public AnimatorSet T2;
    public int T3;
    public boolean U1;
    public AnimatorSet U2;
    public zh U3;
    public float V1;
    public final org.telegram.ui.ActionBar.q0 V2;
    public nm V3;
    public final lh W1;
    public final gi.u W2;
    public final int[] W3;
    public final org.telegram.ui.ActionBar.d2 X1;
    public final org.telegram.ui.ActionBar.q0 X2;
    public int X3;
    public final boolean Y1;
    public gi.l3 Y2;
    public float Y3;
    public se Z1;
    public final org.telegram.ui.ActionBar.q0 Z2;
    public float Z3;
    public boolean a2;
    public final fi.j a3;
    public boolean a4;
    public final ChatAttachAlertPhotoLayout b2;
    public float b3;
    public float b4;
    public ej c2;
    public float c3;
    public final boolean c4;
    public ni d2;
    public final ah d3;
    public boolean d4;
    public an e2;
    public final TextView e3;
    public final ArrayList e4;
    public an f2;
    public final org.telegram.ui.ActionBar.q0 f3;
    public final Rect f4;
    public uk g2;
    public final LinearLayout g3;
    public float g4;
    public uj h2;
    public final ImageView h3;
    public boolean h4;
    public am i2;
    public final LinearLayout i3;
    public int i4;
    public final qe.a j1;
    public qi j2;
    public final TextView j3;
    public final lh j4;
    public final qe.a k1;
    public lg.h0 k2;
    public float k3;
    public q1.g k4;
    public final qe.a l1;
    public vj l2;
    public boolean l3;
    public AnimatorSet l4;
    public final qe.a m1;
    public vj m2;
    public final oh m3;
    public int m4;
    public final qe.a n1;
    public mi.p n2;
    public boolean n3;
    public int n4;
    public final qe.a o1;
    public hk o2;
    public Object o3;
    public boolean o4;
    public final qe.j p1;
    public boolean p2;
    public boolean p3;
    public boolean p4;
    public org.telegram.ui.um q1;
    public float q2;
    public final mh.f q3;
    public boolean q4;
    public final h6 r1;
    public final th[] r2;
    public final ch r3;
    public tk r4;
    public final h6 s1;
    public final LongSparseArray s2;
    public final ah s3;
    public boolean s4;
    public final ImageView t1;
    public th t2;
    public final bh t3;
    public boolean t4;
    public final org.telegram.ui.ActionBar.s2 u1;
    public th u2;
    public final u4.b0 u3;
    public File u4;
    public final ImageView v1;
    public final gh.g v2;
    public final yh v3;
    public double[] v4;
    public final org.telegram.ui.ActionBar.s2 w1;
    public final gh.g w2;
    public boolean w3;
    public boolean w4;
    public boolean x1;
    public final lg.j x2;
    public final RadialProgressView x3;
    public boolean x4;
    public boolean y1;
    public final ah y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final dh z2;
    public final h6 z3;
    public gi.i z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        float f10;
        TextPaint textPaint;
        qe.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        fi.j jVar2;
        int i3 = 0;
        xq xqVar = xq.h;
        this.j1 = new qe.a(0, this, xqVar, 380L, false);
        this.k1 = new qe.a(1, this, xqVar, 380L, false);
        this.l1 = new qe.a(2, this, xqVar, 380L, false);
        this.m1 = new qe.a(3, this, xqVar, 380L, false);
        this.n1 = new qe.a(4, this, xqVar, 380L, true);
        this.o1 = new qe.a(5, this, xqVar, 320L, false);
        qe.j jVar3 = new qe.j(new kg(this, 2), xqVar, 380L);
        this.p1 = jVar3;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.H1 = false;
        this.V1 = 0.0f;
        this.W1 = new lh(this, 0);
        this.a2 = false;
        th[] thVarArr = new th[12];
        this.r2 = thVarArr;
        this.s2 = new LongSparseArray();
        this.B2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.E2 = textPaint2;
        this.F2 = new RectF();
        this.G2 = new Paint(1);
        this.P2 = true;
        this.Q2 = 1.0f;
        this.w3 = false;
        this.y3 = false;
        int i10 = org.telegram.messenger.h10.t0;
        this.E3 = i10;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.N3 = -1;
        this.O3 = true;
        this.T3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.W3 = new int[2];
        new Paint(1);
        this.d4 = false;
        ArrayList arrayList = new ArrayList();
        this.e4 = arrayList;
        Rect rect = new Rect();
        this.f4 = rect;
        this.j4 = new lh(this, 1);
        this.p4 = true;
        this.q4 = false;
        this.x4 = false;
        this.y4 = false;
        this.y = true;
        si.c cVar = new si.c();
        this.B4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
        this.Y0.E.add(new pi.o(cVar, new kg(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !org.telegram.messenger.az.f()) {
            this.A4 = null;
            this.C4 = new eh.c(cVar, cVar, cVar);
            this.D4 = new eh.c(cVar, cVar, cVar);
        } else {
            eh.g gVar = new eh.g(false);
            this.A4 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(cVar);
            fVar.f = cVar;
            fVar.d = gVar;
            fVar.e = -2;
            si.f fVar2 = new si.f(null);
            fVar2.f = cVar;
            fVar2.d = gVar;
            fVar2.e = -3;
            eh.c cVar2 = new eh.c(fVar, fVar, fVar);
            this.C4 = cVar2;
            cVar2.k = true;
            int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.e = L;
            eh.c cVar3 = new eh.c(fVar2, fVar2, fVar2);
            this.D4 = cVar3;
            cVar3.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.e = L2;
        }
        eh.c cVar4 = new eh.c(cVar, cVar, cVar);
        this.E4 = new rg(this, i3);
        this.c4 = z10;
        this.Y1 = (d2Var instanceof org.telegram.ui.wm) && d2Var.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.X1 = d2Var;
        this.G = true;
        this.z0 = this;
        org.telegram.messenger.hs.f(i10).c(this, org.telegram.messenger.hs.T0);
        org.telegram.messenger.hs.f(i10).c(this, org.telegram.messenger.hs.W4);
        org.telegram.messenger.hs.f(i10).c(this, org.telegram.messenger.hs.f5);
        org.telegram.messenger.hs.f(i10).c(this, org.telegram.messenger.hs.F1);
        arrayList.add(rect);
        oh ohVar = new oh(this, context);
        this.m3 = ohVar;
        ohVar.setDelegate(new ph(this));
        this.b = ohVar;
        ohVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        p7 p7Var = new p7(this, context, e6Var, 1);
        this.S2 = p7Var;
        p7Var.d1 = true;
        p7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        p7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i12, e6Var);
        int i13 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, i13, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i12, e6Var);
        p7Var.setOccupyStatusBar(true);
        p7Var.setAlpha(0.0f);
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 13));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i12, this.J0), false, e6Var);
        this.V2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(R.drawable.ic_ab_other);
        q0Var2.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new kg(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var2, h02, null, N, e6Var);
        final int i14 = 5;
        q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i14) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.F.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i12, this.J0), false, e6Var);
        this.X2 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        gi.u uVar = new gi.u();
        this.W2 = uVar;
        q0Var3.setIcon(uVar);
        q0Var3.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        final int i15 = 6;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, this.J0), 6, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(q0Var3, h03, null, N2, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i15) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        fi.j jVar4 = new fi.j(this, context);
        org.telegram.ui.ActionBar.r6.V(jVar4, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        jVar4.setText(org.telegram.messenger.bd.M0(2131751753, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        final int i16 = 7;
        jVar4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i16) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        b8.pf.a(jVar4);
        this.a3 = jVar4;
        L1();
        if (d2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            q0Var = q0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i12, this.J0), false, e6Var);
            this.Z2 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(R.drawable.outline_header_search);
            q0Var4.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
            q0Var4.setVisibility(4);
            z13 = false;
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, this.J0), 6, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i13);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(q0Var4, h04, null, N3, e6Var);
            q0Var4.setOnClickListener(new ei.e2(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            q0Var = q0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i12, this.J0), false, e6Var);
        this.f3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(R.drawable.ic_ab_other);
        q0Var5.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        final int i17 = 8;
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, this.J0), 3, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i13);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(q0Var5, h05, null, N4, e6Var);
        final int i18 = 2;
        q0Var5.e(1, R.drawable.msg_addbot, org.telegram.messenger.bd.M0(2131744887, null)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pg
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar = biVar.z2;
                        if (dhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar.getText());
                            final int i19 = 0;
                            e0Var.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            dh dhVar2 = biVar.z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar = biVar.K2;
                                            fhVar.setText(charSequence);
                                            fhVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            boolean z14 = biVar.C3 != null;
                            tg tgVar = new tg(biVar, 0);
                            e0Var.e2 = j10;
                            e0Var.f2 = z14;
                            e0Var.g2 = tgVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar = biVar2.K2;
                        if (fhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar.getText());
                            final int i20 = 1;
                            e0Var2.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            dh dhVar2 = biVar2.z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar2.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            boolean z15 = biVar2.C3 != null;
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.e2 = j11;
                            e0Var2.f2 = z15;
                            e0Var2.g2 = tgVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i21 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i21;
                        v13.n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i22 = point.x;
                        int i23 = point.y;
                        if (i22 > 1080 || i23 > 1080) {
                            float min = Math.min(i22, i23) / 1080.0f;
                            i22 = (int) (i22 * min);
                            i23 = (int) (i23 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i22, i23, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new sh(biVar3, yeVar), d2Var2 instanceof org.telegram.ui.wm ? (org.telegram.ui.wm) d2Var2 : null);
                        if (biVar3.y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
                            break;
                        }
                        break;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i17) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        final int i19 = 0;
        ah ahVar = new ah(this, context, i19);
        this.d3 = ahVar;
        ahVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i19) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        ahVar.setAlpha(0.0f);
        ahVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.g3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.e3 = textView;
        org.telegram.messenger.k5.n(textView, i12, e6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, b8.mf.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.h3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(imageView, mutate, i12, e6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, b8.mf.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ahVar.addView(linearLayout, b8.mf.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.r6.y(imageView2, mutate2, i12, e6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, b8.mf.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.j3 = textView2;
        org.telegram.messenger.k5.n(textView2, i12, e6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, b8.mf.r(-2, -2, 16));
        ahVar.addView(linearLayout2, b8.mf.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.b2 = chatAttachAlertPhotoLayout;
        thVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.t2 = chatAttachAlertPhotoLayout;
        this.R2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, b8.mf.c(-1.0f, -1));
        mh.f fVar3 = new mh.f(context);
        this.q3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        this.b.addView(fVar3, b8.mf.g());
        this.b.addView(ahVar, b8.mf.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.c0 c0Var = new ai.c0(context, 13);
        this.J2 = c0Var;
        this.b.addView(c0Var, b8.mf.e(-1, -2, 55));
        this.b.addView(p7Var, b8.mf.c(-2.0f, -1));
        this.b.addView(q0Var2, b8.mf.e(48, 48, 53));
        this.b.addView(q0Var, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.Z2;
        if (q0Var6 != null) {
            this.b.addView(q0Var6, b8.mf.e(48, 48, 53));
        }
        ahVar.addView(q0Var5, b8.mf.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(jVar2, b8.mf.e(-2, 48, 53));
        ah ahVar2 = new ah(this, context, 1);
        this.s3 = ahVar2;
        bh bhVar = new bh(context, 0);
        this.t3 = bhVar;
        bhVar.setClipChildren(true);
        bhVar.setClipToPadding(false);
        yh yhVar = new yh(this, context);
        this.v3 = yhVar;
        bhVar.setAdapter(yhVar);
        u4.b0 b0Var = new u4.b0(0, false);
        this.u3 = b0Var;
        bhVar.setLayoutManager(b0Var);
        bhVar.setVerticalScrollBarEnabled(false);
        bhVar.setHorizontalScrollBarEnabled(false);
        bhVar.setItemAnimator(null);
        bhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(bhVar, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        bhVar.z2 = true;
        bhVar.setOverScrollMode(2);
        eh.c cVar5 = this.C4;
        pi.q qVar = this.Y0;
        cVar5.j = qVar;
        this.D4.j = qVar;
        cVar4.j = qVar;
        ch chVar = new ch(this, context, 0);
        this.r3 = chVar;
        eh.d dVar = new eh.d(cVar4.c(chVar, null, false));
        this.T1 = dVar;
        if (org.telegram.messenger.az.f()) {
            org.telegram.messenger.lc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.b.addView(chVar, b8.mf.g());
        gh.g c2 = this.C4.c(ahVar2, b8.cd.f(e6Var), false);
        c2.r(org.telegram.messenger.g0.L(28.0f));
        c2.q(org.telegram.messenger.g0.L(7.0f));
        ahVar2.setBackground(c2);
        bhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        bhVar.setClipToOutline(true);
        int L3 = org.telegram.messenger.g0.L(11.0f);
        float L4 = org.telegram.messenger.g0.L(28.0f);
        cg.p0 p0Var = cg.t0.a;
        bhVar.setOutlineProvider(new cg.r0(L3, L4));
        bhVar.setImportantForAccessibility(1);
        ahVar2.addView(bhVar, b8.mf.g());
        this.b.addView(ahVar2, b8.mf.e(-1, 70, 81));
        bhVar.setOnItemClickListener(new ei.q4(9, this, e6Var));
        bhVar.setOnItemLongClickListener(new kg(this, 3));
        h6 h6Var = new h6(context, true, false, true);
        this.z3 = h6Var;
        h6Var.setVisibility(8);
        h6Var.setAlpha(0.0f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int L5 = org.telegram.messenger.g0.L(16.0f);
        h6Var.setPadding(L5, 0, L5, 0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        final int i20 = 1;
        h6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i20) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(h6Var, b8.mf.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, b8.mf.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.A2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i21 = org.telegram.ui.ActionBar.k6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i21, e6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i22 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i22) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        ah ahVar3 = new ah(this, context, i22);
        this.y2 = ahVar3;
        lg.j jVar5 = new lg.j(this, context);
        this.x2 = jVar5;
        ahVar3.addView(jVar5, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        gh.g c10 = this.D4.c(ohVar, b8.cd.o(e6Var), false);
        this.v2 = c10;
        c10.T = true;
        c10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c10.u(org.telegram.messenger.g0.L(32.0f));
        c10.R.g = 0.4f;
        c10.n();
        gh.g c11 = this.C4.c(jVar5, b8.cd.o(e6Var), false);
        this.w2 = c11;
        c11.r(org.telegram.messenger.g0.L(22.0f));
        c11.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        ahVar3.setWillNotDraw(false);
        ahVar3.setVisibility(4);
        ahVar3.setAlpha(0.0f);
        this.b.addView(ahVar3, b8.mf.e(-1, -2, 83));
        ahVar3.setOnTouchListener(new fi.a(13));
        h6 h6Var2 = new h6(context, false, false, false);
        this.r1 = h6Var2;
        h6Var2.setAllowCancel(true);
        h6Var2.setScaleProperty(0.6f);
        h6Var2.setVisibility(8);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i23 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i23, e6Var);
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        jVar5.addView(h6Var2, b8.mf.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.t1 = imageView4;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(context);
        this.u1 = s2Var;
        imageView4.setImageDrawable(s2Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.k6.Kl;
        org.telegram.ui.ActionBar.r6.t(imageView4, i24, e6Var, mode);
        int i25 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i25);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView4, h06, null, N5, e6Var);
        jVar5.addView(imageView4, b8.mf.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pg
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar = biVar.z2;
                        if (dhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar.getText());
                            final int i192 = 0;
                            e0Var.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            dh dhVar2 = biVar.z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            boolean z14 = biVar.C3 != null;
                            tg tgVar = new tg(biVar, 0);
                            e0Var.e2 = j10;
                            e0Var.f2 = z14;
                            e0Var.g2 = tgVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar = biVar2.K2;
                        if (fhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar.getText());
                            final int i202 = 1;
                            e0Var2.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            dh dhVar2 = biVar2.z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar2.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            boolean z15 = biVar2.C3 != null;
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.e2 = j11;
                            e0Var2.f2 = z15;
                            e0Var2.g2 = tgVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i212 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i212;
                        v13.n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new sh(biVar3, yeVar), d2Var2 instanceof org.telegram.ui.wm ? (org.telegram.ui.wm) d2Var2 : null);
                        if (biVar3.y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
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
        this.C1 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).H0();
        dh dhVar = new dh(this, context, ohVar, e6Var);
        this.z2 = dhVar;
        dhVar.K = true;
        dhVar.setHint(org.telegram.messenger.bd.M0(2131754454, "AddCaption"));
        dhVar.s();
        dhVar.getEditText().setLayoutParams(b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        dhVar.getEditText().addTextChangedListener(new eh(this, 0));
        jVar5.addView(dhVar, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        ahVar3.setClipChildren(false);
        dhVar.setClipChildren(false);
        c0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        c0Var.setWillNotDraw(false);
        fh fhVar = new fh(this, context, ohVar, e6Var);
        this.K2 = fhVar;
        fhVar.K = true;
        fhVar.getEditText().addTextChangedListener(new hh(this, d2Var));
        fhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        fhVar.getEditText().setLayoutParams(b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        fhVar.getEditText().setTextSize(1, 17.0f);
        fhVar.getEmojiButton().setLayoutParams(b8.mf.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        fhVar.setHint(org.telegram.messenger.bd.M0(2131754454, "AddCaption"));
        c0Var.addView(fhVar, b8.mf.e(-1, -2, org.telegram.messenger.hs.E1));
        c0Var.setAlpha(0.0f);
        c0Var.setVisibility(8);
        dhVar.addView(imageView3, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        gh.g c12 = this.C4.c(c0Var, b8.cd.o(e6Var), false);
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        c0Var.setBackground(c12);
        c0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        h6 h6Var3 = new h6(context, false, false, false);
        this.s1 = h6Var3;
        h6Var3.setScaleProperty(0.6f);
        h6Var3.setVisibility(8);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var3, i23, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        h6Var3.setAllowCancel(true);
        c0Var.addView(h6Var3, b8.mf.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Le, e6Var, mode2);
        fhVar.addView(imageView5, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i27) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.v1 = imageView6;
        org.telegram.ui.ActionBar.s2 s2Var2 = new org.telegram.ui.ActionBar.s2(context);
        this.w1 = s2Var2;
        imageView6.setImageDrawable(s2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView6, i24, e6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i25, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i25);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.r6.k(imageView6, h07, null, N6, e6Var);
        c0Var.addView(imageView6, b8.mf.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pg
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final bi biVar = this.b;
                        dh dhVar2 = biVar.z2;
                        if (dhVar2 != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar2.getText());
                            final int i192 = 0;
                            e0Var.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            dh dhVar22 = biVar.z2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar2 = biVar.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            boolean z14 = biVar.C3 != null;
                            tg tgVar = new tg(biVar, 0);
                            e0Var.e2 = j10;
                            e0Var.f2 = z14;
                            e0Var.g2 = tgVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final bi biVar2 = this.b;
                        fh fhVar2 = biVar2.K2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar2.getText());
                            final int i202 = 1;
                            e0Var2.c2 = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sg
                                @Override // org.telegram.messenger.u10
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            dh dhVar22 = biVar2.z2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            fh fhVar22 = biVar2.K2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            boolean z15 = biVar2.C3 != null;
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.e2 = j11;
                            e0Var2.f2 = z15;
                            e0Var2.g2 = tgVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        bi biVar3 = this.b;
                        biVar3.f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i212 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i212;
                        v13.n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.q;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer.v1().j2(arrayList2, 0, 11, false, new sh(biVar3, yeVar), d2Var2 instanceof org.telegram.ui.wm ? (org.telegram.ui.wm) d2Var2 : null);
                        if (biVar3.y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
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
        this.C2 = ahVar4;
        ahVar4.setFocusable(true);
        ahVar4.setFocusableInTouchMode(true);
        ahVar4.setVisibility(4);
        ahVar4.setScaleX(0.2f);
        ahVar4.setScaleY(0.2f);
        ahVar4.setAlpha(0.0f);
        ahVar4.setClipChildren(false);
        ahVar4.setClipToPadding(false);
        this.b.addView(ahVar4, b8.mf.e(org.telegram.messenger.hs.v1, 50, 85));
        ih ihVar = new ih(context, e6Var, this);
        this.D2 = ihVar;
        ihVar.setImportantForAccessibility(2);
        ahVar4.addView(ihVar, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        ihVar.setTranslationX(this.u0);
        int L6 = org.telegram.messenger.g0.L(52.0f);
        int L7 = org.telegram.messenger.g0.L(38.0f);
        ihVar.J = L6;
        ihVar.K = L7;
        float L8 = org.telegram.messenger.g0.L(7.0f);
        float L9 = org.telegram.messenger.g0.L(6.0f);
        ihVar.N = L8;
        ihVar.O = L9;
        ihVar.i0 = true;
        final int i29 = 4;
        ihVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.og
            public final /* synthetic */ bi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ii.d4 d4Var;
                switch (i29) {
                    case 0:
                        bi biVar = this.b;
                        biVar.O1(biVar.t2 != biVar.i2);
                        break;
                    case 1:
                        bi biVar2 = this.b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        bi biVar3 = this.b;
                        boolean z14 = biVar3.U1;
                        if (!z14) {
                            biVar3.v1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        bi biVar4 = this.b;
                        boolean z15 = biVar4.U1;
                        if (z15) {
                            biVar4.v1(!z15, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.n1();
                        break;
                    case 5:
                        this.b.V2.U(null, null);
                        break;
                    case 6:
                        bi biVar5 = this.b;
                        if (biVar5.b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.F.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(!U ? 2131748840 : 2131748841, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            break;
                        }
                        break;
                    case 7:
                        th thVar = this.b.t2;
                        if (thVar != null) {
                            thVar.w(40);
                            break;
                        }
                        break;
                    default:
                        this.b.f3.U(null, null);
                        break;
                }
            }
        });
        ihVar.setOnLongClickListener(new org.telegram.ui.lf(this, context, e6Var, d2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        ch chVar2 = new ch(this, context, 1);
        chVar2.setAlpha(0.0f);
        chVar2.setScaleX(0.2f);
        chVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.C4, b8.cd.o(e6Var));
        zb0 zb0Var = new zb0(context);
        this.K1 = zb0Var;
        this.b.addView(zb0Var, b8.mf.c(-1.0f, -1));
        hh.e eVar = new hh.e(e6Var);
        eVar.e = new kg(this, 5);
        eVar.c = new kg(this, 6);
        eVar.d = new kg(this, 7);
        eVar.b = new kg(this, 8);
        float N7 = org.telegram.messenger.g0.N(3.3333333f);
        float N8 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.n = N7;
        eVar.r = N8;
        float N9 = org.telegram.messenger.g0.N(1.0f);
        float N10 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f = N9;
        eVar.h = N10;
        p7Var.M(this.C4, eVar, false);
        jVar.h(1L, false);
        this.Y0.i(this.b);
        pi.q qVar2 = this.Y0;
        qVar2.a = new kg(this, 9);
        qVar2.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static void I0(bi biVar) {
        p7 p7Var = biVar.S2;
        mh.f fVar = biVar.q3;
        if (fVar == null || p7Var == null) {
            return;
        }
        th thVar = biVar.u2;
        if (thVar == null) {
            thVar = biVar.t2;
        }
        int i3 = 0;
        boolean z10 = thVar != null && thVar.f();
        org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        if (!z10 && p7Var.getVisibility() == 0) {
            i3 = (int) (p7Var.getAlpha() * (a10 ? org.telegram.messenger.hs.e4 : org.telegram.messenger.hs.q2));
        }
        fVar.setFadeTopAlpha(i3);
    }

    public static void K0(bi biVar) {
        gi.i iVar = new gi.i(biVar, biVar.getContext(), biVar.R1, LaunchActivity.Q(), biVar.J0, 1);
        biVar.z4 = iVar;
        iVar.p(new nh(biVar, 0));
        ViewGroup viewGroup = biVar.b;
        viewGroup.addView(biVar.z4, viewGroup.indexOfChild(biVar.y2), b8.mf.e(-1, -1, 83));
        gi.i iVar2 = biVar.z4;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            iVar2.getAdapter().n0 = false;
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            kg.e1 adapter = iVar2.getAdapter();
            wmVar.j();
            TLRPC.Chat chat = wmVar.e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(wmVar.q8);
            iVar2.getAdapter().f0 = wmVar.e != null;
        } else {
            iVar2.getAdapter().n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f0 = false;
        }
        iVar2.getAdapter().g0 = false;
        biVar.J1();
    }

    public static int L0(bi biVar) {
        th thVar = biVar.t2;
        an anVar = biVar.e2;
        if (thVar == anVar && anVar.F != null) {
            return anVar.getEmojiPadding();
        }
        an anVar2 = biVar.f2;
        return (thVar != anVar2 || anVar2.F == null) ? biVar.U1 ? biVar.K2.getEmojiPadding() : biVar.z2.getEmojiPadding() : anVar2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        return (user == null || org.telegram.messenger.l10.B(user) || org.telegram.messenger.l10.t(user) || org.telegram.messenger.l10.x(user) || org.telegram.messenger.l10.A(user.id) || org.telegram.messenger.l10.z(user) || org.telegram.messenger.l10.s(user) || user.id == 489000 || org.telegram.messenger.hp.F2(user)) ? false : true;
    }

    public static void s1(th thVar) {
        if (thVar == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.r6.b;
        Object tag = thVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i3) {
            return;
        }
        thVar.setTag(R.id.theme_generation, Integer.valueOf(i3));
        try {
            org.telegram.ui.ActionBar.r6.d0(thVar, true);
            thVar.d();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A1(String str) {
        this.L2 = 1;
        this.x1 = true;
        this.N2 = false;
        this.H3 = false;
        this.s3.setVisibility(8);
        this.e3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        if (chatAttachAlertPhotoLayout != null) {
            bi biVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (biVar.L2 == 0 || biVar.x1) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if ((d2Var instanceof org.telegram.ui.wm) && !((org.telegram.ui.wm) d2Var).z()) {
                z11 = true;
                if (this.w4 != z11) {
                    return;
                }
                if (z11) {
                    org.telegram.messenger.hp.s1(this.E3).R1().b();
                }
                this.w4 = z11;
                ImageView imageView = this.t1;
                imageView.setVisibility(0);
                ImageView imageView2 = this.v1;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                xq xqVar = xq.h;
                scaleY.setInterpolator(xqVar).setDuration(420L).withEndAction(new wg(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(xqVar).setDuration(420L).withEndAction(new wg(this, z11, 2)).start();
                if (z11) {
                    org.telegram.ui.ActionBar.s2 s2Var = this.u1;
                    Objects.requireNonNull(s2Var);
                    imageView.postDelayed(new h0(s2Var, 1), 220L);
                    org.telegram.ui.ActionBar.s2 s2Var2 = this.w1;
                    Objects.requireNonNull(s2Var2);
                    imageView2.postDelayed(new h0(s2Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.w4 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(long j10, String str, boolean z10, boolean z11) {
        boolean z12;
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.s2;
        int i3 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((ii.d4) longSparseArray.get(j10)).getStartCommand())) {
            ii.d4 d4Var = (ii.d4) longSparseArray.get(j10);
            if (d4Var.I) {
                d4Var.I = false;
            }
            z12 = true;
            if (longSparseArray.get(j10) != null) {
                ((ii.d4) longSparseArray.get(j10)).K.setSwipeOffsetAnimationDisallowed(z12);
                G1((th) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    ii.d4 d4Var2 = (ii.d4) longSparseArray.get(j10);
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(d4Var2.G).a2(Long.valueOf(d4Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.li.b0(d4Var2.G).b.bots;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                        i10++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == d4Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    org.telegram.messenger.g0.i3(new ii.e(7, d4Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.bd.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753138, a22.first_name) : z13 ? org.telegram.messenger.bd.a0("BotAttachMenuShortcatAddedSide", null, 2131753137, a22.first_name) : org.telegram.messenger.bd.a0("BotAttachMenuShortcatAddedAttach", null, 2131753139, a22.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            ii.d4 d4Var3 = new ii.d4(context, e6Var, this);
            d4Var3.V = new ii.s3(d4Var3, 2);
            org.telegram.ui.ActionBar.q0 a10 = d4Var3.b.S2.q().a(0, R.drawable.ic_ab_other);
            d4Var3.L = a10;
            a10.e(R.id.menu_open_bot, R.drawable.msg_bot, org.telegram.messenger.bd.M0(2131752912, null));
            org.telegram.ui.ActionBar.y0 e10 = a10.e(R.id.menu_settings, R.drawable.msg_settings, org.telegram.messenger.bd.M0(2131752897, null));
            d4Var3.M = e10;
            e10.setVisibility(8);
            a10.e(R.id.menu_reload_page, R.drawable.msg_retry, org.telegram.messenger.bd.M0(2131752911, null));
            org.telegram.ui.ActionBar.y0 e11 = a10.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
            d4Var3.N = e11;
            e11.setVisibility(8);
            a10.e(R.id.menu_tos_bot, R.drawable.menu_intro, org.telegram.messenger.bd.M0(2131752894, null));
            a10.e(R.id.menu_report_bot, R.drawable.msg_report, org.telegram.messenger.bd.M0(2131752910, null));
            a10.e(R.id.menu_delete_bot, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131752915, null));
            ii.s2 s2Var = new ii.s2(d4Var3, context, e6Var, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, d4Var3.a), 1);
            d4Var3.n = s2Var;
            ii.r2 r2Var = new ii.r2(i3, context, d4Var3);
            d4Var3.K = r2Var;
            r2Var.addView(s2Var, b8.mf.c(-1.0f, -1));
            r2Var.setScrollListener(new ii.s3(d4Var3, 3));
            int i11 = 4;
            r2Var.setScrollEndListener(new ii.s3(d4Var3, i11));
            r2Var.setDelegate(new ii.u3(d4Var3));
            r2Var.setIsKeyboardVisible(new ii.u3(d4Var3));
            d4Var3.addView(r2Var, b8.mf.c(-1.0f, -1));
            ii.w3 w3Var = new ii.w3(context, e6Var);
            d4Var3.J = w3Var;
            d4Var3.addView(w3Var, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            s2Var.setWebViewProgressListener(new ai.q6(d4Var3, i11));
            org.telegram.messenger.hs.e().c(d4Var3, org.telegram.messenger.hs.n4);
            longSparseArray.put(j10, d4Var3);
            ((ii.d4) longSparseArray.get(j10)).setDelegate(new gh(this, d4Var3, str, j10));
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            org.telegram.messenger.zi replyingMessageObject = wmVar.a0.getReplyingMessageObject();
            ii.d4 d4Var4 = (ii.d4) longSparseArray.get(j10);
            long a11 = wmVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long h92 = wmVar.h9();
            ii.s2 s2Var2 = d4Var4.n;
            int i13 = this.E3;
            d4Var4.G = i13;
            d4Var4.x = a11;
            d4Var4.w = j10;
            d4Var4.E = i12;
            d4Var4.F = h92;
            d4Var4.H = str;
            org.telegram.ui.ActionBar.y0 y0Var = d4Var4.N;
            if (y0Var != null) {
                org.telegram.messenger.li.b0(i13);
                z12 = true;
                y0Var.setVisibility(0);
            } else {
                z12 = true;
            }
            s2Var2.setBotUser(org.telegram.messenger.hp.s1(i13).a2(Long.valueOf(j10)));
            s2Var2.s(i13, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = org.telegram.messenger.hp.s1(i13).j1(a11);
            tL_messages_requestWebView.bot = org.telegram.messenger.hp.s1(i13).o1(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a11 < 0 && (N0 = org.telegram.messenger.hp.s1(i13).N0(-a11)) != null && (peer = N0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = org.telegram.messenger.hp.s1(i13).m1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i12 != 0) {
                org.telegram.messenger.yy.C(i13);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i12;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (h92 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = org.telegram.messenger.hp.s1(i13).j1(h92);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (h92 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = org.telegram.messenger.hp.s1(i13).j1(h92);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u10 = ii.a3.u(d4Var4.a, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new ci.a2(d4Var4, i13, i11));
            org.telegram.messenger.hs.f(i13).c(d4Var4, org.telegram.messenger.hs.z1);
            if (longSparseArray.get(j10) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void D1(org.telegram.ui.ActionBar.d2 d2Var) {
        if ((d2Var instanceof org.telegram.ui.wm) && org.telegram.messenger.t3.V(((org.telegram.ui.wm) d2Var).e)) {
            new fc(this.m3, this.J0).f(org.telegram.messenger.hp.s1(this.E3).U4, new org.telegram.ui.lo(17, this, d2Var)).j();
        }
    }

    public final boolean E1(boolean z10, boolean z11) {
        float f10;
        int i3;
        th thVar;
        p7 p7Var;
        this.k1.a(z10, true);
        ah ahVar = this.y2;
        if (z10 == (ahVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.H2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ahVar.setTag(z10 ? 1 : null);
        dh dhVar = this.z2;
        if (dhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(dhVar.getEditText());
        }
        dhVar.k(true);
        this.K2.k(true);
        ah ahVar2 = this.s3;
        ah ahVar3 = this.C2;
        if (z10) {
            if (!this.F1) {
                ahVar.setVisibility(0);
            }
            ahVar3.setVisibility(0);
        } else if (this.N2) {
            ahVar2.setVisibility(0);
        }
        th thVar2 = this.t2;
        boolean z12 = (thVar2 == this.b2 || thVar2 == this.i2) && this.U1;
        p7 p7Var2 = this.S2;
        ai.c0 c0Var = this.J2;
        lg.j jVar = this.x2;
        ih ihVar = this.D2;
        if (z11) {
            this.H2 = new AnimatorSet();
            if (z12) {
                c0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<lg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                p7Var = p7Var2;
            } else {
                jVar.setVisibility(0);
                p7Var = p7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<lg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(c0Var, (Property<ai.c0, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, (Property<ah, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property3, z10 ? 1.0f : 0.2f));
            if (p7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) View.TRANSLATION_Y, z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f)));
            } else if (this.N2) {
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, (Property<ah, Float>) View.TRANSLATION_Y, z10 ? org.telegram.messenger.g0.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, (Property<ah, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lg(this, 5));
                arrayList.add(ofFloat);
            }
            this.H2.playTogether(arrayList);
            this.H2.setInterpolator(new DecelerateInterpolator());
            this.H2.setDuration(180L);
            this.H2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.H2.start();
            i3 = 0;
        } else {
            ahVar.setAlpha(z10 ? 1.0f : 0.0f);
            jVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                f10 = 0.0f;
                i3 = 0;
            } else {
                i3 = 0;
                jVar.setVisibility(0);
                f10 = 0.0f;
                jVar.setTranslationY(0.0f);
            }
            ahVar3.setScaleX(z10 ? 1.0f : 0.2f);
            ahVar3.setScaleY(z10 ? 1.0f : 0.2f);
            ahVar3.setAlpha(z10 ? 1.0f : f10);
            c0Var.setVisibility((z10 && z12) ? i3 : 8);
            c0Var.setAlpha((z10 && z12) ? 1.0f : f10);
            ihVar.setScaleX(z10 ? 1.0f : 0.2f);
            ihVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (p7Var2.getTag() != null) {
                ahVar.setTranslationY(z10 ? f10 : org.telegram.messenger.g0.L(48.0f));
            } else if (this.N2 && ((thVar = this.t2) == null || thVar.M())) {
                ahVar2.setTranslationY(z10 ? org.telegram.messenger.g0.L(84.0f) : f10);
            }
            if (!z10) {
                ahVar.setVisibility(4);
                ahVar3.setVisibility(4);
            }
            if (z12) {
                Q1();
            }
        }
        if (z10) {
            i3 = Math.max(1, this.t2.getSelectedItemsCount());
        }
        ihVar.e(i3, z11);
        ihVar.i(X0() + this.t2.getSelectedItemsCount(), this.C3 != null ? 0L : org.telegram.messenger.hp.s1(this.E3).N1(b1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), ihVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            dhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(th thVar) {
        long j10 = this.R2;
        bn bnVar = this.L1;
        if (thVar == bnVar) {
            j10 = bnVar.s;
        } else if (thVar == this.b2) {
            j10 = 1;
        } else if (thVar == this.d2) {
            j10 = 3;
        } else if (thVar == this.h2) {
            j10 = 4;
        } else if (thVar == this.c2) {
            j10 = 5;
        } else if (thVar == this.g2) {
            j10 = 6;
        } else if (thVar == this.e2) {
            j10 = 9;
        } else if (thVar == this.j2) {
            j10 = 10;
        } else if (thVar == this.k2) {
            j10 = 11;
        } else if (thVar == this.f2) {
            j10 = 12;
        } else if (thVar == this.l2) {
            j10 = 14;
        } else if (thVar == this.m2) {
            j10 = 13;
        } else if (thVar == this.n2) {
            j10 = 16;
        } else if (thVar == this.o2) {
            j10 = 17;
        }
        G1(thVar, j10, true);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void G1(th thVar, long j10, boolean z10) {
        pl plVar;
        pl plVar2;
        int i3;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.o3 == null && this.H2 == null) {
            th thVar2 = this.t2;
            if (thVar2 == thVar) {
                thVar2.J();
                return;
            }
            if (thVar == this.f2 && !org.telegram.messenger.h10.i(this.E3).q()) {
                new vg.v0(this.X1, 39, false).show();
                return;
            }
            int i11 = 1;
            this.n1.a(j10 == 1, z10);
            this.p1.h(Long.valueOf(j10), z10);
            this.y3 = false;
            this.w3 = false;
            this.A3 = 0.0f;
            this.z3.setVisibility(8);
            RadialProgressView radialProgressView = this.x3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ah ahVar = this.s3;
            ahVar.setAlpha(1.0f);
            ahVar.setTranslationY(this.A3);
            int i12 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.s2;
                if (i12 >= longSparseArray.size()) {
                    break;
                }
                ((ii.d4) longSparseArray.valueAt(i12)).setMeasureOffsetY(0);
                i12++;
            }
            this.R2 = j10;
            bh bhVar = this.t3;
            int childCount = bhVar.getChildCount();
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = bhVar.getChildAt(i13);
                if (childAt instanceof vh) {
                    vh vhVar = (vh) childAt;
                    i10 = childCount;
                    f10 = valueOf;
                    vhVar.a.f(((long) vhVar.b) == vhVar.c.R2, true);
                } else {
                    f10 = valueOf;
                    i10 = childCount;
                    if (childAt instanceof uh) {
                        ((uh) childAt).a(true);
                    }
                }
                i13++;
                childCount = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int firstOffset = (this.t2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.W3[0];
            this.u2 = thVar;
            S0(thVar);
            int i14 = this.u2.j() != 0 ? 0 : 4;
            p7 p7Var = this.S2;
            p7Var.setVisibility(i14);
            if (p7Var.o0) {
                p7Var.l(true);
            }
            this.t2.u();
            th thVar3 = this.u2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
            if (thVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.u2.H(this.t2);
            this.u2.setVisibility(0);
            if (thVar.getParent() != null) {
                this.b.removeView(this.u2);
            }
            int indexOfChild = this.b.indexOfChild(this.t2);
            if (this.u2.getParent() != this.b) {
                s1(this.u2);
                ViewGroup viewGroup = this.b;
                th thVar4 = this.u2;
                if (thVar4 != this.g2) {
                    indexOfChild++;
                }
                viewGroup.addView(thVar4, indexOfChild, b8.mf.c(-1.0f, -1));
            }
            ng ngVar = new ng(this, 5);
            th thVar5 = this.t2;
            boolean z11 = thVar5 instanceof am;
            lh lhVar = this.W1;
            if (z11 || (this.u2 instanceof am)) {
                int max = Math.max(this.u2.getWidth(), this.t2.getWidth());
                th thVar6 = this.u2;
                if (thVar6 instanceof am) {
                    thVar6.setTranslationX(max);
                    th thVar7 = this.t2;
                    if ((thVar7 instanceof ChatAttachAlertPhotoLayout) && (plVar2 = ((ChatAttachAlertPhotoLayout) thVar7).Q) != null) {
                        plVar2.setVisibility(4);
                    }
                } else {
                    this.t2.setTranslationX(-max);
                    th thVar8 = this.u2;
                    if (thVar8 == chatAttachAlertPhotoLayout && (plVar = ((ChatAttachAlertPhotoLayout) thVar8).Q) != null) {
                        plVar.setVisibility(0);
                    }
                }
                this.u2.setAlpha(1.0f);
                this.t2.setAlpha(1.0f);
                if (z10) {
                    th thVar9 = this.t2;
                    lhVar.getClass();
                    lhVar.a(thVar9, f11);
                    org.telegram.messenger.g0.h3(new e7(this, thVar, ngVar, 4));
                } else {
                    boolean z12 = this.u2.getCurrentItemTop() <= thVar.getButtonsHideOffset();
                    this.t2.v(1.0f);
                    this.u2.v(1.0f);
                    this.t2.m(this.g4);
                    this.u2.m(this.g4);
                    this.b.invalidate();
                    this.Y0.g();
                    th thVar10 = this.t2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    lhVar.getClass();
                    lhVar.a(thVar10, valueOf2);
                    p7Var.setTag(z12 ? 1 : null);
                    ngVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.u2.setAlpha(0.0f);
                this.u2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.t2, (Property<th, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.t2, lhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(p7Var, (Property<p7, Float>) View.ALPHA, p7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(xq.f);
                animatorSet.addListener(new ci.h4(this, firstOffset, ngVar, i11));
                this.o3 = animatorSet;
                th thVar11 = this.t2;
                lhVar.getClass();
                lhVar.a(thVar11, f11);
                animatorSet.start();
            } else {
                thVar5.setAlpha(0.0f);
                ngVar.run();
                P1(0);
                this.b.invalidate();
            }
            if (!this.h4 || (thVar instanceof ii.d4)) {
                i3 = 0;
            } else {
                i3 = 0;
                this.h4 = false;
                p7Var.updateColors();
                p7Var.invalidate();
                i1();
            }
            p7Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || j10 == 17 || (thVar instanceof ii.d4)) ? org.telegram.messenger.g0.L(46.0f) : j10 == 4 ? org.telegram.messenger.g0.L(84.0f) : i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H() {
        return this.t2.b();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H0() {
        th thVar = this.t2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        return thVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void H1(boolean z10, Boolean bool) {
        bi biVar;
        if (this.e2 == null) {
            biVar = this;
            an anVar = new an(biVar, getContext(), false, this.J0, bool);
            biVar.e2 = anVar;
            biVar.r2[1] = anVar;
            anVar.setDelegate(new kg(this, 17));
        } else {
            biVar = this;
        }
        G1(biVar.e2, 9L, z10);
    }

    public final void I1(boolean z10, boolean z11) {
        th thVar;
        this.l1.a(z10, z11);
        p7 p7Var = this.S2;
        if (!(z10 && p7Var.getTag() == null) && (z10 || p7Var.getTag() == null)) {
            return;
        }
        p7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.T2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T2 = null;
        }
        boolean z12 = (this.x1 || this.O2 || (this.L2 == 0 && this.l3) || this.t2 != this.b2 || (!this.G3 && !this.H3)) ? false : true;
        if (this.t2 == this.L1) {
            z12 = false;
        }
        ah ahVar = this.s3;
        org.telegram.ui.ActionBar.q0 q0Var = this.V2;
        if (z10) {
            if (z12) {
                q0Var.setVisibility(0);
                q0Var.setClickable(true);
            }
        } else if (this.N2 && this.y2.getTag() == null) {
            ahVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var != null) {
            if (z10) {
                org.telegram.messenger.g0.q3(this, i0.a.h(org.telegram.ui.ActionBar.k6.w0(this.c4 ? org.telegram.ui.ActionBar.k6.hh : org.telegram.ui.ActionBar.k6.h5, this.J0)) > 0.699999988079071d);
            } else {
                org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
            }
        }
        int i3 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - p7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, (Property<p7, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new lg(this, i3));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.T2.playTogether(arrayList);
            this.T2.addListener(new s9(2, this, z10));
            this.T2.setInterpolator(xq.h);
            this.T2.setDuration(380L);
            this.T2.start();
            return;
        }
        if (z10 && this.N2 && ((thVar = this.t2) == null || thVar.M())) {
            ahVar.setVisibility(4);
        }
        p7Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            q0Var.setAlpha(z10 ? 1.0f : 0.0f);
            q0Var.setScaleX(z10 ? 1.0f : 0.6f);
            q0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.Z2;
        if (q0Var2 != null) {
            q0Var2.setVisibility(4);
        }
        if (this.L2 == 0 && this.l3) {
            return;
        }
        q0Var.setVisibility(4);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void J() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            q1.g gVar = this.k4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.l4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.B2;
        dh dhVar = this.z2;
        dhVar.getLocationOnScreen(iArr);
        if (this.z4 != null) {
            th thVar = this.t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
            if ((thVar == chatAttachAlertPhotoLayout || thVar == this.i2) && this.U1) {
                ai.c0 c0Var = this.J2;
                alpha = (c0Var.getAlpha() * c0Var.getMeasuredHeight()) + (c0Var.getY() - this.z4.getTop());
            } else {
                alpha = -dhVar.getHeight();
            }
            if (Math.abs(this.z4.getTranslationY() - alpha) > 0.5f) {
                this.z4.setTranslationY(alpha);
                this.z4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public void K() {
        zh zhVar = this.U3;
        if (zhVar != null) {
            zhVar.Y(new ng(this, 4));
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
    public final void K1(int i3) {
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.o3 != null) {
            return;
        }
        int selectedItemsCount = this.t2.getSelectedItemsCount();
        ih ihVar = this.D2;
        if (selectedItemsCount == 0) {
            ihVar.e(0, i3 != 0);
            E1(false, i3 != 0);
        } else {
            if (E1(true, i3 != 0) || i3 == 0) {
                ihVar.e(selectedItemsCount, i3 != 0);
                ihVar.a();
            } else {
                ihVar.e(selectedItemsCount, true);
                ihVar.a();
            }
        }
        this.t2.D(selectedItemsCount);
        Q0(i3 != 0);
        if (this.t2 == this.b2 && ((((z10 = (d2Var = this.X1) instanceof org.telegram.ui.wm)) || this.L2 != 0 || this.O2) && ((selectedItemsCount == 0 && this.l3) || ((selectedItemsCount != 0 || this.L2 != 0 || this.O2) && !this.l3)))) {
            this.l3 = (selectedItemsCount == 0 && this.L2 == 0 && !this.O2) ? false : true;
            AnimatorSet animatorSet = this.U2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.U2 = null;
            }
            int i10 = this.L2;
            p7 p7Var = this.S2;
            org.telegram.ui.ActionBar.q0 q0Var = this.Z2;
            if (i10 != 0 && q0Var != null && p7Var.getTag() != null && z10) {
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
                if (!org.telegram.messenger.t3.T(wmVar.e) || (tL_chatBannedRights = wmVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.l3;
                    ah ahVar = this.d3;
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.V2;
                    if (!z12) {
                        if (this.L2 == 0 && !this.O2) {
                            q0Var2.setVisibility(0);
                            q0Var2.setClickable(true);
                        }
                        ahVar.setVisibility(0);
                    } else if (p7Var.getTag() != null && q0Var != null) {
                        q0Var.setVisibility(0);
                    }
                    if (i3 != 0) {
                        if (p7Var.getTag() == null && this.L2 == 0 && !this.O2) {
                            q0Var2.setAlpha(this.l3 ? 1.0f : 0.0f);
                            q0Var2.setScaleX(this.l3 ? 1.0f : 0.6f);
                            q0Var2.setScaleY(this.l3 ? 1.0f : 0.6f);
                        }
                        ahVar.setAlpha(this.l3 ? 1.0f : 0.0f);
                        if (z11) {
                            q0Var.setAlpha(this.l3 ? 0.0f : 1.0f);
                        }
                        if (this.l3 && q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                    } else {
                        this.U2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (p7Var.getTag() == null && this.L2 == 0 && !this.O2) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.ALPHA, this.l3 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_X, this.l3 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(q0Var2, (Property<org.telegram.ui.ActionBar.q0, Float>) View.SCALE_Y, this.l3 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(ahVar, (Property<ah, Float>) property, this.l3 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.ActionBar.q0, Float>) property, this.l3 ? 0.0f : 1.0f));
                        }
                        this.U2.playTogether(arrayList);
                        this.U2.addListener(new x5(this, 10));
                        this.U2.setDuration(180L);
                        this.U2.start();
                    }
                }
            }
            z11 = false;
            z12 = this.l3;
            ah ahVar2 = this.d3;
            org.telegram.ui.ActionBar.q0 q0Var22 = this.V2;
            if (!z12) {
            }
            if (i3 != 0) {
            }
        }
        N1(i3 != 0);
        org.telegram.messenger.zi ziVar = this.C3;
        long N1 = (ziVar == null || ziVar.q5()) ? org.telegram.messenger.hp.s1(this.E3).N1(b1()) : 0L;
        th thVar = this.t2;
        ihVar.i(X0() + (thVar != null ? thVar.getSelectedItemsCount() : 0), N1, true);
        dh dhVar = this.z2;
        if (dhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
            int max = Math.max(org.telegram.messenger.g0.L(48.0f), ihVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                dhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void L(int i3) {
        super.L(i3);
        this.t2.r(i3);
    }

    public final void L1() {
        float f10;
        th thVar = this.t2;
        boolean i3 = thVar == null ? false : thVar.i();
        fi.j jVar = this.a3;
        jVar.setEnabled(i3);
        th thVar2 = this.t2;
        if (thVar2 != null) {
            f10 = ((thVar2.i() ? 1.0f : 0.5f) * (this.u2 == null ? 1.0f : this.V1)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        th thVar3 = this.u2;
        if (thVar3 != null) {
            f10 = com.google.android.recaptcha.internal.a.y(1.0f, this.V1, thVar3.i() ? 1.0f : 0.5f, f10);
        }
        this.b3 = f10;
        if (jVar != null) {
            float f11 = f10 * this.c3;
            jVar.setAlpha(f11);
            jVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void M0() {
        if (a1().a.length() <= 0) {
            return;
        }
        this.t2.a(a1().getText());
    }

    public final void M1(th thVar, int i3) {
        if (thVar == null) {
            return;
        }
        eh.g gVar = this.A4;
        if (gVar != null && Build.VERSION.SDK_INT >= 31) {
            gVar.f(0.0f, i3);
        }
        int currentItemTop = thVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = thVar == this.t2 && currentItemTop <= thVar.getButtonsHideOffset();
        this.J1 = z11;
        if (thVar == this.t2) {
            I1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) thVar.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        th thVar2 = this.t2;
        int i10 = thVar2 == thVar ? 0 : 1;
        if ((thVar2 instanceof am) || (this.u2 instanceof am)) {
            Object obj = this.o3;
            if ((obj instanceof q1.g) && ((q1.g) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.W3;
        int i11 = iArr[i10];
        if (i11 == D && !z10) {
            if (i3 != 0) {
                this.X3 = i11;
            }
        } else {
            this.X3 = i11;
            iArr[i10] = D;
            P1(i10);
            this.b.invalidate();
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        return (d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).Y6();
    }

    public final void N1(boolean z10) {
        gi.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.W2) == null) {
            return;
        }
        boolean z11 = this.l3 && this.a2 && this.t2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0();
        boolean z12 = !ChatAttachAlertPhotoLayout.U();
        uVar.f = z12;
        if (!z10) {
            ((u5) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.q0 q0Var = this.X2;
        if (z10 && this.l3) {
            q0Var.setVisibility(0);
            q0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(xq.h).withEndAction(new wg(this, z11, 0)).start();
        } else {
            q0Var.setVisibility(z11 ? 0 : 8);
            q0Var.setAlpha(z11 ? 1.0f : 0.0f);
            q0Var.setScaleX(z11 ? 1.0f : 0.6f);
            q0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (!(d2Var instanceof org.telegram.ui.wm)) {
            return false;
        }
        return ChatActivityEnterView.C(this.E3, ((org.telegram.ui.wm) d2Var).a(), d2Var, charSequence);
    }

    public final void O1(boolean z10) {
        th thVar = this.b2;
        if (!z10) {
            F1(thVar);
            return;
        }
        if (this.E1) {
            if (this.i2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.q1;
                if (e6Var == null) {
                    e6Var = this.J0;
                }
                am amVar = new am(context, e6Var, this);
                amVar.E = 0.0f;
                amVar.F = 0.0f;
                amVar.G = 0.0f;
                amVar.H = 0.0f;
                amVar.I = 0.0f;
                amVar.J = 0.0f;
                amVar.K = null;
                amVar.L = false;
                amVar.N = 0.0f;
                amVar.R = false;
                amVar.T = false;
                Point point = org.telegram.messenger.g0.q;
                amVar.U = point.y > point.x;
                amVar.n = e6Var;
                amVar.f = true;
                amVar.setWillNotDraw(false);
                bi biVar = amVar.b;
                org.telegram.ui.ActionBar.x q10 = biVar.S2.q();
                TextView textView = new TextView(context);
                amVar.y = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = amVar.a;
                gi.u2 u2Var = new gi.u2(amVar, context, q10, e6Var2, 2);
                biVar.S2.addView(u2Var, 0, b8.mf.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var2);
                textView.setText(org.telegram.messenger.bd.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ci.j1 j1Var = new ci.j1(amVar, context, e6Var2, 17);
                amVar.r = j1Var;
                j1Var.setAdapter(new org.telegram.ui.y7(amVar, 3));
                u4.b0 b0Var = new u4.b0(1, false);
                amVar.s = b0Var;
                j1Var.setLayoutManager(b0Var);
                j1Var.setClipChildren(false);
                j1Var.setClipToPadding(false);
                j1Var.setOverScrollMode(2);
                j1Var.setVerticalScrollBarEnabled(false);
                zl zlVar = new zl(amVar, context);
                amVar.w = zlVar;
                zlVar.setClipToPadding(true);
                zlVar.setClipChildren(true);
                amVar.addView(j1Var, b8.mf.c(-1.0f, -1));
                amVar.Q = biVar.b2;
                zlVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.Q;
                zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                zlVar.c();
                UndoView undoView = new UndoView(context, null, false, biVar.q1);
                amVar.x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                amVar.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                amVar.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.i2 = amVar;
                amVar.bringToFront();
            }
            th thVar2 = this.t2;
            am amVar2 = this.i2;
            if (thVar2 != amVar2) {
                thVar = amVar2;
            }
            F1(thVar);
        }
    }

    public final void P0() {
        bh bhVar = this.t3;
        if (bhVar == null) {
            return;
        }
        int childCount = bhVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            bhVar.getChildAt(i3);
        }
        boolean z10 = this.c4;
        org.telegram.ui.ActionBar.r6.V(this.e3, z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.J0);
        org.telegram.ui.ActionBar.r6.V(this.j3, z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.J0);
        org.telegram.ui.ActionBar.r6.V(this.a3, org.telegram.ui.ActionBar.k6.Gi, this.J0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.J0);
        boolean z11 = (this.o4 && w02 == this.n4) ? false : true;
        this.o4 = true;
        this.n4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.V2;
        if (z11) {
            q0Var.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.J0), q0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        q0Var.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), false);
        q0Var.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), true);
        q0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.X2;
        if (q0Var2 != null && z11) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.Z2;
        if (q0Var3 != null) {
            if (z11) {
                q0Var3.setIconColor(w02);
            }
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.J0), q0Var3.getBackground());
        }
        dh dhVar = this.z2;
        org.telegram.ui.ActionBar.e6 e6Var = dhVar.N;
        dt dtVar = dhVar.a;
        int i11 = dhVar.M;
        if (i11 == 0) {
            dtVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, e6Var));
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            dtVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
            dtVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        } else if (i11 == 2 || i11 == 3) {
            dtVar.setHintTextColor(-1929379841);
            dtVar.setTextColor(-1);
            dtVar.setCursorColor(-1);
            dtVar.setHandlesColor(-1);
            dtVar.setHighlightColor(822083583);
            dtVar.E = -1;
        } else {
            dtVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t5, e6Var));
            dtVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
        }
        dhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Le, e6Var), PorterDuff.Mode.MULTIPLY));
        et etVar = dhVar.d;
        if (etVar != null) {
            etVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(bhVar, 21, org.telegram.ui.ActionBar.k6.A5, this.J0);
        int i13 = z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        p7 p7Var = this.S2;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i13, e6Var2);
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, z10 ? org.telegram.ui.ActionBar.k6.Wg : org.telegram.ui.ActionBar.k6.I5, this.J0);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5, this.J0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.s0);
        si.c cVar = this.B4;
        if (cVar.b != d12) {
            cVar.a(d12);
            mh.f fVar = this.q3;
            if (fVar != null) {
                fVar.invalidate();
            }
            ch chVar = this.r3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        this.b.invalidate();
        int i14 = 0;
        while (true) {
            th[] thVarArr = this.r2;
            if (i14 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i14];
            if (thVar != null) {
                thVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            P(org.telegram.ui.ActionBar.k6.h5);
            return;
        }
        this.G0 = -1;
        this.H0 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0);
        org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0), false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
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
    public final void P1(int i3) {
        int i10;
        float f10;
        org.telegram.ui.ActionBar.q0 q0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        fi.j jVar;
        float max;
        int i11;
        float f15 = this.l1.e;
        th thVar = i3 == 0 ? this.t2 : this.u2;
        if (thVar == null || thVar.getVisibility() != 0) {
            return;
        }
        int c12 = c1(i3);
        if (thVar == this.e2 || thVar == this.f2) {
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
        float alpha = this.S2.getAlpha();
        ah ahVar = this.d3;
        float L = alpha != 0.0f ? 0.0f : org.telegram.messenger.g0.L((1.0f - ahVar.getAlpha()) * 26.0f);
        boolean z10 = this.l3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.V2;
        ai.c0 c0Var = this.J2;
        if (z10 && this.L2 == 0 && !this.O2) {
            q0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37), ((c12 - org.telegram.messenger.g0.L((i10 * f15) + 37.0f)) + L) - (c0Var.getAlpha() * c0Var.getMeasuredHeight())) + this.g4);
        } else {
            q0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(3.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.g4);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.X2;
        if (q0Var3 != null) {
            q0Var3.setTranslationY(q0Var2.getTranslationY());
        }
        gi.l3 l3Var = this.Y2;
        if (l3Var != null) {
            l3Var.setTranslationY(q0Var2.getTranslationY());
        }
        if (this.x1 && this.n3) {
            th thVar2 = this.u2;
            if (thVar2 != null && this.t2 != null) {
                f10 = Math.min(thVar2.getTranslationY(), this.t2.getTranslationY());
            } else if (thVar2 != null) {
                f10 = thVar2.getTranslationY();
            }
            q0Var = this.Z2;
            if (q0Var != null) {
                q0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(i10 + 37)) + this.g4);
            }
            float L2 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.g4) + f10) - (c0Var.getAlpha() * c0Var.getMeasuredHeight());
            this.k3 = L2;
            ahVar.setTranslationY(Math.max(this.g4, L2));
            c0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.g4, (ahVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.k3 + org.telegram.messenger.g0.L(8.0f)));
            if (this.U1) {
                J1();
            }
            U0();
            int i12 = 59;
            if (this.e2 != null) {
                if (org.telegram.messenger.g0.Q1()) {
                    i11 = 63;
                } else {
                    Point point2 = org.telegram.messenger.g0.q;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                an anVar = this.e2;
                if (anVar == this.u2) {
                    f12 = (anVar.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.V1;
                } else if (anVar == this.t2) {
                    f12 = (anVar.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.u2 == null ? 1.0f : 1.0f - this.V1;
                }
                if (this.f2 != null) {
                    if (org.telegram.messenger.g0.Q1()) {
                        i12 = 63;
                    } else {
                        Point point3 = org.telegram.messenger.g0.q;
                        if (point3.x > point3.y) {
                            i12 = 53;
                        }
                    }
                    an anVar2 = this.f2;
                    if (anVar2 == this.u2) {
                        f14 = (anVar2.getTranslationY() + c1(1)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.V1;
                    } else if (anVar2 == this.t2) {
                        f14 = (anVar2.getTranslationY() + c1(0)) - org.telegram.messenger.g0.L(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.u2 == null ? 1.0f : 1.0f - this.V1;
                    }
                    jVar = this.a3;
                    if (jVar != null) {
                        int measuredWidth = org.telegram.messenger.bd.a0 ? (this.b.getMeasuredWidth() - jVar.getMeasuredWidth()) - org.telegram.messenger.g0.L(62.0f) : 0;
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
                        jVar.setTranslationY(Math.max(0.0f, max) + this.g4);
                        jVar.setTranslationX(-((measuredWidth * (1.0f - f15)) + org.telegram.messenger.g0.L((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.c3 = max2;
                    if (jVar == null) {
                        float f16 = this.b3 * max2;
                        jVar.setAlpha(f16);
                        jVar.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                jVar = this.a3;
                if (jVar != null) {
                }
                float max22 = Math.max(f13, f11);
                this.c3 = max22;
                if (jVar == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.f2 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            jVar = this.a3;
            if (jVar != null) {
            }
            float max222 = Math.max(f13, f11);
            this.c3 = max222;
            if (jVar == null) {
            }
        }
        f10 = 0.0f;
        q0Var = this.Z2;
        if (q0Var != null) {
        }
        float L22 = ((((c12 - org.telegram.messenger.g0.L((i10 * f15) + 25.0f)) + L) + this.g4) + f10) - (c0Var.getAlpha() * c0Var.getMeasuredHeight());
        this.k3 = L22;
        ahVar.setTranslationY(Math.max(this.g4, L22));
        c0Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.g4, (ahVar.getAlpha() * org.telegram.messenger.g0.L(26.0f)) + this.k3 + org.telegram.messenger.g0.L(8.0f)));
        if (this.U1) {
        }
        U0();
        int i122 = 59;
        if (this.e2 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.f2 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        jVar = this.a3;
        if (jVar != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.c3 = max2222;
        if (jVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (org.telegram.messenger.zi.d3(r0.k) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var == null || !(d2Var instanceof org.telegram.ui.wm)) {
            return;
        }
        org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
        jt jtVar = this.U1 ? this.K2 : this.z2;
        String obj = jtVar != null ? jtVar.getText().toString() : null;
        if (this.C3 == null) {
            th thVar = this.t2;
            z11 = true;
            if (thVar != null) {
            }
            if (cg.v.g(this.E3).e(obj, wmVar.u8) <= 0) {
                org.telegram.messenger.zi ziVar = wmVar.E5;
                if (ziVar != null) {
                }
            }
            this.o1.a(z11, z10);
            if (z11 || !f1()) {
            }
            v1(false, z10);
            return;
        }
        z11 = false;
        this.o1.a(z11, z10);
        if (z11) {
        }
    }

    public final void Q1() {
        int i3 = 0;
        P1(0);
        this.m3.invalidate();
        ai.c0 c0Var = this.J2;
        c0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        if (chatAttachAlertPhotoLayout != null) {
            il ilVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.X();
            if (ilVar != null && ilVar.getFastScroll() != null) {
                yi0 fastScroll = ilVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.U1) {
                    i3 = (int) (c0Var.getAlpha() * c0Var.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i3;
                ilVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.k1.e;
        this.r3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.l1.e))), 1.0f - ((1.0f - this.j1.e) * f10)));
    }

    public final void S0(th thVar) {
        boolean e10 = thVar.e();
        mh.f fVar = this.q3;
        if (fVar != null) {
            fVar.setFadeHeightBottom(e10 ? 0 : org.telegram.messenger.g0.L(48.0f));
        }
        ch chVar = this.r3;
        if (chVar != null) {
            chVar.setVisibility(e10 ? 4 : 0);
        }
    }

    public final void T0() {
        l00.d(this.A2, com.google.android.recaptcha.internal.a.C(this.m1.e, this.n1.e, b8.v9.a(this.o1.e), this.M3 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.r2;
            if (i3 >= thVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i5));
                return arrayList;
            }
            th thVar = thVarArr[i3];
            if (thVar != null && (themeDescriptions = thVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i3++;
        }
    }

    public final void U0() {
        ih ihVar = this.D2;
        ah ahVar = this.C2;
        ai.c0 c0Var = this.J2;
        if (c0Var == null || c0Var.getVisibility() != 0 || c0Var.getAlpha() == 0.0f) {
            ahVar.setTranslationY(this.b4);
            ihVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.j1.e;
        float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
        ihVar.setAlpha(abs * abs * abs * abs);
        ahVar.setTranslationY(org.telegram.messenger.g0.T1(this.b4, ((c0Var.getTranslationY() + c0Var.getTop()) - ahVar.getTop()) + org.telegram.messenger.g0.L(8.0f), xq.j.getInterpolation(f10)));
    }

    public final void V0(int i3) {
        this.N2 = true;
        this.s3.setVisibility(0);
        this.z1 = true;
        this.A1 = i3;
        this.L2 = 0;
        this.x1 = false;
        this.y1 = false;
        this.B1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.f3;
        if (q0Var != null) {
            this.e3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void W0(gi.q4 q4Var) {
        String M0 = org.telegram.messenger.bd.M0(2131752122, null);
        TextView textView = this.e3;
        textView.setText(M0);
        this.N2 = false;
        this.s3.setVisibility(8);
        this.L2 = 1;
        this.x1 = true;
        this.y1 = true;
        this.a2 = false;
        this.B1 = q4Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.f3;
        if (q0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q0Var.setVisibility(0);
            q0Var.setClickable(true);
            q0Var.setAlpha(1.0f);
            q0Var.setScaleX(1.0f);
            q0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (!(d2Var instanceof org.telegram.ui.wm) || (djVar = ((org.telegram.ui.wm) d2Var).w5) == null || (bjVar = djVar.b) == null) {
            return 0;
        }
        return bjVar.g.size();
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        th thVar;
        if (i3 == 0) {
            U0();
            R0();
            return;
        }
        if (i3 == 2) {
            R0();
            an anVar = this.e2;
            if (anVar != null && ((thVar = this.u2) == anVar || this.t2 == anVar)) {
                P1(thVar == anVar ? 1 : 0);
            }
            an anVar2 = this.f2;
            if (anVar2 != null) {
                th thVar2 = this.u2;
                if (thVar2 == anVar2 || this.t2 == anVar2) {
                    P1(thVar2 != anVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 1) {
            R0();
            return;
        }
        if (i3 == 3) {
            T0();
            return;
        }
        if (i3 == 4) {
            T0();
            return;
        }
        if (i3 == 5) {
            T0();
            ih ihVar = this.D2;
            if (ihVar != null) {
                ihVar.setEphemeralFactor(f10);
                ihVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        return d2Var instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var).e : org.telegram.messenger.hp.s1(this.E3).M0(Long.valueOf(-this.R1));
    }

    public final float Z0() {
        return r0.getMeasuredHeight() - ((1.0f - this.y2.getAlpha()) * (r0.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override // org.telegram.ui.ActionBar.t2, org.telegram.ui.ActionBar.z1
    public final void a(boolean z10) {
        if (z10) {
            this.y4 = z10;
        }
        dismiss();
    }

    public final jt a1() {
        th thVar;
        return (this.U1 && ((thVar = this.t2) == this.b2 || thVar == this.i2)) ? this.K2 : this.z2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        return d2Var instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var).a() : this.R1;
    }

    public final int c1(int i3) {
        th thVar = this.u2;
        int[] iArr = this.W3;
        if (thVar == null || !((this.t2 instanceof am) || (thVar instanceof am))) {
            return iArr[i3];
        }
        return org.telegram.messenger.g0.W1(this.V1, iArr[0], iArr[1]);
    }

    public final int d1(boolean z10) {
        p7 p7Var;
        if (this.c4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hh, this.J0);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        Iterator it = this.p1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a11 = b8.be.a(f10, 0.0f, 1.0f);
        if (z10 && (p7Var = this.S2) != null && p7Var.getVisibility() == 0) {
            a11 *= 1.0f - p7Var.getAlpha();
        }
        return i0.a.f(a11, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0), org.telegram.ui.ActionBar.k6.w0(a10 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, this.J0));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.T0 && i3 != org.telegram.messenger.hs.W4 && i3 != org.telegram.messenger.hs.F1) {
            if (i3 == org.telegram.messenger.hs.f5) {
                this.C1 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).H0();
            }
        } else {
            yh yhVar = this.v3;
            if (yhVar != null) {
                yhVar.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        fh fhVar;
        dh dhVar;
        if (this.t2.q() || this.J) {
            return;
        }
        th thVar = this.t2;
        hk hkVar = this.o2;
        int i3 = 1;
        int i10 = 0;
        boolean z10 = (thVar != hkVar || hkVar == null || hkVar.L || hkVar.Q0 == null) ? false : true;
        this.p2 = z10;
        if (!z10 && (dhVar = this.z2) != null) {
            org.telegram.messenger.g0.v1(dhVar.getEditText());
        }
        if (!this.p2 && (fhVar = this.K2) != null) {
            org.telegram.messenger.g0.v1(fhVar.getEditText());
        }
        this.s2.clear();
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var == null) {
            d2Var = LaunchActivity.Q();
        }
        if (this.y4 || d2Var == null || this.t2.getSelectedItemsCount() <= 0 || this.x1) {
            int i11 = 0;
            while (true) {
                th[] thVarArr = this.r2;
                if (i11 >= thVarArr.length) {
                    break;
                }
                th thVar2 = thVarArr[i11];
                if (thVar2 != null && this.t2 != thVar2) {
                    thVar2.q();
                }
                i11++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0), 0), true, new kg(this, 11));
            if (d2Var != null) {
                org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
            }
            this.d4 = false;
            super.dismiss();
            this.y4 = false;
            return;
        }
        if (this.x4) {
            return;
        }
        this.x4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), this.J0);
        String M0 = org.telegram.messenger.bd.M0(2131751400, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131751401, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751407, null), new kg(this, i3));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        s1Var.setOnCancelListener(new qg(this, i10));
        s1Var.O = new p0(this, 4);
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.J0);
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
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        bi biVar;
        pl plVar;
        org.telegram.messenger.pe peVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        th thVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.I2 = 0L;
        this.D2.setEffect(0L);
        int i3 = 0;
        this.y3 = false;
        this.w3 = false;
        this.A3 = 0.0f;
        this.z3.setVisibility(8);
        RadialProgressView radialProgressView = this.x3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ah ahVar = this.s3;
        ahVar.setAlpha(1.0f);
        ahVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.s2;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((ii.d4) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.L2;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (i11 != 2) {
            if (d2Var instanceof org.telegram.ui.wm) {
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
                chat = wmVar.e;
                user = wmVar.j();
            } else {
                long j10 = this.R1;
                int i12 = this.E3;
                if (j10 >= 0) {
                    user = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(this.R1));
                    chat = null;
                } else if (j10 < 0) {
                    chat = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-this.R1));
                    user = null;
                }
            }
            z10 = d2Var instanceof org.telegram.ui.wm;
            if ((z10 && this.L2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.G3 = org.telegram.messenger.t3.p(chat);
                    this.H3 = org.telegram.messenger.t3.u(chat);
                    this.I3 = org.telegram.messenger.t3.o(chat);
                    this.J3 = org.telegram.messenger.t3.r(chat);
                    this.K3 = !org.telegram.messenger.t3.V(chat) && org.telegram.messenger.t3.r(chat);
                    this.L3 = org.telegram.messenger.t3.q(chat);
                    this.F3 = org.telegram.messenger.t3.l(chat);
                } else {
                    this.J3 = org.telegram.messenger.l10.t(user) || org.telegram.messenger.l10.B(user);
                    this.K3 = !z10 || ((org.telegram.ui.wm) d2Var).h == null;
                }
            }
            if (this.y1) {
                this.G3 = true;
                this.H3 = true;
            }
            if (this.M3) {
                this.J3 = false;
                this.K3 = false;
            }
            dh dhVar = this.z2;
            if (z10 || this.L2 == 2) {
                dhVar.setVisibility(this.O1 ? 0 : 4);
            }
            boolean z11 = this.H3;
            boolean z12 = this.G3;
            boolean z13 = this.F3;
            chatAttachAlertPhotoLayout = this.b2;
            biVar = chatAttachAlertPhotoLayout.b;
            gy gyVar = chatAttachAlertPhotoLayout.I;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z11;
            chatAttachAlertPhotoLayout.y0 = z12;
            chatAttachAlertPhotoLayout.A0 = z13;
            plVar = chatAttachAlertPhotoLayout.Q;
            if (plVar != null) {
                plVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((biVar.X1 instanceof org.telegram.ui.wm) && biVar.Y0() == null) && biVar.L2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    gyVar.setText(org.telegram.messenger.bd.M0(2131748188, null));
                    gyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat Y0 = biVar.Y0();
                    gyVar.a(R.raw.media_forbidden, org.telegram.messenger.hs.g2, org.telegram.messenger.hs.g2);
                    if (org.telegram.messenger.t3.P(7, Y0)) {
                        gyVar.setText(org.telegram.messenger.bd.M0(2131749551, null));
                    } else if (org.telegram.messenger.g0.D1(Y0.banned_rights)) {
                        gyVar.setText(org.telegram.messenger.bd.a0("AttachMediaRestrictedForever", null, 2131753955, new Object[0]));
                    } else {
                        gyVar.setText(org.telegram.messenger.bd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.bd.v(Y0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.t0()) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            } else {
                chatAttachAlertPhotoLayout.V0 = MediaController.b2;
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
                for (int i13 = 0; i13 < Math.min(100, chatAttachAlertPhotoLayout.V0.e.size()); i13++) {
                    ((org.telegram.messenger.ye) chatAttachAlertPhotoLayout.V0.e.get(i13)).e();
                }
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.G.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.bd.M0(2131752238, null));
            peVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = peVar;
            if (peVar != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (gyVar != null) {
                    gyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            dhVar.k(true);
            this.K2.k(true);
            this.p3 = false;
            A0(false);
            if (!this.G1 || this.H1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.g2 == null) {
                    uk ukVar = new uk(this, getContext(), this.J0, (this.z1 || this.H1 || this.M3) ? false : true);
                    this.g2 = ukVar;
                    this.r2[5] = ukVar;
                    tk tkVar = this.r4;
                    if (tkVar != null) {
                        ukVar.setDelegate(tkVar);
                    } else {
                        ukVar.setDelegate(new kg(this, i3));
                    }
                }
                this.R2 = 5L;
                thVar = this.g2;
            } else if (this.F1) {
                r1(false);
                thVar = this.h2;
                this.R2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                org.telegram.messenger.zi ziVar = this.C3;
                if (ziVar != null) {
                    int i14 = this.B3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i14 == -1) {
                        this.N2 = true;
                        if (ziVar.J3()) {
                            p1(false);
                            thVar = this.d2;
                            this.R2 = 3L;
                        } else if (this.C3.V2()) {
                            r1(false);
                            thVar = this.h2;
                            this.R2 = 4L;
                        } else {
                            this.R2 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            p1(false);
                            thVar = this.d2;
                            this.R2 = 3L;
                        } else if (i14 == 1) {
                            r1(false);
                            thVar = this.h2;
                            this.R2 = 4L;
                        } else {
                            this.R2 = 1L;
                            thVar = chatAttachAlertPhotoLayout2;
                        }
                        this.N2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.N2 = this.L2 == 0 && !this.O2;
                    this.R2 = 1L;
                }
                thVar = chatAttachAlertPhotoLayout2;
            }
            ahVar.setVisibility(this.N2 ? 0 : 8);
            if (this.t2 != thVar) {
                p7 p7Var = this.S2;
                if (p7Var.o0) {
                    p7Var.l(true);
                }
                this.b.removeView(this.t2);
                this.t2.u();
                this.t2.setVisibility(8);
                this.t2.t();
                this.t2 = thVar;
                this.r0 = true;
                if (thVar.getParent() == null) {
                    s1(this.t2);
                    this.b.addView(this.t2, 0, b8.mf.c(-1.0f, -1));
                }
                thVar.setAlpha(1.0f);
                thVar.setVisibility(0);
                thVar.H(null);
                thVar.I();
                S0(thVar);
                p7Var.setVisibility(thVar.j() != 0 ? 0 : 4);
                v1(this.U1, false);
                L1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.t2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            K1(0);
            this.v3.f();
            a1().setText("");
            this.u3.h1(0, 1000000);
        }
        user = null;
        chat = null;
        z10 = d2Var instanceof org.telegram.ui.wm;
        if (z10) {
            if (chat != null) {
            }
            if (this.y1) {
            }
            if (this.M3) {
            }
            dh dhVar2 = this.z2;
            if (z10) {
            }
            dhVar2.setVisibility(this.O1 ? 0 : 4);
            boolean z112 = this.H3;
            boolean z122 = this.G3;
            boolean z132 = this.F3;
            chatAttachAlertPhotoLayout = this.b2;
            biVar = chatAttachAlertPhotoLayout.b;
            gy gyVar2 = chatAttachAlertPhotoLayout.I;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.w0 = z14;
            chatAttachAlertPhotoLayout.x0 = z112;
            chatAttachAlertPhotoLayout.y0 = z122;
            chatAttachAlertPhotoLayout.A0 = z132;
            plVar = chatAttachAlertPhotoLayout.Q;
            if (plVar != null) {
            }
            if (biVar.X1 instanceof org.telegram.ui.wm) {
            }
            chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            if (chatAttachAlertPhotoLayout.w0) {
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
            }
            chatAttachAlertPhotoLayout.c0();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.h1(0, 1000000);
            chatAttachAlertPhotoLayout.G.h1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.bd.M0(2131752238, null));
            peVar = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = peVar;
            if (peVar != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            dhVar2.k(true);
            this.K2.k(true);
            this.p3 = false;
            A0(false);
            if (this.G1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.g2 == null) {
            }
            this.R2 = 5L;
            thVar = this.g2;
            ahVar.setVisibility(this.N2 ? 0 : 8);
            if (this.t2 != thVar) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.t2 != chatAttachAlertPhotoLayout3) {
            }
            K1(0);
            this.v3.f();
            a1().setText("");
            this.u3.h1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.y1) {
        }
        if (this.M3) {
        }
        dh dhVar22 = this.z2;
        if (z10) {
        }
        dhVar22.setVisibility(this.O1 ? 0 : 4);
        boolean z1122 = this.H3;
        boolean z1222 = this.G3;
        boolean z1322 = this.F3;
        chatAttachAlertPhotoLayout = this.b2;
        biVar = chatAttachAlertPhotoLayout.b;
        gy gyVar22 = chatAttachAlertPhotoLayout.I;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.w0 = z14;
        chatAttachAlertPhotoLayout.x0 = z1122;
        chatAttachAlertPhotoLayout.y0 = z1222;
        chatAttachAlertPhotoLayout.A0 = z1322;
        plVar = chatAttachAlertPhotoLayout.Q;
        if (plVar != null) {
        }
        if (biVar.X1 instanceof org.telegram.ui.wm) {
        }
        chatAttachAlertPhotoLayout.V0 = MediaController.a2;
        if (chatAttachAlertPhotoLayout.w0) {
        }
        chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.h0();
        if (chatAttachAlertPhotoLayout.V0 != null) {
        }
        chatAttachAlertPhotoLayout.c0();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.h1(0, 1000000);
        chatAttachAlertPhotoLayout.G.h1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(org.telegram.messenger.bd.M0(2131752238, null));
        peVar = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = peVar;
        if (peVar != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        dhVar22.k(true);
        this.K2.k(true);
        this.p3 = false;
        A0(false);
        if (this.G1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.g2 == null) {
        }
        this.R2 = 5L;
        thVar = this.g2;
        ahVar.setVisibility(this.N2 ? 0 : 8);
        if (this.t2 != thVar) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.t2 != chatAttachAlertPhotoLayout3) {
        }
        K1(0);
        this.v3.f();
        a1().setText("");
        this.u3.h1(0, 1000000);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean f0(MotionEvent motionEvent) {
        return this.t2.o(motionEvent);
    }

    public final boolean f1() {
        if (!this.U1) {
            return false;
        }
        th thVar = this.t2;
        return thVar == this.b2 || thVar == this.i2;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        zh zhVar = this.U3;
        if (zhVar == null || this.p3) {
            return;
        }
        boolean g02 = zhVar.g0();
        this.p3 = true;
        org.telegram.messenger.g0.i3(new ci.v6(this, editTextBoldCursor, z10, 19), g02 ? 200L : 0L);
    }

    public final void i1() {
        if (this.s0 == null || this.b == null) {
            return;
        }
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.s0);
        si.c cVar = this.B4;
        if (cVar.b != d12) {
            cVar.a(d12);
            mh.f fVar = this.q3;
            if (fVar != null) {
                fVar.invalidate();
            }
            ch chVar = this.r3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        L1();
        this.b.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final hk hkVar = this.o2;
        if (hkVar != null && this.t2 == hkVar) {
            final ng ngVar = new ng(this, 1);
            int i3 = hkVar.n;
            org.telegram.ui.Wallet.l9 l9Var = hkVar.S;
            bi biVar = hkVar.b;
            AnimatorSet animatorSet = null;
            if (!hkVar.L && (wallettransaction = hkVar.Q0) != null && hkVar.R0 == null && hkVar.S0 == null) {
                if (hkVar.T0) {
                    org.telegram.ui.Wallet.w5 w5Var = new org.telegram.ui.Wallet.w5();
                    w5Var.setCurrentAccount(i3);
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if (d2Var != null && d2Var.presentFragment(w5Var, false, true)) {
                        final int i10 = 0;
                        org.telegram.ui.Wallet.aa aaVar = new org.telegram.ui.Wallet.aa(biVar.c, biVar.b, l9Var.getDiamondView(), w5Var, hkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.zj
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        if (!hkVar.L) {
                                            ngVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!hkVar.L) {
                                            ngVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, biVar);
                        hkVar.S0 = aaVar;
                        animatorSet = aaVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.u6 diamondView = l9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (wmVar.getCurrentAccount() == i3 && wmVar.a() == hkVar.r.id && wmVar.g4 == 0 && wmVar.getFragmentView() != null && wmVar.getFragmentView().isAttachedToWindow()) {
                                final int i11 = 1;
                                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(biVar.c, biVar.b, l9Var.getDiamondView(), wmVar, hkVar.Q0, new Runnable() { // from class: org.telegram.ui.Components.zj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                if (!hkVar.L) {
                                                    ngVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!hkVar.L) {
                                                    ngVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, biVar);
                                hkVar.R0 = m6Var;
                                animatorSet = m6Var.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.p();
            }
            i3++;
        }
        int i10 = this.E3;
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.T0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.W4);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f5);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.F1);
        this.N1 = true;
        dh dhVar = this.z2;
        if (dhVar != null) {
            dhVar.o();
        }
        fh fhVar = this.K2;
        if (fhVar != null) {
            fhVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        j71 j71Var = chatAttachAlertPhotoLayout.m0;
        ai.o2 o2Var = chatAttachAlertPhotoLayout.k0;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        il ilVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        boolean z10 = i13 < i14;
        int i15 = org.telegram.messenger.g0.n;
        if (view == o2Var) {
            if (z10) {
                if (ilVar.getVisibility() == 0) {
                    o2Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                o2Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (ilVar.getVisibility() == 0) {
                o2Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            }
            o2Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == j71Var) {
            if (z10) {
                if (ilVar.getVisibility() == 0) {
                    j71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                j71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            }
            if (ilVar.getVisibility() == 0) {
                j71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            }
            j71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != ilVar) {
                return false;
            }
            if (z10) {
                int z11 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L2 = (i3 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            L = (i13 - textView.getMeasuredWidth()) / 2;
            int L3 = i12 - org.telegram.messenger.g0.L(167.0f);
            textView.setRotation(0.0f);
            if (ilVar.getVisibility() == 0) {
                L3 -= org.telegram.messenger.g0.L(96.0f);
            }
            measuredWidth = L3 - i15;
        } else {
            L = i11 - org.telegram.messenger.g0.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (ilVar.getVisibility() == 0) {
                L -= org.telegram.messenger.g0.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10 = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : org.telegram.messenger.l10.p(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.li.b0(this.E3).b.bots;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i3);
            i3++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.bd.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.bd.M0(2131753001, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.bd.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        s1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new aa.a(this, tL_attachMenuBot, user, 24));
        k2.p1.v("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean l0(View view, int i3, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b2;
        sl slVar = chatAttachAlertPhotoLayout.w;
        bi biVar = chatAttachAlertPhotoLayout.b;
        il ilVar = chatAttachAlertPhotoLayout.r;
        kg.y yVar = chatAttachAlertPhotoLayout.s;
        boolean z10 = i3 < i10;
        if (view != chatAttachAlertPhotoLayout.Q) {
            ai.o2 o2Var = chatAttachAlertPhotoLayout.k0;
            if (view == o2Var) {
                if (z10) {
                    o2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                o2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            j71 j71Var = chatAttachAlertPhotoLayout.m0;
            if (view == j71Var) {
                if (z10) {
                    j71Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                j71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == ilVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
                    if (yVar.o != 0) {
                        ilVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        yVar.j1(0);
                        slVar.f();
                    }
                } else {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (yVar.o != 1) {
                        ilVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        yVar.j1(1);
                        slVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(biVar.T() + biVar.S() + i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void l1() {
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.r2;
            if (i3 >= thVarArr.length) {
                this.a4 = true;
                return;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.A();
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean m0() {
        this.b2.setTranslationX(0.0f);
        this.i3.setAlpha(0.0f);
        this.g3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.l4 = animatorSet;
        int i3 = 2;
        lh lhVar = this.j4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, lhVar, 0.0f, 400.0f));
        this.l4.setDuration(400L);
        this.l4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        lhVar.getClass();
        lhVar.a(this, valueOf);
        this.l4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new lg(this, i3));
        q1.g gVar = this.k4;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = new q1.g((Object) this.b, (q1.e) q1.g.p, 0.0f);
        this.k4 = gVar2;
        if (this.C3 != null) {
            gVar2.m.a(0.75f);
            this.k4.m.b(350.0f);
        } else {
            gVar2.m.a(0.75f);
            this.k4.m.b(350.0f);
        }
        this.k4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, k6.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        g2.g gVar3 = new g2.g((int[]) null);
        e7 e7Var = new e7(this, gVar3, this.z0, 5);
        this.k4.a(new ii.z3(i3, this, e7Var));
        this.A0.addListener(new bh.j(24, this, e7Var));
        gVar3.d();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new lg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(xq.f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i3 = 0;
        this.a4 = false;
        while (true) {
            th[] thVarArr = this.r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.C();
            }
            i3++;
        }
        if (isShowing()) {
            this.U3.g0();
        }
        yh yhVar = this.v3;
        if (yhVar != null) {
            yhVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.zi ziVar = this.C3;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        int i3 = this.E3;
        if (ziVar != null && ziVar.q5() && !org.telegram.messenger.t3.z(i3, 24, org.telegram.messenger.zi.B0(this.C3.k)) && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            org.telegram.messenger.ej ejVar = wmVar.x5;
            if (ejVar == null) {
                ejVar = org.telegram.messenger.ej.b(this.C3.k.suggested_post);
            }
            if (!ci.e9.T(i3, ejVar.a)) {
                wmVar.wc(ejVar);
                return;
            }
        }
        if (this.C1 - this.D1 < 0) {
            org.telegram.messenger.g0.F3(this.r1);
            org.telegram.messenger.g0.F3(this.s1);
            try {
                this.D2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (org.telegram.messenger.hp.s1(i3).D3() || org.telegram.messenger.hp.s1(i3).U4 <= this.D1) {
                return;
            }
            D1(d2Var);
            return;
        }
        if (this.C3 == null && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.ui.wm wmVar2 = (org.telegram.ui.wm) d2Var;
            if (wmVar2.c()) {
                t4.L(getContext(), wmVar2.a(), new kg(this, 14), this.J0);
                return;
            }
        }
        th thVar = this.t2;
        if (thVar == this.b2 || thVar == this.i2) {
            u1(true, 0, 0, this.I2, f1());
        } else {
            if (thVar.L(true, 0, 0, this.I2, f1())) {
                return;
            }
            this.y4 = true;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void o0() {
        if (this.t2.s()) {
            dismiss();
        }
    }

    public final void o1(int i3) {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (i3 == 3) {
            if (this.I3 || !N0()) {
                Activity parentActivity = d2Var != null ? d2Var.getParentActivity() : null;
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
        if (i3 == 6 && org.telegram.messenger.g0.J1(d2Var)) {
            if (this.g2 == null) {
                uk ukVar = new uk(this, getContext(), this.J0, (this.z1 || this.M3) ? false : true);
                this.g2 = ukVar;
                this.r2[5] = ukVar;
                tk tkVar = this.r4;
                if (tkVar != null) {
                    ukVar.setDelegate(tkVar);
                } else if (d2Var instanceof org.telegram.ui.wm) {
                    ukVar.setDelegate(new kg(this, 18));
                }
            }
            F1(this.g2);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        if (this.K1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        p7 p7Var = this.S2;
        if (p7Var.o0) {
            p7Var.l(true);
            return;
        }
        if (this.t2.k()) {
            return;
        }
        if (a1() == null || !a1().e) {
            super.onBackPressed();
        } else {
            a1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var != null) {
            org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (this.t2.G(i3)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).C0.add(this.K1);
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
            ((LaunchActivity) context).C0.remove(this.K1);
        }
    }

    public final void p1(boolean z10) {
        if (!this.I3 && z10) {
            bn bnVar = new bn(3, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        int i3 = 1;
        if (this.d2 == null) {
            ni niVar = new ni(getContext(), this.J0, this);
            this.d2 = niVar;
            this.r2[3] = niVar;
            niVar.setupBlurredSearchField(this.C4);
            this.d2.setDelegate(new kg(this, 15));
            if (this.z1) {
                this.d2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).e;
            ni niVar2 = this.d2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.C3 == null) {
                i3 = -1;
            }
            niVar2.setMaxSelectedFiles(i3);
        }
        if (z10) {
            F1(this.d2);
        }
    }

    public final void q1() {
        if (!this.L3) {
            bn bnVar = new bn(5, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        if (this.c2 == null) {
            ej ejVar = new ej(getContext(), this.J0, this);
            this.c2 = ejVar;
            this.r2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.C4);
            this.c2.setDelegate(new jh(this));
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).e;
            this.c2.setMultipleSelectionAllowed(chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled);
        }
        F1(this.c2);
    }

    public final void r1(boolean z10) {
        if (!this.F3 && z10) {
            bn bnVar = new bn(4, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        boolean z11 = false;
        if (this.h2 == null) {
            uj ujVar = new uj(this.F1 ? 2 : 0, getContext(), this.J0, this);
            this.h2 = ujVar;
            this.r2[4] = ujVar;
            ujVar.setDelegate(new kh(this));
        }
        int i3 = 1;
        if (this.z1) {
            this.h2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var instanceof org.telegram.ui.wm) {
                TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).e;
                uj ujVar2 = this.h2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.C3 == null) {
                    i3 = -1;
                }
                ujVar2.setMaxSelectedFiles(i3);
            } else {
                this.h2.setMaxSelectedFiles(this.N3);
                uj ujVar3 = this.h2;
                if (!this.F1 && !this.O1) {
                    z11 = true;
                }
                ujVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        uj ujVar4 = this.h2;
        ujVar4.e0 = this.F1;
        if (z10) {
            F1(ujVar4);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            P0();
            eh.d dVar = this.T1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.f3;
            if (q0Var == null || w02 == this.m4) {
                return;
            }
            this.m4 = w02;
            q0Var.setIconColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        this.D3 = false;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            this.i0 = ((org.telegram.ui.wm) d2Var).T9();
        }
        L1();
        this.n3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0), 0);
            this.H0 = o10;
            org.telegram.messenger.g0.u3(this, o10, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        }
        if (this.h4) {
            this.h4 = false;
            p7 p7Var = this.S2;
            p7Var.updateColors();
            p7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        p7 p7Var = this.S2;
        int i3 = 1;
        if (p7Var.o0) {
            p7Var.l(true);
        }
        this.c2 = null;
        this.k2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.o2 = null;
        while (true) {
            th[] thVarArr = this.r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.p();
                this.b.removeView(thVarArr[i3]);
                thVarArr[i3] = null;
            }
            i3++;
        }
        I1(false, false);
        super.K();
        if (this.p2) {
            this.p2 = false;
            this.q2 = 0.0f;
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var == null || d2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = d2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void u0(boolean z10) {
        this.r0 = true;
    }

    public final boolean u1(final boolean z10, final int i3, final int i10, final long j10, final boolean z11) {
        if (this.D3) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            TLRPC.Chat chat = wmVar.e;
            if (wmVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                org.telegram.messenger.hp.s1(this.E3).d7.edit().putBoolean("silent_" + wmVar.a(), !z10).commit();
            }
        }
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.o1.f) {
            this.D3 = true;
            this.U3.o1(7, true, z10, i3, i10, j10, z11, false, 0L);
            return true;
        }
        long b12 = b1();
        th thVar = this.t2;
        return t4.a0(this.E3, b12, X0() + (thVar != null ? thVar.getSelectedItemsCount() : 1), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.xg
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                bi biVar = bi.this;
                biVar.D3 = true;
                biVar.U3.o1(7, true, z10, i3, i10, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        if (this.X1 instanceof org.telegram.ui.wm) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.t2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.bd.M0(2131754921, "AccDescrAttachButton"));
        this.n3 = true;
        if (this.H3 || this.G3) {
            return;
        }
        N0();
    }

    public final void v1(boolean z10, boolean z11) {
        this.j1.a(z10, z11);
        jt a12 = a1();
        this.U1 = z10;
        jt a13 = a1();
        final boolean z12 = this.y2.getTag() != null;
        th thVar = this.t2;
        final boolean z13 = this.U1 && (thVar == this.b2 || thVar == this.i2);
        ai.c0 c0Var = this.J2;
        lg.j jVar = this.x2;
        if (z11) {
            c0Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = c0Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            xq xqVar = xq.h;
            final int i3 = 0;
            duration.setInterpolator(xqVar).setUpdateListener(new lg(this, i3)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.mg
                public final /* synthetic */ bi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            bi biVar = this.b;
                            if (!z13 || !z12) {
                                biVar.J2.setVisibility(8);
                            }
                            biVar.Q1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.x2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new lg(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.mg
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
                                biVar.J2.setVisibility(8);
                            }
                            biVar.Q1();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.x2.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            c0Var.setVisibility((z13 && z12) ? 0 : 8);
            c0Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            Q1();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(p5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new ng(this, 0));
    }

    public final void w1(int i3, org.telegram.messenger.zi ziVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ziVar != null && (chatAttachAlertPhotoLayout = this.b2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.C3 == ziVar && this.B3 == i3) {
            return;
        }
        this.C3 = ziVar;
        if (ziVar != null && ziVar.A2()) {
            i3 = this.C3.J3() ? 2 : this.C3.V2() ? 1 : 0;
        }
        this.B3 = i3;
        if (this.C3 != null) {
            this.N3 = 1;
            this.O3 = false;
        } else {
            this.N3 = -1;
            this.O3 = true;
        }
        this.v3.f();
        K1(0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i3;
        float translationY = this.b.getTranslationY() - this.q2;
        this.q2 = this.b.getHeight() * f10;
        this.b.setTranslationY(translationY);
        hk hkVar = this.o2;
        if (hkVar != null) {
            hkVar.setSendTransitionProgress(f10);
        }
        if (this.p0) {
            i3 = Math.round((1.0f - f10) * this.q0);
        } else {
            i3 = 0;
        }
        this.Z.setAlpha(i3);
        this.D0 = 1.0f - f10;
        this.c.invalidate();
    }

    public final void y1(int i3, boolean z10) {
        if (this.C3 != null) {
            return;
        }
        this.N3 = i3;
        this.O3 = z10;
    }

    public final void z1(float f10) {
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0), Math.min(org.telegram.messenger.hs.e4, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o10;
        org.telegram.messenger.g0.u3(this, o10, false, null);
        org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        this.c.invalidate();
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }

    public bi(Activity activity, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11) {
        this(activity, d2Var, z10, z11, true, null);
    }
}
