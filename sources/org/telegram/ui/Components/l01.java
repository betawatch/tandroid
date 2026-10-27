package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l01 {
    public final int a;
    public final int b;

    public l01(int i10, int i11) {
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
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        return this.b == l01Var.b && this.a == l01Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
