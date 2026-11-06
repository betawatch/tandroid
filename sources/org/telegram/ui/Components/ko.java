package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
