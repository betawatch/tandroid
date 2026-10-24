package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ gl(rl rlVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.a = i10;
        this.b = rlVar;
        this.c = tL_messageMediaVenue;
    }

    @Override // org.telegram.ui.Components.d5
    public final void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                rl rlVar = this.b;
                rlVar.v0.b(this.c, rlVar.w0, z10, i10, 0L);
                rlVar.b.dismiss(true);
                break;
            default:
                rl rlVar2 = this.b;
                rlVar2.v0.b(this.c, rlVar2.w0, z10, i10, 0L);
                rlVar2.b.dismiss(true);
                break;
        }
    }
}
