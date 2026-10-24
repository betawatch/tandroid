package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ e2(l7 l7Var, long j10, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u2(this.c);
                break;
            case 1:
                this.b.u2(this.c);
                break;
            case 2:
                l7 l7Var = this.b;
                d2 d2Var = l7Var.u1;
                l7Var.U2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    AndroidUtilities.runOnUIThread(d2Var);
                    break;
                }
                break;
            case 3:
                this.b.u2(this.c);
                break;
            case 4:
                this.b.u2(this.c);
                break;
            case 5:
                l7.p0(this.b, this.c);
                break;
            case 6:
                l7.U0(this.b, this.c);
                break;
            case 7:
                this.b.u2(this.c);
                break;
            case 8:
                l7.T(this.b, this.c);
                break;
            case 9:
                this.b.u2(this.c);
                break;
            case 10:
                l7.p1(this.b, this.c);
                break;
            case 11:
                this.b.u2(this.c);
                break;
            default:
                l7.I0(this.b, this.c);
                break;
        }
    }
}
