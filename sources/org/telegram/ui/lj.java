package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                co coVar = ((nj) this.c).b;
                if (i10 > 0 && coVar.getParentActivity() != null) {
                    org.telegram.ui.Components.yc.a0(coVar).m(this.b ? org.telegram.ui.Components.xc.G : org.telegram.ui.Components.xc.I, i10, 0, 0, coVar.ea).j();
                    break;
                }
                break;
            default:
                mj mjVar = (mj) this.c;
                co coVar2 = mjVar.b.b;
                if (i10 < 50) {
                    coVar2.qa(coVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = coVar2.e;
                    TLRPC.User user = coVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.e5.s(coVar2, true, chat, user, false, false, false, z10, new z0(mjVar, z10));
                    break;
                }
        }
    }
}
