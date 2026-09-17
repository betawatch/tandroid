package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
