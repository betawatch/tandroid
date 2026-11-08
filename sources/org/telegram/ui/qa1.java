package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ qa1(za1 za1Var, int i7) {
        this.a = i7;
        this.b = za1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    br[] brVarArr = this.b.x.f;
                    if (i7 >= brVarArr.length) {
                        break;
                    } else {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 1:
                za1 za1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = za1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        za1Var.f0[2].P(49);
                        za1Var.f0[2].T(false, 0.0f);
                        za1Var.a.d();
                        break;
                    } else {
                        za1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                za1 za1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = za1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    za1Var2.n.requestFocus();
                    org.telegram.messenger.g0.K3(za1Var2.n);
                    break;
                }
                break;
            case 3:
                za1 za1Var3 = this.b;
                lb0 lb0Var = za1Var3.x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    za1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                za1 za1Var4 = this.b;
                if (za1Var4.g0 != null) {
                    za1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                za1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new qa1(this.b, 7), 150L);
                break;
            default:
                for (br brVar : this.b.x.f) {
                    brVar.z(0.0f);
                }
                break;
        }
    }
}
