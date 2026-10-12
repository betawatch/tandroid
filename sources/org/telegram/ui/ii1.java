package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ii1 extends org.telegram.ui.Components.k91 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ ji1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii1(ji1 ji1Var, Context context) {
        super(context, null);
        this.V = ji1Var;
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

    @Override // org.telegram.ui.Components.k91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.k91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.k91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((kh0) this.V).X();
        if (X instanceof jh0) {
            return ((jh0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((kh0) this.V).X();
        if (X instanceof jh0) {
            return ((jh0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.k91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.k91
    public final void u() {
        yy yyVar;
        ji1 ji1Var = this.V;
        kh0 kh0Var = (kh0) ji1Var;
        if (kh0Var.F != null) {
            kh0Var.m0(kh0Var.c.getCurrentPosition(), true);
            kh0Var.n0(0.0f, false);
        }
        kh0Var.d0();
        ii1 ii1Var = kh0Var.c;
        if (ii1Var != null) {
            int currentPosition = ii1Var.getCurrentPosition();
            if (currentPosition != 2 && kh0Var.x) {
                kh0Var.W(2);
                kh0Var.x = false;
            }
            if (currentPosition != 3) {
                kh0Var.W(3);
            }
            Integer num = kh0Var.I;
            if (num != null && currentPosition == 0 && (yyVar = kh0Var.J) != null) {
                yyVar.t4(num.intValue());
                kh0Var.I = null;
            }
        }
        ji1Var.U();
    }

    @Override // org.telegram.ui.Components.k91
    public final void w(boolean z10) {
        ji1 ji1Var = this.V;
        kh0 kh0Var = (kh0) ji1Var;
        boolean z11 = !z10;
        if (kh0Var.F != null) {
            float positionAnimated = kh0Var.c.getPositionAnimated();
            kh0Var.n0(positionAnimated, z11);
            if (!z10) {
                kh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        kh0Var.h0();
        kh0Var.d0();
        kh0Var.b.invalidate();
        ji1Var.U();
        ji1Var.checkSystemBarColors();
    }
}
