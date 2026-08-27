package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk implements x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ jk(tk tkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = tkVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.x4
    public final void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                tk tkVar = this.b;
                tkVar.t0.d(this.c, tkVar.u0, z10, i10, 0L);
                tkVar.b.dismiss(true);
                break;
            default:
                tk tkVar2 = this.b;
                tkVar2.t0.d(this.c, tkVar2.u0, z10, i10, 0L);
                tkVar2.b.dismiss(true);
                break;
        }
    }
}
