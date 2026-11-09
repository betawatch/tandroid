package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q01 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.uv b;
    public final /* synthetic */ t01 c;

    public q01(t01 t01Var) {
        this.c = t01Var;
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
