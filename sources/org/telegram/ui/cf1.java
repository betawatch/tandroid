package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cf1 extends wf.a {
    public final TLRPC.TL_forumTopic c;

    public cf1(int i9, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i9, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || cf1.class != obj.getClass()) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        if (this.a != cf1Var.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = cf1Var.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
