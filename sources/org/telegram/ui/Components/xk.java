package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ xk(hl hlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = hlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.d5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                hl hlVar = this.b;
                hlVar.x0.b(this.c, hlVar.y0, z10, i10, 0L);
                hlVar.b.dismiss(true);
                break;
            default:
                hl hlVar2 = this.b;
                hlVar2.x0.b(this.c, hlVar2.y0, z10, i10, 0L);
                hlVar2.b.dismiss(true);
                break;
        }
    }
}
