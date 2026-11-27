// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class aj1 extends h79 {
    public final /* synthetic */ ej1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(ej1 ej1Var, Activity activity, vnb vnbVar, ij1 ij1Var) {
        super(activity, vnbVar, ij1Var);
        this.d0 = ej1Var;
    }

    @Override // vic, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.d0.x.Q0 && super.canScrollHorizontally(i);
    }
}
