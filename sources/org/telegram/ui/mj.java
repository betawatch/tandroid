package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                bo boVar = ((oj) this.c).b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(this.b ? org.telegram.ui.Components.uc.G : org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.ea).j();
                    break;
                }
                break;
            default:
                nj njVar = (nj) this.c;
                bo boVar2 = njVar.b.b;
                if (i10 < 50) {
                    boVar2.qa(boVar2.d4, true);
                    break;
                } else {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(njVar, z10));
                    break;
                }
        }
    }
}
