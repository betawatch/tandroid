package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
