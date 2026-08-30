package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mf1 implements d11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ nf1 b;

    public mf1(nf1 nf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = nf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.d11
    public final void b0() {
        qf1 qf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        qf1.U(qf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new l01(26, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.d11
    public final void v(jk0 jk0Var) {
    }
}
