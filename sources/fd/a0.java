package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum a0 extends a2 {
    public a0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // fd.a2
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
        } else {
            if (d == '-') {
                kVar.f(d);
                return;
            }
            if (d == '<') {
                kVar.c = a2.N;
            } else if (d != '>') {
                kVar.f(d);
                kVar.c = yVar;
            } else {
                kVar.f(d);
                kVar.c = a2.f;
            }
        }
    }
}
