package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class oz0 {
    public final int a;
    public final int b;

    public oz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return this.b == oz0Var.b && this.a == oz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
