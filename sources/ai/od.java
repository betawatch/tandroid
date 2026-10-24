package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
