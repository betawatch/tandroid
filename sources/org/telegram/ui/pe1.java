package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pe1 extends zf.a {
    public final TLRPC.TL_forumTopic c;

    public pe1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pe1.class == obj.getClass()) {
            pe1 pe1Var = (pe1) obj;
            int i10 = this.a;
            if (i10 == pe1Var.a && i10 == 0 && this.c.id == pe1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
