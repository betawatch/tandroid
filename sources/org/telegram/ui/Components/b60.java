package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b60 extends q51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public org.telegram.ui.Cells.e3 s;
    public final /* synthetic */ k60 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(k60 k60Var, Context context) {
        super(k60Var, context);
        this.v = k60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.q51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        k60 k60Var = this.v;
        int i10 = k60Var.y;
        i9 = ((org.telegram.ui.ActionBar.f3) k60Var).backgroundPaddingTop;
        k60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i10 - i9));
        float f10 = k60Var.k0 + k60Var.q0;
        gw0 gw0Var = k60Var.s;
        if (gw0Var.getVisibility() != 0) {
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
        gw0Var.setTranslationY(k60Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        k60 k60Var = this.v;
        if (view != k60Var.R) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + k60Var.g0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), (int) (k60Var.d0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d7, false), (int) (k60Var.d0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + k60Var.g0, getMeasuredWidth(), view.getY() + k60Var.g0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Cells.e3 e3Var = this.s;
        if (e3Var != null) {
            ((v51) e3Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.p0 && this.s == null) {
            this.s = new org.telegram.ui.Cells.e3(view);
        }
    }
}
