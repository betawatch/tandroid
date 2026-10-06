package dd;

import java.util.Locale;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public enum n extends b2 {
    public n() {
        super("RcdataLessthanSign", 10);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.v);
            return;
        }
        if (aVar.o() && lVar.o != null) {
            String str = "</" + lVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = lVar.d(false);
                String str2 = lVar.o;
                d.c = str2;
                d.d = str2 != null ? str2.toLowerCase(locale) : "";
                lVar.i = d;
                lVar.k();
                aVar.q();
                lVar.c = b2.a;
                return;
            }
        }
        lVar.h("<");
        lVar.c = b2.c;
    }
}
