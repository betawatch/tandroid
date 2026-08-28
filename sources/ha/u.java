package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements kd.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // kd.c
    public final Object c(Object obj, sc.c cVar) {
        switch (this.a) {
            case 0:
                ((c0) this.b).c.set((n) obj);
                return oc.i.a;
            default:
                ((kotlin.jvm.internal.p) this.b).a = obj;
                throw new ld.a(this);
        }
    }
}
