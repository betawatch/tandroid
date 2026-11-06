package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mb1 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final Path W;
    public final /* synthetic */ nb1 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(nb1 nb1Var, Context context) {
        super(context, null);
        this.a0 = nb1Var;
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
        Object c02 = ((je0) this.a0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).W(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean k(MotionEvent motionEvent) {
        Object c02 = ((je0) this.a0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).W(motionEvent, true);
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
        ww wwVar;
        nb1 nb1Var = this.a0;
        je0 je0Var = (je0) nb1Var;
        if (je0Var.F != null) {
            je0Var.s0(je0Var.c.getCurrentPosition(), true);
            je0Var.t0(false, 0.0f);
        }
        je0Var.i0();
        mb1 mb1Var = je0Var.c;
        if (mb1Var != null) {
            int currentPosition = mb1Var.getCurrentPosition();
            if (currentPosition != 2 && je0Var.y) {
                je0Var.b0(2);
                je0Var.y = false;
            }
            if (currentPosition != 3) {
                je0Var.b0(3);
            }
            Integer num = je0Var.I;
            if (num != null && currentPosition == 0 && (wwVar = je0Var.J) != null) {
                wwVar.I4(num.intValue());
                je0Var.I = null;
            }
        }
        nb1Var.Z();
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        nb1 nb1Var = this.a0;
        je0 je0Var = (je0) nb1Var;
        boolean z10 = !z9;
        if (je0Var.F != null) {
            float positionAnimated = je0Var.c.getPositionAnimated();
            je0Var.t0(z10, positionAnimated);
            if (!z9) {
                je0Var.s0(Math.round(positionAnimated), true);
            }
        }
        je0Var.n0();
        je0Var.i0();
        je0Var.b.invalidate();
        nb1Var.Z();
        nb1Var.checkSystemBarColors();
    }
}
