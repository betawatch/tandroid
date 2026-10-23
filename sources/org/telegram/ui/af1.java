package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class af1 implements c11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ bf1 b;

    public af1(bf1 bf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = bf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.c11
    public final void O() {
        ef1 ef1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        ef1.U(ef1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new o71(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.c11
    public final void r(ik0 ik0Var) {
    }
}
