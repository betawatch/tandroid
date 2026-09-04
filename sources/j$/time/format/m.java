package j$.time.format;

/* loaded from: classes2.dex */
public final class m implements f {
    public final j$.time.temporal.o a;
    public final TextStyle b;
    public final u c;
    public volatile i d;

    public m(j$.time.temporal.o oVar, TextStyle textStyle, u uVar) {
        this.a = oVar;
        this.b = textStyle;
        this.c = uVar;
    }

    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        String b10;
        Long a2 = rVar.a(this.a);
        if (a2 == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) rVar.a.m(j$.time.temporal.p.b);
        if (kVar == null || kVar == j$.time.chrono.r.c) {
            b10 = this.c.b(this.a, a2.longValue(), this.b, rVar.b.b);
        } else {
            b10 = this.c.a(kVar, this.a, a2.longValue(), this.b, rVar.b.b);
        }
        if (b10 != null) {
            sb2.append(b10);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.j(rVar, sb2);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        j$.time.temporal.o oVar = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + oVar + ")";
        }
        return "Text(" + oVar + "," + textStyle2 + ")";
    }
}
