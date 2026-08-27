package a9;

import android.os.Process;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ n(int i10, Runnable runnable) {
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
                } catch (Exception e9) {
                    a.a.b("Executor", "Background execution failure.", e9);
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
