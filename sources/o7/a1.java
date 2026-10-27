package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a1 extends c1 {
    public final String a;

    public a1(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        String str = ((a1) c1Var).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            return this.a.equals(((a1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 96)), this.a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("\""), this.a, "\"");
    }

    @Override // o7.c1
    public final int zza() {
        return c1.c((byte) 96);
    }
}
