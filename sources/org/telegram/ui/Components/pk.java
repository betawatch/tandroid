package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk implements y4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ pk(al alVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = alVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.y4
    public final void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                al alVar = this.b;
                alVar.u0.d(this.c, alVar.v0, z4, i10, 0L);
                alVar.b.dismiss(true);
                break;
            default:
                al alVar2 = this.b;
                alVar2.u0.d(this.c, alVar2.v0, z4, i10, 0L);
                alVar2.b.dismiss(true);
                break;
        }
    }
}
