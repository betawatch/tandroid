package dd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public enum v1 extends b2 {
    public v1() {
        super("BogusDoctype", 65);
    }

    @Override // dd.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.a;
        if (d == '>') {
            lVar.j();
            lVar.c = wVar;
        } else {
            if (d != 65535) {
                return;
            }
            lVar.j();
            lVar.c = wVar;
        }
    }
}
