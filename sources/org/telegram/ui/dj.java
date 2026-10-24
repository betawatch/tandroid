package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                sn snVar = ((fj) this.c).b;
                if (i10 > 0 && snVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(snVar).m(this.b ? org.telegram.ui.Components.wc.G : org.telegram.ui.Components.wc.I, i10, 0, 0, snVar.qa).j();
                    break;
                }
                break;
            default:
                ej ejVar = (ej) this.c;
                sn snVar2 = ejVar.b.b;
                if (i10 < 50) {
                    snVar2.va(snVar2.p4, true);
                    break;
                } else {
                    TLRPC.Chat chat = snVar2.e;
                    TLRPC.User user = snVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.f5.s(snVar2, true, chat, user, false, false, false, z10, new a1(ejVar, z10));
                    break;
                }
        }
    }
}
