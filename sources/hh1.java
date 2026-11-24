// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hh1 extends yv1 {
    public final /* synthetic */ my0 Gd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(Bundle bundle, my0 my0Var) {
        super(bundle);
        this.Gd = my0Var;
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        my0 my0Var = this.Gd;
        my0Var.X(null);
        my0Var.show();
    }
}
