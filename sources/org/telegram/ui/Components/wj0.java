package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wj0 extends og.a {
    public final zg.p0 c;

    public wj0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj0.class == obj.getClass()) {
            wj0 wj0Var = (wj0) obj;
            int i10 = this.a;
            int i11 = wj0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(wj0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
