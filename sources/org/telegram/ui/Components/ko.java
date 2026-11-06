package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
