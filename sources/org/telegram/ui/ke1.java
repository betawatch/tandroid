package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ke1 extends pg.a {
    public final TLRPC.TL_forumTopic c;

    public ke1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke1.class == obj.getClass()) {
            ke1 ke1Var = (ke1) obj;
            int i10 = this.a;
            if (i10 == ke1Var.a && i10 == 0 && this.c.id == ke1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
