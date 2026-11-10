package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ba1 implements kx0 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ca1 b;

    public ba1(ca1 ca1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ca1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.kx0
    public final void c0() {
        fa1 fa1Var = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        fa1.Z(fa1Var, tL_forumTopic.id);
        org.telegram.messenger.g0.i3(new rw0(23, this, tL_forumTopic), 300L);
    }

    @Override // org.telegram.ui.kx0
    public final void t(rh0 rh0Var) {
    }
}
