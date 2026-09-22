package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jk0 extends og.a {
    public final zg.p0 c;

    public jk0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.c = p0Var;
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
                zg.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(jk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
