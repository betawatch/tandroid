package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ n40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y40 y40Var = this.b;
                y40Var.Y = null;
                y40Var.a0.b();
                y40Var.h.b();
                y40Var.p0();
                y40Var.w0();
                y40Var.x0();
                break;
            case 1:
                y40 y40Var2 = this.b;
                y40Var2.f.r.clearFocus();
                y40Var2.f.r.requestFocus();
                org.telegram.messenger.g0.I3(y40Var2.f.r);
                break;
            case 2:
                this.b.t0();
                break;
            case 3:
                y40 y40Var3 = this.b;
                y40Var3.s0(y40Var3.q0());
                break;
            default:
                y40 y40Var4 = this.b;
                y40Var4.s0(y40Var4.q0());
                break;
        }
    }
}
