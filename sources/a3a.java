// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j3a b;

    public /* synthetic */ a3a(j3a j3aVar, byte b) {
        this.a = b;
        this.b = j3aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j3a j3aVar = this.b;
        switch (b) {
            case 0:
                j3aVar.a1(false);
                break;
            case 1:
                j3aVar.a1(true);
                break;
            case 2:
                wsa wsaVar = new wsa(j3aVar.getContext(), j3aVar.T1, j3aVar.U1, j3aVar.J0, null);
                long j = j3aVar.X1.id;
                String str = j3aVar.a2;
                wsaVar.l3 = true;
                jva.v(wsaVar.a, false).H(j, new ts9(wsaVar, str, (byte) 9));
                break;
            case 3:
                e00.b1(j3aVar.J0, j3aVar.getContext(), j3aVar.X1);
                break;
            case 4:
                new exa(j3aVar.getContext(), j3aVar.J0).show();
                break;
            default:
                j3aVar.dismiss();
                break;
        }
    }
}
