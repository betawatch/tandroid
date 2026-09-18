package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ g5(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // org.telegram.ui.Components.l5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.e = document;
                o5Var.j(false);
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.e = document;
                o5Var2.j(false);
                break;
        }
    }
}
