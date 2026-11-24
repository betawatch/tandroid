// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class io6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo6 b;

    public /* synthetic */ io6(jo6 jo6Var, byte b) {
        this.a = b;
        this.b = jo6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jo6 jo6Var = this.b;
        switch (b) {
            case 0:
                jo6Var.d();
                gm.c3(new io6(jo6Var, (byte) 1));
                break;
            default:
                jo6Var.X = false;
                ArrayList arrayList = jo6Var.Y;
                jo6Var.Y = null;
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
