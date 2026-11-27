// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oca b;

    public /* synthetic */ nca(oca ocaVar, byte b) {
        this.a = b;
        this.b = ocaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oca ocaVar = this.b;
        switch (b) {
            case 0:
                if (ocaVar.x) {
                    ocaVar.d();
                    break;
                }
                break;
            default:
                ocaVar.invalidateSelf();
                break;
        }
    }
}
