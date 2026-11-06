package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
