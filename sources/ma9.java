// default package

import android.os.Looper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ma9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na9 b;

    public /* synthetic */ ma9(na9 na9Var, byte b) {
        this.a = b;
        this.b = na9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        na9 na9Var = this.b;
        switch (b) {
            case 0:
                li7 li7Var = na9Var.x;
                ma9 ma9Var = na9Var.s;
                if (ma9Var != null) {
                    na9Var.cancelRunnable(ma9Var);
                    na9Var.s = null;
                }
                na9Var.cancelRunnable(li7Var);
                na9Var.postRunnable(li7Var);
                break;
            case 1:
                na9Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            default:
                na9Var.s = null;
                na9Var.x.run();
                break;
        }
    }
}
