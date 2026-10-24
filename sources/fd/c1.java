package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum c1 extends a2 {
    public c1() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        int[] c10 = kVar.c(null, false);
        if (c10 == null) {
            kVar.f('&');
        } else {
            kVar.h(new String(c10, 0, c10.length));
        }
        kVar.c = a2.c;
    }
}
