package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o70 extends q71 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public m.g3 s;
    public final /* synthetic */ x70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(x70 x70Var, Context context) {
        super(x70Var, context);
        this.v = x70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.q71, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        x70 x70Var = this.v;
        int i11 = x70Var.y;
        i10 = ((org.telegram.ui.ActionBar.h3) x70Var).backgroundPaddingTop;
        x70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = x70Var.o0 + x70Var.u0;
        wx0 wx0Var = x70Var.s;
        if (wx0Var.getVisibility() != 0) {
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
        wx0Var.setTranslationY(x70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x70 x70Var = this.v;
        if (view != x70Var.V) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + x70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), (int) (x70Var.h0 * 255.0f)));
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d7, false), (int) (x70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o10);
        canvas.drawRect(0.0f, view.getY() + x70Var.k0, getMeasuredWidth(), view.getY() + x70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.s;
        if (g3Var != null) {
            ((v71) g3Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new m.g3(view);
        }
    }
}
