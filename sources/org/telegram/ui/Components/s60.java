package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s60 extends n61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public n7.a1 s;
    public final /* synthetic */ b70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(b70 b70Var, Context context) {
        super(b70Var, context);
        this.v = b70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.n61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        b70 b70Var = this.v;
        int i11 = b70Var.y;
        i10 = ((org.telegram.ui.ActionBar.g3) b70Var).backgroundPaddingTop;
        b70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = b70Var.o0 + b70Var.u0;
        zw0 zw0Var = b70Var.s;
        if (zw0Var.getVisibility() != 0) {
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
        zw0Var.setTranslationY(b70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        b70 b70Var = this.v;
        if (view != b70Var.V) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + b70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), (int) (b70Var.h0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false), (int) (b70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + b70Var.k0, getMeasuredWidth(), view.getY() + b70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.a1 a1Var = this.s;
        if (a1Var != null) {
            ((s61) a1Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new n7.a1(view);
        }
    }
}
