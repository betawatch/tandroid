package hg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                n.Y(this.b);
                break;
            case 1:
                n.Z(this.b);
                break;
            default:
                h hVar = this.b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                break;
        }
    }
}
