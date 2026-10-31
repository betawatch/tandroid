package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld0 b;

    public /* synthetic */ jd0(ld0 ld0Var, int i10) {
        this.a = i10;
        this.b = ld0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld0 ld0Var = this.b;
                org.telegram.ui.ActionBar.n0 n0Var = ld0Var.c;
                n0Var.requestFocus();
                String str = ld0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = n0Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ld0Var.K.length() + i10;
                        n0Var.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), n0Var.getText().length());
                        break;
                    }
                }
                n0Var.setSelection(0, n0Var.getText().length());
                break;
            case 1:
                this.b.p(true);
                break;
            case 2:
                this.b.n(false);
                break;
            default:
                org.telegram.ui.ActionBar.n0 n0Var2 = this.b.c;
                if (n0Var2 != null) {
                    n0Var2.requestFocus();
                    n0Var2.setSelection(n0Var2.length());
                    org.telegram.messenger.i0.J3(n0Var2);
                    break;
                }
                break;
        }
    }
}
