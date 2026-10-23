package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ng1 extends org.telegram.ui.Components.e91 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ og1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng1(og1 og1Var, Context context) {
        super(context, null);
        this.V = og1Var;
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

    @Override // org.telegram.ui.Components.e91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.e91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.e91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((ng0) this.V).X();
        if (X instanceof mg0) {
            return ((mg0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.e91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((ng0) this.V).X();
        if (X instanceof mg0) {
            return ((mg0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.e91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.e91
    public final void u() {
        cy cyVar;
        og1 og1Var = this.V;
        ng0 ng0Var = (ng0) og1Var;
        if (ng0Var.F != null) {
            ng0Var.m0(ng0Var.c.getCurrentPosition(), true);
            ng0Var.n0(0.0f, false);
        }
        ng0Var.d0();
        ng1 ng1Var = ng0Var.c;
        if (ng1Var != null) {
            int currentPosition = ng1Var.getCurrentPosition();
            if (currentPosition != 2 && ng0Var.x) {
                ng0Var.W(2);
                ng0Var.x = false;
            }
            if (currentPosition != 3) {
                ng0Var.W(3);
            }
            Integer num = ng0Var.I;
            if (num != null && currentPosition == 0 && (cyVar = ng0Var.J) != null) {
                cyVar.u4(num.intValue());
                ng0Var.I = null;
            }
        }
        og1Var.U();
    }

    @Override // org.telegram.ui.Components.e91
    public final void w(boolean z10) {
        og1 og1Var = this.V;
        ng0 ng0Var = (ng0) og1Var;
        boolean z11 = !z10;
        if (ng0Var.F != null) {
            float positionAnimated = ng0Var.c.getPositionAnimated();
            ng0Var.n0(positionAnimated, z11);
            if (!z10) {
                ng0Var.m0(Math.round(positionAnimated), true);
            }
        }
        ng0Var.h0();
        ng0Var.d0();
        ng0Var.b.invalidate();
        og1Var.U();
        og1Var.checkSystemBarColors();
    }
}
