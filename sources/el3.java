// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class el3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fl3 b;

    public /* synthetic */ el3(fl3 fl3Var, byte b) {
        this.a = b;
        this.b = fl3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fl3 fl3Var = this.b;
        switch (b) {
            case 0:
                fl3Var.c = false;
                fl3Var.b.run();
                ArrayList arrayList = fl3Var.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fl3Var.f > 3600000) {
                    arrayList.clear();
                    fl3Var.e = false;
                    fl3Var.g = null;
                    fl3Var.a();
                    break;
                }
                break;
            default:
                fl3Var.i = false;
                break;
        }
    }
}
