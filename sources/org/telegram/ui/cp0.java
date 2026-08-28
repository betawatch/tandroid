package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ip0 a;

    public cp0(ip0 ip0Var) {
        this.a = ip0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        ip0 ip0Var = this.a;
        if (i9 == -1) {
            ip0Var.finishFragment();
            return;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                ip0.T(ip0Var, null);
            }
        } else if (ip0Var.R != null) {
            ip0Var.finishFragment(false);
            ip0Var.R.b();
        }
    }
}
