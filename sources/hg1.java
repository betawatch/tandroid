// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg1 b;

    public /* synthetic */ hg1(kg1 kg1Var, byte b) {
        this.a = b;
        this.b = kg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kg1 kg1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                kg1Var.a(countDownLatch, null);
                kg1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                gl.c3(new hg1(kg1Var, (byte) 3));
                break;
            case 1:
                kg1Var.H = false;
                kg1Var.d(true);
                break;
            case 2:
                kg1Var.H = false;
                kg1Var.d(true);
                break;
            default:
                kg1Var.H = false;
                kg1Var.d(true);
                break;
        }
    }
}
