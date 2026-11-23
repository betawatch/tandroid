package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y50 extends o51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public h6.m s;
    public final /* synthetic */ i60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(i60 i60Var, Context context) {
        super(i60Var, context);
        this.w = i60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.o51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i60 i60Var = this.w;
        i60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (i60Var.y1 - i60Var.t0));
        float f10 = i60Var.j2 + i60Var.p2;
        mv0 mv0Var = i60Var.u1;
        if (mv0Var.getVisibility() != 0) {
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
        mv0Var.setTranslationY(i60Var.y1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        i60 i60Var = this.w;
        if (view != i60Var.Q1) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + i60Var.f2 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false), (int) (i60Var.c2 * 255.0f)));
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d7, false), (int) (i60Var.c2 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o4);
        canvas.drawRect(0.0f, view.getY() + i60Var.f2, getMeasuredWidth(), view.getY() + i60Var.f2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.s;
        if (mVar != null) {
            ((t51) mVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.o2 && this.s == null) {
            this.s = new h6.m(view);
        }
    }
}
