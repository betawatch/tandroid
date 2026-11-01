package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk implements q4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ pk(bl blVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = blVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.q4
    public final void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                blVar.u0.d(this.c, blVar.v0, z10, i10, 0L);
                blVar.b.a(true);
                break;
            default:
                bl blVar2 = this.b;
                blVar2.u0.d(this.c, blVar2.v0, z10, i10, 0L);
                blVar2.b.a(true);
                break;
        }
    }
}
