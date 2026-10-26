package gd;

import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum m extends a2 {
    public m() {
        super("RcdataLessthanSign", 10);
    }

    @Override // gd.a2
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
