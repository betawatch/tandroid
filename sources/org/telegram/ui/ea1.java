package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ea1 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public ea1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ea1.class != obj.getClass()) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        if (this.a != ea1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = ea1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
