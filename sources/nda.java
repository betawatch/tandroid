// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nda implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nha b;

    public /* synthetic */ nda(nha nhaVar, byte b) {
        this.a = b;
        this.b = nhaVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        nha nhaVar = this.b;
        a4b a4bVar = (a4b) obj;
        switch (b) {
            case 0:
                gm.d3(new e6a(nhaVar, a4bVar, (byte) 4), 100L);
                break;
            default:
                int[] iArr = nha.t2;
                gm.d3(new e6a(nhaVar, a4bVar, (byte) 4), 100L);
                break;
        }
    }
}
