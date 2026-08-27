package f2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ f0 b;

    public d0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        o1 T;
        if (this.a) {
            f0 f0Var = this.b;
            View k10 = f0Var.k(motionEvent);
            c0 c0Var = f0Var.x;
            if (k10 == null || (T = f0Var.D.T(k10)) == null) {
                return;
            }
            RecyclerView recyclerView = f0Var.D;
            int e9 = c0Var.e(recyclerView, T);
            WeakHashMap weakHashMap = r0.j0.a;
            if ((c0Var.b(e9, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = f0Var.w;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x8 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    f0Var.d = x8;
                    f0Var.e = y10;
                    f0Var.r = 0.0f;
                    f0Var.n = 0.0f;
                    if (c0Var.k()) {
                        f0Var.p(T, 2);
                    }
                }
            }
        }
    }
}
