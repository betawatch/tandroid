package h2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
