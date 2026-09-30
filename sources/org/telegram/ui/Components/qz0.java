package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qz0 {
    public final int a;
    public final int b;

    public qz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return this.b == qz0Var.b && this.a == qz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
