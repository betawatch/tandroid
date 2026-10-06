package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                yn ynVar = ((lj) this.c).b;
                if (i10 > 0 && ynVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc.a0(ynVar).m(this.b ? org.telegram.ui.Components.xc.G : org.telegram.ui.Components.xc.I, i10, 0, 0, ynVar.ca).j();
                    break;
                }
                break;
            default:
                kj kjVar = (kj) this.c;
                yn ynVar2 = kjVar.b.b;
                if (i10 < 50) {
                    ynVar2.pa(ynVar2.b4, true);
                    break;
                } else {
                    TLRPC.Chat chat = ynVar2.e;
                    TLRPC.User user = ynVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.e5.s(ynVar2, true, chat, user, false, false, false, z10, new z0(kjVar, z10));
                    break;
                }
        }
    }
}
