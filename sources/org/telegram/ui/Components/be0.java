package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ be0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.a(false);
                break;
            default:
                de0 de0Var = this.b;
                Runnable runnable = de0Var.H;
                de0Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = de0Var.I;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
