// default package

import android.os.Process;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class la9 extends Thread {
    public final byte a;

    public la9(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = (byte) 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
