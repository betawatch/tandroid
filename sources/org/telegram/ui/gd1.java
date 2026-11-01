package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gd1 extends org.telegram.ui.Components.x71 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ hd1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd1(hd1 hd1Var, Context context) {
        super(context, null);
        this.a0 = hd1Var;
        this.W = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.i0.N(24.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, org.telegram.messenger.i0.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.V) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.x71
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.x71
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.x71
    public final boolean j(MotionEvent motionEvent) {
        Object c02 = ((of0) this.a0).c0();
        if (c02 instanceof nf0) {
            return ((nf0) c02).X(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.x71
    public final boolean k(MotionEvent motionEvent) {
        Object c02 = ((of0) this.a0).c0();
        if (c02 instanceof nf0) {
            return ((nf0) c02).X(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.x71
    public final void t(View view, View view2, int i10, int i11) {
        this.a0.Z();
    }

    @Override // org.telegram.ui.Components.x71
    public final void u() {
        zx zxVar;
        hd1 hd1Var = this.a0;
        of0 of0Var = (of0) hd1Var;
        if (of0Var.F != null) {
            of0Var.s0(of0Var.c.getCurrentPosition(), true);
            of0Var.t0(false, 0.0f);
        }
        of0Var.i0();
        gd1 gd1Var = of0Var.c;
        if (gd1Var != null) {
            int currentPosition = gd1Var.getCurrentPosition();
            if (currentPosition != 2 && of0Var.y) {
                of0Var.b0(2);
                of0Var.y = false;
            }
            if (currentPosition != 3) {
                of0Var.b0(3);
            }
            Integer num = of0Var.I;
            if (num != null && currentPosition == 0 && (zxVar = of0Var.J) != null) {
                zxVar.I4(num.intValue());
                of0Var.I = null;
            }
        }
        hd1Var.Z();
    }

    @Override // org.telegram.ui.Components.x71
    public final void w(boolean z10) {
        hd1 hd1Var = this.a0;
        of0 of0Var = (of0) hd1Var;
        boolean z11 = !z10;
        if (of0Var.F != null) {
            float positionAnimated = of0Var.c.getPositionAnimated();
            of0Var.t0(z11, positionAnimated);
            if (!z10) {
                of0Var.s0(Math.round(positionAnimated), true);
            }
        }
        of0Var.n0();
        of0Var.i0();
        of0Var.b.invalidate();
        hd1Var.Z();
        hd1Var.checkSystemBarColors();
    }
}
