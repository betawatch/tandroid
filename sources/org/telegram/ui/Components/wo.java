package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements org.telegram.ui.s71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ wo(xo xoVar, int i7) {
        this.a = i7;
        this.b = xoVar;
    }

    @Override // org.telegram.ui.s71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                ep epVar = this.b.a;
                epVar.S1.L();
                epVar.dismiss();
                break;
            default:
                ep epVar2 = this.b.a;
                epVar2.S1.L();
                epVar2.dismiss();
                break;
        }
    }
}
