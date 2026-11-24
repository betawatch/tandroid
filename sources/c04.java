// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class c04 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c04(Object obj, float f, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        float f = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                t14 t14Var = ((d04) obj).G;
                try {
                    v26 v26Var = new v26(t14Var.Q.getContext(), 0, f);
                    v26Var.a = i;
                    t14Var.R.v0(v26Var);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                tx9 tx9Var = (tx9) obj;
                try {
                    v26 v26Var2 = new v26(tx9Var.i0.getContext(), 0, f);
                    v26Var2.a = i;
                    tx9Var.s0.v0(v26Var2);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
        }
    }
}
