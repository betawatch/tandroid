package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
