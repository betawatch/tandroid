// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f91 b;

    public /* synthetic */ d91(f91 f91Var, byte b) {
        this.a = b;
        this.b = f91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f91 f91Var = this.b;
        switch (b) {
            case 0:
                f91Var.x = false;
                f91Var.c();
                break;
            default:
                f91Var.a.setVisibility(4);
                break;
        }
    }
}
