// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eld implements mmd {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public eld(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return mmd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmd)) {
            return false;
        }
        mmd mmdVar = (mmd) obj;
        return this.a == mmdVar.zza() && gmd.a.equals(mmdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (gmd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + gmd.a + ')';
    }

    @Override // mmd
    public final int zza() {
        return this.a;
    }

    @Override // mmd
    public final gmd zzb() {
        return gmd.a;
    }
}
