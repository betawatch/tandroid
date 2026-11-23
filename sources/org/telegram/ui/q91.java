package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class q91 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public q91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q91.class == obj.getClass()) {
            q91 q91Var = (q91) obj;
            int i7 = this.a;
            if (i7 == q91Var.a && i7 == 0 && this.c.id == q91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
