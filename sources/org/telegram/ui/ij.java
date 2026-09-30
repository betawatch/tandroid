package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                wn wnVar = ((kj) this.c).b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc.a0(wnVar).m(this.b ? org.telegram.ui.Components.xc.G : org.telegram.ui.Components.xc.I, i10, 0, 0, wnVar.ea).j();
                    break;
                }
                break;
            default:
                jj jjVar = (jj) this.c;
                wn wnVar2 = jjVar.b.b;
                if (i10 < 50) {
                    wnVar2.qa(wnVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.e5.s(wnVar2, true, chat, user, false, false, false, z10, new z0(jjVar, z10));
                    break;
                }
        }
    }
}
