package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements k71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;
    public final /* synthetic */ org.telegram.ui.ub c;

    public /* synthetic */ ko(bi biVar, org.telegram.ui.ub ubVar, int i3) {
        this.a = i3;
        this.b = biVar;
        this.c = ubVar;
    }

    @Override // org.telegram.ui.k71
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
