package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oi0 extends rg.a {
    public final ch.p0 c;

    public oi0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oi0.class == obj.getClass()) {
            oi0 oi0Var = (oi0) obj;
            int i7 = this.a;
            int i10 = oi0Var.a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(oi0Var.c);
            }
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
