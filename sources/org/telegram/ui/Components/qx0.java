package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
