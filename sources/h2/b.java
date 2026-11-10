package h2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
