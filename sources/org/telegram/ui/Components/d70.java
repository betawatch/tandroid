package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d70 extends z61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public n7.z0 s;
    public final /* synthetic */ m70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(m70 m70Var, Context context) {
        super(m70Var, context);
        this.v = m70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.z61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        m70 m70Var = this.v;
        int i11 = m70Var.y;
        i10 = ((org.telegram.ui.ActionBar.e3) m70Var).backgroundPaddingTop;
        m70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = m70Var.o0 + m70Var.u0;
        ix0 ix0Var = m70Var.s;
        if (ix0Var.getVisibility() != 0) {
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
        ix0Var.setTranslationY(m70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        m70 m70Var = this.v;
        if (view != m70Var.V) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + m70Var.k0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false), (int) (m70Var.h0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d7, false), (int) (m70Var.h0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + m70Var.k0, getMeasuredWidth(), view.getY() + m70Var.k0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.z0 z0Var = this.s;
        if (z0Var != null) {
            ((e71) z0Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.t0 && this.s == null) {
            this.s = new n7.z0(view);
        }
    }
}
