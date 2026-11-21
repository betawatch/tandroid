package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b60 extends p51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public h6.m s;
    public final /* synthetic */ l60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(l60 l60Var, Context context) {
        super(l60Var, context);
        this.w = l60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.p51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.w;
        l60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (l60Var.y1 - l60Var.t0));
        float f10 = l60Var.j2 + l60Var.p2;
        nv0 nv0Var = l60Var.u1;
        if (nv0Var.getVisibility() != 0) {
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
        nv0Var.setTranslationY(l60Var.y1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        l60 l60Var = this.w;
        if (view != l60Var.Q1) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + l60Var.f2 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), (int) (l60Var.c2 * 255.0f)));
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d7, false), (int) (l60Var.c2 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o4);
        canvas.drawRect(0.0f, view.getY() + l60Var.f2, getMeasuredWidth(), view.getY() + l60Var.f2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.s;
        if (mVar != null) {
            ((u51) mVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.o2 && this.s == null) {
            this.s = new h6.m(view);
        }
    }
}
