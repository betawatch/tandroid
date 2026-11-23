package ie;

import gd.k;
import rd.q;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(d dVar, c cVar) {
        this.a = 0;
        this.b = dVar;
    }

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
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
                ((c1.c) this.b).invoke((Throwable) obj);
                break;
        }
        return k.a;
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
