// default package

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
