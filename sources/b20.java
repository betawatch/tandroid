// default package

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b20 extends uy9 {
    public final /* synthetic */ j20 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(j20 j20Var, Activity activity, vnb vnbVar) {
        super(vnbVar, activity, false);
        this.n0 = j20Var;
    }

    @Override // uy9
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
