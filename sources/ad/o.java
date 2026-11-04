package ad;

import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum o extends c2 {
    public o() {
        super("RcdataLessthanSign", 10);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.m('/')) {
            mVar.e();
            mVar.a(c2.w);
            return;
        }
        if (aVar.o() && mVar.o != null) {
            String str = "</" + mVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                k d = mVar.d(false);
                String str2 = mVar.o;
                d.c = str2;
                d.d = str2 != null ? str2.toLowerCase(locale) : "";
                mVar.i = d;
                mVar.k();
                aVar.q();
                mVar.c = c2.a;
                return;
            }
        }
        mVar.h("<");
        mVar.c = c2.c;
    }
}
