package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ai1 extends org.telegram.ui.Components.i81 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ bi1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai1(bi1 bi1Var, Context context) {
        super(context, null);
        this.V = bi1Var;
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

    @Override // org.telegram.ui.Components.i81
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.i81
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.i81
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((eh0) this.V).X();
        if (X instanceof dh0) {
            return ((dh0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.i81
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((eh0) this.V).X();
        if (X instanceof dh0) {
            return ((dh0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.i81
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.i81
    public final void u() {
        uy uyVar;
        bi1 bi1Var = this.V;
        eh0 eh0Var = (eh0) bi1Var;
        if (eh0Var.F != null) {
            eh0Var.m0(eh0Var.c.getCurrentPosition(), true);
            eh0Var.n0(0.0f, false);
        }
        eh0Var.d0();
        ai1 ai1Var = eh0Var.c;
        if (ai1Var != null) {
            int currentPosition = ai1Var.getCurrentPosition();
            if (currentPosition != 2 && eh0Var.x) {
                eh0Var.W(2);
                eh0Var.x = false;
            }
            if (currentPosition != 3) {
                eh0Var.W(3);
            }
            Integer num = eh0Var.I;
            if (num != null && currentPosition == 0 && (uyVar = eh0Var.J) != null) {
                uyVar.w4(num.intValue());
                eh0Var.I = null;
            }
        }
        bi1Var.U();
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        bi1 bi1Var = this.V;
        eh0 eh0Var = (eh0) bi1Var;
        boolean z11 = !z10;
        if (eh0Var.F != null) {
            float positionAnimated = eh0Var.c.getPositionAnimated();
            eh0Var.n0(positionAnimated, z11);
            if (!z10) {
                eh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        eh0Var.h0();
        eh0Var.d0();
        eh0Var.b.invalidate();
        bi1Var.U();
        bi1Var.checkSystemBarColors();
    }
}
