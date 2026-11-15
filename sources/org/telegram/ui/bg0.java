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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class bg0 extends Dialog implements org.telegram.messenger.is {
    public boolean A0;
    public org.telegram.ui.Cells.q1 B0;
    public org.telegram.ui.Components.oy0 C0;
    public Paint D0;
    public float E;
    public final pf0 F;
    public final wf0 G;
    public final pf0 H;
    public long I;
    public org.telegram.ui.Components.e5 J;
    public final xf0 K;
    public final hi.w L;
    public final org.telegram.ui.Components.w90 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.q1 Q;
    public int R;
    public org.telegram.ui.Components.xe S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.kd V;
    public org.telegram.ui.Components.jg W;
    public rf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final qf0 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final int c;
    public float c0;
    public i0.c d;
    public FrameLayout d0;
    public Bitmap e;
    public sf0 e0;
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
    public org.telegram.ui.Cells.q1 v0;
    public boolean w;
    public float w0;
    public boolean x;
    public float x0;
    public boolean y;
    public final Rect y0;
    public ValueAnimator z0;

    public bg0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        int i7 = org.telegram.messenger.m10.t0;
        this.c = i7;
        this.d = i0.c.e;
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
        this.b = e6Var;
        org.telegram.messenger.g0.S(getWindow());
        pf0 pf0Var = new pf0(this, context, i10);
        this.F = pf0Var;
        this.i0 = xh.e.d(1, pf0Var, pf0Var);
        pf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nf0
            public final /* synthetic */ bg0 b;

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
        pf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.of0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                bg0 bg0Var = bg0.this;
                if (bg0Var.t0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.g0.v1(bg0Var.S);
                org.telegram.messenger.g0.i3(new lf0(bg0Var, (EditText) view2, 0), 200L);
            }
        });
        ui.b bVar = new ui.b();
        this.j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.k0 = cVar;
        cVar.h = new jh.k(pf0Var);
        cVar.i = pf0Var;
        wf0 wf0Var = new wf0(this, context, e6Var);
        this.G = wf0Var;
        wf0Var.setClipToPadding(false);
        pf0Var.addView(wf0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(pf0Var, fVar);
        xf0 xf0Var = new xf0(this, context, e6Var);
        this.K = xf0Var;
        xf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nf0
            public final /* synthetic */ bg0 b;

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
        xf0Var.setOnItemClickListener(new h(this, 17));
        xf0Var.setOnScrollListener(new g3(this, 19));
        xf0Var.setItemAnimator(new zf0(null, xf0Var, e6Var));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(this, i10);
        this.M = w90Var;
        w90Var.O = new bi.y1(this, 14);
        xf0Var.setLayoutManager(w90Var);
        xf0Var.i(new fi.k(13));
        hi.w wVar = new hi.w(this, context, e6Var, i10);
        this.L = wVar;
        xf0Var.setAdapter(wVar);
        xf0Var.setVerticalScrollBarEnabled(false);
        xf0Var.setOverScrollMode(2);
        wf0Var.addView(xf0Var, c8.ja.c(-2.0f, -1));
        pf0 pf0Var2 = new pf0(this, context, i11);
        this.H = pf0Var2;
        pf0Var.addView(pf0Var2, c8.ja.c(-1.0f, -1));
        this.a0 = new qf0(this, pf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        ch.x xVar;
        if (this.e0 != null || e2Var == null) {
            return;
        }
        int i7 = this.c;
        org.telegram.messenger.np.s1(i7).E0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
        sf0 sf0Var = new sf0(5, this.c, getContext(), null, this.b);
        this.e0 = sf0Var;
        sf0Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
        this.e0.setDelegate(new uf0(this, e2Var));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(org.telegram.messenger.hd.M0(2131754443, null));
        this.e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
        this.e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
        this.G.addView(this.d0, c8.ja.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, c8.ja.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.np.s1(i7).i8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.u3);
        } else {
            u();
        }
        sf0 sf0Var2 = this.e0;
        if (sf0Var2 != null && !sf0Var2.h1) {
            sf0Var2.h1 = true;
            sf0Var2.i1 = true;
            ch.b0 b0Var = sf0Var2.y0;
            if (b0Var != null && (xVar = b0Var.m) != null && !xVar.M1) {
                xVar.M1 = true;
                xVar.N1 = true;
                l01 l01Var = xVar.i0;
                if (l01Var != null) {
                    l01Var.invalidate();
                }
                b01 b01Var = xVar.j0;
                if (b01Var != null) {
                    b01Var.invalidate();
                }
            }
        }
        new hi.p3(this.F, false, new r3(this, 13));
    }

    public final void d(int[] iArr) {
        androidx.activity.n nVar = this.n0;
        if (nVar == null) {
            this.W.getLocationOnScreen(iArr);
            iArr[0] = org.telegram.messenger.i20.D(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
            return;
        }
        int[] iArr2 = (int[]) nVar.c;
        ji.e eVar = (ji.e) nVar.d;
        if (!nVar.b || (!eVar.f3 && eVar.isAttachedToWindow() && !eVar.l0.isEmpty())) {
            int[] iArr3 = eVar.g3;
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 != org.telegram.messenger.ns.u3 || (messages_availableeffects = org.telegram.messenger.np.s1(this.c).i8) == null || messages_availableeffects.effects.isEmpty()) {
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
        rf0 rf0Var = this.X;
        if (rf0Var != null) {
            rf0Var.invalidate();
        }
        org.telegram.ui.Components.jg jgVar = this.W;
        if (jgVar != null) {
            jgVar.invalidate();
        }
        e(new kf0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ns.f(this.c).n(this, org.telegram.messenger.ns.u3);
    }

    public final void e(Runnable runnable, boolean z10) {
        sf0 sf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.g1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z10 && (sf0Var = this.e0) != null && this.f0) {
            sf0Var.e();
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
        ofFloat.addUpdateListener(new ch.u(10, this, z11));
        this.z0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.z0.setInterpolator(org.telegram.ui.Components.er.h);
        this.z0.setDuration(350L);
        this.z0.start();
    }

    public final void f(org.telegram.messenger.gj gjVar) {
        org.telegram.messenger.bj l10 = l(gjVar);
        if (l10 == null) {
            g(gjVar);
            return;
        }
        l10.a();
        ArrayList arrayList = l10.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g((org.telegram.messenger.gj) obj);
        }
    }

    public final void g(org.telegram.messenger.gj gjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        xf0 xf0Var = this.K;
        if (xf0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= xf0Var.getChildCount()) {
                q1Var = null;
                break;
            }
            View childAt = xf0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == gjVar) {
                    break;
                }
            }
            i10++;
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == gjVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (q1Var2 == null) {
            xf0Var.getAdapter().g(i11);
            return;
        }
        gjVar.M1 = true;
        q1Var2.x3(gjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.I2(), q1Var2.J2(), q1Var2.A2(), false);
        xf0Var.getAdapter().g(i11);
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
        org.telegram.messenger.ns.f(this.c).n(this, org.telegram.messenger.ns.u3);
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
        org.telegram.messenger.gj messageObject;
        if (this.q0 || this.e0 == null) {
            return 0L;
        }
        if (this.l0 != null) {
            this.q0 = true;
            return this.I;
        }
        org.telegram.ui.Cells.q1 q1Var = this.Q;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.k;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.q0 = true;
        return message.effect;
    }

    public final org.telegram.messenger.bj l(org.telegram.messenger.gj gjVar) {
        if (gjVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.P.f(gjVar.c1());
        if (bjVar == null || (bjVar.d.size() > 1 && bjVar.d(gjVar) != null)) {
            return bjVar;
        }
        return null;
    }

    public final void n(boolean z10) {
        org.telegram.ui.Components.w90 w90Var;
        xf0 xf0Var = this.K;
        if (xf0Var == null || xf0Var.getAdapter() == null || (w90Var = this.M) == null) {
            return;
        }
        int b10 = xf0Var.getAdapter().b();
        w90Var.i1(z10 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.g0.L(12.0f), z10);
        this.A0 = z10;
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.f3 = z10;
            eVar.invalidate();
        } else {
            org.telegram.ui.Components.jg jgVar = this.W;
            if (jgVar != null) {
                if (z10) {
                    f10 = 0.0f;
                }
                jgVar.setAlpha(f10);
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
        sf0 sf0Var = this.e0;
        if (sf0Var == null || sf0Var.getReactionsWindow() == null) {
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
        pf0 pf0Var = this.F;
        setContentView(pf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ns.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i7 | (-1945959040);
        window.setAttributes(attributes);
        pf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(pf0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(long j3) {
        TLRPC.TL_availableEffect Z0;
        this.I = j3;
        boolean i7 = this.P.i();
        ArrayList arrayList = this.N;
        int size = (i7 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        org.telegram.messenger.gj gjVar = (size < 0 || size >= arrayList.size()) ? null : (org.telegram.messenger.gj) arrayList.get(size);
        if (gjVar != null) {
            TLRPC.Message message = gjVar.k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.e0 == null || (Z0 = org.telegram.messenger.np.s1(this.c).Z0(j3)) == null) {
            return;
        }
        this.e0.setSelectedReactionAnimated(ch.p0.e(Z0));
    }

    public final void q(org.telegram.ui.Components.m60 m60Var) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        m60Var.Q(this.k0, c8.g0.k(e6Var), false);
        ViewGroup viewGroup = m60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.ja.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.bj bjVar;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i11 >= size) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
            if (gjVar.z2()) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) hVar.f(gjVar.d1());
                if (bjVar2 == null) {
                    bjVar2 = new org.telegram.messenger.bj();
                    bjVar2.n = false;
                    long c12 = gjVar.c1();
                    bjVar2.a = c12;
                    hVar.k(bjVar2, c12);
                }
                ArrayList arrayList3 = bjVar2.d;
                if (bjVar2.d(gjVar) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            arrayList3.add(gjVar);
                            break;
                        } else if (((org.telegram.messenger.gj) arrayList3.get(i12)).e1() == gjVar.e1()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (gjVar.d1() != 0) {
                gjVar.k.grouped_id = 0L;
                gjVar.e = 0L;
            }
            i11++;
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            ((org.telegram.messenger.bj) hVar.n(i13)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            int i15 = this.O;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList4.get(i14);
            if (getContext() == null) {
                i7 = i14;
                i10 = 0;
            } else {
                if (this.B0 == null) {
                    this.B0 = new org.telegram.ui.Cells.q1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.B0;
                q1Var2.f6 = false;
                q1Var2.h6 = false;
                q1Var2.i6 = false;
                q1Var2.j6 = false;
                q1Var2.k6 = false;
                org.telegram.messenger.bj bjVar3 = (org.telegram.messenger.bj) hVar.f(gjVar2.c1());
                fi.u2 u2Var = q1Var2.U0;
                u2Var.p0 = true;
                ImageReceiver imageReceiver = q1Var2.A7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = q1Var2.T7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = q1Var2.F7;
                imageReceiver3.p0 = true;
                if (bjVar3 != null) {
                    ArrayList arrayList5 = bjVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != bjVar3.f.size()) {
                            bjVar3.a();
                        }
                        q1Var2.hd = 0;
                        int i16 = 0;
                        i10 = 0;
                        while (i16 < arrayList5.size()) {
                            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList5.get(i16);
                            org.telegram.messenger.yi d = bjVar3.d(gjVar3);
                            if (d == null || (d.l & 4) == 0) {
                                org.telegram.messenger.bj bjVar4 = bjVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar4;
                            } else {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                bjVar = bjVar3;
                                q1Var3.w3(gjVar3, bjVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.b7;
                            }
                            i16++;
                            org.telegram.messenger.bj bjVar5 = bjVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            bjVar3 = bjVar5;
                        }
                        i7 = i14;
                    }
                }
                i7 = i14;
                q1Var2.w3(gjVar2, bjVar3, false, false, false, false);
                u2Var.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                q1Var2.Q3();
                i10 = q1Var2.b7;
            }
            this.O = Math.max(i15, i10);
            i14 = i7 + 1;
        }
        xf0 xf0Var = this.K;
        xf0Var.getAdapter().f();
        int b10 = xf0Var.getAdapter().b();
        this.M.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.jg s(org.telegram.ui.Components.jg jgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = jgVar;
        rf0 rf0Var = new rf0(this, getContext(), jgVar.d, this.b, jgVar, z10);
        this.X = rf0Var;
        rf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.jg jgVar2 = this.W;
        rf0 rf0Var2 = this.X;
        rf0Var2.H = jgVar2.H;
        rf0Var2.q0 = jgVar2.q0;
        rf0Var2.f0.t(jgVar2.f0.i, false, true);
        rf0Var2.g0 = jgVar2.g0;
        rf0Var2.setEmoji(jgVar2.n.f[0]);
        rf0Var2.i(jgVar2.x, jgVar2.w, true);
        rf0Var2.S.e(true, jgVar2.S.c);
        rf0Var2.F.e(true, jgVar2.F.c);
        int i7 = jgVar2.L;
        int i10 = jgVar2.M;
        rf0Var2.L = i7;
        rf0Var2.M = i10;
        float f10 = jgVar2.P;
        float f11 = jgVar2.Q;
        rf0Var2.P = f10;
        rf0Var2.Q = f11;
        this.X.S.e(true, jgVar.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(jgVar.getWidth(), jgVar.getHeight()));
        org.telegram.ui.Components.jg jgVar3 = this.W;
        jgVar.getHeight();
        this.Y = jgVar3.m();
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
            org.telegram.ui.Components.ok0.d(new org.telegram.messenger.s10() { // from class: org.telegram.ui.mf0
                @Override // org.telegram.messenger.s10
                public final void a(Object obj, Object obj2) {
                    bg0 bg0Var = bg0.this;
                    bg0Var.o(false, alpha);
                    bg0Var.e = (Bitmap) obj;
                    Paint paint = new Paint(1);
                    bg0Var.h = paint;
                    Bitmap bitmap = bg0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    bg0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    bg0Var.n = new Matrix();
                    ui.b bVar = bg0Var.j0;
                    bVar.a((Bitmap) obj2);
                    ih.d.c(bVar, bg0Var.F);
                    ViewGroup viewGroup = bg0Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            pf0 pf0Var = this.H;
            if (pf0Var != null) {
                pf0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.C0 = j3 > 0 ? new org.telegram.ui.Components.oy0(di.lb.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o()) : null;
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            if (gjVar != null && (message = gjVar.k) != null && (messageMedia = message.media) != null) {
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
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
        this.e0.r(false);
    }

    public void m(long j3) {
    }
}
