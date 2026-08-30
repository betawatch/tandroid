package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d1 extends h1 {
    public final long a;

    public d1(long j10) {
        this.a = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        if (zza() != h1Var.zza()) {
            return zza() - h1Var.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((d1) h1Var).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d1.class == obj.getClass() && this.a == ((d1) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // b7.h1
    public final int zza() {
        return h1.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
