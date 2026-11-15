package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s3 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.a = groupCallParticipant;
        this.b = z10;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.c != f10) {
            this.c = f10;
            if (c40.E5 || r3Var.f.size() % 2 != 1) {
                return;
            }
            r3Var.B();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3.class == obj.getClass()) {
            s3 s3Var = (s3) obj;
            if (this.b == s3Var.b && gj.B1(this.a.peer) == gj.B1(s3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
