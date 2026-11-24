// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hfe extends sfe {
    public final String a;

    public hfe(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) 96);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        String str = ((hfe) sfeVar).a;
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
        if (obj == null || hfe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hfe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) 96)), this.a});
    }

    public final String toString() {
        return b00.j(new StringBuilder("\""), this.a, "\"");
    }

    @Override // sfe
    public final int zza() {
        return sfe.c((byte) 96);
    }
}
