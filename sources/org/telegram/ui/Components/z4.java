package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements e5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ z4(h5 h5Var, int i7) {
        this.a = i7;
        this.b = h5Var;
    }

    @Override // org.telegram.ui.Components.e5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                h5 h5Var = this.b;
                h5Var.e = document;
                h5Var.i(false);
                break;
            default:
                h5 h5Var2 = this.b;
                h5Var2.e = document;
                h5Var2.i(false);
                break;
        }
    }
}
