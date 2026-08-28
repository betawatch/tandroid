package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ly0 {
    public final int a;
    public final int b;

    public ly0(int i9, int i10) {
        this.a = i9;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly0.class != obj.getClass()) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        return this.b == ly0Var.b && this.a == ly0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
