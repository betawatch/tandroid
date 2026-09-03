package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a1 extends h1 {
    public final boolean a;

    public a1(boolean z4) {
        this.a = z4;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) -32);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((a1) h1Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a1.class == obj.getClass() && this.a == ((a1) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // b7.h1
    public final int zza() {
        return h1.c((byte) -32);
    }
}
