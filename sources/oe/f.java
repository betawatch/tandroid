package oe;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
