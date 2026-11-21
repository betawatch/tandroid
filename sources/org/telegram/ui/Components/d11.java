package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d11 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.ov b;
    public final /* synthetic */ h11 c;

    public d11(h11 h11Var) {
        this.c = h11Var;
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
