package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
