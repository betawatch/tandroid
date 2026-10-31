package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d60 extends c61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public li.k s;
    public final /* synthetic */ m60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(m60 m60Var, Context context) {
        super(m60Var, context);
        this.w = m60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.c61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m60 m60Var = this.w;
        m60Var.M1.setTranslationY(org.telegram.messenger.i0.L(64.0f) + org.telegram.messenger.i0.L(6.0f) + (m60Var.u1 - m60Var.s0));
        float f7 = m60Var.f2 + m60Var.l2;
        dw0 dw0Var = m60Var.q1;
        if (dw0Var.getVisibility() != 0) {
            this.f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.r = (f7 - this.f) * 0.10666667f;
        }
        float f10 = this.f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.r;
            float f13 = f10 + f12;
            this.f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f = f11;
            } else if (f12 >= 0.0f || f13 >= f11) {
                invalidate();
            } else {
                this.f = f11;
            }
        }
        dw0Var.setTranslationY(m60Var.u1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m60 m60Var = this.w;
        if (view != m60Var.M1) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), view.getY() + m60Var.b2 + 1.0f);
        canvas.drawColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false), (int) (m60Var.Y1 * 255.0f)));
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d7, false), (int) (m60Var.Y1 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o10);
        canvas.drawRect(0.0f, view.getY() + m60Var.b2, getMeasuredWidth(), view.getY() + m60Var.b2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        li.k kVar = this.s;
        if (kVar != null) {
            ((h61) kVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.k2 && this.s == null) {
            this.s = new li.k(view);
        }
    }
}
