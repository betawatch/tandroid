// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jt0 extends nk3 {
    public final /* synthetic */ p I4;
    public final /* synthetic */ lt0 J4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(lt0 lt0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.J4 = lt0Var;
        this.I4 = pVar;
    }

    @Override // nk3
    public final boolean e3() {
        return true;
    }

    @Override // nk3, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        lt0 lt0Var = this.J4;
        if (lt0Var.X1) {
            return;
        }
        lt0Var.X1 = true;
        this.I4.a("USER_DECLINED", null);
    }
}
