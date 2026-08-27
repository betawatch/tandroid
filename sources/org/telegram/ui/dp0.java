package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jp0 a;

    public dp0(jp0 jp0Var) {
        this.a = jp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        jp0 jp0Var = this.a;
        if (i10 == -1) {
            jp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                jp0.U(jp0Var, null);
            }
        } else if (jp0Var.R != null) {
            jp0Var.finishFragment(false);
            jp0Var.R.b();
        }
    }
}
