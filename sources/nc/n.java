package nc;

import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum n extends b2 {
    public n() {
        super("RcdataLessthanSign", 10);
    }

    @Override // nc.b2
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
        lVar.g("<");
        lVar.c = b2.c;
    }
}
