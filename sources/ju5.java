// default package

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ju5 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ lu5 b;

    public ju5(lu5 lu5Var) {
        this.b = lu5Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        f89 U;
        if (this.a) {
            lu5 lu5Var = this.b;
            View m = lu5Var.m(motionEvent);
            iu5 iu5Var = lu5Var.y;
            if (m == null || (U = lu5Var.I.U(m)) == null) {
                return;
            }
            RecyclerView recyclerView = lu5Var.I;
            int f = iu5Var.f(recyclerView, U);
            WeakHashMap weakHashMap = ihc.a;
            if ((iu5Var.b(f, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = lu5Var.x;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    lu5Var.d = x;
                    lu5Var.e = y;
                    lu5Var.r = 0.0f;
                    lu5Var.n = 0.0f;
                    if (iu5Var.l()) {
                        lu5Var.q(U, 2);
                    }
                }
            }
        }
    }
}
