// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f8d implements i9d {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public f8d(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return i9d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9d)) {
            return false;
        }
        i9d i9dVar = (i9d) obj;
        return this.a == i9dVar.zza() && a9d.a.equals(i9dVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (a9d.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + a9d.a + ')';
    }

    @Override // i9d
    public final int zza() {
        return this.a;
    }

    @Override // i9d
    public final a9d zzb() {
        return a9d.a;
    }
}
