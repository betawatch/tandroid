package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dj0 extends hg.b {
    public final sg.o0 c;

    public dj0(int i10, sg.o0 o0Var) {
        super(i10, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dj0.class == obj.getClass()) {
            dj0 dj0Var = (dj0) obj;
            int i10 = this.a;
            int i11 = dj0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                sg.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(dj0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
