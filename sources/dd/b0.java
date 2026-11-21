package dd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        z zVar = b2.L;
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
                lVar.c = b2.O;
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
