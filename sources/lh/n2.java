package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ n6 c;

    public /* synthetic */ n2(r2 r2Var, n6 n6Var, int i10) {
        this.a = i10;
        this.b = r2Var;
        this.c = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                AndroidUtilities.runOnUIThread(new n2(r2Var, this.c, 1), 320L);
                break;
            default:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                this.c.run(new ag.n0(r2Var2, 27));
                break;
        }
    }
}
