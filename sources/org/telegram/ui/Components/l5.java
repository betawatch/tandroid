package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
