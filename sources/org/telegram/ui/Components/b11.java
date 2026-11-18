package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b11 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.ov b;
    public final /* synthetic */ f11 c;

    public b11(f11 f11Var) {
        this.c = f11Var;
    }

    public final long a() {
        org.telegram.messenger.ov ovVar = this.b;
        if (ovVar != null) {
            return ovVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.n5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
