// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nw5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lw5(nw5 nw5Var, boolean z, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new lw5(nw5Var, z, (byte) 1));
                break;
            default:
                nw5Var.setJoinRequest(z);
                break;
        }
    }
}
