package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c11 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.pv b;
    public final /* synthetic */ g11 c;

    public c11(g11 g11Var) {
        this.c = g11Var;
    }

    public final long a() {
        org.telegram.messenger.pv pvVar = this.b;
        if (pvVar != null) {
            return pvVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.n5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
