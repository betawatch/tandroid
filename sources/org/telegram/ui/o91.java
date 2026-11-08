package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class o91 extends rg.a {
    public final TLRPC.TL_forumTopic c;

    public o91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o91.class == obj.getClass()) {
            o91 o91Var = (o91) obj;
            int i7 = this.a;
            if (i7 == o91Var.a && i7 == 0 && this.c.id == o91Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
