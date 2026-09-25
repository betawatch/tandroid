package hg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
