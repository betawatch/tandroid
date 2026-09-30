package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class jk0 extends og.a {
    public final zg.o0 c;

    public jk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jk0.class == obj.getClass()) {
            jk0 jk0Var = (jk0) obj;
            int i10 = this.a;
            int i11 = jk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(jk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
