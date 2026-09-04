package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
