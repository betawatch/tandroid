package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements od1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;
    public final /* synthetic */ org.telegram.ui.gc c;

    public /* synthetic */ cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.a = i10;
        this.b = xiVar;
        this.c = gcVar;
    }

    @Override // org.telegram.ui.od1
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
