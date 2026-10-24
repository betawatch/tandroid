package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a10 {
    public long a;
    public int b;

    public a10(int i10, long j10) {
        this.a = j10;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a10.class == obj.getClass()) {
            a10 a10Var = (a10) obj;
            if (this.a == a10Var.a && this.b == a10Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
