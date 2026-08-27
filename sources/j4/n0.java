package j4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ n0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k();
                break;
            case 1:
                r0 r0Var = this.b;
                if (!r0Var.W) {
                    y yVar = r0Var.B;
                    yVar.getClass();
                    yVar.a(r0Var);
                    break;
                }
                break;
            default:
                this.b.Q = true;
                break;
        }
    }
}
