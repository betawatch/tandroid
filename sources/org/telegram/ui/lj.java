package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                bo boVar = ((nj) this.c).b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(this.b ? org.telegram.ui.Components.uc.G : org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.ea).j();
                    break;
                }
                break;
            default:
                mj mjVar = (mj) this.c;
                bo boVar2 = mjVar.b.b;
                if (i10 < 50) {
                    boVar2.qa(boVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    break;
                }
        }
    }
}
