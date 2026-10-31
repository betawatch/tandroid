package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v3 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public v3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.a = groupCallParticipant;
        this.b = z10;
    }

    public final void a(int i10, int i11, u3 u3Var) {
        float f7 = i10 / i11;
        if (this.c != f7) {
            this.c = f7;
            if (b50.w5 || u3Var.f.size() % 2 != 1) {
                return;
            }
            u3Var.B();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3.class == obj.getClass()) {
            v3 v3Var = (v3) obj;
            if (this.b == v3Var.b && jj.C1(this.a.peer) == jj.C1(v3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
