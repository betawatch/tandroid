package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d2(k7 k7Var, long j10, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m2(this.c);
                break;
            case 1:
                this.b.m2(this.c);
                break;
            case 2:
                k7 k7Var = this.b;
                b2 b2Var = k7Var.u1;
                k7Var.M2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b2Var);
                    AndroidUtilities.runOnUIThread(b2Var);
                    break;
                }
                break;
            case 3:
                this.b.m2(this.c);
                break;
            case 4:
                this.b.m2(this.c);
                break;
            case 5:
                k7.t0(this.b, this.c);
                break;
            case 6:
                k7.p0(this.b, this.c);
                break;
            case 7:
                this.b.m2(this.c);
                break;
            case 8:
                k7.V(this.b, this.c);
                break;
            case 9:
                this.b.m2(this.c);
                break;
            case 10:
                k7.n1(this.b, this.c);
                break;
            case 11:
                this.b.m2(this.c);
                break;
            default:
                k7.H0(this.b, this.c);
                break;
        }
    }
}
