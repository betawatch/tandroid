package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
