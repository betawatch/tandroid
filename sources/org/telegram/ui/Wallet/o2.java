package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ o2(z2 z2Var, int i7) {
        this.a = i7;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                if (!z2Var.a() && !z2Var.d) {
                    z2Var.d = false;
                    if (!z2Var.f) {
                        z2Var.f = true;
                        z2Var.b.c();
                    }
                    if (!z2Var.e) {
                        z2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                z2 z2Var2 = this.b;
                if (!z2Var2.a() && !z2Var2.d) {
                    z2Var2.d = false;
                    if (!z2Var2.f) {
                        z2Var2.f = true;
                        z2Var2.b.c();
                    }
                    if (!z2Var2.e) {
                        z2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
