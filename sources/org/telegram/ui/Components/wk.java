package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = glVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.b5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                gl glVar = this.b;
                glVar.x0.b(this.c, glVar.y0, z10, i10, 0L);
                glVar.b.dismiss(true);
                break;
            default:
                gl glVar2 = this.b;
                glVar2.x0.b(this.c, glVar2.y0, z10, i10, 0L);
                glVar2.b.dismiss(true);
                break;
        }
    }
}
