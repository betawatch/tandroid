package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ g5(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // org.telegram.ui.Components.l5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.e = document;
                o5Var.j(false);
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.e = document;
                o5Var2.j(false);
                break;
        }
    }
}
