package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class oe1 extends pg.a {
    public final TLRPC.TL_forumTopic c;

    public oe1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oe1.class == obj.getClass()) {
            oe1 oe1Var = (oe1) obj;
            int i10 = this.a;
            if (i10 == oe1Var.a && i10 == 0 && this.c.id == oe1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
