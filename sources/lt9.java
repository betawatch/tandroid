// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class lt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt9 b;

    public /* synthetic */ lt9(nt9 nt9Var, byte b) {
        this.a = b;
        this.b = nt9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nt9 nt9Var = this.b;
        switch (b) {
            case 0:
                nt9Var.o = false;
                nt9Var.l = false;
                break;
            case 1:
                nt9Var.o = false;
                break;
            case 2:
                nt9Var.k();
                break;
            case 3:
                nt9Var.g(false);
                break;
            default:
                if (!nt9Var.o) {
                    nt9Var.o = true;
                    ArrayList arrayList = new ArrayList(nt9Var.j);
                    kf7 a0 = kf7.a0(nt9Var.a);
                    a0.a.c(new jr9((Object) nt9Var, (Object) a0, (Object) arrayList, (byte) 1));
                    break;
                }
                break;
        }
    }
}
