package jh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ u1(h5 h5Var, long j10, int i10) {
        this.a = i10;
        this.b = h5Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h5 h5Var = this.b;
                t1 t1Var = h5Var.j1;
                h5Var.q2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var);
                    AndroidUtilities.runOnUIThread(t1Var);
                    break;
                }
                break;
            case 1:
                this.b.X1(this.c);
                break;
            case 2:
                h5.P0(this.b, this.c);
                break;
            case 3:
                h5.d1(this.b, this.c);
                break;
            case 4:
                this.b.X1(this.c);
                break;
            case 5:
                h5.l0(this.b, this.c);
                break;
            case 6:
                this.b.X1(this.c);
                break;
            case 7:
                h5.P(this.b, this.c);
                break;
            case 8:
                this.b.X1(this.c);
                break;
            case 9:
                h5.A0(this.b, this.c);
                break;
            case 10:
                this.b.X1(this.c);
                break;
            default:
                this.b.X1(this.c);
                break;
        }
    }
}
