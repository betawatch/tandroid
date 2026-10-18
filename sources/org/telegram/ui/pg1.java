package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class pg1 extends org.telegram.ui.Components.c91 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ qg1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg1(qg1 qg1Var, Context context) {
        super(context, null);
        this.V = qg1Var;
        this.U = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.T) {
            Path path = this.U;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.T) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.c91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.c91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((pg0) this.V).X();
        if (X instanceof og0) {
            return ((og0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((pg0) this.V).X();
        if (X instanceof og0) {
            return ((og0) X).S(motionEvent, true);
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
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.c91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.c91
    public final void u() {
        ey eyVar;
        qg1 qg1Var = this.V;
        pg0 pg0Var = (pg0) qg1Var;
        if (pg0Var.F != null) {
            pg0Var.m0(pg0Var.c.getCurrentPosition(), true);
            pg0Var.n0(0.0f, false);
        }
        pg0Var.d0();
        pg1 pg1Var = pg0Var.c;
        if (pg1Var != null) {
            int currentPosition = pg1Var.getCurrentPosition();
            if (currentPosition != 2 && pg0Var.x) {
                pg0Var.W(2);
                pg0Var.x = false;
            }
            if (currentPosition != 3) {
                pg0Var.W(3);
            }
            Integer num = pg0Var.I;
            if (num != null && currentPosition == 0 && (eyVar = pg0Var.J) != null) {
                eyVar.u4(num.intValue());
                pg0Var.I = null;
            }
        }
        qg1Var.U();
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        qg1 qg1Var = this.V;
        pg0 pg0Var = (pg0) qg1Var;
        boolean z11 = !z10;
        if (pg0Var.F != null) {
            float positionAnimated = pg0Var.c.getPositionAnimated();
            pg0Var.n0(positionAnimated, z11);
            if (!z10) {
                pg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        pg0Var.h0();
        pg0Var.d0();
        pg0Var.b.invalidate();
        qg1Var.U();
        qg1Var.checkSystemBarColors();
    }
}
