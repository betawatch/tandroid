package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ba1 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public ba1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ba1.class != obj.getClass()) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        if (this.a != ba1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = ba1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
