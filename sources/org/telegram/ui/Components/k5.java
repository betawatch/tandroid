package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
