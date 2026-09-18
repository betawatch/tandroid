package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ qa(oc ocVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = ocVar;
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
                oc ocVar = this.b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.g2);
                ocVar.g2 = null;
                ocVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
