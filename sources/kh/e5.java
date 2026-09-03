package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ e5(p5 p5Var, int i10) {
        this.a = i10;
        this.b = p5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            default:
                p5 p5Var = this.b;
                p5Var.f0.N(true);
                AndroidUtilities.runOnUIThread(new e5(p5Var, 0), 150L);
                break;
        }
    }
}
