package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p10 {
    public long a;
    public int b;

    public p10(int i10, long j3) {
        this.a = j3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.a == p10Var.a && this.b == p10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
