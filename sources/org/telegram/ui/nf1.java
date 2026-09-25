package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nf1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public nf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nf1.class == obj.getClass()) {
            nf1 nf1Var = (nf1) obj;
            int i10 = this.a;
            if (i10 == nf1Var.a && i10 == 0 && this.c.id == nf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
