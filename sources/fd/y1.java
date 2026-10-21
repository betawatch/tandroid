package fd;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public enum y1 extends a2 {
    public y1() {
        super("TagOpen", 7);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == '!') {
            kVar.a(a2.g0);
            return;
        }
        if (i10 == '/') {
            kVar.a(a2.n);
            return;
        }
        if (i10 == '?') {
            kVar.a(a2.f0);
            return;
        }
        if (aVar.o()) {
            kVar.d(true);
            kVar.c = a2.r;
        } else {
            kVar.m(this);
            kVar.f('<');
            kVar.c = a2.a;
        }
    }
}
