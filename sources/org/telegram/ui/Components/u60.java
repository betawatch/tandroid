package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u60 extends o61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public n7.qa s;
    public final /* synthetic */ d70 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(d70 d70Var, Context context) {
        super(d70Var, context);
        this.v = d70Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.o61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        d70 d70Var = this.v;
        int i11 = d70Var.y;
        i10 = ((org.telegram.ui.ActionBar.g3) d70Var).backgroundPaddingTop;
        d70Var.S.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = d70Var.l0 + d70Var.r0;
        zw0 zw0Var = d70Var.s;
        if (zw0Var.getVisibility() != 0) {
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
        zw0Var.setTranslationY(d70Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d70 d70Var = this.v;
        if (view != d70Var.S) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + d70Var.h0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), (int) (d70Var.e0 * 255.0f)));
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false), (int) (d70Var.e0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + d70Var.h0, getMeasuredWidth(), view.getY() + d70Var.h0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n7.qa qaVar = this.s;
        if (qaVar != null) {
            ((t61) qaVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.q0 && this.s == null) {
            this.s = new n7.qa(view);
        }
    }
}
