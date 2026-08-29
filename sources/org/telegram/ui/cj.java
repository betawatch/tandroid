package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                tn tnVar = ((ej) this.c).b;
                if (i10 > 0 && tnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.tc.a0(tnVar).m(this.b ? org.telegram.ui.Components.sc.C : org.telegram.ui.Components.sc.E, i10, 0, 0, tnVar.aa).j();
                    break;
                }
                break;
            default:
                dj djVar = (dj) this.c;
                tn tnVar2 = djVar.b.b;
                if (i10 < 50) {
                    tnVar2.qa(tnVar2.Z3, true);
                    break;
                } else {
                    TLRPC.Chat chat = tnVar2.e;
                    TLRPC.User user = tnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.c5.s(tnVar2, true, chat, user, false, false, false, z10, new c1(djVar, z10));
                    break;
                }
        }
    }
}
