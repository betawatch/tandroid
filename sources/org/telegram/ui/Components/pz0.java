package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pz0 {
    public final int a;
    public final int b;

    public pz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return this.b == pz0Var.b && this.a == pz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
