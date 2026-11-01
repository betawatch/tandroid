package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lj(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                un unVar = ((nj) this.c).b;
                if (i10 > 0 && unVar.getParentActivity() != null) {
                    org.telegram.ui.Components.cc.a0(unVar).m(this.b ? org.telegram.ui.Components.bc.G : org.telegram.ui.Components.bc.I, i10, 0, 0, unVar.xa).j();
                    break;
                }
                break;
            default:
                mj mjVar = (mj) this.c;
                un unVar2 = mjVar.b.b;
                if (i10 < 50) {
                    unVar2.La(unVar2.r4, true);
                    break;
                } else {
                    TLRPC.Chat chat = unVar2.e;
                    TLRPC.User user = unVar2.f;
                    boolean z10 = this.b;
                    org.telegram.ui.Components.s4.r(unVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    break;
                }
        }
    }
}
