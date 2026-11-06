package dd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public enum a0 extends b2 {
    public a0() {
        super("ScriptDataEscapedDash", 22);
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
        } else if (d == '-') {
            lVar.f(d);
            lVar.c = b2.M;
        } else if (d == '<') {
            lVar.c = b2.N;
        } else {
            lVar.f(d);
            lVar.c = zVar;
        }
    }
}
