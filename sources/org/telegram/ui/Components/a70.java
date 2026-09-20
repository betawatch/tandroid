package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a70 extends a71 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public org.telegram.ui.Cells.f3 s;
    public final /* synthetic */ j70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(j70 j70Var, Context context) {
        super(j70Var, context);
        this.v = j70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.a71, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        j70 j70Var = this.v;
        int i11 = j70Var.y;
        i10 = ((org.telegram.ui.ActionBar.f3) j70Var).backgroundPaddingTop;
        j70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = j70Var.o0 + j70Var.u0;
        jx0 jx0Var = j70Var.s;
        if (jx0Var.getVisibility() != 0) {
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
        jx0Var.setTranslationY(j70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j70 j70Var = this.v;
        if (view != j70Var.V) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + j70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), (int) (j70Var.h0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false), (int) (j70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + j70Var.k0, getMeasuredWidth(), view.getY() + j70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.f3 f3Var = this.s;
        if (f3Var != null) {
            ((f71) f3Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new org.telegram.ui.Cells.f3(view);
        }
    }
}
