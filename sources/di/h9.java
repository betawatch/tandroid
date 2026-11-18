package di;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ h9(org.telegram.ui.ActionBar.x2[] x2VarArr, long j3, int i7) {
        this.a = i7;
        this.b = x2VarArr;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(bn.ua(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new ki.k(this.c));
                    break;
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.D4(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.h2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(bn.ua(this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.b[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                }
                org.telegram.ui.ActionBar.h2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(bn.ua(this.c));
                    break;
                }
                break;
        }
    }
}
