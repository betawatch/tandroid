package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            if (c40.w5 || r3Var.f.size() % 2 != 1) {
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
            if (this.b == s3Var.b && ij.C1(this.a.peer) == ij.C1(s3Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
