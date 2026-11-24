// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gy8 extends tx8 {
    public final /* synthetic */ iy8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy8(iy8 iy8Var, Activity activity, int i, fy8 fy8Var) {
        super(activity, i, fy8Var);
        this.N = iy8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        iy8 iy8Var = this.N;
        float min = Math.min(height, iy8Var.w - (getTranslationY() + getTop()));
        cz3 cz3Var = iy8Var.y;
        if (cz3Var != null) {
            cz3Var.H = min;
        }
        iy8Var.L = min;
        if (cz3Var != null) {
            cz3Var.V = iy8Var.s - cz3Var.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iy8 iy8Var = this.N;
        wy8 wy8Var = iy8Var.d;
        if (wy8Var == null || (wy8Var.m1 <= 0.5f && wy8Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            wy8 wy8Var2 = iy8Var.d;
            wy8Var2.m1 = 0.0f;
            wy8Var2.invalidate();
        }
        return true;
    }
}
