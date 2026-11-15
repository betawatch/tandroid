package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g0 extends s {
    public final /* synthetic */ i0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Activity activity, int i7, f0 f0Var) {
        super(activity, i7, f0Var);
        this.N = i0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight();
        i0 i0Var = this.N;
        float min = Math.min(height, i0Var.w - (getTranslationY() + getTop()));
        c cVar = i0Var.y;
        if (cVar != null) {
            cVar.H = min;
        }
        i0Var.L = min;
        if (cVar != null) {
            cVar.V = i0Var.s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.N;
        z0 z0Var = i0Var.d;
        if (z0Var == null || (z0Var.m1 <= 0.5f && z0Var.l1 <= 0.5f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            z0 z0Var2 = i0Var.d;
            z0Var2.m1 = 0.0f;
            z0Var2.invalidate();
        }
        return true;
    }
}
