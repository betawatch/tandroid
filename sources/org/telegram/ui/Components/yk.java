package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ yk(il ilVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = ilVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.d5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                il ilVar = this.b;
                ilVar.x0.b(this.c, ilVar.y0, z10, i10, 0L);
                ilVar.b.dismiss(true);
                break;
            default:
                il ilVar2 = this.b;
                ilVar2.x0.b(this.c, ilVar2.y0, z10, i10, 0L);
                ilVar2.b.dismiss(true);
                break;
        }
    }
}
