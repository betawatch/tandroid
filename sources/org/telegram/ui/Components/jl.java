package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl implements f5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ jl(tl tlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = tlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.f5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                tl tlVar = this.b;
                tlVar.x0.b(this.c, tlVar.y0, z10, i10, 0L);
                tlVar.b.dismiss(true);
                break;
            default:
                tl tlVar2 = this.b;
                tlVar2.x0.b(this.c, tlVar2.y0, z10, i10, 0L);
                tlVar2.b.dismiss(true);
                break;
        }
    }
}
