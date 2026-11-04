package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ y4(g5 g5Var, int i3) {
        this.a = i3;
        this.b = g5Var;
    }

    @Override // org.telegram.ui.Components.d5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                g5Var.e = document;
                g5Var.i(false);
                break;
            default:
                g5 g5Var2 = this.b;
                g5Var2.e = document;
                g5Var2.i(false);
                break;
        }
    }
}
