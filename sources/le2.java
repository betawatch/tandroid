// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class le2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf2 b;

    public /* synthetic */ le2(kf2 kf2Var, byte b) {
        this.a = b;
        this.b = kf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kf2 kf2Var = this.b;
        switch (b) {
            case 0:
                kf2Var.t0();
                break;
            default:
                kf2Var.getMessagesController().X2(0, kf2Var.N, true);
                break;
        }
    }
}
