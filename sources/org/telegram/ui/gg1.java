package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gg1 implements w11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ hg1 b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = hg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.w11
    public final void c0() {
        kg1 kg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        kg1.U(kg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new pb1(8, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.w11
    public final void v(tk0 tk0Var) {
    }
}
