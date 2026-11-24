// default package

import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c99 b;

    public /* synthetic */ b99(c99 c99Var, byte b) {
        this.a = b;
        this.b = c99Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c99 c99Var = this.b;
        switch (b) {
            case 0:
                ei7 ei7Var = c99Var.x;
                b99 b99Var = c99Var.s;
                if (b99Var != null) {
                    c99Var.cancelRunnable(b99Var);
                    c99Var.s = null;
                }
                c99Var.cancelRunnable(ei7Var);
                c99Var.postRunnable(ei7Var);
                break;
            case 1:
                c99Var.s = null;
                c99Var.x.run();
                break;
            default:
                c99Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
        }
    }
}
