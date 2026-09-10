package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                eo eoVar = ((pj) this.c).b;
                if (i10 > 0 && eoVar.getParentActivity() != null) {
                    org.telegram.ui.Components.wc.a0(eoVar).m(this.b ? org.telegram.ui.Components.vc.G : org.telegram.ui.Components.vc.I, i10, 0, 0, eoVar.ea).j();
                    break;
                }
                break;
            default:
                oj ojVar = (oj) this.c;
                eo eoVar2 = ojVar.b.b;
                if (i10 < 50) {
                    eoVar2.qa(eoVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = eoVar2.e;
                    TLRPC.User user = eoVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.d5.s(eoVar2, true, chat, user, false, false, false, z10, new a1(ojVar, z10));
                    break;
                }
        }
    }
}
