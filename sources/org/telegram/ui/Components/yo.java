package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements id1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;

    public /* synthetic */ yo(zo zoVar, int i10) {
        this.a = i10;
        this.b = zoVar;
    }

    @Override // org.telegram.ui.id1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                jp jpVar = this.b.a;
                jpVar.V.dismissInternal();
                jpVar.dismiss();
                break;
            default:
                jp jpVar2 = this.b.a;
                jpVar2.V.dismissInternal();
                jpVar2.dismiss();
                break;
        }
    }
}
