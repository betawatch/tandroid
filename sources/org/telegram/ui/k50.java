package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ k50(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v50 v50Var = this.b;
                v50Var.X = null;
                v50Var.Z.b();
                v50Var.h.b();
                v50Var.o0();
                v50Var.v0();
                v50Var.w0();
                break;
            case 1:
                v50 v50Var2 = this.b;
                v50Var2.f.r.clearFocus();
                v50Var2.f.r.requestFocus();
                org.telegram.messenger.i0.J3(v50Var2.f.r);
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                v50 v50Var3 = this.b;
                v50Var3.r0(v50Var3.p0());
                break;
            default:
                v50 v50Var4 = this.b;
                v50Var4.r0(v50Var4.p0());
                break;
        }
    }
}
