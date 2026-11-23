package o5;

import android.os.Process;
import c8.hc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ p(int i7, Runnable runnable) {
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
                    hc.b("Executor", "Background execution failure.", e10);
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
