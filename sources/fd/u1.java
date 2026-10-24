package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum u1 extends a2 {
    public u1() {
        super("BogusDoctype", 65);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.a;
        if (d == '>') {
            kVar.j();
            kVar.c = vVar;
        } else {
            if (d != 65535) {
                return;
            }
            kVar.j();
            kVar.c = vVar;
        }
    }
}
