package j$.time.format;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
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
    public final boolean j(r rVar, StringBuilder sb) {
        Long a = rVar.a(this.a);
        if (a == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) rVar.a.r(j$.time.temporal.p.b);
        String b = (aVar == null || aVar == j$.time.chrono.q.c) ? this.c.b(this.a, a.longValue(), this.b, rVar.b.b) : this.c.a(aVar, this.a, a.longValue(), this.b, rVar.b.b);
        if (b != null) {
            sb.append(b);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, x.NORMAL);
        }
        return this.d.j(rVar, sb);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        j$.time.temporal.a aVar = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + textStyle2 + ")";
    }
}
