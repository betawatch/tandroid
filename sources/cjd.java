// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cjd implements kkd {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public cjd(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return kkd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkd)) {
            return false;
        }
        kkd kkdVar = (kkd) obj;
        return this.a == kkdVar.zza() && ekd.a.equals(kkdVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (ekd.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ekd.a + ')';
    }

    @Override // kkd
    public final int zza() {
        return this.a;
    }

    @Override // kkd
    public final ekd zzb() {
        return ekd.a;
    }
}
