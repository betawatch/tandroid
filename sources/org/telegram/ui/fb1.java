package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Components.n61 {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ gb1 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(gb1 gb1Var, Context context) {
        super(context, null);
        this.b0 = gb1Var;
        this.a0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.a0;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean e(MotionEvent motionEvent) {
        Object c02 = ((ee0) this.b0).c0();
        if (c02 instanceof de0) {
            return ((de0) c02).W(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean f(MotionEvent motionEvent) {
        Object c02 = ((ee0) this.b0).c0();
        if (c02 instanceof de0) {
            return ((de0) c02).W(motionEvent, true);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.n61
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.n61
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.n61
    public final void r(View view, View view2, int i3, int i10) {
        this.b0.Z();
    }

    @Override // org.telegram.ui.Components.n61
    public final void s() {
        uw uwVar;
        gb1 gb1Var = this.b0;
        ee0 ee0Var = (ee0) gb1Var;
        if (ee0Var.G != null) {
            ee0Var.s0(ee0Var.c.getCurrentPosition(), true);
            ee0Var.t0(false, 0.0f);
        }
        ee0Var.i0();
        fb1 fb1Var = ee0Var.c;
        if (fb1Var != null) {
            int currentPosition = fb1Var.getCurrentPosition();
            if (currentPosition != 2 && ee0Var.y) {
                ee0Var.b0(2);
                ee0Var.y = false;
            }
            if (currentPosition != 3) {
                ee0Var.b0(3);
            }
            Integer num = ee0Var.J;
            if (num != null && currentPosition == 0 && (uwVar = ee0Var.K) != null) {
                uwVar.I4(num.intValue());
                ee0Var.J = null;
            }
        }
        gb1Var.Z();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        gb1 gb1Var = this.b0;
        ee0 ee0Var = (ee0) gb1Var;
        boolean z11 = !z10;
        if (ee0Var.G != null) {
            float positionAnimated = ee0Var.c.getPositionAnimated();
            ee0Var.t0(z11, positionAnimated);
            if (!z10) {
                ee0Var.s0(Math.round(positionAnimated), true);
            }
        }
        ee0Var.n0();
        ee0Var.i0();
        ee0Var.b.invalidate();
        gb1Var.Z();
        gb1Var.checkSystemBarColors();
    }
}
