package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ h5(p5 p5Var, int i7) {
        this.a = i7;
        this.b = p5Var;
    }

    @Override // org.telegram.ui.Components.m5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                p5Var.e = document;
                p5Var.i(false);
                break;
            default:
                p5 p5Var2 = this.b;
                p5Var2.e = document;
                p5Var2.i(false);
                break;
        }
    }
}
