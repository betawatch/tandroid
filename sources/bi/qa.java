package bi;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ qa(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, int i7) {
        this.a = i7;
        this.b = w2VarArr;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(cn.ta(this.c));
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
                    T3.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(cn.ta(this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.b[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                }
                org.telegram.ui.ActionBar.f2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(cn.ta(this.c));
                    break;
                }
                break;
        }
    }
}
