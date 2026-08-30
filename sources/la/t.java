package la;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t implements od.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // od.c
    public final Object c(Object obj, wc.c cVar) {
        switch (this.a) {
            case 0:
                ((z) this.b).c.set((m) obj);
                return sc.i.a;
            default:
                ((kotlin.jvm.internal.q) this.b).a = obj;
                throw new pd.a(this);
        }
    }
}
