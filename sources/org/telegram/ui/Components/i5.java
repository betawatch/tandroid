package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements n5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ i5(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // org.telegram.ui.Components.n5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                q5Var.e = document;
                q5Var.j(false);
                break;
            default:
                q5 q5Var2 = this.b;
                q5Var2.e = document;
                q5Var2.j(false);
                break;
        }
    }
}
