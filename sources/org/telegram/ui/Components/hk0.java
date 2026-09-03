package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hk0 extends cg.b {
    public final ng.q0 c;

    public hk0(int i10, ng.q0 q0Var) {
        super(i10, false);
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            int i10 = this.a;
            int i11 = hk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ng.q0 q0Var = this.c;
                return q0Var != null && q0Var.equals(hk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
