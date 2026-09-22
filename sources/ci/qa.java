package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
