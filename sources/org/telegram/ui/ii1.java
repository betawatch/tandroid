package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ii1 extends org.telegram.ui.Components.l91 {
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

    @Override // org.telegram.ui.Components.l91
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // org.telegram.ui.Components.l91
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean j(MotionEvent motionEvent) {
        Object X = ((jh0) this.V).X();
        if (X instanceof ih0) {
            return ((ih0) X).S(motionEvent, false);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean k(MotionEvent motionEvent) {
        Object X = ((jh0) this.V).X();
        if (X instanceof ih0) {
            return ((ih0) X).S(motionEvent, true);
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

    @Override // org.telegram.ui.Components.l91
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override // org.telegram.ui.Components.l91
    public final void u() {
        yy yyVar;
        ji1 ji1Var = this.V;
        jh0 jh0Var = (jh0) ji1Var;
        if (jh0Var.F != null) {
            jh0Var.m0(jh0Var.c.getCurrentPosition(), true);
            jh0Var.n0(0.0f, false);
        }
        jh0Var.d0();
        ii1 ii1Var = jh0Var.c;
        if (ii1Var != null) {
            int currentPosition = ii1Var.getCurrentPosition();
            if (currentPosition != 2 && jh0Var.x) {
                jh0Var.W(2);
                jh0Var.x = false;
            }
            if (currentPosition != 3) {
                jh0Var.W(3);
            }
            Integer num = jh0Var.I;
            if (num != null && currentPosition == 0 && (yyVar = jh0Var.J) != null) {
                yyVar.u4(num.intValue());
                jh0Var.I = null;
            }
        }
        ji1Var.U();
    }

    @Override // org.telegram.ui.Components.l91
    public final void w(boolean z10) {
        ji1 ji1Var = this.V;
        jh0 jh0Var = (jh0) ji1Var;
        boolean z11 = !z10;
        if (jh0Var.F != null) {
            float positionAnimated = jh0Var.c.getPositionAnimated();
            jh0Var.n0(positionAnimated, z11);
            if (!z10) {
                jh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        jh0Var.h0();
        jh0Var.d0();
        jh0Var.b.invalidate();
        ji1Var.U();
        ji1Var.checkSystemBarColors();
    }
}
