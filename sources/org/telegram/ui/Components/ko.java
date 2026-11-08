package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements u71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ org.telegram.ui.wb c;

    public /* synthetic */ ko(di diVar, org.telegram.ui.wb wbVar, int i7) {
        this.a = i7;
        this.b = diVar;
        this.c = wbVar;
    }

    @Override // org.telegram.ui.u71
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
