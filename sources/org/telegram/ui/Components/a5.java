package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements f5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ a5(i5 i5Var, int i7) {
        this.a = i7;
        this.b = i5Var;
    }

    @Override // org.telegram.ui.Components.f5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                i5Var.e = document;
                i5Var.i(false);
                break;
            default:
                i5 i5Var2 = this.b;
                i5Var2.e = document;
                i5Var2.i(false);
                break;
        }
    }
}
