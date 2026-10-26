package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;

    public /* synthetic */ ed(be beVar, int i10) {
        this.a = i10;
        this.b = beVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                be beVar = this.b;
                beVar.T = true;
                beVar.o(null);
                AndroidUtilities.runOnUIThread(new ed(beVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                ld ldVar = this.b.r;
                ldVar.F = false;
                ldVar.invalidate();
                break;
        }
    }
}
