package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ pa1(ya1 ya1Var, int i7) {
        this.a = i7;
        this.b = ya1Var;
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
                ya1 ya1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = ya1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        ya1Var.f0[2].P(49);
                        ya1Var.f0[2].T(false, 0.0f);
                        ya1Var.a.d();
                        break;
                    } else {
                        ya1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                ya1 ya1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = ya1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    ya1Var2.n.requestFocus();
                    org.telegram.messenger.g0.K3(ya1Var2.n);
                    break;
                }
                break;
            case 3:
                ya1 ya1Var3 = this.b;
                lb0 lb0Var = ya1Var3.x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    ya1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                ya1 ya1Var4 = this.b;
                if (ya1Var4.g0 != null) {
                    ya1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                ya1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new pa1(this.b, 7), 150L);
                break;
            default:
                for (br brVar : this.b.x.f) {
                    brVar.z(0.0f);
                }
                break;
        }
    }
}
