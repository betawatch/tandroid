package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
