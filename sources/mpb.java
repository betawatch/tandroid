// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mpb implements lf7 {
    public final long a;

    public mpb(long j) {
        this.a = j;
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mpb.class == obj.getClass() && this.a == ((mpb) obj).a;
    }

    public final int hashCode() {
        return cqe.b(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
