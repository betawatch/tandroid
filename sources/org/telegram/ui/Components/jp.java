package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements lc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ org.telegram.ui.hc c;

    public /* synthetic */ jp(ti tiVar, org.telegram.ui.hc hcVar, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = hcVar;
    }

    @Override // org.telegram.ui.lc1
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
