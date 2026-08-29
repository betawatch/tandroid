package ag;

import android.os.Looper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ p1(r1 r1Var, int i10) {
        this.a = i10;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = this.b;
                q1 q1Var = r1Var.w;
                p1 p1Var = r1Var.s;
                if (p1Var != null) {
                    r1Var.cancelRunnable(p1Var);
                    r1Var.s = null;
                }
                r1Var.cancelRunnable(q1Var);
                r1Var.postRunnable(q1Var);
                break;
            case 1:
                r1 r1Var2 = this.b;
                r1Var2.s = null;
                r1Var2.w.run();
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
