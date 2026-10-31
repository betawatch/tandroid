package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hb1 extends hg.b {
    public final TLRPC.TL_forumTopic c;

    public hb1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hb1.class == obj.getClass()) {
            hb1 hb1Var = (hb1) obj;
            int i10 = this.a;
            if (i10 == hb1Var.a && i10 == 0 && this.c.id == hb1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
