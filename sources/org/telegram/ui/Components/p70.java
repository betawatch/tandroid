package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p70 extends z71 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public k6.c s;
    public final /* synthetic */ y70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(y70 y70Var, Context context) {
        super(y70Var, context);
        this.v = y70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.z71, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        y70 y70Var = this.v;
        int i11 = y70Var.y;
        i10 = ((org.telegram.ui.ActionBar.k3) y70Var).backgroundPaddingTop;
        y70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = y70Var.o0 + y70Var.u0;
        ey0 ey0Var = y70Var.s;
        if (ey0Var.getVisibility() != 0) {
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
        ey0Var.setTranslationY(y70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y70 y70Var = this.v;
        if (view != y70Var.V) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + y70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false), (int) (y70Var.h0 * 255.0f)));
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d7, false), (int) (y70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o10);
        canvas.drawRect(0.0f, view.getY() + y70Var.k0, getMeasuredWidth(), view.getY() + y70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k6.c cVar = this.s;
        if (cVar != null) {
            ((e81) cVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new k6.c(view);
        }
    }
}
