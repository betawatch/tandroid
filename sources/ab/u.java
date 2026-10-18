package ab;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class u implements ee.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ee.c
    public final Object a(Object obj, md.c cVar) {
        switch (this.a) {
            case 0:
                ((c0) this.b).c.set((n) obj);
                return id.i.a;
            default:
                ((kotlin.jvm.internal.p) this.b).a = obj;
                throw new fe.a(this);
        }
    }
}
