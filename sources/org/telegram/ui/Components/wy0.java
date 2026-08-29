package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wy0 {
    public final int a;
    public final int b;

    public wy0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wy0.class != obj.getClass()) {
            return false;
        }
        wy0 wy0Var = (wy0) obj;
        return this.b == wy0Var.b && this.a == wy0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
