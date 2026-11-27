// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
