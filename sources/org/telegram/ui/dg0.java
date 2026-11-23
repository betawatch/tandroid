package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class dg0 extends Dialog implements org.telegram.messenger.fs {
    public boolean A0;
    public org.telegram.ui.Cells.r1 B0;
    public org.telegram.ui.Components.wy0 C0;
    public Paint D0;
    public float E;
    public final rf0 F;
    public final yf0 G;
    public final rf0 H;
    public long I;
    public org.telegram.ui.Components.m5 J;
    public final zf0 K;
    public final hi.f0 L;
    public final org.telegram.ui.Components.fa0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.r1 Q;
    public int R;
    public org.telegram.ui.Components.hf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ud V;
    public org.telegram.ui.Components.tg W;
    public tf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final sf0 a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public boolean b0;
    public final int c;
    public float c0;
    public i0.b d;
    public FrameLayout d0;
    public Bitmap e;
    public uf0 e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public boolean h0;
    public final xh.e i0;
    public final ui.b j0;
    public final dh.c k0;
    public RectF l0;
    public ab.q m0;
    public Matrix n;
    public androidx.activity.n n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final float[] s0;
    public boolean t0;
    public boolean u0;
    public org.telegram.ui.Cells.r1 v0;
    public boolean w;
    public float w0;
    public boolean x;
    public float x0;
    public boolean y;
    public final Rect y0;
    public ValueAnimator z0;

    public dg0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, R.style.TransparentDialog);
        int i7 = org.telegram.messenger.i10.t0;
        this.c = i7;
        this.d = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        final int i10 = 1;
        this.T = new Paint(1);
        this.o0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new float[4];
        final int i11 = 0;
        this.u0 = false;
        this.y0 = new Rect();
        this.a = context;
        this.b = i6Var;
        org.telegram.messenger.g0.S(getWindow());
        rf0 rf0Var = new rf0(this, context, i10);
        this.F = rf0Var;
        this.i0 = xh.e.d(1, rf0Var, rf0Var);
        rf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
            public final /* synthetic */ dg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        rf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.qf0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                dg0 dg0Var = dg0.this;
                if (dg0Var.t0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.g0.v1(dg0Var.S);
                org.telegram.messenger.g0.h3(new nf0(dg0Var, (EditText) view2, 0), 200L);
            }
        });
        ui.b bVar = new ui.b();
        this.j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.k0 = cVar;
        cVar.h = new jh.k(rf0Var);
        cVar.i = rf0Var;
        yf0 yf0Var = new yf0(this, context, i6Var);
        this.G = yf0Var;
        yf0Var.setClipToPadding(false);
        rf0Var.addView(yf0Var, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(rf0Var, fVar);
        zf0 zf0Var = new zf0(this, context, i6Var);
        this.K = zf0Var;
        zf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pf0
            public final /* synthetic */ dg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        zf0Var.setOnItemClickListener(new h(this, 17));
        zf0Var.setOnScrollListener(new g3(this, 19));
        zf0Var.setItemAnimator(new bg0(null, zf0Var, i6Var));
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(this, i10);
        this.M = fa0Var;
        fa0Var.O = new bi.y2(this, 14);
        zf0Var.setLayoutManager(fa0Var);
        zf0Var.i(new fi.k(13));
        hi.f0 f0Var = new hi.f0(this, context, i6Var, i10);
        this.L = f0Var;
        zf0Var.setAdapter(f0Var);
        zf0Var.setVerticalScrollBarEnabled(false);
        zf0Var.setOverScrollMode(2);
        yf0Var.addView(zf0Var, c8.na.c(-2.0f, -1));
        rf0 rf0Var2 = new rf0(this, context, i11);
        this.H = rf0Var2;
        rf0Var.addView(rf0Var2, c8.na.c(-1.0f, -1));
        this.a0 = new sf0(this, rf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        ch.x xVar;
        if (this.e0 != null || g2Var == null) {
            return;
        }
        int i7 = this.c;
        org.telegram.messenger.mp.u1(i7).G0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
        uf0 uf0Var = new uf0(5, this.c, getContext(), null, this.b);
        this.e0 = uf0Var;
        uf0Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
        this.e0.setDelegate(new wf0(this, g2Var));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(org.telegram.messenger.gd.N0(2131754440, null));
        this.e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
        this.e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
        this.G.addView(this.d0, c8.na.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, c8.na.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.mp.u1(i7).n8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.w3);
        } else {
            u();
        }
        uf0 uf0Var2 = this.e0;
        if (uf0Var2 != null && !uf0Var2.h1) {
            uf0Var2.h1 = true;
            uf0Var2.i1 = true;
            ch.b0 b0Var = uf0Var2.y0;
            if (b0Var != null && (xVar = b0Var.m) != null && !xVar.M1) {
                xVar.M1 = true;
                xVar.N1 = true;
                o01 o01Var = xVar.i0;
                if (o01Var != null) {
                    o01Var.invalidate();
                }
                e01 e01Var = xVar.j0;
                if (e01Var != null) {
                    e01Var.invalidate();
                }
            }
        }
        new hi.x3(this.F, false, new r3(this, 14));
    }

    public final void d(int[] iArr) {
        androidx.activity.n nVar = this.n0;
        if (nVar == null) {
            this.W.getLocationOnScreen(iArr);
            iArr[0] = org.telegram.ui.Cells.c0.i(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
            return;
        }
        int[] iArr2 = (int[]) nVar.c;
        ji.e eVar = (ji.e) nVar.d;
        if (!nVar.b || (!eVar.q3 && eVar.isAttachedToWindow() && !eVar.l0.isEmpty())) {
            int[] iArr3 = eVar.r3;
            RectF rectF = eVar.l0;
            eVar.getLocationOnScreen(iArr3);
            iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
            iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
            nVar.b = true;
        }
        int i7 = iArr2[0];
        int[] iArr4 = this.o0;
        iArr4[0] = i7;
        iArr4[1] = iArr2[1];
        iArr[0] = org.telegram.messenger.g0.L(22.0f) + ((i7 - this.W.l()) - org.telegram.messenger.g0.L(6.0f));
        iArr[1] = org.telegram.messenger.g0.L(22.0f) + (iArr4[1] - this.W.getHeight());
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 != org.telegram.messenger.ks.w3 || (messages_availableeffects = org.telegram.messenger.mp.u1(this.c).n8) == null || messages_availableeffects.effects.isEmpty()) {
            return;
        }
        u();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            tf0Var.invalidate();
        }
        org.telegram.ui.Components.tg tgVar = this.W;
        if (tgVar != null) {
            tgVar.invalidate();
        }
        e(new mf0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ks.f(this.c).n(this, org.telegram.messenger.ks.w3);
    }

    public final void e(Runnable runnable, boolean z10) {
        uf0 uf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.g1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z10 && (uf0Var = this.e0) != null && this.f0) {
            uf0Var.e();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z10;
        this.K.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.z0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(10, this, z11));
        this.z0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.z0.setInterpolator(org.telegram.ui.Components.kr.h);
        this.z0.setDuration(350L);
        this.z0.start();
    }

    public final void f(org.telegram.messenger.fj fjVar) {
        org.telegram.messenger.aj l10 = l(fjVar);
        if (l10 == null) {
            g(fjVar);
            return;
        }
        l10.a();
        ArrayList arrayList = l10.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g((org.telegram.messenger.fj) obj);
        }
    }

    public final void g(org.telegram.messenger.fj fjVar) {
        org.telegram.ui.Cells.r1 r1Var;
        zf0 zf0Var = this.K;
        if (zf0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= zf0Var.getChildCount()) {
                r1Var = null;
                break;
            }
            View childAt = zf0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                r1Var = (org.telegram.ui.Cells.r1) childAt;
                if (r1Var.getMessageObject() == fjVar) {
                    break;
                }
            }
            i10++;
        }
        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == fjVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (r1Var2 == null) {
            zf0Var.getAdapter().g(i11);
            return;
        }
        fjVar.M1 = true;
        r1Var2.y3(fjVar, r1Var2.getCurrentMessagesGroup(), r1Var2.K2(), r1Var2.L2(), r1Var2.C2(), false);
        zf0Var.getAdapter().g(i11);
    }

    public final void h(boolean z10) {
        this.r = z10;
        dismiss();
    }

    public final void i() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        xh.e.f(false);
        xh.e eVar = this.i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.ks.f(this.c).n(this, org.telegram.messenger.ks.w3);
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.u0;
    }

    public final void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.C0 == null || this.D0 == null) {
            return;
        }
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float L = org.telegram.messenger.g0.L(28.0f) + this.C0.c;
        float L2 = org.telegram.messenger.g0.L(32.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f16 = L / 2.0f;
        float f17 = f14 - f16;
        float f18 = L2 / 2.0f;
        rectF.set(f17, f15 - f18, f14 + f16, f15 + f18);
        canvas.save();
        canvas.drawRoundRect(rectF, f18, f18, this.D0);
        this.C0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long k() {
        org.telegram.messenger.fj messageObject;
        if (this.q0 || this.e0 == null) {
            return 0L;
        }
        if (this.l0 != null) {
            this.q0 = true;
            return this.I;
        }
        org.telegram.ui.Cells.r1 r1Var = this.Q;
        if (r1Var == null || (messageObject = r1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.k;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.q0 = true;
        return message.effect;
    }

    public final org.telegram.messenger.aj l(org.telegram.messenger.fj fjVar) {
        if (fjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.P.f(fjVar.c1());
        if (ajVar == null || (ajVar.d.size() > 1 && ajVar.d(fjVar) != null)) {
            return ajVar;
        }
        return null;
    }

    public final void n(boolean z10) {
        org.telegram.ui.Components.fa0 fa0Var;
        zf0 zf0Var = this.K;
        if (zf0Var == null || zf0Var.getAdapter() == null || (fa0Var = this.M) == null) {
            return;
        }
        int b10 = zf0Var.getAdapter().b();
        fa0Var.i1(z10 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.g0.L(12.0f), z10);
        this.A0 = z10;
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.q3 = z10;
            eVar.invalidate();
        } else {
            org.telegram.ui.Components.tg tgVar = this.W;
            if (tgVar != null) {
                if (z10) {
                    f10 = 0.0f;
                }
                tgVar.setAlpha(f10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.b0 = false;
            return;
        }
        uf0 uf0Var = this.e0;
        if (uf0Var == null || uf0Var.getReactionsWindow() == null) {
            this.q0 = true;
            super.onBackPressed();
        } else {
            if (this.e0.getReactionsWindow().C) {
                return;
            }
            this.e0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        rf0 rf0Var = this.F;
        setContentView(rf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ks.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i7 | (-1945959040);
        window.setAttributes(attributes);
        rf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(rf0Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    public final void p(long j3) {
        TLRPC.TL_availableEffect b12;
        this.I = j3;
        boolean i7 = this.P.i();
        ArrayList arrayList = this.N;
        int size = (i7 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        org.telegram.messenger.fj fjVar = (size < 0 || size >= arrayList.size()) ? null : (org.telegram.messenger.fj) arrayList.get(size);
        if (fjVar != null) {
            TLRPC.Message message = fjVar.k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.e0 == null || (b12 = org.telegram.messenger.mp.u1(this.c).b1(j3)) == null) {
            return;
        }
        this.e0.setSelectedReactionAnimated(ch.p0.e(b12));
    }

    public final void q(org.telegram.ui.Components.x60 x60Var) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        x60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        x60Var.R(this.k0, c8.j0.l(i6Var), false);
        ViewGroup viewGroup = x60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.na.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.r1 r1Var;
        ArrayList arrayList2;
        org.telegram.messenger.aj ajVar;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i11 >= size) {
                break;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
            if (fjVar.z2()) {
                org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) hVar.f(fjVar.d1());
                if (ajVar2 == null) {
                    ajVar2 = new org.telegram.messenger.aj();
                    ajVar2.n = false;
                    long c12 = fjVar.c1();
                    ajVar2.a = c12;
                    hVar.k(ajVar2, c12);
                }
                ArrayList arrayList3 = ajVar2.d;
                if (ajVar2.d(fjVar) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            arrayList3.add(fjVar);
                            break;
                        } else if (((org.telegram.messenger.fj) arrayList3.get(i12)).e1() == fjVar.e1()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (fjVar.d1() != 0) {
                fjVar.k.grouped_id = 0L;
                fjVar.e = 0L;
            }
            i11++;
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            ((org.telegram.messenger.aj) hVar.n(i13)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            int i15 = this.O;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList4.get(i14);
            if (getContext() == null) {
                i7 = i14;
                i10 = 0;
            } else {
                if (this.B0 == null) {
                    this.B0 = new org.telegram.ui.Cells.r1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.r1 r1Var2 = this.B0;
                r1Var2.f6 = false;
                r1Var2.h6 = false;
                r1Var2.i6 = false;
                r1Var2.j6 = false;
                r1Var2.k6 = false;
                org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) hVar.f(fjVar2.c1());
                fi.s2 s2Var = r1Var2.U0;
                s2Var.p0 = true;
                ImageReceiver imageReceiver = r1Var2.A7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = r1Var2.T7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = r1Var2.F7;
                imageReceiver3.p0 = true;
                if (ajVar3 != null) {
                    ArrayList arrayList5 = ajVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != ajVar3.f.size()) {
                            ajVar3.a();
                        }
                        r1Var2.hd = 0;
                        int i16 = 0;
                        i10 = 0;
                        while (i16 < arrayList5.size()) {
                            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList5.get(i16);
                            org.telegram.messenger.xi d = ajVar3.d(fjVar3);
                            if (d == null || (d.l & 4) == 0) {
                                org.telegram.messenger.aj ajVar4 = ajVar3;
                                r1Var = r1Var2;
                                arrayList2 = arrayList5;
                                ajVar = ajVar4;
                            } else {
                                org.telegram.ui.Cells.r1 r1Var3 = r1Var2;
                                arrayList2 = arrayList5;
                                ajVar = ajVar3;
                                r1Var3.x3(fjVar3, ajVar, false, false, false, false);
                                r1Var = r1Var3;
                                i10 += r1Var.b7;
                            }
                            i16++;
                            org.telegram.messenger.aj ajVar5 = ajVar;
                            arrayList5 = arrayList2;
                            r1Var2 = r1Var;
                            ajVar3 = ajVar5;
                        }
                        i7 = i14;
                    }
                }
                i7 = i14;
                r1Var2.x3(fjVar2, ajVar3, false, false, false, false);
                s2Var.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                r1Var2.R3();
                i10 = r1Var2.b7;
            }
            this.O = Math.max(i15, i10);
            i14 = i7 + 1;
        }
        zf0 zf0Var = this.K;
        zf0Var.getAdapter().f();
        int b10 = zf0Var.getAdapter().b();
        this.M.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.tg s(org.telegram.ui.Components.tg tgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = tgVar;
        tf0 tf0Var = new tf0(this, getContext(), tgVar.d, this.b, tgVar, z10);
        this.X = tf0Var;
        tf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.tg tgVar2 = this.W;
        tf0 tf0Var2 = this.X;
        tf0Var2.H = tgVar2.H;
        tf0Var2.s0 = tgVar2.s0;
        tf0Var2.f0.t(tgVar2.f0.i, false, true);
        tf0Var2.g0 = tgVar2.g0;
        tf0Var2.setEmoji(tgVar2.n.f[0]);
        tf0Var2.i(tgVar2.x, tgVar2.w, true);
        tf0Var2.S.e(true, tgVar2.S.c);
        tf0Var2.F.e(true, tgVar2.F.c);
        int i7 = tgVar2.L;
        int i10 = tgVar2.M;
        tf0Var2.L = i7;
        tf0Var2.M = i10;
        float f10 = tgVar2.P;
        float f11 = tgVar2.Q;
        tf0Var2.P = f10;
        tf0Var2.Q = f11;
        this.X.S.e(true, tgVar.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(tgVar.getWidth(), tgVar.getHeight()));
        org.telegram.ui.Components.tg tgVar3 = this.W;
        tgVar.getHeight();
        this.Y = tgVar3.m();
        d(this.r0);
        return this.X;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            xh.e.f(true);
            super.show();
            final float alpha = this.W.getAlpha();
            o(true, alpha);
            org.telegram.ui.Components.yk0.d(new org.telegram.messenger.p10() { // from class: org.telegram.ui.of0
                @Override // org.telegram.messenger.p10
                public final void a(Object obj, Object obj2) {
                    dg0 dg0Var = dg0.this;
                    dg0Var.o(false, alpha);
                    dg0Var.e = (Bitmap) obj;
                    Paint paint = new Paint(1);
                    dg0Var.h = paint;
                    Bitmap bitmap = dg0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    dg0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    dg0Var.n = new Matrix();
                    ui.b bVar = dg0Var.j0;
                    bVar.a((Bitmap) obj2);
                    ih.d.c(bVar, dg0Var.F);
                    ViewGroup viewGroup = dg0Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            rf0 rf0Var = this.H;
            if (rf0Var != null) {
                rf0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.C0 = j3 > 0 ? new org.telegram.ui.Components.wy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o()) : null;
        if (this.D0 == null) {
            Paint paint = new Paint(1);
            this.D0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.K.invalidate();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 >= arrayList.size()) {
                this.L.f();
                return;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            if (fjVar != null && (message = fjVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j3 > 0;
            }
            i7++;
        }
    }

    public final void u() {
        if (this.f0) {
            return;
        }
        this.g0 = false;
        this.f0 = true;
        this.e0.p(null, null, true);
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.kr.h).start();
        this.e0.r(false);
    }

    public void m(long j3) {
    }
}
