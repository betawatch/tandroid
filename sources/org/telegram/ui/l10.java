package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
