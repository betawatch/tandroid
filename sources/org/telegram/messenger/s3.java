package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class s3 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z9) {
        this.a = groupCallParticipant;
        this.b = z9;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.c != f10) {
            this.c = f10;
            if (e40.w5 || r3Var.f.size() % 2 != 1) {
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
            if (this.b == s3Var.b && ij.B1(this.a.peer) == ij.B1(s3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
