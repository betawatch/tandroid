package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements h5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ c5(k5 k5Var, int i9) {
        this.a = i9;
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
