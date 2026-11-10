package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q0 extends x {
    public final /* synthetic */ s0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Activity activity, int i7, p0 p0Var) {
        super(activity, i7, p0Var);
        this.M = s0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        s0 s0Var = this.M;
        float min = Math.min(height, s0Var.w - (getTranslationY() + getTop()));
        d dVar = s0Var.y;
        if (dVar != null) {
            dVar.G = min;
        }
        s0Var.K = min;
        if (dVar != null) {
            dVar.U = s0Var.s - dVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s0 s0Var = this.M;
        l1 l1Var = s0Var.d;
        if (l1Var == null || (l1Var.l1 <= 0.5f && l1Var.k1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            l1 l1Var2 = s0Var.d;
            l1Var2.l1 = 0.0f;
            l1Var2.invalidate();
        }
        return true;
    }
}
