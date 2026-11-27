// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
