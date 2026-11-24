// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k94 b;

    public /* synthetic */ e94(k94 k94Var, byte b) {
        this.a = b;
        this.b = k94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k94 k94Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = k94Var.l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = k94Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
