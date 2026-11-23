package oe;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class f implements ke.a {
    public static final f a = new f();
    public static final n b = new n("kotlin.Int", me.b.d);

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        hVar.c(((Number) obj).intValue());
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Integer.valueOf(decoder.e());
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
