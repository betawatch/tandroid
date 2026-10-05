package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jk0 extends og.a {
    public final zg.m0 c;

    public jk0(int i10, zg.m0 m0Var) {
        super(i10, false);
        this.c = m0Var;
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
                zg.m0 m0Var = this.c;
                return m0Var != null && m0Var.equals(jk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
