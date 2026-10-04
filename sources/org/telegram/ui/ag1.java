package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ag1 implements o11 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ bg1 b;

    public ag1(bg1 bg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = bg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.o11
    public final void d0() {
        eg1 eg1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        eg1.S(eg1Var, tL_forumTopic.id);
        AndroidUtilities.runOnUIThread(new g91(11, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.o11
    public final void v(rk0 rk0Var) {
    }
}
