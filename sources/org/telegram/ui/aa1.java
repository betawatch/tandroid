package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class aa1 implements ix0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ba1 b;

    public aa1(ba1 ba1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ba1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.ix0
    public final void a0() {
        ea1 ea1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ea1.Z(ea1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.h3(new b31(13, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.ix0
    public final void k(th0 th0Var) {
    }
}
