package j$.time.format;

/* loaded from: classes2.dex */
public final class m implements f {
    public final j$.time.temporal.a a;
    public final TextStyle b;
    public final u c;
    public volatile i d;

    public m(j$.time.temporal.a aVar, TextStyle textStyle, u uVar) {
        this.a = aVar;
        this.b = textStyle;
        this.c = uVar;
    }

    @Override // j$.time.format.f
    public final boolean l(r rVar, StringBuilder sb) {
        String b;
        Long a = rVar.a(this.a);
        if (a == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) rVar.a.r(j$.time.temporal.p.b);
        if (kVar == null || kVar == j$.time.chrono.r.c) {
            b = this.c.b(this.a, a.longValue(), this.b, rVar.b.b);
        } else {
            b = this.c.a(kVar, this.a, a.longValue(), this.b, rVar.b.b);
        }
        if (b != null) {
            sb.append(b);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.l(rVar, sb);
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
