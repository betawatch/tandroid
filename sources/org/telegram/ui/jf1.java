package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jf1 extends bg.b {
    public final TLRPC.TL_forumTopic c;

    public jf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf1.class == obj.getClass()) {
            jf1 jf1Var = (jf1) obj;
            int i10 = this.a;
            if (i10 == jf1Var.a && i10 == 0 && this.c.id == jf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
