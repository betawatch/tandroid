// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
