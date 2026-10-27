package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                wn wnVar = ((jj) this.c).b;
                if (i10 > 0 && wnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc.b0(wnVar).m(this.b ? org.telegram.ui.Components.vc.G : org.telegram.ui.Components.vc.I, i10, 0, 0, wnVar.ua).j();
                    break;
                }
                break;
            default:
                ij ijVar = (ij) this.c;
                wn wnVar2 = ijVar.b.b;
                if (i10 < 50) {
                    wnVar2.Da(wnVar2.p4, true);
                    break;
                } else {
                    TLRPC.Chat chat = wnVar2.e;
                    TLRPC.User user = wnVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.g5.r(wnVar2, true, chat, user, false, false, false, z10, new y0(ijVar, z10));
                    break;
                }
        }
    }
}
