package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ h0 b;

    public e0(h0 h0Var) {
        this.b = h0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        q1 T;
        if (this.a) {
            h0 h0Var = this.b;
            View k10 = h0Var.k(motionEvent);
            d0 d0Var = h0Var.x;
            if (k10 == null || (T = h0Var.D.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = h0Var.D;
            int e10 = d0Var.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.j0.a;
            if ((d0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i9 = h0Var.w;
                if (pointerId == i9) {
                    int findPointerIndex = motionEvent.findPointerIndex(i9);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    h0Var.d = x10;
                    h0Var.e = y10;
                    h0Var.r = 0.0f;
                    h0Var.n = 0.0f;
                    if (d0Var.k()) {
                        h0Var.p(T, 2);
                    }
                }
            }
        }
    }
}
