package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class z0 extends e1 {
    public final long a;

    public z0(long j3) {
        this.a = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        if (zza() != e1Var.zza()) {
            return zza() - e1Var.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((z0) e1Var).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && this.a == ((z0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // n7.e1
    public final int zza() {
        return e1.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
