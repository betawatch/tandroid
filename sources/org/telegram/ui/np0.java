package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ up0 a;

    public np0(up0 up0Var) {
        this.a = up0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        up0 up0Var = this.a;
        if (i10 == -1) {
            up0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                up0.U(up0Var, null);
            }
        } else if (up0Var.V != null) {
            up0Var.finishFragment(false);
            up0Var.V.b();
        }
    }
}
