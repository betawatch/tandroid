package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pb1 implements sy0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ qb1 b;

    public pb1(qb1 qb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = qb1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.sy0
    public final void b0() {
        tb1 tb1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        tb1.Z(tb1Var, tL_forumTopic.id);
        org.telegram.messenger.i0.h3(new y01(15, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.sy0
    public final void w(si0 si0Var) {
    }
}
