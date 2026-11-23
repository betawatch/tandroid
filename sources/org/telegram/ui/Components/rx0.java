package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rx0 {
    public final int a;
    public final int b;

    public rx0(int i7, int i10) {
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
        if (obj == null || rx0.class != obj.getClass()) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return this.b == rx0Var.b && this.a == rx0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
