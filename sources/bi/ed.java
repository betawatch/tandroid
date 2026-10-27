package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
