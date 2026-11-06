package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements t71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ org.telegram.ui.wb c;

    public /* synthetic */ ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.a = i7;
        this.b = diVar;
        this.c = wbVar;
    }

    @Override // org.telegram.ui.t71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.K();
                this.c.a(tL_wallPaper);
                break;
            default:
                this.b.K();
                this.c.a(tL_wallPaper);
                break;
        }
    }
}
