package bi;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ j4(long j10, int i10) {
        this.a = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.ea(this.b));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.ea(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(wn.ea(this.b));
                    break;
                }
                break;
        }
    }
}
