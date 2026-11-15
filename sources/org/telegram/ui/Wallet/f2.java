package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ f2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                if (!r2Var.a() && !r2Var.d) {
                    r2Var.d = false;
                    if (!r2Var.f) {
                        r2Var.f = true;
                        r2Var.b.c();
                    }
                    if (!r2Var.e) {
                        r2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                r2 r2Var2 = this.b;
                if (!r2Var2.a() && !r2Var2.d) {
                    r2Var2.d = false;
                    if (!r2Var2.f) {
                        r2Var2.f = true;
                        r2Var2.b.c();
                    }
                    if (!r2Var2.e) {
                        r2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
