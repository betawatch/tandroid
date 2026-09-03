package h5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c {
    public boolean a;

    public synchronized void a() {
        boolean z4 = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
