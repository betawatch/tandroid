package a8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j0 implements n0 {
    public final int a;

    public j0(int i7) {
        this.a = i7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return n0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        if (this.a != ((j0) ((n0) obj)).a) {
            return false;
        }
        Object obj2 = m0.a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (m0.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + m0.a + ')';
    }
}
