package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.j91;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements j91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;
    public final /* synthetic */ org.telegram.ui.cc c;

    public /* synthetic */ so(bi biVar, org.telegram.ui.cc ccVar, int i10) {
        this.a = i10;
        this.b = biVar;
        this.c = ccVar;
    }

    @Override // org.telegram.ui.j91
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
            default:
                this.b.L();
                this.c.a(tL_wallPaper);
                break;
        }
    }
}
