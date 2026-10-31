package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ kc1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
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
                tc1 tc1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = tc1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        tc1Var.f0[2].P(49);
                        tc1Var.f0[2].T(false, 0.0f);
                        tc1Var.a.d();
                        break;
                    } else {
                        tc1Var.J0(true);
                        break;
                    }
                }
                break;
            case 2:
                tc1 tc1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = tc1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    tc1Var2.n.requestFocus();
                    org.telegram.messenger.i0.J3(tc1Var2.n);
                    break;
                }
                break;
            case 3:
                tc1 tc1Var3 = this.b;
                uc0 uc0Var = tc1Var3.x;
                if (uc0Var != null && uc0Var.getVisibility() == 0) {
                    tc1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                tc1 tc1Var4 = this.b;
                if (tc1Var4.g0 != null) {
                    tc1Var4.J0(false);
                    break;
                }
                break;
            case 5:
                tc1.j0(this.b);
                break;
            case 6:
                org.telegram.messenger.i0.h3(new kc1(this.b, 7), 150L);
                break;
            default:
                for (bs bsVar : this.b.x.f) {
                    bsVar.z(0.0f);
                }
                break;
        }
    }
}
