// default package

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
