package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class of1 implements f11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ pf1 b;

    public of1(pf1 pf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = pf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.f11
    public final void d0() {
        sf1 sf1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sf1.U(sf1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new w01(25, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.f11
    public final void u(lk0 lk0Var) {
    }
}
