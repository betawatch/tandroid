package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements e5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ fl(sl slVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = slVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.e5
    public final void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                sl slVar = this.b;
                slVar.u0.d(this.c, slVar.v0, z10, i10, 0L);
                slVar.b.dismiss(true);
                break;
            default:
                sl slVar2 = this.b;
                slVar2.u0.d(this.c, slVar2.v0, z10, i10, 0L);
                slVar2.b.dismiss(true);
                break;
        }
    }
}
