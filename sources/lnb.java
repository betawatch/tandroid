// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lnb implements jd7 {
    public final long a;

    public lnb(long j) {
        this.a = j;
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lnb.class == obj.getClass() && this.a == ((lnb) obj).a;
    }

    public final int hashCode() {
        return zne.b(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
