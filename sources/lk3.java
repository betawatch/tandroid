// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lk3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mk3 b;

    public /* synthetic */ lk3(mk3 mk3Var, byte b) {
        this.a = b;
        this.b = mk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mk3 mk3Var = this.b;
        switch (b) {
            case 0:
                mk3Var.c = false;
                mk3Var.b.run();
                ArrayList arrayList = mk3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - mk3Var.f > 3600000) {
                    arrayList.clear();
                    mk3Var.e = false;
                    mk3Var.g = null;
                    mk3Var.a();
                    break;
                }
                break;
            default:
                mk3Var.i = false;
                break;
        }
    }
}
