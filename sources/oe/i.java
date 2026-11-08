package oe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
