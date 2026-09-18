package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || kg1.class != obj.getClass()) {
            return false;
        }
        kg1 kg1Var = (kg1) obj;
        if (this.a != kg1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = kg1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
