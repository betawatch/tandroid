package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ zb(ce ceVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = ceVar;
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
                ce ceVar = this.b;
                ceVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ceVar.g2);
                ceVar.g2 = null;
                ceVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
