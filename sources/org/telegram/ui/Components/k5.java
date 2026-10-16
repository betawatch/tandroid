package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements p5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ k5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // org.telegram.ui.Components.p5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                s5 s5Var = this.b;
                s5Var.e = document;
                s5Var.j(false);
                break;
            default:
                s5 s5Var2 = this.b;
                s5Var2.e = document;
                s5Var2.j(false);
                break;
        }
    }
}
