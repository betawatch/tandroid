// default package

import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d1 implements eo4 {
    public final Thread c;
    public final jd d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final c1 b = new c1(this, Looper.getMainLooper(), (byte) 0);

    public d1(jd jdVar) {
        this.d = jdVar;
        byte b = 0;
        us usVar = us.f;
        this.e = usVar.a > 0;
        usVar.d.add(this);
        Thread thread = new Thread(new b1(this, b), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // eo4
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // eo4
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
