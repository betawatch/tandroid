package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xj0 extends og.a {
    public final zg.p0 c;

    public xj0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xj0.class == obj.getClass()) {
            xj0 xj0Var = (xj0) obj;
            int i10 = this.a;
            int i11 = xj0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(xj0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
