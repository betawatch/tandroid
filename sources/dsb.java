// default package

import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum dsb extends rub {
    public dsb() {
        super("RcdataLessthanSign", 10);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (hl1Var.m('/')) {
            bsbVar.e();
            bsbVar.a(rub.w);
            return;
        }
        if (hl1Var.o() && bsbVar.o != null) {
            String str = "</" + bsbVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (hl1Var.p(lowerCase) <= -1 && hl1Var.p(upperCase) <= -1) {
                wrb d = bsbVar.d(false);
                String str2 = bsbVar.o;
                d.e = str2;
                d.f = str2 != null ? str2.toLowerCase(locale) : "";
                bsbVar.i = d;
                bsbVar.k();
                hl1Var.q();
                bsbVar.c = rub.a;
                return;
            }
        }
        bsbVar.h("<");
        bsbVar.c = rub.c;
    }
}
