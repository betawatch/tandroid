package dd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
