package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gk0 extends ng.a {
    public final yg.p0 c;

    public gk0(int i10, yg.p0 p0Var) {
        super(i10, false);
        this.c = p0Var;
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
                yg.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(gk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
