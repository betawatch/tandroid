package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mi0 extends rg.a {
    public final ch.p0 c;

    public mi0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mi0.class == obj.getClass()) {
            mi0 mi0Var = (mi0) obj;
            int i7 = this.a;
            int i10 = mi0Var.a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(mi0Var.c);
            }
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
