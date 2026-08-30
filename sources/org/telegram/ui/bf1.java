package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bf1 extends bg.b {
    public final TLRPC.TL_forumTopic c;

    public bf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf1.class == obj.getClass()) {
            bf1 bf1Var = (bf1) obj;
            int i10 = this.a;
            if (i10 == bf1Var.a && i10 == 0 && this.c.id == bf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
