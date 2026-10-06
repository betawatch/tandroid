package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
