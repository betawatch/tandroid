package le;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements he.a {
    public static final i a = new i();
    public static final n b = new n("kotlin.Long", je.b.e);

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        hVar.d(((Number) obj).longValue());
    }

    @Override // he.a
    public final je.d d() {
        return b;
    }
}
