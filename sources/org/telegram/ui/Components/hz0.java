package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hz0 {
    public final int a;
    public final int b;

    public hz0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.b == hz0Var.b && this.a == hz0Var.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
