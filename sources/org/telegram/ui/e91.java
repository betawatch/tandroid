package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e91 extends sg.a {
    public final TLRPC.TL_forumTopic c;

    public e91(int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i3, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e91.class == obj.getClass()) {
            e91 e91Var = (e91) obj;
            int i3 = this.a;
            if (i3 == e91Var.a && i3 == 0 && this.c.id == e91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
