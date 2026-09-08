package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gg1 implements x11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ hg1 b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = hg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.x11
    public final void b0() {
        kg1 kg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        kg1.U(kg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new w81(14, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.x11
    public final void v(wk0 wk0Var) {
    }
}
