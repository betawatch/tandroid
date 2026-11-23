package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ n2(y2 y2Var, int i7) {
        this.a = i7;
        this.b = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                if (!y2Var.a() && !y2Var.d) {
                    y2Var.d = false;
                    if (!y2Var.f) {
                        y2Var.f = true;
                        y2Var.b.c();
                    }
                    if (!y2Var.e) {
                        y2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                y2 y2Var2 = this.b;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = false;
                    if (!y2Var2.f) {
                        y2Var2.f = true;
                        y2Var2.b.c();
                    }
                    if (!y2Var2.e) {
                        y2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
