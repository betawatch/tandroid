// default package

import android.os.Process;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j89 extends Thread {
    public final byte a;

    public j89(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = (byte) 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
