package oe;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i implements ke.a {
    public static final i a = new i();
    public static final n b = new n("kotlin.Long", me.b.e);

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        hVar.d(((Number) obj).longValue());
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
