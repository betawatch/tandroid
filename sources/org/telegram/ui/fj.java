package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                sn snVar = ((hj) this.c).b;
                if (i10 > 0 && snVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(snVar).m(this.b ? org.telegram.ui.Components.wc.G : org.telegram.ui.Components.wc.I, i10, 0, 0, snVar.ea).j();
                    break;
                }
                break;
            default:
                gj gjVar = (gj) this.c;
                sn snVar2 = gjVar.b.b;
                if (i10 < 50) {
                    snVar2.va(snVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = snVar2.e;
                    TLRPC.User user = snVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.f5.r(snVar2, true, chat, user, false, false, false, z10, new b1(gjVar, z10));
                    break;
                }
        }
    }
}
