// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lje extends jke {
    public final long a;

    public lje(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jke jkeVar = (jke) obj;
        if (zza() != jkeVar.zza()) {
            return zza() - jkeVar.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((lje) jkeVar).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lje.class == obj.getClass() && this.a == ((lje) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // jke
    public final int zza() {
        return jke.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
