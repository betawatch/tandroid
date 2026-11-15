package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m91 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public m91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m91.class == obj.getClass()) {
            m91 m91Var = (m91) obj;
            int i7 = this.a;
            if (i7 == m91Var.a && i7 == 0 && this.c.id == m91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
