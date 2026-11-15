package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jx0 {
    public final int a;
    public final int b;

    public jx0(int i7, int i10) {
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
        if (obj == null || jx0.class != obj.getClass()) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return this.b == jx0Var.b && this.a == jx0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
