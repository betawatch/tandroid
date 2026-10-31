package mg;

import android.view.View;
import org.telegram.ui.ActionBar.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.u1, r0.m {
    public final /* synthetic */ z2 a;

    public /* synthetic */ c(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.a.b0(j1Var);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a.dismiss();
        i2.l1(0, null);
    }
}
