package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
