package mg;

import android.view.View;
import org.telegram.ui.ActionBar.z2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
