package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ i2(u2 u2Var, int i7) {
        this.a = i7;
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
