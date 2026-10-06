package gb;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public class g0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 8 ? Boolean.toString(aVar.n()) : aVar.v();
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
