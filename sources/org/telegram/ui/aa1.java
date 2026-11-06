package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class aa1 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public aa1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || aa1.class != obj.getClass()) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        if (this.a != aa1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = aa1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
