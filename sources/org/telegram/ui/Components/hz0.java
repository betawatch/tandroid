package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hz0 {
    public final int a;
    public final int b;

    public hz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.b == hz0Var.b && this.a == hz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
