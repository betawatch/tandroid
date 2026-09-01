package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class df1 extends cg.b {
    public final TLRPC.TL_forumTopic c;

    public df1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df1.class == obj.getClass()) {
            df1 df1Var = (df1) obj;
            int i10 = this.a;
            if (i10 == df1Var.a && i10 == 0 && this.c.id == df1Var.c.id) {
                return true;
            }
        }
        return false;
    }
}
