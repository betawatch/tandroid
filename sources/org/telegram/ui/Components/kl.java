package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements f5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ kl(ul ulVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = ulVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.f5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                ul ulVar = this.b;
                ulVar.x0.b(this.c, ulVar.y0, z10, i10, 0L);
                ulVar.b.dismiss(true);
                break;
            default:
                ul ulVar2 = this.b;
                ulVar2.x0.b(this.c, ulVar2.y0, z10, i10, 0L);
                ulVar2.b.dismiss(true);
                break;
        }
    }
}
