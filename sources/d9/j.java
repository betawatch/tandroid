package d9;

import android.os.Process;
import j7.i0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                } catch (Exception e) {
                    i0.b("Executor", "Background execution failure.", e);
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
