package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ f0 b;

    public c0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        m1 T;
        if (this.a) {
            f0 f0Var = this.b;
            View k10 = f0Var.k(motionEvent);
            b0 b0Var = f0Var.x;
            if (k10 == null || (T = f0Var.E.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = f0Var.E;
            int e6 = b0Var.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.j0.a;
            if ((b0Var.b(e6, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = f0Var.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    f0Var.d = x10;
                    f0Var.e = y10;
                    f0Var.r = 0.0f;
                    f0Var.n = 0.0f;
                    if (b0Var.k()) {
                        f0Var.p(T, 2);
                    }
                }
            }
        }
    }
}
