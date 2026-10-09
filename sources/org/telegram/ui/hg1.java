package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hg1 implements u11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ig1 b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ig1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.u11
    public final void a0() {
        lg1 lg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        lg1.U(lg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new n31(22, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.u11
    public final void v(vk0 vk0Var) {
    }
}
