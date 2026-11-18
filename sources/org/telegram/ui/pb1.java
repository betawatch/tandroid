package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pb1 extends org.telegram.ui.Components.g71 {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ qb1 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(qb1 qb1Var, Context context) {
        super(context, null);
        this.b0 = qb1Var;
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

    @Override // org.telegram.ui.Components.g71
    public final boolean e(MotionEvent motionEvent) {
        Object c02 = ((me0) this.b0).c0();
        if (c02 instanceof le0) {
            return ((le0) c02).X(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean f(MotionEvent motionEvent) {
        Object c02 = ((me0) this.b0).c0();
        if (c02 instanceof le0) {
            return ((le0) c02).X(motionEvent, true);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g71
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.g71
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.g71
    public final void p(View view, View view2, int i7, int i10) {
        this.b0.Z();
    }

    @Override // org.telegram.ui.Components.g71
    public final void q() {
        cx cxVar;
        qb1 qb1Var = this.b0;
        me0 me0Var = (me0) qb1Var;
        if (me0Var.G != null) {
            me0Var.s0(me0Var.c.getCurrentPosition(), true);
            me0Var.t0(false, 0.0f);
        }
        me0Var.i0();
        pb1 pb1Var = me0Var.c;
        if (pb1Var != null) {
            int currentPosition = pb1Var.getCurrentPosition();
            if (currentPosition != 2 && me0Var.y) {
                me0Var.b0(2);
                me0Var.y = false;
            }
            if (currentPosition != 3) {
                me0Var.b0(3);
            }
            Integer num = me0Var.J;
            if (num != null && currentPosition == 0 && (cxVar = me0Var.K) != null) {
                cxVar.Q4(num.intValue());
                me0Var.J = null;
            }
        }
        qb1Var.Z();
    }

    @Override // org.telegram.ui.Components.g71
    public final void s(boolean z10) {
        qb1 qb1Var = this.b0;
        me0 me0Var = (me0) qb1Var;
        boolean z11 = !z10;
        if (me0Var.G != null) {
            float positionAnimated = me0Var.c.getPositionAnimated();
            me0Var.t0(z11, positionAnimated);
            if (!z10) {
                me0Var.s0(Math.round(positionAnimated), true);
            }
        }
        me0Var.n0();
        me0Var.i0();
        me0Var.b.invalidate();
        qb1Var.Z();
        qb1Var.checkSystemBarColors();
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
}
