package oe;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j implements ke.a {
    public final ke.a a;
    public final o b;

    public j(ke.a serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.a = serializer;
        this.b = new o(serializer.d());
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        if (obj != null) {
            hVar.i(this.a, obj);
        } else {
            hVar.f();
        }
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        if (decoder.i()) {
            return decoder.l(this.a);
        }
        return null;
    }

    @Override // ke.a
    public final me.d d() {
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
