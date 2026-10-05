package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ma implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ma(kc kcVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = kcVar;
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
                kc kcVar = this.b;
                kcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.g2);
                kcVar.g2 = null;
                kcVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
