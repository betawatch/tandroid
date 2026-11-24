// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iec extends wec {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ jec b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iec(jec jecVar, Context context) {
        super(context, null);
        this.b0 = jecVar;
        this.a0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.a0;
            path.rewind();
            float N = gl.N(24.0f);
            RectF rectF = gl.P;
            rectF.set(0.0f, gl.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
    }

    @Override // wec
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // wec
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // wec
    public final boolean h(MotionEvent motionEvent) {
        Object b0 = ((ah6) this.b0).b0();
        if (b0 instanceof zg6) {
            return ((zg6) b0).W(motionEvent, false);
        }
        return false;
    }

    @Override // wec
    public final boolean i(MotionEvent motionEvent) {
        Object b0 = ((ah6) this.b0).b0();
        if (b0 instanceof zg6) {
            return ((zg6) b0).W(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // wec
    public final void s(View view, View view2, int i, int i2) {
        this.b0.Y();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override // wec
    public final void u() {
        cj3 cj3Var;
        jec jecVar = this.b0;
        ah6 ah6Var = (ah6) jecVar;
        if (ah6Var.G != null) {
            ah6Var.r0(ah6Var.c.getCurrentPosition(), true);
            ah6Var.s0(false, 0.0f);
        }
        ah6Var.c0();
        iec iecVar = ah6Var.c;
        if (iecVar != null) {
            int currentPosition = iecVar.getCurrentPosition();
            if (currentPosition != 2 && ah6Var.y) {
                ah6Var.a0(2);
                ah6Var.y = false;
            }
            if (currentPosition != 3) {
                ah6Var.a0(3);
            }
            Integer num = ah6Var.J;
            if (num != null && currentPosition == 0 && (cj3Var = ah6Var.K) != null) {
                cj3Var.M4(num.intValue());
                ah6Var.J = null;
            }
        }
        jecVar.Y();
    }

    @Override // wec
    public final void w(boolean z) {
        jec jecVar = this.b0;
        ah6 ah6Var = (ah6) jecVar;
        boolean z2 = !z;
        if (ah6Var.G != null) {
            float positionAnimated = ah6Var.c.getPositionAnimated();
            ah6Var.s0(z2, positionAnimated);
            if (!z) {
                ah6Var.r0(Math.round(positionAnimated), true);
            }
        }
        ah6Var.h0();
        ah6Var.c0();
        ah6Var.b.invalidate();
        jecVar.Y();
        jecVar.checkSystemBarColors();
    }
}
