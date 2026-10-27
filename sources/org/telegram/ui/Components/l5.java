package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements q5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ l5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // org.telegram.ui.Components.q5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.e = document;
                t5Var.j(false);
                break;
            default:
                t5 t5Var2 = this.b;
                t5Var2.e = document;
                t5Var2.j(false);
                break;
        }
    }
}
