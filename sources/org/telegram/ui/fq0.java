package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fq0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ lq0 a;

    public fq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        lq0 lq0Var = this.a;
        if (i10 == -1) {
            lq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                lq0.U(lq0Var, null);
            }
        } else if (lq0Var.V != null) {
            lq0Var.finishFragment(false);
            lq0Var.V.b();
        }
    }
}
