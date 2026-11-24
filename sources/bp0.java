// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bp0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ bp0(lp0 lp0Var, byte b) {
        this.a = b;
        this.b = lp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        lp0 lp0Var = this.b;
        switch (b) {
            case 0:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                lp0Var.F0(countDownLatch, null);
                lp0Var.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                nm7.f(lp0Var.T).d(new bp0(lp0Var, (byte) 4));
                break;
            case 2:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                break;
            case 3:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                break;
            default:
                gm.c3(new bp0(lp0Var, b2));
                break;
        }
    }
}
