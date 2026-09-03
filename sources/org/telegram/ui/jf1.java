package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jf1 extends cg.b {
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
