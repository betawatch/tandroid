package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ h2(u2 u2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                if (!u2Var.a() && !u2Var.d) {
                    u2Var.d = false;
                    if (!u2Var.f) {
                        u2Var.f = true;
                        u2Var.b.c();
                    }
                    if (!u2Var.e) {
                        u2Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                u2 u2Var2 = this.b;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = false;
                    if (!u2Var2.f) {
                        u2Var2.f = true;
                        u2Var2.b.c();
                    }
                    if (!u2Var2.e) {
                        u2Var2.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
