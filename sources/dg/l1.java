package dg;

import android.os.Looper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ l1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b;
                androidx.activity.i iVar = m1Var.w;
                l1 l1Var = m1Var.s;
                if (l1Var != null) {
                    m1Var.cancelRunnable(l1Var);
                    m1Var.s = null;
                }
                m1Var.cancelRunnable(iVar);
                m1Var.postRunnable(iVar);
                break;
            case 1:
                m1 m1Var2 = this.b;
                m1Var2.s = null;
                m1Var2.w.run();
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
