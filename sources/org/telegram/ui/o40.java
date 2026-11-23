package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z40 b;

    public /* synthetic */ o40(z40 z40Var, int i7) {
        this.a = i7;
        this.b = z40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z40 z40Var = this.b;
                z40Var.Y = null;
                z40Var.a0.b();
                z40Var.h.b();
                z40Var.p0();
                z40Var.w0();
                z40Var.x0();
                break;
            case 1:
                z40 z40Var2 = this.b;
                z40Var2.f.r.clearFocus();
                z40Var2.f.r.requestFocus();
                org.telegram.messenger.g0.I3(z40Var2.f.r);
                break;
            case 2:
                this.b.t0();
                break;
            case 3:
                z40 z40Var3 = this.b;
                z40Var3.s0(z40Var3.q0());
                break;
            default:
                z40 z40Var4 = this.b;
                z40Var4.s0(z40Var4.q0());
                break;
        }
    }
}
