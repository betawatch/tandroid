package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pb1 extends org.telegram.ui.Components.w61 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ qb1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(qb1 qb1Var, Context context) {
        super(context, null);
        this.a0 = qb1Var;
        this.W = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.V) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.w61
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.w61
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean j(MotionEvent motionEvent) {
        Object c02 = ((le0) this.a0).c0();
        if (c02 instanceof ke0) {
            return ((ke0) c02).W(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean k(MotionEvent motionEvent) {
        Object c02 = ((le0) this.a0).c0();
        if (c02 instanceof ke0) {
            return ((ke0) c02).W(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z9) {
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        invalidate();
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(View view, View view2, int i7, int i10) {
        this.a0.Z();
    }

    @Override // org.telegram.ui.Components.w61
    public final void u() {
        yw ywVar;
        qb1 qb1Var = this.a0;
        le0 le0Var = (le0) qb1Var;
        if (le0Var.F != null) {
            le0Var.s0(le0Var.c.getCurrentPosition(), true);
            le0Var.t0(false, 0.0f);
        }
        le0Var.i0();
        pb1 pb1Var = le0Var.c;
        if (pb1Var != null) {
            int currentPosition = pb1Var.getCurrentPosition();
            if (currentPosition != 2 && le0Var.y) {
                le0Var.b0(2);
                le0Var.y = false;
            }
            if (currentPosition != 3) {
                le0Var.b0(3);
            }
            Integer num = le0Var.I;
            if (num != null && currentPosition == 0 && (ywVar = le0Var.J) != null) {
                ywVar.I4(num.intValue());
                le0Var.I = null;
            }
        }
        qb1Var.Z();
    }

    @Override // org.telegram.ui.Components.w61
    public final void w(boolean z9) {
        qb1 qb1Var = this.a0;
        le0 le0Var = (le0) qb1Var;
        boolean z10 = !z9;
        if (le0Var.F != null) {
            float positionAnimated = le0Var.c.getPositionAnimated();
            le0Var.t0(z10, positionAnimated);
            if (!z9) {
                le0Var.s0(Math.round(positionAnimated), true);
            }
        }
        le0Var.n0();
        le0Var.i0();
        le0Var.b.invalidate();
        qb1Var.Z();
        qb1Var.checkSystemBarColors();
    }
}
