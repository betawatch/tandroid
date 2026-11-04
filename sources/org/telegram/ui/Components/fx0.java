package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fx0 {
    public final int a;
    public final int b;

    public fx0(int i3, int i10) {
        this.a = i3;
        this.b = i10;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx0.class != obj.getClass()) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        return this.b == fx0Var.b && this.a == fx0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
