package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements w71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ no b;

    public /* synthetic */ mo(no noVar, int i7) {
        this.a = i7;
        this.b = noVar;
    }

    @Override // org.telegram.ui.w71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                vo voVar = this.b.a;
                voVar.R1.K();
                voVar.dismiss();
                break;
            default:
                vo voVar2 = this.b.a;
                voVar2.R1.K();
                voVar2.dismiss();
                break;
        }
    }
}
