package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ ga1(ra1 ra1Var, int i3) {
        this.a = i3;
        this.b = ra1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i3 = 0;
                while (true) {
                    zq[] zqVarArr = this.b.x.f;
                    if (i3 >= zqVarArr.length) {
                        break;
                    } else {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    }
                }
            case 1:
                ra1 ra1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = ra1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        ra1Var.g0[2].P(49);
                        ra1Var.g0[2].T(false, 0.0f);
                        ra1Var.a.d();
                        break;
                    } else {
                        ra1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                ra1 ra1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = ra1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    ra1Var2.n.requestFocus();
                    org.telegram.messenger.g0.K3(ra1Var2.n);
                    break;
                }
                break;
            case 3:
                ra1 ra1Var3 = this.b;
                ib0 ib0Var = ra1Var3.x;
                if (ib0Var != null && ib0Var.getVisibility() == 0) {
                    ra1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                ra1 ra1Var4 = this.b;
                if (ra1Var4.h0 != null) {
                    ra1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                ra1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new ga1(this.b, 7), 150L);
                break;
            default:
                for (zq zqVar : this.b.x.f) {
                    zqVar.z(0.0f);
                }
                break;
        }
    }
}
