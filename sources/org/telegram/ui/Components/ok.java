package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
