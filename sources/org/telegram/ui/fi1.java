package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fi1 extends org.telegram.ui.Components.v81 {
    public boolean T;
    public final Path U;
    public final /* synthetic */ gi1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(gi1 gi1Var, Context context) {
        super(context, null);
        this.V = gi1Var;
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

    @Override // org.telegram.ui.Components.v81
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.v81
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.v81
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((fh0) this.V).X();
        if (X instanceof eh0) {
            return ((eh0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v81
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

    @Override // org.telegram.ui.Components.v81
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.v81
    public final void u() {
        wy wyVar;
        gi1 gi1Var = this.V;
        fh0 fh0Var = (fh0) gi1Var;
        if (fh0Var.F != null) {
            fh0Var.m0(fh0Var.c.getCurrentPosition(), true);
            fh0Var.n0(0.0f, false);
        }
        fh0Var.d0();
        fi1 fi1Var = fh0Var.c;
        if (fi1Var != null) {
            int currentPosition = fi1Var.getCurrentPosition();
            if (currentPosition != 2 && fh0Var.x) {
                fh0Var.W(2);
                fh0Var.x = false;
            }
            if (currentPosition != 3) {
                fh0Var.W(3);
            }
            Integer num = fh0Var.I;
            if (num != null && currentPosition == 0 && (wyVar = fh0Var.J) != null) {
                wyVar.w4(num.intValue());
                fh0Var.I = null;
            }
        }
        gi1Var.U();
    }

    @Override // org.telegram.ui.Components.v81
    public final void w(boolean z10) {
        gi1 gi1Var = this.V;
        fh0 fh0Var = (fh0) gi1Var;
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
        gi1Var.U();
        gi1Var.checkSystemBarColors();
    }
}
