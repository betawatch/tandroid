// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e04 implements View.OnFocusChangeListener {
    public final /* synthetic */ e34 a;

    public e04(e34 e34Var) {
        this.a = e34Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = gm.F0();
            e34 e34Var = this.a;
            e34Var.X0 = F0;
            hs6.d0(e34Var.d1).O(e34Var.X0, false);
        }
    }
}
