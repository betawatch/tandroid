package bi;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ ja(org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, int i10) {
        this.a = i10;
        this.b = k3VarArr;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.t4(this.c));
                    break;
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.ea(this.c));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.k3 k3Var = this.b[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(wn.ea(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(wn.ea(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(new hi.k(this.c));
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.t4(this.c));
                    break;
                }
                break;
        }
    }
}
