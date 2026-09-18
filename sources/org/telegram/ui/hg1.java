package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hg1 implements x11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ig1 b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ig1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.x11
    public final void c0() {
        lg1 lg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        lg1.U(lg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new qb1(8, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.x11
    public final void v(vk0 vk0Var) {
    }
}
