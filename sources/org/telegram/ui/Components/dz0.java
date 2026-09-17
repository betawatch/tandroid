package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class dz0 {
    public final int a;
    public final int b;

    public dz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        return this.b == dz0Var.b && this.a == dz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
