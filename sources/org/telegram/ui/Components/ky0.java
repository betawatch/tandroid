package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ky0 {
    public final int a;
    public final int b;

    public ky0(int i10, int i11) {
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
        if (obj == null || ky0.class != obj.getClass()) {
            return false;
        }
        ky0 ky0Var = (ky0) obj;
        return this.b == ky0Var.b && this.a == ky0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
