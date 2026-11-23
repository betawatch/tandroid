package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ g5(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // org.telegram.ui.Components.l5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.e = document;
                o5Var.i(false);
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.e = document;
                o5Var2.i(false);
                break;
        }
    }
}
