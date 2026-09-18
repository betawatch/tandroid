package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fg1 implements v11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ gg1 b;

    public fg1(gg1 gg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = gg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.v11
    public final void c0() {
        jg1 jg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        jg1.U(jg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new x81(12, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.v11
    public final void v(vk0 vk0Var) {
    }
}
