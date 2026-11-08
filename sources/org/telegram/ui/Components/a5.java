package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
