package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j91;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements j91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ vo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // org.telegram.ui.j91
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
