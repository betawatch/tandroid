package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum s1 extends a2 {
    public s1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.e.append((char) 65533);
            return;
        }
        if (d == '\'') {
            kVar.c = a2.B0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (d != 65535) {
            fVar.e.append(d);
            return;
        }
        kVar.l(this);
        fVar.getClass();
        kVar.j();
        kVar.c = vVar;
    }
}
