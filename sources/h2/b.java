package h2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(c cVar, Object obj, int i7) {
        this.a = i7;
        this.b = cVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                if (cVar.a == 0) {
                    cVar.G(this.c);
                    break;
                }
                break;
            default:
                c cVar2 = this.b;
                int i7 = cVar2.a - 1;
                cVar2.a = i7;
                if (i7 == 0) {
                    cVar2.G(this.c);
                    break;
                }
                break;
        }
    }
}
