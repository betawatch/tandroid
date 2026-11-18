package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y50 extends m51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public h6.m s;
    public final /* synthetic */ j60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(j60 j60Var, Context context) {
        super(j60Var, context);
        this.w = j60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.m51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j60 j60Var = this.w;
        j60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (j60Var.y1 - j60Var.t0));
        float f10 = j60Var.j2 + j60Var.p2;
        kv0 kv0Var = j60Var.u1;
        if (kv0Var.getVisibility() != 0) {
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
        kv0Var.setTranslationY(j60Var.y1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j60 j60Var = this.w;
        if (view != j60Var.Q1) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + j60Var.f2 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false), (int) (j60Var.c2 * 255.0f)));
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d7, false), (int) (j60Var.c2 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o4);
        canvas.drawRect(0.0f, view.getY() + j60Var.f2, getMeasuredWidth(), view.getY() + j60Var.f2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.s;
        if (mVar != null) {
            ((r51) mVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.o2 && this.s == null) {
            this.s = new h6.m(view);
        }
    }
}
