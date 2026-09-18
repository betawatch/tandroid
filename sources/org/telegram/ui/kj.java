package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = ((mj) this.c).b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(znVar).m(this.b ? org.telegram.ui.Components.wc.G : org.telegram.ui.Components.wc.I, i10, 0, 0, znVar.ea).j();
                    break;
                }
                break;
            default:
                lj ljVar = (lj) this.c;
                zn znVar2 = ljVar.b.b;
                if (i10 < 50) {
                    znVar2.qa(znVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.e5.s(znVar2, true, chat, user, false, false, false, z10, new y0(ljVar, z10));
                    break;
                }
        }
    }
}
