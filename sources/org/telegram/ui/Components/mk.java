package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements r4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ mk(uk ukVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i3) {
        this.a = i3;
        this.b = ukVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.r4
    public final void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                uk ukVar = this.b;
                ukVar.o0.d(this.c, ukVar.p0, z10, i3, 0L);
                ukVar.b.a(true);
                break;
            default:
                uk ukVar2 = this.b;
                ukVar2.o0.d(this.c, ukVar2.p0, z10, i3, 0L);
                ukVar2.b.a(true);
                break;
        }
    }
}
