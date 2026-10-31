package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x4 implements c5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ x4(f5 f5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // org.telegram.ui.Components.c5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                f5 f5Var = this.b;
                f5Var.e = document;
                f5Var.i(false);
                break;
            default:
                f5 f5Var2 = this.b;
                f5Var2.e = document;
                f5Var2.i(false);
                break;
        }
    }
}
