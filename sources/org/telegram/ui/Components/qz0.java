package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
