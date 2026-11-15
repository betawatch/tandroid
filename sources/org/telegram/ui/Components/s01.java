package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s01 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.sv b;
    public final /* synthetic */ v01 c;

    public s01(v01 v01Var) {
        this.c = v01Var;
    }

    public final long a() {
        org.telegram.messenger.sv svVar = this.b;
        if (svVar != null) {
            return svVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
