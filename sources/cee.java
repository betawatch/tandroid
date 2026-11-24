// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cee extends sfe {
    public final boolean a;

    public cee(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) -32);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((cee) sfeVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cee.class == obj.getClass() && this.a == ((cee) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // sfe
    public final int zza() {
        return sfe.c((byte) -32);
    }
}
