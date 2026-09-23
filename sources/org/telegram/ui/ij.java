package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ij(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                xn xnVar = ((kj) this.c).b;
                if (i10 > 0 && xnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(this.b ? org.telegram.ui.Components.wc.G : org.telegram.ui.Components.wc.I, i10, 0, 0, xnVar.ea).j();
                    break;
                }
                break;
            default:
                jj jjVar = (jj) this.c;
                xn xnVar2 = jjVar.b.b;
                if (i10 < 50) {
                    xnVar2.qa(xnVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = xnVar2.e;
                    TLRPC.User user = xnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.e5.s(xnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    break;
                }
        }
    }
}
