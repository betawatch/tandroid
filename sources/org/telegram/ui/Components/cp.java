package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements qd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;
    public final /* synthetic */ org.telegram.ui.gc c;

    public /* synthetic */ cp(xi xiVar, org.telegram.ui.gc gcVar, int i10) {
        this.a = i10;
        this.b = xiVar;
        this.c = gcVar;
    }

    @Override // org.telegram.ui.qd1
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
