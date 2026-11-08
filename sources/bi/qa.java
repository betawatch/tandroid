package bi;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ qa(org.telegram.ui.ActionBar.v2[] v2VarArr, long j3, int i7) {
        this.a = i7;
        this.b = v2VarArr;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(an.ra(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new hi.j(this.c));
                    break;
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.A4(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.A4(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.A4(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(an.ra(this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.b[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                org.telegram.ui.ActionBar.f2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(an.ra(this.c));
                    break;
                }
                break;
        }
    }
}
