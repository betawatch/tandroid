// default package

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class om4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pm4 b;

    public /* synthetic */ om4(pm4 pm4Var, byte b) {
        this.a = b;
        this.b = pm4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pm4 pm4Var = this.b;
        switch (b) {
            case 0:
                ViewParent parent = pm4Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                pm4Var.a();
                View view = pm4Var.d;
                if (view.isEnabled() && !view.isLongClickable() && pm4Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    pm4Var.h = true;
                    break;
                }
                break;
        }
    }
}
