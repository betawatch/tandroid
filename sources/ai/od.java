package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;

    public /* synthetic */ od(me meVar, int i10) {
        this.a = i10;
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                me meVar = this.b;
                meVar.T = true;
                meVar.p(null);
                AndroidUtilities.runOnUIThread(new od(meVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                vd vdVar = this.b.r;
                vdVar.F = false;
                vdVar.invalidate();
                break;
        }
    }
}
