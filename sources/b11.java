// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q11 b;

    public /* synthetic */ b11(q11 q11Var, byte b) {
        this.a = b;
        this.b = q11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        q11 q11Var = this.b;
        switch (b) {
            case 0:
                q11Var.onExitTransitionStart();
                break;
            case 1:
                q11Var.onEnterTransitionStart();
                break;
            default:
                try {
                    q11Var.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
