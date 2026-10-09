package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements wd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp b;

    public /* synthetic */ sp(tp tpVar, int i10) {
        this.a = i10;
        this.b = tpVar;
    }

    @Override // org.telegram.ui.wd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                cq cqVar = this.b.a;
                cqVar.Y.dismissInternal();
                cqVar.dismiss();
                break;
            default:
                cq cqVar2 = this.b.a;
                cqVar2.Y.dismissInternal();
                cqVar2.dismiss();
                break;
        }
    }
}
