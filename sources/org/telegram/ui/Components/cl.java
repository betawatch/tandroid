package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements z4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ cl(kl klVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.a = i7;
        this.b = klVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.z4
    public final void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                kl klVar = this.b;
                klVar.o0.d(this.c, klVar.p0, z10, i7, 0L);
                klVar.b.a(true);
                break;
            default:
                kl klVar2 = this.b;
                klVar2.o0.d(this.c, klVar2.p0, z10, i7, 0L);
                klVar2.b.a(true);
                break;
        }
    }
}
