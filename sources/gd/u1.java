package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public enum u1 extends a2 {
    public u1() {
        super("BogusDoctype", 65);
    }

    @Override // gd.a2
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
