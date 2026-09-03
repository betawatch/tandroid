package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f1 extends h1 {
    public final String a;

    public f1(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) 96);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        String str = ((f1) h1Var).a;
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
        if (obj != null && f1.class == obj.getClass()) {
            return this.a.equals(((f1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) 96)), this.a});
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("\""), this.a, "\"");
    }

    @Override // b7.h1
    public final int zza() {
        return h1.c((byte) 96);
    }
}
