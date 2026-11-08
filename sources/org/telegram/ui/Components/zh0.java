package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zh0 extends rg.a {
    public final ch.o0 c;

    public zh0(int i7, ch.o0 o0Var) {
        super(i7, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zh0.class == obj.getClass()) {
            zh0 zh0Var = (zh0) obj;
            int i7 = this.a;
            int i10 = zh0Var.a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(zh0Var.c);
            }
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
