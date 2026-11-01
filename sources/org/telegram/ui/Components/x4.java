package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
