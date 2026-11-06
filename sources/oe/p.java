package oe;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p implements ke.a {
    public static final p a = new p();
    public static final n b = new n("kotlin.String", me.b.f);

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.j.e(value, "value");
        hVar.j(value);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return decoder.m();
    }

    @Override // ke.a
    public final me.d d() {
        return b;
    }
}
