package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ qa(pc pcVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = pcVar;
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
                pc pcVar = this.b;
                pcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(pcVar.g2);
                pcVar.g2 = null;
                pcVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
