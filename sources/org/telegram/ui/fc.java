package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.m5 a;
    public org.telegram.ui.Components.my0 b;
    public org.telegram.ui.Components.f5 c;
    public org.telegram.ui.ActionBar.h6 d;
    public boolean e;
    public int f;

    public final void a(int i7, int i10, boolean z9) {
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r8[i10], this.d);
        } else {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            org.telegram.messenger.gp gpVar = z9 ? s12.q4 : s12.r4;
            b(gpVar != null ? gpVar.d(i10) : null);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.fp fpVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (fpVar != null) {
            this.f = fpVar.e(0, h6Var);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.s8;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var);
        } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var), org.telegram.ui.ActionBar.m6.r1(0.7f, km0.B0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var))));
        }
    }

    public final void c(long j3, boolean z9, boolean z10) {
        org.telegram.ui.Components.f5 f5Var = this.c;
        if (j3 == 0) {
            f5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            f5Var.j(j3, z10);
            this.b = null;
        }
        f5Var.m(z9, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.f5 f5Var = this.c;
        if (document == null) {
            f5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(2131752311, null), 16.0f, null);
            }
        } else {
            f5Var.i(document, false);
            this.b = null;
        }
        f5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.f5 f5Var = this.c;
        f5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.my0 my0Var = this.b;
        if (my0Var != null) {
            canvas2 = canvas;
            my0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q6, h6Var), canvas2);
        } else {
            canvas2 = canvas;
            f5Var.draw(canvas2);
        }
        if (this.e) {
            Paint d = h6Var != null ? h6Var.d("paintDivider") : org.telegram.ui.ActionBar.m6.k0;
            if (d != null) {
                canvas2.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        if (i7 <= 0) {
            m5Var.i(null);
        } else {
            m5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.d, false));
            m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.f5 f5Var = this.c;
        f5Var.setBounds((getWidth() - f5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - f5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + f5Var.s) / 2);
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
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        if (m5Var != null) {
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
