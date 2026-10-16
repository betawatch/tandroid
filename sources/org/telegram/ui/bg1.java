package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bg1 extends pg.a {
    public final TLRPC.TL_forumTopic c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bg1.class == obj.getClass()) {
            bg1 bg1Var = (bg1) obj;
            int i10 = this.a;
            if (i10 == bg1Var.a && i10 == 0 && this.c.id == bg1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
