package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements nd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ dp(ep epVar, int i10) {
        this.a = i10;
        this.b = epVar;
    }

    @Override // org.telegram.ui.nd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                np npVar = this.b.a;
                npVar.Y.dismissInternal();
                npVar.dismiss();
                break;
            default:
                np npVar2 = this.b.a;
                npVar2.Y.dismissInternal();
                npVar2.dismiss();
                break;
        }
    }
}
