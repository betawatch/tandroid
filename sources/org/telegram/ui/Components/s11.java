package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s11 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.gw b;
    public final /* synthetic */ u11 c;

    public s11(u11 u11Var) {
        this.c = u11Var;
    }

    public final long a() {
        org.telegram.messenger.gw gwVar = this.b;
        if (gwVar != null) {
            return gwVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.o5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
