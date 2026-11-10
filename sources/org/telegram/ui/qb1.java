package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qb1 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ rb1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb1(rb1 rb1Var, Context context) {
        super(context, null);
        this.a0 = rb1Var;
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

    @Override // org.telegram.ui.Components.v61
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.v61
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean j(MotionEvent motionEvent) {
        Object c02 = ((me0) this.a0).c0();
        if (c02 instanceof le0) {
            return ((le0) c02).W(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean k(MotionEvent motionEvent) {
        Object c02 = ((me0) this.a0).c0();
        if (c02 instanceof le0) {
            return ((le0) c02).W(motionEvent, true);
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

    @Override // org.telegram.ui.Components.v61
    public final void t(View view, View view2, int i7, int i10) {
        this.a0.Z();
    }

    @Override // org.telegram.ui.Components.v61
    public final void u() {
        zw zwVar;
        rb1 rb1Var = this.a0;
        me0 me0Var = (me0) rb1Var;
        if (me0Var.F != null) {
            me0Var.s0(me0Var.c.getCurrentPosition(), true);
            me0Var.t0(false, 0.0f);
        }
        me0Var.i0();
        qb1 qb1Var = me0Var.c;
        if (qb1Var != null) {
            int currentPosition = qb1Var.getCurrentPosition();
            if (currentPosition != 2 && me0Var.y) {
                me0Var.b0(2);
                me0Var.y = false;
            }
            if (currentPosition != 3) {
                me0Var.b0(3);
            }
            Integer num = me0Var.I;
            if (num != null && currentPosition == 0 && (zwVar = me0Var.J) != null) {
                zwVar.I4(num.intValue());
                me0Var.I = null;
            }
        }
        rb1Var.Z();
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        rb1 rb1Var = this.a0;
        me0 me0Var = (me0) rb1Var;
        boolean z10 = !z9;
        if (me0Var.F != null) {
            float positionAnimated = me0Var.c.getPositionAnimated();
            me0Var.t0(z10, positionAnimated);
            if (!z9) {
                me0Var.s0(Math.round(positionAnimated), true);
            }
        }
        me0Var.n0();
        me0Var.i0();
        me0Var.b.invalidate();
        rb1Var.Z();
        rb1Var.checkSystemBarColors();
    }
}
