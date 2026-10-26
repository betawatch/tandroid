package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements org.telegram.ui.Components.n20, org.telegram.ui.ActionBar.b2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ r60 b;

    public /* synthetic */ f60(r60 r60Var, int i10) {
        this.a = i10;
        this.b = r60Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        r60 r60Var = this.b;
        r60Var.m0 = i10;
        bi.t1 t1Var = r60Var.F;
        if (t1Var != null) {
            t1Var.setPadding(0, 0, 0, i10);
        }
        r60Var.k0();
        r60Var.i0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.n20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.p0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
