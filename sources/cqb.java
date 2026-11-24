// default package

import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
