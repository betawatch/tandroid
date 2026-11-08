package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public org.telegram.ui.ActionBar.k5 a;
    public org.telegram.ui.Components.my0 b;
    public org.telegram.ui.Components.g5 c;
    public org.telegram.ui.ActionBar.f6 d;
    public boolean e;
    public int f;

    public final void a(int i7, int i10, boolean z9) {
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i10], this.d);
        } else {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            org.telegram.messenger.gp gpVar = z9 ? s12.q4 : s12.r4;
            b(gpVar != null ? gpVar.d(i10) : null);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.fp fpVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (fpVar != null) {
            this.f = fpVar.e(0, f6Var);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.s8;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, f6Var);
        } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var), org.telegram.ui.ActionBar.k6.r1(0.7f, hm0.B0(org.telegram.ui.ActionBar.k6.w0(i7, f6Var))));
        }
    }

    public final void c(long j3, boolean z9, boolean z10) {
        org.telegram.ui.Components.g5 g5Var = this.c;
        if (j3 == 0) {
            g5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.j(j3, z10);
            this.b = null;
        }
        g5Var.m(z9, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.g5 g5Var = this.c;
        if (document == null) {
            g5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            g5Var.i(document, false);
            this.b = null;
        }
        g5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.my0 my0Var = this.b;
        if (my0Var != null) {
            canvas2 = canvas;
            my0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q6, f6Var), canvas2);
        } else {
            canvas2 = canvas;
            g5Var.draw(canvas2);
        }
        if (this.e) {
            Paint d = f6Var != null ? f6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d != null) {
                canvas2.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        if (i7 <= 0) {
            k5Var.i(null);
        } else {
            k5Var.i(new org.telegram.ui.ActionBar.u2(i7, getContext(), this.d, false));
            k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.g5 g5Var = this.c;
        g5Var.setBounds((getWidth() - g5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.s) / 2);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        if (k5Var != null) {
            k5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
