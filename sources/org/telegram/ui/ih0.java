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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class ih0 extends Dialog implements org.telegram.messenger.vs {
    public float D;
    public final wg0 E;
    public final dh0 F;
    public final wg0 G;
    public long H;
    public org.telegram.ui.Components.d5 I;
    public final eh0 J;
    public final vg0 K;
    public final jg.g1 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.q1 P;
    public int Q;
    public org.telegram.ui.Components.se R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.fd U;
    public org.telegram.ui.Components.zf V;
    public yg0 W;
    public int X;
    public ViewGroup Y;
    public final xg0 Z;
    public final Context a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public float b0;
    public final int c;
    public FrameLayout c0;
    public i0.c d;
    public zg0 d0;
    public Bitmap e;
    public boolean e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public final nh.h h0;
    public final hi.b i0;
    public final tg.b j0;
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
    public org.telegram.ui.Components.rz0 x0;
    public boolean y;
    public Paint y0;

    public ih0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = org.telegram.messenger.e20.s0;
        this.c = i10;
        this.d = i0.c.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        final int i11 = 1;
        this.S = new Paint(1);
        this.n0 = new int[2];
        final int i12 = 0;
        this.p0 = false;
        this.t0 = new Rect();
        this.a = context;
        this.b = p6Var;
        org.telegram.messenger.i0.S(getWindow());
        wg0 wg0Var = new wg0(this, context, i11);
        this.E = wg0Var;
        this.h0 = nh.h.d(1, wg0Var, wg0Var);
        wg0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tg0
            public final /* synthetic */ ih0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        wg0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.ug0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                ih0 ih0Var = ih0.this;
                if (ih0Var.o0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.i0.v1(ih0Var.R);
                org.telegram.messenger.i0.h3(new rg0(ih0Var, (EditText) view2, 0), 200L);
            }
        });
        hi.b bVar = new hi.b();
        this.i0 = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.j0 = bVar2;
        bVar2.h = new zg.h(wg0Var);
        bVar2.i = wg0Var;
        dh0 dh0Var = new dh0(this, context, p6Var);
        this.F = dh0Var;
        dh0Var.setClipToPadding(false);
        wg0Var.addView(dh0Var, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        e eVar = new e(this, 25);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(wg0Var, eVar);
        eh0 eh0Var = new eh0(this, context, p6Var);
        this.J = eh0Var;
        eh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.tg0
            public final /* synthetic */ ih0 b;

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
        eh0Var.setOnItemClickListener(new g(this, 17));
        eh0Var.setOnScrollListener(new h3(this, 19));
        eh0Var.setItemAnimator(new gh0(null, eh0Var, p6Var));
        jg.g1 g1Var = new jg.g1(this, 2);
        this.L = g1Var;
        g1Var.O = new jg.h1(this, 7);
        eh0Var.setLayoutManager(g1Var);
        eh0Var.i(new dh.g(10));
        vg0 vg0Var = new vg0(this, context, p6Var, i12);
        this.K = vg0Var;
        eh0Var.setAdapter(vg0Var);
        eh0Var.setVerticalScrollBarEnabled(false);
        eh0Var.setOverScrollMode(2);
        dh0Var.addView(eh0Var, w7.b6.c(-2.0f, -1));
        wg0 wg0Var2 = new wg0(this, context, i12);
        this.G = wg0Var2;
        wg0Var.addView(wg0Var2, w7.b6.c(-1.0f, -1));
        this.Z = new xg0(this, wg0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        sg.w wVar;
        if (this.d0 != null || k2Var == null) {
            return;
        }
        int i10 = this.c;
        org.telegram.messenger.wp.r1(i10).E0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.c0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.c0.setClipToPadding(false);
        this.c0.setPadding(0, 0, 0, org.telegram.messenger.i0.L(24.0f));
        zg0 zg0Var = new zg0(5, this.c, getContext(), null, this.b);
        this.d0 = zg0Var;
        zg0Var.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(22.0f));
        this.d0.setDelegate(new bh0(this, k2Var));
        this.d0.setTop(false);
        this.d0.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setVisibility(0);
        this.d0.setHint(org.telegram.messenger.dd.L0(2131754443, null));
        this.d0.setBubbleOffset(org.telegram.messenger.i0.L(-25.0f));
        this.d0.setMiniBubblesOffset(org.telegram.messenger.i0.L(2.0f));
        this.F.addView(this.c0, w7.b6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.c0.addView(this.d0, w7.b6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.setScaleY(0.4f);
        this.d0.setScaleX(0.4f);
        this.d0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.wp.r1(i10).i8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.u3);
        } else {
            s();
        }
        zg0 zg0Var2 = this.d0;
        if (zg0Var2 != null && !zg0Var2.g1) {
            zg0Var2.g1 = true;
            zg0Var2.h1 = true;
            sg.b0 b0Var = zg0Var2.x0;
            if (b0Var != null && (wVar = b0Var.m) != null && !wVar.L1) {
                wVar.L1 = true;
                wVar.M1 = true;
                e21 e21Var = wVar.h0;
                if (e21Var != null) {
                    e21Var.invalidate();
                }
                t11 t11Var = wVar.i0;
                if (t11Var != null) {
                    t11Var.invalidate();
                }
            }
        }
        new vh.r2(this.E, false, new s3(this, 12));
    }

    public final void d(Runnable runnable, boolean z10) {
        zg0 zg0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.k1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        if (!z10 && (zg0Var = this.d0) != null && this.e0) {
            zg0Var.e();
            if (this.d0.getReactionsWindow() != null && this.d0.getReactionsWindow().a != null) {
                this.d0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.d0.animate().alpha(0.01f).translationY(-org.telegram.messenger.i0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z10;
        this.J.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z10 ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(8, this, z11));
        this.u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.u0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.u0.setDuration(350L);
        this.u0.start();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i10 != org.telegram.messenger.at.u3 || (messages_availableeffects = org.telegram.messenger.wp.r1(this.c).i8) == null || messages_availableeffects.effects.isEmpty()) {
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
        yg0 yg0Var = this.W;
        if (yg0Var != null) {
            yg0Var.invalidate();
        }
        org.telegram.ui.Components.zf zfVar = this.V;
        if (zfVar != null) {
            zfVar.invalidate();
        }
        d(new qg0(this, 2), false);
        this.E.invalidate();
        org.telegram.messenger.at.f(this.c).n(this, org.telegram.messenger.at.u3);
    }

    public final void e(org.telegram.messenger.kj kjVar) {
        org.telegram.messenger.fj k10 = k(kjVar);
        if (k10 == null) {
            f(kjVar);
            return;
        }
        k10.a();
        ArrayList arrayList = k10.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f((org.telegram.messenger.kj) obj);
        }
    }

    public final void f(org.telegram.messenger.kj kjVar) {
        org.telegram.ui.Cells.q1 q1Var;
        eh0 eh0Var = this.J;
        if (eh0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= eh0Var.getChildCount()) {
                q1Var = null;
                break;
            }
            View childAt = eh0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == kjVar) {
                    break;
                }
            }
            i11++;
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == kjVar) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (q1Var2 == null) {
            eh0Var.getAdapter().g(i12);
            return;
        }
        kjVar.K1 = true;
        q1Var2.s3(kjVar, q1Var2.getCurrentMessagesGroup(), q1Var2.E2(), q1Var2.F2(), q1Var2.x2(), false);
        eh0Var.getAdapter().g(i12);
    }

    public final void g(boolean z10) {
        this.r = z10;
        dismiss();
    }

    public final void h() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        nh.h.f(false);
        nh.h hVar = this.h0;
        if (hVar != null) {
            hVar.b(this.E);
        }
        super.dismiss();
        org.telegram.messenger.at.f(this.c).n(this, org.telegram.messenger.at.u3);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.x0 == null || this.y0 == null) {
            return;
        }
        float f13 = (f7 + f11) / 2.0f;
        float f14 = (f10 + f12) / 2.0f;
        float L = org.telegram.messenger.i0.L(28.0f) + this.x0.c;
        float L2 = org.telegram.messenger.i0.L(32.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        float f15 = L / 2.0f;
        float f16 = f13 - f15;
        float f17 = L2 / 2.0f;
        rectF.set(f16, f14 - f17, f13 + f15, f14 + f17);
        canvas.save();
        canvas.drawRoundRect(rectF, f17, f17, this.y0);
        this.x0.c(f16 + org.telegram.messenger.i0.L(14.0f), f14, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.p0;
    }

    public final long j() {
        org.telegram.messenger.kj messageObject;
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

    public final org.telegram.messenger.fj k(org.telegram.messenger.kj kjVar) {
        if (kjVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.O.f(kjVar.d1());
        if (fjVar == null || (fjVar.d.size() > 1 && fjVar.d(kjVar) != null)) {
            return fjVar;
        }
        return null;
    }

    public final void m(boolean z10) {
        jg.g1 g1Var;
        eh0 eh0Var = this.J;
        if (eh0Var == null || eh0Var.getAdapter() == null || (g1Var = this.L) == null) {
            return;
        }
        int b10 = eh0Var.getAdapter().b();
        g1Var.i1(z10 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.i0.L(12.0f), z10);
        this.v0 = z10;
    }

    public final void n(long j10) {
        TLRPC.TL_availableEffect Y0;
        this.H = j10;
        boolean i10 = this.O.i();
        ArrayList arrayList = this.M;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        org.telegram.messenger.kj kjVar = (size < 0 || size >= arrayList.size()) ? null : (org.telegram.messenger.kj) arrayList.get(size);
        if (kjVar != null) {
            TLRPC.Message message = kjVar.k;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.d0 == null || (Y0 = org.telegram.messenger.wp.r1(this.c).Y0(j10)) == null) {
            return;
        }
        this.d0.setSelectedReactionAnimated(sg.o0.e(Y0));
    }

    public final void o(org.telegram.ui.Components.z60 z60Var) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        z60Var.R(this.j0, w7.b9.k(p6Var), false);
        ViewGroup viewGroup = z60Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, w7.b6.c(-2.0f, -2));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.a0) {
            org.telegram.messenger.i0.v1(getCurrentFocus());
            this.a0 = false;
            return;
        }
        zg0 zg0Var = this.d0;
        if (zg0Var == null || zg0Var.getReactionsWindow() == null) {
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
        wg0 wg0Var = this.E;
        setContentView(wg0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.at.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        wg0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(wg0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.fj fjVar;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
            if (i12 >= size) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i12);
            if (kjVar.z2()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) hVar.f(kjVar.e1());
                if (fjVar2 == null) {
                    fjVar2 = new org.telegram.messenger.fj();
                    fjVar2.n = false;
                    long d12 = kjVar.d1();
                    fjVar2.a = d12;
                    hVar.k(fjVar2, d12);
                }
                ArrayList arrayList3 = fjVar2.d;
                if (fjVar2.d(kjVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList3.size()) {
                            arrayList3.add(kjVar);
                            break;
                        } else if (((org.telegram.messenger.kj) arrayList3.get(i13)).f1() == kjVar.f1()) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else if (kjVar.e1() != 0) {
                kjVar.k.grouped_id = 0L;
                kjVar.e = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((org.telegram.messenger.fj) hVar.n(i14)).a();
        }
        ArrayList arrayList4 = this.M;
        arrayList4.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList4.size()) {
            int i16 = this.N;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList4.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.w0 == null) {
                    this.w0 = new org.telegram.ui.Cells.q1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.w0;
                q1Var2.d6 = false;
                q1Var2.f6 = false;
                q1Var2.g6 = false;
                q1Var2.h6 = false;
                q1Var2.i6 = false;
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) hVar.f(kjVar2.d1());
                ag.c2 c2Var = q1Var2.T0;
                c2Var.o0 = true;
                ImageReceiver imageReceiver = q1Var2.y7;
                imageReceiver.o0 = true;
                ImageReceiver imageReceiver2 = q1Var2.R7;
                imageReceiver2.o0 = true;
                ImageReceiver imageReceiver3 = q1Var2.D7;
                imageReceiver3.o0 = true;
                if (fjVar3 != null) {
                    ArrayList arrayList5 = fjVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != fjVar3.f.size()) {
                            fjVar3.a();
                        }
                        q1Var2.Rc = 0;
                        int i17 = 0;
                        i11 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) arrayList5.get(i17);
                            org.telegram.messenger.cj d = fjVar3.d(kjVar3);
                            if (d == null || (d.l & 4) == 0) {
                                org.telegram.messenger.fj fjVar4 = fjVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                fjVar = fjVar4;
                            } else {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                fjVar = fjVar3;
                                q1Var3.r3(kjVar3, fjVar, false, false, false, false);
                                q1Var = q1Var3;
                                i11 += q1Var.Z6;
                            }
                            i17++;
                            org.telegram.messenger.fj fjVar5 = fjVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            fjVar3 = fjVar5;
                        }
                        i10 = i15;
                    }
                }
                i10 = i15;
                q1Var2.r3(kjVar2, fjVar3, false, false, false, false);
                c2Var.o0 = false;
                imageReceiver.o0 = false;
                imageReceiver2.o0 = false;
                imageReceiver3.o0 = false;
                q1Var2.L3();
                i11 = q1Var2.Z6;
            }
            this.N = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        eh0 eh0Var = this.J;
        eh0Var.getAdapter().f();
        int b10 = eh0Var.getAdapter().b();
        this.L.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.i0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.zf q(org.telegram.ui.Components.zf zfVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = zfVar;
        int[] iArr = this.n0;
        zfVar.getLocationOnScreen(iArr);
        yg0 yg0Var = new yg0(this, getContext(), zfVar.b, this.b, zfVar, z10);
        this.W = yg0Var;
        yg0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.zf zfVar2 = this.V;
        yg0 yg0Var2 = this.W;
        yg0Var2.E = zfVar2.E;
        yg0Var2.h0 = zfVar2.h0;
        yg0Var2.c0.t(zfVar2.c0.i, false, true);
        yg0Var2.d0 = zfVar2.d0;
        yg0Var2.setEmoji(zfVar2.f.f[0]);
        yg0Var2.i(zfVar2.s, zfVar2.r, true);
        yg0Var2.P.e(true, zfVar2.P.c);
        yg0Var2.y.e(true, zfVar2.y.c);
        int i10 = zfVar2.I;
        int i11 = zfVar2.J;
        yg0Var2.I = i10;
        yg0Var2.J = i11;
        float f7 = zfVar2.M;
        float f10 = zfVar2.N;
        yg0Var2.M = f7;
        yg0Var2.N = f10;
        this.W.P.e(true, zfVar.P.c);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(zfVar.getWidth(), zfVar.getHeight()));
        org.telegram.ui.Components.zf zfVar3 = this.V;
        zfVar.getHeight();
        this.X = zfVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.zf zfVar4 = this.V;
        zfVar.getHeight();
        iArr[0] = org.telegram.messenger.a30.D(6.0f, width - zfVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.x0 = j10 > 0 ? new org.telegram.ui.Components.rz0(rh.h8.a1(false, org.telegram.messenger.dd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.i0.o()) : null;
        if (this.y0 == null) {
            Paint paint = new Paint(1);
            this.y0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.K.f();
                return;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
            if (kjVar != null && (message = kjVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    public final void s() {
        if (this.e0) {
            return;
        }
        this.f0 = false;
        this.e0 = true;
        this.d0.p(null, null, true);
        this.d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        this.d0.r(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            nh.h.f(true);
            super.show();
            final float alpha = this.V.getAlpha();
            org.telegram.ui.Components.zf zfVar = this.V;
            if (zfVar != null) {
                zfVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.ol0.d(new org.telegram.messenger.k20() { // from class: org.telegram.ui.sg0
                @Override // org.telegram.messenger.k20
                public final void a(Object obj, Object obj2) {
                    ih0 ih0Var = ih0.this;
                    hi.b bVar = ih0Var.i0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.zf zfVar2 = ih0Var.V;
                    if (zfVar2 != null) {
                        zfVar2.setAlpha(alpha);
                    }
                    ih0Var.e = bitmap;
                    Paint paint = new Paint(1);
                    ih0Var.h = paint;
                    Bitmap bitmap3 = ih0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    ih0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    ih0Var.n = new Matrix();
                    bVar.a(bitmap2);
                    yg.d.c(bVar, ih0Var.E);
                    ViewGroup viewGroup = ih0Var.Y;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            wg0 wg0Var = this.G;
            if (wg0Var != null) {
                wg0Var.bringToFront();
            }
            d(null, true);
        }
    }

    public void l(long j10) {
    }
}
