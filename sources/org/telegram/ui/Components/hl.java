package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements e5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ hl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = rlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.e5
    public final void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                rl rlVar = this.b;
                rlVar.x0.b(this.c, rlVar.y0, z10, i10, 0L);
                rlVar.b.dismiss(true);
                break;
            default:
                rl rlVar2 = this.b;
                rlVar2.x0.b(this.c, rlVar2.y0, z10, i10, 0L);
                rlVar2.b.dismiss(true);
                break;
        }
    }
}
