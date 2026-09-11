package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
