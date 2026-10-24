package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
