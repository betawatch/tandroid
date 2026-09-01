package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v60 extends q61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public n7.qa s;
    public final /* synthetic */ e70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(e70 e70Var, Context context) {
        super(e70Var, context);
        this.v = e70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.q61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        e70 e70Var = this.v;
        int i11 = e70Var.y;
        i10 = ((org.telegram.ui.ActionBar.h3) e70Var).backgroundPaddingTop;
        e70Var.S.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = e70Var.l0 + e70Var.r0;
        ax0 ax0Var = e70Var.s;
        if (ax0Var.getVisibility() != 0) {
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
        ax0Var.setTranslationY(e70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        e70 e70Var = this.v;
        if (view != e70Var.S) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + e70Var.h0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false), (int) (e70Var.e0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d7, false), (int) (e70Var.e0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + e70Var.h0, getMeasuredWidth(), view.getY() + e70Var.h0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.qa qaVar = this.s;
        if (qaVar != null) {
            ((v61) qaVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.q0 && this.s == null) {
            this.s = new n7.qa(view);
        }
    }
}
