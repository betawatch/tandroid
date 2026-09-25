package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
