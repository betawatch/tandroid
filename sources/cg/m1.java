package cg;

import android.os.Looper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ m1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                androidx.activity.i iVar = n1Var.w;
                m1 m1Var = n1Var.s;
                if (m1Var != null) {
                    n1Var.cancelRunnable(m1Var);
                    n1Var.s = null;
                }
                n1Var.cancelRunnable(iVar);
                n1Var.postRunnable(iVar);
                break;
            case 1:
                n1 n1Var2 = this.b;
                n1Var2.s = null;
                n1Var2.w.run();
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
