package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ na(lc lcVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = lcVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.p0();
                break;
            default:
                lc lcVar = this.b;
                lcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.g2);
                lcVar.g2 = null;
                lcVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
