package hg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ h(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n.X(this.b);
                break;
            case 1:
                n.Y(this.b);
                break;
            default:
                h hVar = this.b.e;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                break;
        }
    }
}
