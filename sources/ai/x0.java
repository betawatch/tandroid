package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x0 extends y {
    public final /* synthetic */ z0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, Activity activity, int i10, w0 w0Var) {
        super(activity, i10, w0Var);
        this.M = z0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        z0 z0Var = this.M;
        float min = Math.min(height, z0Var.v - (getTranslationY() + getTop()));
        d dVar = z0Var.x;
        if (dVar != null) {
            dVar.G = min;
        }
        z0Var.K = min;
        if (dVar != null) {
            dVar.U = z0Var.s - dVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z0 z0Var = this.M;
        t1 t1Var = z0Var.d;
        if (t1Var == null || (t1Var.l1 <= 0.5f && t1Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            t1 t1Var2 = z0Var.d;
            t1Var2.l1 = 0.0f;
            t1Var2.invalidate();
        }
        return true;
    }
}
