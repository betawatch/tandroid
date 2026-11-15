package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lb1 extends org.telegram.ui.Components.w61 {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ mb1 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(mb1 mb1Var, Context context) {
        super(context, null);
        this.b0 = mb1Var;
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

    @Override // org.telegram.ui.Components.w61
    public final boolean e(MotionEvent motionEvent) {
        Object c02 = ((je0) this.b0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).X(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w61
    public final boolean f(MotionEvent motionEvent) {
        Object c02 = ((je0) this.b0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).X(motionEvent, true);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w61
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.w61
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.w61
    public final void q(View view, View view2, int i7, int i10) {
        this.b0.Z();
    }

    @Override // org.telegram.ui.Components.w61
    public final void r() {
        yw ywVar;
        mb1 mb1Var = this.b0;
        je0 je0Var = (je0) mb1Var;
        if (je0Var.G != null) {
            je0Var.s0(je0Var.c.getCurrentPosition(), true);
            je0Var.t0(false, 0.0f);
        }
        je0Var.i0();
        lb1 lb1Var = je0Var.c;
        if (lb1Var != null) {
            int currentPosition = lb1Var.getCurrentPosition();
            if (currentPosition != 2 && je0Var.y) {
                je0Var.b0(2);
                je0Var.y = false;
            }
            if (currentPosition != 3) {
                je0Var.b0(3);
            }
            Integer num = je0Var.J;
            if (num != null && currentPosition == 0 && (ywVar = je0Var.K) != null) {
                ywVar.I4(num.intValue());
                je0Var.J = null;
            }
        }
        mb1Var.Z();
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

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        mb1 mb1Var = this.b0;
        je0 je0Var = (je0) mb1Var;
        boolean z11 = !z10;
        if (je0Var.G != null) {
            float positionAnimated = je0Var.c.getPositionAnimated();
            je0Var.t0(z11, positionAnimated);
            if (!z10) {
                je0Var.s0(Math.round(positionAnimated), true);
            }
        }
        je0Var.n0();
        je0Var.i0();
        je0Var.b.invalidate();
        mb1Var.Z();
        mb1Var.checkSystemBarColors();
    }
}
