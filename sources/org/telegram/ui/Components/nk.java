package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk implements x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ nk(xk xkVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i9) {
        this.a = i9;
        this.b = xkVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.x4
    public final void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                xk xkVar = this.b;
                xkVar.t0.d(this.c, xkVar.u0, z10, i9, 0L);
                xkVar.b.dismiss(true);
                break;
            default:
                xk xkVar2 = this.b;
                xkVar2.t0.d(this.c, xkVar2.u0, z10, i9, 0L);
                xkVar2.b.dismiss(true);
                break;
        }
    }
}
