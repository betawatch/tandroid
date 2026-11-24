// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class n9e {
    public static fga a;

    public static final void a() {
        try {
            fga fgaVar = a;
            if (fgaVar == null) {
                fgaVar = (fga) ((b53) ((ih4) jg4.c().b(ih4.class))).o.get();
                fgaVar.getClass();
                a = fgaVar;
            }
            if (fgaVar == null) {
                rp5.e("sharedSessionRepository");
                throw null;
            }
            if (fgaVar.i) {
                if (fgaVar != null) {
                    fgaVar.a();
                } else {
                    rp5.e("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
