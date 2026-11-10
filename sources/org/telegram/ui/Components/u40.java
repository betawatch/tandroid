package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u40 {
    public final int a;
    public final int b;

    public u40(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u40.class == obj.getClass()) {
            u40 u40Var = (u40) obj;
            if (this.a == u40Var.a && this.b == u40Var.b) {
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
