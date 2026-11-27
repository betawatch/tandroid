// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class mo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ no6 b;

    public /* synthetic */ mo6(no6 no6Var, byte b) {
        this.a = b;
        this.b = no6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        no6 no6Var = this.b;
        switch (b) {
            case 0:
                no6Var.d();
                hl.c3(new mo6(no6Var, (byte) 1));
                break;
            default:
                no6Var.X = false;
                ArrayList arrayList = no6Var.Y;
                no6Var.Y = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Runnable) arrayList.get(i)).run();
                    }
                    break;
                }
                break;
        }
    }
}
