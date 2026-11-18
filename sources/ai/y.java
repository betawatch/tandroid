package ai;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
