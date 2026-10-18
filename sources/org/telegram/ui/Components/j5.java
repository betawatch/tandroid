package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements o5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ j5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // org.telegram.ui.Components.o5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                r5 r5Var = this.b;
                r5Var.e = document;
                r5Var.j(false);
                break;
            default:
                r5 r5Var2 = this.b;
                r5Var2.e = document;
                r5Var2.j(false);
                break;
        }
    }
}
