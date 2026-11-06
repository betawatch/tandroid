package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ u1(v1 v1Var, int i7) {
        this.a = i7;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                v1 v1Var = this.b;
                v1Var.a();
                View view = v1Var.d;
                if (view.isEnabled() && !view.isLongClickable() && v1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    v1Var.h = true;
                    break;
                }
                break;
        }
    }
}
