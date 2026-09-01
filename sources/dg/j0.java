package dg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ d1 c;

    public /* synthetic */ j0(m0 m0Var, d1 d1Var, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = d1Var;
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
