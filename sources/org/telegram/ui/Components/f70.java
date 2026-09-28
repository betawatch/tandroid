package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class f70 extends b71 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public n7.z0 s;
    public final /* synthetic */ o70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(o70 o70Var, Context context) {
        super(o70Var, context);
        this.v = o70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.b71, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        o70 o70Var = this.v;
        int i11 = o70Var.y;
        i10 = ((org.telegram.ui.ActionBar.e3) o70Var).backgroundPaddingTop;
        o70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = o70Var.o0 + o70Var.u0;
        kx0 kx0Var = o70Var.s;
        if (kx0Var.getVisibility() != 0) {
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
        kx0Var.setTranslationY(o70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o70 o70Var = this.v;
        if (view != o70Var.V) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + o70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false), (int) (o70Var.h0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d7, false), (int) (o70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + o70Var.k0, getMeasuredWidth(), view.getY() + o70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.s;
        if (z0Var != null) {
            ((g71) z0Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new n7.z0(view);
        }
    }
}
