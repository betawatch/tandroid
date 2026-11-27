// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nw5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mw5(nw5 nw5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new mw5(nw5Var, z2, z, (byte) 1));
                break;
            default:
                nw5Var.setJoinRequest(z2);
                nw5Var.setJoinToSend(z);
                break;
        }
    }
}
