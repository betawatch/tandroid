package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements u71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ no(oo ooVar, int i7) {
        this.a = i7;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.u71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                vo voVar = this.b.a;
                voVar.O1.K();
                voVar.dismiss();
                break;
            default:
                vo voVar2 = this.b.a;
                voVar2.O1.K();
                voVar2.dismiss();
                break;
        }
    }
}
