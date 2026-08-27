package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements h5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ c5(k5 k5Var, int i10) {
        this.a = i10;
        this.b = k5Var;
    }

    @Override // org.telegram.ui.Components.h5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                k5Var.e = document;
                k5Var.j(false);
                break;
            default:
                k5 k5Var2 = this.b;
                k5Var2.e = document;
                k5Var2.j(false);
                break;
        }
    }
}
