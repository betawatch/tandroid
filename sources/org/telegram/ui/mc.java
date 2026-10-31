package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 a;
    public org.telegram.ui.Components.qz0 b;
    public org.telegram.ui.Components.d5 c;
    public org.telegram.ui.ActionBar.p6 d;
    public boolean e;
    public int f;

    public final void a(int i10, int i11, boolean z10) {
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r8[i11], this.d);
        } else {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            org.telegram.messenger.lp lpVar = z10 ? r12.r4 : r12.s4;
            b(lpVar != null ? lpVar.d(i11) : null);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.kp kpVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (kpVar != null) {
            this.f = kpVar.e(0, p6Var);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.s8;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var);
        } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var), org.telegram.ui.ActionBar.t6.r1(0.7f, tn0.A0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var))));
        }
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.d5 d5Var = this.c;
        if (j10 == 0) {
            d5Var.g(null, z11);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.L0(2131752311, null), 16.0f, null);
            }
        } else {
            d5Var.j(j10, z11);
            this.b = null;
        }
        d5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.d5 d5Var = this.c;
        if (document == null) {
            d5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.L0(2131752311, null), 16.0f, null);
            }
        } else {
            d5Var.i(document, false);
            this.b = null;
        }
        d5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.qz0 qz0Var = this.b;
        if (qz0Var != null) {
            canvas2 = canvas;
            qz0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q6, p6Var), canvas2);
        } else {
            canvas2 = canvas;
            d5Var.draw(canvas2);
        }
        if (this.e) {
            Paint d = p6Var != null ? p6Var.d("paintDivider") : org.telegram.ui.ActionBar.t6.k0;
            if (d != null) {
                canvas2.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        if (i10 <= 0) {
            u5Var.i(null);
        } else {
            u5Var.i(new org.telegram.ui.ActionBar.y2(i10, getContext(), this.d, false));
            u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.d5 d5Var = this.c;
        d5Var.setBounds((getWidth() - d5Var.s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        if (u5Var != null) {
            u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
