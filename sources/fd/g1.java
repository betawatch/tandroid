package fd;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        if (aVar.o()) {
            fVar.c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.c.append((char) 65533);
            return;
        }
        if (d != ' ') {
            v vVar = a2.a;
            if (d == '>') {
                kVar.j();
                kVar.c = vVar;
                return;
            }
            if (d == 65535) {
                kVar.l(this);
                fVar.getClass();
                kVar.j();
                kVar.c = vVar;
                return;
            }
            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                fVar.c.append(d);
                return;
            }
        }
        kVar.c = a2.q0;
    }
}
