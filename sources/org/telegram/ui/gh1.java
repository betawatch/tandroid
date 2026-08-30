package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gh1 extends org.telegram.ui.Components.l81 {
    public boolean Q;
    public final Path R;
    public final /* synthetic */ hh1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(hh1 hh1Var, Context context) {
        super(context, null);
        this.S = hh1Var;
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
        Object X = ((vg0) this.S).X();
        if (X instanceof ug0) {
            return ((ug0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l81
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((vg0) this.S).X();
        if (X instanceof ug0) {
            return ((ug0) X).S(motionEvent, true);
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
        oy oyVar;
        hh1 hh1Var = this.S;
        vg0 vg0Var = (vg0) hh1Var;
        if (vg0Var.C != null) {
            vg0Var.m0(vg0Var.c.getCurrentPosition(), true);
            vg0Var.n0(0.0f, false);
        }
        vg0Var.d0();
        gh1 gh1Var = vg0Var.c;
        if (gh1Var != null) {
            int currentPosition = gh1Var.getCurrentPosition();
            if (currentPosition != 2 && vg0Var.x) {
                vg0Var.W(2);
                vg0Var.x = false;
            }
            if (currentPosition != 3) {
                vg0Var.W(3);
            }
            Integer num = vg0Var.F;
            if (num != null && currentPosition == 0 && (oyVar = vg0Var.G) != null) {
                oyVar.w4(num.intValue());
                vg0Var.F = null;
            }
        }
        hh1Var.U();
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        hh1 hh1Var = this.S;
        vg0 vg0Var = (vg0) hh1Var;
        boolean z10 = !z4;
        if (vg0Var.C != null) {
            float positionAnimated = vg0Var.c.getPositionAnimated();
            vg0Var.n0(positionAnimated, z10);
            if (!z4) {
                vg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        vg0Var.h0();
        vg0Var.d0();
        vg0Var.b.invalidate();
        hh1Var.U();
        hh1Var.checkSystemBarColors();
    }
}
