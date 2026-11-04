package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k50 extends t41 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public k4.j s;
    public final /* synthetic */ t50 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(t50 t50Var, Context context) {
        super(t50Var, context);
        this.w = t50Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.t41, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        t50 t50Var = this.w;
        t50Var.N1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (t50Var.v1 - t50Var.t0));
        float f10 = t50Var.g2 + t50Var.m2;
        zu0 zu0Var = t50Var.r1;
        if (zu0Var.getVisibility() != 0) {
            this.f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.r = (f10 - this.f) * 0.10666667f;
        }
        float f11 = this.f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.r;
            float f14 = f11 + f13;
            this.f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f = f12;
            } else if (f13 >= 0.0f || f14 >= f12) {
                invalidate();
            } else {
                this.f = f12;
            }
        }
        zu0Var.setTranslationY(t50Var.v1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t50 t50Var = this.w;
        if (view != t50Var.N1) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + t50Var.c2 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), (int) (t50Var.Z1 * 255.0f)));
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d7, false), (int) (t50Var.Z1 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o10);
        canvas.drawRect(0.0f, view.getY() + t50Var.c2, getMeasuredWidth(), view.getY() + t50Var.c2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k4.j jVar = this.s;
        if (jVar != null) {
            ((y41) jVar.a).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.l2 && this.s == null) {
            this.s = new k4.j(view);
        }
    }
}
