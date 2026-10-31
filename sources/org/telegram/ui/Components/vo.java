package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.l91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements l91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ vo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // org.telegram.ui.l91
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                dp dpVar = this.b.a;
                dpVar.O1.L();
                dpVar.dismiss();
                break;
            default:
                dp dpVar2 = this.b.a;
                dpVar2.O1.L();
                dpVar2.dismiss();
                break;
        }
    }
}
