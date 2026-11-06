package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n91 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public n91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n91.class == obj.getClass()) {
            n91 n91Var = (n91) obj;
            int i7 = this.a;
            if (i7 == n91Var.a && i7 == 0 && this.c.id == n91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
