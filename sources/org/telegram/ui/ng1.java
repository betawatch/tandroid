package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ng1 implements b21 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ og1 b;

    public ng1(og1 og1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = og1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.b21
    public final void a0() {
        rg1 rg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        rg1.U(rg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new je1(3, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.b21
    public final void v(al0 al0Var) {
    }
}
