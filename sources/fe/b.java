package fe;

import dd.k;
import od.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(d dVar, c cVar) {
        this.a = 0;
        this.b = dVar;
    }

    @Override // od.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                d.g.set(dVar, null);
                dVar.f(null);
                break;
            case 1:
                ((h) this.b).b();
                break;
            default:
                ((c1.b) this.b).invoke((Throwable) obj);
                break;
        }
        return k.a;
    }

    public /* synthetic */ b(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
