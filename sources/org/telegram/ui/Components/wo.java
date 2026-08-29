package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements pc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ wo(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // org.telegram.ui.pc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                gp gpVar = this.b.a;
                gpVar.U.dismissInternal();
                gpVar.dismiss();
                break;
            default:
                gp gpVar2 = this.b.a;
                gpVar2.U.dismissInternal();
                gpVar2.dismiss();
                break;
        }
    }
}
