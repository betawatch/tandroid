// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class al4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cl4 b;

    public /* synthetic */ al4(cl4 cl4Var, byte b) {
        this.a = b;
        this.b = cl4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cl4 cl4Var = this.b;
        switch (b) {
            case 0:
                View view = cl4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    bl4 bl4Var = cl4Var.s;
                    bl4Var.getClass();
                    System.currentTimeMillis();
                    bl4Var.c = false;
                    cl4Var.s.a();
                    break;
                }
                break;
            default:
                View view2 = cl4Var.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    bl4 bl4Var2 = cl4Var.s;
                    bl4Var2.b = false;
                    bl4Var2.a();
                    break;
                }
                break;
        }
    }
}
