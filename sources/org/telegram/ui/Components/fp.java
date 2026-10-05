package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements od1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ fp(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // org.telegram.ui.od1
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
