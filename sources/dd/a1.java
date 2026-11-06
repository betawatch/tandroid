package dd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public enum a1 extends b2 {
    public a1() {
        super("Comment", 46);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        e eVar = lVar.n;
        char i7 = aVar.i();
        if (i7 == 0) {
            lVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i7 == '-') {
            lVar.a(b2.k0);
        } else {
            if (i7 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            lVar.l(this);
            lVar.i();
            lVar.c = b2.a;
        }
    }
}
