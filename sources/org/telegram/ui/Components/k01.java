package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k01 {
    public final int a;
    public final int b;

    public k01(int i10, int i11) {
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
        if (obj == null || k01.class != obj.getClass()) {
            return false;
        }
        k01 k01Var = (k01) obj;
        return this.b == k01Var.b && this.a == k01Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
