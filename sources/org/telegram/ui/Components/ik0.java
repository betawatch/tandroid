package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ik0 extends cg.b {
    public final ng.q0 c;

    public ik0(int i10, ng.q0 q0Var) {
        super(i10, false);
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            int i10 = this.a;
            int i11 = ik0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ng.q0 q0Var = this.c;
                return q0Var != null && q0Var.equals(ik0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
