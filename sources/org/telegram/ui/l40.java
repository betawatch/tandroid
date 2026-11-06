package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w40 b;

    public /* synthetic */ l40(w40 w40Var, int i7) {
        this.a = i7;
        this.b = w40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w40 w40Var = this.b;
                w40Var.X = null;
                w40Var.Z.b();
                w40Var.h.b();
                w40Var.p0();
                w40Var.w0();
                w40Var.x0();
                break;
            case 1:
                w40 w40Var2 = this.b;
                w40Var2.f.r.clearFocus();
                w40Var2.f.r.requestFocus();
                org.telegram.messenger.g0.K3(w40Var2.f.r);
                break;
            case 2:
                this.b.t0();
                break;
            case 3:
                w40 w40Var3 = this.b;
                w40Var3.s0(w40Var3.q0());
                break;
            default:
                w40 w40Var4 = this.b;
                w40Var4.s0(w40Var4.q0());
                break;
        }
    }
}
