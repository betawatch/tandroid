package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o60 extends d61 {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public oc.i s;
    public final /* synthetic */ x60 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(x60 x60Var, Context context) {
        super(x60Var, context);
        this.v = x60Var;
        this.n = new Paint();
    }

    @Override // org.telegram.ui.Components.d61, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        x60 x60Var = this.v;
        int i11 = x60Var.y;
        i10 = ((org.telegram.ui.ActionBar.f3) x60Var).backgroundPaddingTop;
        x60Var.R.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f9 = x60Var.k0 + x60Var.q0;
        qw0 qw0Var = x60Var.s;
        if (qw0Var.getVisibility() != 0) {
            this.f = f9;
            this.h = f9;
        } else if (this.h != f9) {
            this.h = f9;
            this.r = (f9 - this.f) * 0.10666667f;
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
        qw0Var.setTranslationY(x60Var.y + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x60 x60Var = this.v;
        if (view != x60Var.R) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + x60Var.g0 + 1.0f);
        canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), (int) (x60Var.d0 * 255.0f)));
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false), (int) (x60Var.d0 * 255.0f));
        Paint paint = this.n;
        paint.setColor(k9);
        canvas.drawRect(0.0f, view.getY() + x60Var.g0, getMeasuredWidth(), view.getY() + x60Var.g0 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.i iVar = this.s;
        if (iVar != null) {
            ((i61) iVar.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.v.p0 && this.s == null) {
            this.s = new oc.i(view);
        }
    }
}
