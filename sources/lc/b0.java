package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum b0 extends b2 {
    public b0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // lc.b2
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.G;
        if (d == 0) {
            lVar.m(this);
            lVar.f((char) 65533);
            lVar.c = zVar;
        } else {
            if (d == '-') {
                lVar.f(d);
                return;
            }
            if (d == '<') {
                lVar.c = b2.J;
            } else if (d != '>') {
                lVar.f(d);
                lVar.c = zVar;
            } else {
                lVar.f(d);
                lVar.c = b2.f;
            }
        }
    }
}
