package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sk0 h;

    public /* synthetic */ s50(sk0 sk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = sk0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c60 c60Var = ((x50) this.h).c;
                iz0.b(c60Var.getContext(), c60Var.a, -c60Var.X1, this.b, this.c, this.d, this.e, this.f, c60Var.I0);
                break;
            default:
                zt0 zt0Var = ((ks0) this.h).f;
                iz0.b(zt0Var.getContext(), zt0Var.x1.getCurrentAccount(), zt0Var.l1, this.b, this.c, this.d, this.e, this.f, zt0Var.H1);
                break;
        }
    }
}
