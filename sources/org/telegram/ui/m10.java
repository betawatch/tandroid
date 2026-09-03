package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m10 {
    public long a;
    public int b;

    public m10(int i10, long j10) {
        this.a = j10;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m10.class == obj.getClass()) {
            m10 m10Var = (m10) obj;
            if (this.a == m10Var.a && this.b == m10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
