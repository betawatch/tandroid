package o0;

import android.os.Process;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class j extends Thread {
    public final int a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
