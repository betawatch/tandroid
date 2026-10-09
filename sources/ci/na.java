package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                this.b.o0();
                break;
            default:
                lc lcVar = this.b;
                lcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.g2);
                lcVar.g2 = null;
                lcVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
