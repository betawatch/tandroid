package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dm0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ qm0 a;

    public dm0(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        qm0 qm0Var = this.a;
        if (i10 == -1) {
            if (qm0Var.P0) {
                return;
            }
            qm0Var.finishFragment();
            return;
        }
        if (i10 != 1 || qm0Var.P0) {
            return;
        }
        if (qm0Var.u0 != 3) {
            org.telegram.messenger.i0.v1(qm0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = qm0Var.u0;
        if (i11 == 0) {
            qm0Var.J0(true);
            qm0.r0(qm0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.m6[] m6VarArr = qm0Var.h;
                if (i12 >= m6VarArr.length) {
                    break;
                }
                if (m6VarArr[i12].b.f) {
                    qm0Var.G0 = qm0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            qm0Var.z0();
            return;
        }
        if (i11 == 2) {
            qm0.o0(qm0Var);
        } else if (i11 == 3) {
            qm0.p0(qm0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            qm0Var.G0(false);
        }
    }
}
