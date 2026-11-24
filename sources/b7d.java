// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b7d implements i8d {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public b7d(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return i8d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8d)) {
            return false;
        }
        i8d i8dVar = (i8d) obj;
        return this.a == i8dVar.zza() && c8d.a.equals(i8dVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (c8d.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + c8d.a + ')';
    }

    @Override // i8d
    public final int zza() {
        return this.a;
    }

    @Override // i8d
    public final c8d zzb() {
        return c8d.a;
    }
}
