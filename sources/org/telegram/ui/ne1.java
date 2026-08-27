package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ne1 extends xf.a {
    public final TLRPC.TL_forumTopic c;

    public ne1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne1.class == obj.getClass()) {
            ne1 ne1Var = (ne1) obj;
            int i10 = this.a;
            if (i10 == ne1Var.a && i10 == 0 && this.c.id == ne1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
