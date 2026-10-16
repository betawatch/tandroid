package fd;

import java.util.Locale;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
