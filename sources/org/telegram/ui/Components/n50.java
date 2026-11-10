package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n50 extends a51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public h6.m s;
    public final /* synthetic */ x50 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.w = x50Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.a51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.w;
        x50Var.P1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (x50Var.x1 - x50Var.s0));
        float f10 = x50Var.i2 + x50Var.o2;
        bv0 bv0Var = x50Var.t1;
        if (bv0Var.getVisibility() != 0) {
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
        bv0Var.setTranslationY(x50Var.x1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x50 x50Var = this.w;
        if (view != x50Var.P1) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + x50Var.e2 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), (int) (x50Var.b2 * 255.0f)));
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d7, false), (int) (x50Var.b2 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o4);
        canvas.drawRect(0.0f, view.getY() + x50Var.e2, getMeasuredWidth(), view.getY() + x50Var.e2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.s;
        if (mVar != null) {
            ((f51) mVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.n2 && this.s == null) {
            this.s = new h6.m(view);
        }
    }
}
