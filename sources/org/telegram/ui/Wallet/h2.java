package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ h2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                if (!t2Var.a() && !t2Var.d) {
                    t2Var.d = false;
                    if (!t2Var.f) {
                        t2Var.f = true;
                        t2Var.b.c();
                    }
                    if (!t2Var.e) {
                        t2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                t2 t2Var2 = this.b;
                if (!t2Var2.a() && !t2Var2.d) {
                    t2Var2.d = false;
                    if (!t2Var2.f) {
                        t2Var2.f = true;
                        t2Var2.b.c();
                    }
                    if (!t2Var2.e) {
                        t2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
