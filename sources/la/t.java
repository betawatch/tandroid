package la;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
