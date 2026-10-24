package e2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(c cVar, Object obj, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                if (cVar.a == 0) {
                    cVar.n(this.c);
                    break;
                }
                break;
            default:
                c cVar2 = this.b;
                int i10 = cVar2.a - 1;
                cVar2.a = i10;
                if (i10 == 0) {
                    cVar2.n(this.c);
                    break;
                }
                break;
        }
    }
}
