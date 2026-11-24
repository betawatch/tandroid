// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gs5 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ is5 b;

    public gs5(is5 is5Var) {
        this.b = is5Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        s49 T;
        if (this.a) {
            is5 is5Var = this.b;
            View m = is5Var.m(motionEvent);
            fs5 fs5Var = is5Var.y;
            if (m == null || (T = is5Var.I.T(m)) == null) {
                return;
            }
            RecyclerView recyclerView = is5Var.I;
            int f = fs5Var.f(recyclerView, T);
            WeakHashMap weakHashMap = jdc.a;
            if ((fs5Var.b(f, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = is5Var.x;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    is5Var.d = x;
                    is5Var.e = y;
                    is5Var.r = 0.0f;
                    is5Var.n = 0.0f;
                    if (fs5Var.l()) {
                        is5Var.q(T, 2);
                    }
                }
            }
        }
    }
}
