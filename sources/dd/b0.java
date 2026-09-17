package dd;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public enum b0 extends b2 {
    public b0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.c = b2.a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.K;
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
                lVar.c = b2.N;
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
