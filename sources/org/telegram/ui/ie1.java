package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ie1 extends pg.a {
    public final TLRPC.TL_forumTopic c;

    public ie1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie1.class == obj.getClass()) {
            ie1 ie1Var = (ie1) obj;
            int i10 = this.a;
            if (i10 == ie1Var.a && i10 == 0 && this.c.id == ie1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
