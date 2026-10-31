package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jy0 {
    public final int a;
    public final int b;

    public jy0(int i10, int i11) {
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
        if (obj == null || jy0.class != obj.getClass()) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return this.b == jy0Var.b && this.a == jy0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
