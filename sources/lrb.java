// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lrb implements sf7 {
    public final long a;

    public lrb(long j) {
        this.a = j;
    }

    @Override // sf7
    public final ko4 a() {
        return null;
    }

    @Override // sf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lrb.class == obj.getClass() && this.a == ((lrb) obj).a;
    }

    public final int hashCode() {
        return tse.b(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
