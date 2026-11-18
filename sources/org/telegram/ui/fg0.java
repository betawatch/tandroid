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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class fg0 extends Dialog implements org.telegram.messenger.fs {
    public boolean A0;
    public org.telegram.ui.Cells.r1 B0;
    public org.telegram.ui.Components.vy0 C0;
    public Paint D0;
    public float E;
    public final tf0 F;
    public final ag0 G;
    public final tf0 H;
    public long I;
    public org.telegram.ui.Components.m5 J;
    public final bg0 K;
    public final hi.x L;
    public final org.telegram.ui.Components.ga0 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.r1 Q;
    public int R;
    public org.telegram.ui.Components.gf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ud V;
    public org.telegram.ui.Components.sg W;
    public vf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final uf0 a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public boolean b0;
    public final int c;
    public float c0;
    public i0.b d;
    public FrameLayout d0;
    public Bitmap e;
    public wf0 e0;
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

    public fg0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, R.style.TransparentDialog);
        int i7 = org.telegram.messenger.j10.t0;
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
        tf0 tf0Var = new tf0(this, context, i10);
        this.F = tf0Var;
        this.i0 = xh.e.d(1, tf0Var, tf0Var);
        tf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rf0
            public final /* synthetic */ fg0 b;

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
        tf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.sf0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                fg0 fg0Var = fg0.this;
                if (fg0Var.t0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.g0.v1(fg0Var.S);
                org.telegram.messenger.g0.h3(new pf0(fg0Var, (EditText) view2, 0), 200L);
            }
        });
        ui.b bVar = new ui.b();
        this.j0 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.k0 = cVar;
        cVar.h = new jh.k(tf0Var);
        cVar.i = tf0Var;
        ag0 ag0Var = new ag0(this, context, i6Var);
        this.G = ag0Var;
        ag0Var.setClipToPadding(false);
        tf0Var.addView(ag0Var, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(tf0Var, fVar);
        bg0 bg0Var = new bg0(this, context, i6Var);
        this.K = bg0Var;
        bg0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rf0
            public final /* synthetic */ fg0 b;

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
        bg0Var.setOnItemClickListener(new h(this, 17));
        bg0Var.setOnScrollListener(new g3(this, 19));
        bg0Var.setItemAnimator(new dg0(null, bg0Var, i6Var));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(this, i10);
        this.M = ga0Var;
        ga0Var.O = new bi.s2(this, 14);
        bg0Var.setLayoutManager(ga0Var);
        bg0Var.i(new fi.k(13));
        hi.x xVar = new hi.x(this, context, i6Var, i10);
        this.L = xVar;
        bg0Var.setAdapter(xVar);
        bg0Var.setVerticalScrollBarEnabled(false);
        bg0Var.setOverScrollMode(2);
        ag0Var.addView(bg0Var, c8.ma.c(-2.0f, -1));
        tf0 tf0Var2 = new tf0(this, context, i11);
        this.H = tf0Var2;
        tf0Var.addView(tf0Var2, c8.ma.c(-1.0f, -1));
        this.a0 = new uf0(this, tf0Var2, i7);
    }

    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        ch.x xVar;
        if (this.e0 != null || h2Var == null) {
            return;
        }
        int i7 = this.c;
        org.telegram.messenger.mp.u1(i7).G0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
        wf0 wf0Var = new wf0(5, this.c, getContext(), null, this.b);
        this.e0 = wf0Var;
        wf0Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
        this.e0.setDelegate(new yf0(this, h2Var));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(org.telegram.messenger.gd.M0(2131754441, null));
        this.e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
        this.e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
        this.G.addView(this.d0, c8.ma.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, c8.ma.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.mp.u1(i7).n8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.w3);
        } else {
            u();
        }
        wf0 wf0Var2 = this.e0;
        if (wf0Var2 != null && !wf0Var2.h1) {
            wf0Var2.h1 = true;
            wf0Var2.i1 = true;
            ch.b0 b0Var = wf0Var2.y0;
            if (b0Var != null && (xVar = b0Var.m) != null && !xVar.M1) {
                xVar.M1 = true;
                xVar.N1 = true;
                p01 p01Var = xVar.i0;
                if (p01Var != null) {
                    p01Var.invalidate();
                }
                f01 f01Var = xVar.j0;
                if (f01Var != null) {
                    f01Var.invalidate();
                }
            }
        }
        new hi.p3(this.F, false, new r3(this, 14));
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
        if (!nVar.b || (!eVar.o3 && eVar.isAttachedToWindow() && !eVar.l0.isEmpty())) {
            int[] iArr3 = eVar.p3;
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
        vf0 vf0Var = this.X;
        if (vf0Var != null) {
            vf0Var.invalidate();
        }
        org.telegram.ui.Components.sg sgVar = this.W;
        if (sgVar != null) {
            sgVar.invalidate();
        }
        e(new of0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.ks.f(this.c).n(this, org.telegram.messenger.ks.w3);
    }

    public final void e(Runnable runnable, boolean z10) {
        wf0 wf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.h1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z10 && (wf0Var = this.e0) != null && this.f0) {
            wf0Var.e();
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
        this.z0.setInterpolator(org.telegram.ui.Components.lr.h);
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
        bg0 bg0Var = this.K;
        if (bg0Var == null) {
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= bg0Var.getChildCount()) {
                r1Var = null;
                break;
            }
            View childAt = bg0Var.getChildAt(i10);
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
            bg0Var.getAdapter().g(i11);
            return;
        }
        fjVar.M1 = true;
        r1Var2.y3(fjVar, r1Var2.getCurrentMessagesGroup(), r1Var2.K2(), r1Var2.L2(), r1Var2.C2(), false);
        bg0Var.getAdapter().g(i11);
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
        org.telegram.ui.Components.ga0 ga0Var;
        bg0 bg0Var = this.K;
        if (bg0Var == null || bg0Var.getAdapter() == null || (ga0Var = this.M) == null) {
            return;
        }
        int b10 = bg0Var.getAdapter().b();
        ga0Var.i1(z10 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.g0.L(12.0f), z10);
        this.A0 = z10;
    }

    public final void o(boolean z10, float f10) {
        androidx.activity.n nVar = this.n0;
        if (nVar != null) {
            ji.e eVar = (ji.e) nVar.d;
            eVar.o3 = z10;
            eVar.invalidate();
        } else {
            org.telegram.ui.Components.sg sgVar = this.W;
            if (sgVar != null) {
                if (z10) {
                    f10 = 0.0f;
                }
                sgVar.setAlpha(f10);
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
        wf0 wf0Var = this.e0;
        if (wf0Var == null || wf0Var.getReactionsWindow() == null) {
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
        tf0 tf0Var = this.F;
        setContentView(tf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.ks.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i7 | (-1945959040);
        window.setAttributes(attributes);
        tf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(tf0Var, !org.telegram.ui.ActionBar.n6.I.q());
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

    public final void q(org.telegram.ui.Components.y60 y60Var) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        y60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        y60Var.R(this.k0, c8.i0.l(i6Var), false);
        ViewGroup viewGroup = y60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, c8.ma.c(-2.0f, -2));
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
        bg0 bg0Var = this.K;
        bg0Var.getAdapter().f();
        int b10 = bg0Var.getAdapter().b();
        this.M.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.sg s(org.telegram.ui.Components.sg sgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = sgVar;
        vf0 vf0Var = new vf0(this, getContext(), sgVar.d, this.b, sgVar, z10);
        this.X = vf0Var;
        vf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.sg sgVar2 = this.W;
        vf0 vf0Var2 = this.X;
        vf0Var2.H = sgVar2.H;
        vf0Var2.s0 = sgVar2.s0;
        vf0Var2.f0.t(sgVar2.f0.i, false, true);
        vf0Var2.g0 = sgVar2.g0;
        vf0Var2.setEmoji(sgVar2.n.f[0]);
        vf0Var2.i(sgVar2.x, sgVar2.w, true);
        vf0Var2.S.e(true, sgVar2.S.c);
        vf0Var2.F.e(true, sgVar2.F.c);
        int i7 = sgVar2.L;
        int i10 = sgVar2.M;
        vf0Var2.L = i7;
        vf0Var2.M = i10;
        float f10 = sgVar2.P;
        float f11 = sgVar2.Q;
        vf0Var2.P = f10;
        vf0Var2.Q = f11;
        this.X.S.e(true, sgVar.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(sgVar.getWidth(), sgVar.getHeight()));
        org.telegram.ui.Components.sg sgVar3 = this.W;
        sgVar.getHeight();
        this.Y = sgVar3.m();
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
            org.telegram.ui.Components.wk0.d(new org.telegram.messenger.q10() { // from class: org.telegram.ui.qf0
                @Override // org.telegram.messenger.q10
                public final void a(Object obj, Object obj2) {
                    fg0 fg0Var = fg0.this;
                    fg0Var.o(false, alpha);
                    fg0Var.e = (Bitmap) obj;
                    Paint paint = new Paint(1);
                    fg0Var.h = paint;
                    Bitmap bitmap = fg0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    fg0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    fg0Var.n = new Matrix();
                    ui.b bVar = fg0Var.j0;
                    bVar.a((Bitmap) obj2);
                    ih.d.c(bVar, fg0Var.F);
                    ViewGroup viewGroup = fg0Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            tf0 tf0Var = this.H;
            if (tf0Var != null) {
                tf0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.C0 = j3 > 0 ? new org.telegram.ui.Components.vy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o()) : null;
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
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
        this.e0.r(false);
    }

    public void m(long j3) {
    }
}
