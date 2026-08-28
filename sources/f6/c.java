package f6;

import android.os.Process;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ c(int i9, Runnable runnable) {
        this.a = i9;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(0);
                this.b.run();
                break;
            case 1:
                try {
                    this.b.run();
                    break;
                } catch (Exception e10) {
                    a.a.b("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
