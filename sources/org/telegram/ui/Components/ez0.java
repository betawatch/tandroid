package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ez0 {
    public final int a;
    public final int b;

    public ez0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return this.b == ez0Var.b && this.a == ez0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
