package cg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ e1 c;

    public /* synthetic */ j0(m0 m0Var, e1 e1Var, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(this.b, this.c, 1));
                break;
            default:
                m0 m0Var = this.b;
                m0Var.getClass();
                m0Var.i = this.c.a;
                break;
        }
    }
}
