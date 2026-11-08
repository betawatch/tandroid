package o5;

import android.os.Process;
import c8.cc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ o(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    break;
                } catch (Exception e10) {
                    cc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.b.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
