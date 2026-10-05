package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bg1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || bg1.class != obj.getClass()) {
            return false;
        }
        bg1 bg1Var = (bg1) obj;
        if (this.a != bg1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = bg1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
