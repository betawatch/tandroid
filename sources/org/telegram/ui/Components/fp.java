package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements qd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ fp(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // org.telegram.ui.qd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                pp ppVar = this.b.a;
                ppVar.Y.dismissInternal();
                ppVar.dismiss();
                break;
            default:
                pp ppVar2 = this.b.a;
                ppVar2.Y.dismissInternal();
                ppVar2.dismiss();
                break;
        }
    }
}
