package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h0 extends s {
    public final /* synthetic */ j0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Activity activity, int i7, g0 g0Var) {
        super(activity, i7, g0Var);
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
        z0 z0Var = j0Var.d;
        if (z0Var == null || (z0Var.m1 <= 0.5f && z0Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            z0 z0Var2 = j0Var.d;
            z0Var2.m1 = 0.0f;
            z0Var2.invalidate();
        }
        return true;
    }
}
