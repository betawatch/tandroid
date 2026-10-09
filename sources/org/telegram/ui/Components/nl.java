package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl implements f5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ nl(xl xlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = xlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.f5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                xl xlVar = this.b;
                xlVar.x0.b(this.c, xlVar.y0, z10, i10, 0L);
                xlVar.b.dismiss(true);
                break;
            default:
                xl xlVar2 = this.b;
                xlVar2.x0.b(this.c, xlVar2.y0, z10, i10, 0L);
                xlVar2.b.dismiss(true);
                break;
        }
    }
}
