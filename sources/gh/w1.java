package gh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ w1(k5 k5Var, long j10, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                v1 v1Var = k5Var.j1;
                k5Var.q2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    AndroidUtilities.runOnUIThread(v1Var);
                    break;
                }
                break;
            case 1:
                this.b.X1(this.c);
                break;
            case 2:
                k5.P0(this.b, this.c);
                break;
            case 3:
                k5.d1(this.b, this.c);
                break;
            case 4:
                this.b.X1(this.c);
                break;
            case 5:
                k5.k0(this.b, this.c);
                break;
            case 6:
                this.b.X1(this.c);
                break;
            case 7:
                k5.O(this.b, this.c);
                break;
            case 8:
                this.b.X1(this.c);
                break;
            case 9:
                k5.z0(this.b, this.c);
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
