package og;

import android.os.Looper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ e1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                androidx.activity.i iVar = f1Var.w;
                e1 e1Var = f1Var.s;
                if (e1Var != null) {
                    f1Var.cancelRunnable(e1Var);
                    f1Var.s = null;
                }
                f1Var.cancelRunnable(iVar);
                f1Var.postRunnable(iVar);
                break;
            case 1:
                f1 f1Var2 = this.b;
                f1Var2.s = null;
                f1Var2.w.run();
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
