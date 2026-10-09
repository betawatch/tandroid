package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements wd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;
    public final /* synthetic */ org.telegram.ui.fc c;

    public /* synthetic */ pp(yi yiVar, org.telegram.ui.fc fcVar, int i10) {
        this.a = i10;
        this.b = yiVar;
        this.c = fcVar;
    }

    @Override // org.telegram.ui.wd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
            default:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
        }
    }
}
