package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q70 extends a81 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public k6.c s;
    public final /* synthetic */ z70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(z70 z70Var, Context context) {
        super(z70Var, context);
        this.v = z70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.a81, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        z70 z70Var = this.v;
        int i11 = z70Var.y;
        i10 = ((org.telegram.ui.ActionBar.k3) z70Var).backgroundPaddingTop;
        z70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = z70Var.o0 + z70Var.u0;
        fy0 fy0Var = z70Var.s;
        if (fy0Var.getVisibility() != 0) {
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
        fy0Var.setTranslationY(z70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z70 z70Var = this.v;
        if (view != z70Var.V) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + z70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false), (int) (z70Var.h0 * 255.0f)));
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d7, false), (int) (z70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o10);
        canvas.drawRect(0.0f, view.getY() + z70Var.k0, getMeasuredWidth(), view.getY() + z70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k6.c cVar = this.s;
        if (cVar != null) {
            ((f81) cVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new k6.c(view);
        }
    }
}
