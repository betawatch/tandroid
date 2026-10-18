package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        Object X = ((og0) this.V).X();
        if (X instanceof ng0) {
            return ((ng0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.c91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((og0) this.V).X();
        if (X instanceof ng0) {
            return ((ng0) X).S(motionEvent, true);
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
        og0 og0Var = (og0) qg1Var;
        if (og0Var.F != null) {
            og0Var.m0(og0Var.c.getCurrentPosition(), true);
            og0Var.n0(0.0f, false);
        }
        og0Var.d0();
        pg1 pg1Var = og0Var.c;
        if (pg1Var != null) {
            int currentPosition = pg1Var.getCurrentPosition();
            if (currentPosition != 2 && og0Var.x) {
                og0Var.W(2);
                og0Var.x = false;
            }
            if (currentPosition != 3) {
                og0Var.W(3);
            }
            Integer num = og0Var.I;
            if (num != null && currentPosition == 0 && (eyVar = og0Var.J) != null) {
                eyVar.u4(num.intValue());
                og0Var.I = null;
            }
        }
        qg1Var.U();
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        qg1 qg1Var = this.V;
        og0 og0Var = (og0) qg1Var;
        boolean z11 = !z10;
        if (og0Var.F != null) {
            float positionAnimated = og0Var.c.getPositionAnimated();
            og0Var.n0(positionAnimated, z11);
            if (!z10) {
                og0Var.m0(Math.round(positionAnimated), true);
            }
        }
        og0Var.h0();
        og0Var.d0();
        og0Var.b.invalidate();
        qg1Var.U();
        qg1Var.checkSystemBarColors();
    }
}
