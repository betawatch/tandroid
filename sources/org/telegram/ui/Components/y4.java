package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ y4(g5 g5Var, int i7) {
        this.a = i7;
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
