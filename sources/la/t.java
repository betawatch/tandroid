package la;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
