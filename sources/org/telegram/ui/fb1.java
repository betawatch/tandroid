package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fb1 extends hg.b {
    public final TLRPC.TL_forumTopic c;

    public fb1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fb1.class == obj.getClass()) {
            fb1 fb1Var = (fb1) obj;
            int i10 = this.a;
            if (i10 == fb1Var.a && i10 == 0 && this.c.id == fb1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
