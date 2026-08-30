package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements i5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ d5(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // org.telegram.ui.Components.i5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.e = document;
                l5Var.j(false);
                break;
            default:
                l5 l5Var2 = this.b;
                l5Var2.e = document;
                l5Var2.j(false);
                break;
        }
    }
}
