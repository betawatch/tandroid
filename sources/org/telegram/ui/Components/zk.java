package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ zk(jl jlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = jlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.d5
    public final void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                jl jlVar = this.b;
                jlVar.x0.b(this.c, jlVar.y0, z10, i10, 0L);
                jlVar.b.dismiss(true);
                break;
            default:
                jl jlVar2 = this.b;
                jlVar2.x0.b(this.c, jlVar2.y0, z10, i10, 0L);
                jlVar2.b.dismiss(true);
                break;
        }
    }
}
