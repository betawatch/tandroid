package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i50 {
    public final int a;
    public final int b;

    public i50(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i50.class == obj.getClass()) {
            i50 i50Var = (i50) obj;
            if (this.a == i50Var.a && this.b == i50Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.a);
        sb2.append(", ");
        return a8.p0.n(this.b, ")", sb2);
    }
}
