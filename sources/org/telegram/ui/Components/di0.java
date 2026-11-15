package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class di0 extends rg.a {
    public final ch.p0 c;

    public di0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && di0.class == obj.getClass()) {
            di0 di0Var = (di0) obj;
            int i7 = this.a;
            int i10 = di0Var.a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.c;
                return p0Var != null && p0Var.equals(di0Var.c);
            }
            if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
