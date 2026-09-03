package d9;

import android.os.Process;
import j7.j0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ j(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.b.run();
                break;
            default:
                try {
                    this.b.run();
                    break;
                } catch (Exception e6) {
                    j0.b("Executor", "Background execution failure.", e6);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
