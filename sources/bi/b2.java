package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b2(h7 h7Var, long j10, int i10) {
        this.a = i10;
        this.b = h7Var;
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
                h7 h7Var = this.b;
                a2 a2Var = h7Var.u1;
                h7Var.U2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(a2Var);
                    AndroidUtilities.runOnUIThread(a2Var);
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
                h7.p0(this.b, this.c);
                break;
            case 6:
                h7.U0(this.b, this.c);
                break;
            case 7:
                this.b.u2(this.c);
                break;
            case 8:
                h7.T(this.b, this.c);
                break;
            case 9:
                this.b.u2(this.c);
                break;
            case 10:
                h7.p1(this.b, this.c);
                break;
            case 11:
                this.b.u2(this.c);
                break;
            default:
                h7.I0(this.b, this.c);
                break;
        }
    }
}
