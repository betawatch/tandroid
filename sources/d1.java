// default package

import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d1 implements dm4 {
    public final Thread c;
    public final jc d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final c1 b = new c1(this, Looper.getMainLooper(), (byte) 0);

    public d1(jc jcVar) {
        this.d = jcVar;
        byte b = 0;
        ur urVar = ur.f;
        this.e = urVar.a > 0;
        urVar.d.add(this);
        Thread thread = new Thread(new b1(this, b), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // dm4
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // dm4
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
