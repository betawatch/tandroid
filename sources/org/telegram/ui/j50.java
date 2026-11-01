package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ j50(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u50 u50Var = this.b;
                u50Var.X = null;
                u50Var.Z.b();
                u50Var.h.b();
                u50Var.p0();
                u50Var.w0();
                u50Var.x0();
                break;
            case 1:
                u50 u50Var2 = this.b;
                u50Var2.f.r.clearFocus();
                u50Var2.f.r.requestFocus();
                org.telegram.messenger.i0.J3(u50Var2.f.r);
                break;
            case 2:
                this.b.t0();
                break;
            case 3:
                u50 u50Var3 = this.b;
                u50Var3.s0(u50Var3.q0());
                break;
            default:
                u50 u50Var4 = this.b;
                u50Var4.s0(u50Var4.q0());
                break;
        }
    }
}
