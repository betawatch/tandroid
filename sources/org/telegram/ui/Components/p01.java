package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p01 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.uv b;
    public final /* synthetic */ s01 c;

    public p01(s01 s01Var) {
        this.c = s01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.b;
        if (uvVar != null) {
            return uvVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
