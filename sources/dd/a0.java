package dd;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
