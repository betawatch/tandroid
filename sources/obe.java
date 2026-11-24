// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class obe {
    public static hia a;

    public static final void a() {
        try {
            hia hiaVar = a;
            if (hiaVar == null) {
                hiaVar = (hia) ((m63) ((kj4) li4.c().b(kj4.class))).o.get();
                hiaVar.getClass();
                a = hiaVar;
            }
            if (hiaVar == null) {
                rr5.e("sharedSessionRepository");
                throw null;
            }
            if (hiaVar.i) {
                if (hiaVar != null) {
                    hiaVar.a();
                } else {
                    rr5.e("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
