package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements y4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ rk(cl clVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = clVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.y4
    public final void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                cl clVar = this.b;
                clVar.u0.d(this.c, clVar.v0, z4, i10, 0L);
                clVar.b.dismiss(true);
                break;
            default:
                cl clVar2 = this.b;
                clVar2.u0.d(this.c, clVar2.v0, z4, i10, 0L);
                clVar2.b.dismiss(true);
                break;
        }
    }
}
