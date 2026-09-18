package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fz0 {
    public final int a;
    public final int b;

    public fz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        return this.b == fz0Var.b && this.a == fz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
