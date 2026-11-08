package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements t4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ ok(wk wkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7) {
        this.a = i7;
        this.b = wkVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.t4
    public final void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                wk wkVar = this.b;
                wkVar.n0.d(this.c, wkVar.o0, z9, i7, 0L);
                wkVar.b.a(true);
                break;
            default:
                wk wkVar2 = this.b;
                wkVar2.n0.d(this.c, wkVar2.o0, z9, i7, 0L);
                wkVar2.b.a(true);
                break;
        }
    }
}
