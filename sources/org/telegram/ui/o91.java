package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o91 implements xw0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ p91 b;

    public o91(p91 p91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = p91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.xw0
    public final void a0() {
        s91 s91Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        s91.Z(s91Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new qv0(26, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.xw0
    public final void l(lh0 lh0Var) {
    }
}
