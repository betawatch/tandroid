// default package

import android.app.Activity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
