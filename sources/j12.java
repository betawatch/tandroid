// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j12 extends rq4 {
    public final n12 L;

    public j12(n12 n12Var, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.L = n12Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.d1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
