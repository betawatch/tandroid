// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt3 b;

    public /* synthetic */ jt3(lt3 lt3Var, byte b) {
        this.a = b;
        this.b = lt3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lt3 lt3Var = this.b;
        switch (b) {
            case 0:
                lt3Var.post(new jt3(lt3Var, (byte) 1));
                break;
            default:
                lt3Var.h();
                lt3Var.d();
                break;
        }
    }
}
