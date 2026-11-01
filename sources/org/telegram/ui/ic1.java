package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;

    public /* synthetic */ ic1(rc1 rc1Var, int i10) {
        this.a = i10;
        this.b = rc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.b.x.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    }
                }
            case 1:
                rc1 rc1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = rc1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        rc1Var.f0[2].P(49);
                        rc1Var.f0[2].T(false, 0.0f);
                        rc1Var.a.d();
                        break;
                    } else {
                        rc1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                rc1 rc1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = rc1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    rc1Var2.n.requestFocus();
                    org.telegram.messenger.i0.J3(rc1Var2.n);
                    break;
                }
                break;
            case 3:
                rc1 rc1Var3 = this.b;
                tc0 tc0Var = rc1Var3.x;
                if (tc0Var != null && tc0Var.getVisibility() == 0) {
                    rc1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                rc1 rc1Var4 = this.b;
                if (rc1Var4.g0 != null) {
                    rc1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                rc1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.i0.h3(new ic1(this.b, 7), 150L);
                break;
            default:
                for (bs bsVar : this.b.x.f) {
                    bsVar.z(0.0f);
                }
                break;
        }
    }
}
