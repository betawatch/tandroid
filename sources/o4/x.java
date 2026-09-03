package o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4.e0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ j d;
    public final /* synthetic */ r e;

    public /* synthetic */ x(b4.e0 e0Var, z zVar, j jVar, r rVar, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = zVar;
        this.d = jVar;
        this.e = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o4.z] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o4.z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o4.z] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b4.e0 e0Var = this.b;
                this.c.a(e0Var.b, (v) e0Var.c, this.d, this.e);
                break;
            case 1:
                b4.e0 e0Var2 = this.b;
                this.c.d(e0Var2.b, (v) e0Var2.c, this.d, this.e);
                break;
            default:
                b4.e0 e0Var3 = this.b;
                this.c.h(e0Var3.b, (v) e0Var3.c, this.d, this.e);
                break;
        }
    }
}
