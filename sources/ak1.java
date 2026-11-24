// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ak1 extends v59 {
    public final /* synthetic */ ek1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(ek1 ek1Var, Activity activity, ylb ylbVar, ik1 ik1Var) {
        super(activity, ylbVar, ik1Var);
        this.d0 = ek1Var;
    }

    @Override // wgc, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.d0.x.Q0 && super.canScrollHorizontally(i);
    }
}
