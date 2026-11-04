package g2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(d dVar, Object obj, int i3) {
        this.a = i3;
        this.b = dVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                if (dVar.a == 0) {
                    dVar.G(this.c);
                    break;
                }
                break;
            default:
                d dVar2 = this.b;
                int i3 = dVar2.a - 1;
                dVar2.a = i3;
                if (i3 == 0) {
                    dVar2.G(this.c);
                    break;
                }
                break;
        }
    }
}
