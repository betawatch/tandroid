package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = ((oj) this.c).b;
                if (i10 > 0 && znVar.getParentActivity() != null) {
                    org.telegram.ui.Components.ad.a0(znVar).m(this.b ? org.telegram.ui.Components.zc.G : org.telegram.ui.Components.zc.I, i10, 0, 0, znVar.ea).j();
                    break;
                }
                break;
            default:
                nj njVar = (nj) this.c;
                zn znVar2 = njVar.b.b;
                if (i10 < 50) {
                    znVar2.va(znVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = znVar2.e;
                    TLRPC.User user = znVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.g5.r(znVar2, true, chat, user, false, false, false, z10, new z0(njVar, z10));
                    break;
                }
        }
    }
}
