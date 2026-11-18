package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
