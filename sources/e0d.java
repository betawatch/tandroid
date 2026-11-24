// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0d implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b;
        byte b2 = this.a;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                g0d g0dVar = (g0d) obj2;
                if (((nx5) obj) == nx5.d && ((b = g0dVar.s) == 2 || b == 3)) {
                    g0dVar.s = (byte) 1;
                }
                g0dVar.h.run();
                break;
            default:
                ((hg3) obj2).l0(true);
                break;
        }
    }
}
