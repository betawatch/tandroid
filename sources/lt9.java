// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                    jf7 Y = jf7.Y(nt9Var.a);
                    Y.a.c(new jr9((Object) nt9Var, (Object) Y, (Object) arrayList, (byte) 1));
                    break;
                }
                break;
        }
    }
}
