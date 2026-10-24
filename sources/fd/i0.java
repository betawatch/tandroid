package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum i0 extends a2 {
    public i0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        f0 f0Var = a2.R;
        if (d == 0) {
            kVar.m(this);
            kVar.f((char) 65533);
            kVar.c = f0Var;
            return;
        }
        if (d == '-') {
            kVar.f(d);
            return;
        }
        if (d == '<') {
            kVar.f(d);
            kVar.c = a2.U;
        } else if (d == '>') {
            kVar.f(d);
            kVar.c = a2.f;
        } else if (d != 65535) {
            kVar.f(d);
            kVar.c = f0Var;
        } else {
            kVar.l(this);
            kVar.c = a2.a;
        }
    }
}
