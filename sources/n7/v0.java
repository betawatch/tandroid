package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v0 extends d1 {
    public final boolean a;

    public v0(boolean z10) {
        this.a = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) -32);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((v0) d1Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && this.a == ((v0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // n7.d1
    public final int zza() {
        return d1.c((byte) -32);
    }
}
