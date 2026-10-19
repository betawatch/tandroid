package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yz0 {
    public final int a;
    public final int b;

    public yz0(int i10, int i11) {
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
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        return this.b == yz0Var.b && this.a == yz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
