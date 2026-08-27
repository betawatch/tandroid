package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                rn rnVar = ((dj) this.c).b;
                if (i10 > 0 && rnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(this.b ? org.telegram.ui.Components.lc.C : org.telegram.ui.Components.lc.E, i10, 0, 0, rnVar.aa).j();
                    break;
                }
                break;
            default:
                cj cjVar = (cj) this.c;
                rn rnVar2 = cjVar.b.b;
                if (i10 < 50) {
                    rnVar2.qa(rnVar2.Z3, true);
                    break;
                } else {
                    TLRPC.Chat chat = rnVar2.e;
                    TLRPC.User user = rnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.y4.s(rnVar2, true, chat, user, false, false, false, z10, new c1(cjVar, z10));
                    break;
                }
        }
    }
}
