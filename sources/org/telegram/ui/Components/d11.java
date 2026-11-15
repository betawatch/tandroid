package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d11 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ d11(p11 p11Var, int i7) {
        this.a = i7;
        this.b = p11Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                p11 p11Var = this.b;
                if (p11Var.l()) {
                    p11Var.m();
                    break;
                }
                break;
            default:
                p11 p11Var2 = this.b;
                if (p11Var2.l()) {
                    p11Var2.m();
                    break;
                }
                break;
        }
    }
}
