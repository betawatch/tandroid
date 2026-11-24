// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d9d implements kad {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public d9d(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return kad.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kad)) {
            return false;
        }
        kad kadVar = (kad) obj;
        return this.a == kadVar.zza() && ead.a.equals(kadVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (ead.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ead.a + ')';
    }

    @Override // kad
    public final int zza() {
        return this.a;
    }

    @Override // kad
    public final ead zzb() {
        return ead.a;
    }
}
