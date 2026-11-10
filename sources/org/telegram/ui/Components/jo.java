package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;
    public final /* synthetic */ org.telegram.ui.wb c;

    public /* synthetic */ jo(ci ciVar, org.telegram.ui.wb wbVar, int i7) {
        this.a = i7;
        this.b = ciVar;
        this.c = wbVar;
    }

    @Override // org.telegram.ui.w71
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
