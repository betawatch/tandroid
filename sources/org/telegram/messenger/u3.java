package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class u3 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public u3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.a = groupCallParticipant;
        this.b = z10;
    }

    public final void a(int i7, int i10, t3 t3Var) {
        float f10 = i7 / i10;
        if (this.c != f10) {
            this.c = f10;
            if (f40.E5 || t3Var.f.size() % 2 != 1) {
                return;
            }
            t3Var.B();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u3.class == obj.getClass()) {
            u3 u3Var = (u3) obj;
            if (this.b == u3Var.b && fj.B1(this.a.peer) == fj.B1(u3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
