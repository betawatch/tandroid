package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b10 {
    public long a;
    public int b;

    public b10(int i10, long j10) {
        this.a = j10;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b10.class == obj.getClass()) {
            b10 b10Var = (b10) obj;
            if (this.a == b10Var.a && this.b == b10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
