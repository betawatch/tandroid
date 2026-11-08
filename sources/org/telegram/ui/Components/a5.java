package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
