package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lj0 extends wf.a {
    public final hg.r0 c;

    public lj0(int i9, hg.r0 r0Var) {
        super(i9, false);
        this.c = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lj0.class == obj.getClass()) {
            lj0 lj0Var = (lj0) obj;
            int i9 = this.a;
            int i10 = lj0Var.a;
            if (i9 == i10 && (i9 == 0 || i9 == 3)) {
                hg.r0 r0Var = this.c;
                return r0Var != null && r0Var.equals(lj0Var.c);
            }
            if (i9 == i10) {
                return true;
            }
        }
        return false;
    }
}
