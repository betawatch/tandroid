package bi;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 extends s {
    public final /* synthetic */ j0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Activity activity, int i3, g0 g0Var) {
        super(activity, i3, g0Var);
        this.N = j0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        j0 j0Var = this.N;
        float min = Math.min(height, j0Var.w - (getTranslationY() + getTop()));
        c cVar = j0Var.y;
        if (cVar != null) {
            cVar.H = min;
        }
        j0Var.L = min;
        if (cVar != null) {
            cVar.V = j0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.N;
        a1 a1Var = j0Var.d;
        if (a1Var == null || (a1Var.m1 <= 0.5f && a1Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            a1 a1Var2 = j0Var.d;
            a1Var2.m1 = 0.0f;
            a1Var2.invalidate();
        }
        return true;
    }
}
