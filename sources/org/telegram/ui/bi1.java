package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.Components.o91 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ ci1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi1(ci1 ci1Var, Context context) {
        super(context, null);
        this.V = ci1Var;
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

    @Override // org.telegram.ui.Components.o91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.o91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.o91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((fh0) this.V).X();
        if (X instanceof eh0) {
            return ((eh0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.o91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((fh0) this.V).X();
        if (X instanceof eh0) {
            return ((eh0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.o91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.o91
    public final void u() {
        ty tyVar;
        ci1 ci1Var = this.V;
        fh0 fh0Var = (fh0) ci1Var;
        if (fh0Var.F != null) {
            fh0Var.m0(fh0Var.c.getCurrentPosition(), true);
            fh0Var.n0(0.0f, false);
        }
        fh0Var.d0();
        bi1 bi1Var = fh0Var.c;
        if (bi1Var != null) {
            int currentPosition = bi1Var.getCurrentPosition();
            if (currentPosition != 2 && fh0Var.x) {
                fh0Var.W(2);
                fh0Var.x = false;
            }
            if (currentPosition != 3) {
                fh0Var.W(3);
            }
            Integer num = fh0Var.I;
            if (num != null && currentPosition == 0 && (tyVar = fh0Var.J) != null) {
                tyVar.t4(num.intValue());
                fh0Var.I = null;
            }
        }
        ci1Var.U();
    }

    @Override // org.telegram.ui.Components.o91
    public final void w(boolean z10) {
        ci1 ci1Var = this.V;
        fh0 fh0Var = (fh0) ci1Var;
        boolean z11 = !z10;
        if (fh0Var.F != null) {
            float positionAnimated = fh0Var.c.getPositionAnimated();
            fh0Var.n0(positionAnimated, z11);
            if (!z10) {
                fh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        fh0Var.h0();
        fh0Var.d0();
        fh0Var.b.invalidate();
        ci1Var.U();
        ci1Var.checkSystemBarColors();
    }
}
