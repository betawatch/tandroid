package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class me1 extends wf.a {
    public final TLRPC.TL_forumTopic c;

    public me1(int i9, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i9, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && me1.class == obj.getClass()) {
            me1 me1Var = (me1) obj;
            int i9 = this.a;
            if (i9 == me1Var.a && i9 == 0 && this.c.id == me1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
