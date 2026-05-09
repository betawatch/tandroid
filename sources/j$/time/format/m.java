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
    public final boolean k(r rVar, StringBuilder sb) {
        String d;
        Long e = rVar.e(this.a);
        if (e == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) rVar.d().v(j$.time.temporal.l.e());
        if (lVar == null || lVar == j$.time.chrono.s.d) {
            d = this.c.d(this.a, e.longValue(), this.b, rVar.c());
        } else {
            d = this.c.c(lVar, this.a, e.longValue(), this.b, rVar.c());
        }
        if (d != null) {
            sb.append(d);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.k(rVar, sb);
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
