// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ag9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg9 b;

    public /* synthetic */ ag9(dg9 dg9Var, byte b) {
        this.a = b;
        this.b = dg9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                if (dg9Var.A2 >= 0) {
                    long uptimeMillis = (dg9Var.z2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && dg9Var.isFocused()) {
                        dg9Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i = dg9Var.A2;
                        dg9Var.A2 = -1;
                        dg9Var.setInputType(i);
                        break;
                    }
                }
                break;
            default:
                if (!aob.f1()) {
                    dg9Var.J();
                    break;
                } else {
                    dg9Var.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
