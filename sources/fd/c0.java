package fd;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.o()) {
            kVar.h("</");
            kVar.c = a2.K;
            return;
        }
        kVar.d(false);
        j jVar = kVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.P);
    }
}
