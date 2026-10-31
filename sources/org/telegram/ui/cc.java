package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc b;

    public /* synthetic */ cc(zc zcVar, int i10) {
        this.a = i10;
        this.b = zcVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                zc zcVar = this.b;
                zcVar.E = wallPaper;
                zcVar.F = wallPaper;
                zcVar.G = wallPaper;
                zcVar.d1(false);
                zcVar.g1(false);
                org.telegram.messenger.i0.h3(new dc(zcVar, 1), 350L);
                break;
            case 1:
                zc.Z(this.b, (org.telegram.messenger.h3) obj);
                break;
            default:
                this.b.c1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
