package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.h("<" + aVar.i());
            kVar.a(a2.Q);
            return;
        }
        if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.O);
        } else {
            kVar.f('<');
            kVar.c = a2.K;
        }
    }
}
