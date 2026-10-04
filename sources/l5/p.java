package l5;

import android.os.Process;
import w7.h6;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ p(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    break;
                } catch (Exception e7) {
                    h6.b("Executor", "Background execution failure.", e7);
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
