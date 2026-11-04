package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ g40(r40 r40Var, int i3) {
        this.a = i3;
        this.b = r40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r40 r40Var = this.b;
                r40Var.Y = null;
                r40Var.a0.b();
                r40Var.h.b();
                r40Var.p0();
                r40Var.w0();
                r40Var.x0();
                break;
            case 1:
                r40 r40Var2 = this.b;
                r40Var2.f.r.clearFocus();
                r40Var2.f.r.requestFocus();
                org.telegram.messenger.g0.K3(r40Var2.f.r);
                break;
            case 2:
                this.b.t0();
                break;
            case 3:
                r40 r40Var3 = this.b;
                r40Var3.s0(r40Var3.q0());
                break;
            default:
                r40 r40Var4 = this.b;
                r40Var4.s0(r40Var4.q0());
                break;
        }
    }
}
