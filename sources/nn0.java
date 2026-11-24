// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn0 implements ee, py4, qq7 {
    public final /* synthetic */ my0 a;

    public /* synthetic */ nn0(my0 my0Var) {
        this.a = my0Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        return this.a.Y(wzcVar);
    }

    @Override // py4
    public final int i() {
        return cmb.v0(cmb.g5, this.a.J0);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        this.a.dismiss();
        yw4.f1(false, null);
    }
}
