package e2;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
