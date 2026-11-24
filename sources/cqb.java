// default package

import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public enum cqb extends qsb {
    public cqb() {
        super("RcdataLessthanSign", 10);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.w);
            return;
        }
        if (zj1Var.o() && aqbVar.o != null) {
            String str = "</" + aqbVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (zj1Var.p(lowerCase) <= -1 && zj1Var.p(upperCase) <= -1) {
                vpb d = aqbVar.d(false);
                String str2 = aqbVar.o;
                d.e = str2;
                d.f = str2 != null ? str2.toLowerCase(locale) : "";
                aqbVar.i = d;
                aqbVar.k();
                zj1Var.q();
                aqbVar.c = qsb.a;
                return;
            }
        }
        aqbVar.h("<");
        aqbVar.c = qsb.c;
    }
}
