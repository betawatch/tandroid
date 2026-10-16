package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mg1 implements b21 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ng1 b;

    public mg1(ng1 ng1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ng1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.b21
    public final void a0() {
        qg1 qg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        qg1.U(qg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new i11(28, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.b21
    public final void v(zk0 zk0Var) {
    }
}
