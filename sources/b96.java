// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k96 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ex5 d;

    public /* synthetic */ b96(k96 k96Var, String str, ex5 ex5Var, byte b) {
        this.a = b;
        this.b = k96Var;
        this.c = str;
        this.d = ex5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        ex5 ex5Var = this.d;
        String str = this.c;
        k96 k96Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new b96(k96Var, str, ex5Var, b2));
                break;
            default:
                na7.c1().edit().putBoolean("langpack_patched" + str, true).apply();
                ex5Var.run();
                k96Var.Q = false;
                break;
        }
    }
}
