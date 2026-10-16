package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                this.b.o0();
                break;
            default:
                kc kcVar = this.b;
                kcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.g2);
                kcVar.g2 = null;
                kcVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
