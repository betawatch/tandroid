package ai;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class y {
    public final ParcelFileDescriptor a;
    public final ParcelFileDescriptor b;
    public final Thread c;
    public volatile int d;
    public volatile boolean e;
    public final int f;
    public final int g;
    public final int h;
    public long i;
    public final /* synthetic */ z j;

    public y(z zVar, int i7, int i10, int i11) {
        this.j = zVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.a = createPipe[0];
        this.b = createPipe[1];
        this.d = i7;
        this.f = i7;
        this.g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 6), "DictationFeed");
        this.c = thread;
        thread.start();
    }

    public final void a() {
        this.e = true;
        synchronized (this.j.a) {
            this.j.a.notifyAll();
        }
        this.c.interrupt();
        try {
            this.a.close();
        } catch (Exception unused) {
        }
    }
}
