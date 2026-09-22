package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
