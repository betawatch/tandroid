package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bf1 extends xf.a {
    public final TLRPC.TL_forumTopic c;

    public bf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || bf1.class != obj.getClass()) {
            return false;
        }
        bf1 bf1Var = (bf1) obj;
        if (this.a != bf1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = bf1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
