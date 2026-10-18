package fd;

import java.util.Locale;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public enum m extends a2 {
    public m() {
        super("RcdataLessthanSign", 10);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.v);
            return;
        }
        if (aVar.o() && kVar.o != null) {
            String str = "</" + kVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = kVar.d(false);
                String str2 = kVar.o;
                d.c = str2;
                d.d = str2 != null ? str2.toLowerCase(locale) : "";
                kVar.i = d;
                kVar.k();
                aVar.q();
                kVar.c = a2.a;
                return;
            }
        }
        kVar.h("<");
        kVar.c = a2.c;
    }
}
