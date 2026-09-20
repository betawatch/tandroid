package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ h5(p5 p5Var, int i10) {
        this.a = i10;
        this.b = p5Var;
    }

    @Override // org.telegram.ui.Components.m5
    public final void a(TLRPC.Document document) {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                p5Var.e = document;
                p5Var.j(false);
                break;
            default:
                p5 p5Var2 = this.b;
                p5Var2.e = document;
                p5Var2.j(false);
                break;
        }
    }
}
