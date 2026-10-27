package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public enum z extends a2 {
    public z() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // gd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char d = aVar.d();
        y yVar = a2.K;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = yVar;
        } else if (d == '-') {
            kVar.f(d);
            kVar.c = a2.M;
        } else if (d == '<') {
            kVar.c = a2.N;
        } else {
            kVar.f(d);
            kVar.c = yVar;
        }
    }
}
