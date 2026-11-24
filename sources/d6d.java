// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d6d implements g7d {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public d6d(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return g7d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7d)) {
            return false;
        }
        g7d g7dVar = (g7d) obj;
        return this.a == g7dVar.zza() && y6d.a.equals(g7dVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (y6d.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + y6d.a + ')';
    }

    @Override // g7d
    public final int zza() {
        return this.a;
    }

    @Override // g7d
    public final y6d zzb() {
        return y6d.a;
    }
}
