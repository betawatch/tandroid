package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ec extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.n5 a;
    public org.telegram.ui.Components.vy0 b;
    public org.telegram.ui.Components.m5 c;
    public org.telegram.ui.ActionBar.i6 d;
    public boolean e;
    public int f;

    public final void a(int i7, int i10, boolean z10) {
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.r8[i10], this.d);
        } else {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            org.telegram.messenger.cp cpVar = z10 ? u12.t4 : u12.u4;
            b(cpVar != null ? cpVar.d(i10) : null);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.bp bpVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (bpVar != null) {
            this.f = bpVar.e(0, i6Var);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.s8;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var);
        } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var), org.telegram.ui.ActionBar.n6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.n6.w0(i7, i6Var))));
        }
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.m5 m5Var = this.c;
        if (j3 == 0) {
            m5Var.g(null, z11);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(2131752300, null), 16.0f, null);
            }
        } else {
            m5Var.j(j3, z11);
            this.b = null;
        }
        m5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.m5 m5Var = this.c;
        if (document == null) {
            m5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(2131752300, null), 16.0f, null);
            }
        } else {
            m5Var.i(document, false);
            this.b = null;
        }
        m5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.m5 m5Var = this.c;
        m5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.vy0 vy0Var = this.b;
        if (vy0Var != null) {
            canvas2 = canvas;
            vy0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q6, i6Var), canvas2);
        } else {
            canvas2 = canvas;
            m5Var.draw(canvas2);
        }
        if (this.e) {
            Paint g10 = i6Var != null ? i6Var.g("paintDivider") : org.telegram.ui.ActionBar.n6.k0;
            if (g10 != null) {
                canvas2.drawLine(org.telegram.messenger.gd.a0 ? 0.0f : org.telegram.messenger.g0.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(23.0f) : 0), getMeasuredHeight() - 1, g10);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        if (i7 <= 0) {
            n5Var.i(null);
        } else {
            n5Var.i(new org.telegram.ui.ActionBar.w2(i7, getContext(), this.d, false));
            n5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.m5 m5Var = this.c;
        m5Var.setBounds((getWidth() - m5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.s) / 2);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
