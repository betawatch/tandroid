package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h50 {
    public final int a;
    public final int b;

    public h50(int i9, int i10) {
        this.a = i9;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h50.class == obj.getClass()) {
            h50 h50Var = (h50) obj;
            if (this.a == h50Var.a && this.b == h50Var.b) {
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
        return aa.d.l(this.b, ")", sb2);
    }
}
