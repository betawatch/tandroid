package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tk0 extends pg.a {
    public final ah.i1 c;

    public tk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tk0.class == obj.getClass()) {
            tk0 tk0Var = (tk0) obj;
            int i10 = this.a;
            int i11 = tk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.c;
                return i1Var != null && i1Var.equals(tk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
