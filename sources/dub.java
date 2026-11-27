// default package

import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum dub extends rwb {
    public dub() {
        super("RcdataLessthanSign", 10);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.m('/')) {
            bubVar.e();
            bubVar.a(rwb.w);
            return;
        }
        if (ik1Var.o() && bubVar.o != null) {
            String str = "</" + bubVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (ik1Var.p(lowerCase) <= -1 && ik1Var.p(upperCase) <= -1) {
                wtb d = bubVar.d(false);
                String str2 = bubVar.o;
                d.e = str2;
                d.f = str2 != null ? str2.toLowerCase(locale) : "";
                bubVar.i = d;
                bubVar.k();
                ik1Var.q();
                bubVar.c = rwb.a;
                return;
            }
        }
        bubVar.h("<");
        bubVar.c = rwb.c;
    }
}
