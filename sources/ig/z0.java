package ig;

import android.os.Looper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                androidx.activity.i iVar = a1Var.x;
                z0 z0Var = a1Var.s;
                if (z0Var != null) {
                    a1Var.cancelRunnable(z0Var);
                    a1Var.s = null;
                }
                a1Var.cancelRunnable(iVar);
                a1Var.postRunnable(iVar);
                break;
            case 1:
                a1 a1Var2 = this.b;
                a1Var2.s = null;
                a1Var2.x.run();
                break;
            default:
                this.b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
        }
    }
}
