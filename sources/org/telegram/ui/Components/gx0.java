package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gx0 {
    public final int a;
    public final int b;

    public gx0(int i7, int i10) {
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
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        return this.b == gx0Var.b && this.a == gx0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
