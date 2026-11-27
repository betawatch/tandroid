// default package

import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class e1 implements io4 {
    public final Thread c;
    public final kc d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final d1 b = new d1(this, Looper.getMainLooper(), (byte) 0);

    public e1(kc kcVar) {
        this.d = kcVar;
        byte b = 0;
        vr vrVar = vr.f;
        this.e = vrVar.a > 0;
        vrVar.d.add(this);
        Thread thread = new Thread(new c1(this, b), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // io4
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // io4
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.e = true;
            this.i = false;
            this.a.notifyAll();
        }
        this.c.interrupt();
    }
}
