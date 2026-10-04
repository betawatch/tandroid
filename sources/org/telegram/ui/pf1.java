package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class pf1 extends og.a {
    public final TLRPC.TL_forumTopic c;

    public pf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf1.class == obj.getClass()) {
            pf1 pf1Var = (pf1) obj;
            int i10 = this.a;
            if (i10 == pf1Var.a && i10 == 0 && this.c.id == pf1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
