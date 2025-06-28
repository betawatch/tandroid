package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
final class m implements f {
    private final j$.time.temporal.l a;
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
        j$.time.chrono.e eVar = (j$.time.chrono.e) rVar.d().i(j$.time.temporal.j.d());
        if (eVar == null || eVar == (fVar = j$.time.chrono.f.a)) {
            c = this.c.c(this.a, e.longValue(), this.b, rVar.c());
        } else {
            u uVar = this.c;
            j$.time.temporal.l lVar = this.a;
            long longValue = e.longValue();
            TextStyle textStyle = this.b;
            Locale c2 = rVar.c();
            uVar.getClass();
            c = (eVar == fVar || !(lVar instanceof j$.time.temporal.a)) ? uVar.c(lVar, longValue, textStyle, c2) : null;
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
        StringBuilder sb;
        TextStyle textStyle = TextStyle.FULL;
        j$.time.temporal.l lVar = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            sb = new StringBuilder("Text(");
            sb.append(lVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(lVar);
            sb.append(",");
            sb.append(textStyle2);
        }
        sb.append(")");
        return sb.toString();
    }
}
