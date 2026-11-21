package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ h5(p5 p5Var, int i7) {
        this.a = i7;
        this.b = p5Var;
    }

    @Override // org.telegram.ui.Components.m5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                p5Var.e = document;
                p5Var.i(false);
                break;
            default:
                p5 p5Var2 = this.b;
                p5Var2.e = document;
                p5Var2.i(false);
                break;
        }
    }
}
