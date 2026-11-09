package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class aa1 implements jx0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ba1 b;

    public aa1(ba1 ba1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ba1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.jx0
    public final void c0() {
        ea1 ea1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ea1.Z(ea1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new ax0(22, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.jx0
    public final void t(qh0 qh0Var) {
    }
}
