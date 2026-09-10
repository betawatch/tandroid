package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ kq0 a;

    public eq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        kq0 kq0Var = this.a;
        if (i10 == -1) {
            kq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                kq0.U(kq0Var, null);
            }
        } else if (kq0Var.V != null) {
            kq0Var.finishFragment(false);
            kq0Var.V.b();
        }
    }
}
