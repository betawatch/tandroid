// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bgd implements gid {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public bgd(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return gid.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gid)) {
            return false;
        }
        gid gidVar = (gid) obj;
        return this.a == gidVar.zza() && aid.a.equals(gidVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (aid.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + aid.a + ')';
    }

    @Override // gid
    public final int zza() {
        return this.a;
    }

    @Override // gid
    public final aid zzb() {
        return aid.a;
    }
}
