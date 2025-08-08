package j$.time.format;

/* loaded from: classes2.dex */
final class m implements f {
    private final j$.time.temporal.a a;
    private final TextStyle b;
    private final u c;
    private volatile i d;

    m(j$.time.temporal.a aVar, TextStyle textStyle, u uVar) {
        this.a = aVar;
        this.b = textStyle;
        this.c = uVar;
    }

    @Override // j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        String c;
        j$.time.chrono.f fVar;
        Long e = rVar.e(this.a);
        if (e == null) {
            return false;
        }
        j$.time.chrono.e eVar = (j$.time.chrono.e) rVar.d().g(j$.time.temporal.j.d());
        if (eVar == null || eVar == (fVar = j$.time.chrono.f.a)) {
            c = this.c.c(this.a, e.longValue(), this.b, rVar.c());
        } else {
            u uVar = this.c;
            j$.time.temporal.a aVar = this.a;
            c = (eVar == fVar || !(aVar instanceof j$.time.temporal.a)) ? uVar.c(aVar, e.longValue(), this.b, rVar.c()) : null;
        }
        if (c != null) {
            sb.append(c);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.f(rVar, sb);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        j$.time.temporal.a aVar = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + textStyle2 + ")";
    }
}
