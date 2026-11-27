// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bo0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ bo0(lo0 lo0Var, byte b) {
        this.a = b;
        this.b = lo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        lo0 lo0Var = this.b;
        switch (b) {
            case 0:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                lo0Var.F0(countDownLatch, null);
                lo0Var.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                jn7.f(lo0Var.T).d(new bo0(lo0Var, (byte) 4));
                break;
            case 2:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                break;
            case 3:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                break;
            default:
                hl.c3(new bo0(lo0Var, b2));
                break;
        }
    }
}
