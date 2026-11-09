package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ai0 extends rg.a {
    public final ch.o0 c;

    public ai0(int i7, ch.o0 o0Var) {
        super(i7, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ai0.class == obj.getClass()) {
            ai0 ai0Var = (ai0) obj;
            int i7 = this.a;
            int i10 = ai0Var.a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(ai0Var.c);
            }
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
