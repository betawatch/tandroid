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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class eg0 extends Dialog implements org.telegram.messenger.ls {
    public float D;
    public final sf0 E;
    public final zf0 F;
    public final sf0 G;
    public long H;
    public org.telegram.ui.Components.f5 I;
    public final ag0 J;
    public final fi.w K;
    public final org.telegram.ui.Components.u90 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.q1 P;
    public int Q;
    public org.telegram.ui.Components.we R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.kd U;
    public org.telegram.ui.Components.cg V;
    public uf0 W;
    public int X;
    public ViewGroup Y;
    public final tf0 Z;
    public final Context a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public float b0;
    public final int c;
    public FrameLayout c0;
    public i0.b d;
    public vf0 d0;
    public Bitmap e;
    public boolean e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public final xh.e h0;
    public final ri.b i0;
    public final dh.c j0;
    public RectF k0;
    public boolean l0;
    public boolean m0;
    public Matrix n;
    public final int[] n0;
    public boolean o0;
    public boolean p0;
    public org.telegram.ui.Cells.q1 q0;
    public boolean r;
    public float r0;
    public boolean s;
    public float s0;
    public final Rect t0;
    public ValueAnimator u0;
    public boolean v0;
    public boolean w;
    public org.telegram.ui.Cells.q1 w0;
    public boolean x;
    public org.telegram.ui.Components.my0 x0;
    public boolean y;
    public Paint y0;

    public eg0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, R.style.TransparentDialog);
        int i7 = org.telegram.messenger.p10.s0;
        this.c = i7;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        final int i10 = 1;
        this.S = new Paint(1);
        this.n0 = new int[2];
        final int i11 = 0;
        this.p0 = false;
        this.t0 = new Rect();
        this.a = context;
        this.b = h6Var;
        org.telegram.messenger.g0.S(getWindow());
        sf0 sf0Var = new sf0(this, context, i10);
        this.E = sf0Var;
        this.h0 = xh.e.d(1, sf0Var, sf0Var);
        sf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf0
            public final /* synthetic */ eg0 b;

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
        sf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.rf0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                eg0 eg0Var = eg0.this;
                if (eg0Var.o0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.g0.v1(eg0Var.R);
                org.telegram.messenger.g0.i3(new of0(eg0Var, (EditText) view2, 0), 200L);
            }
        });
        ri.b bVar = new ri.b();
        this.i0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.j0 = cVar;
        cVar.h = new jh.k(sf0Var);
        cVar.i = sf0Var;
        zf0 zf0Var = new zf0(this, context, h6Var);
        this.F = zf0Var;
        zf0Var.setClipToPadding(false);
        sf0Var.addView(zf0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(sf0Var, fVar);
        ag0 ag0Var = new ag0(this, context, h6Var);
        this.J = ag0Var;
        ag0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qf0
            public final /* synthetic */ eg0 b;

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
        ag0Var.setOnItemClickListener(new h(this, 17));
        ag0Var.setOnScrollListener(new g3(this, 19));
        ag0Var.setItemAnimator(new cg0(null, ag0Var, h6Var));
        org.telegram.ui.Components.u90 u90Var = new org.telegram.ui.Components.u90(this, i10);
        this.L = u90Var;
        u90Var.O = new ai.l(this, 11);
        ag0Var.setLayoutManager(u90Var);
        ag0Var.i(new di.k(13));
        fi.w wVar = new fi.w(this, context, h6Var, i10);
        this.K = wVar;
        ag0Var.setAdapter(wVar);
        ag0Var.setVerticalScrollBarEnabled(false);
        ag0Var.setOverScrollMode(2);
        zf0Var.addView(ag0Var, c8.ha.c(-2.0f, -1));
        sf0 sf0Var2 = new sf0(this, context, i11);
        this.G = sf0Var2;
        sf0Var.addView(sf0Var2, c8.ha.c(-1.0f, -1));
        this.Z = new tf0(this, sf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        ch.w wVar;
        if (this.d0 != null || f2Var == null) {
            return;
        }
        int i7 = this.c;
        org.telegram.messenger.qp.s1(i7).E0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.c0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.c0.setClipToPadding(false);
        this.c0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
        vf0 vf0Var = new vf0(5, this.c, getContext(), null, this.b);
        this.d0 = vf0Var;
        vf0Var.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
        this.d0.setDelegate(new xf0(this, f2Var));
        this.d0.setTop(false);
        this.d0.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setVisibility(0);
        this.d0.setHint(org.telegram.messenger.id.M0(2131754443, null));
        this.d0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
        this.d0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
        this.F.addView(this.c0, c8.ha.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.c0.addView(this.d0, c8.ha.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.setScaleY(0.4f);
        this.d0.setScaleX(0.4f);
        this.d0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.qp.s1(i7).h8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.u3);
        } else {
            s();
        }
        vf0 vf0Var2 = this.d0;
        if (vf0Var2 != null && !vf0Var2.g1) {
            vf0Var2.g1 = true;
            vf0Var2.h1 = true;
            ch.b0 b0Var = vf0Var2.x0;
            if (b0Var != null && (wVar = b0Var.m) != null && !wVar.L1) {
                wVar.L1 = true;
                wVar.M1 = true;
                r01 r01Var = wVar.h0;
                if (r01Var != null) {
                    r01Var.invalidate();
                }
                h01 h01Var = wVar.i0;
                if (h01Var != null) {
                    h01Var.invalidate();
                }
            }
        }
        new fi.q3(this.E, false, new r3(this, 13));
    }

    public final void d(Runnable runnable, boolean z9) {
        vf0 vf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = z9 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z10) {
            org.telegram.ui.ActionBar.g1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        if (!z9 && (vf0Var = this.d0) != null && this.e0) {
            vf0Var.e();
            if (this.d0.getReactionsWindow() != null && this.d0.getReactionsWindow().a != null) {
                this.d0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z9;
        this.J.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z9 ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(10, this, z10));
        this.u0.addListener(new org.telegram.ui.ActionBar.g(this, z9, z10, runnable));
        this.u0.setInterpolator(org.telegram.ui.Components.wq.h);
        this.u0.setDuration(350L);
        this.u0.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i7 != org.telegram.messenger.qs.u3 || (messages_availableeffects = org.telegram.messenger.qp.s1(this.c).h8) == null || messages_availableeffects.effects.isEmpty()) {
            return;
        }
        s();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        uf0 uf0Var = this.W;
        if (uf0Var != null) {
            uf0Var.invalidate();
        }
        org.telegram.ui.Components.cg cgVar = this.V;
        if (cgVar != null) {
            cgVar.invalidate();
        }
        d(new nf0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.qs.f(this.c).n(this, org.telegram.messenger.qs.u3);
    }

    public final void e(org.telegram.messenger.ij ijVar) {
        org.telegram.messenger.dj k10 = k(ijVar);
        if (k10 == null) {
            f(ijVar);
            return;
        }
        k10.a();
        ArrayList arrayList = k10.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f((org.telegram.messenger.ij) obj);
        }
    }

    public final void f(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Cells.q1 q1Var;
        ag0 ag0Var = this.J;
        if (ag0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= ag0Var.getChildCount()) {
                q1Var = null;
                break;
            }
            View childAt = ag0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ijVar) {
                    break;
                }
            }
            i10++;
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.M;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == ijVar) {
                i11 = (arrayList.size() - 1) - i7;
            }
            i7++;
        }
        if (q1Var2 == null) {
            ag0Var.getAdapter().g(i11);
            return;
        }
        ijVar.K1 = true;
        q1Var2.w3(ijVar, q1Var2.getCurrentMessagesGroup(), q1Var2.H2(), q1Var2.I2(), q1Var2.z2(), false);
        ag0Var.getAdapter().g(i11);
    }

    public final void g(boolean z9) {
        this.r = z9;
        dismiss();
    }

    public final void h() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        xh.e.f(false);
        xh.e eVar = this.h0;
        if (eVar != null) {
            eVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.qs.f(this.c).n(this, org.telegram.messenger.qs.u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.x0 == null || this.y0 == null) {
            return;
        }
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float L = org.telegram.messenger.g0.L(28.0f) + this.x0.c;
        float L2 = org.telegram.messenger.g0.L(32.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f16 = L / 2.0f;
        float f17 = f14 - f16;
        float f18 = L2 / 2.0f;
        rectF.set(f17, f15 - f18, f14 + f16, f15 + f18);
        canvas.save();
        canvas.drawRoundRect(rectF, f18, f18, this.y0);
        this.x0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.p0;
    }

    public final long j() {
        org.telegram.messenger.ij messageObject;
        if (this.m0 || this.d0 == null) {
            return 0L;
        }
        if (this.k0 != null) {
            this.m0 = true;
            return this.H;
        }
        org.telegram.ui.Cells.q1 q1Var = this.P;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.k;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.m0 = true;
        return message.effect;
    }

    public final org.telegram.messenger.dj k(org.telegram.messenger.ij ijVar) {
        if (ijVar.c1() == 0) {
            return null;
        }
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.O.f(ijVar.c1());
        if (djVar == null || (djVar.d.size() > 1 && djVar.d(ijVar) != null)) {
            return djVar;
        }
        return null;
    }

    public final void m(boolean z9) {
        org.telegram.ui.Components.u90 u90Var;
        ag0 ag0Var = this.J;
        if (ag0Var == null || ag0Var.getAdapter() == null || (u90Var = this.L) == null) {
            return;
        }
        int b10 = ag0Var.getAdapter().b();
        u90Var.i1(z9 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.g0.L(12.0f), z9);
        this.v0 = z9;
    }

    public final void n(long j3) {
        TLRPC.TL_availableEffect Z0;
        this.H = j3;
        boolean i7 = this.O.i();
        ArrayList arrayList = this.M;
        int size = (i7 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        org.telegram.messenger.ij ijVar = (size < 0 || size >= arrayList.size()) ? null : (org.telegram.messenger.ij) arrayList.get(size);
        if (ijVar != null) {
            TLRPC.Message message = ijVar.k;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.d0 == null || (Z0 = org.telegram.messenger.qp.s1(this.c).Z0(j3)) == null) {
            return;
        }
        this.d0.setSelectedReactionAnimated(ch.o0.e(Z0));
    }

    public final void o(org.telegram.ui.Components.k60 k60Var) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        k60Var.T(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        k60Var.Q(this.j0, c8.g0.k(h6Var), false);
        ViewGroup viewGroup = k60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, c8.ha.c(-2.0f, -2));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.a0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.a0 = false;
            return;
        }
        vf0 vf0Var = this.d0;
        if (vf0Var == null || vf0Var.getReactionsWindow() == null) {
            this.m0 = true;
            super.onBackPressed();
        } else {
            if (this.d0.getReactionsWindow().C) {
                return;
            }
            this.d0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        sf0 sf0Var = this.E;
        setContentView(sf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i7 | (-1945959040);
        window.setAttributes(attributes);
        sf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(sf0Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i7;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.dj djVar;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
            if (i11 >= size) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
            if (ijVar.z2()) {
                org.telegram.messenger.dj djVar2 = (org.telegram.messenger.dj) hVar.f(ijVar.d1());
                if (djVar2 == null) {
                    djVar2 = new org.telegram.messenger.dj();
                    djVar2.n = false;
                    long c12 = ijVar.c1();
                    djVar2.a = c12;
                    hVar.k(djVar2, c12);
                }
                ArrayList arrayList3 = djVar2.d;
                if (djVar2.d(ijVar) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            arrayList3.add(ijVar);
                            break;
                        } else if (((org.telegram.messenger.ij) arrayList3.get(i12)).e1() == ijVar.e1()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (ijVar.d1() != 0) {
                ijVar.k.grouped_id = 0L;
                ijVar.e = 0L;
            }
            i11++;
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            ((org.telegram.messenger.dj) hVar.n(i13)).a();
        }
        ArrayList arrayList4 = this.M;
        arrayList4.addAll(arrayList);
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            int i15 = this.N;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList4.get(i14);
            if (getContext() == null) {
                i7 = i14;
                i10 = 0;
            } else {
                if (this.w0 == null) {
                    this.w0 = new org.telegram.ui.Cells.q1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.w0;
                q1Var2.e6 = false;
                q1Var2.g6 = false;
                q1Var2.h6 = false;
                q1Var2.i6 = false;
                q1Var2.j6 = false;
                org.telegram.messenger.dj djVar3 = (org.telegram.messenger.dj) hVar.f(ijVar2.c1());
                di.z2 z2Var = q1Var2.T0;
                z2Var.o0 = true;
                ImageReceiver imageReceiver = q1Var2.z7;
                imageReceiver.o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.o0 = true;
                if (djVar3 != null) {
                    ArrayList arrayList5 = djVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != djVar3.f.size()) {
                            djVar3.a();
                        }
                        q1Var2.Tc = 0;
                        int i16 = 0;
                        i10 = 0;
                        while (i16 < arrayList5.size()) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList5.get(i16);
                            org.telegram.messenger.aj d = djVar3.d(ijVar3);
                            if (d == null || (d.l & 4) == 0) {
                                org.telegram.messenger.dj djVar4 = djVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar4;
                            } else {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                djVar = djVar3;
                                q1Var3.v3(ijVar3, djVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.a7;
                            }
                            i16++;
                            org.telegram.messenger.dj djVar5 = djVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            djVar3 = djVar5;
                        }
                        i7 = i14;
                    }
                }
                i7 = i14;
                q1Var2.v3(ijVar2, djVar3, false, false, false, false);
                z2Var.o0 = false;
                imageReceiver.o0 = false;
                imageReceiver2.o0 = false;
                imageReceiver3.o0 = false;
                q1Var2.P3();
                i10 = q1Var2.a7;
            }
            this.N = Math.max(i15, i10);
            i14 = i7 + 1;
        }
        ag0 ag0Var = this.J;
        ag0Var.getAdapter().f();
        int b10 = ag0Var.getAdapter().b();
        this.L.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.cg q(org.telegram.ui.Components.cg cgVar, boolean z9, View.OnClickListener onClickListener) {
        this.V = cgVar;
        int[] iArr = this.n0;
        cgVar.getLocationOnScreen(iArr);
        uf0 uf0Var = new uf0(this, getContext(), cgVar.b, this.b, cgVar, z9);
        this.W = uf0Var;
        uf0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.cg cgVar2 = this.V;
        uf0 uf0Var2 = this.W;
        uf0Var2.E = cgVar2.E;
        uf0Var2.h0 = cgVar2.h0;
        uf0Var2.c0.t(cgVar2.c0.i, false, true);
        uf0Var2.d0 = cgVar2.d0;
        uf0Var2.setEmoji(cgVar2.f.f[0]);
        uf0Var2.i(cgVar2.s, cgVar2.r, true);
        uf0Var2.P.e(true, cgVar2.P.c);
        uf0Var2.y.e(true, cgVar2.y.c);
        int i7 = cgVar2.I;
        int i10 = cgVar2.J;
        uf0Var2.I = i7;
        uf0Var2.J = i10;
        float f10 = cgVar2.M;
        float f11 = cgVar2.N;
        uf0Var2.M = f10;
        uf0Var2.N = f11;
        this.W.P.e(true, cgVar.P.c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(cgVar.getWidth(), cgVar.getHeight()));
        org.telegram.ui.Components.cg cgVar3 = this.V;
        cgVar.getHeight();
        this.X = cgVar3.m();
        int i11 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.cg cgVar4 = this.V;
        cgVar.getHeight();
        iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - cgVar4.m(), i11);
        return this.W;
    }

    public final void r(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.x0 = j3 > 0 ? new org.telegram.ui.Components.my0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o()) : null;
        if (this.y0 == null) {
            Paint paint = new Paint(1);
            this.y0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.J.invalidate();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i7 >= arrayList.size()) {
                this.K.f();
                return;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && (message = ijVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j3 > 0;
            }
            i7++;
        }
    }

    public final void s() {
        if (this.e0) {
            return;
        }
        this.f0 = false;
        this.e0 = true;
        this.d0.p(null, null, true);
        this.d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wq.h).start();
        this.d0.r(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            xh.e.f(true);
            super.show();
            final float alpha = this.V.getAlpha();
            org.telegram.ui.Components.cg cgVar = this.V;
            if (cgVar != null) {
                cgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.jk0.d(new org.telegram.messenger.v10() { // from class: org.telegram.ui.pf0
                @Override // org.telegram.messenger.v10
                public final void a(Object obj, Object obj2) {
                    eg0 eg0Var = eg0.this;
                    ri.b bVar = eg0Var.i0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.cg cgVar2 = eg0Var.V;
                    if (cgVar2 != null) {
                        cgVar2.setAlpha(alpha);
                    }
                    eg0Var.e = bitmap;
                    Paint paint = new Paint(1);
                    eg0Var.h = paint;
                    Bitmap bitmap3 = eg0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    eg0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    eg0Var.n = new Matrix();
                    bVar.a(bitmap2);
                    ih.d.c(bVar, eg0Var.E);
                    ViewGroup viewGroup = eg0Var.Y;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            sf0 sf0Var = this.G;
            if (sf0Var != null) {
                sf0Var.bringToFront();
            }
            d(null, true);
        }
    }

    public void l(long j3) {
    }
}
