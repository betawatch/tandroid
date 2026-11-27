// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
