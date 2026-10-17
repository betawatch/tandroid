package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class xz0 {
    public final int a;
    public final int b;

    public xz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xz0.class != obj.getClass()) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        return this.b == xz0Var.b && this.a == xz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
