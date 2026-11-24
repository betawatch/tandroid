// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cid implements ikd {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public cid(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ikd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikd)) {
            return false;
        }
        ikd ikdVar = (ikd) obj;
        return this.a == ikdVar.zza() && bkd.a.equals(ikdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (bkd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + bkd.a + ')';
    }

    @Override // ikd
    public final int zza() {
        return this.a;
    }

    @Override // ikd
    public final bkd zzb() {
        return bkd.a;
    }
}
