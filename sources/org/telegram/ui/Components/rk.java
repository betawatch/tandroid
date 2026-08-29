package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ rk(bl blVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = blVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.b5
    public final void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                blVar.t0.d(this.c, blVar.u0, z10, i10, 0L);
                blVar.b.dismiss(true);
                break;
            default:
                bl blVar2 = this.b;
                blVar2.t0.d(this.c, blVar2.u0, z10, i10, 0L);
                blVar2.b.dismiss(true);
                break;
        }
    }
}
