package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qx0 {
    public final int a;
    public final int b;

    public qx0(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qx0.class != obj.getClass()) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        return this.b == qx0Var.b && this.a == qx0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
