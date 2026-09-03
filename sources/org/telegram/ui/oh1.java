package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oh1 extends org.telegram.ui.Components.l81 {
    public boolean Q;
    public final Path R;
    public final /* synthetic */ ph1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh1(ph1 ph1Var, Context context) {
        super(context, null);
        this.S = ph1Var;
        this.R = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q) {
            Path path = this.R;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.Q) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.l81
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.l81
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.l81
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((wg0) this.S).X();
        if (X instanceof vg0) {
            return ((vg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l81
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((wg0) this.S).X();
        if (X instanceof vg0) {
            return ((vg0) X).S(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z4) {
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        invalidate();
    }

    @Override // org.telegram.ui.Components.l81
    public final void t(View view, View view2, int i10, int i11) {
        this.S.U();
    }

    @Override // org.telegram.ui.Components.l81
    public final void u() {
        py pyVar;
        ph1 ph1Var = this.S;
        wg0 wg0Var = (wg0) ph1Var;
        if (wg0Var.C != null) {
            wg0Var.m0(wg0Var.c.getCurrentPosition(), true);
            wg0Var.n0(0.0f, false);
        }
        wg0Var.d0();
        oh1 oh1Var = wg0Var.c;
        if (oh1Var != null) {
            int currentPosition = oh1Var.getCurrentPosition();
            if (currentPosition != 2 && wg0Var.x) {
                wg0Var.W(2);
                wg0Var.x = false;
            }
            if (currentPosition != 3) {
                wg0Var.W(3);
            }
            Integer num = wg0Var.F;
            if (num != null && currentPosition == 0 && (pyVar = wg0Var.G) != null) {
                pyVar.w4(num.intValue());
                wg0Var.F = null;
            }
        }
        ph1Var.U();
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        ph1 ph1Var = this.S;
        wg0 wg0Var = (wg0) ph1Var;
        boolean z10 = !z4;
        if (wg0Var.C != null) {
            float positionAnimated = wg0Var.c.getPositionAnimated();
            wg0Var.n0(positionAnimated, z10);
            if (!z4) {
                wg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        wg0Var.h0();
        wg0Var.d0();
        wg0Var.b.invalidate();
        ph1Var.U();
        ph1Var.checkSystemBarColors();
    }
}
