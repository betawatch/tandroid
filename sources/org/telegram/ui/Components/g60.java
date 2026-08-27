package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g60 extends s51 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public org.telegram.ui.i6 s;
    public final /* synthetic */ p60 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(p60 p60Var, Context context) {
        super(p60Var, context);
        this.v = p60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.s51, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        p60 p60Var = this.v;
        int i11 = p60Var.y;
        i10 = ((org.telegram.ui.ActionBar.e3) p60Var).backgroundPaddingTop;
        p60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f10 = p60Var.k0 + p60Var.q0;
        iw0 iw0Var = p60Var.s;
        if (iw0Var.getVisibility() != 0) {
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
        iw0Var.setTranslationY(p60Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p60 p60Var = this.v;
        if (view != p60Var.R) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + p60Var.g0 + 1.0f);
        canvas.drawColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), (int) (p60Var.d0 * 255.0f)));
        int k10 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false), (int) (p60Var.d0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k10);
        canvas.drawRect(0.0f, view.getY() + p60Var.g0, getMeasuredWidth(), view.getY() + p60Var.g0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.i6 i6Var = this.s;
        if (i6Var != null) {
            ((x51) i6Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.p0 && this.s == null) {
            this.s = new org.telegram.ui.i6(view);
        }
    }
}
