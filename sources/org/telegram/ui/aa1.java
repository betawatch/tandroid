package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        org.telegram.messenger.g0.h3(new mz0(15, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.ix0
    public final void k(uh0 uh0Var) {
    }
}
