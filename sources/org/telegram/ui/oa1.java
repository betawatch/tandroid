package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa1 b;

    public /* synthetic */ oa1(xa1 xa1Var, int i7) {
        this.a = i7;
        this.b = xa1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    dr[] drVarArr = this.b.x.f;
                    if (i7 >= drVarArr.length) {
                        break;
                    } else {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    }
                }
            case 1:
                xa1 xa1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = xa1Var.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        xa1Var.g0[2].P(49);
                        xa1Var.g0[2].T(false, 0.0f);
                        xa1Var.a.d();
                        break;
                    } else {
                        xa1Var.K0(true);
                        break;
                    }
                }
                break;
            case 2:
                xa1 xa1Var2 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = xa1Var2.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    xa1Var2.n.requestFocus();
                    org.telegram.messenger.g0.J3(xa1Var2.n);
                    break;
                }
                break;
            case 3:
                xa1 xa1Var3 = this.b;
                lb0 lb0Var = xa1Var3.x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    xa1Var3.x.f[0].requestFocus();
                    break;
                }
                break;
            case 4:
                xa1 xa1Var4 = this.b;
                if (xa1Var4.h0 != null) {
                    xa1Var4.K0(false);
                    break;
                }
                break;
            case 5:
                xa1.k0(this.b);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new oa1(this.b, 7), 150L);
                break;
            default:
                for (dr drVar : this.b.x.f) {
                    drVar.A(0.0f);
                }
                break;
        }
    }
}
