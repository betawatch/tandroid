package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
