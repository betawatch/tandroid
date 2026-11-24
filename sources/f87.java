// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class f87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f87(vs2 vs2Var, int i, byte b) {
        this.a = b;
        this.b = vs2Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        vs2 vs2Var = this.b;
        switch (b) {
            case 0:
                vs2Var.accept(Integer.valueOf(i));
                break;
            default:
                vs2Var.accept(Integer.valueOf(i));
                break;
        }
    }
}
