package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class id1 extends org.telegram.ui.Components.w71 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ jd1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(jd1 jd1Var, Context context) {
        super(context, null);
        this.a0 = jd1Var;
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

    @Override // org.telegram.ui.Components.w71
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.w71
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean j(MotionEvent motionEvent) {
        Object b02 = ((pf0) this.a0).b0();
        if (b02 instanceof of0) {
            return ((of0) b02).W(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean k(MotionEvent motionEvent) {
        Object b02 = ((pf0) this.a0).b0();
        if (b02 instanceof of0) {
            return ((of0) b02).W(motionEvent, true);
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

    @Override // org.telegram.ui.Components.w71
    public final void t(View view, View view2, int i10, int i11) {
        this.a0.Y();
    }

    @Override // org.telegram.ui.Components.w71
    public final void u() {
        ay ayVar;
        jd1 jd1Var = this.a0;
        pf0 pf0Var = (pf0) jd1Var;
        if (pf0Var.F != null) {
            pf0Var.r0(pf0Var.c.getCurrentPosition(), true);
            pf0Var.s0(false, 0.0f);
        }
        pf0Var.h0();
        id1 id1Var = pf0Var.c;
        if (id1Var != null) {
            int currentPosition = id1Var.getCurrentPosition();
            if (currentPosition != 2 && pf0Var.y) {
                pf0Var.a0(2);
                pf0Var.y = false;
            }
            if (currentPosition != 3) {
                pf0Var.a0(3);
            }
            Integer num = pf0Var.I;
            if (num != null && currentPosition == 0 && (ayVar = pf0Var.J) != null) {
                ayVar.H4(num.intValue());
                pf0Var.I = null;
            }
        }
        jd1Var.Y();
    }

    @Override // org.telegram.ui.Components.w71
    public final void w(boolean z10) {
        jd1 jd1Var = this.a0;
        pf0 pf0Var = (pf0) jd1Var;
        boolean z11 = !z10;
        if (pf0Var.F != null) {
            float positionAnimated = pf0Var.c.getPositionAnimated();
            pf0Var.s0(z11, positionAnimated);
            if (!z10) {
                pf0Var.r0(Math.round(positionAnimated), true);
            }
        }
        pf0Var.m0();
        pf0Var.h0();
        pf0Var.b.invalidate();
        jd1Var.Y();
        jd1Var.checkSystemBarColors();
    }
}
