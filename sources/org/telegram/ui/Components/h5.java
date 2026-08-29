package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ h5(p5 p5Var, int i10) {
        this.a = i10;
        this.b = p5Var;
    }

    @Override // org.telegram.ui.Components.m5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                p5Var.e = document;
                p5Var.j(false);
                break;
            default:
                p5 p5Var2 = this.b;
                p5Var2.e = document;
                p5Var2.j(false);
                break;
        }
    }
}
