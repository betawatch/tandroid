// default package

import android.app.Activity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
