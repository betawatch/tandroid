package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ny0 {
    public final int a;
    public final int b;

    public ny0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ny0.class != obj.getClass()) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return this.b == ny0Var.b && this.a == ny0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
