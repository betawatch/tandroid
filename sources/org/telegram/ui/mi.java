package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi implements org.telegram.messenger.kr {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mi(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                wm wmVar = ((oi) this.c).b;
                if (i3 > 0 && wmVar.getParentActivity() != null) {
                    org.telegram.ui.Components.fc.a0(wmVar).m(this.b ? org.telegram.ui.Components.ec.H : org.telegram.ui.Components.ec.J, i3, 0, 0, wmVar.ya).j();
                    break;
                }
                break;
            default:
                ni niVar = (ni) this.c;
                wm wmVar2 = niVar.b.b;
                if (i3 < 50) {
                    wmVar2.Qa(wmVar2.s4, true);
                    break;
                } else {
                    TLRPC.Chat chat = wmVar2.e;
                    TLRPC.User user = wmVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.t4.r(wmVar2, true, chat, user, false, false, false, z10, new x0(niVar, z10));
                    break;
                }
        }
    }
}
