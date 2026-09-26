package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oz0 {
    public final int a;
    public final int b;

    public oz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return this.b == oz0Var.b && this.a == oz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
