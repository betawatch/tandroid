package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class c1 extends e1 {
    public final String a;

    public c1(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) 96);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        String str = ((c1) e1Var).a;
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
        if (obj != null && c1.class == obj.getClass()) {
            return this.a.equals(((c1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) 96)), this.a});
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("\""), this.a, "\"");
    }

    @Override // n7.e1
    public final int zza() {
        return e1.c((byte) 96);
    }
}
