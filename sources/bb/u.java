package bb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u implements fe.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // fe.c
    public final Object b(Object obj, nd.c cVar) {
        switch (this.a) {
            case 0:
                ((c0) this.b).c.set((n) obj);
                return jd.i.a;
            default:
                ((kotlin.jvm.internal.p) this.b).a = obj;
                throw new ge.a(this);
        }
    }
}
