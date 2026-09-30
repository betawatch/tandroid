package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements nd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp b;

    public /* synthetic */ ep(fp fpVar, int i10) {
        this.a = i10;
        this.b = fpVar;
    }

    @Override // org.telegram.ui.nd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                op opVar = this.b.a;
                opVar.Y.dismissInternal();
                opVar.dismiss();
                break;
            default:
                op opVar2 = this.b.a;
                opVar2.Y.dismissInternal();
                opVar2.dismiss();
                break;
        }
    }
}
