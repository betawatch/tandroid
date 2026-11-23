package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            if (this.b == u3Var.b && gj.B1(this.a.peer) == gj.B1(u3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
