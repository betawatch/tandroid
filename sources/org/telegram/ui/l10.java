package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class l10 {
    public long a;
    public int b;

    public l10(int i10, long j3) {
        this.a = j3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.a == l10Var.a && this.b == l10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
