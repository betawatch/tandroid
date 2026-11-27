// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m45 implements pcc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ tk7 d;
    public final /* synthetic */ vnb e;
    public final /* synthetic */ w45 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m45(c51 c51Var, c51 c51Var2, a55 a55Var, w45 w45Var, tk7 tk7Var, vnb vnbVar, re4 re4Var) {
        this.b = c51Var;
        this.c = c51Var2;
        this.g = a55Var;
        this.f = w45Var;
        this.d = tk7Var;
        this.e = vnbVar;
        this.h = re4Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                a55 a55Var = (a55) obj3;
                re4 re4Var = (re4) obj2;
                Boolean bool = (Boolean) obj;
                c51 c51Var = this.b;
                c51Var.setEnabled(false);
                c51 c51Var2 = this.c;
                c51Var2.setEnabled(false);
                (bool.booleanValue() ? c51Var2 : c51Var).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                tk7 tk7Var = this.d;
                vnb vnbVar = this.e;
                w45 w45Var = this.f;
                a55Var.e(w45Var, booleanValue, new o45(c51Var, c51Var2, tk7Var, vnbVar, re4Var, w45Var));
                break;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                c51 c51Var3 = this.b;
                c51Var3.setLoading(false);
                c51 c51Var4 = this.c;
                c51Var4.setLoading(false);
                tk7 tk7Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        d31.d0(str, tk7Var2.F, this.e);
                        w45 w45Var2 = this.f;
                        c51Var3.setEnabled(!w45Var2.n && zArr2[0]);
                        if (!w45Var2.n && !w45Var2.o) {
                            z = true;
                        }
                        c51Var4.setEnabled(z);
                        break;
                    } else {
                        d31.c0(str);
                        break;
                    }
                } else {
                    tk7Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m45(c51 c51Var, c51 c51Var2, tk7 tk7Var, boolean[] zArr, vnb vnbVar, w45 w45Var, boolean[] zArr2) {
        this.b = c51Var;
        this.c = c51Var2;
        this.d = tk7Var;
        this.g = zArr;
        this.e = vnbVar;
        this.f = w45Var;
        this.h = zArr2;
    }
}
