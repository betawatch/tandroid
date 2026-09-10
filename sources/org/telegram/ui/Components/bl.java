package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements c5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ bl(ll llVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = llVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.c5
    public final void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                ll llVar = this.b;
                llVar.x0.b(this.c, llVar.y0, z10, i10, 0L);
                llVar.b.dismiss(true);
                break;
            default:
                ll llVar2 = this.b;
                llVar2.x0.b(this.c, llVar2.y0, z10, i10, 0L);
                llVar2.b.dismiss(true);
                break;
        }
    }
}
