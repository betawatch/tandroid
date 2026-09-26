package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hk0 extends og.a {
    public final zg.o0 c;

    public hk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.c = o0Var;
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
                zg.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(hk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
