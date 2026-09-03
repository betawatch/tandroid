package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements id1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp b;

    public /* synthetic */ bp(cp cpVar, int i10) {
        this.a = i10;
        this.b = cpVar;
    }

    @Override // org.telegram.ui.id1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b.a;
                mpVar.V.dismissInternal();
                mpVar.dismiss();
                break;
            default:
                mp mpVar2 = this.b.a;
                mpVar2.V.dismissInternal();
                mpVar2.dismiss();
                break;
        }
    }
}
