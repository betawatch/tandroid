package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ e0 b;

    public c0(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        l1 T;
        if (this.a) {
            e0 e0Var = this.b;
            View k10 = e0Var.k(motionEvent);
            b0 b0Var = e0Var.x;
            if (k10 == null || (T = e0Var.E.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = e0Var.E;
            int e = b0Var.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.j0.a;
            if ((b0Var.b(e, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = e0Var.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    e0Var.d = x10;
                    e0Var.e = y10;
                    e0Var.r = 0.0f;
                    e0Var.n = 0.0f;
                    if (b0Var.k()) {
                        e0Var.p(T, 2);
                    }
                }
            }
        }
    }
}
