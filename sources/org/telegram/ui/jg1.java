package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jg1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public jg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || jg1.class != obj.getClass()) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        if (this.a != jg1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = jg1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
