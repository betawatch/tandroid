package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ cc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                zc zcVar = this.b;
                zcVar.E = wallPaper;
                zcVar.F = wallPaper;
                zcVar.G = wallPaper;
                zcVar.e1(false);
                zcVar.h1(false);
                org.telegram.messenger.i0.h3(new dc(zcVar, 1), 350L);
                break;
            case 1:
                zc.a0(this.b, (org.telegram.messenger.h3) obj);
                break;
            default:
                this.b.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
