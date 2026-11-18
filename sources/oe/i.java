package oe;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
