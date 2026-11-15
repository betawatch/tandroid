package di;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ e9(org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, int i7) {
        this.a = i7;
        this.b = u2VarArr;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(an.ua(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ki.k(this.c));
                    break;
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.C4(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.C4(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.C4(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(an.ua(this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.b[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                org.telegram.ui.ActionBar.e2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(an.ua(this.c));
                    break;
                }
                break;
        }
    }
}
