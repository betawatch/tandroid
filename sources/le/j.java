package le;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements he.a {
    public final he.a a;
    public final o b;

    public j(he.a serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.a = serializer;
        this.b = new o(serializer.d());
    }

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        if (decoder.i()) {
            return decoder.l(this.a);
        }
        return null;
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        if (obj != null) {
            hVar.i(this.a, obj);
        } else {
            hVar.f();
        }
    }

    @Override // he.a
    public final je.d d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && kotlin.jvm.internal.j.a(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
