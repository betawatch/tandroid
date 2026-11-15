package ai;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x {
    public final ParcelFileDescriptor a;
    public final ParcelFileDescriptor b;
    public final Thread c;
    public volatile int d;
    public volatile boolean e;
    public final int f;
    public final int g;
    public final int h;
    public long i;
    public final /* synthetic */ y j;

    public x(y yVar, int i7, int i10, int i11) {
        this.j = yVar;
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.a = createPipe[0];
        this.b = createPipe[1];
        this.d = i7;
        this.f = i7;
        this.g = i10;
        this.h = i11;
        Thread thread = new Thread(new a3.f(this, 5), "DictationFeed");
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
