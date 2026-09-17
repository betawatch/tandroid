package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = glVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.d5
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
