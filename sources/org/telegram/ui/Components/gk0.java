package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gk0 extends bg.b {
    public final mg.q0 c;

    public gk0(int i10, mg.q0 q0Var) {
        super(i10, false);
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk0.class == obj.getClass()) {
            gk0 gk0Var = (gk0) obj;
            int i10 = this.a;
            int i11 = gk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                mg.q0 q0Var = this.c;
                return q0Var != null && q0Var.equals(gk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
