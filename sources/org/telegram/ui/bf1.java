package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bf1 implements s01 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ cf1 b;

    public bf1(cf1 cf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = cf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.s01
    public final void a0() {
        ff1 ff1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ff1.U(ff1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new t31(17, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.s01
    public final void m(bk0 bk0Var) {
    }
}
