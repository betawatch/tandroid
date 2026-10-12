package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cg1 extends pg.a {
    public final TLRPC.TL_forumTopic c;

    public cg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cg1.class == obj.getClass()) {
            cg1 cg1Var = (cg1) obj;
            int i10 = this.a;
            if (i10 == cg1Var.a && i10 == 0 && this.c.id == cg1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
