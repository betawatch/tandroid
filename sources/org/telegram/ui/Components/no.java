package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements k71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ no(oo ooVar, int i3) {
        this.a = i3;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.k71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                vo voVar = this.b.a;
                voVar.P1.K();
                voVar.dismiss();
                break;
            default:
                vo voVar2 = this.b.a;
                voVar2.P1.K();
                voVar2.dismiss();
                break;
        }
    }
}
