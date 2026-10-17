package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ z9(vb vbVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = vbVar;
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
                vb vbVar = this.b;
                vbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(vbVar.g2);
                vbVar.g2 = null;
                vbVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
